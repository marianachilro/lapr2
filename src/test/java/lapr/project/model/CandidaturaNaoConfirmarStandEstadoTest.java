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
public class CandidaturaNaoConfirmarStandEstadoTest {
    
    public CandidaturaNaoConfirmarStandEstadoTest() {
    }

    /**
     * Test of setNaoConfirmarStand method, of class CandidaturaNaoConfirmarStandEstado.
     */
    @Test
    public void testSetNaoConfirmarStand() {
        System.out.println("setNaoConfirmarStand");
        CandidaturaGeral cand = new CandidaturaGeral();
        cand.getEstado().setEmSubmissao();
        cand.getEstado().setAlterada();
        cand.getEstado().setCompleta();
        cand.getEstado().setConflitosDetetados();
        cand.getEstado().setConflitosAlterados();
        cand.getEstado().setEmAvaliacao();
        cand.getEstado().setAvaliada();
        cand.getEstado().setAceite();
        cand.getEstado().setNaoConfirmarStand();
        CandidaturaNaoConfirmarStandEstado instance = new CandidaturaNaoConfirmarStandEstado(cand);
        boolean expResult = true;
        boolean result = instance.setNaoConfirmarStand();
        assertEquals(expResult, result);
    }
    
}
