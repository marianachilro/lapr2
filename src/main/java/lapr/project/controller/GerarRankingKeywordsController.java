/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.io.FileNotFoundException;
import java.util.List;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.File_CSV;

/**
 *
 * @author catarinarib
 */
public class GerarRankingKeywordsController {

    private final CentroExposicoes m_oCE;
    private Exposicao exposicao;
    private File_CSV file;

    public GerarRankingKeywordsController(CentroExposicoes m_oCE) {
        this.m_oCE = m_oCE;
    }

    public List<Exposicao> getListaExposicoes() {
        return this.m_oCE.getRegistoExposicoes().getListaExposicoes();
    }

    public void selectExposicao(Exposicao e) throws FileNotFoundException {
        this.exposicao = e;
        e.estatisticaCandidaturas();
        File_CSV ficheiro = new File_CSV(this.exposicao);
        ficheiro.ficheiro();

    }

}
