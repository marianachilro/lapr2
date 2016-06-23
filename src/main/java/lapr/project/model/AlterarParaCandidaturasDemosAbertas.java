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
public class AlterarParaCandidaturasDemosAbertas extends TimerTask{
    private CentroExposicoes centro;
    private Exposicao exposicao;
    public AlterarParaCandidaturasDemosAbertas(CentroExposicoes centro, Exposicao exposicao){
        this.centro=centro;
        this.exposicao=exposicao;
    }
    @Override
    public void run() {
        this.exposicao.setEstado(new ExposicaoCandidaturasDemosAbertasEstado(this.exposicao));
        for(Demonstracao d : this.exposicao.getListaDemonstracoes().getListaDemonstracoesDisponiveis()){
            d.setEstado(new DemonstracaoCandidaturasAbertasEstado(d));
        }
    }
    
}
