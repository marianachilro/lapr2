/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author marianachilro
 */
public class DemonstracaoConfirmadaEstado implements DemonstracaoEstado {

    private Demonstracao demonstracao;

    public DemonstracaoConfirmadaEstado(Demonstracao demonstracao) {
        this.demonstracao = demonstracao;
    }

    @Override
    public boolean setCriada() {
        return false;
    }

    @Override
    public boolean setConfirmada() {
        return true;
    }

    @Override
    public boolean setNaoConfirmada() {
        return false;
    }

    @Override
    public boolean setCandidaturasAbertas() {
        if (valida()) {
            this.demonstracao.setEstado(new DemonstracaoCandidaturasAbertasEstado(this.demonstracao));
            return true;
        }
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

    public boolean valida() {
        int diaHoje = GregorianCalendar.DAY_OF_MONTH;
        int mesHoje = GregorianCalendar.MONTH;
        int anoHoje = GregorianCalendar.YEAR;
        Date dataHoje = new Date(anoHoje, mesHoje, diaHoje);
        if (dataHoje.compareTo(this.demonstracao.getDataInicioSubmissaoCandidaturas()) >= 0) {
            return true;
        }
        return false;
    }

}
