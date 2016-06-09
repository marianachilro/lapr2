/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author marianachilro
 */
public class DemonstracaoConflitosDetetadosEstado implements DemonstracaoEstado{
    
    private Demonstracao demonstracao;
    
    public DemonstracaoConflitosDetetadosEstado(Demonstracao demonstracao){
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
        return true;
    }

    @Override
    public boolean setConflitosAtualizados() {
        if(valida()){
            this.demonstracao.setEstado(new DemonstracaoConflitosAtualizadosEstado(this.demonstracao));
            return true;
        }
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
