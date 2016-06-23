/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Representa um dos Estados possíveis da Candidatura (Estado de "Avaliada").
 * @author Rita
 */
public class CandidaturaAvaliadaEstado extends CandImpEstado {

    /**
     * Contrutor do Estado de "Avaliada" da Candidatura.
     *
     * @param cand a candidatura que vai transitar de estado
     */
    public CandidaturaAvaliadaEstado(CandidaturaGeral cand) {
        super(cand);
    }

    /**
     * Método que indica que a Candidatura está no Estado "Avaliada".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setAvaliada() {
        return true;
    }
    
    /**
     * Método que muda o estado da Candidatura para o Estado "Aceite".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setAceite() {
        if(valida()) {
            super.getCandidatura().setEstado(new CandidaturaAceiteEstado(super.getCandidatura()));
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Método que muda o estado da Candidatura para o Estado "Rejeitada".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setRejeitada() {
        if(valida()) {
            super.getCandidatura().setEstado(new CandidaturaRejeitadaEstado(super.getCandidatura()));
            return true;
        } else {
            return false;
        }
    }

    /**
     * Verifica se a Candidatura pode mudar para o Estado "Avaliada".
     *
     * @return false, se não puder mudar para esse estado e true, se for
     * possível mudar
     */
    private boolean valida() {
        return super.getCandidatura().getEstado().setAvaliada();
    }

}
