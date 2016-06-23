/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Representa um dos Estados possíveis da Candidatura (Estado de "Não Confirmar Stand").
 * @author Rita
 */
public class CandidaturaNaoConfirmarStandEstado extends CandImpEstado {
    
    /**
     * Contrutor do Estado de "Não Confirmar Stand" da Candidatura.
     *
     * @param candidatura a candidatura que vai transitar de estado
     */
    public CandidaturaNaoConfirmarStandEstado(CandidaturaGeral cand) {
        super(cand);
    }
    
    /**
     * Método que indica que a Candidatura está no Estado "Não Confirmar Stand".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setNaoConfirmarStand() {
        return true;
    }
    
}
