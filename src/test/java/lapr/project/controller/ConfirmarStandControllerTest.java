/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.Stand;
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
public class ConfirmarStandControllerTest {
  

    /**
     * Testa se o método getListaCandidaturaRep retorna uma lista com as cand do representante que tem um stand atribuido.
     */
    @Test
    public void testGeListaCandidaturaRep() {
        CentroExposicoes ce = new CentroExposicoes();
        Exposicao e = new Exposicao();
        CandidaturaExposicao c = new CandidaturaExposicao();
        c.setEmailRep("123");
        c.setStand(new Stand());
        CandidaturaExposicao c1 = new CandidaturaExposicao();
        c1.setEmailRep("123");
        CandidaturaExposicao c2 = new CandidaturaExposicao();
        c2.setEmailRep("1234");
        e.getListaCandidaturas().addCandidatura(c);
        e.getListaCandidaturas().addCandidatura(c1);
        e.getListaCandidaturas().addCandidatura(c2);
        ce.getRegistoExposicoes().addExposicao(e);
        ConfirmarStandController instance = new ConfirmarStandController(ce,"123");
        List<CandidaturaExposicao> expResult = new ArrayList<CandidaturaExposicao>();
        expResult.add(c);
        List<CandidaturaExposicao> result = instance.geListaCandidaturaRep();
        assertEquals(expResult, result);
   

 
  
}
}
