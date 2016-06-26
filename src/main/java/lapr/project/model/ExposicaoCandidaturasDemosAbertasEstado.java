/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Representa um dos Estados possíveis da Exposicao (Estado de "Candidaturas Abertas Demos").
 * @author marianachilro
 */
public class ExposicaoCandidaturasDemosAbertasEstado extends ExpoImpEstado{
    
    
    public ExposicaoCandidaturasDemosAbertasEstado(Exposicao expo) {
        super(expo,"exposicaoCandidaturasDemosAbertas");
    }
    
    /**
     * Método que indica que a Demonstração está no Estado "Candidaturas Abertas Demos".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setDemonstracaoCandidaturasAbertas() {
        return true;
    }

    /**
     * Método que muda o estado da Exposição para o Estado "Candidaturas Fechadas Demos".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setDemonstracaoCandidaturasFechadas() {
        if(valida()){
            super.getExposicao().setEstado(new ExposicaoCandidaturasDemosFechadasEstado(super.getExposicao()));
            return true;
        }
        return false;
    }

    
    /**
     * Verifica se a Exposição pode mudar para o Estado "Candidaturas Fechadas Demos".
     *
     * @return false, se não puder mudar para esse estado e true, se for
     * possível mudar
     */
    public boolean valida(){
        return super.getExposicao().getEstado().setDemonstracaoCandidaturasAbertas();
    }
}
