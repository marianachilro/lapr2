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
public class ExposicaoCandidaturasDemosAvaliadasEstadoTest {
    
    public ExposicaoCandidaturasDemosAvaliadasEstadoTest() {
    }

    /**
     * Test of setDemonstracaoCandidaturasAvaliadas method, of class ExposicaoCandidaturasDemosAvaliadasEstado.
     */
    @Test
    public void testSetDemonstracaoCandidaturasAvaliadas() {
        System.out.println("setDemonstracaoCandidaturasAvaliadas");
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
        ExposicaoCandidaturasDemosAvaliadasEstado instance = new ExposicaoCandidaturasDemosAvaliadasEstado(expo);
        boolean expResult = true;
        boolean result = instance.setDemonstracaoCandidaturasAvaliadas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDemonstracaoCandidaturasDecididas method, of class ExposicaoCandidaturasDemosAvaliadasEstado.
     */
    @Test
    public void testSetDemonstracaoCandidaturasDecididas() {
        System.out.println("setDemonstracaoCandidaturasDecididas");
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
        ExposicaoCandidaturasDemosAvaliadasEstado instance = new ExposicaoCandidaturasDemosAvaliadasEstado(expo);
        boolean expResult = true;
        boolean result = instance.setDemonstracaoCandidaturasDecididas();
        assertEquals(expResult, result);
    }

    /**
     * Test of valida method, of class ExposicaoCandidaturasDemosAvaliadasEstado.
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
        ExposicaoCandidaturasDemosAvaliadasEstado instance = new ExposicaoCandidaturasDemosAvaliadasEstado(expo);
        boolean expResult = true;
        boolean result = instance.valida();
        assertEquals(expResult, result);
    }
    
}
