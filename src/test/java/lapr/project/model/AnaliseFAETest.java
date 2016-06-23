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
        float expResult = (float) 0.05;
        float result = AnaliseFAE.getNIVEL_SIGNIFICANCIA();
        assertEquals(expResult, result);
    }

    /**
     * Test of getREGIAO_CRITICA method, of class AnaliseFAE.
     */
    @Test
    public void testGetREGIAO_CRITICA() {
        System.out.println("getREGIAO_CRITICA");
        float expResult = (float) 1.645;
        float result = AnaliseFAE.getREGIAO_CRITICA();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUtilizador method, of class AnaliseFAE.
     */
    @Test
    public void testGetUtilizador() {
        System.out.println("getUtilizador");
        AnaliseFAE instance = new AnaliseFAE();
        Utilizador u = new Utilizador();
        instance.setUtilizador(u);
        Utilizador expResult = u;
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
        instance.setnCand(expResult);
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
        float expResult = (float) 0.01;
        instance.setMediaTotal(expResult);
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
        List<Float> expResult = new ArrayList<>();
        instance.setMediasFae(expResult);
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
        instance.setDecisao(expResult);
        String result = instance.getDecisao();
        assertEquals(expResult, result);
    }

    /**
     * Test of getVariancia method, of class AnaliseFAE.
     */
    @Test
    public void testGetVariancia() {
        System.out.println("getVariancia");
        AnaliseFAE instance = new AnaliseFAE();
        float expResult = (float) 0.1;
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
        instance.gerarAnalise();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
