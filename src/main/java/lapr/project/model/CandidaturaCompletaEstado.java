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
public class CandidaturaCompletaEstado extends CandImpEstado {

    public CandidaturaCompletaEstado(Candidatura cand) {
        super(cand);
    }

    @Override
    public boolean setCompleta() {
        return true;
    }

    @Override
    public boolean setConflitosDetetados() {
        CandidaturaConflitosDetetadosEstado novoSt = new CandidaturaConflitosDetetadosEstado(super.getCandidatura());
        if (valida()) {
            super.getCandidatura().setEstado(novoSt);
            return true;
        } else {
            return false;
        }
    }

    private boolean valida() {
        return super.getCandidatura().getEstado().setCompleta();
    }

}
