/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Representa um dos Estados possíveis da Demonstração (Estado de "Candidaturas
 * Atribuídas").
 *
 * @author marianachilro
 */
public class DemonstracaoCandidaturasAtribuidasEstado extends DemoImpEstado {

    /**
     * A demonstração.
     */
    /**
     * Contrutor do Estado de Candidaturas Atribuídas da Demonstração.
     *
     * @param demonstracao a demonstração que vai transitar de estado
     */
    public DemonstracaoCandidaturasAtribuidasEstado(Demonstracao demonstracao) {
        super(demonstracao,"demonstracaoCandidaturasAtribuidas");
    }

    /**
     * Método que indica que a Demonstração está no Estado "Candidaturas
     * Atribuídas".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setCandidaturasAtribuidas() {
        return true;
    }

    /**
     * Método que indica que muda o estado da Demonstração para o Estado
     * "Candidaturas Avaliadas".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setCandidaturasAvaliadas() {
        if (valida()) {
            super.getDemo().setEstado(new DemonstracaoCandidaturasAvaliadasEstado(super.getDemo()));
            return true;
        }
        return false;
    }

    /**
     * Verifica se a Demonstração pode mudar para o Estado "Candidaturas
     * Avaliadas".
     *
     * @return false, se não puder mudar para esse estado e true, se for
     * possível mudar
     */
    public boolean valida() {
        return super.getDemo().getEstado().setCandidaturasAtribuidas();
    }

}
