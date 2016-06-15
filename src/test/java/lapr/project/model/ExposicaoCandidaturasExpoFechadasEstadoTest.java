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
public class ExposicaoCandidaturasExpoFechadasEstadoTest {
    
    public ExposicaoCandidaturasExpoFechadasEstadoTest() {
    }

    /**
     * Test of setExposicaoCandidaturasFechadas method, of class ExposicaoCandidaturasExpoFechadasEstado.
     */
    @Test
    public void testSetExposicaoCandidaturasFechadas() {
        System.out.println("setExposicaoCandidaturasFechadas");
        Exposicao expo = new Exposicao();
        expo.getEstado().setCriada();
        expo.getEstado().setDemoSemFae();
        expo.getEstado().setCompleta();
        expo.getEstado().setExposicaoCandidaturasAbertas();
        expo.getEstado().setExposicaoCandidaturasFechadas();
        ExposicaoCandidaturasExpoFechadasEstado instance = new ExposicaoCandidaturasExpoFechadasEstado(expo);
        boolean expResult = true;
        boolean result = instance.setExposicaoCandidaturasFechadas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setExposicaoConflitosDetetados method, of class ExposicaoCandidaturasExpoFechadasEstado.
     */
    @Test
    public void testSetExposicaoConflitosDetetados() {
        System.out.println("setExposicaoConflitosDetetados");
        Exposicao expo = new Exposicao();
        expo.getEstado().setCriada();
        expo.getEstado().setDemoSemFae();
        expo.getEstado().setCompleta();
        expo.getEstado().setExposicaoCandidaturasAbertas();
        expo.getEstado().setExposicaoCandidaturasFechadas();
        ExposicaoCandidaturasExpoFechadasEstado instance = new ExposicaoCandidaturasExpoFechadasEstado(expo);
        boolean expResult = true;
        boolean result = instance.setExposicaoConflitosDetetados();
        assertEquals(expResult, result);
    }

    /**
     * Test of valida method, of class ExposicaoCandidaturasExpoFechadasEstado.
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
        ExposicaoCandidaturasExpoFechadasEstado instance = new ExposicaoCandidaturasExpoFechadasEstado(expo);
        boolean expResult = true;
        boolean result = instance.valida();
        assertEquals(expResult, result);
    }
    
}
