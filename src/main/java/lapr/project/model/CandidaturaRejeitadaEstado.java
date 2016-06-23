/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Representa um dos Estados possíveis da Candidatura (Estado de "Rejeitada").
 * @author Rita
 */
public class CandidaturaRejeitadaEstado extends CandImpEstado {
    
    /**
     * Contrutor do Estado de "Rejeitada" da Candidatura.
     *
     * @param candidatura a candidatura que vai transitar de estado
     */
    public CandidaturaRejeitadaEstado(CandidaturaGeral cand) {
        super(cand);
    }
    
    /**
     * Método que indica que a Candidatura está no Estado "Rejeitada".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setRejeitada() {
        return true;
    }
    
}
