/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Representa um dos Estados possíveis da Exposicao (Estado de "Demontrações Confirmadas").
 * @author catarinarib
 */
public class ExposicaoDemonstracoesConfirmadasEstado extends ExpoImpEstado {

    /**
     * Contrutor do Estado de "Demonstrações Confirmadas" da Exposição.
     *
     * @param exposicao a exposição que vai transitar de estado
     */
    public ExposicaoDemonstracoesConfirmadasEstado(Exposicao exposicao) {
        super(exposicao);
    }

    /**
     * Método que indica que a Exposição está no Estado "Demonstrações Confirmadas".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setConfirmacaoRealizacaoDemos() {
        return true;
    }

    /**
     * Método que muda o estado da Exposição para o Estado "Candidaturas abertas Demos".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setDemonstracaoCandidaturasAbertas() {
        if(valida()){
            super.getExposicao().setEstado(new ExposicaoCandidaturasDemosAbertasEstado(super.getExposicao()));
            return true;
        }
        return false;
    }
    
    /**
     * Verifica se a Exposição pode mudar para o Estado "Candidaturas Abertas Demos".
     *
     * @return false, se não puder mudar para esse estado e true, se for
     * possível mudar
     */
    public boolean valida(){
        return super.getExposicao().getEstado().setConfirmacaoRealizacaoDemos();
    }

    
    
}
