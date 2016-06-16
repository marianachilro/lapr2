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
public class ListaOrganizadoresTest {
    
    /**
     * Test of getListaOrganizadores method, of class ListaOrganizadores.
     */
    @Test
    public void testGetListaOrganizadores() {
        System.out.println("getListaOrganizadores");
        ListaOrganizadores instance = new ListaOrganizadores();
        List<Organizador> expResult = new ArrayList<>();
        Organizador o = new Organizador();
        expResult.add(o);
        instance.add(o);
        List<Organizador> result = instance.getListaOrganizadores();
        assertEquals(expResult, result);
    }

//    /**
//     * Test of setListaOrganizadores method, of class ListaOrganizadores.
//     */
//    @Test
//    public void testSetListaOrganizadores() {
//        System.out.println("setListaOrganizadores");
//        List<Organizador> listaOrganizadores = new ArrayList<>();
//        ListaOrganizadores instance = new ListaOrganizadores();
//        instance.setListaOrganizadores(listaOrganizadores);
//    }

    /**
     * Test of hasOrganizador method, of class ListaOrganizadores.
     */
    @Test
    public void testHasOrganizador() {
        System.out.println("hasOrganizador");
        Utilizador u = new Utilizador();
        Organizador o = new Organizador(u);
        ListaOrganizadores instance = new ListaOrganizadores();
        boolean expResult = true;
        instance.add(o);
        boolean result = instance.hasOrganizador(u);
        assertEquals(expResult, result);
    }

    /**
     * Test of validaOrganizador method, of class ListaOrganizadores.
     */
    @Test
    public void testValidaOrganizador() {
        System.out.println("validaOrganizador");
        Organizador o = new Organizador();
        ListaOrganizadores instance = new ListaOrganizadores();
        boolean expResult = true;
        instance.add(o);
        boolean result = instance.validaOrganizador(o);
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class ListaOrganizadores.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Organizador org = new Organizador();
        ListaOrganizadores instance = new ListaOrganizadores();
        boolean expResult = true;
        boolean result = instance.add(org);
        assertEquals(expResult, result);
    }

    /**
     * Test of registaOrganizador method, of class ListaOrganizadores.
     */
    @Test
    public void testRegistaOrganizador() {
        System.out.println("registaOrganizador");
        Organizador org = new Organizador();
        ListaOrganizadores instance = new ListaOrganizadores();
        boolean expResult = false;
        instance.add(org);
        boolean result = instance.registaOrganizador(org);
        assertEquals(expResult, result);
    }

    /**
     * Test of novoOrganizador method, of class ListaOrganizadores.
     */
    @Test
    public void testNovoOrganizador() {
        System.out.println("novoOrganizador");
        Utilizador u = new Utilizador();
        ListaOrganizadores instance = new ListaOrganizadores();
        Organizador expResult = new Organizador(u);
        Organizador result = instance.novoOrganizador(u);
        assertEquals(expResult, result);
    }
    
}
