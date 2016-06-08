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
public class CandidaturaExposicao implements Candidatura {

    private String emailRep;
    private String nomeRepresentante;
    private String sTituloExp;
    private String sNomeEmpresa;
    private String sMorada;
    private int sTelemovel;
    private double sArea;
    private int sConvites;
    private String decisao;
    private CandidaturaEstado estado;
    /**
     * Stand atribuído à Candidatura
     */
    private Stand stand;
    /**
     * Lista de Produtos da Candidatura.
     */
    private ListaProdutos listaProdutos;
    private ListaAvaliacoes listaAvaliacoes;
    private ListaKeywords listaKeywords;
    private ListaDemonstracoes listaDemonstracoes;

    /**
     * Construtor de uma candidatura com todos os atributos por omissão.
     */
    public CandidaturaExposicao() {
        listaProdutos = new ListaProdutos();
        listaAvaliacoes = new ListaAvaliacoes();
        listaKeywords = new ListaKeywords();
        listaDemonstracoes = new ListaDemonstracoes();
    }

    /**
     * Construtor de uma candidatura com todos os atributos recebidos por
     * parâmetro.
     *
     * @param emailRep e-mail do representante
     * @param sTituloExp titulo da exposicao
     * @param sNomeEmpresa nome de expositor
     * @param sMorada morada de expositor
     * @param sTelemovel número de telemóvel de expositor
     * @param sArea área pretendida
     * @param sConvites número de convites pretendidos pelo expositor
     */
    public CandidaturaExposicao(String emailRep, String sNomeEmpresa, String sMorada, int sTelemovel, double sArea, int sConvites) {
        this.emailRep = emailRep;
        this.sNomeEmpresa = sNomeEmpresa;
        this.sMorada = sMorada;
        this.sTelemovel = sTelemovel;
        this.sArea = sArea;
        this.sConvites = sConvites;
        listaProdutos = new ListaProdutos();
        listaAvaliacoes = new ListaAvaliacoes();
        listaKeywords = new ListaKeywords();
        listaDemonstracoes = new ListaDemonstracoes();
    }
    public CandidaturaExposicao(CandidaturaExposicao c){
        this.emailRep = c.getEmailRep();
        this.sNomeEmpresa = c.getNomeRepresentante();
        this.sMorada = c.getsMorada();
        this.sTelemovel = c.getsTelemovel();
        this.sArea = c.getsArea();
        this.sConvites = c.getsConvites();
        listaAvaliacoes = new ListaAvaliacoes();
        listaDemonstracoes = new ListaDemonstracoes();
        listaProdutos = new ListaProdutos(c.getListaProdutos());
        listaKeywords = new ListaKeywords(c.getListaKeywords());
        
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
     * Modifica o stand atribuído à candidatura.
     *
     * @param stand stand de candidatura
     */
    public void setStand(Stand stand) {
        this.stand = stand;
    }

    @Override
    public String getEmailRep() {
        return emailRep;
    }

    @Override
    public void setEmailRep(String email) {
        this.emailRep = email;
    }

    @Override
    public ListaAvaliacoes getListaAvaliacoes() {
        return listaAvaliacoes;
    }

    @Override
    public void setDecisao(String decisao) {
        this.decisao = decisao;
    }

    public String getNomeRepresentante() {
        return nomeRepresentante;
    }

    public String getsTituloExp() {
        return sTituloExp;
    }

    public String getsNomeEmpresa() {
        return sNomeEmpresa;
    }

    public String getsMorada() {
        return sMorada;
    }

    public int getsTelemovel() {
        return sTelemovel;
    }

    public double getsArea() {
        return sArea;
    }

    public int getsConvites() {
        return sConvites;
    }

    public void setNomeRepresentante(String nomeRepresentante) {
        this.nomeRepresentante = nomeRepresentante;
    }

    public void setsTituloExp(String sTituloExp) {
        this.sTituloExp = sTituloExp;
    }

    public void setsNomeEmpresa(String sNomeEmpresa) {
        this.sNomeEmpresa = sNomeEmpresa;
    }

    public void setsMorada(String sMorada) {
        this.sMorada = sMorada;
    }

    public void setsTelemovel(int sTelemovel) {
        this.sTelemovel = sTelemovel;
    }

    public void setsArea(double sArea) {
        this.sArea = sArea;
    }

    public void setsConvites(int sConvites) {
        this.sConvites = sConvites;
    }

    @Override
    public String getDecisao() {
        return decisao;
    }

    @Override
    public CandidaturaEstado getEstado() {
        return estado;
    }

    @Override
    public void setEstado(CandidaturaEstado estado) {
        this.estado = estado;
    }

    public ListaKeywords getListaKeywords() {
        return listaKeywords;
    }

    public void setListaProdutos(ListaProdutos listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public void setListaAvaliacoes(ListaAvaliacoes listaAvaliacoes) {
        this.listaAvaliacoes = listaAvaliacoes;
    }

    public void setListaKeywords(ListaKeywords listaKeywords) {
        this.listaKeywords = listaKeywords;
    }

    public ListaDemonstracoes getListaDemonstracoes() {
        return listaDemonstracoes;
    }

    public void setListaDemonstracoes(ListaDemonstracoes listaDemonstracoes) {
        this.listaDemonstracoes = listaDemonstracoes;
    }

}
