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
public class DemonstracaoNaoConfirmadaEstadoTest {
    
    public DemonstracaoNaoConfirmadaEstadoTest() {
    }

    /**
     * Test of setNaoConfirmada method, of class DemonstracaoNaoConfirmadaEstado.
     */
    @Test
    public void testSetNaoConfirmada() {
        System.out.println("setNaoConfirmada");
        Demonstracao demo = new Demonstracao();
        demo.getEstado().setCriada();
        demo.setRealizacao(false);
        demo.getEstado().setNaoConfirmada();
        DemonstracaoNaoConfirmadaEstado instance = new DemonstracaoNaoConfirmadaEstado(demo);
        boolean expResult = true;
        boolean result = instance.setNaoConfirmada();
        assertEquals(expResult, result);
    }
    
}
