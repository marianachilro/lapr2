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
public class CandidaturaConflitosDetetadosEstado implements CandidaturaEstado {

    private Candidatura cand;

    public CandidaturaConflitosDetetadosEstado(Candidatura cand) {
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
        return true;
    }

    @Override
    public boolean setConflitosAlterados() {
        CandidaturaConflitosAlteradosEstado novoSt = new CandidaturaConflitosAlteradosEstado(cand);
        if (valida()) {
            cand.setEstado(novoSt);
            return true;
        } else {
            return false;
        }
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
        if (cand.getEstado().setConflitosDetetados()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean setConfirmarStandEstado() {
        return false;
    }
}
