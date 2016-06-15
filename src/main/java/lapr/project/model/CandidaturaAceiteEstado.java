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
public class CandidaturaAceiteEstado extends CandImpEstado {
    
    public CandidaturaAceiteEstado(Candidatura cand) {
        super(cand);
    }
    
    @Override
    public boolean setAceite() {
        return true;
    }
    
    @Override
    public boolean setConfirmarStand() {
        CandidaturaConfirmarStandEstado novoSt = new CandidaturaConfirmarStandEstado(super.getCandidatura());
        if(valida()) {
            super.getCandidatura().setEstado(novoSt);
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public boolean setNaoConfirmarStand() {
        CandidaturaNaoConfirmarStandEstado novoSt = new CandidaturaNaoConfirmarStandEstado(super.getCandidatura());
        if(valida()) {
            super.getCandidatura().setEstado(novoSt);
            return true;
        } else {
            return false;
        }
    }
    
    private boolean valida() {
        return super.getCandidatura().getEstado().setAceite();
    }
    
}
