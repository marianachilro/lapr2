/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rita
 */
public class AnaliseFAE {

    public static float getNIVEL_SIGNIFICANCIA() {
        return NIVEL_SIGNIFICANCIA;
    }

    public static float getREGIAO_CRITICA() {
        return REGIAO_CRITICA;
    }

    private Utilizador utilizador;
    private int nSub;
    private float mediaTotal;
    private List<Float> mediasFae;
    private String decisao;
    private float variancia;
    private float mediaDesvios;
    private float mediaClassificacoes;
    private float estatistica;

    private static final Utilizador UTILIZADOR_OMISSAO = null;
    private static final int N_SUB_OMISSAO = 0;
    private static final float MEDIA_TOTAL_OMISSAO = 0;
    private static final String DECISAO_OMISSAO = "NÃO";
    private static final float NIVEL_SIGNIFICANCIA = (float) 0.05;
    private static final float REGIAO_CRITICA = (float) 1.645;

    public AnaliseFAE() {
        this.utilizador = UTILIZADOR_OMISSAO;
        this.nSub = N_SUB_OMISSAO;
        this.mediaTotal = MEDIA_TOTAL_OMISSAO;
        this.decisao = DECISAO_OMISSAO;
        this.mediasFae = new ArrayList<>();
    }

    public AnaliseFAE(Utilizador utilizador, int nSub, float mediaTotal, List<Float> mediasFaes) {
        this.utilizador = utilizador;
        this.nSub = nSub;
        this.mediaTotal = mediaTotal;
        this.mediasFae = new ArrayList<>();
        this.decisao = DECISAO_OMISSAO;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public int getnSub() {
        return nSub;
    }

    public float getMediaTotal() {
        return mediaTotal;
    }

    public List<Float> getMediasFae() {
        return mediasFae;
    }

    public String getDecisao() {
        return decisao;
    }

    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }

    public void setnSub(int nSub) {
        this.nSub = nSub;
    }

    public void setMediaTotal(float mediaTotal) {
        this.mediaTotal = mediaTotal;
    }

    public void setMediasFae(List<Float> mediasFae) {
        this.mediasFae=mediasFae;
    }

    public void setDecisao(String decisao) {
        this.decisao = decisao;
    }
    
    public float getVariancia() {
        return variancia;
    }

    public float getMediaDesvios() {
        return mediaDesvios;
    }

    public float getMediaClassificacoes() {
        return mediaClassificacoes;
    }

    public float getEstatistica() {
        return estatistica;
    }

    public void gerarAnalise() {
        calcMediaClassificacoes();
        calcMediaDesvios();
        calcVariancia();
        estatistica = (float) ((getMediaDesvios() - 1) / Math.sqrt(variancia / nSub));
        if(estatistica > REGIAO_CRITICA) {
            setDecisao("SIM");
        }
    }

    private void calcMediaDesvios() {
        float soma = 0;
        float desvio = 0;
        for (Float media : mediasFae) {
            desvio = Math.abs(media - mediaTotal);
            soma = soma + desvio;
        }
        mediaDesvios = soma / nSub;
    }

    private void calcVariancia() {
        float somatorio = 0;

        for (Float media : mediasFae) {
            somatorio = (float) (somatorio + Math.pow(media, 2));
        }
        variancia = (float) (somatorio - (nSub * Math.pow(mediaTotal, 2)) / (nSub - 1));
    }
    
    private void calcMediaClassificacoes() {
        float soma = 0;
        for(Float media : mediasFae) {
            soma = soma + media;
        }
        mediaClassificacoes = soma / nSub;
    }


}
