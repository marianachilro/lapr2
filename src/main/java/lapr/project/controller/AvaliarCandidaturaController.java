/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.Avaliacao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.FAE;
import lapr.project.model.ListaAvaliacoes;
import lapr.project.model.Utilizador;

/**
 *
 * @author catarinarib
 */
public class AvaliarCandidaturaController {

    private Exposicao m_exposicao;
    private Avaliacao m_avaliacao;
    private final CentroExposicoes m_oCE;
    private FAE m_oFAE;
    private ListaAvaliacoes listaAvaliacoes;

    public AvaliarCandidaturaController(CentroExposicoes ce) {
        this.m_oCE = ce;
    }

    public List<Exposicao> getListaExposicoesFAE(Utilizador u) {
        return this.m_oCE.getRegistoExposicoes().getListaExposicoesDoFAE(u);
    }

    public void selecionaExposicao(Exposicao e) {

    }

    public String getInformacaoDaCandidaturaPorAvaliar(Object c) {
        return c.toString();
    }

    public void setAvaliacao(String fae, String candidatura, String decisao, String txt, int respostaTemaExpo, int respostaAdequacaoCand,
            int respostaAdequacaoNumConvites, int respostaRecomendacaoGlobal) {

        this.m_avaliacao = listaAvaliacoes.novaAvaliacao();

        this.m_avaliacao.setFae(fae);
        this.m_avaliacao.setCandidatura(candidatura);
        this.m_avaliacao.setDecisao(decisao);
        this.m_avaliacao.setTextoJustificativo(txt);
        this.m_avaliacao.setRespostaTemaExpo(respostaTemaExpo);
        this.m_avaliacao.setRespostaAdequacaoCand(respostaAdequacaoCand);
        this.m_avaliacao.setRespostaAdequacaoNumConvites(respostaAdequacaoNumConvites);
        this.m_avaliacao.setRespostaRecomendacaoGlobal(respostaRecomendacaoGlobal);
    }

    public boolean registaAvaliacao() {
        if (this.listaAvaliacoes.validaAvaliacao(m_avaliacao) != true) {
            this.listaAvaliacoes.addAvaliacao(m_avaliacao);
            return true;
        } else {
            return false;
        }

    }

}
