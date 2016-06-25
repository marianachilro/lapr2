/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import lapr.project.utils.AnaliseFAE;
import lapr.project.model.Avaliacao;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CandidaturaGeral;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.FAE;
import lapr.project.model.ListaAtribuicoes;
import lapr.project.model.ListaAvaliacoes;
import lapr.project.model.ListaFAEs;
import lapr.project.model.RegistoExposicoes;
import lapr.project.model.RegistoUtilizadores;
import lapr.project.model.Utilizador;

/**
 *
 * @author Rita
 */
public class GerarAnaliseFAEController {

    private CentroExposicoes ce;
    private AnaliseFAE analise;
    private RegistoUtilizadores ru;
    private RegistoExposicoes re;
    private List<Utilizador> lu;
    private List<Exposicao> le;
    private ListaFAEs rf;
    private ListaAtribuicoes rAt;
    private FAE f;
    private List<CandidaturaGeral> lc;
    private ListaAvaliacoes ra;
    private List<Avaliacao> la;
    private List<Float> listMediasFae;
    private List<AnaliseFAE> listAnalises;
    private int nCand;
    private int nAval;
    private float media;

    public GerarAnaliseFAEController(CentroExposicoes ce) {
        this.ce = ce;
        listMediasFae = new ArrayList<>();
        listAnalises = new ArrayList<>();
    }

    public AnaliseFAE novaAnalise() {
        analise = new AnaliseFAE();
        return analise;
    }

    public void criarAnalises() {
        boolean b = false;
        float mediaadd = 0;
        ru = ce.getRegistoUtilizadores();
        lu = ru.getListaUtilizadores();
        for (Utilizador u : lu) {
            nCand = 0;
            nAval = 0;
            media = 0;
            listMediasFae.clear();
            re = ce.getRegistoExposicoes();
            le = re.getListaExposicoes();
            for (Exposicao e : le) {
                rf = e.getListaFAES();
                rAt = e.getListaAtribuicoes();
                f = rf.getFAE(u);
                lc = rAt.getListaCandidaturasFAE(f);
                for (CandidaturaGeral c : lc) {
                    somaCandTotal();
                    ra = c.getListaAvaliacoes();
                    la = ra.getListaAvaliacao();
                    for (Avaliacao a : la) {
                        mediaadd = a.calcMediaRatings();
                        somaMediaTotal(mediaadd);
                        if (a.getAtribuicao().getFAE().equals(f)) {
                            listMediasFae.add(mediaadd);
                        }
                        nAval++;
                    }
                }
            }
            if (nCand != 0) {
                calcMediaTotal();
                novaAnalise();
                analise = new AnaliseFAE(u, nCand, media, listMediasFae);
                listAnalises.add(analise);
            }
        }
    }

    @Override
    public String toString() {
        String str = "FAE  |  Nº de submissões  |  Média das Classificações do FAE  |  Média dos Desvios  |  Valor observado da estatística de teste  |  Alerta\n";
        str = str + "==========================================================================================================================================\n";
        for (AnaliseFAE al : listAnalises) {
            str = str + al.toString();
        }
        return str;
    }

    public boolean needsWarning() {
        boolean b = false;
        for (AnaliseFAE al : listAnalises) {
            if (al.getDecisao().equals("SIM")) {
                b = true;
            }
        }
        return b;
    }

    public boolean valida() {
        int i = 0;
        re = ce.getRegistoExposicoes();
        le = re.getListaExposicoes();
        for (Exposicao e : le) {
            List<CandidaturaExposicao> listC = e.getListaCandidaturas().getListCandidaturas();
            i = i + listC.size();
        }
        if(i < 31) {
            return false;
        } else {
            return true;
    }

}

private void somaCandTotal() {
        nCand++;
    }

    private void somaMediaTotal(float media) {
        this.media = this.media + media;
    }

    private void calcMediaTotal() {
        this.media = (media / nAval);
    }
}
