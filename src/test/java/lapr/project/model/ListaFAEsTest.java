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
public class ListaFAEsTest {
    
    
    /**
     * Testa o método set e get.
     */
    @Test
    public void testGetAndSetListaFAEs() {
     
        ListaFAEs instance = new ListaFAEs();
        List<FAE> expResult = new ArrayList<>();
        instance.setListaFAEs(expResult);
        List<FAE> result = instance.getListaFAEs();
        assertEquals(expResult, result);
    
    }

}
