/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Candidatura;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CandidaturaRemovidaEstado;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.Organizador;
import lapr.project.model.Utilizador;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author miniondevil
 */
public class ListarCandRemovidasControllerTest {
    
    public ListarCandRemovidasControllerTest() {
    }

    /**
     * Test of getListaExpoOrg method, of class ListarCandRemovidasController.
     */
    @Test
    public void testGetListaExpoOrg() {
        System.out.println("getListaExpoOrg");
        CentroExposicoes ce = new CentroExposicoes();
        Exposicao e = new Exposicao();
        Utilizador u = new Utilizador(2, "joao", "devil", "123@asd.com", "aA123;", "peixes");
        Organizador o = new Organizador(u);
        ce.getRegistoUtilizadores().addUtilizador(u);
        e.getListaOrganizadores().add(o);
        ce.getRegistoExposicoes().addExposicao(e);
        ListarCandRemovidasController instance = new ListarCandRemovidasController(ce, "devil");
        List<Exposicao> expResult = new ArrayList<>();
        expResult.add(e);
        List<Exposicao> result = instance.getListaExpoOrg();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getListaCandRemovidas method, of class ListarCandRemovidasController.
     */
    @Test
    public void testGetListaCandRemovidas() {
        System.out.println("getListaCandRemovidas");
        CentroExposicoes ce = new CentroExposicoes();
        Exposicao e = new Exposicao();
        Utilizador u = new Utilizador(2, "joao", "devil", "123@asd.com", "aA123;", "peixes");
        Organizador o = new Organizador(u);
        ce.getRegistoUtilizadores().addUtilizador(u);
        e.getListaOrganizadores().add(o);
        CandidaturaExposicao c = new CandidaturaExposicao("311@asd.xom", "dsa", "asd", 123456780, 20, 30);
        c.setEstado(new CandidaturaRemovidaEstado(c));
        e.getListaCandidaturas().addCandidatura(c);
        ce.getRegistoExposicoes().addExposicao(e);
        ListarCandRemovidasController instance = new ListarCandRemovidasController(ce, "devil");
        List<Candidatura> expResult = new ArrayList<>();
        expResult.add(c);
        instance.getListaExpoOrg();
        List<Candidatura> result = instance.getListaCandRemovidas(e);
        assertEquals(expResult, result);
        
    }
    
}
