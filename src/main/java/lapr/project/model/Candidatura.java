/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author Rita
 */
public class Candidatura {

    /**
     * Nome de Expositor
     */
    private String nomeEmpresa;
    /**
     * Morada de Expositor
     */
    private String morada;
    /**
     * Número de telemóvel de Expositor.
     */
    private int telemovel;
    /**
     * Área pretendida pelo Expositor.
     */
    private float area;
    /**
     * Número de Convites pretendidos pelo Expositor.
     */
    private int numeroConvites;
    /**
     * Stand atribuído à Candidatura
     */
    private Stand stand;
    /**
     * Lista de Produtos da Candidatura.
     */
    private final ListaProdutos listaProdutos;
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
     * Construtor de uma candidatura com todos os atributos por omissão.
     */
    public Candidatura() {
        this.nomeEmpresa = NOME_OMISSAO;
        this.morada = MORADA_OMISSAO;
        this.telemovel = TELEMOVEL_OMISSAO;
        this.area = AREA_OMISSAO;
        this.numeroConvites = NUM_CONV_OMISSAO;
        listaProdutos = new ListaProdutos();
    }

    /**
     * Construtor de uma candidatura com todos os atributos recebidos por
     * parâmetro.
     *
     * @param nomeEmpresa nome de expositor
     * @param morada morada de expositor
     * @param telemovel número de telemóvel de expositor
     * @param area área pretendida
     * @param numeroConvites número de convites pretendidos pelo expositor
     */
    public Candidatura(String nomeEmpresa, String morada, int telemovel, float area, int numeroConvites) {
        this.nomeEmpresa = nomeEmpresa;
        this.morada = morada;
        this.telemovel = telemovel;
        this.area = area;
        this.numeroConvites = numeroConvites;
        listaProdutos = new ListaProdutos();
    }

    /**
     * Devolve o nome de expositor
     *
     * @return nome de expositor
     */
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    /**
     * Devolve morada de expositor.
     *
     * @return morada de expositor
     */
    public String getMorada() {
        return morada;
    }

    /**
     * Devolve número de telemóvel do expositor.
     *
     * @return número de telemóvel do expositor
     */
    public int getTelemovel() {
        return telemovel;
    }

    /**
     * Devolve a área pretendida pelo expositor.
     *
     * @return área pretendida pelo expositor
     */
    public float getArea() {
        return area;
    }

    /**
     * Devolve número de convites pretendidos pelo expositor.
     *
     * @return número de convites pretendidos pelo expositor
     */
    public int getNumeroConvites() {
        return numeroConvites;
    }

    /**
     * Devolve o stand atribuído à candidatura.
     *
     * @return stand de candidatura
     */
    public Stand getStand() {
        return stand;
    }

    /**
     * Devolve a lista de produtos da candidatura.
     *
     * @return lista de proutos de candidatura
     */
    public ListaProdutos getListaProdutos() {
        return listaProdutos;
    }

    /**
     * Modifica o nome do expositor.
     *
     * @param nomeEmpresa nome do expositor
     */
    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    /**
     * Modifica a morada do expositor.
     *
     * @param morada morada do expositor
     */
    public void setMorada(String morada) {
        this.morada = morada;
    }

    /**
     * Modifica o número de telemóvel do expositor.
     *
     * @param telemovel número de telemóvel do expositor
     */
    public void setTelemovel(int telemovel) {
        this.telemovel = telemovel;
    }

    /**
     * Modifica a área pretendida pelo expositor.
     *
     * @param area área pretendida pelo expositor
     */
    public void setArea(float area) {
        this.area = area;
    }

    /**
     * Modifica o número de convites pretendidos pelo expositor.
     *
     * @param numeroConvites número de convites pretendidos pelo expositor
     */
    public void setNumeroConvites(int numeroConvites) {
        this.numeroConvites = numeroConvites;
    }

    /**
     * Modifica o stand atribuído à candidatura.
     *
     * @param stand stand de candidatura
     */
    public void setStand(Stand stand) {
        this.stand = stand;
    }

}
