/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author miniondevil
 */
public class ListaCandidaturasExposicoesTest {
    
    public ListaCandidaturasExposicoesTest() {
    }

    /**
     * Test of getListaCandRemovidas method, of class ListaCandidaturasExposicoes.
     */
    @Test
    public void testGetListaCandRemovidas() {
        
        ListaCandidaturasExposicoes instance = new ListaCandidaturasExposicoes();
        CandidaturaExposicao c1 = new CandidaturaExposicao();
        instance.addCandidatura(c1);
        List<Candidatura> expResult = new ArrayList<>();
        expResult.add(c1);
        List<Candidatura> result = instance.getListaCandRemovidas();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of removeCandidatura method, of class ListaCandidaturasExposicoes.
     */
    @Test
    public void testRemoveCandidatura() {
        
        CandidaturaExposicao c = new CandidaturaExposicao();
        ListaCandidaturasExposicoes instance = new ListaCandidaturasExposicoes();
        instance.addCandidatura(c);
        instance.removeCandidatura(c);
        List<CandidaturaExposicao> expResult = new ArrayList<>();
        List<CandidaturaExposicao> result = instance.getListCandidaturas();
        assertEquals(expResult, result);
    }

//    /**
//     * Test of getListCandidaturas method, of class ListaCandidaturasExposicoes.
//     */
//    @Test
//    public void testGetListCandidaturas() {
//        System.out.println("getListCandidaturas");
//        ListaCandidaturasExposicoes instance = new ListaCandidaturasExposicoes();
//        List<CandidaturaExposicao> expResult = null;
//        List<CandidaturaExposicao> result = instance.getListCandidaturas();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setListCandidaturas method, of class ListaCandidaturasExposicoes.
//     */
//    @Test
//    public void testSetListCandidaturas() {
//        System.out.println("setListCandidaturas");
//        List<CandidaturaExposicao> listaCandidaturas = null;
//        ListaCandidaturasExposicoes instance = new ListaCandidaturasExposicoes();
//        instance.setListCandidaturas(listaCandidaturas);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of novaCandidatura method, of class ListaCandidaturasExposicoes.
     */
    @Test
    public void testNovaCandidatura() {
        System.out.println("novaCandidatura");
        ListaCandidaturasExposicoes instance = new ListaCandidaturasExposicoes();
        CandidaturaExposicao expResult = new CandidaturaExposicao();
        CandidaturaExposicao result = instance.novaCandidatura();
        assertEquals(expResult, result);
    }

    /**
     * Test of validaCandidatura method, of class ListaCandidaturasExposicoes.
     */
    @Test
    public void testValidaCandidatura() {
        System.out.println("validaCandidatura");
        CandidaturaExposicao c = null;
        ListaCandidaturasExposicoes instance = new ListaCandidaturasExposicoes();
        boolean expResult = false;
        boolean result = instance.validaCandidatura(c);
        assertEquals(expResult, result);
    }

    /**
     * Test of addCandidatura method, of class ListaCandidaturasExposicoes.
     */
    @Test
    public void testAddCandidatura() {
        System.out.println("addCandidatura");
        CandidaturaExposicao c = new CandidaturaExposicao();
        ListaCandidaturasExposicoes instance = new ListaCandidaturasExposicoes();
        boolean expResult = true;
        boolean result = instance.addCandidatura(c);
        assertEquals(expResult, result);
    }

    /**
     * Test of registaCandidatura method, of class ListaCandidaturasExposicoes.
     */
    @Test
    public void testRegistaCandidatura() {
        System.out.println("registaCandidatura");
        CandidaturaExposicao c = new CandidaturaExposicao();
        ListaCandidaturasExposicoes instance = new ListaCandidaturasExposicoes();
        boolean expResult = true;
        boolean result = instance.registaCandidatura(c);
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaCandidaturasRep method, of class ListaCandidaturasExposicoes.
     */
    @Test
    public void testGetListaCandidaturasRep() {
        System.out.println("getListaCandidaturasRep");
        String email = "123";
        ListaCandidaturasExposicoes instance = new ListaCandidaturasExposicoes();
        CandidaturaExposicao c = new CandidaturaExposicao(email, "", "", 1, 20, 30);
        List<CandidaturaExposicao> expResult = new ArrayList<>();
        expResult.add(c);
        instance.addCandidatura(c);
        
        List<CandidaturaExposicao> result = instance.getListaCandidaturasRep(email);
        assertEquals(expResult, result);
    }

    /**
     * Test of getListacandidaturaRepresentanteComStand method, of class ListaCandidaturasExposicoes.
     */
    @Test
    public void testGetListacandidaturaRepresentanteComStand() {
        System.out.println("getListacandidaturaRepresentanteComStand");
        String email = "123";
        ListaCandidaturasExposicoes instance = new ListaCandidaturasExposicoes();
        CandidaturaExposicao c = new CandidaturaExposicao(email, "", "", 1, 20, 30);
        c.setStand(new Stand());
        List<CandidaturaExposicao> expResult = new ArrayList<>();
        expResult.add(c);
        instance.addCandidatura(c);
        List<CandidaturaExposicao> result = instance.getListacandidaturaRepresentanteComStand(email);
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaCandRepEstadoCriadoOuAlterado method, of class ListaCandidaturasExposicoes.
     */
    @Test
    public void testGetListaCandRepEstadoCriadoOuAlterado() {
        System.out.println("getListaCandRepEstadoCriadoOuAlterado");
        String email = "123";
        ListaCandidaturasExposicoes instance = new ListaCandidaturasExposicoes();
        CandidaturaExposicao c = new CandidaturaExposicao(email, "", "", 1, 20, 30);
        c.setEstado(new CandidaturaAlteradaEstado(c));
        List<CandidaturaExposicao> expResult = new ArrayList<>();
        expResult.add(c);
          CandidaturaExposicao c1 = new CandidaturaExposicao(email, "", "", 1, 20, 30);
        c1.setEstado(new CandidaturaAlteradaEstado(c1));
        expResult.add(c1);
        instance.addCandidatura(c);
        instance.addCandidatura(c1);
        List<CandidaturaExposicao> result = instance.getListaCandRepEstadoCriadoOuAlterado(email);
        assertEquals(expResult, result);
     
    }
    
      /**
     * Testa se o método só retorna cand no estado alterado ou criado
     */
    @Test
    public void testGetListaCandRepEstadoCriadoOuAlterado1() {
        System.out.println("getListaCandRepEstadoCriadoOuAlterado");
        String email = "123";
        ListaCandidaturasExposicoes instance = new ListaCandidaturasExposicoes();
        CandidaturaExposicao c = new CandidaturaExposicao(email, "", "", 1, 20, 30);
        c.setEstado(new CandidaturaAlteradaEstado(c));
        List<CandidaturaExposicao> expResult = new ArrayList<>();
        expResult.add(c);
          CandidaturaExposicao c1 = new CandidaturaExposicao(email, "", "", 1, 20, 30);
        c1.setEstado(new CandidaturaAlteradaEstado(c1));
        expResult.add(c1);
        CandidaturaExposicao c2 = new CandidaturaExposicao(email, "", "", 1, 20, 30);
        
        instance.addCandidatura(c);
        instance.addCandidatura(c1);
        instance.addCandidatura(c2);
        List<CandidaturaExposicao> result = instance.getListaCandRepEstadoCriadoOuAlterado(email);
        assertEquals(expResult, result);
       
    }
     /**
     * Testa se o método só retorna cand no estado alterado ou criado do representante.
     */
    @Test
    public void testGetListaCandRepEstadoCriadoOuAlterado2() {
        System.out.println("getListaCandRepEstadoCriadoOuAlterado");
        String email = "123";
        String email1 ="321";
        ListaCandidaturasExposicoes instance = new ListaCandidaturasExposicoes();
        CandidaturaExposicao c = new CandidaturaExposicao(email, "", "", 1, 20, 30);
        c.setEstado(new CandidaturaAlteradaEstado(c));
        List<CandidaturaExposicao> expResult = new ArrayList<>();
        expResult.add(c);
          CandidaturaExposicao c1 = new CandidaturaExposicao(email, "", "", 1, 20, 30);
        c1.setEstado(new CandidaturaAlteradaEstado(c1));
        expResult.add(c1);
        CandidaturaExposicao c2 = new CandidaturaExposicao(email1, "", "", 1, 20, 30);
        c2.setEstado(new CandidaturaAlteradaEstado(c2));
        
         instance.addCandidatura(c);
        instance.addCandidatura(c1);
        instance.addCandidatura(c2);
        List<CandidaturaExposicao> result = instance.getListaCandRepEstadoCriadoOuAlterado(email);
        assertEquals(expResult, result);
    }
    
}
