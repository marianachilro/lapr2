/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Representa um dos Estados possíveis da Exposicao (Estado de "Candidaturas Avaliadas Expo").
 * @author catarinarib
 */
class ExposicaoCandidaturasExpoAvaliadasEstado extends ExpoImpEstado {

    /**
     * Contrutor do Estado de "Candidaturas Avaliadas Expo" da Exposição.
     *
     * @param exposicao a exposição que vai transitar de estado
     */
    public ExposicaoCandidaturasExpoAvaliadasEstado(Exposicao exposicao) {
        super(exposicao,"exposicaoCandidaturasExpoAvaliadas");
    }
    
    /**
     * Método que indica que a Exposição está no Estado "Candidaturas Avaliadas Expo".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setExposicaoCandidaturasAvaliadas() {
        return true;
    }

    /**
     * Método que muda o estado da Exposição para o Estado "Candidaturas Decididas Expo".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setExposicaoCandidaturasDecididas() {
       if(valida()){
            super.getExposicao().setEstado(new ExposicaoCandidaturasExpoDecididasEstado(super.getExposicao()));
            return true;
        }
        return false;
    }

    /**
     * Verifica se a Exposição pode mudar para o Estado "Candidaturas Decididas Expo".
     *
     * @return false, se não puder mudar para esse estado e true, se for
     * possível mudar
     */
    public boolean valida(){
        return super.getExposicao().getEstado().setExposicaoCandidaturasAvaliadas();
    }
    
}