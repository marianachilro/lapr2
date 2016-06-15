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
public class CandidaturaEmAvaliacaoEstado extends CandImpEstado {

    public CandidaturaEmAvaliacaoEstado(Candidatura cand) {
        super(cand);
    }

    @Override
    public boolean setEmAvaliacao() {
        return true;
    }

    @Override
    public boolean setAvaliada() {
        CandidaturaAvaliadaEstado novoSt = new CandidaturaAvaliadaEstado(super.getCandidatura());
        if (valida()) {
            super.getCandidatura().setEstado(novoSt);
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public boolean setNaoAvaliada() {
        CandidaturaNaoAvaliadaEstado novoSt = new CandidaturaNaoAvaliadaEstado(super.getCandidatura());
        if(valida()) {
            super.getCandidatura().setEstado(novoSt);
            return true;
        } else {
            return false;
        }
    }

    private boolean valida() {
        return super.getCandidatura().getEstado().setEmAvaliacao();
    }

}
