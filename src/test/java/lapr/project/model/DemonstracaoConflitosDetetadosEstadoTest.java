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
public class DemonstracaoConflitosDetetadosEstadoTest {
    
    public DemonstracaoConflitosDetetadosEstadoTest() {
    }

    /**
     * Test of setConflitosDetetados method, of class DemonstracaoConflitosDetetadosEstado.
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
        demo.getEstado().setConflitosDetetados();
        DemonstracaoConflitosDetetadosEstado instance = new DemonstracaoConflitosDetetadosEstado(demo);
        boolean expResult = true;
        boolean result = instance.setConflitosDetetados();
        assertEquals(expResult, result);
    }

    /**
     * Test of setConflitosAtualizados method, of class DemonstracaoConflitosDetetadosEstado.
     */
    @Test
    public void testSetConflitosAtualizados() {
        System.out.println("setConflitosAtualizados");
        Demonstracao demo = new Demonstracao();
        demo.getEstado().setCriada();
        demo.setRealizacao(true);
        demo.getEstado().setConfirmada();
        demo.getEstado().setCandidaturasAbertas();
        demo.getEstado().setCandidaturasFechadas();
        demo.getEstado().setConflitosDetetados();
        DemonstracaoConflitosDetetadosEstado instance = new DemonstracaoConflitosDetetadosEstado(demo);
        boolean expResult = true;
        boolean result = instance.setConflitosAtualizados();
        assertEquals(expResult, result);
    }

    /**
     * Test of valida method, of class DemonstracaoConflitosDetetadosEstado.
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
        demo.getEstado().setConflitosDetetados();
        DemonstracaoConflitosDetetadosEstado instance = new DemonstracaoConflitosDetetadosEstado(demo);
        boolean expResult = true;
        boolean result = instance.valida();
        assertEquals(expResult, result);
    }
    
}
