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
public class CandidaturaAlteradaEstadoTest {
    
    public CandidaturaAlteradaEstadoTest() {
    }

    /**
     * Test of setAlterada method, of class CandidaturaAlteradaEstado.
     */
    @Test
    public void testSetAlterada() {
        System.out.println("setAlterada");
        CandidaturaGeral cand = new CandidaturaGeral();
        cand.getEstado().setEmSubmissao();
        cand.getEstado().setAlterada();
        CandidaturaAlteradaEstado instance = new CandidaturaAlteradaEstado(cand);
        boolean expResult = true;
        boolean result = instance.setAlterada();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCompleta method, of class CandidaturaAlteradaEstado.
     */
    @Test
    public void testSetCompleta() {
        System.out.println("setCompleta");
        CandidaturaGeral cand = new CandidaturaGeral();
        cand.getEstado().setEmSubmissao();
        cand.getEstado().setAlterada();
        CandidaturaAlteradaEstado instance = new CandidaturaAlteradaEstado(cand);
        boolean expResult = true;
        boolean result = instance.setCompleta();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRemovida method, of class CandidaturaAlteradaEstado.
     */
    @Test
    public void testSetRemovida() {
        System.out.println("setRemovida");
        CandidaturaGeral cand = new CandidaturaGeral();
        cand.getEstado().setEmSubmissao();
        cand.getEstado().setAlterada();
        CandidaturaAlteradaEstado instance = new CandidaturaAlteradaEstado(cand);
        boolean expResult = true;
        boolean result = instance.setRemovida();
        assertEquals(expResult, result);
    }
    
}
