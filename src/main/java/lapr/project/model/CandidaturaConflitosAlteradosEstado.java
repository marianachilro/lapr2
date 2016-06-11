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
public class CandidaturaConflitosAlteradosEstado implements CandidaturaEstado {

    private final Candidatura cand;

    public CandidaturaConflitosAlteradosEstado(Candidatura cand) {
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
        return true;
    }

    @Override
    public boolean setAtribuida() {
        CandidaturaAtribuidaEstado novoSt = new CandidaturaAtribuidaEstado(cand);
        if (valida()) {
            cand.setEstado(novoSt);
            return true;
        } else {
            return false;
        }
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
        return cand.getEstado().setConflitosAlterados();
    }

    @Override
    public boolean setConfirmarStandEstado() {
        return false;
    }

}
