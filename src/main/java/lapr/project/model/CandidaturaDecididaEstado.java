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
public class CandidaturaDecididaEstado implements CandidaturaEstado {

    private Candidatura cand;

    public CandidaturaDecididaEstado(Candidatura cand) {
        this.cand = cand;
    }

    @Override
    public boolean setCriada() {
        return false;
    }

    @Override
    public boolean setAlterada() {
        return false;
    }

    @Override
    public boolean setCompleta() {
        return false;
    }

    @Override
    public boolean setConflitosDetetados() {
        return false;
    }

    @Override
    public boolean setConflitosAlterados() {
        return false;
    }

    @Override
    public boolean setAtribuida() {
        return false;
    }

    @Override
    public boolean setAvaliada() {
        return false;
    }

    @Override
    public boolean setEstatisticaAvaliacoesCriadas() {
        return false;
    }

    @Override
    public boolean setDecidida() {
        return true;
    }

    @Override
    public boolean setEstatiscticaKeywordsCriada() {
        if (valida()) {
            return true;
        } else {
            return false;
        }
    }

    private boolean valida() {
        if (cand.getEstado().getClass().equals(this.getClass())) {
            return true;
        } else {
            return false;
        }
    }

}
