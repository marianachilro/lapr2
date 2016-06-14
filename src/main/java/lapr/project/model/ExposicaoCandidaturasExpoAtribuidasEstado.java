/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import lapr.project.utils.Data;



/**
 * Representa um dos Estados possíveis da Exposicao (Estado de "Candidaturas Atribuídas Expo").
 * @author catarinarib
 */
public class ExposicaoCandidaturasExpoAtribuidasEstado extends ExpoImpEstado {

    /**
     * Contrutor do Estado de "Candidaturas Atribuidas Expo" da Exposição.
     *
     * @param e a exposicao que vai transitar de estado
     */
    public ExposicaoCandidaturasExpoAtribuidasEstado(Exposicao e) {
        super(e);
    }

    /**
     * Método que indica que a Exposição está no Estado "Candidaturas Atribuídas Expo".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setExposicaoCandidaturasAtribuidas() {
        return true;
    }

    /**
     * Método que muda o estado da Exposição para o Estado "Candidaturas Avaliadas Expo".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setExposicaoCandidaturasAvaliadas() {
        if(valida()){
            super.getExposicao().setEstado(new ExposicaoCandidaturasExpoAvaliadasEstado(super.getExposicao()));
            return true;
        }
        return false;
    }

    /**
     * Verifica se a Exposição pode mudar para o Estado "Candidaturas Avaliadas Expo".
     *
     * @return false, se não puder mudar para esse estado e true, se for
     * possível mudar
     */
    public boolean valida(){
        return super.getExposicao().getEstado().setExposicaoCandidaturasAtribuidas();
    }
}