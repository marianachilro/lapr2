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
public class DemonstracaoCandidaturasFechadasEstado implements DemonstracaoEstado {

    /**
     * A demonstração.
     */
    private final Demonstracao demonstracao;

    /**
     * Contrutor do Estado de Candidaturas Fechadas da Demonstração.
     *
     * @param demonstracao a demonstração que vai transitar de estado
     */
    public DemonstracaoCandidaturasFechadasEstado(Demonstracao demonstracao) {
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
            this.demonstracao.setEstado(new DemonstracaoConflitosDetetadosEstado(this.demonstracao));
            return true;
        }
        return false;
    }

    /**
     * Método que indica que a Demonstração está no Estado "Conflitos
     * Atualizados".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setConflitosAtualizados() {
        return false;
    }

    /**
     * Método que indica que a Demonstração está no Estado "Candidaturas
     * Atribuídos".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setCandidaturasAtribuidas() {
        return false;
    }

    /**
     * Método que indica que a Demonstração está no Estado "Candidaturas
     * Avaliadas".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setCandidaturasAvaliadas() {
        return false;
    }

    /**
     * Método que indica que a Demonstração está no Estado "Candidaturas
     * Decididas".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setCandidaturasDecididas() {
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
        //introduzia validações
        return true;
    }
}
