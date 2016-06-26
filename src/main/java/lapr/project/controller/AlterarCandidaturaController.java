/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

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

    private final CentroExposicoes ce;
    private final String email;
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

    public List<Exposicao> getListaExposicoes() {
        this.re = ce.getRegistoExposicoes();

        return re.getListaExposicoes();
    }

    public List<CandidaturaExposicao> getListaCandidaturasRep(Exposicao e) {
        this.e = e;
        lc = e.getListaCandidaturas();
        return lc.getListaCandRepEstadoCriadoOuAlterado(email);
    }

    public CandidaturaExposicao clonarCandidatura(CandidaturaExposicao c) {
        this.c = c;
        cc = lc.clonarCandidatura(c);
        cc.getListaProdutos().getListaProdutos().clear();
        lp = cc.getListaProdutos();
        return cc;
    }

    public String getNomeEmpresa() {
        return c.getNomeEmpresa();
    }

    public String getMorada() {
        return c.getMorada();
    }

    public String getTelemovel() {
        return Integer.toString(c.getTelemovel());
    }

    public String getArea() {
        return Double.toString(c.getArea());
    }

    public String getConvites() {
        return Integer.toString(c.getConvites());
    }

    public void setDados(String nome, String morada, int telemovel, double area, int convites) {
        cc.setEmailRep(email);
        cc.setNomeEmpresa(nome);
        cc.setMorada(morada);
        cc.setTelemovel(telemovel);
        cc.setArea(area);
        cc.setConvites(convites);
    }

    public void criaProduto() {
        p = lp.novoProduto();
    }

    public void setProduto(String nome) {
        p.setNome(nome);
        lp.validaProduto(p);
    }

    public boolean addProduto() {
        return lp.addProduto(p);
    }

    public List<Keyword> getListaKeyWords() {
        cc.getListaKeywords().getListaKeywords().clear();
        return cc.getListaKeywords().getListaKeywords();
    }

    public Keyword novaKeyWord(String keyWord) {
        k = cc.getListaKeywords().novaKeyword(keyWord);
        return k;
    }

    public boolean registaKeyword() {
        return cc.getListaKeywords().registaKeyword(k);
    }

    public List<Demonstracao> getListaDemonstracoesExposicao() {
        rde = e.getListaDemonstracoes();
        return rde.getListaDemonstracao();
    }

    public void getListaDemonstracoesCandidatura() {
        cc.getListaDemonstracoes().getListaDemonstracao().clear();
        lcd = cc.getListaDemonstracoes();
    }

    public void selectDemo(Demonstracao d) {
        this.d = d;

    }

    public boolean registaDemo() {
        return lcd.registaDemonstracao(d);
    }

    public boolean alterarCandidatura() {
        CandidaturaEstado st = cc.getEstado();
        return lc.removeCandidatura(c) && lc.registaCandidatura(cc) && st.setAlterada();

    }
}
