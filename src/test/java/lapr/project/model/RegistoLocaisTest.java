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
public class RegistoLocaisTest {

    /**
     * Test of getListaLocais method, of class RegistoLocais.
     */
    @Test
    public void testGetListaLocais() {
        System.out.println("getListaLocais");
        RegistoLocais instance = new RegistoLocais();
        List<Local> expResult = new ArrayList<>();
        List<Local> result = instance.getListaLocais();
        assertEquals(expResult, result);
    }

    /**
     * Test of addLocal method, of class RegistoLocais.
     */
    @Test
    public void testAddLocal() {
        System.out.println("addLocal");
        Local l = new Local();
        RegistoLocais instance = new RegistoLocais();
        boolean expResult = true;
        boolean result = instance.addLocal(l);
        assertEquals(expResult, result);
    }

    /**
     * Test of validaLocal method, of class RegistoLocais.
     */
    @Test
    public void testValidaLocal() {
        System.out.println("validaLocal");
        Local l = new Local();
        RegistoLocais instance = new RegistoLocais();
        instance.addLocal(l);
        boolean expResult = true;
        boolean result = instance.validaLocal(l);
        assertEquals(expResult, result);
    }

    /**
     * Test of registaLocal method, of class RegistoLocais.
     */
    @Test
    public void testRegistaLocal() {
        System.out.println("registaLocal");
        Local l = new Local();
        RegistoLocais instance = new RegistoLocais();
        boolean expResult = true;
        boolean result = instance.registaLocal(l);
        assertEquals(expResult, result);
    }
}
