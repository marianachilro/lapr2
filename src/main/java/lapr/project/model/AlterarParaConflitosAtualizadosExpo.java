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
public class AlterarParaConflitosAtualizadosExpo extends TimerTask{
    
    private Exposicao exposicao;
    private CentroExposicoes centro;
    
    public AlterarParaConflitosAtualizadosExpo(CentroExposicoes centro, Exposicao expo){
        this.exposicao=expo;
        this.centro=centro;
    }
    @Override
    public void run() {
        this.exposicao.setEstado(new ExposicaoConflitosAtualizadosExpoEstado(this.exposicao));
    }
}
