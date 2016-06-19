/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rita
 */
public class ListaKeywordsTest {

    /**
     * Test of getListaKeywords method, of class ListaKeywords.
     */
    @Test
    public void testGetListaKeywords() {
        System.out.println("getListaKeywords");
        ListaKeywords instance = new ListaKeywords();
        List<Keyword> expResult = new ArrayList<>();
        Keyword k = new Keyword();
        expResult.add(k);
        instance.addKeyword(k);
        List<Keyword> result = instance.getListaKeywords();
        assertEquals(expResult, result);
    }

//    /**
//     * Test of setListaKeywords method, of class ListaKeywords.
//     */
//    @Test
//    public void testSetListaKeywords() {
//        System.out.println("setListaKeywords");
//        List<Keyword> listaKeywords = null;
//        ListaKeywords instance = new ListaKeywords();
//        instance.setListaKeywords(listaKeywords);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of novaKeyword method, of class ListaKeywords.
     */
    @Test
    public void testNovaKeyword() {
        System.out.println("novaKeyword");
        String keyword="asd";
        ListaKeywords instance = new ListaKeywords();
        Keyword expResult = new Keyword(keyword);
        Keyword result = instance.novaKeyword(keyword);
        assertEquals(expResult, result);
    }

    /**
     * Test of validaKeyword method, of class ListaKeywords.
     */
    @Test
    public void testValidaKeyword() {
        System.out.println("validaKeyword");
        Keyword k = new Keyword();
        ListaKeywords instance = new ListaKeywords();
        boolean expResult = true;
        instance.addKeyword(k);
        boolean result = instance.validaKeyword(k);
        assertEquals(expResult, result);
    }

    /**
     * Test of addKeyword method, of class ListaKeywords.
     */
    @Test
    public void testAddKeyword() {
        System.out.println("addKeyword");
        Keyword k = new Keyword();
        ListaKeywords instance = new ListaKeywords();
        boolean expResult = true;
        boolean result = instance.addKeyword(k);
        assertEquals(expResult, result);
    }

    /**
     * Test of registaKeyword method, of class ListaKeywords.
     */
    @Test
    public void testRegistaKeyword() {
        System.out.println("registaKeyword");
        Keyword k = new Keyword();
        ListaKeywords instance = new ListaKeywords();
        boolean expResult = true;
        boolean result = instance.registaKeyword(k);
        assertEquals(expResult, result);
    }

    /**
     * Test of tamanho method, of class ListaKeywords.
     */
    @Test
    public void testTamanho() {
        System.out.println("tamanho");
        ListaKeywords instance = new ListaKeywords();
        int expResult = 1;
        Keyword k = new Keyword();
        instance.addKeyword(k);
        int result = instance.tamanho();
        assertEquals(expResult, result);
    }
    
}
