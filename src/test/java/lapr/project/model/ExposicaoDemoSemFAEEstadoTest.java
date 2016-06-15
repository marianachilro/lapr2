/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import lapr.project.utils.Data;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marianachilro
 */
public class ExposicaoDemoSemFAEEstadoTest {
    
    public ExposicaoDemoSemFAEEstadoTest() {
    }

    /**
     * Test of setDemoSemFae method, of class ExposicaoDemoSemFAEEstado.
     */
    @Test
    public void testSetDemoSemFae() {
        System.out.println("setDemoSemFae");
        Exposicao expo = new Exposicao();
        expo.getEstado().setCriada();
        expo.getEstado().setDemoSemFae();
        ExposicaoDemoSemFAEEstado instance = new ExposicaoDemoSemFAEEstado(expo);
        boolean expResult = true;
        boolean result = instance.setDemoSemFae();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCompleta method, of class ExposicaoDemoSemFAEEstado.
     */
    @Test
    public void testSetCompleta() {
        System.out.println("setCompleta");
        Exposicao expo = new Exposicao();
        expo.getEstado().setCriada();
        expo.getEstado().setDemoSemFae();
        ExposicaoDemoSemFAEEstado instance = new ExposicaoDemoSemFAEEstado(expo);
        boolean expResult = true;
        boolean result = instance.setCompleta();
        assertEquals(expResult, result);
    }

    /**
     * Test of valida method, of class ExposicaoDemoSemFAEEstado.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        Exposicao expo = new Exposicao();
        expo.getEstado().setCriada();
        expo.getEstado().setDemoSemFae();
        ExposicaoDemoSemFAEEstado instance = new ExposicaoDemoSemFAEEstado(expo);
        boolean expResult = true;
        boolean result = instance.valida();
        assertEquals(expResult, result);
    }
    
}
