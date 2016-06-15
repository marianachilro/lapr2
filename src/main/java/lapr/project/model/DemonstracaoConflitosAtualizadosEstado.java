/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Representa um dos Estados possíveis da Demonstração (Estado de "Conflitos
 * Atualizados").
 *
 * @author marianachilro
 */
public class DemonstracaoConflitosAtualizadosEstado extends DemoImpEstado {

  

    /**
     * Contrutor do Estado de "Conflitos Atualizados" da Demonstração.
     *
     * @param demonstracao a demonstração que vai transitar de estado
     */
    public DemonstracaoConflitosAtualizadosEstado(Demonstracao demonstracao) {
       super(demonstracao);
    }

   

    /**
     * Método que indica que a Demonstração está no Estado "Conflitos
     * Atualizados".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setConflitosAtualizados() {
        return true;
    }

    /**
     * Método que muda o estado da Demonstração para o Estado "Candidaturas
     * Atribuídas".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setCandidaturasAtribuidas() {
        if (valida()) {
            super.getDemo().setEstado(new DemonstracaoCandidaturasAtribuidasEstado(super.getDemo()));
            return true;
        }
        return false;
    }

    /**
     * Verifica se a Demonstração pode mudar para o Estado "Candidaturas
     * Atribuídas".
     *
     * @return false, se não puder mudar para esse estado e true, se for
     * possível mudar
     */
    public boolean valida() {
        if (!super.getDemo().getListaAtribuicoes().getLista().isEmpty()) {
            return true;
        }
        return false;
    }

}
