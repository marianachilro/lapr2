/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.CandidaturaAlteradaEstado;
import lapr.project.model.CandidaturaAvaliadaEstado;
import lapr.project.model.CandidaturaEmSubmissaoEstado;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.Keyword;
import lapr.project.model.Produto;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author miniondevil
 */
public class AlterarCandidaturaControllerTest {

    /**
     * Testa se o métdo getListaCandidaturaRep apenas vai buscar as candidaturas
     * do representante que estejam no estado criada ou alterada.
     */
    @Test
    public void testGetListaCandidaturasRep() {
        CentroExposicoes ce = new CentroExposicoes();
        Exposicao e = new Exposicao();
        CandidaturaExposicao c = new CandidaturaExposicao("123", "aaa", "aaad", 911111111, 10, 30);
        c.setEstado(new CandidaturaAlteradaEstado(c));
        CandidaturaExposicao c1 = new CandidaturaExposicao("123", "aaa", "aaad", 911111111, 10, 30);
        c1.setEstado(new CandidaturaEmSubmissaoEstado(c1));
        CandidaturaExposicao c2 = new CandidaturaExposicao("1234", "aaa", "aaad", 911111111, 10, 30);
        c2.setEstado(new CandidaturaEmSubmissaoEstado(c2));
        CandidaturaExposicao c3 = new CandidaturaExposicao("123", "aaa", "aaad", 911111111, 10, 30);

        c3.setEstado(new CandidaturaAvaliadaEstado(c3));
        e.getListaCandidaturas().addCandidatura(c);
        e.getListaCandidaturas().addCandidatura(c1);
        e.getListaCandidaturas().addCandidatura(c2);
        e.getListaCandidaturas().addCandidatura(c3);
        ce.getRegistoExposicoes().addExposicao(e);
        AlterarCandidaturaController instance = new AlterarCandidaturaController(ce, "123");
        List<CandidaturaExposicao> expResult = new ArrayList<>();
        expResult.add(c);
        expResult.add(c1);
        List<CandidaturaExposicao> result = instance.getListaCandidaturasRep(e);
        assertEquals(expResult, result);
    }

    /**
     * Test of clonarCandidatura method, of class AlterarCandidaturaController.
     */
    @Test
    public void testClonarCandidatura() {
        CentroExposicoes ce = new CentroExposicoes();
        Exposicao e = new Exposicao();
        ce.getRegistoExposicoes().addExposicao(e);
        CandidaturaExposicao c = new CandidaturaExposicao("123", "aaa", "aaad", 911111111, 10, 30);
        e.getListaCandidaturas().addCandidatura(c);
        AlterarCandidaturaController instance = new AlterarCandidaturaController(ce, "123");
        instance.getListaCandidaturasRep(e);
        CandidaturaExposicao expResult = c;
        CandidaturaExposicao result = instance.clonarCandidatura(c);
        assertEquals(expResult, result);

    }

    /**
     * Test of getListaExposicoes method, of class AlterarCandidaturaController.
     */
    @Test
    public void testGetListaExposicoes() {
        System.out.println("getListaExposicoes");
        CentroExposicoes ce = new CentroExposicoes();
        Exposicao e = new Exposicao();
        ce.getRegistoExposicoes().addExposicao(e);
        AlterarCandidaturaController instance = new AlterarCandidaturaController(ce, "123");
        List<Exposicao> expResult = new ArrayList<>();
        expResult.add(e);
        List<Exposicao> result = instance.getListaExposicoes();
        assertEquals(expResult, result);

    }

    /**
     * Testa o método add set e cria produto
     */
    @Test
    public void testAddSetCriaProduto() {
        System.out.println("addProduto");
        CentroExposicoes ce = new CentroExposicoes();
        Exposicao e = new Exposicao();
        CandidaturaExposicao c = new CandidaturaExposicao("123", "asb", "321321 rua", 123432120, 430, 230);
        e.getListaCandidaturas().addCandidatura(c);
        ce.getRegistoExposicoes().addExposicao(e);
        AlterarCandidaturaController instance = new AlterarCandidaturaController(ce, "123");
instance.getListaCandidaturasRep(e);
        CandidaturaExposicao cc = instance.clonarCandidatura(c);
        instance.setDados("joao", "asd", 911111111, 0, 0);
        instance.criaProduto();
        instance.setProduto("produto");
        instance.addProduto();
        Produto expResult = new Produto("produto");
        Produto result = cc.getListaProdutos().getListaProdutos().get(0);
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaKeyWords method, of class AlterarCandidaturaController.
     */
    @Test
    public void testGetListaKeyWords() {
        System.out.println("getListaKeyWords");
        CentroExposicoes ce = new CentroExposicoes();
        Exposicao e = new Exposicao();
        CandidaturaExposicao c = new CandidaturaExposicao("123", "whisquers saquetas", "123 rua falsa", 555666770, 03, 20);
        c.getListaKeywords().addKeyword(new Keyword());
        e.getListaCandidaturas().addCandidatura(c);
        ce.getRegistoExposicoes().addExposicao(e);
        AlterarCandidaturaController instance = new AlterarCandidaturaController(ce, "123");
        instance.getListaCandidaturasRep(e);
        CandidaturaExposicao cc = instance.clonarCandidatura(c);
        instance.setDados("joao", "asd", 911111111, 0, 0);
        List<Keyword> expResult = new ArrayList<>();
        expResult.add(new Keyword());
        List<Keyword> result = instance.getListaKeyWords();
        assertEquals(expResult, result);

    }

    /**
     * Test of novaKeyWord method, of class AlterarCandidaturaController.
     */
    @Test
    public void testNovaKeyWord() {
        System.out.println("novaKeyWord");
        String keyWord = "asd";
        CentroExposicoes ce = new CentroExposicoes();
        Exposicao e = new Exposicao();
        CandidaturaExposicao c = new CandidaturaExposicao("123", "asd", "asd", 123456789, 230, 0);
        e.getListaCandidaturas().addCandidatura(c);
        ce.getRegistoExposicoes().addExposicao(e);
        AlterarCandidaturaController instance = new AlterarCandidaturaController(ce, "123");
        instance.getListaCandidaturasRep(e);
        instance.clonarCandidatura(c);
        Keyword expResult = new Keyword("asd");
        Keyword result = instance.novaKeyWord(keyWord);
        assertEquals(expResult, result);
    }

    /**
     * Test of registaKeyword method, of class AlterarCandidaturaController.
     */
    @Test
    public void testRegistaKeyword() {
        System.out.println("registaKeyword");
        String keyWord = "asd";
        CentroExposicoes ce = new CentroExposicoes();
        Exposicao e = new Exposicao();
        CandidaturaExposicao c = new CandidaturaExposicao("123", "huelele", "batatas", 333444660, 540, 420);
        e.getListaCandidaturas().addCandidatura(c);
        ce.getRegistoExposicoes().addExposicao(e);
        AlterarCandidaturaController instance = new AlterarCandidaturaController(ce, "123");
        instance.getListaCandidaturasRep(e);
        CandidaturaExposicao cc = instance.clonarCandidatura(c);
        Keyword expResult = instance.novaKeyWord(keyWord);
        instance.registaKeyword();
        Keyword result = cc.getListaKeywords().getListaKeywords().get(0);
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaDemonstracoesExposicao method, of class
     * AlterarCandidaturaController.
     */
    @Test
    public void testGetListaDemonstracoesExposicao() {
        System.out.println("getListaDemonstracoesExposicao");
        CentroExposicoes ce = new CentroExposicoes();
        Exposicao e = new Exposicao();
        ce.getRegistoExposicoes().addExposicao(e);
        AlterarCandidaturaController instance = new AlterarCandidaturaController(ce, "123");
        instance.getListaCandidaturasRep(e);
        List<Demonstracao> expResult = new ArrayList<>();
        List<Demonstracao> result = instance.getListaDemonstracoesExposicao();
        assertEquals(expResult, result);

    }

    /**
     * Testa os métodos geetListaDemonstracoesCandidatura, select demo e regista
     * demo.
     */
    @Test
    public void testGetSelectRegistaDemo() {
        System.out.println("registaDemo");
        CentroExposicoes ce = new CentroExposicoes();
        Exposicao e = new Exposicao();
        CandidaturaExposicao c = new CandidaturaExposicao("123", "asd", "asd", 123321120, 05, 04);
        e.getListaCandidaturas().addCandidatura(c);
        ce.getRegistoExposicoes().addExposicao(e);
        AlterarCandidaturaController instance = new AlterarCandidaturaController(ce, "123");
        instance.getListaCandidaturasRep(e);
        CandidaturaExposicao cc = instance.clonarCandidatura(c);
        Demonstracao d = new Demonstracao();
        instance.getListaDemonstracoesCandidatura();
        instance.selectDemo(d);
        boolean expResult =true;
        boolean result = instance.registaDemo();
        assertEquals(expResult, result);

    }

    /**
     * Test of alterarCandidatura method, of class AlterarCandidaturaController.
     */
    @Test
    public void testAlterarCandidatura() {
        System.out.println("alterarCandidatura");
        CentroExposicoes ce = new CentroExposicoes();
        Exposicao e = new Exposicao();
        CandidaturaExposicao c = new CandidaturaExposicao();
        e.getListaCandidaturas().addCandidatura(c);
        ce.getRegistoExposicoes().addExposicao(e);
        AlterarCandidaturaController instance = new AlterarCandidaturaController(ce, "123");
        instance.getListaCandidaturasRep(e);
        CandidaturaExposicao cc = instance.clonarCandidatura(c);
        instance.alterarCandidatura();
        List<CandidaturaExposicao> expResult = new ArrayList<>();
        expResult.add(cc);
        List<CandidaturaExposicao> result = e.getListaCandidaturas().getListCandidaturas();
        assertEquals(expResult, result);
    }
}
