/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Representa um dos Estados possíveis da Candidatura (Estado de "Aceite").
 * @author Rita
 */
public class CandidaturaAceiteEstado extends CandImpEstado {
    
    /**
     * Contrutor do Estado de "Aceite" da Candidatura.
     *
     * @param candidatura a candidatura que vai transitar de estado
     */
    public CandidaturaAceiteEstado(Candidatura cand) {
        super(cand);
    }
    
    /**
     * Método que indica que a Candidatura está no Estado "Aceite".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setAceite() {
        return true;
    }
    
    /**
     * Método que muda o estado da Candidatura para o Estado "Confirmar Stand".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setConfirmarStand() {
        if(valida()) {
            super.getCandidatura().setEstado(new CandidaturaConfirmarStandEstado(super.getCandidatura()));
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Método que muda o estado da Candidatura para o Estado "Não Confirmar Stand".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setNaoConfirmarStand() {
        if(valida()) {
            super.getCandidatura().setEstado(new CandidaturaNaoConfirmarStandEstado(super.getCandidatura()));
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Verifica se a Candidatura pode mudar para o Estado "Confirmar Stand" ou "Não Confirmar Stand".
     *
     * @return false, se não puder mudar para esse estado e true, se for
     * possível mudar
     */
    private boolean valida() {
        return super.getCandidatura().getEstado().setAceite();
    }
    
}
