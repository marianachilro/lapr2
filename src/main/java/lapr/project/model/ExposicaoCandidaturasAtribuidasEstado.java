/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.Date;
import javax.xml.crypto.Data;

/**
 *
 * @author catarinarib
 */
public class ExposicaoCandidaturasAtribuidasEstado implements ExposicaoEstado {

    Exposicao m_e;

    public ExposicaoCandidaturasAtribuidasEstado(Exposicao e) {
        this.m_e = e;
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
    public boolean setExposicaoConfltiosAlterados() {
        return false;
    }

    @Override
    public boolean setExposicaoCandidaturasAtribuidas() {
        if (valida()) {
            m_e.setEstado(new ExposicaoCandidaturasAvaliadasEstado(m_e));
            return true;
        } else {
            return false;
        }
    }

    private boolean valida() {
//        Data date = new Data();

//        if (m_e.getDataFimAvCandidatura() == date.getDay() && m_e.getDataFimAvCandidatura().getMonth() == date.getMonth() && m_e.getDataFimAvCandidatura().getYear() == date.getYear()) {
//            return true;
//        }

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
    public boolean setDemonstracaoConfltiosAlterados() {
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

}