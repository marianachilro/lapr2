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
public class ExposicaoConflitosAtualizadosExpoEstadoTest {
    
    public ExposicaoConflitosAtualizadosExpoEstadoTest() {
    }

    /**
     * Test of setExposicaoConflitosAtualizados method, of class ExposicaoConflitosAtualizadosExpoEstado.
     */
    @Test
    public void testSetExposicaoConflitosAtualizados() {
        System.out.println("setExposicaoConflitosAtualizados");
        Exposicao expo = new Exposicao();
        expo.getEstado().setCriada();
        expo.getEstado().setDemoSemFae();
        expo.getEstado().setCompleta();
        expo.getEstado().setExposicaoCandidaturasAbertas();
        expo.getEstado().setExposicaoCandidaturasFechadas();
        expo.getEstado().setExposicaoConflitosDetetados();
        expo.getEstado().setExposicaoConflitosAtualizados();
        ExposicaoConflitosAtualizadosExpoEstado instance = new ExposicaoConflitosAtualizadosExpoEstado(expo);
        boolean expResult = true;
        boolean result = instance.setExposicaoConflitosAtualizados();
        assertEquals(expResult, result);
    }

    /**
     * Test of setExposicaoCandidaturasAtribuidas method, of class ExposicaoConflitosAtualizadosExpoEstado.
     */
    @Test
    public void testSetExposicaoCandidaturasAtribuidas() {
        System.out.println("setExposicaoCandidaturasAtribuidas");
        Exposicao expo = new Exposicao();
        expo.getEstado().setCriada();
        expo.getEstado().setDemoSemFae();
        expo.getEstado().setCompleta();
        expo.getEstado().setExposicaoCandidaturasAbertas();
        expo.getEstado().setExposicaoCandidaturasFechadas();
        expo.getEstado().setExposicaoConflitosDetetados();
        expo.getEstado().setExposicaoConflitosAtualizados();
        ExposicaoConflitosAtualizadosExpoEstado instance = new ExposicaoConflitosAtualizadosExpoEstado(expo);
        boolean expResult = true;
        boolean result = instance.setExposicaoCandidaturasAtribuidas();
        assertEquals(expResult, result);
    }

    /**
     * Test of valida method, of class ExposicaoConflitosAtualizadosExpoEstado.
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
        ExposicaoConflitosAtualizadosExpoEstado instance = new ExposicaoConflitosAtualizadosExpoEstado(expo);
        boolean expResult = true;
        boolean result = instance.valida();
        assertEquals(expResult, result);
    }
    
}
