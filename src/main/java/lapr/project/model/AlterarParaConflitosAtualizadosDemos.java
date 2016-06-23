/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.TimerTask;

/**
 *
 * @author marianachilro
 */
public class AlterarParaConflitosAtualizadosDemos extends TimerTask{

    private Exposicao exposicao;
    private CentroExposicoes centro;
    
    public AlterarParaConflitosAtualizadosDemos(CentroExposicoes centro, Exposicao expo){
        this.exposicao=expo;
        this.centro=centro;
    }
    @Override
    public void run() {
        this.exposicao.setEstado(new ExposicaoConflitosAtualizadosDemosEstado(this.exposicao));
        for(Demonstracao d : this.exposicao.getListaDemonstracoes().getListaDemonstracoesDisponiveis()){
            d.setEstado(new DemonstracaoConflitosAtualizadosEstado(d));
        }
    }
    
}
