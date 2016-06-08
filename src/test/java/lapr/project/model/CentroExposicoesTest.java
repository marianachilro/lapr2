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

    /**
     * Test of getRegistoExposicoes method, of class CentroExposicoes.
     */
    @Test
    public void testGetRegistoExposicoesAndSetRegistoExposicoes() {
        System.out.println("TesteRegistoExposicoes");
        CentroExposicoes instance = new CentroExposicoes();
        RegistoExposicoes re = new RegistoExposicoes();
        instance.setRegistoExposicoes(re);
        RegistoExposicoes expResult = re;
        RegistoExposicoes result = instance.getRegistoExposicoes();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRegistoUtilizadores method, of class CentroExposicoes.
     */
    @Test
    public void testGetRegistoUtilizadoresAndSetRegistoUtilizadores() {
        System.out.println("TesteRegistoUtilizadores");
        CentroExposicoes instance = new CentroExposicoes();
        RegistoUtilizadores ru = new RegistoUtilizadores();
        instance.setRegistoUtilizadores(ru);
        RegistoUtilizadores expResult = ru;
        RegistoUtilizadores result = instance.getRegistoUtilizadores();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRegistoStands method, of class CentroExposicoes.
     */
    @Test
    public void testGetRegistoStandsAndSetRegistoStands() {
        System.out.println("TesteRegistoStands");
        CentroExposicoes instance = new CentroExposicoes();
        RegistoStands rs = new RegistoStands();
        instance.setRegistoStands(rs);
        RegistoStands expResult = rs;
        RegistoStands result = instance.getRegistoStands();
        assertEquals(expResult, result);

    }

    /**
     * Test of getRegistoLocais method, of class CentroExposicoes.
     */
    @Test
    public void testGetRegistoLocaisAndSetRegistoLocais() {
        System.out.println("TesteRegistoLocais");
        CentroExposicoes instance = new CentroExposicoes();
        RegistoLocais rl = new RegistoLocais();
        instance.setRegistoLocais(rl);
        RegistoLocais expResult = rl;
        RegistoLocais result = instance.getRegistoLocais();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRegistoRecursos method, of class CentroExposicoes.
     */
    @Test
    public void testGetRegistoRecursosAndSetRegistoRecursos() {
        System.out.println("TesteRegistoRecursos");
        CentroExposicoes instance = new CentroExposicoes();
        RegistoRecursos rr = new RegistoRecursos();
        instance.setRegistoRecursos(rr);
        RegistoRecursos expResult = rr;
        RegistoRecursos result = instance.getRegistoRecursos();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRegistoMecanismos method, of class CentroExposicoes.
     */
    @Test
    public void testGetRegistoMecanismosAndSetRegistoMecanismos() {
        System.out.println("TesteRegistoMecanismos");
        CentroExposicoes instance = new CentroExposicoes();
        RegistoMecanismos rm = new RegistoMecanismos();
        instance.setRegistoMecanismos(rm);
        RegistoMecanismos expResult = rm;
        RegistoMecanismos result = instance.getRegistoMecanismos();
        assertEquals(expResult, result);
    }

}
