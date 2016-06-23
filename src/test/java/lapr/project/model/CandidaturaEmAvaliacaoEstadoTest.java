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
public class CandidaturaEmAvaliacaoEstadoTest {
    
    public CandidaturaEmAvaliacaoEstadoTest() {
    }

    /**
     * Test of setEmAvaliacao method, of class CandidaturaEmAvaliacaoEstado.
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
        cand.getEstado().setEmAvaliacao();
        CandidaturaEmAvaliacaoEstado instance = new CandidaturaEmAvaliacaoEstado(cand);
        boolean expResult = true;
        boolean result = instance.setEmAvaliacao();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAvaliada method, of class CandidaturaEmAvaliacaoEstado.
     */
    @Test
    public void testSetAvaliada() {
        System.out.println("setAvaliada");
        CandidaturaGeral cand = new CandidaturaGeral();
        cand.getEstado().setEmSubmissao();
        cand.getEstado().setAlterada();
        cand.getEstado().setCompleta();
        cand.getEstado().setConflitosDetetados();
        cand.getEstado().setConflitosAlterados();
        cand.getEstado().setEmAvaliacao();
        CandidaturaEmAvaliacaoEstado instance = new CandidaturaEmAvaliacaoEstado(cand);
        boolean expResult = true;
        boolean result = instance.setAvaliada();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNaoAvaliada method, of class CandidaturaEmAvaliacaoEstado.
     */
    @Test
    public void testSetNaoAvaliada() {
        System.out.println("setNaoAvaliada");
        CandidaturaGeral cand = new CandidaturaGeral();
        cand.getEstado().setEmSubmissao();
        cand.getEstado().setAlterada();
        cand.getEstado().setCompleta();
        cand.getEstado().setConflitosDetetados();
        cand.getEstado().setConflitosAlterados();
        cand.getEstado().setEmAvaliacao();
        CandidaturaEmAvaliacaoEstado instance = new CandidaturaEmAvaliacaoEstado(cand);
        boolean expResult = true;
        boolean result = instance.setNaoAvaliada();
        assertEquals(expResult, result);
    }
    
}
