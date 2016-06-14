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
public class CandidaturaAlteradaEstado extends CandImpEstado {

    public CandidaturaAlteradaEstado(Candidatura cand) {
        super(cand);
    }

    @Override
    public boolean setAlterada() {
        return true;
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
        return super.getCandidatura().getEstado().setConflitosAlterados();
    }

}
