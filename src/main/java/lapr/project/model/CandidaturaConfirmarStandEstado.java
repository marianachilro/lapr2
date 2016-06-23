/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Representa um dos Estados possíveis da Candidatura (Estado de "Confirmar Stand").
 * @author miniondevil
 */
public class CandidaturaConfirmarStandEstado extends CandImpEstado {

    /**
     * Contrutor do Estado de "Confirmar Stand" da Candidatura.
     *
     * @param candidatura a candidatura que vai transitar de estado
     */
    public CandidaturaConfirmarStandEstado(CandidaturaGeral cand) {
        super(cand);
    }
    
    /**
     * Método que indica que a Candidatura está no Estado "Confirmar Stand".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setConfirmarStand() {
        return true;
    }

}
