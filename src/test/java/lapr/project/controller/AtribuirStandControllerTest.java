/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.Stand;
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
public class AtribuirStandControllerTest {
    
    private AtribuirStandController controller;
    
    public AtribuirStandControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        CentroExposicoes ce = new CentroExposicoes();
        controller = new AtribuirStandController(ce);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getListaExposicoesOrganizador method, of class AtribuirStandController.
     */
    @Test
    public void testGetListaExposicoesOrganizador() {
        System.out.println("getListaExposicoesOrganizador");
        String username = "";
        AtribuirStandController instance = controller;
        List<Exposicao> expResult = new ArrayList<>();
        List<Exposicao> result = instance.getListaExposicoesOrganizador(username);
        assertEquals(expResult, result);
    }

    /**
     * Test of selectExposicao method, of class AtribuirStandController.
     */
    @Test
    public void testSelectExposicao() {
        System.out.println("selectExposicao");
        Exposicao e = new Exposicao();
        AtribuirStandController instance = controller;
        instance.selectExposicao(e);
    }

    /**
     * Test of getListaCandidaturas method, of class AtribuirStandController.
     */
    @Test
    public void testGetListaCandidaturas() {
        System.out.println("getListaCandidaturas");
        AtribuirStandController instance = controller;
        Exposicao e = new Exposicao();
        controller.selectExposicao(e);
        List<CandidaturaExposicao> expResult = new ArrayList<>();
        List<CandidaturaExposicao> result = instance.getListaCandidaturas();
        assertEquals(expResult, result);
    }

    /**
     * Test of selectCandidatura method, of class AtribuirStandController.
     */
    @Test
    public void testSelectCandidatura() {
        System.out.println("selectCandidatura");
        CandidaturaExposicao c = new CandidaturaExposicao();
        AtribuirStandController instance = controller;
        instance.selectCandidatura(c);
    }

    /**
     * Test of getListaStandsNaoAtribuidos method, of class AtribuirStandController.
     */
    @Test
    public void testGetListaStandsNaoAtribuidos() {
        System.out.println("getListaStandsNaoAtribuidos");
        AtribuirStandController instance = controller;
        CandidaturaExposicao c = new CandidaturaExposicao();
        instance.selectCandidatura(c);
        List<Stand> expResult = new ArrayList<>();
        List<Stand> result = instance.getListaStandsNaoAtribuidos();
        assertEquals(expResult, result);
    }

    /**
     * Test of selectStand method, of class AtribuirStandController.
     */
    @Test
    public void testSelectStand() {
        System.out.println("selectStand");
        Stand s = new Stand();
        AtribuirStandController instance = controller;
        instance.selectStand(s);
    }

    /**
     * Test of setStand method, of class AtribuirStandController.
     */
    @Test
    public void testSetStand() {
        System.out.println("setStand");
        AtribuirStandController instance = controller;
        CandidaturaExposicao c = new CandidaturaExposicao();
        Stand s = new Stand();
        controller.selectCandidatura(c);
        controller.selectStand(s);
        instance.setStand();
    }

    /**
     * Test of transitaEstado method, of class AtribuirStandController.
     */
    @Test
    public void testTransitaEstado() {
        System.out.println("transitaEstado");
        AtribuirStandController instance = controller;
        Exposicao e = new Exposicao();
        CandidaturaExposicao c = new CandidaturaExposicao();
        instance.selectExposicao(e);
        instance.getListaCandidaturas();
        instance.selectCandidatura(c);
        instance.getListaStandsNaoAtribuidos();
        boolean expResult = false;
        boolean result = instance.transitaEstado();
        assertEquals(expResult, result);
    }

    /**
     * Test of checkEstado method, of class AtribuirStandController.
     */
    @Test
    public void testCheckEstado() {
        System.out.println("checkEstado");
        AtribuirStandController instance = controller;
        Exposicao e = new Exposicao();
        instance.selectExposicao(e);
        boolean expResult = false;
        boolean result = instance.checkEstado();
        assertEquals(expResult, result);
    }

    /**
     * Test of candToListString method, of class AtribuirStandController.
     */
    @Test
    public void testCandToListString() {
        System.out.println("candToListString");
        List<CandidaturaExposicao> lista = new ArrayList<>();
        AtribuirStandController instance = controller;
        List<String> expResult = new ArrayList<>();
        List<String> result = instance.candToListString(lista);
        assertEquals(expResult, result);
    }

    /**
     * Test of standToListString method, of class AtribuirStandController.
     */
    @Test
    public void testStandToListString() {
        System.out.println("standToListString");
        List<Stand> lista = new ArrayList<>();
        AtribuirStandController instance = controller;
        List<String> expResult = new ArrayList<>();
        List<String> result = instance.standToListString(lista);
        assertEquals(expResult, result);
    }
    
}
