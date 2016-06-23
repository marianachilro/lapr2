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
public class CandidaturaInicialEstadoTest {
    
    public CandidaturaInicialEstadoTest() {
    }

    /**
     * Test of setEmSubmissao method, of class CandidaturaInicialEstado.
     */
    @Test
    public void testSetEmSubmissao() {
        System.out.println("setEmSubmissao");
        CandidaturaGeral candidatura = new CandidaturaGeral() {};
        CandidaturaInicialEstado instance = new CandidaturaInicialEstado(candidatura);
        boolean expResult = true;
        boolean result = instance.setEmSubmissao();
        assertEquals(expResult, result);
    }

    /**
     * Test of valida method, of class CandidaturaInicialEstado.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        CandidaturaGeral candidatura = new CandidaturaGeral();
        CandidaturaInicialEstado instance = new CandidaturaInicialEstado(candidatura);
        boolean expResult = true;
        boolean result = instance.valida();
        assertEquals(expResult, result);
    }
    
}
