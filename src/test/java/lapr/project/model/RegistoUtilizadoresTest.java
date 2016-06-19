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
public class RegistoUtilizadoresTest {

    /**
     * Test of getListaUtilizadores method, of class RegistoUtilizadores.
     */
    @Test
    public void testGetListaUtilizadores() {
        System.out.println("getListaUtilizadores");
        RegistoUtilizadores instance = new RegistoUtilizadores();
        List<Utilizador> expResult = new ArrayList<>();
        instance.setListaUtilizadores(expResult);
        List<Utilizador> result = instance.getListaUtilizadores();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUtilizador method, of class RegistoUtilizadores.
     */
    @Test
    public void testGetUtilizador() {
        System.out.println("getUtilizador");
        String username = "";
        RegistoUtilizadores instance = new RegistoUtilizadores();
        Utilizador expResult = new Utilizador();
        instance.addUtilizador(expResult);
        Utilizador result = instance.getUtilizador(username);
        assertEquals(expResult, result);
    }

    /**
     * Test of validaUtilizador method, of class RegistoUtilizadores.
     */
    @Test
    public void testValidaUtilizador() {
        System.out.println("validaUtilizador");
        Utilizador u = new Utilizador();
        RegistoUtilizadores instance = new RegistoUtilizadores();
        boolean expResult = true;
        instance.addUtilizador(u);
        boolean result = instance.validaUtilizador(u);
        assertEquals(expResult, result);
    }

    /**
     * Test of addUtilizador method, of class RegistoUtilizadores.
     */
    @Test
    public void testAddUtilizador() {
        System.out.println("addUtilizador");
        Utilizador u = null;
        RegistoUtilizadores instance = new RegistoUtilizadores();
        boolean expResult = true;
        boolean result = instance.addUtilizador(u);
        assertEquals(expResult, result);
    }

    /**
     * Test of confirmaUtilizador method, of class RegistoUtilizadores.
     */
    @Test
    public void testConfirmaUtilizador() {
        System.out.println("confirmaUtilizador");
        Utilizador u = new Utilizador();
        RegistoUtilizadores instance = new RegistoUtilizadores();
        boolean expResult = true;
        boolean result = instance.confirmaUtilizador(u);
        assertEquals(expResult, result);
    }
    

    /**
     * Test of novoUtilizador method, of class RegistoUtilizadores.
     */
    @Test
    public void testNovoUtilizador() {
        System.out.println("novoUtilizador");
        RegistoUtilizadores instance = new RegistoUtilizadores();
        Utilizador expResult = new Utilizador();
        Utilizador result = instance.novoUtilizador();
        assertEquals(expResult, result);
    }
}
