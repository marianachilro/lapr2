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
public class CandidaturaRejeitadaEstado extends CandImpEstado {
    
    public CandidaturaRejeitadaEstado(Candidatura cand) {
        super(cand);
    }
    
    @Override
    public boolean setRejeitada() {
        return true;
    }
    
}
