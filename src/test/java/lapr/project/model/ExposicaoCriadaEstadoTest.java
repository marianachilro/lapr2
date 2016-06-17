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
public class ExposicaoCriadaEstadoTest {
    
    public ExposicaoCriadaEstadoTest() {
    }

    /**
     * Test of setCriada method, of class ExposicaoCriadaEstado.
     */
    @Test
    public void testSetCriada() {
        System.out.println("setCriada");
        Local local = new Local("Porto");
        Exposicao expo = new Exposicao("titulo", "descricao", new Data(2016, 8, 17), new Data(2016, 12, 18), local, new Data(2016, 8, 20), new Data(2016, 8, 30),
            new Data(2016, 9, 3), new Data(2016, 9, 15));
        ExposicaoCriadaEstado instance = new ExposicaoCriadaEstado(expo);
        boolean expResult = true;
        boolean result = instance.setCriada();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setFaeSemDemo method, of class ExposicaoCriadaEstado.
     */
    @Test
    public void testSetFaeSemDemo() {
        System.out.println("setFaeSemDemo");
        Exposicao expo = new Exposicao();
        ExposicaoCriadaEstado instance = new ExposicaoCriadaEstado(expo);
        boolean expResult = true;
        boolean result = instance.setFaeSemDemo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDemoSemFae method, of class ExposicaoCriadaEstado.
     */
    @Test
    public void testSetDemoSemFae() {
        System.out.println("setDemoSemFae");
        Exposicao expo = new Exposicao();
        ExposicaoCriadaEstado instance = new ExposicaoCriadaEstado(expo);
        boolean expResult = true;
        boolean result = instance.setDemoSemFae();
        assertEquals(expResult, result);
    }

    /**
     * Test of valida method, of class ExposicaoCriadaEstado.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        Exposicao expo = new Exposicao();
        expo.getEstado().setCriada();
        ExposicaoCriadaEstado instance = new ExposicaoCriadaEstado(expo);
        boolean expResult = true;
        boolean result = instance.valida();
        assertEquals(expResult, result);
    }
    
}
