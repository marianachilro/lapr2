/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

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
public class LocalTest {

    /**
     * Test of getNome method, of class Local.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Local instance = new Local();
        String expResult = "local";
        instance.setNome(expResult);
        String result = instance.getNome();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Local.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Local instance = new Local();
        instance.setNome("Local");
        String expResult = "Local: Local";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
