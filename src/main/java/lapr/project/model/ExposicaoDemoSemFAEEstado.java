/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Representa um dos Estados possíveis da Exposicao (Estado de "Demo Sem FAE").
 * @author marianachilro
 */
public class ExposicaoDemoSemFAEEstado extends ExpoImpEstado{
    
    /**
     * Contrutor do Estado de "Demo Sem FAE" da Exposição.
     *
     * @param exposicao a exposição que vai transitar de estado
     */
    public ExposicaoDemoSemFAEEstado(Exposicao exposicao){
        super(exposicao);
    }
    
    /**
     * Método que indica que a Exposição está no Estado "Demo Sem FAE".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setDemoSemFae() {
        return true;
    }

    /**
     * Método que muda o estado da Exposição para o Estado "Completa".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setCompleta() {
        if(valida()){
            super.getExposicao().setEstado(new ExposicaoCompletaEstado(super.getExposicao()));
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
        return super.getExposicao().getEstado().setDemoSemFae();
    }
    
}
