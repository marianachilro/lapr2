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
public class ListaRecursosTest {

    /**
     * Test of getListaRecursos method, of class ListaRecursos.
     */
    @Test
    public void testGetListaRecursos() {
        System.out.println("getListaRecursos");
        ListaRecursos instance = new ListaRecursos();
        List<Recurso> expResult = new ArrayList<>();
        Recurso r = new Recurso();
        instance.addRecurso(r);
        expResult.add(r);
        List<Recurso> result = instance.getListaRecursos();
        assertEquals(expResult, result);
    }

    /**
     * Test of novoRecurso method, of class ListaRecursos.
     */
    @Test
    public void testNovoRecurso() {
        System.out.println("novoRecurso");
        ListaRecursos instance = new ListaRecursos();
        Recurso expResult = new Recurso();
        Recurso result = instance.novoRecurso();
        assertEquals(expResult, result);
    }

    /**
     * Test of validaRecurso method, of class ListaRecursos.
     */
    @Test
    public void testValidaRecurso() {
        System.out.println("validaRecurso");
        Recurso r = new Recurso();
        ListaRecursos instance = new ListaRecursos();
        boolean expResult = true;
        instance.addRecurso(r);
        boolean result = instance.validaRecurso(r);
        assertEquals(expResult, result);
    }

    /**
     * Test of addRecurso method, of class ListaRecursos.
     */
    @Test
    public void testAddRecurso() {
        System.out.println("addRecurso");
        Recurso r = new Recurso();
        ListaRecursos instance = new ListaRecursos();
        boolean expResult = true;
        boolean result = instance.addRecurso(r);
        assertEquals(expResult, result);
    }

    /**
     * Test of registaRecurso method, of class ListaRecursos.
     */
    @Test
    public void testRegistaRecurso() {
        System.out.println("registaRecurso");
        Recurso r = new Recurso();
        ListaRecursos instance = new ListaRecursos();
        boolean expResult = true;
        boolean result = instance.registaRecurso(r);
        assertEquals(expResult, result);
    }
    
}
