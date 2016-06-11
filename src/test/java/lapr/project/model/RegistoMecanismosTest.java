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
public class RegistoMecanismosTest {
    

    /**
     * Testa o método set e get da lista de mecanismos.
     */
    @Test
    public void testGetAndSetListaMecanismos() {
       
        RegistoMecanismos instance = new RegistoMecanismos();
        
        List<MecanismoAtribuicao> expResult = new ArrayList<>();
        instance.setListaMecanismos(expResult);
        List<MecanismoAtribuicao> result = instance.getListaMecanismos();
        assertEquals(expResult, result);
    
    }
    
}
