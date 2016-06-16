/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;
import lapr.project.utils.Data;
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
public class DemonstracaoTest {

    /**
     * Test of getCodigo method, of class Demonstracao.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Demonstracao instance = new Demonstracao();
        String expResult = "codigo";
        instance.setCodigo(expResult);
        String result = instance.getCodigo();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDescricao method, of class Demonstracao.
     */
    @Test
    public void testGetDescricao() {
        System.out.println("getDescricao");
        Demonstracao instance = new Demonstracao();
        String expResult = "desc";
        instance.setDescricao(expResult);
        String result = instance.getDescricao();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRealizacao method, of class Demonstracao.
     */
    @Test
    public void testGetRealizacao() {
        System.out.println("getRealizacao");
        Demonstracao instance = new Demonstracao();
        boolean expResult = false;
        boolean result = instance.getRealizacao();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEstado method, of class Demonstracao.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Demonstracao instance = new Demonstracao();
        DemonstracaoEstado expResult = new DemonstracaoInicialEstado(instance);
        instance.setEstado(expResult);
        DemonstracaoEstado result = instance.getEstado();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNumeroInteressados method, of class Demonstracao.
     */
    @Test
    public void testGetNumeroInteressados() {
        System.out.println("getNumeroInteressados");
        Demonstracao instance = new Demonstracao();
        int expResult = 0;
        instance.setNumeroInteressados(expResult);
        int result = instance.getNumeroInteressados();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDataInicioSubmissaoCandidaturas method, of class Demonstracao.
     */
    @Test
    public void testGetDataInicioSubmissaoCandidaturas() {
        System.out.println("getDataInicioSubmissaoCandidaturas");
        Demonstracao instance = new Demonstracao();
        Data expResult = new Data();
        instance.setDataInicioSubmissaoCandidaturas(expResult);
        Data result = instance.getDataInicioSubmissaoCandidaturas();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDataFimSubmissaoCandidaturas method, of class Demonstracao.
     */
    @Test
    public void testGetDataFimSubmissaoCandidaturas() {
        System.out.println("getDataFimSubmissaoCandidaturas");
        Demonstracao instance = new Demonstracao();
        Data expResult = new Data();
        instance.setDataFimSubmissaoCandidaturas(expResult);
        Data result = instance.getDataFimSubmissaoCandidaturas();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDataFimAtualizacaoConflitos method, of class Demonstracao.
     */
    @Test
    public void testGetDataFimAtualizacaoConflitos() {
        System.out.println("getDataFimAtualizacaoConflitos");
        Demonstracao instance = new Demonstracao();
        Data expResult = new Data();
        instance.setDataFimAtualizacaoConflitos(expResult);
        Data result = instance.getDataFimAtualizacaoConflitos();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaConflitos method, of class Demonstracao.
     */
    @Test
    public void testGetListaConflitos() {
        System.out.println("getListaConflitos");
        Demonstracao instance = new Demonstracao();
        ListaConflitos expResult = new ListaConflitos();
        instance.setListaConflitos(expResult);
        ListaConflitos result = instance.getListaConflitos();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaCandidaturas method, of class Demonstracao.
     */
    @Test
    public void testGetListaCandidaturas() {
        System.out.println("getListaCandidaturas");
        Demonstracao instance = new Demonstracao();
        ListaCandidaturasDemonstracoes expResult = new ListaCandidaturasDemonstracoes();
        instance.setListaCandidaturas(expResult);
        ListaCandidaturasDemonstracoes result = instance.getListaCandidaturas();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaAtribuicoes method, of class Demonstracao.
     */
    @Test
    public void testGetListaAtribuicoes() {
        System.out.println("getListaAtribuicoes");
        Demonstracao instance = new Demonstracao();
        ListaAtribuicoes expResult = new ListaAtribuicoes();
        instance.setListaAtribuicoes(expResult);
        ListaAtribuicoes result = instance.getListaAtribuicoes();
        assertEquals(expResult, result);
    }

    /**
     * Test of valida method, of class Demonstracao.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        Demonstracao instance = new Demonstracao();
        boolean expResult = true;
        boolean result = instance.valida();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaRecursos method, of class Demonstracao.
     */
    @Test
    public void testGetListaRecursos() {
        System.out.println("getListaRecursos");
        Demonstracao instance = new Demonstracao();
        ListaRecursos expResult = new ListaRecursos();
        instance.setListaRecursos(expResult);
        ListaRecursos result = instance.getListaRecursos();
        assertEquals(expResult, result);
    }

    /**
     * Test of compareTo method, of class Demonstracao.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Demonstracao d = new Demonstracao();
        Demonstracao instance = new Demonstracao();
        int expResult = 0;
        int result = instance.compareTo(d);
        assertEquals(expResult, result);
    }
    
}
