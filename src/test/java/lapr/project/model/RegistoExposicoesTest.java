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
 * @author miniondevil
 */
public class RegistoExposicoesTest {
    
 

    /**
     * Test of newExposicao method, of class RegistoExposicoes.
     */
    @Test
    public void testNewExposicao() {
        
        RegistoExposicoes instance = new RegistoExposicoes();
        Exposicao expResult = new Exposicao();
        Exposicao result = instance.newExposicao();
        assertEquals(expResult, result);

    }

    /**
     * Testa o get e o set listaExposicoes.
     */
    @Test
    public void testGetAndSetListaExposicoes() {
      
        RegistoExposicoes instance = new RegistoExposicoes();
        List<Exposicao> expResult = new ArrayList<Exposicao>();
        instance.setListaExposicoes(expResult);
        List<Exposicao> result = instance.getListaExposicoes();
        assertEquals(expResult, result);
  
    }

   
  
    /**
     * Test of getListaExposicoesOrganizadorToString method, of class RegistoExposicoes.
     */
    @Test
    public void testGetListaExposicoesOrganizadorToString() {
        
        String username = "joaovaz";
        RegistoUtilizadores ru = new RegistoUtilizadores();
        Utilizador u = new Utilizador("joao", username, "123", "ajao212");
        ru.addUtilizador(u);
        RegistoExposicoes instance = new RegistoExposicoes();
        Exposicao e = new Exposicao();
        Organizador org = new Organizador(u);
        e.getListaOrganizadores().add(org);
        instance.addExposicao(e);
        List<String> expResult = new ArrayList<String>();
        
        List<String> result = instance.getListaExposicoesOrganizadorToString(username, ru);
        assertEquals(expResult, result);
      
    }

    /**
     * Testa se o método valida dá false caso ainda não haja exposicoes na lista.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        Exposicao e = new Exposicao();
        RegistoExposicoes instance = new RegistoExposicoes();
        boolean expResult = false;
        boolean result = instance.valida(e);
        assertEquals(expResult, result);
   
    }

    /**
     * Test of addExposicao method, of class RegistoExposicoes.
     */
    @Test
    public void testAddExposicao() {
        Exposicao e = new Exposicao();
        RegistoExposicoes instance = new RegistoExposicoes();
        boolean expResult = true;
        boolean result = instance.addExposicao(e);
        assertEquals(expResult, result);
    
    }

    /**
     * Test of registaExposicao method, of class RegistoExposicoes.
     */
    @Test
    public void testRegistaExposicao() {
        
        Exposicao a = new Exposicao();
        RegistoExposicoes instance = new RegistoExposicoes();
        boolean expResult = true;
        boolean result = instance.registaExposicao(a);
        assertEquals(expResult, result);
    
    }

    /**
     * Test of getListaExposicoesDoFAE method, of class RegistoExposicoes.
     */
    @Test
    public void testGetListaExposicoesDoFAE() {
        
        Utilizador u = null;
        RegistoExposicoes instance = new RegistoExposicoes();
        List<Exposicao> expResult = null;
        List<Exposicao> result = instance.getListaExposicoesDoFAE(u);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExpo method, of class RegistoExposicoes.
     */
    @Test
    public void testGetExpo() {
        
        String expo = "teste1";
        RegistoExposicoes instance = new RegistoExposicoes();
        
        Exposicao expResult = new Exposicao();
        expResult.setTitulo(expo);
        instance.addExposicao(expResult);
        Exposicao result = instance.getExpo(expo);
        assertEquals(expResult, result);
    
    }
    
}
