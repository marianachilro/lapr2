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
public class ExposicaoCandidaturasDemosAbertasEstadoTest {
    
    public ExposicaoCandidaturasDemosAbertasEstadoTest() {
    }

    /**
     * Test of setDemonstracaoCandidaturasAbertas method, of class ExposicaoCandidaturasDemosAbertasEstado.
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
        expo.getEstado().setDemonstracaoCandidaturasAbertas();
        ExposicaoCandidaturasDemosAbertasEstado instance = new ExposicaoCandidaturasDemosAbertasEstado(expo);
        boolean expResult = true;
        boolean result = instance.setDemonstracaoCandidaturasAbertas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDemonstracaoCandidaturasFechadas method, of class ExposicaoCandidaturasDemosAbertasEstado.
     */
    @Test
    public void testSetDemonstracaoCandidaturasFechadas() {
        System.out.println("setDemonstracaoCandidaturasFechadas");
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
        ExposicaoCandidaturasDemosAbertasEstado instance = new ExposicaoCandidaturasDemosAbertasEstado(expo);
        boolean expResult = true;
        boolean result = instance.setDemonstracaoCandidaturasFechadas();
        assertEquals(expResult, result);
    }

    /**
     * Test of valida method, of class ExposicaoCandidaturasDemosAbertasEstado.
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
        ExposicaoCandidaturasDemosAbertasEstado instance = new ExposicaoCandidaturasDemosAbertasEstado(expo);
        boolean expResult = true;
        boolean result = instance.valida();
        assertEquals(expResult, result);
    }
    
}
