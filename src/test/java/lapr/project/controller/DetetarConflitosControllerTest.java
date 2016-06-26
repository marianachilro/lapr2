/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.FAE;
import lapr.project.model.MecanismoConflitoIdentidadeNumerica;
import lapr.project.model.TipoConflito;
import lapr.project.model.Utilizador;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marianachilro
 */
public class DetetarConflitosControllerTest {
    
    public DetetarConflitosControllerTest() {
    }

    /**
     * Test of run method, of class DetetarConflitosController.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        CentroExposicoes centro = new CentroExposicoes();
        Exposicao expo = new Exposicao();
        centro.getRegistoExposicoes().addExposicao(expo);
        TipoConflito tipo = new TipoConflito("identidade numerica", "descricao");
        MecanismoConflitoIdentidadeNumerica m = new MecanismoConflitoIdentidadeNumerica();
        CandidaturaExposicao c = new CandidaturaExposicao();
        Utilizador u = new Utilizador(2, "joao", "jo", "jo@centro.pt", "aB;1", "dpddd");
        centro.getRegistoUtilizadores().addUtilizador(u);
        c.setEmailRep("jo@centro.pt");
        expo.getListaCandidaturas().addCandidatura(c);
        expo.getListaFAES().addFae(new FAE(u));
        
        DetetarConflitosController instance = new DetetarConflitosController(centro, expo);
        instance.run();
    }
    
}
