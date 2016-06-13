/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.Objects;

/**
 *
 * @author catarinarib
 */
public class Avaliacao {

    /**
     * A decisão da avaliação.
     */
    private String decisao;

    /**
     * Texto justificativo da avaliação.
     */
    private String txt;

    /**
     * Resposta ao inquerito sobre o tema da exposição.
     */
    private int respostaTemaExpo;

    /**
     * Resposta ao inquerito sobre a adquação da candidatura à exposição.
     */
    private int respostaAdequacaoCandExposicao;

    /**
     * Resposta ao inquerito sobre a adquação da candidaturas às demonstrações
     */
    private int respostaAdequacaoCandDemonstracao;

    /**
     * Resposta ao inquerito sobre a adquação do numero de convites.
     */
    private int respostaAdequacaoNumConvites;

    /**
     * Resposta ao inquerito recomendação global.
     */
    private int respostaRecomendacaoGlobal;

    /**
     * Atribuição por omissão.
     */
    private static final Atribuicao ATRIBUICAO_OMISSAO = null;

    /**
     * Resposta sobre o tema da exposicao por omissao
     */
    private static final int RESP_TEMA_EXPO_OMISSAO = 0;

    /**
     * Resposta sobre a adquação da candidatura à exposicao por omisao
     */
    private static final int RESP_ADEQUACAO_CAND_EXP_OMISSAO = 0;

    /**
     * Resposta sobre a adquação da candidatura à demonstracao por omissao
     */
    private static final int RESP_ADQUACAO_CAND_DEMOS_OMISSAO = 0;

    /**
     * Resposta sobre a adquação do numero de convites por omissao
     */
    private static final int RESP_ADEQUACAO_NUM_CONV_OMISSAO = 0;

    /**
     * Resposta ao inquerito recomendacao global por omissao
     */
    private static final int RESP_RECOMENDACAO_GLOBAL_OMISSAO = 0;
    /**
     * Decisão por omissão.
     */
    private static final String DECISAO_OMISSAO = "por decidir";

    /**
     * Texto Justificativo por omissão.
     */
    private static final String TXT_OMISSAO = "por justificar";

    /**
     * O fae da avaliação.
     */
    private String fae;

    /**
     * A candidatura da avaliação.
     */
    private String candidatura;

    /**
     * Construtor sem parametros
     */
    public Avaliacao() {
        this.fae = "";
        this.candidatura = "";
        this.decisao = DECISAO_OMISSAO;
        this.txt = TXT_OMISSAO;
        this.respostaTemaExpo = RESP_TEMA_EXPO_OMISSAO;
        this.respostaAdequacaoCandExposicao = RESP_ADEQUACAO_CAND_EXP_OMISSAO;
        this.respostaAdequacaoCandDemonstracao = RESP_ADQUACAO_CAND_DEMOS_OMISSAO;
        this.respostaAdequacaoNumConvites = RESP_ADEQUACAO_NUM_CONV_OMISSAO;
        this.respostaRecomendacaoGlobal = RESP_RECOMENDACAO_GLOBAL_OMISSAO;

    }

    /**
     * Constrói uma instância de Avaliacao recebendo o fae, a candidatura, a
     * decisao, texto justificativo e respostas do inquerito.
     *
     * @param fae o fae da avaliacao.
     * @param candidatura a candidatura da avaliacao.
     * @param decisao a decisao da avaliacao.
     * @param txt o texto justificativo da avaliacao.
     * @param respostaTemaExpo a resposta do inquerito sobre o tema da exposicao
     * @param respostaAdequacaoCandExpo a resposta ao inquerito sobre a adquação
     * da candidatura à exposicoa
     * @param respostaAdequacaoCandDemos à resposta ao inquerito sobre a
     * adquação da candidaturas às demonstrações
     * @param respostaAdequacaoNumConvites a resposta ao inquerito sobre a
     * adquação do numero de convites
     * @param respostaRecomendacaoGlobal a respota ao inquerito sobre a
     * recomendação global
     */
    public Avaliacao(String fae, String candidatura, String decisao, String txt, int respostaTemaExpo, int respostaAdequacaoCandExpo,
            int respostaAdequacaoCandDemos, int respostaAdequacaoNumConvites, int respostaRecomendacaoGlobal) {

        this.fae = fae;
        this.candidatura = candidatura;
        setDecisao(decisao);
        setTextoJustificativo(txt);
        setRespostaTemaExpo(respostaTemaExpo);
        setRespostaAdequacaoCandExposicao(respostaAdequacaoCandExpo);
        setRespostaAdequacaoCandDemonstracao(respostaAdequacaoCandDemos);
        setRespostaAdequacaoNumConvites(respostaAdequacaoNumConvites);
        setRespostaRecomendacaoGlobal(respostaRecomendacaoGlobal);

    }

    /**
     * Constrói uma instância de Avaliacao recebendo o fae, a candidatura, a
     * decisao, texto justificativo e resposta do inquerito.
     *
     * @param fae o fae da avaliacao
     * @param candidatura a candidatura da avaliacao
     * @param decisao a decisao da avaliacao
     * @param txt o texto justificativo da avaliacao
     */
    public Avaliacao(String fae, String candidatura, String decisao, String txt) {
        this.fae = fae;
        this.candidatura = candidatura;
        setDecisao(decisao);
        setTextoJustificativo(txt);

    }

    /**
     * Devolve a decisao da avaliacao.
     *
     * @return decisao da avalicao
     */
    public String getDecisao() {
        return decisao;
    }

    /**
     * Devolve o texto justificativo da avaliacao.
     *
     * @return texto justificativo da avalicao
     */
    public String getTxt() {
        return txt;
    }

    /**
     * Devolve o fae da avaliacao.
     *
     * @return fae da avalicao
     */
    public String getFae() {
        return fae;
    }

    /**
     * Devolve a candidatura da avaliacao.
     *
     * @return candidatura da avalicao
     */
    public String getCandidatura() {
        return candidatura;
    }

    /**
     * Modifica o fae
     *
     * @param fae o novo fae
     */
    public void setFae(String fae) {
        this.fae = fae;
    }

    /**
     * Modifica a candidatura
     *
     * @param candidatura nova candidatura
     */
    public void setCandidatura(String candidatura) {
        this.candidatura = candidatura;
    }

    /**
     * Modifica a decisao.
     *
     * @param decisao a nova decisao da avaliacao
     */
    public final void setDecisao(String decisao) {
        if (decisao == null || decisao.trim().isEmpty()) {
            throw new IllegalArgumentException("Decisao é inválida!");
        }
        this.decisao = decisao;
    }

    /**
     * Modifica o texto justificativo.
     *
     * @param txt o novo texto justificativo da avaliacao
     */
    public final void setTextoJustificativo(String txt) {
        if (txt == null || txt.trim().isEmpty()) {
            throw new IllegalArgumentException("Texto Justificativo é inválido!");
        }
        this.txt = txt;
    }

    /**
     * Devolve a resposta do inquerito sobre o tema da exposicao
     *
     * @return resposta do inquerito sobre o tema da exposicao
     */
    public int getRespostaTemaExpo() {
        return respostaTemaExpo;
    }

    /**
     * Modifica a resposta do inquerito sobre o tema da exposicao
     *
     * @param respostaTemaExpo resposta do inquerito sobre o tema da exposicao
     */
    public final void setRespostaTemaExpo(int respostaTemaExpo) {
        if (respostaTemaExpo > 6 || respostaTemaExpo < 0) {
            throw new IllegalArgumentException("De 1 a 5!");
        }
        this.respostaTemaExpo = respostaTemaExpo;
    }

    /**
     * Devolve a resposta do inquerito sobre a adquação da candidatura à
     * exposicao
     *
     * @return resposta do inquerito sobre a adquação da candidatura
     */
    public int getRespostaAdequacaoCandExposicao() {
        return respostaAdequacaoCandExposicao;
    }

    /**
     * Modifica resposta do inquerito sobre a adquação da candidatura
     *
     * @param respostaAdequacaoCand resposta do inquerito sobre a adquação da
     * candidatura
     */
    public final void setRespostaAdequacaoCandExposicao(int respostaAdequacaoCand) {
        if (respostaAdequacaoCand > 6 || respostaAdequacaoCand < 0) {
            throw new IllegalArgumentException("De 1 a 5!");
        }
        this.respostaAdequacaoCandExposicao = respostaAdequacaoCand;
    }

    /**
     * Devolve a resposta ao inquerito sobre a adquação da candidatura às
     * demonstracoes
     *
     * @return resposta ao inquerito sobre a adquação da candidatura às
     * demonstracoes
     */
    public int getRespostaAdequacaoCandDemonstracao() {
        return respostaAdequacaoCandDemonstracao;
    }

    /**
     * Modifica a resposta ao inquerito sobre a adquação da candidatura às
     * demonstracoes
     *
     * @param respostaAdequacaoCandDemonstracao resposta ao inquerito sobre a
     * adquação da candidatura às demonstracoes
     */
    public final void setRespostaAdequacaoCandDemonstracao(int respostaAdequacaoCandDemonstracao) {
        if (respostaAdequacaoCandDemonstracao > 6 || respostaAdequacaoCandDemonstracao < 0) {
            throw new IllegalArgumentException("De 1 a 5!");
        }
        this.respostaAdequacaoCandDemonstracao = respostaAdequacaoCandDemonstracao;
    }

    /**
     * Devolve a resposta ao inquerito sobre a adquação do numero de convites
     *
     * @return resposta ao inquerito sobre a adquação do numero de convites
     */
    public int getRespostaAdequacaoNumConvites() {
        return respostaAdequacaoNumConvites;
    }

    /**
     * Modifica a resposta ao inquerito sobre a adquação do numero de convites
     *
     * @param respostaAdequacaoNumConvites resposta ao inquerito sobre a
     * adquação do numero de convites
     */
    public final void setRespostaAdequacaoNumConvites(int respostaAdequacaoNumConvites) {
        if (respostaAdequacaoNumConvites > 6 || respostaAdequacaoNumConvites < 0) {
            throw new IllegalArgumentException("De 1 a 5!");
        }
        this.respostaAdequacaoNumConvites = respostaAdequacaoNumConvites;
    }

    /**
     * Devolve a resposta ao inquerito sobre a recomendação global
     *
     * @return resposta ao inquerito sobre a recomendação global
     */
    public int getRespostaRecomendacaoGlobal() {
        return respostaRecomendacaoGlobal;
    }

    /**
     * Modifica a resposta ao inquerito sobre a recomendação global
     *
     * @param respostaRecomendacaoGlobal resposta ao inquerito sobre a
     * recomendação global
     */
    public final void setRespostaRecomendacaoGlobal(int respostaRecomendacaoGlobal) {
        if (respostaRecomendacaoGlobal > 6 || respostaRecomendacaoGlobal < 0) {
            throw new IllegalArgumentException("De 1 a 5!");
        }
        this.respostaRecomendacaoGlobal = respostaRecomendacaoGlobal;
    }

    /**
     * Devolve a descrição textual do avaliacao no formato:
     * fae,candidatura,decisao, texto justificativo.
     *
     * @return caraterísticas do avaliacao
     */
    @Override
    public String toString() {
        return String.format("%s;%s;%s;%s;%n", this.fae, this.candidatura, this.decisao, this.txt);
    }

    /**
     * Permite comparar um objecto/avalicao por parametro com outra avaliacao.
     *
     * @param a uma avaliacao
     * @return boolean
     */
    @Override
    public boolean equals(Object a) {

        if (a == null) {
            return false;
        }

        if (this.getClass() != a.getClass()) {
            return false;
        }

        Avaliacao a1 = (Avaliacao) a;

        return this.candidatura.equalsIgnoreCase(a1.getCandidatura()) && this.fae.equalsIgnoreCase(a1.getFae());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.fae);
        hash = 31 * hash + Objects.hashCode(this.candidatura);
        return hash;
    }
    
    
}
