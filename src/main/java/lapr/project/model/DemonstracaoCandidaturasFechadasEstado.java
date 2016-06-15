/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Representa um dos Estados possíveis da Demonstração (Estado de "Candidaturas
 * Fechadas").
 *
 * @author marianachilro
 */
public class DemonstracaoCandidaturasFechadasEstado  extends DemoImpEstado {

  

    /**
     * Contrutor do Estado de Candidaturas Fechadas da Demonstração.
     *
     * @param demonstracao a demonstração que vai transitar de estado
     */
    public DemonstracaoCandidaturasFechadasEstado(Demonstracao demonstracao) {
super(demonstracao);    }

    
    /**
     * Método que indica que a Demonstração está no Estado "Candidaturas
     * Fechadas".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setCandidaturasFechadas() {
        return true;
    }

    /**
     * Método que muda o estado da Demonstração para o Estado "Conflitos
     * Detetados".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setConflitosDetetados() {
        if (valida()) {
            super.getDemo().setEstado(new DemonstracaoConflitosDetetadosEstado(super.getDemo()));
            return true;
        }
        return false;
    }

    
    /**
     * Verifica se a Demonstração pode mudar para o Estado "Conflitos
     * Detetados".
     *
     * @return false, se não puder mudar para esse estado e true, se for
     * possível mudar
     */
    public boolean valida() {
        return super.getDemo().getEstado().setCandidaturasFechadas();
    }
}
