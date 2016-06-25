/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.Keyword;
import lapr.project.model.ListaCandidaturasExposicoes;
import lapr.project.model.ListaDemonstracoes;
import lapr.project.model.ListaKeywords;
import lapr.project.model.ListaProdutos;
import lapr.project.model.Local;
import lapr.project.model.Produto;
import lapr.project.model.Utilizador;
import lapr.project.utils.Data;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author catarinarib
 */
public class RegistarCandidaturaExposicaoControllerTest {

    /**
     * Test of getListaExposicoes method, of class
     * RegistarCandidaturaExposicaoController.
     */
    @Test
    public void testGetListaExposicoes() {
        System.out.println("getListaExposicoes");

        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u1 = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u1);
        RegistarCandidaturaExposicaoController instance = new RegistarCandidaturaExposicaoController(u1.getEmail(), ce);
        List<Exposicao> expResult = ce.getRegistoExposicoes().getListaExposicoes();
        List<Exposicao> result = instance.getListaExposicoes();
        assertEquals(expResult, result);

    }

    /**
     * Test of selectExposicao method, of class
     * RegistarCandidaturaExposicaoController.
     */
    @Test
    public void testSelectExposicao() {
        System.out.println("selectExposicao");
        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u1 = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u1);

        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao exp = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);

        RegistarCandidaturaExposicaoController instance = new RegistarCandidaturaExposicaoController(u1.getEmail(), ce);

        instance.selectExposicao(exp);

    }

    /**
     * Test of getListCandidaturas method, of class
     * RegistarCandidaturaExposicaoController.
     */
    @Test
    public void testGetListCandidaturas() {
        System.out.println("getListCandidaturas");
        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u1 = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u1);

        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao exp = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);

        RegistarCandidaturaExposicaoController instance = new RegistarCandidaturaExposicaoController(u1.getEmail(), ce);

        instance.selectExposicao(exp);

        List<CandidaturaExposicao> expResult = exp.getListaCandidaturas().getListCandidaturas();
        List<CandidaturaExposicao> result = instance.getListCandidaturas();
        assertEquals(expResult, result);

    }

    /**
     * Test of novaCandidatura method, of class
     * RegistarCandidaturaExposicaoController.
     */
    @Test
    public void testNovaCandidatura() {
        System.out.println("novaCandidatura");
        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u1 = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u1);

        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao exp = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);

        RegistarCandidaturaExposicaoController instance = new RegistarCandidaturaExposicaoController(u1.getEmail(), ce);

        instance.selectExposicao(exp);
        instance.getListCandidaturas();
        ListaCandidaturasExposicoes lc = exp.getListaCandidaturas();

        CandidaturaExposicao expResult = lc.novaCandidatura();
        CandidaturaExposicao result = instance.novaCandidatura();
        assertEquals(expResult, result);

    }

    /**
     * Test of setDados method, of class RegistarCandidaturaExposicaoController.
     */
    @Test
    public void testSetDados() {
        System.out.println("setDados");
        String emailRep = "a";
        String nomeEmpresa = "a";
        String morada = "a";
        int telemovel = 919999999;
        float area = 2.0F;
        int numConvites = 5;

        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u1 = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u1);

        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao exp = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);

        RegistarCandidaturaExposicaoController instance = new RegistarCandidaturaExposicaoController(u1.getEmail(), ce);

        instance.selectExposicao(exp);
        instance.getListCandidaturas();
        ListaCandidaturasExposicoes lc = exp.getListaCandidaturas();
        CandidaturaExposicao c = lc.novaCandidatura();
        instance.novaCandidatura();
        instance.setDados(emailRep, nomeEmpresa, morada, telemovel, area, numConvites);

    }

    /**
     * Test of getListaProdutos method, of class
     * RegistarCandidaturaExposicaoController.
     */
    @Test
    public void testGetListaProdutos() {
        System.out.println("getListaProdutos");
        String emailRep = "a";
        String nomeEmpresa = "a";
        String morada = "a";
        int telemovel = 919999999;
        float area = 2.0F;
        int numConvites = 5;

        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u1 = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u1);

        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao exp = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);

        RegistarCandidaturaExposicaoController instance = new RegistarCandidaturaExposicaoController(u1.getEmail(), ce);

        instance.selectExposicao(exp);
        instance.getListCandidaturas();
        ListaCandidaturasExposicoes lc = exp.getListaCandidaturas();
        CandidaturaExposicao c = lc.novaCandidatura();
        instance.novaCandidatura();
        instance.setDados(emailRep, nomeEmpresa, morada, telemovel, area, numConvites);

        instance.getListaProdutos();

    }

    /**
     * Test of novoProduto method, of class
     * RegistarCandidaturaExposicaoController.
     */
    @Test
    public void testNovoProduto() {
        System.out.println("novoProduto");
        String emailRep = "a";
        String nomeEmpresa = "a";
        String morada = "a";
        int telemovel = 919999999;
        float area = 2.0F;
        int numConvites = 5;

        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u1 = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u1);

        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao exp = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);

        RegistarCandidaturaExposicaoController instance = new RegistarCandidaturaExposicaoController(u1.getEmail(), ce);

        instance.selectExposicao(exp);
        instance.getListCandidaturas();
        ListaCandidaturasExposicoes lc = exp.getListaCandidaturas();
        CandidaturaExposicao c = lc.novaCandidatura();
        instance.novaCandidatura();
        instance.setDados(emailRep, nomeEmpresa, morada, telemovel, area, numConvites);

        instance.getListaProdutos();
        ListaProdutos lp = c.getListaProdutos();
        Produto expResult = lp.novoProduto();
        Produto result = instance.novoProduto();
        assertEquals(expResult, result);

    }

    /**
     * Test of setNome method, of class RegistarCandidaturaExposicaoController.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String produto = "";
        String emailRep = "a";
        String nomeEmpresa = "a";
        String morada = "a";
        int telemovel = 919999999;
        float area = 2.0F;
        int numConvites = 5;

        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u1 = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u1);

        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao exp = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);

        RegistarCandidaturaExposicaoController instance = new RegistarCandidaturaExposicaoController(u1.getEmail(), ce);

        instance.selectExposicao(exp);
        instance.getListCandidaturas();
        ListaCandidaturasExposicoes lc = exp.getListaCandidaturas();
        CandidaturaExposicao c = lc.novaCandidatura();
        instance.novaCandidatura();
        instance.setDados(emailRep, nomeEmpresa, morada, telemovel, area, numConvites);

        instance.getListaProdutos();
        ListaProdutos lp = c.getListaProdutos();
        lp.novoProduto();
        instance.novoProduto();

        instance.setNome(produto);

    }

    /**
     * Test of registaProduto method, of class
     * RegistarCandidaturaExposicaoController.
     */
    @Test
    public void testRegistaProduto() {
        System.out.println("registaProduto");
        String produto = "";
        String emailRep = "a";
        String nomeEmpresa = "a";
        String morada = "a";
        int telemovel = 919999999;
        float area = 2.0F;
        int numConvites = 5;

        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u1 = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u1);

        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao exp = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);

        RegistarCandidaturaExposicaoController instance = new RegistarCandidaturaExposicaoController(u1.getEmail(), ce);

        instance.selectExposicao(exp);
        instance.getListCandidaturas();
        ListaCandidaturasExposicoes lc = exp.getListaCandidaturas();
        CandidaturaExposicao c = lc.novaCandidatura();
        instance.novaCandidatura();
        instance.setDados(emailRep, nomeEmpresa, morada, telemovel, area, numConvites);

        instance.getListaProdutos();
        ListaProdutos lp = c.getListaProdutos();
        Produto p = lp.novoProduto();
        instance.novoProduto();

        instance.setNome(produto);
        p.setNome(produto);

        boolean expResult = lp.registaProduto(p);
        boolean result = instance.registaProduto();
        assertEquals(expResult, result);

    }

    /**
     * Test of getListaKeywords method, of class
     * RegistarCandidaturaExposicaoController.
     */
    @Test
    public void testGetListaKeywords() {
        System.out.println("getListaKeywords");

        String produto = "";
        String emailRep = "a";
        String nomeEmpresa = "a";
        String morada = "a";
        int telemovel = 919999999;
        float area = 2.0F;
        int numConvites = 5;

        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u1 = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u1);

        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao exp = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);

        RegistarCandidaturaExposicaoController instance = new RegistarCandidaturaExposicaoController(u1.getEmail(), ce);

        instance.selectExposicao(exp);
        instance.getListCandidaturas();
        ListaCandidaturasExposicoes lc = exp.getListaCandidaturas();
        CandidaturaExposicao c = lc.novaCandidatura();
        instance.novaCandidatura();
        instance.setDados(emailRep, nomeEmpresa, morada, telemovel, area, numConvites);
        instance.getListaKeywords();

    }

    /**
     * Test of novaKeyword method, of class
     * RegistarCandidaturaExposicaoController.
     */
    @Test
    public void testNovaKeyword() {
        System.out.println("novaKeyword");

        String keyword = "carros";

        String produto = "";
        String emailRep = "a";
        String nomeEmpresa = "a";
        String morada = "a";
        int telemovel = 919999999;
        float area = 2.0F;
        int numConvites = 5;

        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u1 = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u1);

        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao exp = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);

        RegistarCandidaturaExposicaoController instance = new RegistarCandidaturaExposicaoController(u1.getEmail(), ce);

        instance.selectExposicao(exp);
        instance.getListCandidaturas();
        ListaCandidaturasExposicoes lc = exp.getListaCandidaturas();
        CandidaturaExposicao c = lc.novaCandidatura();
        instance.novaCandidatura();
        instance.setDados(emailRep, nomeEmpresa, morada, telemovel, area, numConvites);
        instance.getListaKeywords();
        ListaKeywords lk = c.getListaKeywords();

        Keyword expResult = lk.novaKeyword(keyword);
        Keyword result = instance.novaKeyword(keyword);
        assertEquals(expResult, result);

    }

    /**
     * Test of registaKeyword method, of class
     * RegistarCandidaturaExposicaoController.
     */
    @Test
    public void testRegistaKeyword() {
        System.out.println("registaKeyword");
        String keyword = "carros";

        String produto = "";
        String emailRep = "a";
        String nomeEmpresa = "a";
        String morada = "a";
        int telemovel = 919999999;
        float area = 2.0F;
        int numConvites = 5;

        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u1 = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u1);

        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao exp = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);

        RegistarCandidaturaExposicaoController instance = new RegistarCandidaturaExposicaoController(u1.getEmail(), ce);

        instance.selectExposicao(exp);
        instance.getListCandidaturas();
        ListaCandidaturasExposicoes lc = exp.getListaCandidaturas();
        CandidaturaExposicao c = lc.novaCandidatura();
        instance.novaCandidatura();
        instance.setDados(emailRep, nomeEmpresa, morada, telemovel, area, numConvites);
        instance.getListaKeywords();
        ListaKeywords lk = c.getListaKeywords();

        Keyword k = lk.novaKeyword(keyword);
        instance.novaKeyword(keyword);

        boolean expResult = lk.registaKeyword(k);
        boolean result = instance.registaKeyword();
        assertEquals(expResult, result);

    }

    /**
     * Test of getListaDemonstracoesExposicao method, of class
     * RegistarCandidaturaExposicaoController.
     */
    @Test
    public void testGetListaDemonstracoesExposicao() {
        System.out.println("getListaDemonstracoesExposicao");
        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u1 = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u1);

        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao exp = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);

        RegistarCandidaturaExposicaoController instance = new RegistarCandidaturaExposicaoController(u1.getEmail(), ce);

        instance.selectExposicao(exp);

        List<Demonstracao> expResult = exp.getListaDemonstracoes().getListaDemonstracao();
        List<Demonstracao> result = instance.getListaDemonstracoesExposicao();
        assertEquals(expResult, result);

    }

    /**
     * Test of getListaDemonstracoesCandidatura method, of class
     * RegistarCandidaturaExposicaoController.
     */
    @Test
    public void testGetListaDemonstracoesCandidatura() {
        System.out.println("getListaDemonstracoesCandidatura");

        String produto = "";
        String emailRep = "a";
        String nomeEmpresa = "a";
        String morada = "a";
        int telemovel = 919999999;
        float area = 2.0F;
        int numConvites = 5;

        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u1 = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u1);

        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao exp = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);

        RegistarCandidaturaExposicaoController instance = new RegistarCandidaturaExposicaoController(u1.getEmail(), ce);

        instance.selectExposicao(exp);
        instance.getListCandidaturas();
        ListaCandidaturasExposicoes lc = exp.getListaCandidaturas();
        CandidaturaExposicao c = lc.novaCandidatura();
        instance.novaCandidatura();
        instance.setDados(emailRep, nomeEmpresa, morada, telemovel, area, numConvites);
        instance.getListaDemonstracoesCandidatura();

    }

    /**
     * Test of selectDemonstracao method, of class
     * RegistarCandidaturaExposicaoController.
     */
    @Test
    public void testSelectDemonstracao() {
        System.out.println("selectDemonstracao");
        String produto = "";
        String emailRep = "a";
        String nomeEmpresa = "a";
        String morada = "a";
        int telemovel = 919999999;
        float area = 2.0F;
        int numConvites = 5;

        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u1 = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u1);

        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao exp = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);

        RegistarCandidaturaExposicaoController instance = new RegistarCandidaturaExposicaoController(u1.getEmail(), ce);

        instance.selectExposicao(exp);
        instance.getListCandidaturas();
        ListaCandidaturasExposicoes lc = exp.getListaCandidaturas();
        CandidaturaExposicao c = lc.novaCandidatura();
        instance.novaCandidatura();
        instance.setDados(emailRep, nomeEmpresa, morada, telemovel, area, numConvites);
        instance.getListaDemonstracoesCandidatura();
        Demonstracao d = new Demonstracao();
        instance.selectDemonstracao(d);

    }

    /**
     * Test of registaDemonstracao method, of class
     * RegistarCandidaturaExposicaoController.
     */
    @Test
    public void testRegistaDemonstracao() {
        System.out.println("registaDemonstracao");
        String produto = "";
        String emailRep = "a";
        String nomeEmpresa = "a";
        String morada = "a";
        int telemovel = 919999999;
        float area = 2.0F;
        int numConvites = 5;

        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u1 = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u1);

        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao exp = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);

        RegistarCandidaturaExposicaoController instance = new RegistarCandidaturaExposicaoController(u1.getEmail(), ce);

        instance.selectExposicao(exp);
        instance.getListCandidaturas();
        ListaCandidaturasExposicoes lc = exp.getListaCandidaturas();
        CandidaturaExposicao c = lc.novaCandidatura();
        instance.novaCandidatura();
        instance.setDados(emailRep, nomeEmpresa, morada, telemovel, area, numConvites);
        instance.getListaDemonstracoesCandidatura();
        Demonstracao d = new Demonstracao();
        instance.selectDemonstracao(d);

        boolean expResult = c.getListaDemonstracoes().registaDemonstracao(d);
        boolean result = instance.registaDemonstracao();
        assertEquals(expResult, result);

    }

    /**
     * Test of registaCandidatura method, of class
     * RegistarCandidaturaExposicaoController.
     */
    @Test
    public void testRegistaCandidatura() {
        System.out.println("registaCandidatura");
        String produto = "";
        String emailRep = "a";
        String nomeEmpresa = "a";
        String morada = "a";
        int telemovel = 919999999;
        float area = 2.0F;
        int numConvites = 5;

        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u1 = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u1);

        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao exp = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);

        RegistarCandidaturaExposicaoController instance = new RegistarCandidaturaExposicaoController(u1.getEmail(), ce);

        instance.selectExposicao(exp);
        instance.getListCandidaturas();
        ListaCandidaturasExposicoes lc = exp.getListaCandidaturas();
        CandidaturaExposicao c = lc.novaCandidatura();
        instance.novaCandidatura();
        instance.setDados(emailRep, nomeEmpresa, morada, telemovel, area, numConvites);

        boolean expResult = exp.getListaCandidaturas().registaCandidatura(c);
        boolean result = instance.registaCandidatura();
        assertEquals(expResult, result);

    }

    /**
     * Test of transitaEstado method, of class
     * RegistarCandidaturaExposicaoController.
     */
    @Test
    public void testTransitaEstado() {
        System.out.println("transitaEstado");
        String produto = "";
        String emailRep = "a";
        String nomeEmpresa = "a";
        String morada = "a";
        int telemovel = 919999999;
        float area = 2.0F;
        int numConvites = 5;

        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u1 = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u1);

        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao exp = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);

        RegistarCandidaturaExposicaoController instance = new RegistarCandidaturaExposicaoController(u1.getEmail(), ce);

        instance.selectExposicao(exp);
        instance.getListCandidaturas();
        ListaCandidaturasExposicoes lc = exp.getListaCandidaturas();
        CandidaturaExposicao c = lc.novaCandidatura();
        instance.novaCandidatura();
        instance.setDados(emailRep, nomeEmpresa, morada, telemovel, area, numConvites);
        instance.transitaEstado();

    }

}
