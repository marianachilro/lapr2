/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author miniondevil
 */
public class AtribuicaoTest {
    
   

    /**
     * Test of getFAE method, of class Atribuicao.
     */
    @Test
    public void testGetAndSetFAE() {
        System.out.println("getAndSetFAE");
        CandidaturaExposicao c = new CandidaturaExposicao();
        FAE fae = new FAE();
        Atribuicao instance = new Atribuicao(fae, c);
        Utilizador u = new Utilizador(3,"joao", "Joao_vaz", "123@outlookp.pt", "Jj;012345","keyword");
        FAE fae2 = new FAE(u);
        FAE expResult = fae2;
        instance.setFAE(fae2);
        FAE result = instance.getFAE();
        assertEquals(expResult, result);
        
    }

    /**
     * Testa se o método set e get candidatura funciona com uma CandidaturaExposicao.
     */
    @Test
    public void testGetAndSetCandidatura() {
        System.out.println("getCandidatura");
       
        CandidaturaExposicao c = new CandidaturaExposicao();
        FAE fae = new FAE();
        Atribuicao instance = new Atribuicao(fae, c);
        CandidaturaExposicao c2 = new CandidaturaExposicao("123", "asd", "asd", 123123123, 20, 30);
        CandidaturaExposicao expResult = c2;
        instance.setCandidatura(c2);
        Candidatura result = instance.getCandidatura();
        assertEquals(expResult, result);
    }

    

    /**
     * Testa se o método equals retorna true se os atributos forem todos iguais.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = new Atribuicao(new FAE(), new CandidaturaExposicao());
        Atribuicao instance = new Atribuicao(new FAE(), new CandidaturaExposicao());
        boolean expResult = true;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        
    }
       /**
     * Testa se o método equals retorna true se os objetos tiverem a mesma referencia.
     */
    @Test
    public void testEquals1() {
        System.out.println("equals");
        Object o = new Atribuicao(new FAE(), new CandidaturaExposicao());
        Atribuicao instance =(Atribuicao) o;
        boolean expResult = true;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        
    }
      /**
     * Testa se o método equals retorna false se os FAE forem diferentes.
     */
    @Test
    public void testEquals2() {
        System.out.println("equals");
        Object o = new Atribuicao(new FAE(), new CandidaturaExposicao());
        Atribuicao instance = new Atribuicao(new FAE(new Utilizador(3,"asd", "dasd", "123@teste.com", "123jJ,", "peeixe")), new CandidaturaExposicao());
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        
    }
       /**
     * Testa se o método equals retorna false se as candidaturas forem diferentes.
     */
    @Test
    public void testEquals3() {
        System.out.println("equals");
        Object o = new Atribuicao(new FAE(), new CandidaturaExposicao());
        Atribuicao instance = new Atribuicao(new FAE(), new CandidaturaExposicao("321@teste.com", "asd", "asd", 910000000, 20, 30));
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        
    }
     /**
     * Testa se o método equals retorna false se os atributos forem todos diferentes.
     */
    @Test
    public void testEquals4() {
        System.out.println("equals");
        Object o = new Atribuicao(new FAE(), new CandidaturaExposicao());
        Atribuicao instance = new Atribuicao(new FAE(new Utilizador(3,"asd", "dasd", "123@teste.com", "123jJ,", "peeixe")), new CandidaturaExposicao("321@teste.com", "asd", "asd", 910000000, 20, 30));
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Testa se o método equals retorna true se os atributos forem todos iguais, com candidatura demonstracao.
     */
    @Test
    public void testEquals5() {
        System.out.println("equals");
        Object o = new Atribuicao(new FAE(), new CandidaturaDemonstracao());
        Atribuicao instance = new Atribuicao(new FAE(), new CandidaturaDemonstracao());
        boolean expResult = true;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        
    }
     /**
     * Testa se o método equals retorna true se os objetos tiverem a mesma referencia, com candidatura demonstracao.
     */
    @Test
    public void testEquals6() {
        System.out.println("equals");
        Object o = new Atribuicao(new FAE(), new CandidaturaDemonstracao());
        Atribuicao instance =(Atribuicao) o;
        boolean expResult = true;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        
    }
      /**
     * Testa se o método equals retorna false se os FAE forem diferentes, com candidatura demonstracao.
     */
    @Test
    public void testEquals7() {
        System.out.println("equals");
        Object o = new Atribuicao(new FAE(), new CandidaturaDemonstracao());
        Atribuicao instance = new Atribuicao(new FAE(new Utilizador(3,"asd", "dasd", "123@teste.com", "123jJ,", "peeixe")), new CandidaturaDemonstracao());
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        
    }
       /**
     * Testa se o método equals retorna false se as candidaturas forem diferentes, com candidatura demosntracao.
     */
    @Test
    public void testEquals8() {
        System.out.println("equals");
        Object o = new Atribuicao(new FAE(), new CandidaturaDemonstracao());
        Atribuicao instance = new Atribuicao(new FAE(), new CandidaturaDemonstracao("321@teste.com"));
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        
    }
//     /**
//     * Testa se o método equals retorna false se os atributos forem todos diferentes, com candidatura demonstracao.
//     */
//    @Test
//    public void testEquals9() {
//        System.out.println("equals");
//        Object o = new Atribuicao(new FAE(), new CandidaturaExposicao());
//        Atribuicao instance = new Atribuicao(new FAE(new Utilizador(3,"asd", "dasd", "123@teste.com", "123jJ,", "peeixe")), new CandidaturaDemonstracao("321@teste.com",new Demonstracao("asd1", "asdasd")));
//        boolean expResult = false;
//        boolean result = instance.equals(o);
//        assertEquals(expResult, result);
//        
//    }


    /**
     * Testa o método com uma candidatura da exposicao.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Atribuicao instance = new Atribuicao(new FAE(), new CandidaturaExposicao());
        int expResult = 1449104;
        int result = instance.hashCode();
        assertEquals(expResult, result);
     
    }
   /**
     * Testa o método com uma candidatura da demonstracao.
     */
    @Test
    public void testHashCode1() {
        System.out.println("hashCode");
        Atribuicao instance = new Atribuicao(new FAE(), new CandidaturaDemonstracao());
        int expResult = 121126920;
        int result = instance.hashCode();
        assertEquals(expResult, result);
     
    }
}
