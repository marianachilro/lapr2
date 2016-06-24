/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Atribuicao;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CandidaturaGeral;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.FAE;
import lapr.project.model.Local;
import lapr.project.model.Utilizador;
import lapr.project.utils.Data;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author catarinarib
 */
public class AvaliarCandidaturaControllerTest {

    /**
     * Test of getListaExposicoesFAE method, of class
     * AvaliarCandidaturaController.
     */
    @Test
    public void testGetListaExposicoesFAE() {
        System.out.println("getListaExposicoesFAE");
        Utilizador u = new Utilizador(3, "carol", "xxx", "xxx@centro.pt", "aA;2", "ddddd");
        FAE fae = new FAE(u);
        CentroExposicoes ce = new CentroExposicoes();
        AvaliarCandidaturaController instance = new AvaliarCandidaturaController(ce, fae);
        List<Exposicao> expResult = new ArrayList<>();
        List<Exposicao> result = instance.getListaExposicoesFAE(u);
        assertEquals(expResult, result);

    }

    /**
     * Test of selecionaExposicao method, of class AvaliarCandidaturaController.
     */
    @Test
    public void testSelecionaExposicao() {
        System.out.println("selecionaExposicao");

        Utilizador u = new Utilizador(3, "carol", "xxx", "xxx@centro.pt", "aA;2", "ddddd");
        FAE fae = new FAE(u);
        CentroExposicoes ce = new CentroExposicoes();
        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao e = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);

        AvaliarCandidaturaController instance = new AvaliarCandidaturaController(ce, fae);
        instance.selecionaExposicao(e);

    }

    /**
     * Test of getAvaliaveis method, of class AvaliarCandidaturaController.
     */
    @Test
    public void testGetAvaliaveis() {
        System.out.println("getAvaliaveis");
        Utilizador u = new Utilizador(3, "carol", "xxx", "xxx@centro.pt", "aA;2", "ddddd");
        FAE fae = new FAE(u);
        CentroExposicoes ce = new CentroExposicoes();
        AvaliarCandidaturaController instance = new AvaliarCandidaturaController(ce, fae);
        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao e = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);
        instance.selecionaExposicao(e);
        List<CandidaturaGeral> expResult = new ArrayList<>();
        List<CandidaturaGeral> result = instance.getAvaliaveis(fae);
        assertEquals(expResult, result);

    }

    /**
     * Test of selectCandidatura method, of class AvaliarCandidaturaController.
     */
    @Test
    public void testSelectCandidatura() {
        System.out.println("selectCandidatura");

        CandidaturaExposicao c = new CandidaturaExposicao("rep@centro.pt", "nome empresa", "morada", 919999999, 23, 5);

        Utilizador u = new Utilizador(3, "carol", "xxx", "xxx@centro.pt", "aA;2", "ddddd");
        FAE fae = new FAE(u);
        CentroExposicoes ce = new CentroExposicoes();
        AvaliarCandidaturaController instance = new AvaliarCandidaturaController(ce, fae);
        instance.selectCandidatura(c);

    }

    /**
     * Test of setAvaliacao method, of class AvaliarCandidaturaController.
     */
    @Test
    public void testSetAvaliacao_8args() {
        System.out.println("setAvaliacao");

        Atribuicao atribuicao = new Atribuicao();
        String decisao = "aa";
        String txt = "aaa";
        int respostaTemaExpo = 0;
        int respostaAdequacaoCand = 0;
        int respostaAdequacaoCandDemo = 0;
        int respostaAdequacaoNumConvites = 0;
        int respostaRecomendacaoGlobal = 0;
        Utilizador u = new Utilizador(3, "carol", "xxx", "xxx@centro.pt", "aA;2", "ddddd");
        FAE fae = new FAE(u);
        CentroExposicoes ce = new CentroExposicoes();
        AvaliarCandidaturaController instance = new AvaliarCandidaturaController(ce, fae);
        CandidaturaExposicao c = new CandidaturaExposicao("rep@centro.pt", "nome empresa", "morada", 919999999, 23, 5);
        instance.selectCandidatura(c);

        instance.setAvaliacao(atribuicao, decisao, txt, respostaTemaExpo, respostaAdequacaoCand, respostaAdequacaoCandDemo, respostaAdequacaoNumConvites, respostaRecomendacaoGlobal);

    }

    /**
     * Test of setAvaliacao method, of class AvaliarCandidaturaController.
     */
    @Test
    public void testSetAvaliacao_3args() {
        System.out.println("setAvaliacao");
        Atribuicao atribuicao = new Atribuicao();
        String decisao = "aa";
        String txt = "aaa";
        Utilizador u = new Utilizador(3, "carol", "xxx", "xxx@centro.pt", "aA;2", "ddddd");
        FAE fae = new FAE(u);
        CentroExposicoes ce = new CentroExposicoes();
        AvaliarCandidaturaController instance = new AvaliarCandidaturaController(ce, fae);
        CandidaturaExposicao c = new CandidaturaExposicao("rep@centro.pt", "nome empresa", "morada", 919999999, 23, 5);
        instance.selectCandidatura(c);
        instance.setAvaliacao(atribuicao, decisao, txt);

    }

    /**
     * Test of registaAvaliacao method, of class AvaliarCandidaturaController.
     */
    @Test
    public void testRegistaAvaliacao() {
        System.out.println("registaAvaliacao");
        Utilizador u = new Utilizador(3, "carol", "xxx", "xxx@centro.pt", "aA;2", "ddddd");
        FAE fae = new FAE(u);
        CentroExposicoes ce = new CentroExposicoes();
        AvaliarCandidaturaController instance = new AvaliarCandidaturaController(ce, fae);
        boolean expResult = false;
        CandidaturaExposicao c = new CandidaturaExposicao("rep@centro.pt", "nome empresa", "morada", 919999999, 23, 5);
        instance.selectCandidatura(c);
        boolean result = instance.registaAvaliacao();
        assertEquals(expResult, result);

    }

}
