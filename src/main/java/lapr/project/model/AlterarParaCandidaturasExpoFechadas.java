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
public class AlterarParaCandidaturasExpoFechadas extends TimerTask{

    private final CentroExposicoes centro;
    private final Exposicao exposicao;
    
    public AlterarParaCandidaturasExpoFechadas(CentroExposicoes centro, Exposicao expo){
        this.centro=centro;
        this.exposicao=expo;
    }
    @Override
    public void run() {
        this.exposicao.setEstado(new ExposicaoCandidaturasExpoFechadasEstado(this.exposicao));
    }
    
}
