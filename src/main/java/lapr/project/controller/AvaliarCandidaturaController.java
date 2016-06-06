/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.Avaliacao;
import lapr.project.model.Candidatura;
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
    private Candidatura candidatura;

    public AvaliarCandidaturaController(CentroExposicoes ce,FAE fae) {
        this.m_oCE = ce;
        this.m_oFAE=fae;
        
    }

    public List<Exposicao> getListaExposicoesFAE(Utilizador u) {
        return this.m_oCE.getRegistoExposicoes().getListaExposicoesDoFAE(u);
    }

    public void selecionaExposicao(Exposicao e) {
           this.m_exposicao=e;
    }

    public List<Candidatura> getInformacaoDasCandidaturasPorAvaliar(FAE fae) {
        return this.m_exposicao.getListaAtribuicoesFAE(fae);
    }

    public void selectCandidatura(Candidatura c){
        this.candidatura=c;
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
