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
public class OrganizadorTest {

    /**
     * Test of isUtilizador method, of class Organizador.
     */
    @Test
    public void testIsUtilizador() {
        System.out.println("isUtilizador");
        Utilizador u = new Utilizador();
        Organizador instance = new Organizador();
        boolean expResult = true;
        instance.setUtilizador(u);
        boolean result = instance.isUtilizador(u);
        assertEquals(expResult, result);
    }

    /**
     * Test of getID method, of class Organizador.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Utilizador u = new Utilizador();
        Organizador instance = new Organizador();
        instance.setUtilizador(u);
        String expResult = instance.getUtilizador().getEmail();
        String result = instance.getID();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUtilizador method, of class Organizador.
     */
    @Test
    public void testGetUtilizador() {
        System.out.println("getUtilizador");
        Organizador instance = new Organizador();
        Utilizador expResult = new Utilizador();
        instance.setUtilizador(expResult);
        Utilizador result = instance.getUtilizador();
        assertEquals(expResult, result);
    }
    
}
