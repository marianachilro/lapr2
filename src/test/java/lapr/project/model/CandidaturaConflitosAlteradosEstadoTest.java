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
public class CandidaturaConflitosAlteradosEstadoTest {
    
    public CandidaturaConflitosAlteradosEstadoTest() {
    }

    /**
     * Test of setConflitosAlterados method, of class CandidaturaConflitosAlteradosEstado.
     */
    @Test
    public void testSetConflitosAlterados() {
        System.out.println("setConflitosAlterados");
        CandidaturaGeral cand = new CandidaturaGeral();
        cand.getEstado().setEmSubmissao();
        cand.getEstado().setAlterada();
        cand.getEstado().setCompleta();
        cand.getEstado().setConflitosDetetados();
        cand.getEstado().setConflitosAlterados();
        CandidaturaConflitosAlteradosEstado instance = new CandidaturaConflitosAlteradosEstado(cand);
        boolean expResult = true;
        boolean result = instance.setConflitosAlterados();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmAvaliacao method, of class CandidaturaConflitosAlteradosEstado.
     */
    @Test
    public void testSetEmAvaliacao() {
        System.out.println("setEmAvaliacao");
        CandidaturaGeral cand = new CandidaturaGeral();
        cand.getEstado().setEmSubmissao();
        cand.getEstado().setAlterada();
        cand.getEstado().setCompleta();
        cand.getEstado().setConflitosDetetados();
        cand.getEstado().setConflitosAlterados();
        CandidaturaConflitosAlteradosEstado instance = new CandidaturaConflitosAlteradosEstado(cand);
        boolean expResult = true;
        boolean result = instance.setEmAvaliacao();
        assertEquals(expResult, result);
    }
    
}
