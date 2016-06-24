/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.Keyword;
import lapr.project.model.Local;
import lapr.project.utils.Data;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author catarinarib
 */
public class GerarRankingKeywordsControllerTest {

    /**
     * Test of getListaExposicoes method, of class
     * GerarRankingKeywordsController.
     */
    @Test
    public void testGetListaExposicoes() {
        System.out.println("getListaExposicoes");

        CentroExposicoes ce = new CentroExposicoes();
        GerarRankingKeywordsController instance = new GerarRankingKeywordsController(ce);

        List<Exposicao> expResult = ce.getRegistoExposicoes().getListaExposicoes();
        List<Exposicao> result = instance.getListaExposicoes();
        assertEquals(expResult, result);

    }

    /**
     * Test of selectExposicao method, of class GerarRankingKeywordsController.
     */
    @Test
    public void testSelectExposicao() throws Exception {
        System.out.println("selectExposicao");
        CentroExposicoes ce = new CentroExposicoes();
        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao exp = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);
        ce.getRegistoExposicoes().getListaExposicoes().add(exp);

        CandidaturaExposicao cex = new CandidaturaExposicao("rep@centro.pt", "nome empresa", "morada", 919999999, 23, 5);
        exp.getListaCandidaturas().getListCandidaturas().add(cex);
        CandidaturaExposicao cex3 = new CandidaturaExposicao("rep3@centro.pt", "nome empresa3", "morada3", 919999999, 23, 5);
        exp.getListaCandidaturas().getListCandidaturas().add(cex3);
        CandidaturaExposicao cex2 = new CandidaturaExposicao("rep2@centro.pt", "nome empresa2", "morada2", 919999999, 50, 2);
        exp.getListaCandidaturas().getListCandidaturas().add(cex2);
        cex.setDecisao(true);
        cex3.setDecisao(true);
        Keyword k = new Keyword("luz");
        Keyword k1 = new Keyword("carro");
        Keyword k3 = new Keyword("agua");
        Keyword k4 = new Keyword("motas");
        cex.getListaKeywords().addKeyword(k);
        cex.getListaKeywords().addKeyword(k3);
        cex3.getListaKeywords().addKeyword(k);
        cex3.getListaKeywords().addKeyword(k4);
        cex2.getListaKeywords().addKeyword(k1);
        cex2.getListaKeywords().addKeyword(k4);
        cex2.getListaKeywords().addKeyword(k);
        cex2.getListaKeywords().addKeyword(k3);

        GerarRankingKeywordsController instance = new GerarRankingKeywordsController(ce);
        instance.selectExposicao(exp);

    }

}
