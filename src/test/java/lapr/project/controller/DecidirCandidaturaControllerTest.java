/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Avaliacao;
import lapr.project.model.Candidatura;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.Local;
import lapr.project.model.Organizador;
import lapr.project.model.Utilizador;
import lapr.project.utils.Data;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author catarinarib
 */
public class DecidirCandidaturaControllerTest {

    /**
     * Test of getListaExposicoesOrganizador method, of class
     * DecidirCandidaturaController.
     */
    @Test
    public void testGetListaExposicoesOrganizador() {
        System.out.println("getListaExposicoesOrganizador");

        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        Organizador org = new Organizador(u);

        DecidirCandidaturaController instance = new DecidirCandidaturaController(ce, org);
        List<Exposicao> expResult = new ArrayList<>();
        List<Exposicao> result = instance.getListaExposicoesOrganizador();
        assertEquals(expResult, result);

    }

    /**
     * Test of selectExposicao method, of class DecidirCandidaturaController.
     */
    @Test
    public void testSelectExposicao() {
        System.out.println("selectExposicao");
        CentroExposicoes ce = new CentroExposicoes();

        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao e = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);

        Utilizador u = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        Organizador org = new Organizador(u);

        DecidirCandidaturaController instance = new DecidirCandidaturaController(ce, org);
        instance.selectExposicao(e);

    }

    /**
     * Test of getDecisivel method, of class DecidirCandidaturaController.
     */
    @Test
    public void testGetDecisivel() {
        System.out.println("getDecisivel");
        CentroExposicoes ce = new CentroExposicoes();

        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao e = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);

        Utilizador u = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        Organizador org = new Organizador(u);

        DecidirCandidaturaController instance = new DecidirCandidaturaController(ce, org);
        instance.selectExposicao(e);

        List<Candidatura> expResult = new ArrayList<>();
        List<Candidatura> result = instance.getDecisivel();
        assertEquals(expResult, result);

    }

    /**
     * Test of selectCandidatura method, of class DecidirCandidaturaController.
     */
    @Test
    public void testSelectCandidatura() {
        System.out.println("selectCandidatura");

        CandidaturaExposicao c = new CandidaturaExposicao("rep@centro.pt", "nome empresa", "morada", 919999999, 23, 5);

        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        Organizador org = new Organizador(u);

        DecidirCandidaturaController instance = new DecidirCandidaturaController(ce, org);
        instance.selectCandidatura(c);

    }

    /**
     * Test of getListaAvaliacoesDaCandidatura method, of class
     * DecidirCandidaturaController.
     */
    @Test
    public void testGetListaAvaliacoesDaCandidatura() {
        System.out.println("getListaAvaliacoesDaCandidatura");

        CandidaturaExposicao c = new CandidaturaExposicao("rep@centro.pt", "nome empresa", "morada", 919999999, 23, 5);

        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        Organizador org = new Organizador(u);

        DecidirCandidaturaController instance = new DecidirCandidaturaController(ce, org);
        instance.selectCandidatura(c);
        List<Avaliacao> expResult = new ArrayList<>();
        List<Avaliacao> result = instance.getListaAvaliacoesDaCandidatura();
        assertEquals(expResult, result);

    }

    /**
     * Test of setDecisao method, of class DecidirCandidaturaController.
     */
    @Test
    public void testSetDecisao() {
        System.out.println("setDecisao");

        CentroExposicoes ce = new CentroExposicoes();
        boolean decisao = true;
        CandidaturaExposicao c = new CandidaturaExposicao("rep@centro.pt", "nome empresa", "morada", 919999999, 23, 5);

        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao e = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);

        Utilizador u = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        Organizador org = new Organizador(u);

        DecidirCandidaturaController instance = new DecidirCandidaturaController(ce, org);
        instance.selectExposicao(e);
        instance.selectCandidatura(c);

        instance.setDecisao(decisao);

    }

}
