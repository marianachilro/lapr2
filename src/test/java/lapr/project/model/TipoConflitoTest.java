/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author miniondevil
 */
public class TipoConflitoTest {
    
   

    /**
     * Testa o método getNome e setNome.
     */
    @Test
    public void testSetNomeAndGetNome() {
        
        String nome = "teste";
        TipoConflito instance = new TipoConflito();
        instance.setNome(nome);
        String expResult = "teste";
        String result = instance.getNome();
        assertEquals(expResult, result);
        
       
    }

    /**
     * Testa o método setDados e getDados.
     */
    @Test
    public void testSetDadosAndGetDados() {
        String dados = "teste";
        TipoConflito instance = new TipoConflito();
        instance.setDados(dados);
        String expResult = "teste";
        String result = instance.getDados();
        assertEquals(expResult, result);
    }

    

    /**
     * Testa se o método retorna false caso os atributos da instancia estejam vazios.
     */
    @Test
    public void testValida() {
       
        TipoConflito instance = new TipoConflito();
        boolean expResult = false;
        boolean result = instance.valida();
        assertEquals(expResult, result);
       
    }
    /**
     * testa se o método retorna true caso os atributos da instância não estejam vazios.
     */
    @Test
    public void testValidaComAtributos(){
        TipoConflito instance = new TipoConflito();
        instance.setDados("teste");
        instance.setNome("teste");
        boolean expResult = true;
        boolean result = instance.valida();
        assertEquals(expResult, result);
    }
    /**
     * testa se o método retorna false caso apenas o atributo nome esteja vazio.
     */
    @Test
    public void testValidaComNomeVazio(){
        TipoConflito instance = new TipoConflito();
        instance.setDados("teste");
       
        boolean expResult = false;
        boolean result = instance.valida();
        assertEquals(expResult, result);
    }
    /**
     * testa se o método retorna false caso apenas o atributo dados esteja vazio.
     */
    @Test
    public void testValidaComDadosVazio(){
        TipoConflito instance = new TipoConflito();
        instance.setNome("teste");
       
        boolean expResult = false;
        boolean result = instance.valida();
        assertEquals(expResult, result);
    }

    /**
     * Testa o método equals caso os atributos sejam iguais.
     */
    @Test
    public void testEquals() {
       
        Object t = new TipoConflito();
        TipoConflito instance = new TipoConflito();
        boolean expResult = true;
        boolean result = instance.equals(t);
        assertEquals(expResult, result);
        
    }
    /**
     * Testa o método equals caso os atributos sejam diferentes.
     */
    @Test
    public void testEqualsAtributosDiferentes() {
       
        Object t = new TipoConflito();
        TipoConflito instance = new TipoConflito();
        instance.setNome("teste");
        boolean expResult = false;
        boolean result = instance.equals(t);
        assertEquals(expResult, result);
        
    }
      /**
     * Testa o método equals usando a mesma referencia.
     */
    @Test
    public void testEqualsMesmaRef() {
       
        
        TipoConflito instance = new TipoConflito();
        Object t = instance;
        instance.setNome("teste");
        boolean expResult = true;
        boolean result = instance.equals(t);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of hashCode method, of class TipoConflito.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        TipoConflito instance = new TipoConflito();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }
    
}
