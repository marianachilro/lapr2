/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.CentroExposicoes;
import lapr.project.model.Recurso;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marianachilro
 */
public class DefinirRecursosControllerTest {
    
    public DefinirRecursosControllerTest() {
    }

    /**
     * Test of newRecurso method, of class DefinirRecursosController.
     */
    @Test
    public void testNewRecurso() {
        System.out.println("newRecurso");
        CentroExposicoes centro = new CentroExposicoes();
        Recurso r = new Recurso();
        DefinirRecursosController instance = new DefinirRecursosController(centro);
        Recurso expResult = r;
        Recurso result = instance.newRecurso();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRecurso method, of class DefinirRecursosController.
     */
    @Test
    public void testSetRecurso() {
        System.out.println("setRecurso");
        CentroExposicoes centro = new CentroExposicoes();
        String nome = "ola";
        DefinirRecursosController instance = new DefinirRecursosController(centro);
        instance.newRecurso();
        instance.setRecurso(nome);
    }

    /**
     * Test of validaRecurso method, of class DefinirRecursosController.
     */
    @Test
    public void testValidaRecurso() {
        System.out.println("validaRecurso");
        CentroExposicoes centro = new CentroExposicoes();
        DefinirRecursosController instance = new DefinirRecursosController(centro);
        boolean expResult = false;
        instance.newRecurso();
        instance.setRecurso("nome");
        boolean result = instance.validaRecurso();
        assertEquals(expResult, result);
    }

    /**
     * Test of addRecurso method, of class DefinirRecursosController.
     */
    @Test
    public void testAddRecurso() {
        System.out.println("addRecurso");
        CentroExposicoes centro = new CentroExposicoes();
        DefinirRecursosController instance = new DefinirRecursosController(centro);
        boolean expResult = true;
        instance.newRecurso();
        instance.setRecurso("nome");
        boolean result = instance.addRecurso();
        assertEquals(expResult, result);
    }
    
}
