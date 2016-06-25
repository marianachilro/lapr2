/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.DemonstracaoConfirmadaEstado;
import lapr.project.model.DemonstracaoNaoConfirmadaEstado;
import lapr.project.model.Exposicao;
import lapr.project.model.FAE;
import lapr.project.model.ListaCandidaturasExposicoes;
import lapr.project.model.ListaDemonstracoes;
import lapr.project.model.Organizador;
import lapr.project.model.Utilizador;
import lapr.project.utils.Data;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marianachilro
 */
public class ConfirmarRealizacaoDemonstracaoControllerTest {

    public ConfirmarRealizacaoDemonstracaoControllerTest() {
    }

    /**
     * Test of getExposicoesOrganizadorEstadoCandidExpoAceites method, of class
     * ConfirmarRealizacaoDemonstracaoController.
     */
    @Test
    public void testGetExposicoesOrganizadorEstadoCandidExpoAceites() {
        System.out.println("getExposicoesOrganizadorEstadoCandidExpoAceites");
        String userName = "eva1";
        CentroExposicoes centro = new CentroExposicoes();
        Exposicao expo = new Exposicao();
        Utilizador util = new Utilizador(1, "eva", "eva1", "email@centro.pt", "M-ay1", "key1");
        centro.getRegistoUtilizadores().addUtilizador(util);
        Organizador o = new Organizador(util);
        expo.getListaOrganizadores().add(o);
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
        centro.getRegistoExposicoes().addExposicao(expo);
        ConfirmarRealizacaoDemonstracaoController instance = new ConfirmarRealizacaoDemonstracaoController(centro);
        List<Exposicao> expResult = new ArrayList<>();
        expResult.add(expo);
        List<Exposicao> result = instance.getExposicoesOrganizadorEstadoCandidExpoAceites(userName);
        assertEquals(expResult, result);
    }

    /**
     * Test of seleciona method, of class
     * ConfirmarRealizacaoDemonstracaoController.
     */
    @Test
    public void testSeleciona_Exposicao() {
        System.out.println("seleciona");
        CentroExposicoes centro = new CentroExposicoes();
        Exposicao e = new Exposicao();
        ConfirmarRealizacaoDemonstracaoController instance = new ConfirmarRealizacaoDemonstracaoController(centro);
        instance.seleciona(e);
    }

    /**
     * Test of getListaDemonstracoesNaoConfirmadas method, of class
     * ConfirmarRealizacaoDemonstracaoController.
     */
    @Test
    public void testGetListaDemonstracoesNaoConfirmadas() {
        System.out.println("getListaDemonstracoesNaoConfirmadas");
        CentroExposicoes centro = new CentroExposicoes();
        Exposicao expo = new Exposicao();
        centro.getRegistoExposicoes().addExposicao(expo);
        Demonstracao demo = new Demonstracao();
        demo.getEstado().setCriada();
        demo.setRealizacao(false);
        demo.getEstado().setNaoConfirmada();
        expo.getListaDemonstracoes().addDemonstracao(demo);
        
        Demonstracao demo1 = new Demonstracao();
        demo1.getEstado().setCriada();
        demo1.setRealizacao(true);
        demo1.getEstado().setConfirmada();
        expo.getListaDemonstracoes().addDemonstracao(demo1);
        
        ConfirmarRealizacaoDemonstracaoController instance = new ConfirmarRealizacaoDemonstracaoController(centro);
        instance.seleciona(expo);
        List<Demonstracao> expResult = new ArrayList<>();
        expResult.add(demo);
        List<Demonstracao> result = instance.getListaDemonstracoesNaoConfirmadas();
        assertEquals(expResult, result);
    }

    /**
     * Test of seleciona method, of class
     * ConfirmarRealizacaoDemonstracaoController.
     */
    @Test
    public void testSeleciona_Demonstracao() {
        System.out.println("seleciona");
        CentroExposicoes centro = new CentroExposicoes();
        Demonstracao d = new Demonstracao();
        ConfirmarRealizacaoDemonstracaoController instance = new ConfirmarRealizacaoDemonstracaoController(centro);
        instance.seleciona(d);
    }

    /**
     * Test of pergentagemInteressadosDemonstracao method, of class
     * ConfirmarRealizacaoDemonstracaoController.
     */
    @Test
    public void testPergentagemInteressadosDemonstracao() {
        System.out.println("pergentagemInteressadosDemonstracao");
        CentroExposicoes centro = new CentroExposicoes();
        Exposicao expo= new Exposicao();
        centro.getRegistoExposicoes().addExposicao(expo);
        CandidaturaExposicao cand = new CandidaturaExposicao("email@centro.pt", "nomeEmpresa", "morada", 912345678, 20, 10);
        expo.getListaCandidaturas().addCandidatura(cand);
        ConfirmarRealizacaoDemonstracaoController instance = new ConfirmarRealizacaoDemonstracaoController(centro);
        Demonstracao d = new Demonstracao();
        d.setNumeroInteressados(1);
        expo.getListaDemonstracoes().addDemonstracao(d);
        List <String> emails = new ArrayList<>();
        ListaCandidaturasExposicoes listaCandidaturas = expo.getListaCandidaturas();
        int numeroTotalRepresentantes = 0;
        for(CandidaturaExposicao c : listaCandidaturas.getListCandidaturas()){
            if(!emails.contains(c.getEmailRep())){
                emails.add(c.getEmailRep());
                numeroTotalRepresentantes++;
            }
        }
        instance.seleciona(expo);
        instance.seleciona(d); 
        float expResult = (d.getNumeroInteressados()*100)/numeroTotalRepresentantes;
        float result = instance.pergentagemInteressadosDemonstracao();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of apresentaDemonstracao method, of class
     * ConfirmarRealizacaoDemonstracaoController.
     */
    @Test
    public void testApresentaDemonstracao() {
        System.out.println("apresentaDemonstracao");
        CentroExposicoes centro = new CentroExposicoes();
        Exposicao expo = new Exposicao();
        Demonstracao demo = new Demonstracao();
        centro.getRegistoExposicoes().addExposicao(expo);
        expo.getListaDemonstracoes().addDemonstracao(demo);
        ConfirmarRealizacaoDemonstracaoController instance = new ConfirmarRealizacaoDemonstracaoController(centro);
        instance.seleciona(expo);
        instance.seleciona(demo);
        String expResult = demo.toString();
        String result = instance.apresentaDemonstracao();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRealizacao method, of class
     * ConfirmarRealizacaoDemonstracaoController.
     */
    @Test
    public void testSetRealizacao() {
        System.out.println("setRealizacao");
        CentroExposicoes centro = new CentroExposicoes();
        Exposicao expo = new Exposicao();
        Demonstracao demo = new Demonstracao();
        centro.getRegistoExposicoes().addExposicao(expo);
        expo.getListaDemonstracoes().addDemonstracao(demo);
        ConfirmarRealizacaoDemonstracaoController instance = new ConfirmarRealizacaoDemonstracaoController(centro);
        instance.seleciona(expo);
        instance.seleciona(demo);
        boolean b = false;
        instance.setRealizacao(b);
    }

    /**
     * Test of transitaEstadoDemo method, of class
     * ConfirmarRealizacaoDemonstracaoController.
     */
    @Test
    public void testTransitaEstadoDemo() {
        System.out.println("transitaEstadoDemo");
        CentroExposicoes centro = new CentroExposicoes();
        Exposicao expo = new Exposicao();
        Demonstracao demo = new Demonstracao();
        demo.getEstado().setCriada();
        centro.getRegistoExposicoes().addExposicao(expo);
        expo.getListaDemonstracoes().addDemonstracao(demo);
        ConfirmarRealizacaoDemonstracaoController instance = new ConfirmarRealizacaoDemonstracaoController(centro);
        instance.seleciona(demo);
        instance.seleciona(expo);
        instance.transitaEstadoDemo();
    }

    /**
     * Test of validaDatas method, of class
     * ConfirmarRealizacaoDemonstracaoController.
     */
    @Test
    public void testValidaDatas() {
        System.out.println("validaDatas");
        CentroExposicoes centro= new CentroExposicoes();
        Data data1 = new Data(2017, 7, 7, 7, 7, 7);
        Data data2 = new Data(2017, 9, 7, 7, 7, 7);
        ConfirmarRealizacaoDemonstracaoController instance = new ConfirmarRealizacaoDemonstracaoController(centro);
        boolean expResult = true;
        boolean result = instance.validaDatas(data1, data2);
        assertEquals(expResult, result);
    }

    /**
     * Test of setDataInicioSubmissaoCandidaturasDemos method, of class
     * ConfirmarRealizacaoDemonstracaoController.
     */
    @Test
    public void testSetDataInicioSubmissaoCandidaturasDemos() {
        System.out.println("setDataInicioSubmissaoCandidaturasDemos");
        CentroExposicoes centro = new CentroExposicoes();
        Data data1 = new Data(2017, 9, 7, 7, 7, 7);
        Exposicao expo = new Exposicao();
        ConfirmarRealizacaoDemonstracaoController instance = new ConfirmarRealizacaoDemonstracaoController(centro);
        instance.seleciona(expo);
        instance.setDataInicioSubmissaoCandidaturasDemos(data1);
    }

    /**
     * Test of setDataFimSubmissaoCandidaturasDemos method, of class
     * ConfirmarRealizacaoDemonstracaoController.
     */
    @Test
    public void testSetDataFimSubmissaoCandidaturasDemos() {
        System.out.println("setDataFimSubmissaoCandidaturasDemos");
        CentroExposicoes centro = new CentroExposicoes();
        Data data2 = new Data(2017, 9, 7, 7, 7, 7);
        Exposicao expo = new Exposicao();
        ConfirmarRealizacaoDemonstracaoController instance = new ConfirmarRealizacaoDemonstracaoController(centro);
        instance.seleciona(expo);
        instance.setDataInicioSubmissaoCandidaturasDemos(data2);
    }

    /**
     * Test of setDataFimAtualizaçãoConflitosDemos method, of class
     * ConfirmarRealizacaoDemonstracaoController.
     */
    @Test
    public void testSetDataFimAtualizaçãoConflitosDemos() {
        System.out.println("setDataFimAtualiza\u00e7\u00e3oConflitosDemos");
        CentroExposicoes centro = new CentroExposicoes();
        Data data3 = new Data(2017, 9, 7, 7, 7, 7);
        Exposicao expo = new Exposicao();
        ConfirmarRealizacaoDemonstracaoController instance = new ConfirmarRealizacaoDemonstracaoController(centro);
        instance.seleciona(expo);
        instance.setDataInicioSubmissaoCandidaturasDemos(data3);
    }

    /**
     * Test of escalonarExposicaoEDemosConfirmadas method, of class
     * ConfirmarRealizacaoDemonstracaoController.
     */
    @Test
    public void testEscalonarExposicaoEDemosConfirmadas() {
        System.out.println("escalonarExposicaoEDemosConfirmadas");
        CentroExposicoes centro = new CentroExposicoes();
        Exposicao expo = new Exposicao();
        
        Data data1 = new Data(2017, 9, 7, 7, 7, 7);
        Data data2 = new Data(2017, 9, 7, 7, 7, 7);
        Data data3 = new Data(2017, 10, 7, 7, 7, 7);
        expo.setDataInicioSubmissaoCandidaturasDemos(data1);
        expo.setDataFimSubmissaoCandidaturasDemos(data2);
        expo.setDataFimAtualizacaoConflitosDemos(data3);
        centro.getRegistoExposicoes().addExposicao(expo);
        
        Demonstracao d = new Demonstracao();
        expo.getListaDemonstracoes().addDemonstracao(d);
        ConfirmarRealizacaoDemonstracaoController instance = new ConfirmarRealizacaoDemonstracaoController(centro);
        instance.seleciona(expo);
        instance.escalonarExposicaoEDemosConfirmadas();
    }

    /**
     * Test of transitaEstadoExpo method, of class
     * ConfirmarRealizacaoDemonstracaoController.
     */
    @Test
    public void testTransitaEstadoExpo() {
        System.out.println("transitaEstadoExpo");
        CentroExposicoes centro =  new CentroExposicoes ();
        Exposicao expo =  new Exposicao();
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
        expo.getEstado().setDemonstracaoConflitosAtualizados();
        expo.getEstado().setDemonstracaoCandidaturasAtribuidas();
        expo.getEstado().setDemonstracaoCandidaturasAvaliadas();
        expo.getEstado().setDemonstracaoCandidaturasDecididas();
        centro.getRegistoExposicoes().addExposicao(expo);
        ConfirmarRealizacaoDemonstracaoController instance = new ConfirmarRealizacaoDemonstracaoController(centro);
        instance.seleciona(expo);
        boolean expResult = true;
        boolean result = instance.transitaEstadoExpo();
        assertEquals(expResult, result);
    }

}
