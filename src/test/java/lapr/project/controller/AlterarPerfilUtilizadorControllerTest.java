/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.CentroExposicoes;
import lapr.project.model.Utilizador;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marianachilro
 */
public class AlterarPerfilUtilizadorControllerTest {
    
    public AlterarPerfilUtilizadorControllerTest() {
    }

    /**
     * Test of getUtilizador method, of class AlterarPerfilUtilizadorController.
     */
    @Test
    public void testGetUtilizador() {
        System.out.println("getUtilizador");
        CentroExposicoes centro = new CentroExposicoes();
        Utilizador u = new Utilizador(2, "joao", "jo", "jo@centro.pt", "aB;1", "dpddd");
        centro.getRegistoUtilizadores().addUtilizador(u);
        AlterarPerfilUtilizadorController instance = new AlterarPerfilUtilizadorController(centro, u.getUsername());
        Utilizador expResult = u;
        Utilizador result = instance.getUtilizador();
        assertEquals(expResult, result);
    }


    /**
     * Test of criarClone method, of class AlterarPerfilUtilizadorController.
     */
    @Test
    public void testCriarClone() {
        System.out.println("criarClone");
        CentroExposicoes centro = new CentroExposicoes();
        Utilizador u = new Utilizador(2, "joao", "jo", "jo@centro.pt", "aB;1", "dpddd");
        centro.getRegistoUtilizadores().addUtilizador(u);
        AlterarPerfilUtilizadorController instance = new AlterarPerfilUtilizadorController(centro, u.getUsername());
        Utilizador expResult = u;
        Utilizador result = instance.criarClone();
        assertEquals(expResult, result);
    }

    /**
     * Test of removerUtilizador method, of class AlterarPerfilUtilizadorController.
     */
    @Test
    public void testRemoverUtilizador() {
        System.out.println("removerUtilizador");
        CentroExposicoes centro = new CentroExposicoes();
        Utilizador u = new Utilizador(2, "joao", "jo", "jo@centro.pt", "aB;1", "dpddd");
        centro.getRegistoUtilizadores().addUtilizador(u);
        centro.getRegistoUtilizadores().addUtilizador(u);
        AlterarPerfilUtilizadorController instance = new AlterarPerfilUtilizadorController(centro, u.getUsername());
        instance.removerUtilizador(u);
    }

    

    /**
     * Test of setNovaPassword method, of class AlterarPerfilUtilizadorController.
     */
    @Test
    public void testSetNovaPassword() {
        System.out.println("setNovaPassword");
        String novaPassword = "aB;2";
        CentroExposicoes centro = new CentroExposicoes();
        Utilizador u = new Utilizador(2, "joao", "jo", "jo@centro.pt", "aB;1", "dpddd");
        centro.getRegistoUtilizadores().addUtilizador(u);
        AlterarPerfilUtilizadorController instance = new AlterarPerfilUtilizadorController(centro, u.getUsername());
        instance.criarClone();
        instance.setNovaPassword(novaPassword);
    }

    
}
