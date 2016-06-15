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
public class ExposicaoStandsAtribuidosEstadoTest {
    
    public ExposicaoStandsAtribuidosEstadoTest() {
    }

    /**
     * Test of setStandsAtribuidos method, of class ExposicaoStandsAtribuidosEstado.
     */
    @Test
    public void testSetStandsAtribuidos() {
        System.out.println("setStandsAtribuidos");
        Exposicao expo = new Exposicao();
        expo.getEstado().setCriada();
        expo.getEstado().setDemoSemFae();
        expo.getEstado().setCompleta();
        expo.getEstado().setExposicaoCandidaturasAbertas();
        expo.getEstado().setExposicaoCandidaturasFechadas();
        expo.getEstado().setExposicaoConflitosDetetados();
        expo.getEstado().setExposicaoConflitosAtualizados();
        expo.getEstado().setExposicaoCandidaturasAtribuidas();
        expo.getEstado().setExposicaoCandidaturasAvaliadas();
        expo.getEstado().setExposicaoCandidaturasDecididas();
        expo.getEstado().setConfirmacaoRealizacaoDemos();
        expo.getEstado().setDemonstracaoCandidaturasAbertas();
        expo.getEstado().setDemonstracaoCandidaturasFechadas();
        expo.getEstado().setDemonstracaoConflitosDetetados();
        expo.getEstado().setDemonstracaoConflitosAtualizados();
        expo.getEstado().setDemonstracaoCandidaturasAtribuidas();
        expo.getEstado().setDemonstracaoCandidaturasAvaliadas();
        expo.getEstado().setDemonstracaoCandidaturasDecididas();
        expo.getEstado().setStandsAtribuidos();
        ExposicaoStandsAtribuidosEstado instance = new ExposicaoStandsAtribuidosEstado(expo);
        boolean expResult = true;
        boolean result = instance.setStandsAtribuidos();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStandsConfirmados method, of class ExposicaoStandsAtribuidosEstado.
     */
    @Test
    public void testSetStandsConfirmados() {
        System.out.println("setStandsConfirmados");
        Exposicao expo = new Exposicao();
        expo.getEstado().setCriada();
        expo.getEstado().setDemoSemFae();
        expo.getEstado().setCompleta();
        expo.getEstado().setExposicaoCandidaturasAbertas();
        expo.getEstado().setExposicaoCandidaturasFechadas();
        expo.getEstado().setExposicaoConflitosDetetados();
        expo.getEstado().setExposicaoConflitosAtualizados();
        expo.getEstado().setExposicaoCandidaturasAtribuidas();
        expo.getEstado().setExposicaoCandidaturasAvaliadas();
        expo.getEstado().setExposicaoCandidaturasDecididas();
        expo.getEstado().setConfirmacaoRealizacaoDemos();
        expo.getEstado().setDemonstracaoCandidaturasAbertas();
        expo.getEstado().setDemonstracaoCandidaturasFechadas();
        expo.getEstado().setDemonstracaoConflitosDetetados();
        expo.getEstado().setDemonstracaoConflitosAtualizados();
        expo.getEstado().setDemonstracaoCandidaturasAtribuidas();
        expo.getEstado().setDemonstracaoCandidaturasAvaliadas();
        expo.getEstado().setDemonstracaoCandidaturasDecididas();
        expo.getEstado().setStandsAtribuidos();
        ExposicaoStandsAtribuidosEstado instance = new ExposicaoStandsAtribuidosEstado(expo);
        boolean expResult = true;
        boolean result = instance.setStandsConfirmados();
        assertEquals(expResult, result);
    }

    /**
     * Test of valida method, of class ExposicaoStandsAtribuidosEstado.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        Exposicao expo = new Exposicao();
        expo.getEstado().setCriada();
        expo.getEstado().setDemoSemFae();
        expo.getEstado().setCompleta();
        expo.getEstado().setExposicaoCandidaturasAbertas();
        expo.getEstado().setExposicaoCandidaturasFechadas();
        expo.getEstado().setExposicaoConflitosDetetados();
        expo.getEstado().setExposicaoConflitosAtualizados();
        expo.getEstado().setExposicaoCandidaturasAtribuidas();
        expo.getEstado().setExposicaoCandidaturasAvaliadas();
        expo.getEstado().setExposicaoCandidaturasDecididas();
        expo.getEstado().setConfirmacaoRealizacaoDemos();
        expo.getEstado().setDemonstracaoCandidaturasAbertas();
        expo.getEstado().setDemonstracaoCandidaturasFechadas();
        expo.getEstado().setDemonstracaoConflitosDetetados();
        expo.getEstado().setDemonstracaoConflitosAtualizados();
        expo.getEstado().setDemonstracaoCandidaturasAtribuidas();
        expo.getEstado().setDemonstracaoCandidaturasAvaliadas();
        expo.getEstado().setDemonstracaoCandidaturasDecididas();
        expo.getEstado().setStandsAtribuidos();
        ExposicaoStandsAtribuidosEstado instance = new ExposicaoStandsAtribuidosEstado(expo);
        boolean expResult = true;
        boolean result = instance.valida();
        assertEquals(expResult, result);
    }
    
}
