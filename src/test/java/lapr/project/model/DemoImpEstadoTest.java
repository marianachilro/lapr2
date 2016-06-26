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
 * @author miniondevil
 */
public class DemoImpEstadoTest {

    public DemoImpEstadoTest() {
    }

    /**
     * Test of getDemo method, of class DemoImpEstado.
     */
    @Test
    public void testGetDemo() {
        System.out.println("getDemo");
        Demonstracao d1 = new Demonstracao();
        DemoImpEstado instance = new DemoImpEstado(d1,"");
        Demonstracao expResult = d1;
        Demonstracao result = instance.getDemo();
        assertEquals(expResult, result);

    }

    /**
     * Test of setCriada method, of class DemoImpEstado.
     */
    @Test
    public void testSetCriada() {
        System.out.println("setCriada");

        Demonstracao d1 = new Demonstracao();
        DemoImpEstado instance = new DemoImpEstado(d1,"");
        boolean expResult = false;
        boolean result = instance.setCriada();
        assertEquals(expResult, result);

    }

    /**
     * Test of setConfirmada method, of class DemoImpEstado.
     */
    @Test
    public void testSetConfirmada() {
        System.out.println("setConfirmada");
        Demonstracao d1 = new Demonstracao();
        DemoImpEstado instance = new DemoImpEstado(d1,"");
        boolean expResult = false;
        boolean result = instance.setConfirmada();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNaoConfirmada method, of class DemoImpEstado.
     */
    @Test
    public void testSetNaoConfirmada() {
        System.out.println("setNaoConfirmada");
        Demonstracao d1 = new Demonstracao();
        DemoImpEstado instance = new DemoImpEstado(d1,"");
        boolean expResult = false;
        boolean result = instance.setNaoConfirmada();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCandidaturasAbertas method, of class DemoImpEstado.
     */
    @Test
    public void testSetCandidaturasAbertas() {
        System.out.println("setCandidaturasAbertas");
        Demonstracao d1 = new Demonstracao();
        DemoImpEstado instance = new DemoImpEstado(d1,"");
        boolean expResult = false;
        boolean result = instance.setCandidaturasAbertas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCandidaturasFechadas method, of class DemoImpEstado.
     */
    @Test
    public void testSetCandidaturasFechadas() {
        System.out.println("setCandidaturasFechadas");
        Demonstracao d1 = new Demonstracao();
        DemoImpEstado instance = new DemoImpEstado(d1,"");
        boolean expResult = false;
        boolean result = instance.setCandidaturasFechadas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setConflitosDetetados method, of class DemoImpEstado.
     */
    @Test
    public void testSetConflitosDetetados() {
        System.out.println("setConflitosDetetados");
        Demonstracao d1 = new Demonstracao();
        DemoImpEstado instance = new DemoImpEstado(d1,"");
        boolean expResult = false;
        boolean result = instance.setConflitosDetetados();
        assertEquals(expResult, result);
    }

    /**
     * Test of setConflitosAtualizados method, of class DemoImpEstado.
     */
    @Test
    public void testSetConflitosAtualizados() {
        System.out.println("setConflitosAtualizados");
        Demonstracao d1 = new Demonstracao();
        DemoImpEstado instance = new DemoImpEstado(d1,"");
        boolean expResult = false;
        boolean result = instance.setConflitosAtualizados();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCandidaturasAtribuidas method, of class DemoImpEstado.
     */
    @Test
    public void testSetCandidaturasAtribuidas() {
        System.out.println("setCandidaturasAtribuidas");
        Demonstracao d1 = new Demonstracao();
        DemoImpEstado instance = new DemoImpEstado(d1,"");
        boolean expResult = false;
        boolean result = instance.setCandidaturasAtribuidas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCandidaturasAvaliadas method, of class DemoImpEstado.
     */
    @Test
    public void testSetCandidaturasAvaliadas() {
        System.out.println("setCandidaturasAvaliadas");
        Demonstracao d1 = new Demonstracao();
        DemoImpEstado instance = new DemoImpEstado(d1,"");
        boolean expResult = false;
        boolean result = instance.setCandidaturasAvaliadas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCandidaturasDecididas method, of class DemoImpEstado.
     */
    @Test
    public void testSetCandidaturasDecididas() {
        System.out.println("setCandidaturasDecididas");
        Demonstracao d1 = new Demonstracao();
        DemoImpEstado instance = new DemoImpEstado(d1,"");
        boolean expResult = false;
        boolean result = instance.setCandidaturasDecididas();
        assertEquals(expResult, result);
    }

}
