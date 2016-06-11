/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Representa um dos Estados possíveis da Demonstração (Estado de "Não
 * Confirmada").
 *
 * @author marianachilro
 */
public class DemonstracaoNaoConfirmadaEstado implements DemonstracaoEstado {

    /**
     * A demonstração.
     */
    private final Demonstracao demonstracao;

    /**
     * Contrutor do Estado de "Não Confirmada" da Demonstração.
     *
     * @param demonstracao a demonstração que vai transitar de estado
     */
    public DemonstracaoNaoConfirmadaEstado(Demonstracao demonstracao) {
        this.demonstracao = demonstracao;
    }

    /**
     * Método que indica que a Demonstração não pode mudar para o Estado
     * "Criada".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setCriada() {
        return false;
    }

    /**
     * Método que indica que a Demonstração não pode mudar para o Estado
     * "Confirmada".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setConfirmada() {
        return false;
    }

    /**
     * Método que indica que a Demonstração está no Estado "Não Confirmada".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setNaoConfirmada() {
        return true;
    }

    /**
     * Método que indica que a Demonstração não pode mudar para o Estado
     * "Candidaturas Abertas".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setCandidaturasAbertas() {
        return false;
    }

    /**
     * Método que indica que a Demonstração não pode mudar para o Estado
     * "Candidaturas Fechadas".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setCandidaturasFechadas() {
        return false;
    }

    /**
     * Método que indica que a Demonstração não pode mudar para o Estado
     * "Conflitos Detetados".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setConflitosDetetados() {
        return false;
    }

    /**
     * Método que indica que a Demonstração não pode mudar para o Estado
     * "Conflitos Atualizados".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setConflitosAtualizados() {
        return false;
    }

    /**
     * Método que indica que a Demonstração não pode mudar para o Estado
     * "Candidaturas Atribuídas".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setCandidaturasAtribuidas() {
        return false;
    }

    /**
     * Método que indica que a Demonstração não pode mudar para o Estado
     * "Candidaturas Avaliadas".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setCandidaturasAvaliadas() {
        return false;
    }

    /**
     * Método que indica que a Demonstração não pode mudar para o Estado
     * "Candidaturas Decididas".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setCandidaturasDecididas() {
        return false;
    }

}
