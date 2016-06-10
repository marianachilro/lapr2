/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Representa um dos Estados possíveis da Demonstração (Estado de "Candidaturas
 * Avaliadas").
 *
 * @author marianachilro
 */
public class DemonstracaoCandidaturasAvaliadasEstado implements DemonstracaoEstado {

    /**
     * A demonstração.
     */
    private Demonstracao demonstracao;

    /**
     * Contrutor do Estado de Candidaturas Avaliadas da Demonstração.
     *
     * @param demonstracao a demonstração que vai transitar de estado
     */
    public DemonstracaoCandidaturasAvaliadasEstado(Demonstracao demonstracao) {
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
     * Método que indica que a Demonstração não pode mudar para o Estado
     * "Confirmada".
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
     * Método que indica que a Demonstração está no Estado "Candidaturas
     * Avaliadas".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setCandidaturasAvaliadas() {
        return true;
    }

    /**
     * Método que muda o estado da Demonstração para o Estado "Candidaturas
     * Decididas".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setCandidaturasDecididas() {
        if (valida()) {
            this.demonstracao.setEstado(new DemonstracaoCandidaturasDecididasEstado(this.demonstracao));
            return true;
        }
        return false;
    }

    /**
     * Verifica se todas as Candidaturas à Demonstração estão decididas.
     *
     * @return true se todas as candidaturas estiverem decididas e false se,
     * pelo menos uma, não tiver sido decidida
     */
    public boolean valida() {
        boolean retorno = true;
        for (CandidaturaDemonstracao c : this.demonstracao.getListaCandidaturas().getListCandidaturas()) {
            if (c.getDecisao() == null) {
                retorno = false;
            }
        }
        return retorno;
    }

}
