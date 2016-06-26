/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Representa um dos Estados possíveis da Exposicao (Estado de "Candidaturas Fechadas Expo").
 * @author marianachilro
 */
public class ExposicaoCandidaturasExpoFechadasEstado extends ExpoImpEstado{
    
    /**
     * Contrutor do Estado de "Candidaturas Fechadas Expo" da Exposição.
     *
     * @param exposicao a demonstração que vai transitar de estado
     */
    public ExposicaoCandidaturasExpoFechadasEstado(Exposicao exposicao){
        super(exposicao,"exposicaoCandidaturasExpoFechadas");
    }

    /**
     * Método que indica que a Demonstração está no Estado "Candidaturas Abertas Expo".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setExposicaoCandidaturasFechadas() {
        return true;
    }

    /**
     * Método que muda o estado da Exposição para o Estado "Conflitos Detetados Expo".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setExposicaoConflitosDetetados() {
        if(valida()){
            super.getExposicao().setEstado(new ExposicaoConflitosDetetadosExpoEstado(super.getExposicao()));
            return true;
        }
        return false;
    }

    /**
     * Verifica se a Exposição pode mudar para o Estado "Candidaturas Fechadas Expo".
     *
     * @return false, se não puder mudar para esse estado e true, se for
     * possível mudar
     */
    public boolean valida(){
        return super.getExposicao().getEstado().setExposicaoCandidaturasFechadas();
    }
    
}
