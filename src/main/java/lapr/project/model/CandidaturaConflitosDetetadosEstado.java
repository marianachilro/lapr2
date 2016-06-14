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
public class CandidaturaConflitosDetetadosEstado extends CandImpEstado {

    public CandidaturaConflitosDetetadosEstado(Candidatura cand) {
        super(cand);
    }

    @Override
    public boolean setConflitosDetetados() {
        return true;
    }

    @Override
    public boolean setConflitosAlterados() {
        CandidaturaConflitosAlteradosEstado novoSt = new CandidaturaConflitosAlteradosEstado(super.getCandidatura());
        if (valida()) {
            super.getCandidatura().setEstado(novoSt);
            return true;
        } else {
            return false;
        }
    }

    private boolean valida() {
        return super.getCandidatura().getEstado().setConflitosDetetados();
    }

}
