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
public class RegistoTipoConflitosTest {
   

    /**
     * testa se o método getListaTipoConflitos retorna a lista null se esta estiver null.
     */
    @Test
    public void testGetListaTipoConflitosNull() {
        
        RegistoTipoConflitos instance = new RegistoTipoConflitos();
        
        List<TipoConflito> expResult = new ArrayList<>();
        List<TipoConflito> result = instance.getListaTipoConflitos();
        assertEquals(expResult, result);
    }
    /**
     * testa se o método getListaTipoConflitos retorna a lista desejada.
     */
     @Test
    public void testGetListaTipoConflitos(){
        RegistoTipoConflitos instance = new RegistoTipoConflitos();
        TipoConflito t1 = new TipoConflito();
        TipoConflito t2 = new TipoConflito();
        t2.setNome("teste");
        t2.setDados("teste");
        instance.getListaTipoConflitos().add(t2);
        instance.getListaTipoConflitos().add(t1);
        List<TipoConflito> expResult=new ArrayList<>();
        expResult.add(t2);
        expResult.add(t1);
        List<TipoConflito> result = instance.getListaTipoConflitos();
        assertEquals(expResult, result);
    }
    

    /**
     * Testa se o método newTipoConflito retorna uma nova instância do tipo TipoConflito.
     */
    @Test
    public void testNewTipoConflito() {
        
        RegistoTipoConflitos instance = new RegistoTipoConflitos();
        TipoConflito expResult = new TipoConflito();
        TipoConflito result = instance.newTipoConflito();
        assertEquals(expResult, result);
       
    }

    /**
     * testa se o método valida retorna true se a lista estiver vazia.
     */
    @Test
    public void testValidaTipoComListaVazia() {
      
        TipoConflito t = null;
        RegistoTipoConflitos instance = new RegistoTipoConflitos();
        boolean expResult = true;
        boolean result = instance.validaTipo(t);
        assertEquals(expResult, result);
      
    }
    /**
     * testa se o método valida retorna true se o tipo de conflito não for igual aos guardados na lista.
     */
     @Test
    public void testValidaTipo(){
        TipoConflito t = new TipoConflito();
        TipoConflito t1 = new TipoConflito();
        t1.setNome("teste");
        RegistoTipoConflitos instance = new RegistoTipoConflitos();
        instance.getListaTipoConflitos().add(t);
        boolean expResult = true;
        boolean result = instance.validaTipo(t1);
        assertEquals(expResult, result);
    }
    /**
     *testa se o método retorna false se os tipos tiverem os mesmos atributos.
     */
     @Test
    public void testValidaTipoIguais(){
        TipoConflito t = new TipoConflito();
        TipoConflito t1 = new TipoConflito();
        t1.setNome("teste");
        t.setNome("teste");
        RegistoTipoConflitos instance = new RegistoTipoConflitos();
        instance.getListaTipoConflitos().add(t);
        boolean expResult = false;
        boolean result = instance.validaTipo(t1);
        assertEquals(expResult, result);
        
    }
    /**
     * testa se o método retorna false se a referência já estiver na lista.
     */
     @Test
    public void testValidaTipoMesmaReferencia(){
        TipoConflito t = new TipoConflito();
       
        t.setNome("teste");
        RegistoTipoConflitos instance = new RegistoTipoConflitos();
        instance.getListaTipoConflitos().add(t);
        boolean expResult = false;
        boolean result = instance.validaTipo(t);
        assertEquals(expResult, result);
    }
        
}
