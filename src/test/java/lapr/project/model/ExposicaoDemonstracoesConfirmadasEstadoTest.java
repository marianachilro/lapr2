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
public class ExposicaoDemonstracoesConfirmadasEstadoTest {
    
    public ExposicaoDemonstracoesConfirmadasEstadoTest() {
    }

    /**
     * Test of setConfirmacaoRealizacaoDemos method, of class ExposicaoDemonstracoesConfirmadasEstado.
     */
    @Test
    public void testSetConfirmacaoRealizacaoDemos() {
        System.out.println("setConfirmacaoRealizacaoDemos");
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
        ExposicaoDemonstracoesConfirmadasEstado instance = new ExposicaoDemonstracoesConfirmadasEstado(expo);
        boolean expResult = true;
        boolean result = instance.setConfirmacaoRealizacaoDemos();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDemonstracaoCandidaturasAbertas method, of class ExposicaoDemonstracoesConfirmadasEstado.
     */
    @Test
    public void testSetDemonstracaoCandidaturasAbertas() {
        System.out.println("setDemonstracaoCandidaturasAbertas");
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
        ExposicaoDemonstracoesConfirmadasEstado instance = new ExposicaoDemonstracoesConfirmadasEstado(expo);
        boolean expResult = true;
        boolean result = instance.setDemonstracaoCandidaturasAbertas();
        assertEquals(expResult, result);
    }

    /**
     * Test of valida method, of class ExposicaoDemonstracoesConfirmadasEstado.
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
        ExposicaoDemonstracoesConfirmadasEstado instance = new ExposicaoDemonstracoesConfirmadasEstado(expo);
        boolean expResult = true;
        boolean result = instance.valida();
        assertEquals(expResult, result);
    }
    
}
