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
public class CandidaturaCriadaEstado extends CandImpEstado {

    public CandidaturaCriadaEstado(Candidatura cand) {
        super(cand);
    }

    @Override
    public boolean setCriada() {
        return true;
    }

    @Override
    public boolean setAlterada() {
        CandidaturaAlteradaEstado novoSt = new CandidaturaAlteradaEstado(super.getCandidatura());
        if (valida()) {
            super.getCandidatura().setEstado(novoSt);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean setCompleta() {
        CandidaturaCompletaEstado novoSt = new CandidaturaCompletaEstado(super.getCandidatura());
        if (valida()) {
            super.getCandidatura().setEstado(novoSt);
            return true;
        } else {
            return false;
        }
    }

    private boolean valida() {
        return super.getCandidatura().getEstado().setCriada();
    }

}
