/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rita
 */
public class RegistoStandsTest {

    /**
     * Test of novoStand method, of class RegistoStands.
     */
    @Test
    public void testNovoStand() {
        System.out.println("novoStand");
        RegistoStands instance = new RegistoStands();
        Stand expResult = new Stand();
        Stand result = instance.novoStand();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaStands method, of class RegistoStands.
     */
    @Test
    public void testGetAndSeListaStands() {
        System.out.println("getListaStands");
        RegistoStands instance = new RegistoStands();
        List<Stand> expResult = new ArrayList<>();
        instance.setListaStands(expResult);
        List<Stand> result = instance.getListaStands();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaStandsNaoAtribuidos method, of class RegistoStands.
     */
    @Test
    public void testGetListaStandsNaoAtribuidos() {
        System.out.println("getListaStandsNaoAtribuidos");
        List<CandidaturaExposicao> lc = new ArrayList<>();
        RegistoStands instance = new RegistoStands();
        List<Stand> expResult = new ArrayList<>();
        List<Stand> result = instance.getListaStandsNaoAtribuidos(lc);
        assertEquals(expResult, result);
    }

    /**
     * Test of validaStand method, of class RegistoStands.
     */
    @Test
    public void testValidaStand() {
        System.out.println("validaStand");
        Stand s = new Stand();
        RegistoStands instance = new RegistoStands();
        boolean expResult = true;
        instance.addStand(s);
        boolean result = instance.validaStand(s);
        assertEquals(expResult, result);
    }

    /**
     * Test of addStand method, of class RegistoStands.
     */
    @Test
    public void testAddStand() {
        System.out.println("addStand");
        Stand s = new Stand();
        RegistoStands instance = new RegistoStands();
        boolean expResult = true;
        boolean result = instance.addStand(s);
        assertEquals(expResult, result);
    }

    /**
     * Test of registaStand method, of class RegistoStands.
     */
    @Test
    public void testRegistaStand() {
        System.out.println("registaStand");
        Stand s = new Stand();
        RegistoStands instance = new RegistoStands();
        boolean expResult = true;
        boolean result = instance.registaStand(s);
        assertEquals(expResult, result);
    }
    
}
