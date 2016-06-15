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
 * @author marianachilro
 */
public class DemonstracaoInicialEstadoTest {
    
    public DemonstracaoInicialEstadoTest() {
    }

    /**
     * Test of setCriada method, of class DemonstracaoInicialEstado.
     */
    @Test
    public void testSetCriada() {
        System.out.println("setCriada");
        Demonstracao demo = new Demonstracao();
        DemonstracaoInicialEstado instance = new DemonstracaoInicialEstado(demo);
        boolean expResult = true;
        boolean result = instance.setCriada();
        assertEquals(expResult, result);
    }

    /**
     * Test of valida method, of class DemonstracaoInicialEstado.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        Demonstracao demo = new Demonstracao();
        DemonstracaoInicialEstado instance = new DemonstracaoInicialEstado(demo);
        boolean expResult = true;
        boolean result = instance.valida();
        assertEquals(expResult, result);
    }
    
}
