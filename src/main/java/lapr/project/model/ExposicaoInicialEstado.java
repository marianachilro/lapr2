package lapr.project.model;

import lapr.project.model.Exposicao;
import lapr.project.model.ExposicaoEstado;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Representa um dos Estados possíveis da Exposicao (Estado de "Inicial").
 *
 * @author marianachilro
 */
public class ExposicaoInicialEstado implements ExposicaoEstado {

    /**
     * A exposição.
     */
    private Exposicao exposicao;

    /**
     * Contrutor do Estado de "Inicial" da Exposição.
     *
     * @param exposicao a demonstração que vai transitar de estado
     */
    public ExposicaoInicialEstado(Exposicao exposicao) {
        this.exposicao = exposicao;
    }

    /**
     * Método que muda o estado da Exposição para o Estado "Criada".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setCriada() {
        if (valida()) {
            this.exposicao.setEstado(new ExposicaoCriadaEstado(this.exposicao));
            return true;
        }
        return false;
    }

    /**
     * Método que indica que a Exposição não pode mudar para o Estado "FAE Sem
     * Demo".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setFaeSemDemo() {
        return false;
    }

    /**
     * Método que indica que a Exposição não pode mudar para o Estado "Demo Sem
     * FAE".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setDemoSemFae() {
        return false;
    }

    /**
     * Método que indica que a Exposição não pode mudar para o Estado
     * "Completa".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setCompleta() {
        return false;
    }

    /**
     * Método que indica que a Exposição não pode mudar para o Estado
     * "Candidaturas Expo Abertas".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setExposicaoCandidaturasAbertas() {
        return false;
    }

    /**
     * Método que indica que a Exposição não pode mudar para o Estado
     * "Candidaturas Expo Fechadas".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setExposicaoCandidaturasFechadas() {
        return false;
    }

    /**
     * Método que indica que a Exposição não pode mudar para o Estado "Conflitos
     * Detetados Expo".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setExposicaoConflitosDetetados() {
        return false;
    }

    /**
     * Método que indica que a Exposição não pode mudar para o Estado "Conflitos
     * Atualizados Expo".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setExposicaoConflitosAtualizados() {
        return false;
    }

    /**
     * Método que indica que a Exposição não pode mudar para o Estado
     * "Candidaturas Expo Atribuídas".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setExposicaoCandidaturasAtribuidas() {
        return false;
    }

    /**
     * Método que indica que a Exposição não pode mudar para o Estado
     * "Candidaturas Expo Avaliadas".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setExposicaoCandidaturasAvaliadas() {
        return false;
    }

    /**
     * Método que indica que a Exposição não pode mudar para o Estado
     * "Candidaturas Expo Decididas".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setExposicaoCandidaturasDecididas() {
        return false;
    }

    /**
     * Método que indica que a Exposição não pode mudar para o Estado
     * "Demonstrações Confirmadas".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setConfirmacaoRealizacaoDemos() {
        return false;
    }

    /**
     * Método que indica que a Exposição não pode mudar para o Estado
     * "Candidaturas Demos Abertas".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setDemonstracaoCandidaturasAbertas() {
        return false;
    }

    /**
     * Método que indica que a Exposição não pode mudar para o Estado
     * "Candidaturas Demos Fechadas".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setDemonstracaoCandidaturasFechadas() {
        return false;
    }

    /**
     * Método que indica que a Exposição não pode mudar para o Estado "Conflitos
     * Detetados Demos".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setDemonstracaoConflitosDetetados() {
        return false;
    }

    /**
     * Método que indica que a Exposição não pode mudar para o Estado "Conflitos
     * Atualizados Demos".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setDemonstracaoConflitosAtualizados() {
        return false;
    }

    /**
     * Método que indica que a Exposição não pode mudar para o Estado
     * "Candidaturas Demos Atribuídas".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setDemonstracaoCandidaturasAtribuidas() {
        return false;
    }

    /**
     * Método que indica que a Exposição não pode mudar para o Estado
     * "Candidaturas Demos Avaliadas".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setDemonstracaoCandidaturasAvaliadas() {
        return false;
    }

    /**
     * Método que indica que a Exposição não pode mudar para o Estado
     * "Candidaturas Demos Decididas".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setDemonstracaoCandidaturasDecididas() {
        return false;
    }

    /**
     * Método que indica que a Exposição não pode mudar para o Estado "Stands
     * Atribuídos".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setStandsAtribuidos() {
        return false;
    }

    /**
     * Método que indica que a Exposição não pode mudar para o Estado "Stands
     * Confirmados".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setStandsConfirmado() {
        return false;
    }

    /**
     * Verifica se a Exposição pode mudar para o Estado "Criada".
     *
     * @return false, se não puder mudar para esse estado e true, se for
     * possível mudar
     */
    public boolean valida() {
        return this.exposicao.valida();
    }

}
