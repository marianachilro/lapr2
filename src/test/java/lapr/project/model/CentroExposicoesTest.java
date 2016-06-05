/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author miniondevil
 */
public class CentroExposicoesTest {

    
    

    /**
     * Testa os métodos get e set registoTipoConflitos.
     */
    @Test
    public void testGetRegistoTipoConflitosAndSetRegistoTipoConflitos() {
        CentroExposicoes instance = new CentroExposicoes();
        RegistoTipoConflitos rc = new RegistoTipoConflitos();
        instance.setRegistoTipoConflitos(rc);
        RegistoTipoConflitos expResult = rc;
        RegistoTipoConflitos result = instance.getRegistoTipoConflitos();
        assertEquals(expResult, result);
    
    }

    
}
