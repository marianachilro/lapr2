/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.CandidaturaAlteradaEstado;
import lapr.project.model.CandidaturaAvaliadaEstado;
import lapr.project.model.CandidaturaEmSubmissaoEstado;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author miniondevil
 */
public class AlterarCandidaturaControllerTest {

//    /**
//     * Testa se o métdo getListaCandidaturaRep apenas vai buscar as candidaturas
//     * do representante que estejam no estado criada ou alterada.
//     */
//    @Test
//    public void testGetListaCandidaturasRep() {
//        CentroExposicoes ce = new CentroExposicoes();
//        Exposicao e = new Exposicao();
//        CandidaturaExposicao c = new CandidaturaExposicao("123", "aaa", "aaad", 911111111, 10, 30);
//        c.setEstado(new CandidaturaAlteradaEstado(c));
//        CandidaturaExposicao c1 = new CandidaturaExposicao("123", "aaa", "aaad", 911111111, 10, 30);
//        c1.setEstado(new CandidaturaEmSubmissaoEstado(c1));
//        CandidaturaExposicao c2 = new CandidaturaExposicao("1234", "aaa", "aaad", 911111111, 10, 30);
//        c2.setEstado(new CandidaturaEmSubmissaoEstado(c2));
//        CandidaturaExposicao c3 = new CandidaturaExposicao("123", "aaa", "aaad", 911111111, 10, 30);
//       
//        c3.setEstado(new CandidaturaAvaliadaEstado(c3));
//        List<CandidaturaExposicao>lc = e.getListaCandidaturas().getListCandidaturas();
//        lc.add(c);
//        lc.add(c1);
//        lc.add(c2);
//        lc.add(c3);
////        e.getListaCandidaturas().addCandidatura(c);
////        e.getListaCandidaturas().addCandidatura(c1);
////        e.getListaCandidaturas().addCandidatura(c2);
////        e.getListaCandidaturas().addCandidatura(c3);
//        ce.getRegistoExposicoes().addExposicao(e);
//        AlterarCandidaturaController instance = new AlterarCandidaturaController(ce, "123");
//        List<CandidaturaExposicao> expResult = new ArrayList<>();
//        expResult.add(c);
//        expResult.add(c1);
//        List<CandidaturaExposicao> result = instance.getListaCandidaturasRep();
//        assertEquals(expResult, result);
//    }

    /**
     * Test of clonarCandidatura method, of class AlterarCandidaturaController.
     */
    @Test
    public void testClonarCandidatura() {
        CentroExposicoes ce = new CentroExposicoes();

        CandidaturaExposicao c = new CandidaturaExposicao("123", "aaa", "aaad", 911111111, 10, 30);
        AlterarCandidaturaController instance = new AlterarCandidaturaController(ce, "123");
        CandidaturaExposicao expResult = c;
        CandidaturaExposicao result = instance.clonarCandidatura(c);
        assertEquals(expResult, result);

    }
}
