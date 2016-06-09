/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author catarinarib
 */
class ExposicaoCandidaturasExpoAvaliadasEstado implements ExposicaoEstado {

    
    Exposicao m_e;
    
    public ExposicaoCandidaturasExpoAvaliadasEstado(Exposicao m_e) {
        this.m_e=m_e;
    }
    

    @Override
    public boolean setCriada() {
        return false;
    }

    @Override
    public boolean setFaeSemDemo() {
        return false;
    }

    @Override
    public boolean setDemoSemFae() {
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
       if(valida()){
            m_e.setEstado(new ExposicaoDemonstracoesConfirmadasEstado(m_e));
            return true;
       }else{
           return false;
       }
    }

    public boolean valida(){
        if(!m_e.getListaCandidaturas().getListCandidaturas().isEmpty()){
            for(Candidatura c : m_e.getListaCandidaturas().getListCandidaturas()){
                if(c.getDecisao()==null){
                    return false;
                }
            }
        }
        return true;
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
    public boolean setStandsConfirmados() {
        return false;
    }
    
}
