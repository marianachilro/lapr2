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
public class ExposicaoCandidaturasExpoAbertasEstadoTest {
    
    public ExposicaoCandidaturasExpoAbertasEstadoTest() {
    }

    /**
     * Test of setExposicaoCandidaturasAbertas method, of class ExposicaoCandidaturasExpoAbertasEstado.
     */
    @Test
    public void testSetExposicaoCandidaturasAbertas() {
        System.out.println("setExposicaoCandidaturasAbertas");
        Exposicao expo = new Exposicao();
        expo.getEstado().setCriada();
        expo.getEstado().setDemoSemFae();
        expo.getEstado().setCompleta();
        expo.getEstado().setExposicaoCandidaturasAbertas();
        ExposicaoCandidaturasExpoAbertasEstado instance = new ExposicaoCandidaturasExpoAbertasEstado(expo);
        boolean expResult = true;
        boolean result = instance.setExposicaoCandidaturasAbertas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setExposicaoCandidaturasFechadas method, of class ExposicaoCandidaturasExpoAbertasEstado.
     */
    @Test
    public void testSetExposicaoCandidaturasFechadas() {
        System.out.println("setExposicaoCandidaturasFechadas");
        Exposicao expo = new Exposicao();
        expo.getEstado().setCriada();
        expo.getEstado().setDemoSemFae();
        expo.getEstado().setCompleta();
        expo.getEstado().setExposicaoCandidaturasAbertas();
        ExposicaoCandidaturasExpoAbertasEstado instance = new ExposicaoCandidaturasExpoAbertasEstado(expo);
        boolean expResult = true;
        boolean result = instance.setExposicaoCandidaturasFechadas();
        assertEquals(expResult, result);
    }

    /**
     * Test of valida method, of class ExposicaoCandidaturasExpoAbertasEstado.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        Exposicao expo = new Exposicao();
        expo.getEstado().setCriada();
        expo.getEstado().setDemoSemFae();
        expo.getEstado().setCompleta();
        expo.getEstado().setExposicaoCandidaturasAbertas();
        ExposicaoCandidaturasExpoAbertasEstado instance = new ExposicaoCandidaturasExpoAbertasEstado(expo);
        boolean expResult = true;
        boolean result = instance.valida();
        assertEquals(expResult, result);
    }
    
}
