/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.CandidaturaDemonstracao;
import lapr.project.model.CandidaturaEstado;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaCandidaturasDemonstracoes;
import lapr.project.model.ListaCandidaturasExposicoes;
import lapr.project.model.ListaDemonstracoes;
import lapr.project.model.RegistoExposicoes;

/**
 *
 * @author Rita
 */
public class RegistarCandidaturaDemonstracaoController {

    private final String email;
    private final CentroExposicoes ce;
    private Exposicao e;
    private Demonstracao d;
    private CandidaturaExposicao c;
    private CandidaturaDemonstracao cd;
    private RegistoExposicoes re;
    private ListaCandidaturasExposicoes rce;
    private ListaDemonstracoes rd;
    private ListaCandidaturasDemonstracoes rcd;

    public RegistarCandidaturaDemonstracaoController(String email, CentroExposicoes ce) {
        this.ce = ce;
        this.email = email;
    }

    public List<Exposicao> getListaExposicoes() {
        re = ce.getRegistoExposicoes();
        return re.getListaExposicoes();
    }

    public void selectExposicoes(Exposicao e) {
        this.e = e;
    }

    public List<CandidaturaExposicao> getListaCandidaturasRep() {
        rce = e.getListaCandidaturas();
        return rce.getListaCandidaturasRep(email);
    }

    public void selectCandidatura(CandidaturaExposicao c) {
        this.c = c;
    }

    public List<Demonstracao> getListDemonstracao() {
        rd = e.getListaDemonstracoes();
        return rd.getListaDemonstracoesDisponiveis();
    }

    public void selectDemonstracao(Demonstracao d) {
        this.d = d;
    }

    public CandidaturaDemonstracao novaCandidaturaDemonstracao() {
        rcd = d.getListaCandidaturas();
        cd = rcd.novaCandidatura();
        cd.setEmailRep(email);
        return cd;
    }

    public void registarCandidatura() {
        rcd.registaCandidatura(cd);
    }

    public boolean transitaEstado() {
        CandidaturaEstado st = cd.getEstado();
        return st.setCriada();
    }
}
