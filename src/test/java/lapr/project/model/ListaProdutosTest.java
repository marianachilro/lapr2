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
public class ListaProdutosTest {

    /**
     * Test of getListaProdutos method, of class ListaProdutos.
     */
    @Test
    public void testGetListaProdutos() {
        System.out.println("getListaProdutos");
        ListaProdutos instance = new ListaProdutos();
        List<Produto> expResult = new ArrayList<>();
        Produto p = new Produto();
        expResult.add(p);
        instance.addProduto(p);
        List<Produto> result = instance.getListaProdutos();
        assertEquals(expResult, result);
    }

    /**
     * Test of setListaProdutos method, of class ListaProdutos.
     */
    @Test
    public void testSetListaProdutos() {
        System.out.println("setListaProdutos");
        List<Produto> listaProdutos = null;
        ListaProdutos instance = new ListaProdutos();
        instance.setListaProdutos(listaProdutos);
    }

    /**
     * Test of novoProduto method, of class ListaProdutos.
     */
    @Test
    public void testNovoProduto() {
        System.out.println("novoProduto");
        ListaProdutos instance = new ListaProdutos();
        Produto expResult = new Produto();
        Produto result = instance.novoProduto();
        assertEquals(expResult, result);
    }

    /**
     * Test of validaProduto method, of class ListaProdutos.
     */
    @Test
    public void testValidaProduto() {
        System.out.println("validaProduto");
        Produto p = new Produto();
        ListaProdutos instance = new ListaProdutos();
        boolean expResult = true;
        instance.addProduto(p);
        boolean result = instance.validaProduto(p);
        assertEquals(expResult, result);
    }

    /**
     * Test of addProduto method, of class ListaProdutos.
     */
    @Test
    public void testAddProduto() {
        System.out.println("addProduto");
        Produto p = new Produto();
        ListaProdutos instance = new ListaProdutos();
        boolean expResult = true;
        boolean result = instance.addProduto(p);
        assertEquals(expResult, result);
    }

    /**
     * Test of registaProduto method, of class ListaProdutos.
     */
    @Test
    public void testRegistaProduto() {
        System.out.println("registaProduto");
        Produto p = new Produto();
        ListaProdutos instance = new ListaProdutos();
        boolean expResult = true;
        boolean result = instance.registaProduto(p);
        assertEquals(expResult, result);
    }
    
}
