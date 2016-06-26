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
public class ExpoImpEstadoTest {
    
    public ExpoImpEstadoTest() {
    }

    /**
     * Test of getExposicao method, of class ExpoImpEstado.
     */
    @Test
    public void testGetExposicao() {
        System.out.println("getExposicao");
        Exposicao expo = new Exposicao();
        ExpoImpEstado instance = new ExpoImpEstado(expo,"");
        Exposicao expResult = expo;
        Exposicao result = instance.getExposicao();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCriada method, of class ExpoImpEstado.
     */
    @Test
    public void testSetCriada() {
        System.out.println("setCriada");
        
        Exposicao expo = new Exposicao();
        ExpoImpEstado instance = new ExpoImpEstado(expo,"");
        boolean expResult = false;
        boolean result = instance.setCriada();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFaeSemDemo method, of class ExpoImpEstado.
     */
    @Test
    public void testSetFaeSemDemo() {
        System.out.println("setFaeSemDemo");
        Exposicao expo = new Exposicao();
        ExpoImpEstado instance = new ExpoImpEstado(expo,"");
        boolean expResult = false;
        boolean result = instance.setFaeSemDemo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDemoSemFae method, of class ExpoImpEstado.
     */
    @Test
    public void testSetDemoSemFae() {
        System.out.println("setDemoSemFae");
        Exposicao expo = new Exposicao();
        ExpoImpEstado instance = new ExpoImpEstado(expo,"");
        boolean expResult = false;
        boolean result = instance.setDemoSemFae();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCompleta method, of class ExpoImpEstado.
     */
    @Test
    public void testSetCompleta() {
        System.out.println("setCompleta");
        Exposicao expo = new Exposicao();
        ExpoImpEstado instance = new ExpoImpEstado(expo,"");
        boolean expResult = false;
        boolean result = instance.setCompleta();
        assertEquals(expResult, result);
    }

    /**
     * Test of setExposicaoCandidaturasAbertas method, of class ExpoImpEstado.
     */
    @Test
    public void testSetExposicaoCandidaturasAbertas() {
        System.out.println("setExposicaoCandidaturasAbertas");
        Exposicao expo = new Exposicao();
        ExpoImpEstado instance = new ExpoImpEstado(expo,"");
        boolean expResult = false;
        boolean result = instance.setExposicaoCandidaturasAbertas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setExposicaoCandidaturasFechadas method, of class ExpoImpEstado.
     */
    @Test
    public void testSetExposicaoCandidaturasFechadas() {
        System.out.println("setExposicaoCandidaturasFechadas");
        Exposicao expo = new Exposicao();
        ExpoImpEstado instance = new ExpoImpEstado (expo,"");
        boolean expResult = false;
        boolean result = instance.setExposicaoCandidaturasFechadas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setExposicaoConflitosDetetados method, of class ExpoImpEstado.
     */
    @Test
    public void testSetExposicaoConflitosDetetados() {
        System.out.println("setExposicaoConflitosDetetados");
        Exposicao expo = new Exposicao();
        ExpoImpEstado instance = new ExpoImpEstado(expo,"");
        boolean expResult = false;
        boolean result = instance.setExposicaoConflitosDetetados();
        assertEquals(expResult, result);
    }

    /**
     * Test of setExposicaoConflitosAtualizados method, of class ExpoImpEstado.
     */
    @Test
    public void testSetExposicaoConflitosAtualizados() {
        System.out.println("setExposicaoConflitosAtualizados");
        Exposicao expo = new Exposicao();
        ExpoImpEstado instance = new ExpoImpEstado(expo,"");
        boolean expResult = false;
        boolean result = instance.setExposicaoConflitosAtualizados();
        assertEquals(expResult, result);
    }

    /**
     * Test of setExposicaoCandidaturasAtribuidas method, of class ExpoImpEstado.
     */
    @Test
    public void testSetExposicaoCandidaturasAtribuidas() {
        System.out.println("setExposicaoCandidaturasAtribuidas");
        Exposicao expo = new Exposicao();
        ExpoImpEstado instance = new ExpoImpEstado(expo,"");
        boolean expResult = false;
        boolean result = instance.setExposicaoCandidaturasAtribuidas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setExposicaoCandidaturasAvaliadas method, of class ExpoImpEstado.
     */
    @Test
    public void testSetExposicaoCandidaturasAvaliadas() {
        System.out.println("setExposicaoCandidaturasAvaliadas");
        Exposicao expo = new Exposicao();
        ExpoImpEstado instance = new ExpoImpEstado(expo,"");
        boolean expResult = false;
        boolean result = instance.setExposicaoCandidaturasAvaliadas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setExposicaoCandidaturasDecididas method, of class ExpoImpEstado.
     */
    @Test
    public void testSetExposicaoCandidaturasDecididas() {
        System.out.println("setExposicaoCandidaturasDecididas");
        Exposicao expo = new Exposicao();
        ExpoImpEstado instance = new ExpoImpEstado(expo,"");
        boolean expResult = false;
        boolean result = instance.setExposicaoCandidaturasDecididas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setConfirmacaoRealizacaoDemos method, of class ExpoImpEstado.
     */
    @Test
    public void testSetConfirmacaoRealizacaoDemos() {
        System.out.println("setConfirmacaoRealizacaoDemos");
        Exposicao expo = new Exposicao();
        ExpoImpEstado instance = new ExpoImpEstado(expo,"");
        boolean expResult = false;
        boolean result = instance.setConfirmacaoRealizacaoDemos();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDemonstracaoCandidaturasAbertas method, of class ExpoImpEstado.
     */
    @Test
    public void testSetDemonstracaoCandidaturasAbertas() {
        System.out.println("setDemonstracaoCandidaturasAbertas");
        Exposicao expo = new Exposicao();
        ExpoImpEstado instance = new ExpoImpEstado(expo,"");
        boolean expResult = false;
        boolean result = instance.setDemonstracaoCandidaturasAbertas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDemonstracaoCandidaturasFechadas method, of class ExpoImpEstado.
     */
    @Test
    public void testSetDemonstracaoCandidaturasFechadas() {
        System.out.println("setDemonstracaoCandidaturasFechadas");
        Exposicao expo = new Exposicao();
        ExpoImpEstado instance = new ExpoImpEstado(expo,"");
        boolean expResult = false;
        boolean result = instance.setDemonstracaoCandidaturasFechadas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDemonstracaoConflitosDetetados method, of class ExpoImpEstado.
     */
    @Test
    public void testSetDemonstracaoConflitosDetetados() {
        System.out.println("setDemonstracaoConflitosDetetados");
        Exposicao expo = new Exposicao();
        ExpoImpEstado instance = new ExpoImpEstado(expo,"");
        boolean expResult = false;
        boolean result = instance.setDemonstracaoConflitosDetetados();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDemonstracaoConflitosAtualizados method, of class ExpoImpEstado.
     */
    @Test
    public void testSetDemonstracaoConflitosAtualizados() {
        System.out.println("setDemonstracaoConflitosAtualizados");
        Exposicao expo = new Exposicao();
        ExpoImpEstado instance = new ExpoImpEstado(expo,"");
        boolean expResult = false;
        boolean result = instance.setDemonstracaoConflitosAtualizados();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDemonstracaoCandidaturasAtribuidas method, of class ExpoImpEstado.
     */
    @Test
    public void testSetDemonstracaoCandidaturasAtribuidas() {
        System.out.println("setDemonstracaoCandidaturasAtribuidas");
        Exposicao expo = new Exposicao();
        ExpoImpEstado instance = new ExpoImpEstado(expo,"");
        boolean expResult = false;
        boolean result = instance.setDemonstracaoCandidaturasAtribuidas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDemonstracaoCandidaturasAvaliadas method, of class ExpoImpEstado.
     */
    @Test
    public void testSetDemonstracaoCandidaturasAvaliadas() {
        System.out.println("setDemonstracaoCandidaturasAvaliadas");
        Exposicao expo = new Exposicao();
        ExpoImpEstado instance = new ExpoImpEstado(expo,"");
        boolean expResult = false;
        boolean result = instance.setDemonstracaoCandidaturasAvaliadas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDemonstracaoCandidaturasDecididas method, of class ExpoImpEstado.
     */
    @Test
    public void testSetDemonstracaoCandidaturasDecididas() {
        System.out.println("setDemonstracaoCandidaturasDecididas");
        Exposicao expo = new Exposicao();
        ExpoImpEstado instance = new ExpoImpEstado(expo,"");
        boolean expResult = false;
        boolean result = instance.setDemonstracaoCandidaturasDecididas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStandsAtribuidos method, of class ExpoImpEstado.
     */
    @Test
    public void testSetStandsAtribuidos() {
        System.out.println("setStandsAtribuidos");
        Exposicao expo = new Exposicao();
        ExpoImpEstado instance = new ExpoImpEstado(expo,"");
        boolean expResult = false;
        boolean result = instance.setStandsAtribuidos();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStandsConfirmados method, of class ExpoImpEstado.
     */
    @Test
    public void testSetStandsConfirmados() {
        System.out.println("setStandsConfirmados");
        Exposicao expo = new Exposicao();
        ExpoImpEstado instance = new ExpoImpEstado(expo,"");
        boolean expResult = false;
        boolean result = instance.setStandsConfirmados();
        assertEquals(expResult, result);
    }
    
}
