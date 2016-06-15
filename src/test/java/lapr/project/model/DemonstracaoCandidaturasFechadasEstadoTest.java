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
public class DemonstracaoCandidaturasFechadasEstadoTest {
    
    public DemonstracaoCandidaturasFechadasEstadoTest() {
    }

    /**
     * Test of setCandidaturasFechadas method, of class DemonstracaoCandidaturasFechadasEstado.
     */
    @Test
    public void testSetCandidaturasFechadas() {
        System.out.println("setCandidaturasFechadas");
        Demonstracao demo = new Demonstracao();
        demo.getEstado().setCriada();
        demo.setRealizacao(true);
        demo.getEstado().setConfirmada();
        demo.getEstado().setCandidaturasAbertas();
        demo.getEstado().setCandidaturasFechadas();
        DemonstracaoCandidaturasFechadasEstado instance = new DemonstracaoCandidaturasFechadasEstado(demo);
        boolean expResult = true;
        boolean result = instance.setCandidaturasFechadas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setConflitosDetetados method, of class DemonstracaoCandidaturasFechadasEstado.
     */
    @Test
    public void testSetConflitosDetetados() {
        System.out.println("setConflitosDetetados");
        Demonstracao demo = new Demonstracao();
        demo.getEstado().setCriada();
        demo.setRealizacao(true);
        demo.getEstado().setConfirmada();
        demo.getEstado().setCandidaturasAbertas();
        demo.getEstado().setCandidaturasFechadas();
        DemonstracaoCandidaturasFechadasEstado instance = new DemonstracaoCandidaturasFechadasEstado(demo);
        boolean expResult = true;
        boolean result = instance.setConflitosDetetados();
        assertEquals(expResult, result);
    }

    /**
     * Test of valida method, of class DemonstracaoCandidaturasFechadasEstado.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        Demonstracao demo = new Demonstracao();
        demo.getEstado().setCriada();
        demo.setRealizacao(true);
        demo.getEstado().setConfirmada();
        demo.getEstado().setCandidaturasAbertas();
        demo.getEstado().setCandidaturasFechadas();
        DemonstracaoCandidaturasFechadasEstado instance = new DemonstracaoCandidaturasFechadasEstado(demo);
        boolean expResult = true;
        boolean result = instance.valida();
        assertEquals(expResult, result);
    }
    
}
