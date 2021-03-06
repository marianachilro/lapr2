/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Representa um dos Estados possíveis da Exposicao (Estado de "Completa").
 * @author marianachilro
 */
public class ExposicaoCompletaEstado extends ExpoImpEstado{
    
    /**
     * Contrutor do Estado de "Completa" da Exposição.
     *
     * @param exposicao a exposição que vai transitar de estado
     */
    public ExposicaoCompletaEstado(Exposicao exposicao){
        super(exposicao,"exposicaoCompleta");
    }

    /**
     * Método que indica que a Demonstração está no Estado "Completa".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setCompleta() {
        return true;
    }

    /**
     * Método que muda o estado da Exposição para o Estado "Candidaturas Abertas Expo".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setExposicaoCandidaturasAbertas() {
        if(valida()){
            super.getExposicao().setEstado(new ExposicaoCandidaturasExpoAbertasEstado(super.getExposicao()));
            return true;
        }
        return false;
    }

    
    /**
     * Verifica se a Exposição pode mudar para o Estado "Completa".
     *
     * @return false, se não puder mudar para esse estado e true, se for
     * possível mudar
     */
    public boolean valida(){
        return super.getExposicao().getEstado().setCompleta();
    }
}
