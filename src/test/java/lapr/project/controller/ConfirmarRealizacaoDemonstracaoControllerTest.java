/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

//import java.util.ArrayList;
//import java.util.List;
//import lapr.project.model.Avaliacao;
//import lapr.project.model.CandidaturaExposicao;
//import lapr.project.model.CentroExposicoes;
//import lapr.project.model.Demonstracao;
//import lapr.project.model.Exposicao;
//import lapr.project.model.FAE;
//import lapr.project.model.Organizador;
//import lapr.project.model.Utilizador;
//import lapr.project.utils.Data;
//import org.junit.Test;
//import static org.junit.Assert.*;

/**
 *
 * @author marianachilro
 */
public class ConfirmarRealizacaoDemonstracaoControllerTest {
    
    public ConfirmarRealizacaoDemonstracaoControllerTest() {
    }

//    /**
//     * Test of getExposicoesOrganizadorEstadoCandidExpoAceites method, of class ConfirmarRealizacaoDemonstracaoController.
//     */
//    @Test
//    public void testGetExposicoesOrganizadorEstadoCandidExpoAceites() {
//        System.out.println("getExposicoesOrganizadorEstadoCandidExpoAceites");
//        String userName = "";
//        CentroExposicoes ce = new CentroExposicoes();
//        Utilizador u = new Utilizador("nome", "username", "email2", "password");
//        Utilizador u1 = new Utilizador("nome2", "username2", "email6", "password");
//        ce.getRegistoUtilizadores().addUtilizador(u);
//        ce.getRegistoUtilizadores().addUtilizador(u1);
//        FAE fae = new FAE(u1);
//        Organizador o = new Organizador(u);
//        Exposicao e = new Exposicao("titulo", "descricao", new Data(2016, 8, 17), new Data(2016, 12, 18), "local", new Data(2016, 8, 20), new Data(2016, 8, 30),
//            new Data(2016, 9, 3), new Data(2016, 9, 15));
//        ce.getRegistoExposicoes().addExposicao(e);
//        Demonstracao d = new Demonstracao("codigo", "descricao");
//        
//        e.getListaOrganizadores().add(o);
//        
//        e.getListaDemonstracoes().getListaDemonstracao().add(d);
//        
//        e.getEstado().setCriada();
//        
//        e.getEstado().setDemoSemFae();
//        
//        e.getListaFAES().addFae(fae);
//        
//        e.getEstado().setCompleta();
//        
//        e.getEstado().setExposicaoCandidaturasAbertas();
//        
//        CandidaturaExposicao c = new CandidaturaExposicao("email", "nome empresa", "morada", 913345679, 100, 100);
//        c.getEstado().setCriada();
//        
//        c.getListaDemonstracoes().getListaDemonstracao().add(d);
//        
//        e.getEstado().setExposicaoCandidaturasFechadas();
//        c.getEstado().setCompleta();
//        
//        e.getEstado().setExposicaoConflitosDetetados();
//        c.getEstado().setConflitosDetetados();
//        e.getEstado().setExposicaoConflitosAtualizados();
//        c.getEstado().setConflitosAlterados();
//        
//        e.getListaAtribuicoes().newAtribuicao(c, fae);
//        c.getEstado().setAtribuida();
//        e.getEstado().setExposicaoCandidaturasAtribuidas();
//        
//        c.getListaAvaliacoes().getListaAvaliacao().add(new Avaliacao(fae.getUtilizador().getNome(), "email", "aceite","txt", 5, 5,
//            5, 5, 5));
//        c.getEstado().setAvaliada();
//        
//        e.getEstado().setExposicaoCandidaturasAvaliadas();
//        
//        c.setDecisao("aceite");
//        c.getEstado().setDecidida();
//        e.getEstado().setExposicaoCandidaturasDecididas();
//        
//        
//        
//        
//        
//        
//        
//        
//        
//        
//        ConfirmarRealizacaoDemonstracaoController instance = new ConfirmarRealizacaoDemonstracaoController(ce);
//        List<Exposicao> expResult = new ArrayList<>();
//        expResult.add(e);
//        List<Exposicao> result = instance.getExposicoesOrganizadorEstadoCandidExpoAceites(o.getUtilizador().getUsername());
//        assertEquals(expResult, result);
//    }

//    /**
//     * Test of seleciona method, of class ConfirmarRealizacaoDemonstracaoController.
//     */
//    @Test
//    public void testSeleciona_Exposicao() {
//        System.out.println("seleciona");
//        Exposicao e = null;
//        ConfirmarRealizacaoDemonstracaoController instance = null;
//        instance.seleciona(e);
//         TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getListaDemonstracoesNaoConfirmadas method, of class ConfirmarRealizacaoDemonstracaoController.
//     */
//    @Test
//    public void testGetListaDemonstracoesNaoConfirmadas() {
//        System.out.println("getListaDemonstracoesNaoConfirmadas");
//        ConfirmarRealizacaoDemonstracaoController instance = null;
//        List<Demonstracao> expResult = null;
//        List<Demonstracao> result = instance.getListaDemonstracoesNaoConfirmadas();
//        assertEquals(expResult, result);
//         TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of seleciona method, of class ConfirmarRealizacaoDemonstracaoController.
//     */
//    @Test
//    public void testSeleciona_Demonstracao() {
//        System.out.println("seleciona");
//        Demonstracao d = null;
//        ConfirmarRealizacaoDemonstracaoController instance = null;
//        instance.seleciona(d);
//         TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of apresentaDemonstracao method, of class ConfirmarRealizacaoDemonstracaoController.
//     */
//    @Test
//    public void testApresentaDemonstracao() {
//        System.out.println("apresentaDemonstracao");
//        ConfirmarRealizacaoDemonstracaoController instance = null;
//        String expResult = "";
//        String result = instance.apresentaDemonstracao();
//        assertEquals(expResult, result);
//         TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setRealizacao method, of class ConfirmarRealizacaoDemonstracaoController.
//     */
//    @Test
//    public void testSetRealizacao() {
//        System.out.println("setRealizacao");
//        boolean b = false;
//        ConfirmarRealizacaoDemonstracaoController instance = null;
//        instance.setRealizacao(b);
//         TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of transitaEstadoDemo method, of class ConfirmarRealizacaoDemonstracaoController.
//     */
//    @Test
//    public void testTransitaEstadoDemo() {
//        System.out.println("transitaEstadoDemo");
//        ConfirmarRealizacaoDemonstracaoController instance = null;
//        instance.transitaEstadoDemo();
//         TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of validaDatas method, of class ConfirmarRealizacaoDemonstracaoController.
//     */
//    @Test
//    public void testValidaDatas() {
//        System.out.println("validaDatas");
//        Data data1 = null;
//        Data data2 = null;
//        ConfirmarRealizacaoDemonstracaoController instance = null;
//        boolean expResult = false;
//        boolean result = instance.validaDatas(data1, data2);
//        assertEquals(expResult, result);
//         TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setDataInicioSubmissaoCandidaturasDemos method, of class ConfirmarRealizacaoDemonstracaoController.
//     */
//    @Test
//    public void testSetDataInicioSubmissaoCandidaturasDemos() {
//        System.out.println("setDataInicioSubmissaoCandidaturasDemos");
//        Data data1 = null;
//        ConfirmarRealizacaoDemonstracaoController instance = null;
//        instance.setDataInicioSubmissaoCandidaturasDemos(data1);
//         TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setDataFimSubmissaoCandidaturasDemos method, of class ConfirmarRealizacaoDemonstracaoController.
//     */
//    @Test
//    public void testSetDataFimSubmissaoCandidaturasDemos() {
//        System.out.println("setDataFimSubmissaoCandidaturasDemos");
//        Data data2 = null;
//        ConfirmarRealizacaoDemonstracaoController instance = null;
//        instance.setDataFimSubmissaoCandidaturasDemos(data2);
//         TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setDataFimAtualizaçãoConflitosDemos method, of class ConfirmarRealizacaoDemonstracaoController.
//     */
//    @Test
//    public void testSetDataFimAtualizaçãoConflitosDemos() {
//        System.out.println("setDataFimAtualiza\u00e7\u00e3oConflitosDemos");
//        Data data3 = null;
//        ConfirmarRealizacaoDemonstracaoController instance = null;
//        instance.setDataFimAtualizaçãoConflitosDemos(data3);
//         TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of escalonarExposicao method, of class ConfirmarRealizacaoDemonstracaoController.
//     */
//    @Test
//    public void testEscalonarExposicao() {
//        System.out.println("escalonarExposicao");
//        ConfirmarRealizacaoDemonstracaoController instance = null;
//        instance.escalonarExposicao();
//         TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of transitaEstadoExpo method, of class ConfirmarRealizacaoDemonstracaoController.
//     */
//    @Test
//    public void testTransitaEstadoExpo() {
//        System.out.println("transitaEstadoExpo");
//        ConfirmarRealizacaoDemonstracaoController instance = null;
//        boolean expResult = false;
//        boolean result = instance.transitaEstadoExpo();
//        assertEquals(expResult, result);
//         TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
