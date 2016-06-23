/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Representa um dos Estados possíveis da Candidatura (Estado de "Removida").
 * @author Rita
 */
public class CandidaturaRemovidaEstado extends CandImpEstado {
    
    /**
     * Contrutor do Estado de "Removida" da Candidatura.
     *
     * @param cand a candidatura que vai transitar de estado
     */
    public CandidaturaRemovidaEstado(CandidaturaGeral cand) {
        super(cand);
    }
    
    /**
     * Método que indica que a Candidatura está no Estado "Removida".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setRemovida() {
        return true;
    }
    
}
