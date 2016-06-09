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
public class DemonstracaoCriadaEstado implements DemonstracaoEstado{
    
    private Demonstracao demonstracao;
    
    public DemonstracaoCriadaEstado(Demonstracao desmonstracao){
        this.demonstracao=demonstracao;
    }

    @Override
    public boolean setCriada() {
        return true;
    }

    @Override
    public boolean setConfirmada() {
        if(valida()){
            this.demonstracao.setEstado(new DemonstracaoConfirmadaEstado(demonstracao));
            return true;
        }
        return false;    
    }
    
    
    @Override
    public boolean setNaoConfirmada() {
        if(!valida()){
            this.demonstracao.setEstado(new DemonstracaoNaoConfirmadaEstado(demonstracao));
            return true;
        }
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
        return false;
    }

    @Override
    public boolean setCandidaturasDecididas() {
        return false;
    }
    
    public boolean valida(){
        
        if(this.demonstracao.getRealizacao())
            return true;
        return false;
    }

    
}
