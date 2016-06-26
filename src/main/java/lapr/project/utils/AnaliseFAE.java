/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import lapr.project.model.Utilizador;

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
    private int nCand;
    private float mediaTotal;
    private List<Float> mediasFae;
    private String decisao;
    private float variancia;
    private float mediaDesvios;
    private float mediaClassificacoes;
    private float estatistica;
    private float somatorio;

    private static final Utilizador UTILIZADOR_OMISSAO = null;
    private static final int N_SUB_OMISSAO = 0;
    private static final float MEDIA_TOTAL_OMISSAO = 0;
    private static final String DECISAO_OMISSAO = "NÃO";
    private static final float ESTATISTICA_OMISSAO = 0;
    private static final float NIVEL_SIGNIFICANCIA = (float) 0.05;
    private static final float REGIAO_CRITICA = (float) 1.645;

    public AnaliseFAE() {
        this.utilizador = UTILIZADOR_OMISSAO;
        this.nCand = N_SUB_OMISSAO;
        this.mediaTotal = MEDIA_TOTAL_OMISSAO;
        this.decisao = DECISAO_OMISSAO;
        this.mediasFae = new ArrayList<>();
        this.estatistica = ESTATISTICA_OMISSAO;
    }

    public AnaliseFAE(Utilizador utilizador, int nCand, float mediaTotal, List<Float> mediasFaes) {
        this.utilizador = utilizador;
        this.nCand = nCand;
        this.mediaTotal = mediaTotal;
        this.mediasFae = mediasFaes;
        gerarAnalise();
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public int getnCand() {
        return nCand;
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

    public void setnCand(int nCand) {
        this.nCand = nCand;
    }

    public void setMediaTotal(float mediaTotal) {
        this.mediaTotal = mediaTotal;
    }

    public void setMediasFae(List<Float> mediasFae) {
        this.mediasFae = mediasFae;
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

    public float gerarAnalise() {
        calcMediaClassificacoes();
        calcMediaDesvios();
        calcVariancia();
        estatistica = (float) ((mediaDesvios - 1) / (variancia / Math.sqrt(mediasFae.size())));
        if(variancia == 0 ||  Math.sqrt(mediasFae.size()) == 0 ) {
            estatistica = 0;
        }
        if (estatistica > REGIAO_CRITICA) {
            decisao = "SIM";
        } else {
            decisao = "NÃO";
        }
        return estatistica;
    }

    @Override
    public String toString() {
        return String.format("%s \t%17d\t  \t%10.3f\t  \t%11.3f\t  \t%16.3f\t  \t%7s \n", utilizador.getUsername(), nCand, mediaClassificacoes,
                mediaDesvios, estatistica, decisao);
    }

    private void calcMediaDesvios() {
        float soma = 0;
        mediaDesvios = 0;
        float desvio = 0;
        for (Float media : mediasFae) {
            desvio = Math.abs(media - mediaTotal);
            soma = soma + desvio;
        }
        if (mediasFae.size() == 0) {
            mediaDesvios = 0;
        } else {
            mediaDesvios = soma / mediasFae.size();
        }
    }

    private void calcVariancia() {
        somatorio = 0;
        variancia = 0;
        for (Float media : mediasFae) {
            somatorio = (float) (somatorio + (Math.pow(media, 2)));
        }
        if(mediasFae.size()-1 == 0) {
            variancia = 0;
        } else {
            variancia = (float) ((somatorio - (mediasFae.size() * Math.pow(mediaTotal, 2))) / (mediasFae.size() - 1));
            
        }
    }

    private void calcMediaClassificacoes() {
        mediaClassificacoes = 0;
        float soma = 0;
        for (Float media : mediasFae) {
            soma = soma + media;
        }
        mediaClassificacoes = soma / mediasFae.size();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.utilizador);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AnaliseFAE other = (AnaliseFAE) obj;
        if (!Objects.equals(this.utilizador, other.utilizador)) {
            return false;
        }
        return true;
    }

}
