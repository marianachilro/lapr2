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
public class CandidaturaCriadaEstado implements CandidaturaEstado {

    private final Candidatura cand; 
    
    public CandidaturaCriadaEstado(Candidatura cand) {
        this.cand = cand;
    }
    
    @Override
    public boolean setCriada() {
        return true;
    }

    @Override
    public boolean setAlterada() {
        CandidaturaAlteradaEstado novoSt = new CandidaturaAlteradaEstado(cand);
        if(valida()) {
            cand.setEstado(novoSt);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean setCompleta() {
        CandidaturaCompletaEstado novoSt = new CandidaturaCompletaEstado(cand);
        if(valida()) {
            cand.setEstado(novoSt);
            return true;
        } else {
            return false;
        }
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
        return false;
    }

    @Override
    public boolean setEstatiscticaKeywordsCriada() {
        return false;
    }
    
    private boolean valida() {
        return cand.getEstado().setCriada();
    }

    @Override
    public boolean setConfirmarStandEstado() {
        return false;
    }
}
