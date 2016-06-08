/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

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
     * Resposta ao inquerito sobre a adquação da candidatura.
     */
    private int respostaAdequacaoCand;

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
     * Resposta sobre a adquação da candidatura por oomisao
     */
    private static final int RESP_ADEQUACAO_CAND_OMISSAO = 0;

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
        this.respostaAdequacaoCand = RESP_ADEQUACAO_CAND_OMISSAO;
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
     * @param respostaAdequacaoCand a resposta ao inquerito sobre a adquação da
     * candidatura
     * @param respostaAdequacaoNumConvites a resposta ao inquerito sobre a
     * adquação do numero de convites
     * @param respostaRecomendacaoGlobal a respota ao inquerito sobre a
     * recomendação global
     */
    public Avaliacao(String fae, String candidatura, String decisao, String txt, int respostaTemaExpo, int respostaAdequacaoCand,
            int respostaAdequacaoNumConvites, int respostaRecomendacaoGlobal) {

        this.fae = fae;
        this.candidatura = candidatura;
        setDecisao(decisao);
        setTextoJustificativo(txt);
        this.respostaTemaExpo = respostaTemaExpo;
        this.respostaAdequacaoCand = respostaAdequacaoCand;
        this.respostaAdequacaoNumConvites = respostaAdequacaoNumConvites;
        this.respostaRecomendacaoGlobal = respostaRecomendacaoGlobal;

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
    public void setRespostaTemaExpo(int respostaTemaExpo) {
        this.respostaTemaExpo = respostaTemaExpo;
    }

    /**
     * Devolve a resposta do inquerito sobre a adquação da candidatura
     *
     * @return resposta do inquerito sobre a adquação da candidatura
     */
    public int getRespostaAdequacaoCand() {
        return respostaAdequacaoCand;
    }

    /**
     * Modifica resposta do inquerito sobre a adquação da candidatura
     *
     * @param respostaAdequacaoCand resposta do inquerito sobre a adquação da
     * candidatura
     */
    public void setRespostaAdequacaoCand(int respostaAdequacaoCand) {
        this.respostaAdequacaoCand = respostaAdequacaoCand;
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
    public void setRespostaAdequacaoNumConvites(int respostaAdequacaoNumConvites) {
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
    public void setRespostaRecomendacaoGlobal(int respostaRecomendacaoGlobal) {
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
        return String.format("%s;%s;%s;%s;\n", this.fae, this.candidatura, this.decisao, this.txt);
    }

    /**
     * Permite comparar um objecto/avalicao por parametro por outra avaliacao.
     *
     * @param a uma avaliacao
     * @return boolean
     */
    @Override
    public boolean equals(Object a) {

        Avaliacao a1 = (Avaliacao) a;
       
        if (this.candidatura.equalsIgnoreCase(a1.getCandidatura()) && this.fae.equalsIgnoreCase(a1.getFae())) {
            return true;
        }
        return false;
    }
}
