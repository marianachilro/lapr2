/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.CandImpEstado;
import lapr.project.model.CandidaturaEstado;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.ExpoImpEstado;
import lapr.project.model.Exposicao;
import lapr.project.model.Keyword;
import lapr.project.model.ListaCandidaturasExposicoes;
import lapr.project.model.ListaDemonstracoes;
import lapr.project.model.ListaKeywords;
import lapr.project.model.ListaProdutos;
import lapr.project.model.Produto;
import lapr.project.model.RegistoExposicoes;

/**
 *
 * @author Rita
 */
public class RegistarCandidaturaExposicaoController {

    private final String emailRep;
    private CandImpEstado as;
    private final CentroExposicoes ce;
    private Exposicao e;
    private CandidaturaExposicao c;
    private Produto p;
    private Keyword k;
    private Demonstracao d;
    private RegistoExposicoes re;
    private ListaCandidaturasExposicoes rc;
    private ListaProdutos lp;
    private ListaKeywords lk;
    private ListaDemonstracoes rde, ldc;

    public RegistarCandidaturaExposicaoController(String emailRep, CentroExposicoes ce) {
        this.ce = ce;
        this.emailRep = emailRep;
    }

    public List<Exposicao> getListaExposicoes() {
        re = ce.getRegistoExposicoes();
        return re.getListaExposicoes();
    }

    public void selectExposicao(Exposicao e) {
        this.e = e;
    }

    public List<CandidaturaExposicao> getListCandidaturas() {
        rc = e.getListaCandidaturas();
        return rc.getListCandidaturas();
    }

    public CandidaturaExposicao novaCandidatura() {
        c = rc.novaCandidatura();
        return c;
    }

    public void setDados(String emailRep, String nomeEmpresa, String morada, int telemovel, float area, int numConvites) {
        c.setEmailRep(emailRep);
        c.setNomeEmpresa(nomeEmpresa);
        c.setMorada(morada);
        c.setTelemovel(telemovel);
        c.setArea(area);
        c.setConvites(numConvites);
    }

    public void getListaProdutos() {
        lp = c.getListaProdutos();
    }

    public Produto novoProduto() {
        p = lp.novoProduto();
        return p;
    }

    public void setNome(String produto) {
        p.setNome(produto);
    }

    public boolean registaProduto() {
        return lp.registaProduto(p);
    }

    public void getListaKeywords() {
        lk = c.getListaKeywords();
    }

    public Keyword novaKeyword(String keyword) {
        k = lk.novaKeyword(keyword);
        return k;
    }

    public boolean registaKeyword() {
        return lk.registaKeyword(k);
    }

    public List<Demonstracao> getListaDemonstracoesExposicao() {
        rde = e.getListaDemonstracoes();
        return rde.getListaDemonstracao();
    }

    public void getListaDemonstracoesCandidatura() {
        ldc = c.getListaDemonstracoes();
    }

    public void selectDemonstracao(Demonstracao d) {
        this.d = d;
        d.setNumeroInteressados(d.getNumeroInteressados() + 1);
    }

    public boolean registaDemonstracao() {
        return ldc.registaDemonstracao(d);
    }

    public boolean registaCandidatura() {
        return rc.registaCandidatura(c);
    }

    public void transitaEstado() {
        as = c.getEstado();
        as.setEmSubmissao();
    }
    
    public boolean checkEstado() {
        ExpoImpEstado es = e.getEstado();
        if(es.setExposicaoCandidaturasAbertas() && !es.setCompleta()) {
            return true;
        } else { 
            return false;
        }
    }

}
