/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaOrganizadores;
import lapr.project.model.Local;
import lapr.project.model.RegistoLocais;
import lapr.project.model.RegistoUtilizadores;
import lapr.project.model.Utilizador;
import lapr.project.utils.Data;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author catarinarib
 */
public class CriarExposicaoControllerTest {

    /**
     * Test of newExposicao method, of class CriarExposicaoController.
     */
    @Test
    public void testNewExposicao() {
        System.out.println("newExposicao");
        CentroExposicoes ce = new CentroExposicoes();
        CriarExposicaoController instance = new CriarExposicaoController(ce);
        instance.newExposicao();

    }

    /**
     * Test of setDadosExposicao method, of class CriarExposicaoController.
     */
    @Test
    public void testSetDadosExposicao() {
        System.out.println("setDadosExposicao");
        CentroExposicoes ce = new CentroExposicoes();
        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        CriarExposicaoController instance = new CriarExposicaoController(ce);

        String sTitulo = "a";
        String sDescritivo = "a";
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);

        Data oDtInicio = dati;
        Data oDtFim = datf;
        Local local = l;
        Data oDtIniSubCand = dati;
        Data oDtFimSubCand = dati;
        Data oDtFimActConf = dati;
        Data oDtFimAvCand = dati;

        instance.newExposicao();
        instance.setDadosExposicao(sTitulo, sDescritivo, oDtInicio, oDtFim, local, oDtIniSubCand, oDtFimSubCand, oDtFimActConf, oDtFimAvCand);

    }

    /**
     * Test of getRegistoLocais method, of class CriarExposicaoController.
     */
    @Test
    public void testGetRegistoLocais() {
        System.out.println("getRegistoLocais");
        CentroExposicoes ce = new CentroExposicoes();
        CriarExposicaoController instance = new CriarExposicaoController(ce);
        RegistoLocais expResult = ce.getRegistoLocais();
        RegistoLocais result = instance.getRegistoLocais();
        assertEquals(expResult, result);

    }

    /**
     * Test of setLocal method, of class CriarExposicaoController.
     */
    @Test
    public void testSetLocal() {

        System.out.println("setLocal");
        CentroExposicoes ce = new CentroExposicoes();
        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        CriarExposicaoController instance = new CriarExposicaoController(ce);
        instance.newExposicao();
        instance.setLocal(l);

    }

    /**
     * Test of getRegistoUtilizadores method, of class CriarExposicaoController.
     */
    @Test
    public void testGetRegistoUtilizadores() {
        System.out.println("getRegistoUtilizadores");

        CentroExposicoes ce = new CentroExposicoes();
        CriarExposicaoController instance = new CriarExposicaoController(ce);

        RegistoUtilizadores expResult = ce.getRegistoUtilizadores();
        RegistoUtilizadores result = instance.getRegistoUtilizadores();
        assertEquals(expResult, result);

    }

    /**
     * Test of getListaOrganizadores method, of class CriarExposicaoController.
     */
    @Test
    public void testGetListaOrganizadores() {
        System.out.println("getListaOrganizadores");

        CentroExposicoes ce = new CentroExposicoes();
        CriarExposicaoController instance = new CriarExposicaoController(ce);
        Exposicao e = instance.newExposicao();

        ListaOrganizadores expResult = e.getListaOrganizadores();
        ListaOrganizadores result = instance.getListaOrganizadores();
        assertEquals(expResult, result);

    }

    /**
     * Test of addOrganizador method, of class CriarExposicaoController.
     */
    @Test
    public void testAddOrganizador() {
        System.out.println("addOrganizador");

        CentroExposicoes ce = new CentroExposicoes();
        CriarExposicaoController instance = new CriarExposicaoController(ce);
        Utilizador u = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u);
        instance.newExposicao();
        boolean expResult = true;
        boolean result = instance.addOrganizador(u);
        assertEquals(expResult, result);

    }

    /**
     * Test of registaExposicao method, of class CriarExposicaoController.
     */
    @Test
    public void testRegistaExposicao() {
        System.out.println("registaExposicao");
        CentroExposicoes ce = new CentroExposicoes();
        CriarExposicaoController instance = new CriarExposicaoController(ce);
        instance.newExposicao();
        boolean expResult = true;
        boolean result = instance.registaExposicao();
        assertEquals(expResult, result);

    }

}
