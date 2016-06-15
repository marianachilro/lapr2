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
public class ExposicaoCompletaEstadoTest {
    
    public ExposicaoCompletaEstadoTest() {
    }

    /**
     * Test of setCompleta method, of class ExposicaoCompletaEstado.
     */
    @Test
    public void testSetCompleta() {
        System.out.println("setCompleta");
        Exposicao expo = new Exposicao();
        expo.getEstado().setCriada();
        expo.getEstado().setDemoSemFae();
        expo.getEstado().setCompleta();
        ExposicaoCompletaEstado instance =new ExposicaoCompletaEstado(expo);
        boolean expResult = true;
        boolean result = instance.setCompleta();
        assertEquals(expResult, result);
    }

    /**
     * Test of setExposicaoCandidaturasAbertas method, of class ExposicaoCompletaEstado.
     */
    @Test
    public void testSetExposicaoCandidaturasAbertas() {
        System.out.println("setExposicaoCandidaturasAbertas");
        Exposicao expo = new Exposicao();
        expo.getEstado().setCriada();
        expo.getEstado().setDemoSemFae();
        expo.getEstado().setCompleta();
        ExposicaoCompletaEstado instance = new ExposicaoCompletaEstado(expo);
        boolean expResult = true;
        boolean result = instance.setExposicaoCandidaturasAbertas();
        assertEquals(expResult, result);
    }

    /**
     * Test of valida method, of class ExposicaoCompletaEstado.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        Exposicao expo = new Exposicao();
        expo.getEstado().setCriada();
        expo.getEstado().setFaeSemDemo();
        expo.getEstado().setCompleta();
        ExposicaoCompletaEstado instance = new ExposicaoCompletaEstado(expo);
        boolean expResult = true;
        boolean result = instance.valida();
        assertEquals(expResult, result);
    }
    
}
