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
public class AlterarParaCandidaturasExpoAbertas extends TimerTask{
    private CentroExposicoes centro;
    private Exposicao exposicao;
    public AlterarParaCandidaturasExpoAbertas(CentroExposicoes centro, Exposicao exposicao){
        this.centro=centro;
        this.exposicao=exposicao;
    }
    @Override
    public void run() {
        this.exposicao.setEstado(new ExposicaoCandidaturasExpoAbertasEstado(this.exposicao));
    }
}
