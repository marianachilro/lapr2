/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import lapr.project.model.AnaliseFAE;
import lapr.project.model.Avaliacao;
import lapr.project.model.Candidatura;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.FAE;
import lapr.project.model.FicheiroAnalise;
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
    private RegistoUtilizadores ru;
    private RegistoExposicoes re;
    private List<Utilizador> lu;
    private List<Exposicao> le;
    private ListaFAEs rf;
    private ListaAtribuicoes rAt;
    private FAE f;
    private List<Candidatura> lc;
    private ListaAvaliacoes ra;
    private List<Avaliacao> la;
    private List<Float> listMediasFae;
    private List<AnaliseFAE> listAnalises;
    private int n;
    private float media;

    public GerarAnaliseFAEController(CentroExposicoes ce) {
        this.ce = ce;
        listMediasFae = new ArrayList<>();
        listAnalises = new ArrayList<>();
    }

    public void criarAnalises() {
        ru = ce.getRegistoUtilizadores();
        lu = ru.getListaUtilizadores();
        re = ce.getRegistoExposicoes();
        le = re.getListaExposicoes();
        for (Utilizador u : lu) {
            n = 0;
            media = 0;
            for (Exposicao e : le) {
                rf = e.getListaFAES();
                rAt = e.getListaAtribuicoes();
                f = rf.getFAE(u);
                lc = rAt.getListaCandidaturasFAE(f);
                for (Candidatura c : lc) {
                    somaCand();
                    ra = c.getListaAvaliacoes();
                    la = ra.getListaAvaliacao();
                    for (Avaliacao a : la) {
                        media = a.calcMediaRatings();
                        somaMediaTotal(media);
                        if(a.getAtribuicao().getFAE().equals(f)) {
                        listMediasFae.add(media);
                        }
                    }
                }
            }
            AnaliseFAE analise = new AnaliseFAE(u, n, media, listMediasFae);
            analise.gerarAnalise();
            listAnalises.add(analise);
        }
    }
    
    public void toFile() throws FileNotFoundException {
        FicheiroAnalise file = new FicheiroAnalise(listAnalises);
        file.escreverFicheiro();
    }
    
    public boolean needsWarning() {
        boolean b = false;
        for(AnaliseFAE a : listAnalises) {
            if(a.getDecisao().equals("NÃO")) {
                b = true;
            }
        }
        return b;
    }

    private void somaCand() {
        n++;
    }

    private void somaMediaTotal(float media) {
        this.media = this.media + media;
    }
}
