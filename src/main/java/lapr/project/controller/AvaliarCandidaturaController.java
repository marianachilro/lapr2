/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.Atribuicao;
import lapr.project.model.Avaliacao;
import lapr.project.model.Avaliavel;
import lapr.project.model.Candidatura;
import lapr.project.model.CandidaturaDemonstracao;
import lapr.project.model.CandidaturaEstado;
import lapr.project.model.CandidaturaGeral;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.DemonstracaoEstado;
import lapr.project.model.Exposicao;
import lapr.project.model.ExposicaoEstado;
import lapr.project.model.FAE;
import lapr.project.model.Utilizador;

/**
 *
 * @author catarinarib
 */
public class AvaliarCandidaturaController {

    private Exposicao m_exposicao;
    private Avaliacao m_avaliacao;
    private final CentroExposicoes m_oCE;
    private final FAE m_oFAE;
    private Candidatura candidatura;
    private Avaliavel interfaceAvaliavel;
    private Demonstracao demonstracao;

    public AvaliarCandidaturaController(CentroExposicoes ce, FAE fae) {
        this.m_oCE = ce;
        this.m_oFAE = fae;

    }

    public List<Exposicao> getListaExposicoesFAE(Utilizador u) {
        return this.m_oCE.getRegistoExposicoes().getListaExposicoesDoFAE(u);
    }

    public void selecionaExposicao(Exposicao e) {
        this.m_exposicao = e;
    }

    public List<CandidaturaGeral> getAvaliaveis(FAE fae) {
        return this.m_exposicao.getAvaliaveis(fae);
    }

    public void selectCandidatura(Candidatura c) {
        this.candidatura = c;
        c.toString();
    }

    public void setAvaliacao(String fae,String emailrepCand, String decisao, String txt, int respostaTemaExpo, int respostaAdequacaoCand,
            int respostaAdequacaoCandDemo, int respostaAdequacaoNumConvites, int respostaRecomendacaoGlobal) {

        this.m_avaliacao = this.candidatura.getListaAvaliacoes().novaAvaliacao();

        this.m_avaliacao.setFae(fae);
        this.m_avaliacao.setEmailRepCand(emailrepCand);
        this.m_avaliacao.setDecisao(decisao);
        this.m_avaliacao.setTextoJustificativo(txt);
        this.m_avaliacao.setRespostaTemaExpo(respostaTemaExpo);
        this.m_avaliacao.setRespostaAdequacaoCandExposicao(respostaAdequacaoCand);
        this.m_avaliacao.setRespostaAdequacaoCandDemonstracao(respostaAdequacaoCandDemo);
        this.m_avaliacao.setRespostaAdequacaoNumConvites(respostaAdequacaoNumConvites);
        this.m_avaliacao.setRespostaRecomendacaoGlobal(respostaRecomendacaoGlobal);

    }

    public void setAvaliacao(String fae,String emailrepCand, String decisao, String txt) {
        this.m_avaliacao = this.candidatura.getListaAvaliacoes().novaAvaliacaoDemo();

        this.m_avaliacao.setFae(fae);
        this.m_avaliacao.setEmailRepCand(emailrepCand);
        this.m_avaliacao.setDecisao(decisao);
        this.m_avaliacao.setTextoJustificativo(txt);
    }

    public boolean registaAvaliacao() {
        if (this.candidatura.getListaAvaliacoes().validaAvaliacao(m_avaliacao) != true) {
            ExposicaoEstado es = m_exposicao.getEstado();

            CandidaturaEstado cs = candidatura.getEstado();
            cs.setAvaliada();

            if (!es.setDemonstracaoConflitosAtualizados() && es.setDemonstracaoCandidaturasAtribuidas()) {
                CandidaturaDemonstracao cd = (CandidaturaDemonstracao) candidatura;
                for (Demonstracao d : cd.getListaDemonstracoes().getListaDemonstracao()) {
                    for (CandidaturaDemonstracao c : d.getListaCandidaturas().getListCandidaturas()) {
                        if (c.equals(cd)) {
                            demonstracao = d;
                        }
                    }
                }
                DemonstracaoEstado ds = demonstracao.getEstado();

                if (!ds.setConflitosAtualizados() && ds.setCandidaturasAtribuidas()) {
                    ds.setCandidaturasAvaliadas();
                    es.setDemonstracaoCandidaturasAvaliadas();
                }

            } else {
                es.setExposicaoCandidaturasAvaliadas();
            }

            this.candidatura.getListaAvaliacoes().addAvaliacao(m_avaliacao);
            return true;
        } else {
            return false;
        }

    }

}
