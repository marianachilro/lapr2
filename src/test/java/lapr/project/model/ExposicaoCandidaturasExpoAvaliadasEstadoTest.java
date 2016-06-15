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
public class ExposicaoCandidaturasExpoAvaliadasEstadoTest {
    
    public ExposicaoCandidaturasExpoAvaliadasEstadoTest() {
    }

    /**
     * Test of setExposicaoCandidaturasAvaliadas method, of class ExposicaoCandidaturasExpoAvaliadasEstado.
     */
    @Test
    public void testSetExposicaoCandidaturasAvaliadas() {
        System.out.println("setExposicaoCandidaturasAvaliadas");
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
        ExposicaoCandidaturasExpoAvaliadasEstado instance = new ExposicaoCandidaturasExpoAvaliadasEstado(expo);
        boolean expResult = true;
        boolean result = instance.setExposicaoCandidaturasAvaliadas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setExposicaoCandidaturasDecididas method, of class ExposicaoCandidaturasExpoAvaliadasEstado.
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
        ExposicaoCandidaturasExpoAvaliadasEstado instance = new ExposicaoCandidaturasExpoAvaliadasEstado(expo);
        boolean expResult = true;
        boolean result = instance.setExposicaoCandidaturasDecididas();
        assertEquals(expResult, result);
    }

    /**
     * Test of valida method, of class ExposicaoCandidaturasExpoAvaliadasEstado.
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
        ExposicaoCandidaturasExpoAvaliadasEstado instance = new ExposicaoCandidaturasExpoAvaliadasEstado(expo);
        boolean expResult = true;
        boolean result = instance.valida();
        assertEquals(expResult, result);
    }
    
}
