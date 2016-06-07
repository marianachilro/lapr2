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
public class CandidaturaCompletaEstado implements CandidaturaEstado {

    private Candidatura cand;

    public CandidaturaCompletaEstado(Candidatura cand) {
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
        return true;
    }

    @Override
    public boolean setConflitosDetetados() {
        if (valida()) {
            return true;
        } else {
            return false;
        }
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
        return false;
    }

    @Override
    public boolean setEstatiscticaKeywordsCriada() {
        return false;
    }

    private boolean valida() {
        if (cand.getEstado().getClass().equals(this.getClass())) {
            return true;
        } else {
            return false;
        }
    }
}
