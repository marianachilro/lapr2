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
public class ListaAvaliacoesTest {
    


    /**
     * Test of getListaAvaliacao method, of class ListaAvaliacoes.
     */
    @Test
    public void testGetListaAvaliacao() {
        System.out.println("testeGetListaAvaliacao");
        ListaAvaliacoes instance = new ListaAvaliacoes();
        List<Avaliacao> expResult = new ArrayList<>();
        List<Avaliacao> result = instance.getListaAvaliacao();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of validaAvaliacao method, of class ListaAvaliacoes.
     */
    @Test
    public void testValidaAvaliacao() {
        System.out.println("testeValidaAvaliacao");
        Avaliacao novaAvaliacao = new Avaliacao();
        ListaAvaliacoes instance = new ListaAvaliacoes();
        boolean expResult = false;
        boolean result = instance.validaAvaliacao(novaAvaliacao);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of addAvaliacao method, of class ListaAvaliacoes.
     */
    @Test
    public void testAddAvaliacao() {
        System.out.println("addAvaliacao");
        Avaliacao novaAvaliacao = new Avaliacao();
        ListaAvaliacoes instance = new ListaAvaliacoes();
        instance.addAvaliacao(novaAvaliacao);
       
    }

    /**
     * Test of novaAvaliacao method, of class ListaAvaliacoes.
     */
    @Test
    public void testNovaAvaliacao() {
        System.out.println("novaAvaliacao");
        ListaAvaliacoes instance = new ListaAvaliacoes();
        Avaliacao expResult = new Avaliacao();
        Avaliacao result = instance.novaAvaliacao();
        assertEquals(expResult, result);
       
    }
    
}
