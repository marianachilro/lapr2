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
 * @author Rita
 */
public class RegistoRecursosTest {

    /**
     * Test of getListaRecursos method, of class RegistoRecursos.
     */
    @Test
    public void testGetAndSetListaRecursos() {
        System.out.println("getListaRecursos");
        RegistoRecursos instance = new RegistoRecursos();
        List<Recurso> expResult = new ArrayList<>();
        instance.setListaRecursos(expResult);
        List<Recurso> result = instance.getListaRecursos();
        assertEquals(expResult, result);
    }

    /**
     * Test of validaRecurso method, of class RegistoRecursos.
     */
    @Test
    public void testValidaRecurso() {
        System.out.println("validaRecurso");
        Recurso r = new Recurso();
        RegistoRecursos instance = new RegistoRecursos();
        instance.addRecurso(r);
        boolean expResult = true;
        boolean result = instance.validaRecurso(r);
        assertEquals(expResult, result);
    }

    /**
     * Test of addRecurso method, of class RegistoRecursos.
     */
    @Test
    public void testAddRecurso() {
        System.out.println("addRecurso");
        Recurso r = new Recurso();
        RegistoRecursos instance = new RegistoRecursos();
        boolean expResult = true;
        boolean result = instance.addRecurso(r);
        assertEquals(expResult, result);
    }

    /**
     * Test of newRecurso method, of class RegistoRecursos.
     */
    @Test
    public void testNewRecurso() {
        System.out.println("newRecurso");
        RegistoRecursos instance = new RegistoRecursos();
        Recurso expResult = new Recurso();
        Recurso result = instance.newRecurso();
        assertEquals(expResult, result);
    }

}
