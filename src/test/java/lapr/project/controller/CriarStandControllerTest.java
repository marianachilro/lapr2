/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.CentroExposicoes;
import lapr.project.model.RegistoStands;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author catarinarib
 */
public class CriarStandControllerTest {

    /**
     * Test of getRegistoStands method, of class CriarStandController.
     */
    @Test
    public void testGetRegistoStands() {
        System.out.println("getRegistoStands");
        CentroExposicoes ce = new CentroExposicoes();
        CriarStandController instance = new CriarStandController(ce);
        RegistoStands expResult = ce.getRegistoStands();
        RegistoStands result = instance.getRegistoStands();
        assertEquals(expResult, result);

    }

    /**
     * Test of novoStand method, of class CriarStandController.
     */
    @Test
    public void testNovoStand() {
        System.out.println("novoStand");
        CentroExposicoes ce = new CentroExposicoes();
        CriarStandController instance = new CriarStandController(ce);
        instance.novoStand();

    }

    /**
     * Test of setStand method, of class CriarStandController.
     */
    @Test
    public void testSetStand() {
        System.out.println("setStand");
        String descricao = "a";
        CentroExposicoes ce = new CentroExposicoes();
        CriarStandController instance = new CriarStandController(ce);
        instance.novoStand();
        instance.setStand(descricao);

    }

    /**
     * Test of addStand method, of class CriarStandController.
     */
    @Test
    public void testAddStand() {
        System.out.println("addStand");
        String descricao = "a";
        CentroExposicoes ce = new CentroExposicoes();
        CriarStandController instance = new CriarStandController(ce);
        instance.getRegistoStands();
        instance.novoStand();
        instance.setStand(descricao);

        boolean expResult = true;
        boolean result = instance.addStand();
        assertEquals(expResult, result);

    }

    /**
     * Test of apresentaLista method, of class CriarStandController.
     */
    @Test
    public void testApresentaLista() {
        System.out.println("apresentaLista");
        String descricao = "a";
        CentroExposicoes ce = new CentroExposicoes();
        CriarStandController instance = new CriarStandController(ce);
        instance.getRegistoStands();
        instance.novoStand();
        instance.setStand(descricao);
        instance.addStand();
        String expResult = ce.getRegistoStands().toString();
        String result = instance.apresentaLista();
        assertEquals(expResult, result);

    }

}
