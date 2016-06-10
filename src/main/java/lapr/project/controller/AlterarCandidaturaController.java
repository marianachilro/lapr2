/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.CandidaturaEstado;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.Keyword;
import lapr.project.model.ListaCandidaturasExposicoes;
import lapr.project.model.ListaDemonstracoes;
import lapr.project.model.ListaProdutos;
import lapr.project.model.Produto;
import lapr.project.model.RegistoExposicoes;

/**
 *
 * @author miniondevil
 */
public class AlterarCandidaturaController {

    private CentroExposicoes ce;
    private String email;
    private RegistoExposicoes re;
    private ListaCandidaturasExposicoes lc;
    private CandidaturaExposicao c;
    private CandidaturaExposicao cc;
    private ListaProdutos lp;
    private Keyword k;
    private Produto p;
    private ListaDemonstracoes rde;
    private Exposicao e;
    private ListaDemonstracoes lcd;
    private Demonstracao d;

    public AlterarCandidaturaController(CentroExposicoes ce, String email) {
        this.ce = ce;
        this.email = email;
    }

    public List<CandidaturaExposicao> getListaCandidaturasRep() {
        List<CandidaturaExposicao> lista = new ArrayList<CandidaturaExposicao>();
        RegistoExposicoes re = ce.getRegistoExposicoes();
        for (Exposicao e : re.getListaExposicoes()) {
            ListaCandidaturasExposicoes lc = e.getListaCandidaturas();
            lista.addAll(lc.getListaCandRepEstadoCriadoOuAlterado(email));
        }
        return lista;
    }

    public CandidaturaExposicao clonarCandidatura(CandidaturaExposicao c) {
        this.c = c;
        cc = new CandidaturaExposicao(c);
        return cc;
    }

    public void setDados(String nome, String morada, int telemovel, double area, int convites) {
        cc.setEmailRep(email);
        cc.setNomeEmpresa(nome);
        cc.setMorada(morada);
        cc.setTelemovel(telemovel);
        cc.setArea(area);
        cc.setConvites(convites);
        lp = cc.getListaProdutos();
    }

    public void criaProduto() {
        p = lp.novoProduto();
    }

    public void setProduto(String nome) {
        p.setNome(nome);
        lp.validaProduto(p);
    }

    public void addProduto() {
        lp.addProduto(p);
    }

    public List<Keyword> getListaKeyWords() {
        return cc.getListaKeywords().getListaKeywords();
    }

    public Keyword novaKeyWord(String keyWord) {
        k = cc.getListaKeywords().novaKeyword();
        return k;
    }

    public void registaKeyword() {
        cc.getListaKeywords().addKeyword(k);
    }

    public List<Demonstracao> getListaDemonstracoesExposicao() {
        rde = e.getListaDemonstracoes();
        return rde.getListaDemonstracao();
    }

    public void getListaDemonstracoesCandidatura() {
        lcd = cc.getListaDemonstracoes();
    }

    public void selectDemo(Demonstracao d) {
        this.d = d;

    }

    public void registaDemo() {
        lcd.registaDemonstracao(d);
    }

    public void alterarCandidatura() {
        lc.removeCandidatura(c);
        lc.registaCandidatura(cc);
        CandidaturaEstado st = cc.getEstado();
        st.setAlterada();

    }
}
