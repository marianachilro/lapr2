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
public class CandidaturaAceiteEstadoTest {
    
    public CandidaturaAceiteEstadoTest() {
    }

    /**
     * Test of setAceite method, of class CandidaturaAceiteEstado.
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
        cand.getEstado().setAceite();
        CandidaturaAceiteEstado instance = new CandidaturaAceiteEstado(cand);
        boolean expResult = true;
        boolean result = instance.setAceite();
        assertEquals(expResult, result);
    }

    /**
     * Test of setConfirmarStand method, of class CandidaturaAceiteEstado.
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
        CandidaturaAceiteEstado instance = new CandidaturaAceiteEstado(cand);
        boolean expResult = true;
        boolean result = instance.setConfirmarStand();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNaoConfirmarStand method, of class CandidaturaAceiteEstado.
     */
    @Test
    public void testSetNaoConfirmarStand() {
        System.out.println("setNaoConfirmarStand");
        CandidaturaGeral cand = new CandidaturaGeral();
        cand.getEstado().setEmSubmissao();
        cand.getEstado().setAlterada();
        cand.getEstado().setCompleta();
        cand.getEstado().setConflitosDetetados();
        cand.getEstado().setConflitosAlterados();
        cand.getEstado().setEmAvaliacao();
        cand.getEstado().setAvaliada();
        cand.getEstado().setAceite();
        CandidaturaAceiteEstado instance = new CandidaturaAceiteEstado(cand);
        boolean expResult = true;
        boolean result = instance.setNaoConfirmarStand();
        assertEquals(expResult, result);
    }
    
}
