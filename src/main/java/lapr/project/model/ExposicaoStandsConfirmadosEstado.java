/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Representa um dos Estados possíveis da Exposicao (Estado de "Stands Confirmados").
 * @author marianachilro
 */
public class ExposicaoStandsConfirmadosEstado extends ExpoImpEstado{
    /**
     * Contrutor do Estado de "Stands Confirmados" da Exposição.
     *
     * @param exposicao a exposição que vai transitar de estado
     */
    public ExposicaoStandsConfirmadosEstado(Exposicao exposicao){
        super(exposicao,"exposicaoStandsConfirmados");
    }
    
    /**
     * Método que indica que a Exposição está no Estado "Stands Confirmados".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setStandsConfirmados() {
        return true;
    }
    
}
