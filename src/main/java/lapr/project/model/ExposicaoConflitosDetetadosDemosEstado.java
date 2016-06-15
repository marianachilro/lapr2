/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.GregorianCalendar;
import lapr.project.utils.Data;

/**
 * Representa um dos Estados possíveis da Exposicao (Estado de "Conflitos Detetados Demos").
 * @author marianachilro
 */
public class ExposicaoConflitosDetetadosDemosEstado extends ExpoImpEstado{
    
    /**
     * Contrutor do Estado de "Conflitos Detetados Demos" da Exposição.
     *
     * @param exposicao a exposição que vai transitar de estado
     */
    public ExposicaoConflitosDetetadosDemosEstado(Exposicao exposicao){
        super(exposicao);
    }
    
    /**
     * Método que indica que a Demonstração está no Estado "Conflitos Detetados Demos".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setDemonstracaoConflitosDetetados() {
        return true;
    }

    /**
     * Método que muda o estado da Exposição para o Estado "Conflitos Atualizados Demos".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setDemonstracaoConflitosAtualizados() {
        if(valida()){
            super.getExposicao().setEstado(new ExposicaoConflitosAtualizadosDemosEstado(super.getExposicao()));
            return true;
        }
        return false;
    }

    /**
     * Verifica se a Exposição pode mudar para o Estado "Conflitos Atualizados Demos".
     *
     * @return false, se não puder mudar para esse estado e true, se for
     * possível mudar
     */
    public boolean valida(){
        return super.getExposicao().getEstado().setDemonstracaoConflitosDetetados();
    }
}
