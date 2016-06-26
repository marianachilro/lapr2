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
        boolean decisao = false;
        instance.setDecisao(decisao);
        boolean expResult = false;
        boolean result = instance.getDecisao();
        assertEquals(expResult, result);
    }
    
  
    /**
     * Test of getEstado method, of class CandidaturaDemonstracao.
     */
    @Test
    public void testGetAndSetEstado() {
        System.out.println("getEstado");
        CandidaturaDemonstracao instance = new CandidaturaDemonstracao();
       
        CandImpEstado expResult = new CandImpEstado(instance, "");
        instance.setEstado(expResult);
        CandImpEstado result = instance.getEstado();
        assertEquals(expResult, result);
      
    }


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
        instance.setDecisao(true);
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
        String expResult = "";
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

}
