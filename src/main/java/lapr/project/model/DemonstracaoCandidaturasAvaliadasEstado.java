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
public class DemonstracaoCandidaturasAvaliadasEstado implements DemonstracaoEstado{
    
    private Demonstracao demonstracao;
    
    public DemonstracaoCandidaturasAvaliadasEstado(Demonstracao demonstracao){
        this.demonstracao=demonstracao;
    }

    @Override
    public boolean setCriada() {
        return false;
    }

    @Override
    public boolean setConfirmada() {
        return false;
    }

    @Override
    public boolean setNaoConfirmada() {
        return false;
    }

    @Override
    public boolean setCandidaturasAbertas() {
        return false;
    }

    @Override
    public boolean setCandidaturasFechadas() {
        return false;
    }

    @Override
    public boolean setConflitosDetetados() {
        return false;
    }

    @Override
    public boolean setConflitosAtualizados() {
        return false;
    }

    @Override
    public boolean setCandidaturasAtribuidas() {
        return false;
    }

    @Override
    public boolean setCandidaturasAvaliadas() {
        return true;
    }

    @Override
    public boolean setCandidaturasDecididas() {
        if(valida()){
            this.demonstracao.setEstado(new DemonstracaoCandidaturasDecididasEstado(this.demonstracao));
            return true;
        }
        return false;
    }
    
    /**
     * Verifica se todas as Candidaturas à Demonstração estão decididas.
     * @return true se todas as candidaturas estiverem decididas e false se, pelo menos uma, não tiver sido decidida
     */
    public boolean valida(){
        boolean retorno = true;
        for(CandidaturaDemonstracao c : this.demonstracao.getListaCandidaturas().getListCandidaturas()){
            if(c.getDecisao() == null)
                retorno = false;
        }
        return retorno;
    }
    
}
