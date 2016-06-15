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
public class ExposicaoCandidaturasExpoDecididasEstadoTest {
    
    public ExposicaoCandidaturasExpoDecididasEstadoTest() {
    }

    /**
     * Test of setExposicaoCandidaturasDecididas method, of class ExposicaoCandidaturasExpoDecididasEstado.
     */
    @Test
    public void testSetExposicaoCandidaturasDecididas() {
        System.out.println("setExposicaoCandidaturasDecididas");
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
        ExposicaoCandidaturasExpoDecididasEstado instance = new ExposicaoCandidaturasExpoDecididasEstado(expo);
        boolean expResult = true;
        boolean result = instance.setExposicaoCandidaturasDecididas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setConfirmacaoRealizacaoDemos method, of class ExposicaoCandidaturasExpoDecididasEstado.
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
        ExposicaoCandidaturasExpoDecididasEstado instance = new ExposicaoCandidaturasExpoDecididasEstado(expo);
        boolean expResult = true;
        boolean result = instance.setConfirmacaoRealizacaoDemos();
        assertEquals(expResult, result);
    }

    /**
     * Test of valida method, of class ExposicaoCandidaturasExpoDecididasEstado.
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
        ExposicaoCandidaturasExpoDecididasEstado instance = new ExposicaoCandidaturasExpoDecididasEstado(expo);
        boolean expResult = true;
        boolean result = instance.valida();
        assertEquals(expResult, result);
    }
    
}
