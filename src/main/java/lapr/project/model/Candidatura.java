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
 * @author catarinarib
 */
public abstract class Candidatura {

    /**
     * Nome da empresa da candidatura.
     */
    private String m_sNomeEmpresa;

    /**
     * Morada da candidatura.
     */
    private String m_sMorada;

    /**
     * Numero de telemovel da candidatura.
     */
    private int m_sTelemovel;

    /**
     * Area da candidatura.
     */
    private double m_sArea;

    /**
     * Numero de convites da candidatura.
     */
    private int m_sConvites;

    /**
     * Valor do nome do expositor por omissão.
     */
    private static final String NOME_OMISSAO = "";
    /**
     * Valor de morada do expositor por omissão.
     */
    private static final String MORADA_OMISSAO = "";
    /**
     * Valor do número de telemóvel do expositor por omissão.
     */
    private static final int TELEMOVEL_OMISSAO = 0;
    /**
     * Valor da área pretendida pelo expositor por omissão.
     */
    private static final float AREA_OMISSAO = 0;
    /**
     * Valor do número de convites pretendiso pelo expositor por omissão.
     */
    private static final int NUM_CONV_OMISSAO = 0;

    /**
     * Titulo da exposição da candidatura.
     */
    private String m_sTituloExp;

    /**
     * Nome do representante que criou a candidatura.
     */
    private String m_snomeRepresentante;

    /**
     * Fae atribuido à candidatura.
     */
    private FAE fae;

    /**
     * Decisao da candidatura.
     */
    private String decisao;

    /**
     * Lista de avaliações sobre a candidatura.
     */
    private final ListaAvaliacoes listaAvaliacoes;

    /**
     * Construtor de uma candidatura com todos os atributos por omissão.
     */
    public Candidatura() {
        this.m_sNomeEmpresa = NOME_OMISSAO;
        this.m_sMorada = MORADA_OMISSAO;
        this.m_sTelemovel = TELEMOVEL_OMISSAO;
        this.m_sArea = AREA_OMISSAO;
        this.m_sConvites = NUM_CONV_OMISSAO;
        this.listaAvaliacoes = new ListaAvaliacoes();
        this.decisao = null;

    }

    /**
     * Constrói uma instância de Candidatura recebendo nome do representante,
     * titulo da exposição, nome da empresa, morada, numero de
     * telemovel,area,produtos,convites,demonstracao.
     *
     * @param nomeRepresentante o nome do representante da candidatura
     * @param sTituloExp o titulo da exposicao da candidatura
     * @param sNomeEmpresa o nome da empresa da candidatura
     * @param sMorada a morada da candidatura
     * @param sTelemovel o numero de telemovel da candidatura
     * @param sArea a area da candidatura
     *
     * @param sConvites o numero de convites da candidatura
     *
     *
     */
    public Candidatura(String nomeRepresentante, String sTituloExp, String sNomeEmpresa, String sMorada,
            int sTelemovel, double sArea, int sConvites) {

        setNomeEmpresa(sNomeEmpresa);
        setMorada(sMorada);
        setTelemovel(sTelemovel);
        this.m_sArea = sArea;

        this.m_sConvites = sConvites;

        this.m_sTituloExp = sTituloExp;

        this.m_snomeRepresentante = nomeRepresentante;
        this.listaAvaliacoes = new ListaAvaliacoes();
        this.decisao = null;

    }

    /**
     * Devolve o nome da empresa da candidatura.
     *
     * @return nome empresa da candidatura
     */
    public String getNomeEmpresa() {
        return m_sNomeEmpresa;
    }

    /**
     * Devolve a lista de avaliações da candidatura.
     *
     * @return lista de avaliacoes da candidatura
     */
    public ListaAvaliacoes getListaAvaliacoes() {
        return listaAvaliacoes;
    }

    /**
     * Modifica o nome da empresa.
     *
     * @param m_sNomeEmpresa novo nome da empresa da candidatura
     */
    public final void setNomeEmpresa(String m_sNomeEmpresa) {
        if (m_sNomeEmpresa == null || m_sNomeEmpresa.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome da empresa é inválido!");
        }
        this.m_sNomeEmpresa = m_sNomeEmpresa;
    }

    /**
     * Devolve a morada da candidatura.
     *
     * @return morada da candidatura
     */
    public String getMorada() {
        return m_sMorada;
    }

    /**
     * Modifica a morada.
     *
     * @param m_sMorada nova morada da candidatura
     */
    public final void setMorada(String m_sMorada) {
        if (m_sMorada == null || m_sMorada.trim().isEmpty()) {
            throw new IllegalArgumentException("Morada é inválida!");
        }
        this.m_sMorada = m_sMorada;
    }

    /**
     * Devolve o numero de telemovel da candidatura.
     *
     * @return numero de telemovel da candidatura
     */
    public int getTelemovel() {
        return m_sTelemovel;
    }

    /**
     * Modifica numero de telemovel.
     *
     * @param m_sTelemovel novo numero de telemovel da candidatura
     */
    public final void setTelemovel(int m_sTelemovel) {
        if (m_sTelemovel < 100000000 || m_sTelemovel > 999999999) {
            throw new IllegalArgumentException("Telemovel é inválido! Introduza 9 Digitos!");
        }
        this.m_sTelemovel = m_sTelemovel;
    }

    /**
     * Devolve a area da candidatura
     *
     * @return area da candidatura
     */
    public double getArea() {
        return m_sArea;
    }

    /**
     * Modifica area da candidatura
     *
     * @param m_sArea nova area da candidatura
     */
    public void setArea(double m_sArea) {

        this.m_sArea = m_sArea;
    }

    /**
     * Devolve o numero de convites da candidatura
     *
     * @return numero de convites da candidatura
     */
    public int getConvites() {
        return m_sConvites;
    }

    /**
     * Modifica o numero de convites da candidatura
     *
     * @param m_sConvites novo numero de convites da candidatura
     */
    public void setConvites(int m_sConvites) {
        this.m_sConvites = m_sConvites;
    }

    /**
     * Devolve o fae atribuido à candidatura
     *
     * @return fae atribuido à candidatura
     */
    public FAE getFae() {
        return fae;
    }

    /**
     * Modifica o fae atribuido à candidatura
     *
     * @param fae novo fae da candidatura
     */
    public void setFae(FAE fae) {
        this.fae = fae;
    }

    /**
     * Devolve o titulo da exposição da candidatura.
     *
     * @return titulo da exposicao
     */
    public String getM_sTituloExp() {
        return m_sTituloExp;
    }

    /**
     * Modifica o titulo da exposicao da candidatura
     *
     * @param m_sTituloExp novo titulo da exposicao
     */
    public void setM_sTituloExp(String m_sTituloExp) {
        this.m_sTituloExp = m_sTituloExp;
    }

    /**
     * Devolve o nome do representante da candidatura.
     *
     * @return nome do representante
     */
    public String getM_snomeRepresentante() {
        return m_snomeRepresentante;
    }

    /**
     * Modifica o nome do representante da candidatura
     *
     * @param m_snomeRepresentante novo nome do representante
     */
    public void setM_snomeRepresentante(String m_snomeRepresentante) {
        this.m_snomeRepresentante = m_snomeRepresentante;
    }

    /**
     * Devolve a decisao da candidatura
     *
     * @return decisao
     */
    public String getDecisao() {
        return decisao;
    }

    /**
     * Modifica a decisao da candidatura
     *
     * @param decisao nova decisao da candidatura
     */
    public void setDecisao(String decisao) {
        this.decisao = decisao;
    }

    /**
     * Devolve a descrição textual da candidatura no formato: nome do
     * represenante, titulo da exposicao, nome da empresa,
     * morada,telemovel,area,produtos,convites,demonstracao.
     *
     * @return caraterísticas da candidatura
     */
    @Override
    public String toString() {

        return String.format("%s;%s;%s;%s;%s;%s;%s;%s;%s;\n", this.m_snomeRepresentante, this.m_sTituloExp,
                this.m_sNomeEmpresa, this.m_sMorada, this.m_sTelemovel, this.m_sArea,
                this.m_sConvites);
    }

    /**
     * Permite comparar um objecto/candidatura por parametro por outra
     * candidatura.
     *
     * @param c candidatura
     * @return boolean
     */
    @Override
    public boolean equals(Object c) {

        Candidatura c1 = (Candidatura) c;
        if (this.m_sArea == c1.getArea() && this.m_sNomeEmpresa.equals(c1.getNomeEmpresa()) && this.m_sMorada.equals(c1.getMorada()) && this.m_sTelemovel == c1.getTelemovel() && this.m_sConvites == c1.getConvites()) {
            return true;
        }
        return false;
    }

    /**
     * Verificar se o fae que esta a avaliar a candidatura é um organizador da
     * mesma exposição
     *
     * @param fae fae
     * @param expo exposicao da candidatura
     * @return boolean
     */
    public boolean isOrganizador(FAE fae, Exposicao expo) {
        List<Organizador> lorg = expo.getListaOrganizadores().getListaOrganizadores();

        for (Organizador org : lorg) {
            if (org.getID().equals(fae.getID())) {
                throw new IllegalArgumentException("Este fae é um organizador da exposição! \nNão pode desempenhar os dois papeis na mesma exposição!");
            }
        }
        return false;
    }

}
