/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author catarinarib
 */
public class CandidaturaDemonstracaoTest {
    

    /**
     * Test of getEmailRep method, of class CandidaturaDemonstracao.
     */
    @Test
    public void testGetEmailRepAndSetEmailRep() {
        System.out.println("testeEmailRep");
        CandidaturaDemonstracao instance = new CandidaturaDemonstracao();
        String email = "sddf@centro.pt";
        instance.setEmailRep(email);
        String expResult = email;
        String result = instance.getEmailRep();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of getListaAvaliacoes method, of class CandidaturaDemonstracao.
     */
    @Test
    public void testGetListaAvaliacoes() {
        System.out.println("testeGetListaAvaliacoes");
        CandidaturaDemonstracao instance = new CandidaturaDemonstracao();
        List<Avaliacao> expResult = new ArrayList<>();
        List<Avaliacao> result = instance.getListaAvaliacoes().getListaAvaliacao();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getDecisao method, of class CandidaturaDemonstracao.
     */
    @Test
    public void testGetDecisaoAndSetDecisao() {
        System.out.println("testeDecisao");
        CandidaturaDemonstracao instance = new CandidaturaDemonstracao();
        String decisao = "";
        instance.setDecisao(decisao);
        String expResult = "";
        String result = instance.getDecisao();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getDemonstracao method, of class CandidaturaDemonstracao.
     */
    @Test
    public void testGetDemonstracaoAndSetDemonstracao(){
        System.out.println("testeDemonstracao");
        CandidaturaDemonstracao instance = new CandidaturaDemonstracao();
        Demonstracao demo = new Demonstracao();
        instance.setDemonstracao(demo);
        Demonstracao expResult = demo;
        Demonstracao result = instance.getDemonstracao();
        assertEquals(expResult, result);
    }

//    /**
//     * Test of getEstado method, of class CandidaturaDemonstracao.
//     */
//    @Test
//    public void testGetEstado() {
//        System.out.println("getEstado");
//        CandidaturaDemonstracao instance = new CandidaturaDemonstracao();
//        CandidaturaEstado expResult = null;
//        CandidaturaEstado result = instance.getEstado();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setEstado method, of class CandidaturaDemonstracao.
//     */
//    @Test
//    public void testSetEstado() {
//        System.out.println("setEstado");
//        CandidaturaEstado estado = null;
//        CandidaturaDemonstracao instance = new CandidaturaDemonstracao();
//        instance.setEstado(estado);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }


    /**
     * Test of equals method, of class CandidaturaDemonstracao.
     */
    @Test
    public void testEquals() {

        System.out.println("TesteEquals");

        Object a = new CandidaturaDemonstracao();
        CandidaturaDemonstracao instance = new CandidaturaDemonstracao();
        boolean expResult = true;
        boolean result = instance.equals(a);
        assertEquals(expResult, result);

    }

    /**
     * Test of equals method, of class CandidaturaDemonstracao.
     */
    @Test
    public void testEqualsAtributosDiferentes() {

        System.out.println("TesteEquals");

        Object a = new CandidaturaDemonstracao();
        CandidaturaDemonstracao instance = new CandidaturaDemonstracao();
        instance.setDecisao("d");
        instance.setEmailRep("sddfd@centro.pt");
        boolean expResult = false;
        boolean result = instance.equals(a);
        assertEquals(expResult, result);

    }

    /**
     * Test of equals method, of class CandidaturaDemonstracao.
     */
    @Test
    public void testEqualsMesmaRef() {

        System.out.println("TesteEquals");

        CandidaturaDemonstracao instance = new CandidaturaDemonstracao();
        Object a = instance;
        boolean expResult = true;
        boolean result = instance.equals(a);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class CandidaturaDemonstracao.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        CandidaturaDemonstracao instance = new CandidaturaDemonstracao();
        String expResult = "null";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of validaAvaliacao method, of class CandidaturaDemonstracao.
     */
    @Test
    public void testValidaAvaliacao() {
        System.out.println("validaAvaliacao");
        Avaliacao ac = new Avaliacao();
        CandidaturaDemonstracao instance = new CandidaturaDemonstracao();
        boolean expResult = true;
        boolean result = instance.validaAvaliacao(ac);
        assertEquals(expResult, result);
       
    }
//
//    /**
//     * Test of verificarEstadoAtribuida method, of class CandidaturaDemonstracao.
//     */
//    @Test
//    public void testVerificarEstadoAtribuida() {
//        System.out.println("verificarEstadoAtribuida");
//        CandidaturaDemonstracao instance = new CandidaturaDemonstracao();
//        boolean expResult = false;
//        boolean result = instance.verificarEstadoAtribuida();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of verificarEstadoAvaliada method, of class CandidaturaDemonstracao.
//     */
//    @Test
//    public void testVerificarEstadoAvaliada() {
//        System.out.println("verificarEstadoAvaliada");
//        CandidaturaDemonstracao instance = new CandidaturaDemonstracao();
//        boolean expResult = false;
//        boolean result = instance.verificarEstadoAvaliada();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setRemovida method, of class CandidaturaDemonstracao.
//     */
//    @Test
//    public void testSetRemovida() {
//        System.out.println("setRemovida");
//        CandidaturaDemonstracao instance = new CandidaturaDemonstracao();
//        boolean expResult = false;
//        boolean result = instance.setRemovida();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
