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
public class DemonstracaoConfirmadaEstadoTest {
    
    public DemonstracaoConfirmadaEstadoTest() {
    }

    /**
     * Test of setConfirmada method, of class DemonstracaoConfirmadaEstado.
     */
    @Test
    public void testSetConfirmada() {
        System.out.println("setConfirmada");
        Demonstracao demo = new Demonstracao();
        demo.getEstado().setCriada();
        demo.setRealizacao(true);
        demo.getEstado().setConfirmada();
        DemonstracaoConfirmadaEstado instance = new DemonstracaoConfirmadaEstado(demo);
        boolean expResult = true;
        boolean result = instance.setConfirmada();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCandidaturasAbertas method, of class DemonstracaoConfirmadaEstado.
     */
    @Test
    public void testSetCandidaturasAbertas() {
        System.out.println("setCandidaturasAbertas");
        Demonstracao demo = new Demonstracao();
        demo.getEstado().setCriada();
        demo.setRealizacao(true);
        demo.getEstado().setConfirmada();
        DemonstracaoConfirmadaEstado instance = new DemonstracaoConfirmadaEstado(demo);
        boolean expResult = true;
        boolean result = instance.setCandidaturasAbertas();
        assertEquals(expResult, result);
    }

    /**
     * Test of valida method, of class DemonstracaoConfirmadaEstado.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        Demonstracao demo = new Demonstracao();
        demo.getEstado().setCriada();
        demo.setRealizacao(true);
        demo.getEstado().setConfirmada();
        DemonstracaoConfirmadaEstado instance = new DemonstracaoConfirmadaEstado(demo);
        boolean expResult = true;
        boolean result = instance.valida();
        assertEquals(expResult, result);
    }
    
}
