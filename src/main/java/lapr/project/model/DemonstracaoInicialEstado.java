/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Representa um dos Estados possíveis da Demonstração (Estado de "Inicial").
 *
 * @author marianachilro
 */
public class DemonstracaoInicialEstado extends DemoImpEstado {

    /**
     * Contrutor do Estado de "Inicial" da Demonstração.
     *
     * @param demonstracao a demonstração que vai transitar de estado
     */
    public DemonstracaoInicialEstado(Demonstracao demonstracao) {
        super(demonstracao,"demonstracaoInicial");
    }

    /**
     * Método que muda o estado da Demonstração para o Estado "Criada".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setCriada() {

        if (valida()) {
            super.getDemo().setEstado(new DemonstracaoCriadaEstado(super.getDemo()));
            return true;
        }
        return false;
    }

    /**
     * Verifica se a Demonstração pode mudar para o Estado "Criada".
     *
     * @return false, se não puder mudar para esse estado e true, se for
     * possível mudar
     */
    public boolean valida() {

        return super.getDemo().valida();
    }

}
