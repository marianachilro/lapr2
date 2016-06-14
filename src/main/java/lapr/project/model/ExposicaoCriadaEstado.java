/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Representa um dos Estados possíveis da Exposicao (Estado de "Criada").
 * @author marianachilro
 */
public class ExposicaoCriadaEstado extends ExpoImpEstado{
    
    /**
     * Contrutor do Estado de "Criada" da Exposição.
     *
     * @param exposicao a exposição que vai transitar de estado
     */
    public ExposicaoCriadaEstado(Exposicao exposicao){
        super(exposicao);
    }
    
    /**
     * Método que indica que a Demonstração está no Estado "Criada".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setCriada() {
        return true;
    }

    /**
     * Método que muda o estado da Exposição para o Estado "FAE Sem Demo".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setFaeSemDemo() {
        if(valida()){
            super.getExposicao().setEstado(new ExposicaoFAESemDemoEstado(super.getExposicao()));
            return true;
        }
        return false;
    }

    /**
     * Método que muda o estado da Exposição para o Estado "Demo Sem FAE".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setDemoSemFae() {
        if(valida()){
            super.getExposicao().setEstado(new ExposicaoDemoSemFAEEstado(super.getExposicao()));
            return true;
        }
        return false;
    }
    
    /**
     * Verifica se a Exposição pode mudar para o Estado "FAE Sem Demo" ou "Demo Sem FAE".
     *
     * @return false, se não puder mudar para esse estado e true, se for
     * possível mudar
     */
    public boolean valida(){
        return super.getExposicao().getEstado().setCriada();
    }
}