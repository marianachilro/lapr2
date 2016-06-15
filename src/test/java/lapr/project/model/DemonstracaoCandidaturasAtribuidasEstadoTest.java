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
public class DemonstracaoCandidaturasAtribuidasEstadoTest {
    
    public DemonstracaoCandidaturasAtribuidasEstadoTest() {
    }

    /**
     * Test of setCandidaturasAtribuidas method, of class DemonstracaoCandidaturasAtribuidasEstado.
     */
    @Test
    public void testSetCandidaturasAtribuidas() {
        System.out.println("setCandidaturasAtribuidas");
        Demonstracao demo = new Demonstracao();
        demo.getEstado().setCriada();
        demo.setRealizacao(true);
        demo.getEstado().setConfirmada();
        demo.getEstado().setCandidaturasAbertas();
        demo.getEstado().setCandidaturasFechadas();
        demo.getEstado().setConflitosDetetados();
        demo.getEstado().setConflitosAtualizados();
        demo.getEstado().setCandidaturasAtribuidas();
        DemonstracaoCandidaturasAtribuidasEstado instance = new DemonstracaoCandidaturasAtribuidasEstado(demo);
        boolean expResult = true;
        boolean result = instance.setCandidaturasAtribuidas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCandidaturasAvaliadas method, of class DemonstracaoCandidaturasAtribuidasEstado.
     */
    @Test
    public void testSetCandidaturasAvaliadas() {
        System.out.println("setCandidaturasAvaliadas");
        Demonstracao demo = new Demonstracao();
        demo.getEstado().setCriada();
        demo.setRealizacao(true);
        demo.getEstado().setConfirmada();
        demo.getEstado().setCandidaturasAbertas();
        demo.getEstado().setCandidaturasFechadas();
        demo.getEstado().setConflitosDetetados();
        demo.getEstado().setConflitosAtualizados();
        demo.getEstado().setCandidaturasAtribuidas();
        DemonstracaoCandidaturasAtribuidasEstado instance = new DemonstracaoCandidaturasAtribuidasEstado(demo);
        boolean expResult = true;
        boolean result = instance.setCandidaturasAvaliadas();
        assertEquals(expResult, result);
    }

    /**
     * Test of valida method, of class DemonstracaoCandidaturasAtribuidasEstado.
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
        demo.getEstado().setConflitosAtualizados();
        demo.getEstado().setCandidaturasAtribuidas();
        DemonstracaoCandidaturasAtribuidasEstado instance = new DemonstracaoCandidaturasAtribuidasEstado(demo);
        boolean expResult = true;
        boolean result = instance.valida();
        assertEquals(expResult, result);
    }
    
}
