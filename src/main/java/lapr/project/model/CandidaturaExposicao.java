/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.Objects;

/**
 *
 * @author Rita
 */
public class CandidaturaExposicao implements Candidatura {

    private String emailRep;
    private String nomeEmpresa;
    private String morada;
    private int telemovel;
    private double area;
    private int convites;
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
        decisao="sem decisao";
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
     * @param nomeEmpresa nome de expositor
     * @param morada morada de expositor
     * @param telemovel número de telemóvel de expositor
     * @param area área pretendida
     * @param convites número de convites pretendidos pelo expositor
     */
    public CandidaturaExposicao(String emailRep, String nomeEmpresa, String morada, int telemovel, double area, int convites) {
        this.emailRep = emailRep;
        this.nomeEmpresa = nomeEmpresa;
        this.morada = morada;
        this.telemovel = telemovel;
        this.area = area;
        this.convites = convites;
        decisao="sem decisao";
        listaProdutos = new ListaProdutos();
        listaAvaliacoes = new ListaAvaliacoes();
        listaKeywords = new ListaKeywords();
        listaDemonstracoes = new ListaDemonstracoes();
    }

    public CandidaturaExposicao(CandidaturaExposicao c) {
        this.emailRep = c.getEmailRep();
        this.nomeEmpresa = c.getnomeEmpresa();
        this.morada = c.getMorada();
        this.telemovel = c.getTelemovel();
        this.area = c.getArea();
        this.convites = c.getConvites();
        decisao="sem decisao";
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

    @Override
    public String getEmailRep() {
        return emailRep;
    }

    @Override
    public ListaAvaliacoes getListaAvaliacoes() {
        return listaAvaliacoes;
    }

    public String getnomeEmpresa() {
        return nomeEmpresa;
    }

    public String getMorada() {
        return morada;
    }

    public int getTelemovel() {
        return telemovel;
    }

    public double getArea() {
        return area;
    }

    public int getConvites() {
        return convites;
    }

    @Override
    public String getDecisao() {
        return decisao;
    }

    @Override
    public CandidaturaEstado getEstado() {
        return estado;
    }

    public ListaKeywords getListaKeywords() {
        return listaKeywords;
    }

    public ListaDemonstracoes getListaDemonstracoes() {
        return listaDemonstracoes;
    }

    @Override
    public void setEmailRep(String email) {
        this.emailRep = email;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setTelemovel(int telemovel) {
        this.telemovel = telemovel;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setConvites(int convites) {
        this.convites = convites;
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
    public void setEstado(CandidaturaEstado estado) {
        this.estado = estado;
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

    public void setListaDemonstracoes(ListaDemonstracoes listaDemonstracoes) {
        this.listaDemonstracoes = listaDemonstracoes;
    }

    @Override
    public void setDecisao(String decisao) {
        this.decisao = decisao;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.emailRep);
        hash = 37 * hash + Objects.hashCode(this.nomeEmpresa);
        hash = 37 * hash + Objects.hashCode(this.morada);
        hash = 37 * hash + this.telemovel;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.area) ^ (Double.doubleToLongBits(this.area) >>> 32));
        hash = 37 * hash + this.convites;
        hash = 37 * hash + Objects.hashCode(this.decisao);
        hash = 37 * hash + Objects.hashCode(this.estado);
        hash = 37 * hash + Objects.hashCode(this.stand);
        hash = 37 * hash + Objects.hashCode(this.listaProdutos);
        hash = 37 * hash + Objects.hashCode(this.listaAvaliacoes);
        hash = 37 * hash + Objects.hashCode(this.listaKeywords);
        hash = 37 * hash + Objects.hashCode(this.listaDemonstracoes);
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
        final CandidaturaExposicao other = (CandidaturaExposicao) obj;
        if (this.telemovel != other.telemovel) {
            return false;
        }
        if (Double.doubleToLongBits(this.area) != Double.doubleToLongBits(other.area)) {
            return false;
        }
        if (this.convites != other.convites) {
            return false;
        }
        if (!Objects.equals(this.emailRep, other.emailRep)) {
            return false;
        }
        if (!Objects.equals(this.nomeEmpresa, other.nomeEmpresa)) {
            return false;
        }
        if (!Objects.equals(this.morada, other.morada)) {
            return false;
        }
        if (!Objects.equals(this.decisao, other.decisao)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.stand, other.stand)) {
            return false;
        }
        if (!Objects.equals(this.listaProdutos, other.listaProdutos)) {
            return false;
        }
        if (!Objects.equals(this.listaAvaliacoes, other.listaAvaliacoes)) {
            return false;
        }
        if (!Objects.equals(this.listaKeywords, other.listaKeywords)) {
            return false;
        }
        return Objects.equals(this.listaDemonstracoes, other.listaDemonstracoes);
    }
    @Override
    public String toString(){
        return "";
    }
    
    @Override
     public boolean validaAvaliacao(Avaliacao ac){
         //falta validação
         return true;
     }
     
     @Override
     public boolean verificarEstadoAtribuida(){
         //falta verificacoes
         return true;
     }
     
     @Override
     public boolean verificarEstadoAvaliada(){
         //falta verificacoes
         return true;
     }

//    @Override
//    public boolean setRemovida() {
//        return estado.setRemovida();
//    }

}
