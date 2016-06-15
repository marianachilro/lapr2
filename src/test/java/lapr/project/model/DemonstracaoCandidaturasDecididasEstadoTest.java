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
public class DemonstracaoCandidaturasDecididasEstadoTest {
    
    public DemonstracaoCandidaturasDecididasEstadoTest() {
    }

    /**
     * Test of setCandidaturasDecididas method, of class DemonstracaoCandidaturasDecididasEstado.
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
        demo.getEstado().setCandidaturasDecididas();
        DemonstracaoCandidaturasDecididasEstado instance = new DemonstracaoCandidaturasDecididasEstado(demo);
        boolean expResult = true;
        boolean result = instance.setCandidaturasDecididas();
        assertEquals(expResult, result);
    }
    
}
