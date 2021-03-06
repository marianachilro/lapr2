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
import lapr.project.model.RegistoExposicoes;
import lapr.project.model.RegistoUtilizadores;

/**
 *
 * @author marianachilro
 */
public class GerarEstatisticasCandidaturaController {

    private final CentroExposicoes centro;

    private final RegistoExposicoes registoExpos;

    private Exposicao exposicao;

    private List<CandidaturaExposicao> listaCandidaturasAvaliadas;

    private Candidatura candidatura;

    private String estatistica;

    public GerarEstatisticasCandidaturaController(CentroExposicoes centro) {
        this.centro = centro;
        this.registoExpos = centro.getRegistoExposicoes();
    }

    public CentroExposicoes getCentro() {
        return this.centro;
    }

    public Exposicao getExposicao() {
        return this.exposicao;
    }

    public List<Exposicao> getExposicoesOrganizadorEstadoCandidaturasAvaliadas(String username, RegistoUtilizadores ru) {
        return this.registoExpos.getExposicoesOrganizadorEstadoCandidaturasAvaliadas(username, ru);

    }

    public List<CandidaturaExposicao> getCandidaturasAvaliadas(Exposicao exposicao) {
        List<CandidaturaExposicao> lista = new ArrayList<>();
        for (CandidaturaExposicao c : exposicao.getListaCandidaturas().getListCandidaturas()) {
            if (!c.getEstado().setEmAvaliacao() && c.getEstado().setAvaliada()) {
                lista.add(c);
            }
        }
        return lista;
    }

    public void seleciona(Exposicao expo) {
        this.exposicao = expo;
        this.listaCandidaturasAvaliadas = expo.getListaCandidaturas().getListaCandidaturasAvaliadas();
    }

    public String seleciona(CandidaturaExposicao c) {
        this.candidatura = c;
        return this.estatistica = c.toStringEstatisticaAvaliacoes();

    }

    public float getTaxaMediaAceitacao() {
        float taxaMedia = 0;
        float nAceitacoes = 0;
        int nAvaliacoes = 0;

        if (candidatura != null) {
            if (!candidatura.getListaAvaliacoes().getListaAvaliacao().isEmpty()) {
                for (Avaliacao a : candidatura.getListaAvaliacoes().getListaAvaliacao()) {
                    nAvaliacoes++;
                    if (a.getDecisao().equalsIgnoreCase("aceite")) {
                        nAceitacoes++;
                    }
                }
                taxaMedia = (nAceitacoes * 100) / nAvaliacoes;
            }
        }

        return taxaMedia;
    }
}
