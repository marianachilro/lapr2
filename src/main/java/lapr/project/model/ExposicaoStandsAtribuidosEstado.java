/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Representa um dos Estados possíveis da Exposicao (Estado de "Stands Atribuídos").
 * @author marianachilro
 */
public class ExposicaoStandsAtribuidosEstado extends ExpoImpEstado{
    /**
     * Contrutor do Estado de "StandsAtribuidos" da Exposição.
     *
     * @param exposicao a exposição que vai transitar de estado
     */
    public ExposicaoStandsAtribuidosEstado(Exposicao exposicao){
        super(exposicao,"exposicaoStandsAtribuidos");
    }
    
    /**
     * Método que indica que a Exposição está no Estado "CStands Atribuídos".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setStandsAtribuidos() {
        return true;
    }

    /**
     * Método que muda o estado da Exposição para o Estado "Stands Confirmados".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setStandsConfirmados() {
        if(valida()){
            super.getExposicao().setEstado(new ExposicaoStandsConfirmadosEstado(super.getExposicao()));
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
        return super.getExposicao().getEstado().setStandsAtribuidos();
    }
}
