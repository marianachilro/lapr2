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
public class CandidaturaRemovidaEstadoTest {
    
    public CandidaturaRemovidaEstadoTest() {
    }

    /**
     * Test of setRemovida method, of class CandidaturaRemovidaEstado.
     */
    @Test
    public void testSetRemovida() {
        System.out.println("setRemovida");
        CandidaturaGeral cand = new CandidaturaGeral();
        cand.getEstado().setEmSubmissao();
        cand.getEstado().setAlterada();
        cand.getEstado().setRemovida();
        CandidaturaRemovidaEstado instance = new CandidaturaRemovidaEstado(cand);
        boolean expResult = true;
        boolean result = instance.setRemovida();
        assertEquals(expResult, result);
    }
    
}
