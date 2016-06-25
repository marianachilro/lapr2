/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

import java.util.List;
import lapr.project.model.Utilizador;
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
public class AnaliseFAETest {
    
    public AnaliseFAETest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNIVEL_SIGNIFICANCIA method, of class AnaliseFAE.
     */
    @Test
    public void testGetNIVEL_SIGNIFICANCIA() {
        System.out.println("getNIVEL_SIGNIFICANCIA");
        float expResult = 0.0F;
        float result = AnaliseFAE.getNIVEL_SIGNIFICANCIA();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getREGIAO_CRITICA method, of class AnaliseFAE.
     */
    @Test
    public void testGetREGIAO_CRITICA() {
        System.out.println("getREGIAO_CRITICA");
        float expResult = 0.0F;
        float result = AnaliseFAE.getREGIAO_CRITICA();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUtilizador method, of class AnaliseFAE.
     */
    @Test
    public void testGetUtilizador() {
        System.out.println("getUtilizador");
        AnaliseFAE instance = new AnaliseFAE();
        Utilizador expResult = null;
        Utilizador result = instance.getUtilizador();
        assertEquals(expResult, result);
    }

    /**
     * Test of getnCand method, of class AnaliseFAE.
     */
    @Test
    public void testGetnCand() {
        System.out.println("getnCand");
        AnaliseFAE instance = new AnaliseFAE();
        int expResult = 0;
        int result = instance.getnCand();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMediaTotal method, of class AnaliseFAE.
     */
    @Test
    public void testGetMediaTotal() {
        System.out.println("getMediaTotal");
        AnaliseFAE instance = new AnaliseFAE();
        float expResult = 0.0F;
        float result = instance.getMediaTotal();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getMediasFae method, of class AnaliseFAE.
     */
    @Test
    public void testGetMediasFae() {
        System.out.println("getMediasFae");
        AnaliseFAE instance = new AnaliseFAE();
        List<Float> expResult = null;
        List<Float> result = instance.getMediasFae();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDecisao method, of class AnaliseFAE.
     */
    @Test
    public void testGetDecisao() {
        System.out.println("getDecisao");
        AnaliseFAE instance = new AnaliseFAE();
        String expResult = "";
        String result = instance.getDecisao();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUtilizador method, of class AnaliseFAE.
     */
    @Test
    public void testSetUtilizador() {
        System.out.println("setUtilizador");
        Utilizador utilizador = null;
        AnaliseFAE instance = new AnaliseFAE();
        instance.setUtilizador(utilizador);
    }

    /**
     * Test of setnCand method, of class AnaliseFAE.
     */
    @Test
    public void testSetnCand() {
        System.out.println("setnCand");
        int nCand = 0;
        AnaliseFAE instance = new AnaliseFAE();
        instance.setnCand(nCand);
    }

    /**
     * Test of setMediaTotal method, of class AnaliseFAE.
     */
    @Test
    public void testSetMediaTotal() {
        System.out.println("setMediaTotal");
        float mediaTotal = 0.0F;
        AnaliseFAE instance = new AnaliseFAE();
        instance.setMediaTotal(mediaTotal);
    }

    /**
     * Test of setMediasFae method, of class AnaliseFAE.
     */
    @Test
    public void testSetMediasFae() {
        System.out.println("setMediasFae");
        List<Float> mediasFae = null;
        AnaliseFAE instance = new AnaliseFAE();
        instance.setMediasFae(mediasFae);
    }

    /**
     * Test of setDecisao method, of class AnaliseFAE.
     */
    @Test
    public void testSetDecisao() {
        System.out.println("setDecisao");
        String decisao = "";
        AnaliseFAE instance = new AnaliseFAE();
        instance.setDecisao(decisao);
    }

    /**
     * Test of getVariancia method, of class AnaliseFAE.
     */
    @Test
    public void testGetVariancia() {
        System.out.println("getVariancia");
        AnaliseFAE instance = new AnaliseFAE();
        float expResult = 0.0F;
        float result = instance.getVariancia();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getMediaDesvios method, of class AnaliseFAE.
     */
    @Test
    public void testGetMediaDesvios() {
        System.out.println("getMediaDesvios");
        AnaliseFAE instance = new AnaliseFAE();
        float expResult = 0.0F;
        float result = instance.getMediaDesvios();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMediaClassificacoes method, of class AnaliseFAE.
     */
    @Test
    public void testGetMediaClassificacoes() {
        System.out.println("getMediaClassificacoes");
        AnaliseFAE instance = new AnaliseFAE();
        float expResult = 0.0F;
        float result = instance.getMediaClassificacoes();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstatistica method, of class AnaliseFAE.
     */
    @Test
    public void testGetEstatistica() {
        System.out.println("getEstatistica");
        AnaliseFAE instance = new AnaliseFAE();
        float expResult = 0.0F;
        float result = instance.getEstatistica();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gerarAnalise method, of class AnaliseFAE.
     */
    @Test
    public void testGerarAnalise() {
        System.out.println("gerarAnalise");
        AnaliseFAE instance = new AnaliseFAE();
        float expResult = 0.0F;
        float result = instance.gerarAnalise();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class AnaliseFAE.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        AnaliseFAE instance = new AnaliseFAE();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class AnaliseFAE.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        AnaliseFAE instance = new AnaliseFAE();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class AnaliseFAE.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        AnaliseFAE instance = new AnaliseFAE();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
