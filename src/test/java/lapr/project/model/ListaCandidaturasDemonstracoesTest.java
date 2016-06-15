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
 * @author catarinarib
 */
public class ListaCandidaturasDemonstracoesTest {

    /**
     * Test of getListCandidaturas method, of class
     * ListaCandidaturasDemonstracoes.
     */
    @Test
    public void testGetListCandidaturasAndSetListCandidaturas() {
        System.out.println("testeListCandidaturas");
        ListaCandidaturasDemonstracoes instance = new ListaCandidaturasDemonstracoes();
        List<CandidaturaDemonstracao> listaCandidaturas = new ArrayList<>();
        instance.setListCandidaturas(listaCandidaturas);
        List<CandidaturaDemonstracao> expResult = listaCandidaturas;
        List<CandidaturaDemonstracao> result = instance.getListCandidaturas();
        assertEquals(expResult, result);
    }

    /**
     * Test of novaCandidatura method, of class ListaCandidaturasDemonstracoes.
     */
    @Test
    public void testNovaCandidatura() {
        System.out.println("testeNovaCandidatura");
        ListaCandidaturasDemonstracoes instance = new ListaCandidaturasDemonstracoes();
        CandidaturaDemonstracao expResult = new CandidaturaDemonstracao();
        CandidaturaDemonstracao result = instance.novaCandidatura();
        assertEquals(expResult, result);
    }

    /**
     * Test of validaCandidatura method, of class
     * ListaCandidaturasDemonstracoes.
     */
    @Test
    public void testValidaCandidatura() {
        System.out.println("testeValidaCandidatura");
        CandidaturaDemonstracao c = new CandidaturaDemonstracao();
        ListaCandidaturasDemonstracoes instance = new ListaCandidaturasDemonstracoes();
        boolean expResult = false;
        boolean result = instance.validaCandidatura(c);
        assertEquals(expResult, result);
    }

    /**
     * Test of addCandidatura method, of class ListaCandidaturasDemonstracoes.
     */
    @Test
    public void testAddCandidatura() {
        System.out.println("testeAddCandidatura");
        CandidaturaDemonstracao c = new CandidaturaDemonstracao();
        ListaCandidaturasDemonstracoes instance = new ListaCandidaturasDemonstracoes();
        boolean expResult = true;
        boolean result = instance.addCandidatura(c);
        assertEquals(expResult, result);
    }

    /**
     * Test of registaCandidatura method, of class
     * ListaCandidaturasDemonstracoes.
     */
    @Test
    public void testRegistaCandidatura() {
        System.out.println("testeRegistaCandidatura");
        CandidaturaDemonstracao c = new CandidaturaDemonstracao();
        ListaCandidaturasDemonstracoes instance = new ListaCandidaturasDemonstracoes();
        boolean expResult = true;
        boolean result = instance.registaCandidatura(c);
        assertEquals(expResult, result);

    }

}
