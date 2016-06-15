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
public class ExposicaoCandidaturasDemosAtribuidasEstadoTest {
    
    public ExposicaoCandidaturasDemosAtribuidasEstadoTest() {
    }

    /**
     * Test of setDemonstracaoCandidaturasAtribuidas method, of class ExposicaoCandidaturasDemosAtribuidasEstado.
     */
    @Test
    public void testSetDemonstracaoCandidaturasAtribuidas() {
        System.out.println("setDemonstracaoCandidaturasAtribuidas");
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
        ExposicaoCandidaturasDemosAtribuidasEstado instance = new ExposicaoCandidaturasDemosAtribuidasEstado(expo);
        boolean expResult = true;
        boolean result = instance.setDemonstracaoCandidaturasAtribuidas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDemonstracaoCandidaturasAvaliadas method, of class ExposicaoCandidaturasDemosAtribuidasEstado.
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
        ExposicaoCandidaturasDemosAtribuidasEstado instance = new ExposicaoCandidaturasDemosAtribuidasEstado(expo);
        boolean expResult = true;
        boolean result = instance.setDemonstracaoCandidaturasAvaliadas();
        assertEquals(expResult, result);
    }

    /**
     * Test of valida method, of class ExposicaoCandidaturasDemosAtribuidasEstado.
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
        ExposicaoCandidaturasDemosAtribuidasEstado instance = new ExposicaoCandidaturasDemosAtribuidasEstado(expo);
        boolean expResult = true;
        boolean result = instance.valida();
        assertEquals(expResult, result);
    }
    
}
