/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Representa um dos Estados possíveis da Demonstração (Estado de "Criada").
 *
 * @author marianachilro
 */
public class DemonstracaoCriadaEstado extends DemoImpEstado {

    /**
     * Contrutor do Estado de "Criada" da Demonstração.
     *
     * @param demonstracao a demonstração que vai transitar de estado
     */
    public DemonstracaoCriadaEstado(Demonstracao demonstracao) {
        super(demonstracao, "demonstracaoCriada");
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
     * Método que muda o estado da Demonstração para o Estado "Confirmada".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setConfirmada() {
        if (valida()) {
            super.getDemo().setEstado(new DemonstracaoConfirmadaEstado(super.getDemo()));
            return true;
        }
        return false;
    }

    /**
     * Método que muda o estado da Demonstração para o Estado "Não Confirmada".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setNaoConfirmada() {
        if (!valida()) {
            super.getDemo().setEstado(new DemonstracaoNaoConfirmadaEstado(super.getDemo()));
            return true;
        }
        return false;
    }

    /**
     * Verifica se a Demonstração pode mudar para o Estado "Confirmada" ou "Não
     * Confirmada".
     *
     * @return false, se puder mudar para o estado "Não Confirmada" e true, se
     * for possível mudar para "Confirmada"
     */
    public boolean valida() {

        return super.getDemo().getRealizacao();
    }

}
