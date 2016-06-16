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
public class ListaConflitosTest {
    
    /**
     * Test of registerConflitos method, of class ListaConflitos.
     */
    @Test
    public void testRegisterConflitos() {
        System.out.println("registerConflitos");
        List lc = new ArrayList<>();
        Conflito c = new Conflito();
        ListaConflitos instance = new ListaConflitos();
        lc.add(c);
        List expResult = lc;
        List result = instance.registerConflitos(lc);
        assertEquals(expResult, result);
    }

    /**
     * Test of newConflito method, of class ListaConflitos.
     */
    @Test
    public void testNewConflito_Candidatura_FAE() {
        System.out.println("newConflito");
        Candidatura c = new CandidaturaExposicao();
        FAE fae = new FAE();
        ListaConflitos instance = new ListaConflitos();
        Conflito expResult = new Conflito(fae, c);
        Conflito result = instance.newConflito(c, fae);
        assertEquals(expResult, result);
    }

    /**
     * Test of newConflito method, of class ListaConflitos.
     */
    @Test
    public void testNewConflito_0args() {
        System.out.println("newConflito");
        ListaConflitos instance = new ListaConflitos();
        Conflito expResult = new Conflito();
        Conflito result = instance.newConflito();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLista method, of class ListaConflitos.
     */
    @Test
    public void testGetLista() {
        System.out.println("getLista");
        ListaConflitos instance = new ListaConflitos();
        List<Conflito> expResult = new ArrayList<>();
        Conflito c = new Conflito();
        expResult.add(c);
        instance.addConflito(c);
        List<Conflito> result = instance.getLista();
        assertEquals(expResult, result);
    }

//    /**
//     * Test of setLista method, of class ListaConflitos.
//     */
//    @Test
//    public void testSetLista() {
//        System.out.println("setLista");
//        List<Conflito> lc = null;
//        ListaConflitos instance = new ListaConflitos();
//        instance.setLista(lc);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
