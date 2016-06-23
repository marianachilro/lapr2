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
public class CandidaturaAvaliadaEstadoTest {
    
    public CandidaturaAvaliadaEstadoTest() {
    }

    /**
     * Test of setAvaliada method, of class CandidaturaAvaliadaEstado.
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
        cand.getEstado().setAvaliada();
        CandidaturaAvaliadaEstado instance = new CandidaturaAvaliadaEstado(cand);
        boolean expResult = true;
        boolean result = instance.setAvaliada();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAceite method, of class CandidaturaAvaliadaEstado.
     */
    @Test
    public void testSetAceite() {
        System.out.println("setAceite");
        CandidaturaGeral cand = new CandidaturaGeral();
        cand.getEstado().setEmSubmissao();
        cand.getEstado().setAlterada();
        cand.getEstado().setCompleta();
        cand.getEstado().setConflitosDetetados();
        cand.getEstado().setConflitosAlterados();
        cand.getEstado().setEmAvaliacao();
        cand.getEstado().setAvaliada();
        CandidaturaAvaliadaEstado instance = new CandidaturaAvaliadaEstado(cand);
        boolean expResult = true;
        boolean result = instance.setAceite();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRejeitada method, of class CandidaturaAvaliadaEstado.
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
        CandidaturaAvaliadaEstado instance = new CandidaturaAvaliadaEstado(cand);
        boolean expResult = true;
        boolean result = instance.setRejeitada();
        assertEquals(expResult, result);
    }
    
}
