/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Representa um dos Estados possíveis da Exposicao (Estado de "Candidaturas Decididas Expo").
 * @author marianachilro
 */
public class ExposicaoCandidaturasExpoDecididasEstado extends ExpoImpEstado{
    
    /**
     * Contrutor do Estado de "Candidaturas Decididas Expo" da Exposição.
     *
     * @param expo
     */
    public ExposicaoCandidaturasExpoDecididasEstado(Exposicao expo){
        super(expo,"exposicaoCandidaturasExpoDecididas");
    }

    /**
     * Método que indica que a Exposição está no Estado "Candidaturas Avaliadas Expo".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setExposicaoCandidaturasDecididas() {
        return true;
    }
    
    /**
     * Método que muda o estado da Exposição para o Estado "Demonstrações Confirmadas".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setConfirmacaoRealizacaoDemos() {
        if(valida()){
            super.getExposicao().setEstado(new ExposicaoDemonstracoesConfirmadasEstado(super.getExposicao()));
            return true;
        }
        return false;
    }
    
    /**
     * Verifica se a Exposição pode mudar para o Estado "Demonstrações Confirmadas".
     *
     * @return false, se não puder mudar para esse estado e true, se for
     * possível mudar
     */
    public boolean valida(){
        return super.getExposicao().getEstado().setExposicaoCandidaturasDecididas();
    }
}
    
    

    