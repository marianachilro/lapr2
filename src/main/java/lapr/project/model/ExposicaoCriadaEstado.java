/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * 
 * @author marianachilro
 */
public class ExposicaoCriadaEstado implements ExposicaoEstado{
    
    /**
     * A exposição.
     */
    private Exposicao exposicao;
    
    /**
     * Contrutor do Estado de "Criada" da Exposição.
     *
     * @param exposicao a demonstração que vai transitar de estado
     */
    public ExposicaoCriadaEstado(Exposicao exposicao){
        this.exposicao=exposicao;
    }
    
    
    @Override
    public boolean setCriada() {
        return true;
    }

    @Override
    public boolean setFaeSemDemo() {
        if(validaFAE()){
            this.exposicao.setEstado(new ExposicaoFAESemDemoEstado(this.exposicao));
            return true;
        }
        return false;
    }

    @Override
    public boolean setDemoSemFae() {
        if(validaDemos()){
           // this.exposicao.setEstado(new ExposicaoDemoSemFAEEstado(this.exposicao));
            return true;
        }
        return false;
    }

    @Override
    public boolean setCompleta() {
        return false;
    }

    @Override
    public boolean setExposicaoCandidaturasAbertas() {
        return false;
    }

    @Override
    public boolean setExposicaoCandidaturasFechadas() {
        return false;
    }

    @Override
    public boolean setExposicaoConflitosDetetados() {
        return false;
    }

    @Override
    public boolean setExposicaoConflitosAtualizados() {
        return false;
    }

    @Override
    public boolean setExposicaoCandidaturasAtribuidas() {
        return false;
    }

    @Override
    public boolean setExposicaoCandidaturasAvaliadas() {
        return false;
    }

    @Override
    public boolean setExposicaoCandidaturasDecididas() {
        return false;
    }

    @Override
    public boolean setConfirmacaoRealizacaoDemos() {
        return false;
    }

    @Override
    public boolean setDemonstracaoCandidaturasAbertas() {
        return false;
    }

    @Override
    public boolean setDemonstracaoCandidaturasFechadas() {
        return false;
    }

    @Override
    public boolean setDemonstracaoConflitosDetetados() {
        return false;
    }

    @Override
    public boolean setDemonstracaoConflitosAtualizados() {
        return false;
    }

    @Override
    public boolean setDemonstracaoCandidaturasAtribuidas() {
        return false;
    }

    @Override
    public boolean setDemonstracaoCandidaturasAvaliadas() {
        return false;
    }

    @Override
    public boolean setDemonstracaoCandidaturasDecididas() {
        return false;
    }

    @Override
    public boolean setStandsAtribuidos() {
        return false;
    }

    @Override
    public boolean setStandsConfirmado() {
        return false;
    }
    
    public boolean validaFAE(){
        if(!this.exposicao.getListaFAES().getListaFAEs().isEmpty()){
            return true;
        }
        return false;
    }
    
    public boolean validaDemos(){
        if(!this.exposicao.getListaDemonstracoes().getListaDemonstracao().isEmpty()){
            return true;
        }
        return false;
    }
}
