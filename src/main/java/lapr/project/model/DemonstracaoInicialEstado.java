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
public class DemonstracaoInicialEstado implements DemonstracaoEstado {

    /**
     * A demonstração.
     */
    private final Demonstracao demonstracao;

    /**
     * Contrutor do Estado de "Inicial" da Demonstração.
     *
     * @param demonstracao a demonstração que vai transitar de estado
     */
    public DemonstracaoInicialEstado(Demonstracao demonstracao) {
        this.demonstracao = demonstracao;
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
            demonstracao.setEstado(new DemonstracaoCriadaEstado(demonstracao));
            return true;
        }
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
     * Método que indica que a Demonstração não pode mudar para o Estado "Não
     * Confirmada".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setNaoConfirmada() {
        return false;
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

    /**
     * Verifica se a Demonstração pode mudar para o Estado "Criada".
     *
     * @return false, se não puder mudar para esse estado e true, se for
     * possível mudar
     */
    public boolean valida() {
        if (demonstracao.valida()) {
            return true;
        }
        return false;
    }

}
