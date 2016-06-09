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
public class DemonstracaoCandidaturasAtribuidasEstado implements DemonstracaoEstado{
    
    private Demonstracao demonstracao;
    
    public DemonstracaoCandidaturasAtribuidasEstado(Demonstracao demonstracao){
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
        return true;
    }

    @Override
    public boolean setCandidaturasAvaliadas() {
        if(valida()){
            this.demonstracao.setEstado(new DemonstracaoCandidaturasAvaliadasEstado(this.demonstracao));
            return true;
        }
        return false;
    }

    @Override
    public boolean setCandidaturasDecididas() {
        return false;
    }
    
    public boolean valida(){
        return true;
    }
    
}
