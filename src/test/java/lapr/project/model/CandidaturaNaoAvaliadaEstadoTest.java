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
public class CandidaturaNaoAvaliadaEstadoTest {
    
    public CandidaturaNaoAvaliadaEstadoTest() {
    }

    /**
     * Test of setNaoAvaliada method, of class CandidaturaNaoAvaliadaEstado.
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
        cand.getEstado().setNaoAvaliada();
        CandidaturaNaoAvaliadaEstado instance = new CandidaturaNaoAvaliadaEstado(cand);
        boolean expResult = true;
        boolean result = instance.setNaoAvaliada();
        assertEquals(expResult, result);
    }
    
}
