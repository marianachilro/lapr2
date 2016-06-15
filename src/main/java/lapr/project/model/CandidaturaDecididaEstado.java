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
public class CandidaturaDecididaEstado extends CandImpEstado {

    public CandidaturaDecididaEstado(Candidatura cand) {
        super(cand);
    }

    @Override
    public boolean setDecidida() {
        return true;
    }

    @Override
    public boolean setEstatiscticaKeywordsCriada() {
        EstatisticaAvaliacoesCriadaEstado novoSt = new EstatisticaAvaliacoesCriadaEstado(super.getCandidatura());
        if (valida()) {
            super.getCandidatura().setEstado(novoSt);
            return true;
        } else {
            return false;
        }
    }

    private boolean valida() {
        return super.getCandidatura().getEstado().setDecidida();
    }

}
