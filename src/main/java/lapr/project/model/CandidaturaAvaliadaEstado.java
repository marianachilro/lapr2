/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author Rita
 */
public class CandidaturaAvaliadaEstado extends CandImpEstado {

    public CandidaturaAvaliadaEstado(Candidatura cand) {
        super(cand);
    }

    @Override
    public boolean setAvaliada() {
        return true;
    }

    @Override
    public boolean setEstatisticaAvaliacoesCriadas() {
        EstatisticaAvaliacoesCriadaEstado novoSt = new EstatisticaAvaliacoesCriadaEstado(super.getCandidatura());
        if (valida()) {
            super.getCandidatura().setEstado(novoSt);
            return true;
        } else {
            return false;
        }
    }

    private boolean valida() {
        return super.getCandidatura().getEstado().setAvaliada();
    }

}
