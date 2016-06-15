/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import lapr.project.utils.Data;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marianachilro
 */
public class ExposicaoInicialEstadoTest {
    
    public ExposicaoInicialEstadoTest() {
    }

    /**
     * Test of setCriada method, of class ExposicaoInicialEstado.
     */
    @Test
    public void testSetCriada() {
        System.out.println("setCriada");
        Exposicao expo = new Exposicao();
        expo.getListaOrganizadores().getListaOrganizadores().add(new Organizador());
        ExposicaoInicialEstado instance = new ExposicaoInicialEstado(expo);
        boolean expResult = true;
        boolean result = instance.setCriada();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of valida method, of class ExposicaoInicialEstado.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        Exposicao expo = new Exposicao();
        ExposicaoInicialEstado instance = new ExposicaoInicialEstado(expo);
        boolean expResult = true;
        boolean result = instance.valida();
        assertEquals(expResult, result);
        
    }
    
}
