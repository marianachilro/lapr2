/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.CandidaturaDemonstracao;
import lapr.project.model.CandidaturaEmSubmissaoEstado;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaCandidaturasExposicoes;
import lapr.project.model.Removivel;
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
public class RemoverCandidaturaControllerTest {
    
    private RemoverCandidaturaController controller;
    
    
    public RemoverCandidaturaControllerTest() {
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
        controller = new RemoverCandidaturaController(ce, "");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getListaExposicoes method, of class RemoverCandidaturaController.
     */
    @Test
    public void testGetListaExposicoes() {
        System.out.println("getListaExposicoes");
        RemoverCandidaturaController instance = controller;
        Exposicao e = new Exposicao();
        List<Exposicao> expResult = new ArrayList<>();
        List<Exposicao> result = instance.getListaExposicoes();
        assertEquals(expResult, result);
    }

    /**
     * Test of selectExposicao method, of class RemoverCandidaturaController.
     */
    @Test
    public void testSelectExposicao() {
        System.out.println("selectExposicao");
        Exposicao e = new Exposicao();
        RemoverCandidaturaController instance = controller;
        instance.selectExposicao(e);
    }

    /**
     * Test of selectCandidatura method, of class RemoverCandidaturaController.
     */
    @Test
    public void testSelectCandidatura() {
        System.out.println("selectCandidatura");
        RemoverCandidaturaController instance = controller;
        Removivel c = new CandidaturaExposicao();
        instance.selectCandidatura(c);
    }

    /**
     * Test of removeCandidatura method, of class RemoverCandidaturaController.
     */
    @Test
    public void testRemoveCandidatura() {
        System.out.println("removeCandidatura");
        RemoverCandidaturaController instance = controller;
        CandidaturaExposicao c = new CandidaturaExposicao();
        c.setEstado(new CandidaturaEmSubmissaoEstado(c));
        instance.selectCandidatura(c);
        boolean expResult = true;
        boolean result = instance.removeCandidatura();
        assertEquals(expResult, result);
    }
    
}
