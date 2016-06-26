/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Candidatura;
import lapr.project.model.CandidaturaDemonstracao;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Conflito;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.FAE;
import lapr.project.model.RegistoTipoConflitos;
import lapr.project.model.TipoConflito;
import lapr.project.model.Utilizador;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marianachilro
 */
public class AtualizarConflitoControllerTest {
    
    public AtualizarConflitoControllerTest() {
    }

    /**
     * Test of getExposicao method, of class AtualizarConflitoController.
     */
    @Test
    public void testGetExposicao() {
        System.out.println("getExposicao");
        CentroExposicoes centro = new CentroExposicoes();
        Utilizador u = new Utilizador();
        Exposicao expo = new Exposicao();
        AtualizarConflitoController instance = new AtualizarConflitoController(centro, u);
        instance.selecionaExpo(expo);
        Exposicao expResult = expo;
        Exposicao result = instance.getExposicao();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCentro method, of class AtualizarConflitoController.
     */
    @Test
    public void testGetCentro() {
        System.out.println("getCentro");
        CentroExposicoes centro = new CentroExposicoes();
        Utilizador u = new Utilizador();
        Exposicao expo = new Exposicao();
        AtualizarConflitoController instance = new AtualizarConflitoController(centro, u);
        CentroExposicoes expResult = centro;
        CentroExposicoes result = instance.getCentro();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUtilizador method, of class AtualizarConflitoController.
     */
    @Test
    public void testGetUtilizador() {
        System.out.println("getUtilizador");
        CentroExposicoes centro = new CentroExposicoes();
        Utilizador u = new Utilizador();
        Exposicao expo = new Exposicao();
        AtualizarConflitoController instance = new AtualizarConflitoController(centro, u);
        Utilizador expResult = u;
        Utilizador result = instance.getUtilizador();
        assertEquals(expResult, result);
    }

    /**
     * Test of getConflito method, of class AtualizarConflitoController.
     */
    @Test
    public void testGetConflito() {
        System.out.println("getConflito");
        CentroExposicoes centro = new CentroExposicoes();
        Utilizador u = new Utilizador();
        Exposicao expo = new Exposicao();
        Conflito c = new Conflito();
        AtualizarConflitoController instance = new AtualizarConflitoController(centro, u);
        instance.selecionaConflito(c);
        Conflito expResult = c;
        Conflito result = instance.getConflito();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaExposicoesFAEDisponiveis method, of class AtualizarConflitoController.
     */
    @Test
    public void testGetListaExposicoesFAEDisponiveis() {
        System.out.println("getListaExposicoesFAEDisponiveis");
        CentroExposicoes centro = new CentroExposicoes();
        Utilizador u = new Utilizador();
        Exposicao expo = new Exposicao();
        centro.getRegistoExposicoes().addExposicao(expo);
        expo.getListaFAES().addFae(new FAE(u));
        expo.getEstado().setCriada();
        expo.getEstado().setDemoSemFae();
        expo.getEstado().setCompleta();
        expo.getEstado().setExposicaoCandidaturasAbertas();
        expo.getEstado().setExposicaoCandidaturasFechadas();
        expo.getEstado().setExposicaoConflitosDetetados();
        AtualizarConflitoController instance = new AtualizarConflitoController(centro, u);
        List<Exposicao> expResult = new ArrayList <>();
        expResult.add(expo);
        List<Exposicao> result = instance.getListaExposicoesFAEDisponiveis();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaCandidaturasFAEExpo method, of class AtualizarConflitoController.
     */
    @Test
    public void testGetListaCandidaturasFAEExpo() {
        System.out.println("getListaCandidaturasFAEExpo");
        CentroExposicoes centro = new CentroExposicoes();
        Utilizador u = new Utilizador();
        Exposicao expo = new Exposicao();
        centro.getRegistoExposicoes().addExposicao(expo);
        FAE fae = new FAE(u);
        expo.getListaFAES().addFae(fae);
        expo.getEstado().setCriada();
        expo.getEstado().setDemoSemFae();
        expo.getEstado().setCompleta();
        expo.getEstado().setExposicaoCandidaturasAbertas();
        expo.getEstado().setExposicaoCandidaturasFechadas();
        expo.getEstado().setExposicaoConflitosDetetados();
        CandidaturaExposicao c = new CandidaturaExposicao();
        expo.getListaConflitos().addConflito(new Conflito(fae, c));
        AtualizarConflitoController instance = new AtualizarConflitoController(centro, u);
        instance.selecionaExpo(expo);
        List<CandidaturaExposicao> expResult = new ArrayList <>();
        expResult.add(c);
        List<CandidaturaExposicao> result = instance.getListaCandidaturasFAEExpo();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaCandidaturasFAEDemo method, of class AtualizarConflitoController.
     */
    @Test
    public void testGetListaCandidaturasFAEDemo() {
        System.out.println("getListaCandidaturasFAEDemo");
        CentroExposicoes centro = new CentroExposicoes();
        Utilizador u = new Utilizador();
        centro.getRegistoUtilizadores().addUtilizador(u);
        Exposicao expo = new Exposicao();
        centro.getRegistoExposicoes().addExposicao(expo);
        FAE fae = new FAE(u);
        expo.getListaFAES().addFae(fae);
        Demonstracao demo =  new Demonstracao();
        expo.getListaDemonstracoes().addDemonstracao(demo);
        expo.getEstado().setCriada();
        expo.getEstado().setDemoSemFae();
        expo.getEstado().setCompleta();
        expo.getEstado().setExposicaoCandidaturasAbertas();
        expo.getEstado().setExposicaoCandidaturasFechadas();
        expo.getEstado().setExposicaoConflitosDetetados();
        expo.getEstado().setExposicaoConflitosAtualizados();
        expo.getEstado().setExposicaoCandidaturasAtribuidas();
        expo.getEstado().setExposicaoCandidaturasAvaliadas();
        expo.getEstado().setExposicaoCandidaturasDecididas();
        expo.getEstado().setConfirmacaoRealizacaoDemos();
        expo.getEstado().setDemonstracaoCandidaturasAbertas();
        expo.getEstado().setDemonstracaoCandidaturasFechadas();
        expo.getEstado().setDemonstracaoConflitosDetetados();
        CandidaturaDemonstracao c = new CandidaturaDemonstracao();
        expo.getListaConflitos().addConflito(new Conflito(fae, c));
        AtualizarConflitoController instance = new AtualizarConflitoController(centro, u);
        instance.selecionaExpo(expo);
        List<CandidaturaDemonstracao> expResult = new ArrayList<>();
        expResult.add(c);
        List<CandidaturaDemonstracao> result = instance.getListaCandidaturasFAEDemo();
        assertEquals(expResult, result);
    }

    /**
     * Test of selecionaExpo method, of class AtualizarConflitoController.
     */
    @Test
    public void testSelecionaExpo() {
        System.out.println("selecionaExpo");
        CentroExposicoes centro = new CentroExposicoes();
        Utilizador u = new Utilizador();
        centro.getRegistoUtilizadores().addUtilizador(u);
        Exposicao e = new Exposicao();
        centro.getRegistoExposicoes().addExposicao(e);
        AtualizarConflitoController instance = new AtualizarConflitoController(centro, u);
        instance.selecionaExpo(e);
    }

    /**
     * Test of selecionaTipo method, of class AtualizarConflitoController.
     */
    @Test
    public void testSelecionaTipo() {
        System.out.println("selecionaTipo");
        CentroExposicoes centro = new CentroExposicoes();
        Utilizador u = new Utilizador();
        centro.getRegistoUtilizadores().addUtilizador(u);
        Exposicao e = new Exposicao();
        centro.getRegistoExposicoes().addExposicao(e);
        TipoConflito t = new TipoConflito();
        centro.getRegistoTipoConflitos().addConflito(t);
        AtualizarConflitoController instance = new AtualizarConflitoController(centro, u);
        instance.selecionaTipo(t);
    }

    /**
     * Test of selecionaCandExpo method, of class AtualizarConflitoController.
     */
    @Test
    public void testSelecionaCandExpo() {
        System.out.println("selecionaCandExpo");
        CandidaturaExposicao c = new CandidaturaExposicao();
        CentroExposicoes centro = new CentroExposicoes();
        Utilizador u = new Utilizador();
        centro.getRegistoUtilizadores().addUtilizador(u);
        Exposicao e = new Exposicao();
        e.getListaCandidaturas().addCandidatura(c);
        centro.getRegistoExposicoes().addExposicao(e);
        TipoConflito t = new TipoConflito();
        centro.getRegistoTipoConflitos().addConflito(t);
        AtualizarConflitoController instance = new AtualizarConflitoController(centro, u);
        instance.selecionaCandExpo(c);
    }

    /**
     * Test of selecionaCandDemos method, of class AtualizarConflitoController.
     */
    @Test
    public void testSelecionaCandDemos() {
        System.out.println("selecionaCandDemos");
        CandidaturaDemonstracao c = new CandidaturaDemonstracao();
        CentroExposicoes centro = new CentroExposicoes();
        Utilizador u = new Utilizador();
        centro.getRegistoUtilizadores().addUtilizador(u);
        Exposicao e = new Exposicao();
        centro.getRegistoExposicoes().addExposicao(e);
        Demonstracao d = new Demonstracao();
        d.getListaCandidaturas().addCandidatura(c);
        e.getListaDemonstracoes().addDemonstracao(d);
        AtualizarConflitoController instance = new AtualizarConflitoController(centro, u);
        instance.selecionaCandDemos(c);
    }

    /**
     * Test of getConflitosFAE method, of class AtualizarConflitoController.
     */
    @Test
    public void testGetConflitosFAE() {
        System.out.println("getConflitosFAE");
        CentroExposicoes centro = new CentroExposicoes();
        Utilizador u = new Utilizador();
        FAE f = new FAE(u);
        centro.getRegistoUtilizadores().addUtilizador(u);
        Exposicao e = new Exposicao();
        e.getListaFAES().addFae(f);
        centro.getRegistoExposicoes().addExposicao(e);
        CandidaturaExposicao c = new CandidaturaExposicao();
        Conflito conf = new Conflito(f, c);
        e.getListaCandidaturas().addCandidatura(c);
        e.getListaConflitos().addConflito(conf);
        AtualizarConflitoController instance = new AtualizarConflitoController(centro, u);
        instance.selecionaExpo(e);
        List<Conflito> expResult = new ArrayList <>();
        expResult.add(conf);
        List<Conflito> result = instance.getConflitosFAE();
        assertEquals(expResult, result);
    }

    /**
     * Test of selecionaConflito method, of class AtualizarConflitoController.
     */
    @Test
    public void testSelecionaConflito() {
        System.out.println("selecionaConflito");
        CentroExposicoes centro = new CentroExposicoes();
        Utilizador u = new Utilizador();
        FAE f = new FAE(u);
        centro.getRegistoUtilizadores().addUtilizador(u);
        Exposicao e = new Exposicao();
        e.getListaFAES().addFae(f);
        centro.getRegistoExposicoes().addExposicao(e);
        CandidaturaExposicao c = new CandidaturaExposicao();
        Conflito conf = new Conflito(f, c);
        e.getListaCandidaturas().addCandidatura(c);
        e.getListaConflitos().addConflito(conf);
        AtualizarConflitoController instance = new AtualizarConflitoController(centro, u);
        instance.selecionaConflito(conf);
    }




    
}
