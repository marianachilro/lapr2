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
public class DemonstracaoCriadaEstadoTest {
    
    public DemonstracaoCriadaEstadoTest() {
    }

    /**
     * Test of setCriada method, of class DemonstracaoCriadaEstado.
     */
    @Test
    public void testSetCriada() {
        System.out.println("setCriada");
        Demonstracao demo = new Demonstracao();
        demo.getEstado().setCriada();
        DemonstracaoCriadaEstado instance = new DemonstracaoCriadaEstado(demo);
        boolean expResult = true;
        boolean result = instance.setCriada();
    }

    /**
     * Test of setConfirmada method, of class DemonstracaoCriadaEstado.
     */
    @Test
    public void testSetConfirmada() {
        System.out.println("setConfirmada");
        Demonstracao demo = new Demonstracao();
        demo.getEstado().setCriada();
        demo.setRealizacao(true);
        DemonstracaoCriadaEstado instance = new DemonstracaoCriadaEstado(demo);
        boolean expResult = true;
        boolean result = instance.setConfirmada();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNaoConfirmada method, of class DemonstracaoCriadaEstado.
     */
    @Test
    public void testSetNaoConfirmada() {
        System.out.println("setNaoConfirmada");
        Demonstracao demo = new Demonstracao();
        demo.getEstado().setCriada();
        DemonstracaoCriadaEstado instance = new DemonstracaoCriadaEstado(demo);
        boolean expResult = true;
        boolean result = instance.setNaoConfirmada();
        assertEquals(expResult, result);
    }

    /**
     * Test of valida method, of class DemonstracaoCriadaEstado.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        Demonstracao demo = new Demonstracao();
        demo.getEstado().setCriada();
        demo.setRealizacao(true);
        DemonstracaoCriadaEstado instance = new DemonstracaoCriadaEstado(demo);
        boolean expResult = true;
        boolean result = instance.valida();
        assertEquals(expResult, result);
    }
    
}
