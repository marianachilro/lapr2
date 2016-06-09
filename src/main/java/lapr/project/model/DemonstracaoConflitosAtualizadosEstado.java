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
public class DemonstracaoConflitosAtualizadosEstado implements DemonstracaoEstado{
    
    private Demonstracao demonstracao;
    
    public DemonstracaoConflitosAtualizadosEstado(Demonstracao demonstracao){
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
        return true;
    }

    @Override
    public boolean setCandidaturasAtribuidas() {
        if(valida()){
            this.demonstracao.setEstado(new DemonstracaoCandidaturasAtribuidasEstado(this.demonstracao));
            return true;
        }
        return false;
    }

    @Override
    public boolean setCandidaturasAvaliadas() {
        return false;
    }

    @Override
    public boolean setCandidaturasDecididas() {
        return false;
    }
    
    public boolean valida(){
        if(!this.demonstracao.getListaAtribuicoes().getLista().isEmpty())
            return true;
        return false;
    }
    
}
