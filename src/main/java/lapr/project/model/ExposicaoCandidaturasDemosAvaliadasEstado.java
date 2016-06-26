/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Representa um dos Estados possíveis da Exposicao (Estado de "Candidaturas Avaliadas Demos").
 * @author marianachilro
 */
public class ExposicaoCandidaturasDemosAvaliadasEstado extends ExpoImpEstado{
    
    /**
     * Contrutor do Estado de "Candidaturas Avaliadas Demos" da Exposição.
     *
     * @param exposicao a demonstração que vai transitar de estado
     */
    public ExposicaoCandidaturasDemosAvaliadasEstado(Exposicao exposicao){
        super(exposicao,"exposicaoCandidaturasDemosAvaliadas");
    }

    /**
     * Método que indica que a Exposição está no Estado "Candidaturas Avaliadas Demos".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setDemonstracaoCandidaturasAvaliadas() {
        
        return true;
    }

    /**
     * Método que muda o estado da Exposição para o Estado "Candidaturas Decididas Demos".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setDemonstracaoCandidaturasDecididas() {
        if(valida()){
            super.getExposicao().setEstado(new ExposicaoCandidaturasDemosDecididasEstado(super.getExposicao()));
            return true;
        }
        return false;
    }

    
    
    /**
     * Verifica se a Exposição pode mudar para o Estado "Candidaturas Decididas Demos".
     *
     * @return false, se não puder mudar para esse estado e true, se for
     * possível mudar
     */
    public boolean valida(){
        return super.getExposicao().getEstado().setDemonstracaoCandidaturasAvaliadas();
    }
}
