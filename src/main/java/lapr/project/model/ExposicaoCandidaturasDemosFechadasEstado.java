/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Representa um dos Estados possíveis da Exposicao (Estado de "Candidaturas Fechadas Demos").
 * @author marianachilro
 */
public class ExposicaoCandidaturasDemosFechadasEstado extends ExpoImpEstado{
    
    /**
     * Contrutor do Estado de "Candidaturas Fechadas Demos" da Exposição.
     *
     * @param exposicao a demonstração que vai transitar de estado
     */
    public ExposicaoCandidaturasDemosFechadasEstado(Exposicao exposicao){
        super(exposicao);
    }
    
    /**
     * Método que indica que a Demonstração está no Estado "Candidaturas Fechadas Demos".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setDemonstracaoCandidaturasFechadas() {
        return true;
    }

    /**
     * Método que muda o estado da Exposição para o Estado "Conflitos Detetados Demos".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setDemonstracaoConflitosDetetados() {
        if(valida()){
            super.getExposicao().setEstado(new ExposicaoConflitosDetetadosDemosEstado(super.getExposicao()));
            return true;
        }
        return false;
    }
    
    /**
     * Verifica se a Exposição pode mudar para o Estado "Conflitos Detetados Demos".
     *
     * @return false, se não puder mudar para esse estado e true, se for
     * possível mudar
     */
    public boolean valida(){
        return super.getExposicao().getEstado().setDemonstracaoCandidaturasFechadas();
    }
}
