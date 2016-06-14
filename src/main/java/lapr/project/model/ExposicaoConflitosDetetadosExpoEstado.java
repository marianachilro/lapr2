/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.GregorianCalendar;
import lapr.project.utils.Data;

/**
 * Representa um dos Estados possíveis da Exposicao (Estado de "Conflitos Detetados Expo").
 * @author marianachilro
 */
public class ExposicaoConflitosDetetadosExpoEstado extends ExpoImpEstado{
    
    /**
     * Contrutor do Estado de "Conflitos Detetados Expo" da Exposição.
     *
     * @param exposicao a exposição que vai transitar de estado
     */
    public ExposicaoConflitosDetetadosExpoEstado(Exposicao exposicao){
        super(exposicao);
    }
    
    /**
     * Método que indica que a Demonstração está no Estado "Conflitos Detetados Expo".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setExposicaoConflitosDetetados() {
        return true;
    }

    /**
     * Método que muda o estado da Exposição para o Estado "Conflitos Atualizados Expo".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setExposicaoConflitosAtualizados() {
        if(valida()){
            super.getExposicao().setEstado(new ExposicaoConflitosAtualizadosExpoEstado(super.getExposicao()));
            return true;
        }
        return false;
    }

    /**
     * Verifica se a Exposição pode mudar para o Estado "Conflitos Atualizados Expo".
     *
     * @return false, se não puder mudar para esse estado e true, se for
     * possível mudar
     */
    public boolean valida(){
        return super.getExposicao().getEstado().setExposicaoConflitosDetetados();
    }
    
}
