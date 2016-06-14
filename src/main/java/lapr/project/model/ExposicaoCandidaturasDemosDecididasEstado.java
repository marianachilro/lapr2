/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.GregorianCalendar;
import lapr.project.utils.Data;

/**
 * Representa um dos Estados possíveis da Exposicao (Estado de "Candidaturas Decididas Demos").
 * @author marianachilro
 */
public class ExposicaoCandidaturasDemosDecididasEstado extends ExpoImpEstado{
    
    /**
     * Contrutor do Estado de "Candidaturas Decididas Demos" da Exposição.
     *
     * @param exposicao a demonstração que vai transitar de estado
     */
    public ExposicaoCandidaturasDemosDecididasEstado(Exposicao exposicao){
        super(exposicao);
    }
    
    /**
     * Método que indica que a Exposição está no Estado "Candidaturas Decididas Demos".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setDemonstracaoCandidaturasDecididas() {
        return true;
    }

    /**
     * Método que muda o estado da Exposição para o Estado "Stands Atribuidos".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setStandsAtribuidos() {
        if(valida()){
            super.getExposicao().setEstado(new ExposicaoStandsAtribuidosEstado(super.getExposicao()));
            return true;
        }
        return false;
    }
    
    /**
     * Verifica se a Exposição pode mudar para o Estado "Stands Atribuidos".
     *
     * @return false, se não puder mudar para esse estado e true, se for
     * possível mudar
     */
    public boolean valida(){
        return super.getExposicao().getEstado().setDemonstracaoCandidaturasDecididas();
    }
}
