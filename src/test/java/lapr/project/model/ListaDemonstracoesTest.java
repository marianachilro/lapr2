/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;
import lapr.project.utils.Data;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rita
 */
public class ListaDemonstracoesTest {

    /**
     * Test of getListaDemonstracao method, of class ListaDemonstracoes.
     */
    @Test
    public void testGetListaDemonstracao() {
        System.out.println("getListaDemonstracao");
        ListaDemonstracoes instance = new ListaDemonstracoes();
        List<Demonstracao> expResult = new ArrayList<>();
        Demonstracao d = new Demonstracao();
        expResult.add(d);
        instance.addDemonstracao(d);
        List<Demonstracao> result = instance.getListaDemonstracao();
        assertEquals(expResult, result);
    }



    /**
     * Test of novaDemonstracao method, of class ListaDemonstracoes.
     */
    @Test
    public void testNovaDemonstracao() {
        System.out.println("novaDemonstracao");
        ListaDemonstracoes instance = new ListaDemonstracoes();
        Demonstracao expResult = new Demonstracao();
        Demonstracao result = instance.novaDemonstracao();
        assertEquals(expResult, result);
    }

    /**
     * Test of validaDemonstracao method, of class ListaDemonstracoes.
     */
    @Test
    public void testValidaDemonstracao() {
        System.out.println("validaDemonstracao");
        Demonstracao d = new Demonstracao();
        ListaDemonstracoes instance = new ListaDemonstracoes();
        boolean expResult = false;
        boolean result = instance.validaDemonstracao(d);
        assertEquals(expResult, result);
    }

    /**
     * Test of addDemonstracao method, of class ListaDemonstracoes.
     */
    @Test
    public void testAddDemonstracao() {
        System.out.println("addDemonstracao");
        Demonstracao d = new Demonstracao();
        ListaDemonstracoes instance = new ListaDemonstracoes();
        boolean expResult = true;
        boolean result = instance.addDemonstracao(d);
        assertEquals(expResult, result);
    }

    /**
     * Test of registaDemonstracao method, of class ListaDemonstracoes.
     */
    @Test
    public void testRegistaDemonstracao() {
        System.out.println("registaDemonstracao");
        Demonstracao d = new Demonstracao();
        ListaDemonstracoes instance = new ListaDemonstracoes();
        boolean expResult = true;
        boolean result = instance.registaDemonstracao(d);
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaDemonstracoesDisponiveis method, of class ListaDemonstracoes.
     */
    @Test
    public void testGetListaDemonstracoesDisponiveis() {
        System.out.println("getListaDemonstracoesDisponiveis");
        ListaDemonstracoes instance = new ListaDemonstracoes();
        List<Demonstracao> expResult = new ArrayList<>();
        Demonstracao d = new Demonstracao();
        d.setRealizacao(true);
        expResult.add(d);
        instance.addDemonstracao(d);
        List<Demonstracao> result = instance.getListaDemonstracoesDisponiveis();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaDemonstracoesNaoConfirmadas method, of class ListaDemonstracoes.
     */
    @Test
    public void testGetListaDemonstracoesNaoConfirmadas() {
        System.out.println("getListaDemonstracoesNaoConfirmadas");
        ListaDemonstracoes instance = new ListaDemonstracoes();
        List<Demonstracao> expResult = new ArrayList<>();
        Demonstracao d = new Demonstracao();
        expResult.add(d);
        instance.addDemonstracao(d);
        List<Demonstracao> result = instance.getListaDemonstracoesNaoConfirmadas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDataInicioSubmissaoCanididaturasDemos method, of class ListaDemonstracoes.
     */
    @Test
    public void testSetDataInicioSubmissaoCanididaturasDemos() {
        System.out.println("setDataInicioSubmissaoCanididaturasDemos");
        Data data = null;
        ListaDemonstracoes instance = new ListaDemonstracoes();
        instance.setDataInicioSubmissaoCanididaturasDemos(data);
    }

    /**
     * Test of validaCodigo method, of class ListaDemonstracoes.
     */
    @Test
    public void testValidaCodigo() {
        System.out.println("validaCodigo");
        String codigo = "";
        ListaDemonstracoes instance = new ListaDemonstracoes();
        boolean expResult = false;
        boolean result = instance.validaCodigo(codigo);
        assertEquals(expResult, result);
    }
    
}
