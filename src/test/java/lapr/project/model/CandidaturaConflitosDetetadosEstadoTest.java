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
public class CandidaturaConflitosDetetadosEstadoTest {
    
    public CandidaturaConflitosDetetadosEstadoTest() {
    }

    /**
     * Test of setConflitosDetetados method, of class CandidaturaConflitosDetetadosEstado.
     */
    @Test
    public void testSetConflitosDetetados() {
        System.out.println("setConflitosDetetados");
        CandidaturaGeral cand = new CandidaturaGeral();
        cand.getEstado().setEmSubmissao();
        cand.getEstado().setAlterada();
        cand.getEstado().setCompleta();
        cand.getEstado().setConflitosDetetados();
        CandidaturaConflitosDetetadosEstado instance = new CandidaturaConflitosDetetadosEstado(cand);
        boolean expResult = true;
        boolean result = instance.setConflitosDetetados();
        assertEquals(expResult, result);
    }

    /**
     * Test of setConflitosAlterados method, of class CandidaturaConflitosDetetadosEstado.
     */
    @Test
    public void testSetConflitosAlterados() {
        System.out.println("setConflitosAlterados");
        CandidaturaGeral cand = new CandidaturaGeral();
        cand.getEstado().setEmSubmissao();
        cand.getEstado().setAlterada();
        cand.getEstado().setCompleta();
        cand.getEstado().setConflitosDetetados();
        CandidaturaConflitosDetetadosEstado instance = new CandidaturaConflitosDetetadosEstado(cand);
        boolean expResult = true;
        boolean result = instance.setConflitosAlterados();
        assertEquals(expResult, result);
    }
    
}
