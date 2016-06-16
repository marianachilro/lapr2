/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

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
public class RecursoTest {

    /**
     * Test of getNome method, of class Recurso.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Recurso instance = new Recurso();
        String expResult = "nome";
        instance.setNome(expResult);
        String result = instance.getNome();
        assertEquals(expResult, result);
    }

    /**
     * Test of valida method, of class Recurso.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        Recurso instance = new Recurso();
        boolean expResult = true;
        boolean result = instance.valida();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Recurso.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = new Recurso();
        Recurso instance = new Recurso();
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
}
