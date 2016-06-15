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
public class DemonstracaoCandidaturasAvaliadasEstadoTest {
    
    public DemonstracaoCandidaturasAvaliadasEstadoTest() {
    }

    /**
     * Test of setCandidaturasDecididas method, of class DemonstracaoCandidaturasAvaliadasEstado.
     */
    @Test
    public void testSetCandidaturasDecididas() {
        System.out.println("setCandidaturasDecididas");
        Demonstracao demo = new Demonstracao();
        demo.getEstado().setCriada();
        demo.setRealizacao(true);
        demo.getEstado().setConfirmada();
        demo.getEstado().setCandidaturasAbertas();
        demo.getEstado().setCandidaturasFechadas();
        demo.getEstado().setConflitosDetetados();
        demo.getEstado().setConflitosAtualizados();
        demo.getEstado().setCandidaturasAtribuidas();
        demo.getEstado().setCandidaturasAvaliadas();
        DemonstracaoCandidaturasAvaliadasEstado instance = new DemonstracaoCandidaturasAvaliadasEstado(demo);
        boolean expResult = true;
        boolean result = instance.setCandidaturasDecididas();
        assertEquals(expResult, result);
    }

    /**
     * Test of valida method, of class DemonstracaoCandidaturasAvaliadasEstado.
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
        demo.getEstado().setCandidaturasAvaliadas();
        DemonstracaoCandidaturasAvaliadasEstado instance = new DemonstracaoCandidaturasAvaliadasEstado(demo);
        boolean expResult = true;
        boolean result = instance.valida();
        assertEquals(expResult, result);
    }
    
}
