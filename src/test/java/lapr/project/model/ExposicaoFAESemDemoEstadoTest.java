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
public class ExposicaoFAESemDemoEstadoTest {
    
    public ExposicaoFAESemDemoEstadoTest() {
    }

    /**
     * Test of setFaeSemDemo method, of class ExposicaoFAESemDemoEstado.
     */
    @Test
    public void testSetFaeSemDemo() {
        System.out.println("setFaeSemDemo");
        Exposicao expo = new Exposicao();
        expo.getEstado().setCriada();
        expo.getEstado().setFaeSemDemo();
        ExposicaoFAESemDemoEstado instance = new ExposicaoFAESemDemoEstado(expo);
        boolean expResult = true;
        boolean result = instance.setFaeSemDemo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCompleta method, of class ExposicaoFAESemDemoEstado.
     */
    @Test
    public void testSetCompleta() {
        System.out.println("setCompleta");
        Exposicao expo = new Exposicao();
        expo.getEstado().setCriada();
        expo.getEstado().setFaeSemDemo();
        ExposicaoFAESemDemoEstado instance = new ExposicaoFAESemDemoEstado(expo);
        boolean expResult = true;
        boolean result = instance.setCompleta();
        assertEquals(expResult, result);
    }

    /**
     * Test of valida method, of class ExposicaoFAESemDemoEstado.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        Exposicao expo = new Exposicao();
        expo.getEstado().setCriada();
        expo.getEstado().setFaeSemDemo();
        ExposicaoFAESemDemoEstado instance = new ExposicaoFAESemDemoEstado(expo);
        boolean expResult = true;
        boolean result = instance.valida();
        assertEquals(expResult, result);
    }
    
}
