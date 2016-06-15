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
public class CandidaturaNaoAvaliadaEstado extends CandImpEstado {
    
    public CandidaturaNaoAvaliadaEstado(Candidatura cand) {
        super(cand);
    }
    
    @Override
    public boolean setNaoAvaliada() {
        return true;
    }
    
}
