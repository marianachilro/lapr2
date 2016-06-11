/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Representa um dos Estados possíveis da Exposicao (Estado de "Criada").
 * @author marianachilro
 */
public class ExposicaoCriadaEstado implements ExposicaoEstado{
    
    /**
     * A exposição.
     */
    private final Exposicao exposicao;
    
    /**
     * Contrutor do Estado de "Criada" da Exposição.
     *
     * @param exposicao a demonstração que vai transitar de estado
     */
    public ExposicaoCriadaEstado(Exposicao exposicao){
        this.exposicao=exposicao;
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
     * Método que muda o estado da Exposição para o Estado "FAE Sem Demo".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setFaeSemDemo() {
        if(validaFAE()){
            this.exposicao.setEstado(new ExposicaoFAESemDemoEstado(this.exposicao));
            return true;
        }
        return false;
    }

    /**
     * Método que muda o estado da Exposição para o Estado "Demo Sem FAE".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setDemoSemFae() {
        if(validaDemos()){
            this.exposicao.setEstado(new ExposicaoDemoSemFAEEstado(this.exposicao));
            return true;
        }
        return false;
    }

    /**
     * Método que indica que a Exposição não pode mudar para o Estado "Completa".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setCompleta() {
        return false;
    }

    /**
     * Método que indica que a Exposição não pode mudar para o Estado "Candidaturas Abertas Expo".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setExposicaoCandidaturasAbertas() {
        return false;
    }

    /**
     * Método que indica que a Exposição não pode mudar para o Estado "Candidaturas Fechadas Expo".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setExposicaoCandidaturasFechadas() {
        return false;
    }

    /**
     * Método que indica que a Exposição não pode mudar para o Estado "Conflitos Detetados Expo".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setExposicaoConflitosDetetados() {
        return false;
    }

    /**
     * Método que indica que a Exposição não pode mudar para o Estado "Conflitos Atualizados Expo".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setExposicaoConflitosAtualizados() {
        return false;
    }

    /**
     * Método que indica que a Exposição não pode mudar para o Estado "Candidaturas Atribuídas Expo".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setExposicaoCandidaturasAtribuidas() {
        return false;
    }

    /**
     * Método que indica que a Exposição não pode mudar para o Estado "Candidaturas Avaliadas Expo".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setExposicaoCandidaturasAvaliadas() {
        return false;
    }

    /**
     * Método que indica que a Exposição não pode mudar para o Estado "Candidaturas Decididas Expo".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setExposicaoCandidaturasDecididas() {
        return false;
    }

    /**
     * Método que indica que a Exposição não pode mudar para o Estado "Demos Confirmadas".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setConfirmacaoRealizacaoDemos() {
        return false;
    }

    /**
     * Método que indica que a Exposição não pode mudar para o Estado "Candidaturas Abertas Demos".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setDemonstracaoCandidaturasAbertas() {
        return false;
    }

    /**
     * Método que indica que a Exposição não pode mudar para o Estado "Candidaturas Fechadas Demos".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setDemonstracaoCandidaturasFechadas() {
        return false;
    }

    /**
     * Método que indica que a Exposição não pode mudar para o Estado "Conflitos Detetados Demos".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setDemonstracaoConflitosDetetados() {
        return false;
    }

    /**
     * Método que indica que a Exposição não pode mudar para o Estado "Conflitos Atualizados Demos".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setDemonstracaoConflitosAtualizados() {
        return false;
    }

    /**
     * Método que indica que a Exposição não pode mudar para o Estado "Candidaturas Atribuídas Demos".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setDemonstracaoCandidaturasAtribuidas() {
        return false;
    }

    /**
     * Método que indica que a Exposição não pode mudar para o Estado "Candidaturas Avaliadas Demos".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setDemonstracaoCandidaturasAvaliadas() {
        return false;
    }

    /**
     * Método que indica que a Exposição não pode mudar para o Estado "Candidaturas Decididas Demos".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setDemonstracaoCandidaturasDecididas() {
        return false;
    }

    /**
     * Método que indica que a Exposição não pode mudar para o Estado "Stands Atribuídos".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setStandsAtribuidos() {
        return false;
    }

    /**
     * Método que indica que a Exposição não pode mudar para o Estado "Stands Confirmados".
     *
     * @return false, porque não pode mudar para este estado
     */
    @Override
    public boolean setStandsConfirmados() {
        return false;
    }
    
    /**
     * Verifica se a Exposição pode mudar para o Estado "FAE Sem Demo".
     *
     * @return false, se não puder mudar para esse estado e true, se for
     * possível mudar
     */
    public boolean validaFAE(){
        return !this.exposicao.getListaFAES().getListaFAEs().isEmpty();
    }
    
    /**
     * Verifica se a Exposição pode mudar para o Estado "Demo Sem FAE".
     *
     * @return false, se não puder mudar para esse estado e true, se for
     * possível mudar
     */
    public boolean validaDemos(){
        return !this.exposicao.getListaDemonstracoes().getListaDemonstracao().isEmpty();
    }
}
