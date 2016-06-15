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
public class KeywordTest {

    /**
     * Test of getPalavra method, of class Keyword.
     */
    @Test
    public void testGetPalavraAndSetPalavra() {
        System.out.println("testePalavra");
        Keyword instance = new Keyword();
        String palavra = "";
        instance.setPalavra(palavra);
        String expResult = "";
        String result = instance.getPalavra();
        assertEquals(expResult, result);

    }

    /**
     * Test of equals method, of class Keyword.
     */
    @Test
    public void testEquals() {

        System.out.println("TesteEquals");

        Object a = new Keyword();
        Keyword instance = new Keyword();
        boolean expResult = true;
        boolean result = instance.equals(a);
        assertEquals(expResult, result);

    }

    /**
     * Test of equals method, of class Keyword.
     */
    @Test
    public void testEqualsAtributosDiferentes() {

        System.out.println("TesteEquals");

        Object a = new Keyword();
        Keyword instance = new Keyword();
        instance.setPalavra("palavra");
        boolean expResult = false;
        boolean result = instance.equals(a);
        assertEquals(expResult, result);

    }

    /**
     * Test of equals method, of class Keyword.
     */
    @Test
    public void testEqualsMesmaRef() {

        System.out.println("TesteEquals");

        Keyword instance = new Keyword();
        Object a = instance;
        boolean expResult = true;
        boolean result = instance.equals(a);
        assertEquals(expResult, result);
    }

}
