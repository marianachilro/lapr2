/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Representa um dos Estados possíveis da Candidatura (Estado de "Não Avaliada").
 * @author Rita
 */
public class CandidaturaNaoAvaliadaEstado extends CandImpEstado {
    
    /**
     * Contrutor do Estado de "Não Avaliada" da Candidatura.
     *
     * @param cand a candidatura que vai transitar de estado
     */
    public CandidaturaNaoAvaliadaEstado(CandidaturaGeral cand) {
        super(cand,"candidaturaNaoAvaliada");
    }
    
    /**
     * Método que indica que a Candidatura está no Estado "Não Avaliada".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setNaoAvaliada() {
        return true;
    }
    
}
