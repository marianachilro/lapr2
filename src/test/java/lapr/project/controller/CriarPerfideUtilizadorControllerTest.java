/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.CentroExposicoes;
import lapr.project.model.RegistoUtilizadores;
import lapr.project.model.Utilizador;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author catarinarib
 */
public class CriarPerfideUtilizadorControllerTest {

    /**
     * Test of getRegistoUtilizadores method, of class
     * CriarPerfideUtilizadorController.
     */
    @Test
    public void testGetRegistoUtilizadores() {
        System.out.println("getRegistoUtilizadores");
        CentroExposicoes ce = new CentroExposicoes();
        CriarPerfideUtilizadorController instance = new CriarPerfideUtilizadorController(ce);

        RegistoUtilizadores expResult = ce.getRegistoUtilizadores();
        RegistoUtilizadores result = instance.getRegistoUtilizadores();
        assertEquals(expResult, result);

    }

    /**
     * Test of novoUtilizador method, of class CriarPerfideUtilizadorController.
     */
    @Test
    public void testNovoUtilizador() {
        System.out.println("novoUtilizador");
        CentroExposicoes ce = new CentroExposicoes();
        CriarPerfideUtilizadorController instance = new CriarPerfideUtilizadorController(ce);

        Utilizador expResult = new Utilizador();
        Utilizador result = instance.novoUtilizador();
        assertEquals(expResult, result);

    }

    /**
     * Test of setDados method, of class CriarPerfideUtilizadorController.
     */
    @Test
    public void testSetDados() {
        System.out.println("setDados");
        int shift = 0;
        String nome = "a";
        String username = "a";
        String email = "a@centro.pt";
        String password = "aA;1";
        String keyword = "aaaa";

        CentroExposicoes ce = new CentroExposicoes();
        CriarPerfideUtilizadorController instance = new CriarPerfideUtilizadorController(ce);
        instance.novoUtilizador();
        instance.setDados(shift, nome, username, email, password, keyword);

    }

    /**
     * Test of RegistaUtilizador method, of class
     * CriarPerfideUtilizadorController.
     */
    @Test
    public void testRegistaUtilizador() {
        System.out.println("RegistaUtilizador");
        int shift = 0;
        String nome = "a";
        String username = "a";
        String email = "a@centro.pt";
        String password = "aA;1";
        String keyword = "aaaa";

        CentroExposicoes ce = new CentroExposicoes();
        CriarPerfideUtilizadorController instance = new CriarPerfideUtilizadorController(ce);
        instance.novoUtilizador();
        instance.setDados(shift, nome, username, email, password, keyword);

        boolean expResult = true;
        boolean result = instance.RegistaUtilizador();
        assertEquals(expResult, result);

    }

}
