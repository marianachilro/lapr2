/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Representa um dos Estados possíveis da Demonstração (Estado de "Conflitos
 * Detetados").
 *
 * @author marianachilro
 */
public class DemonstracaoConflitosDetetadosEstado implements DemonstracaoEstado {

    /**
     * A demonstração.
     */
    private Demonstracao demonstracao;

    /**
     * Contrutor do Estado de "Conflitos Detetados" da Demonstração.
     *
     * @param demonstracao a demonstração que vai transitar de estado
     */
    public DemonstracaoConflitosDetetadosEstado(Demonstracao demonstracao) {
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
     * Método que indica que a Demonstração está no Estado "Conflitos
     * Detetados".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setConflitosDetetados() {
        return true;
    }

    /**
     * Método que muda o estado da Demonstração para o Estado "Conflitos
     * Atualizados".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setConflitosAtualizados() {
        if (valida()) {
            this.demonstracao.setEstado(new DemonstracaoConflitosAtualizadosEstado(this.demonstracao));
            return true;
        }
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
     * Verifica se a Demonstração pode mudar para o Estado "Candidaturas
     * Atualizados".
     *
     * @return false, se não puder mudar para esse estado e true, se for
     * possível mudar
     */
    public boolean valida() {
        int diaHoje = GregorianCalendar.DAY_OF_MONTH;
        int mesHoje = GregorianCalendar.MONTH;
        int anoHoje = GregorianCalendar.YEAR;
        Date dataHoje = new Date(anoHoje, mesHoje, diaHoje);
        if (dataHoje.compareTo(this.demonstracao.getDataFimAtualizacaoConflitos()) >= 0) {
            return true;
        }
        return false;
    }

}