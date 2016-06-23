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
public class CandidaturaRejeitadaEstadoTest {
    
    public CandidaturaRejeitadaEstadoTest() {
    }

    /**
     * Test of setRejeitada method, of class CandidaturaRejeitadaEstado.
     */
    @Test
    public void testSetRejeitada() {
        System.out.println("setRejeitada");
        CandidaturaGeral cand = new CandidaturaGeral();
        cand.getEstado().setEmSubmissao();
        cand.getEstado().setAlterada();
        cand.getEstado().setCompleta();
        cand.getEstado().setConflitosDetetados();
        cand.getEstado().setConflitosAlterados();
        cand.getEstado().setEmAvaliacao();
        cand.getEstado().setAvaliada();
        cand.getEstado().setRejeitada();
        CandidaturaRejeitadaEstado instance = new CandidaturaRejeitadaEstado(cand);
        boolean expResult = true;
        boolean result = instance.setRejeitada();
        assertEquals(expResult, result);
    }
    
}
