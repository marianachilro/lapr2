/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.Avaliacao;
import lapr.project.model.Candidatura;
import lapr.project.model.CandidaturaDemonstracao;
import lapr.project.model.CandidaturaEstado;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Decisivel;
import lapr.project.model.Demonstracao;
import lapr.project.model.DemonstracaoEstado;
import lapr.project.model.Exposicao;
import lapr.project.model.ExposicaoEstado;
import lapr.project.model.Organizador;

/**
 *
 * @author catarinarib
 */
public class DecidirCandidaturaController {

    private final CentroExposicoes ce;
    private final Organizador org;
    private Exposicao exposicao;
    private Decisivel interfaceDecisivel;
    private Candidatura candidatura;
    private Demonstracao demonstracao;

    public DecidirCandidaturaController(CentroExposicoes ce, Organizador org) {
        this.ce = ce;
        this.org = org;
    }

    public List<Exposicao> getListaExposicoesOrganizador() {
        return this.ce.getRegistoExposicoes().getListaExposicoesOrganizador(org);
    }

    public void selectExposicao(Exposicao e) {
        this.exposicao = e;
    }

    public List<Candidatura> getDecisivel() {
        return this.exposicao.getDecisiveis();
    }

    public void selectCandidatura(Candidatura c) {
        this.candidatura = c;
    }

    public List<Avaliacao> getListaAvaliacoesDaCandidatura() {
        return this.candidatura.getListaAvaliacoes().getListaAvaliacao();
    }

    public void setDecisao(boolean decisao) {
        this.candidatura.setDecisao(decisao);

        ExposicaoEstado es = exposicao.getEstado();

        CandidaturaEstado cs = candidatura.getEstado();
        if (decisao == true) {
            cs.setAceite();
        } else {
            cs.setRejeitada();
        }

        if (!es.setDemonstracaoCandidaturasAvaliadas() && es.setDemonstracaoCandidaturasAvaliadas()) {
            CandidaturaDemonstracao cd = (CandidaturaDemonstracao) candidatura;
            for (Demonstracao d : cd.getListaDemonstracoes().getListaDemonstracao()) {
                for (CandidaturaDemonstracao c : d.getListaCandidaturas().getListCandidaturas()) {
                    if (c.equals(cd)) {
                        demonstracao = d;
                    }
                }
            }

            DemonstracaoEstado ds = demonstracao.getEstado();
            if (!ds.setCandidaturasAvaliadas() && ds.setCandidaturasAvaliadas()) {
                ds.setCandidaturasDecididas();
                es.setDemonstracaoCandidaturasDecididas();
            }
        } else {
            es.setExposicaoCandidaturasDecididas();
        }
    }

}
