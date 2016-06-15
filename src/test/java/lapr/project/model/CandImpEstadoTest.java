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
 * @author miniondevil
 */
public class CandImpEstadoTest {

    public CandImpEstadoTest() {
    }

    /**
     * Test of getCandidatura method, of class CandImpEstado.
     */
    @Test
    public void testGetCandidatura() {
        System.out.println("getCandidatura");
        CandidaturaExposicao c = new CandidaturaExposicao();
        CandImpEstado instance = new CandImpEstado(c);
        Candidatura expResult = c;
        Candidatura result = instance.getCandidatura();
        assertEquals(expResult, result);

    }

    /**
     * Test of setCriada method, of class CandImpEstado.
     */
    @Test
    public void testSetCriada() {
        System.out.println("setCriada");
        CandidaturaExposicao c = new CandidaturaExposicao();
        CandImpEstado instance = new CandImpEstado(c);
        boolean expResult = false;
        boolean result = instance.setEmSubmissao();
        assertEquals(expResult, result);

    }

    /**
     * Test of setAlterada method, of class CandImpEstado.
     */
    @Test
    public void testSetAlterada() {
        System.out.println("setAlterada");
        CandidaturaExposicao c = new CandidaturaExposicao();
        CandImpEstado instance = new CandImpEstado(c);
        boolean expResult = false;
        boolean result = instance.setAlterada();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCompleta method, of class CandImpEstado.
     */
    @Test
    public void testSetCompleta() {
        System.out.println("setCompleta");
        CandidaturaExposicao c = new CandidaturaExposicao();
        CandImpEstado instance = new CandImpEstado(c);
        boolean expResult = false;
        boolean result = instance.setCompleta();
        assertEquals(expResult, result);
    }

    /**
     * Test of setConflitosDetetados method, of class CandImpEstado.
     */
    @Test
    public void testSetConflitosDetetados() {
        System.out.println("setConflitosDetetados");
        CandidaturaExposicao c = new CandidaturaExposicao();
        CandImpEstado instance = new CandImpEstado(c);
        boolean expResult = false;
        boolean result = instance.setConflitosDetetados();
        assertEquals(expResult, result);
    }

    /**
     * Test of setConflitosAlterados method, of class CandImpEstado.
     */
    @Test
    public void testSetConflitosAlterados() {
        System.out.println("setConflitosAlterados");
        CandidaturaExposicao c = new CandidaturaExposicao();
        CandImpEstado instance = new CandImpEstado(c);
        boolean expResult = false;
        boolean result = instance.setConflitosAlterados();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAtribuida method, of class CandImpEstado.
     */
    @Test
    public void testSetAtribuida() {
        System.out.println("setAtribuida");
        CandidaturaExposicao c = new CandidaturaExposicao();
        CandImpEstado instance = new CandImpEstado(c);
        boolean expResult = false;
        boolean result = instance.setEmAvaliacao();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAvaliada method, of class CandImpEstado.
     */
    @Test
    public void testSetAvaliada() {
        System.out.println("setAvaliada");
        CandidaturaExposicao c = new CandidaturaExposicao();
        CandImpEstado instance = new CandImpEstado(c);
        boolean expResult = false;
        boolean result = instance.setAvaliada();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEstatisticaAvaliacoesCriadas method, of class CandImpEstado.
     */
//    @Test
//    public void testSetEstatisticaAvaliacoesCriadas() {
//        System.out.println("setEstatisticaAvaliacoesCriadas");
//        CandidaturaExposicao c = new CandidaturaExposicao();
//        CandImpEstado instance = new CandImpEstado(c);
//        boolean expResult = false;
//        boolean result = instance.setEstatisticaAvaliacoesCriadas();
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of setDecidida method, of class CandImpEstado.
//     */
//    @Test
//    public void testSetDecidida() {
//        System.out.println("setDecidida");
//        CandidaturaExposicao c = new CandidaturaExposicao();
//        CandImpEstado instance = new CandImpEstado(c);
//        boolean expResult = false;
//        boolean result = instance.setDecidida();
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of setEstatiscticaKeywordsCriada method, of class CandImpEstado.
//     */
//    @Test
//    public void testSetEstatiscticaKeywordsCriada() {
//        System.out.println("setEstatiscticaKeywordsCriada");
//        CandidaturaExposicao c = new CandidaturaExposicao();
//        CandImpEstado instance = new CandImpEstado(c);
//        boolean expResult = false;
//        boolean result = instance.setEstatiscticaKeywordsCriada();
//        assertEquals(expResult, result);
//    }

    /**
     * Test of setConfirmarStandEstado method, of class CandImpEstado.
     */
    @Test
    public void testSetConfirmarStandEstado() {
        System.out.println("setConfirmarStandEstado");
        CandidaturaExposicao c = new CandidaturaExposicao();
        CandImpEstado instance = new CandImpEstado(c);
        boolean expResult = false;
        boolean result = instance.setConfirmarStand();
        assertEquals(expResult, result);
    }

}
