/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.CandidaturaDemonstracao;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaCandidaturasDemonstracoes;
import lapr.project.model.Local;
import lapr.project.model.Utilizador;
import lapr.project.utils.Data;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author catarinarib
 */
public class RegistarCandidaturaDemonstracaoControllerTest {

    /**
     * Test of getListaExposicoes method, of class
     * RegistarCandidaturaDemonstracaoController.
     */
    @Test
    public void testGetListaExposicoes() {
        System.out.println("getListaExposicoes");

        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u1 = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u1);
        RegistarCandidaturaDemonstracaoController instance = new RegistarCandidaturaDemonstracaoController(u1.getEmail(), ce);
        List<Exposicao> expResult = ce.getRegistoExposicoes().getListaExposicoes();
        List<Exposicao> result = instance.getListaExposicoes();
        assertEquals(expResult, result);

    }

    /**
     * Test of selectExposicoes method, of class
     * RegistarCandidaturaDemonstracaoController.
     */
    @Test
    public void testSelectExposicoes() {
        System.out.println("selectExposicoes");

        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u1 = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u1);

        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao exp = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);

        RegistarCandidaturaDemonstracaoController instance = new RegistarCandidaturaDemonstracaoController(u1.getEmail(), ce);

        instance.selectExposicoes(exp);

    }

    /**
     * Test of getListaCandidaturasRep method, of class
     * RegistarCandidaturaDemonstracaoController.
     */
    @Test
    public void testGetListaCandidaturasRep() {
        System.out.println("getListaCandidaturasRep");
        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u1 = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u1);

        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao exp = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);

        RegistarCandidaturaDemonstracaoController instance = new RegistarCandidaturaDemonstracaoController(u1.getEmail(), ce);
        instance.getListaExposicoes();
        instance.selectExposicoes(exp);

        List<CandidaturaExposicao> expResult = exp.getListaCandidaturas().getListaCandidaturasRep(u1.getEmail());
        List<CandidaturaExposicao> result = instance.getListaCandidaturasRep();
        assertEquals(expResult, result);

    }
//

    /**
     * Test of selectCandidatura method, of class
     * RegistarCandidaturaDemonstracaoController.
     */
    @Test
    public void testSelectCandidatura() {
        System.out.println("selectCandidatura");
        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u1 = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u1);

        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao exp = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);

        RegistarCandidaturaDemonstracaoController instance = new RegistarCandidaturaDemonstracaoController(u1.getEmail(), ce);
        instance.getListaExposicoes();
        instance.selectExposicoes(exp);
        CandidaturaExposicao cex = new CandidaturaExposicao("rep@centro.pt", "nome empresa", "morada", 919999999, 23, 5);
        exp.getListaCandidaturas().getListCandidaturas().add(cex);
        instance.selectCandidatura(cex);

    }
//

    /**
     * Test of getListDemonstracao method, of class
     * RegistarCandidaturaDemonstracaoController.
     */
    @Test
    public void testGetListDemonstracao() {
        System.out.println("getListDemonstracao");
        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u1 = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u1);

        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao exp = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);

        RegistarCandidaturaDemonstracaoController instance = new RegistarCandidaturaDemonstracaoController(u1.getEmail(), ce);
        instance.getListaExposicoes();
        instance.selectExposicoes(exp);
        CandidaturaExposicao cex = new CandidaturaExposicao("rep@centro.pt", "nome empresa", "morada", 919999999, 23, 5);
        exp.getListaCandidaturas().getListCandidaturas().add(cex);
        instance.selectCandidatura(cex);
        List<Demonstracao> expResult = exp.getListaDemonstracoes().getListaDemonstracao();
        List<Demonstracao> result = instance.getListDemonstracao();
        assertEquals(expResult, result);

    }
//

    /**
     * Test of selectDemonstracao method, of class
     * RegistarCandidaturaDemonstracaoController.
     */
    @Test
    public void testSelectDemonstracao() {
        System.out.println("selectDemonstracao");

        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u1 = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u1);

        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao exp = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);

        RegistarCandidaturaDemonstracaoController instance = new RegistarCandidaturaDemonstracaoController(u1.getEmail(), ce);
        instance.getListaExposicoes();
        instance.selectExposicoes(exp);
        CandidaturaExposicao cex = new CandidaturaExposicao("rep@centro.pt", "nome empresa", "morada", 919999999, 23, 5);
        exp.getListaCandidaturas().getListCandidaturas().add(cex);
        instance.selectCandidatura(cex);

        Demonstracao d = new Demonstracao();
        instance.selectDemonstracao(d);

    }
//

    /**
     * Test of novaCandidaturaDemonstracao method, of class
     * RegistarCandidaturaDemonstracaoController.
     */
    @Test
    public void testNovaCandidaturaDemonstracao() {
        System.out.println("novaCandidaturaDemonstracao");
        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u1 = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u1);

        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao exp = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);

        RegistarCandidaturaDemonstracaoController instance = new RegistarCandidaturaDemonstracaoController(u1.getEmail(), ce);
        instance.getListaExposicoes();
        instance.selectExposicoes(exp);
        CandidaturaExposicao cex = new CandidaturaExposicao("rep@centro.pt", "nome empresa", "morada", 919999999, 23, 5);
        exp.getListaCandidaturas().getListCandidaturas().add(cex);
        instance.getListaCandidaturasRep();
        instance.selectCandidatura(cex);

        Demonstracao d = new Demonstracao();
        instance.selectDemonstracao(d);
        ListaCandidaturasDemonstracoes rcd = d.getListaCandidaturas();
        CandidaturaDemonstracao cd = rcd.novaCandidatura();
        cd.setEmailRep(u1.getEmail());

        CandidaturaDemonstracao expResult = cd;
        CandidaturaDemonstracao result = instance.novaCandidaturaDemonstracao(d);
        assertEquals(expResult, result);

    }
//

    /**
     * Test of registarCandidatura method, of class
     * RegistarCandidaturaDemonstracaoController.
     */
    @Test
    public void testRegistarCandidatura() {
        System.out.println("registarCandidatura");
        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u1 = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u1);

        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao exp = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);

        RegistarCandidaturaDemonstracaoController instance = new RegistarCandidaturaDemonstracaoController(u1.getEmail(), ce);
        instance.getListaExposicoes();
        instance.selectExposicoes(exp);
        CandidaturaExposicao cex = new CandidaturaExposicao("rep@centro.pt", "nome empresa", "morada", 919999999, 23, 5);
        exp.getListaCandidaturas().getListCandidaturas().add(cex);
        instance.getListaCandidaturasRep();
        instance.selectCandidatura(cex);

        Demonstracao d = new Demonstracao();
        instance.selectDemonstracao(d);
        ListaCandidaturasDemonstracoes rcd = d.getListaCandidaturas();
        CandidaturaDemonstracao cd = rcd.novaCandidatura();
        cd.setEmailRep(u1.getEmail());
        instance.novaCandidaturaDemonstracao(d);

        boolean expResult = true;
        boolean result = instance.registarCandidatura();
        assertEquals(expResult, result);

    }

    /**
     * Test of transitaEstado method, of class
     * RegistarCandidaturaDemonstracaoController.
     */
    @Test
    public void testTransitaEstado() {
        System.out.println("transitaEstado");
        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u1 = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u1);

        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao exp = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);

        RegistarCandidaturaDemonstracaoController instance = new RegistarCandidaturaDemonstracaoController(u1.getEmail(), ce);
        instance.getListaExposicoes();
        instance.selectExposicoes(exp);
        CandidaturaExposicao cex = new CandidaturaExposicao("rep@centro.pt", "nome empresa", "morada", 919999999, 23, 5);
        exp.getListaCandidaturas().getListCandidaturas().add(cex);
        instance.getListaCandidaturasRep();
        instance.selectCandidatura(cex);

        Demonstracao d = new Demonstracao();
        instance.selectDemonstracao(d);
        ListaCandidaturasDemonstracoes rcd = d.getListaCandidaturas();
        CandidaturaDemonstracao cd = rcd.novaCandidatura();
        cd.setEmailRep(u1.getEmail());
        instance.novaCandidaturaDemonstracao(d);
        instance.registarCandidatura();

        boolean expResult = true;
        boolean result = instance.transitaEstado();
        assertEquals(expResult, result);

    }

}
