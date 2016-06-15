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
 * @author catarinarib
 */
public class FAETest {
    
    /**
     * Test of getID method, of class FAE.
     */
    @Test
    public void testGetID() {
        System.out.println("testeID");
        Utilizador u = new Utilizador();
        FAE instance = new FAE(u);
        String expResult =u.getUsername();
        String result = instance.getID();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getUtilizador method, of class FAE.
     */
    @Test
    public void testGetUtilizadorAndSetUtilizador() {
        System.out.println("testeUtilizador");
        Utilizador u = new Utilizador();
        FAE instance = new FAE();
        instance.setUtilizador(u);
        Utilizador expResult = u;
        Utilizador result = instance.getUtilizador();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of valida method, of class FAE.
     */
    @Test
    public void testValida() {
        System.out.println("testeValida");
        FAE instance = new FAE();
        boolean expResult = true;
        boolean result = instance.valida();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class FAE.
     */
    @Test
    public void testToString() {
        System.out.println("testeToString");
        Utilizador u = new Utilizador();
        FAE instance = new FAE(u);
        String expResult = u.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class FAE.
     */
    @Test
    public void testEquals() {
        
        System.out.println("TesteEquals");
        Utilizador u = new Utilizador();
        Object a = new FAE(u);
        FAE instance = new FAE(u);
        boolean expResult = true;
        boolean result = instance.equals(a);
        assertEquals(expResult, result);

    }

    /**
     * Test of equals method, of class FAE.
     */
    @Test
    public void testEqualsAtributosDiferentes() {

        System.out.println("TesteEquals");
        Utilizador u= new Utilizador();
        Utilizador u1= new Utilizador();
        Object a = new FAE(u);
        FAE instance = new FAE(u1);
        instance.getUtilizador().setNome("nome");
        instance.getUtilizador().setUsername("username");
        instance.getUtilizador().setEmail("sdfsdf@centro.pt");
        instance.getUtilizador().setPassword("dE2.");
        boolean expResult = false;
        boolean result = instance.equals(a);
        assertEquals(expResult, result);

    }

    /**
     * Test of equals method, of class FAE.
     */
    @Test
    public void testEqualsMesmaRef() {

        System.out.println("TesteEquals");
        Utilizador u= new Utilizador();
        FAE instance = new FAE(u);
        Object a = instance;    
        boolean expResult = true;
        boolean result = instance.equals(a);
        assertEquals(expResult, result);
    }

   
    
}
