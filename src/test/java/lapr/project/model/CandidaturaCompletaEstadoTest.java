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
public class CandidaturaCompletaEstadoTest {
    
    public CandidaturaCompletaEstadoTest() {
    }

    /**
     * Test of setCompleta method, of class CandidaturaCompletaEstado.
     */
    @Test
    public void testSetCompleta() {
        System.out.println("setCompleta");
        CandidaturaGeral cand = new CandidaturaGeral();
        cand.getEstado().setEmSubmissao();
        cand.getEstado().setAlterada();
        cand.getEstado().setCompleta();
        CandidaturaCompletaEstado instance = new CandidaturaCompletaEstado(cand);
        boolean expResult = true;
        boolean result = instance.setCompleta();
        assertEquals(expResult, result);
    }

    /**
     * Test of setConflitosDetetados method, of class CandidaturaCompletaEstado.
     */
    @Test
    public void testSetConflitosDetetados() {
        System.out.println("setConflitosDetetados");
        CandidaturaGeral cand = new CandidaturaGeral();
        cand.getEstado().setEmSubmissao();
        cand.getEstado().setAlterada();
        cand.getEstado().setCompleta();
        CandidaturaCompletaEstado instance = new CandidaturaCompletaEstado(cand);
        boolean expResult = true;
        boolean result = instance.setConflitosDetetados();
        assertEquals(expResult, result);
    }
    
}
