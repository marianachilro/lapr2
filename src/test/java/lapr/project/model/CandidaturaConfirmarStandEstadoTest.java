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
public class CandidaturaConfirmarStandEstadoTest {
    
    public CandidaturaConfirmarStandEstadoTest() {
    }

    /**
     * Test of setConfirmarStand method, of class CandidaturaConfirmarStandEstado.
     */
    @Test
    public void testSetConfirmarStand() {
        System.out.println("setConfirmarStand");
        CandidaturaGeral cand = new CandidaturaGeral();
        cand.getEstado().setEmSubmissao();
        cand.getEstado().setAlterada();
        cand.getEstado().setCompleta();
        cand.getEstado().setConflitosDetetados();
        cand.getEstado().setConflitosAlterados();
        cand.getEstado().setEmAvaliacao();
        cand.getEstado().setAvaliada();
        cand.getEstado().setAceite();
        cand.getEstado().setConfirmarStand();
        CandidaturaConfirmarStandEstado instance = new CandidaturaConfirmarStandEstado(cand);
        boolean expResult = true;
        boolean result = instance.setConfirmarStand();
        assertEquals(expResult, result);
    }
    
}
