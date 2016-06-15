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
public class CandidaturaEstatisticaKeywordCriadaEstado extends CandImpEstado {

    public CandidaturaEstatisticaKeywordCriadaEstado(Candidatura cand) {
        super(cand);
    }

    @Override
    public boolean setEstatiscticaKeywordsCriada() {
        return true;
    }

    @Override
    public boolean setConfirmarStandEstado() {
        if (valida()) {
            CandidaturaEstado novoSt = new ConfirmarStandEstado(super.getCandidatura());
            super.getCandidatura().setEstado(novoSt);
            return true;
        }
        return false;
    }

    private boolean valida() {
        return super.getCandidatura().getEstado().setEstatiscticaKeywordsCriada();
    }

}
