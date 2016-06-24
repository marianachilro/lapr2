/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Atribuicao;
import lapr.project.model.CandidaturaConflitosAlteradosEstado;
import lapr.project.model.CandidaturaDemonstracao;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.ExposicaoCompletaEstado;
import lapr.project.model.ExposicaoConflitosAtualizadosDemosEstado;
import lapr.project.model.ExposicaoConflitosAtualizadosExpoEstado;
import lapr.project.model.ExposicaoConflitosDetetadosDemosEstado;
import lapr.project.model.ExposicaoConflitosDetetadosExpoEstado;
import lapr.project.model.FAE;
import lapr.project.model.Local;
import lapr.project.model.Mecanismo_NFAE;
import lapr.project.model.Organizador;
import lapr.project.model.Utilizador;
import lapr.project.utils.Data;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author miniondevil
 */
public class AtribuirCandidaturaControllerTest {
    
    public AtribuirCandidaturaControllerTest() {
    }

//    /**
//     * Test of listaExpo method, of class AtribuirCandidaturaController.
//     */
//    @Test
//    public void testListaExpo() {
//        System.out.println("listaExpo");
//        String username = "asd";
//        String expo = "expo 1";
//        CentroExposicoes ce = new CentroExposicoes();
//        Utilizador u = new Utilizador(2, "joao", username, "asd@asd.com", "aA21;", "peixes");
//        ce.getRegistoUtilizadores().addUtilizador(u);
//        Exposicao e = new Exposicao(expo, "asd", new Data(2017,2,4,5,6,7), new Data(2018,2,4,5,6,7), new Local("porto"), new Data(2017,2,5,5,6,7), new Data(2017,2,6,5,6,7), new Data(2017,2,7,5,6,7), new Data(2017,2,8,5,6,7));
//        e.addOrganizador(u);
//        ce.getRegistoExposicoes().addExposicao(e);
//        AtribuirCandidaturaController instance = new AtribuirCandidaturaController(ce);
//        List<String> expResult = new ArrayList<>();
//        expResult.add("expo 1");
//        List<String> result = instance.listaExpo(username);
//        assertEquals(expResult, result);
//        
//    }
//
//    
//
//    /**
//     * Test of getListaMecanismoAtribuicao method, of class AtribuirCandidaturaController.
//     */
//    @Test
//    public void testGetListaMecanismoAtribuicao() {
//        System.out.println("getListaMecanismoAtribuicao");
//        CentroExposicoes ce = new CentroExposicoes();
//        Mecanismo_NFAE mecanismo = new Mecanismo_NFAE();
//        ce.getRegistoMecanismos().getListaMecanismos().add(mecanismo);
//        AtribuirCandidaturaController instance = new AtribuirCandidaturaController(ce);
//        List<Object> expResult = new ArrayList<>();
//        expResult.add(mecanismo);
//        List<Object> result = instance.getListaMecanismoAtribuicao();
//        assertEquals(expResult, result);
//        
//    }
//
//   
//    /**
//     * Testa o método getListaAtribuicoes para candidaturas à exposição.
//     */
//    @Test
//    public void testGetListaAtribuicoes() {
//        System.out.println("getListaAtribuicoes");
//        CentroExposicoes ce = new CentroExposicoes();
//        String titulo = "expo1";
//        String username = "joao";
//        Exposicao e = new Exposicao(titulo,"asd", new Data(2017,2,4,5,6,7), new Data(2018,2,4,5,6,7), new Local("porto"), new Data(2017,2,5,5,6,7), new Data(2017,2,6,5,6,7), new Data(2017,2,7,5,6,7), new Data(2017,2,8,5,6,7));
//Utilizador u = new Utilizador(2, "joao", username, "asd@asd.com", "aA21;", "peixes");
//e.addOrganizador(u);
//        List<FAE> listaf = e.getListaFAES().getListaFAEs();
//        e.setEstado(new ExposicaoConflitosAtualizadosExpoEstado(e));
//        FAE fae1 = new FAE();
//        FAE fae2 = new FAE();
//        FAE fae3 = new FAE();
//        FAE fae4 = new FAE();
//        FAE fae5 = new FAE();
//        FAE fae6 = new FAE();
//        e.getListaFAES().addFae(fae1);
//        e.getListaFAES().addFae(fae2);
//        e.getListaFAES().addFae(fae3);
//        e.getListaFAES().addFae(fae4);
//        e.getListaFAES().addFae(fae5);
//        e.getListaFAES().addFae(fae6);
//        CandidaturaExposicao c1 = new CandidaturaExposicao();
//        c1.setEstado(new CandidaturaConflitosAlteradosEstado(c1));
//        CandidaturaExposicao c2 = new CandidaturaExposicao();
//        c2.setEstado(new CandidaturaConflitosAlteradosEstado(c2));
//        CandidaturaExposicao c3 = new CandidaturaExposicao();
//        c3.setEstado(new CandidaturaConflitosAlteradosEstado(c3));
//        e.getListaCandidaturas().addCandidatura(c1);
//        e.getListaCandidaturas().addCandidatura(c2);
//        e.getListaCandidaturas().addCandidatura(c3);
//        ce.getRegistoExposicoes().addExposicao(e);
//        AtribuirCandidaturaController instance = new AtribuirCandidaturaController(ce);
//        instance.listaExpo(username);
//        instance.getExpo(titulo);
//        List<Atribuicao> expResult = new ArrayList<>();
//        expResult.add(new Atribuicao(fae1, c1));
//        expResult.add(new Atribuicao(fae2, c1));
//        expResult.add(new Atribuicao(fae3, c2));
//        expResult.add(new Atribuicao(fae4, c2));
//        expResult.add(new Atribuicao(fae5, c3));
//        expResult.add(new Atribuicao(fae6, c3));
//        ce.getRegistoMecanismos().getListaMecanismos().add(new Mecanismo_NFAE());
//        instance.getListaMecanismoAtribuicao();
//        instance.setMecanismo(0);
//        List<Atribuicao> result = instance.getListaAtribuicoes();
//        assertEquals(expResult, result);
//    
//    }
//     /**
//     * Testa o método getListaAtribuicoes para candidaturas à demonstracao.
//     */
//    @Test
//    public void testGetListaAtribuicoes1() {
//        System.out.println("getListaAtribuicoes");
//        CentroExposicoes ce = new CentroExposicoes();
//        String titulo = "expo1";
//        String username = "joao";
//        Exposicao e = new Exposicao(titulo,"asd", new Data(2017,2,4,5,6,7), new Data(2018,2,4,5,6,7), new Local("porto"), new Data(2017,2,5,5,6,7), new Data(2017,2,6,5,6,7), new Data(2017,2,7,5,6,7), new Data(2017,2,8,5,6,7));
//Utilizador u = new Utilizador(2, "joao", username, "asd@asd.com", "aA21;", "peixes");
//e.addOrganizador(u);
//        
//        e.setEstado(new ExposicaoConflitosAtualizadosDemosEstado(e));
//        FAE fae1 = new FAE();
//        FAE fae2 = new FAE();
//        FAE fae3 = new FAE();
//        FAE fae4 = new FAE();
//        FAE fae5 = new FAE();
//        FAE fae6 = new FAE();
//        e.getListaFAES().addFae(fae1);
//        e.getListaFAES().addFae(fae2);
//        e.getListaFAES().addFae(fae3);
//        e.getListaFAES().addFae(fae4);
//        e.getListaFAES().addFae(fae5);
//        e.getListaFAES().addFae(fae6);
//        Demonstracao d1 = new Demonstracao();
//        Demonstracao d2 = new Demonstracao();
//        CandidaturaDemonstracao c1 = new CandidaturaDemonstracao();
//        c1.setEstado(new CandidaturaConflitosAlteradosEstado(c1));
//        CandidaturaDemonstracao c2 = new CandidaturaDemonstracao();
//        c2.setEstado(new CandidaturaConflitosAlteradosEstado(c2));
//        CandidaturaDemonstracao c3 = new CandidaturaDemonstracao();
//        c3.setEstado(new CandidaturaConflitosAlteradosEstado(c3));
//        d1.getListaCandidaturas().addCandidatura(c1);
//        d1.getListaCandidaturas().addCandidatura(c2);
//        d2.getListaCandidaturas().addCandidatura(c3);
//        e.getListaDemonstracoes().addDemonstracao(d1);
//        e.getListaDemonstracoes().addDemonstracao(d2);
//        ce.getRegistoExposicoes().addExposicao(e);
//        AtribuirCandidaturaController instance = new AtribuirCandidaturaController(ce);
//        instance.listaExpo(username);
//        instance.getExpo(titulo);
//        List<Atribuicao> expResult = new ArrayList<>();
//        expResult.add(new Atribuicao(fae1, c1));
//        expResult.add(new Atribuicao(fae2, c1));
//        expResult.add(new Atribuicao(fae3, c2));
//        expResult.add(new Atribuicao(fae4, c2));
//        expResult.add(new Atribuicao(fae5, c3));
//        expResult.add(new Atribuicao(fae6, c3));
//        ce.getRegistoMecanismos().getListaMecanismos().add(new Mecanismo_NFAE(2));
//        instance.getListaMecanismoAtribuicao();
//        instance.setMecanismo(0);
//        List<Atribuicao> result = instance.getListaAtribuicoes();
//        assertEquals(expResult, result);
//    
//    }


    /**
     * Testa o método checkEstado dá true caso o estado seja ExposicaoConflitosAtualizadosExpo
     */
    @Test
    public void testCheckEstado() {
        System.out.println("checkEstado");
     String titulo = "expo1";
        String username = "joao";
        Exposicao e = new Exposicao(titulo,"asd", new Data(2017,2,4,5,6,7), new Data(2018,2,4,5,6,7), new Local("porto"), new Data(2017,2,5,5,6,7), new Data(2017,2,6,5,6,7), new Data(2017,2,7,5,6,7), new Data(2017,2,8,5,6,7));
Utilizador u = new Utilizador(2, "joao", username, "asd@asd.com", "aA21;", "peixes");
e.addOrganizador(u);
        CentroExposicoes ce = new CentroExposicoes();
        ce.getRegistoUtilizadores().addUtilizador(u);
        e.setEstado(new ExposicaoConflitosAtualizadosExpoEstado(e));
        ce.getRegistoExposicoes().addExposicao(e);
        AtribuirCandidaturaController instance = new AtribuirCandidaturaController(ce);
        instance.listaExpo(username);
        instance.getExpo(titulo);
        boolean expResult = true;
        boolean result = instance.checkEstado();
        assertEquals(expResult, result);
    
    }
    
    /**
     * Testa o método checkEstado dá true  caso o estado seja ExposicaoConflitosAtualizadosDemo
     */
    @Test
    public void testCheckEstado1() {
        System.out.println("checkEstado");
     String titulo = "expo1";
        String username = "joao";
        Exposicao e = new Exposicao(titulo,"asd", new Data(2017,2,4,5,6,7), new Data(2018,2,4,5,6,7), new Local("porto"), new Data(2017,2,5,5,6,7), new Data(2017,2,6,5,6,7), new Data(2017,2,7,5,6,7), new Data(2017,2,8,5,6,7));
Utilizador u = new Utilizador(2, "joao", username, "asd@asd.com", "aA21;", "peixes");
e.addOrganizador(u);
        CentroExposicoes ce = new CentroExposicoes();
        ce.getRegistoUtilizadores().addUtilizador(u);
        e.setEstado(new ExposicaoConflitosAtualizadosDemosEstado(e));
        ce.getRegistoExposicoes().addExposicao(e);
        AtribuirCandidaturaController instance = new AtribuirCandidaturaController(ce);
        instance.listaExpo(username);
        instance.getExpo(titulo);
        boolean expResult = true;
        boolean result = instance.checkEstado();
        assertEquals(expResult, result);
    
    }
    
    /**
     * Testa o método checkEstado dá false  caso o estado seja ExposicaoConflitosDetetadosDemo
     */
    @Test
    public void testCheckEstado2() {
        System.out.println("checkEstado");
     String titulo = "expo1";
        String username = "joao";
        Exposicao e = new Exposicao(titulo,"asd", new Data(2017,2,4,5,6,7), new Data(2018,2,4,5,6,7), new Local("porto"), new Data(2017,2,5,5,6,7), new Data(2017,2,6,5,6,7), new Data(2017,2,7,5,6,7), new Data(2017,2,8,5,6,7));
Utilizador u = new Utilizador(2, "joao", username, "asd@asd.com", "aA21;", "peixes");
e.addOrganizador(u);
        CentroExposicoes ce = new CentroExposicoes();
        ce.getRegistoUtilizadores().addUtilizador(u);
        e.setEstado(new ExposicaoConflitosDetetadosDemosEstado(e));
        ce.getRegistoExposicoes().addExposicao(e);
        AtribuirCandidaturaController instance = new AtribuirCandidaturaController(ce);
        instance.listaExpo(username);
        instance.getExpo(titulo);
        boolean expResult = false;
        boolean result = instance.checkEstado();
        assertEquals(expResult, result);
    
    }
        /**
     * Testa o método checkEstado dá false  caso o estado seja ExposicaoConflitosDetetadosExpo
     */
    @Test
    public void testCheckEstado3() {
        System.out.println("checkEstado");
     String titulo = "expo1";
        String username = "joao";
        Exposicao e = new Exposicao(titulo,"asd", new Data(2017,2,4,5,6,7), new Data(2018,2,4,5,6,7), new Local("porto"), new Data(2017,2,5,5,6,7), new Data(2017,2,6,5,6,7), new Data(2017,2,7,5,6,7), new Data(2017,2,8,5,6,7));
Utilizador u = new Utilizador(2, "joao", username, "asd@asd.com", "aA21;", "peixes");
e.addOrganizador(u);
        CentroExposicoes ce = new CentroExposicoes();
        ce.getRegistoUtilizadores().addUtilizador(u);
        e.setEstado(new ExposicaoConflitosDetetadosExpoEstado(e));
        ce.getRegistoExposicoes().addExposicao(e);
        AtribuirCandidaturaController instance = new AtribuirCandidaturaController(ce);
        instance.listaExpo(username);
        instance.getExpo(titulo);
        boolean expResult = false;
        boolean result = instance.checkEstado();
        assertEquals(expResult, result);
    
    }
    
        /**
     * Testa o método checkEstado dá false  caso o estado não seja nenhum dos 4 testados anteriormente.
     */
    @Test
    public void testCheckEstado4() {
        System.out.println("checkEstado");
     String titulo = "expo1";
        String username = "joao";
        Exposicao e = new Exposicao(titulo,"asd", new Data(2017,2,4,5,6,7), new Data(2018,2,4,5,6,7), new Local("porto"), new Data(2017,2,5,5,6,7), new Data(2017,2,6,5,6,7), new Data(2017,2,7,5,6,7), new Data(2017,2,8,5,6,7));
Utilizador u = new Utilizador(2, "joao", username, "asd@asd.com", "aA21;", "peixes");
e.addOrganizador(u);
        CentroExposicoes ce = new CentroExposicoes();
        ce.getRegistoUtilizadores().addUtilizador(u);
        e.setEstado(new ExposicaoCompletaEstado(e));
        ce.getRegistoExposicoes().addExposicao(e);
        AtribuirCandidaturaController instance = new AtribuirCandidaturaController(ce);
        instance.listaExpo(username);
        instance.getExpo(titulo);
        boolean expResult = false;
        boolean result = instance.checkEstado();
        assertEquals(expResult, result);
    
    }
    
}
