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
        decisao = "sem decisao";
        listaProdutos = new ListaProdutos();
        listaAvaliacoes = new ListaAvaliacoes();
        listaKeywords = new ListaKeywords();
        listaDemonstracoes = new ListaDemonstracoes();
        estado = new CandidaturaInicialEstado(this);
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
        setNomeEmpresa(nomeEmpresa);
        setMorada(morada);
        setTelemovel(telemovel);
        this.area = area;
        this.convites = convites;
        decisao = "sem decisao";
        listaProdutos = new ListaProdutos();
        listaAvaliacoes = new ListaAvaliacoes();
        listaKeywords = new ListaKeywords();
        listaDemonstracoes = new ListaDemonstracoes();
        estado = new CandidaturaInicialEstado(this);
    }

    public CandidaturaExposicao(CandidaturaExposicao c) {
        this.emailRep = c.getEmailRep();
        this.nomeEmpresa = c.getnomeEmpresa();
        this.morada = c.getMorada();
        this.telemovel = c.getTelemovel();
        this.area = c.getArea();
        this.convites = c.getConvites();
        decisao = "sem decisao";
        listaAvaliacoes = new ListaAvaliacoes();
        listaDemonstracoes = new ListaDemonstracoes();
        listaProdutos = new ListaProdutos(c.getListaProdutos());
        listaKeywords = new ListaKeywords(c.getListaKeywords());
        estado = c.getEstado();

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
     * Devolve o mail do representante da exposicao
     * @return 
     */
    @Override
    public String getEmailRep() {
        return emailRep;
    }

    /**
     * Devolve lista de avaliações feitas pelos faes
     * @return 
     */
    @Override
    public ListaAvaliacoes getListaAvaliacoes() {
        return listaAvaliacoes;
    }

    /**
     * Devolve o nome da empresa do representante
     * @return nome da empresa
     */
    public String getnomeEmpresa() {
        return nomeEmpresa;
    }

    /**
     * Devolve a morada do representante
     * @return morada
     */
    public String getMorada() {
        return morada;
    }

    /**
     * Devolve o numero de telemovel do representante
     * @return telemovel
     */
    public int getTelemovel() {
        return telemovel;
    }

    /**
     * Devolve a area 
     * @return area
     */
    public double getArea() {
        return area;
    }

    /**
     * Devolve o numero de convites
     * @return numero de convites
     */
    public int getConvites() {
        return convites;
    }

    /**
     * Devolve a decisao do organizador
     * @return decisao
     */
    @Override
    public String getDecisao() {
        return decisao;
    }

    /**
     * Devolve estado
     * @return estado
     */
    @Override
    public CandidaturaEstado getEstado() {
        return estado;
    }

    /**
     * Devolve a lista de keywords da candidatura
     * @return 
     */
    public ListaKeywords getListaKeywords() {
        return listaKeywords;
    }

    /**
     * Devolve a lista de demonstracoes 
     * @return lista demonstracoes
     */
    public ListaDemonstracoes getListaDemonstracoes() {
        return listaDemonstracoes;
    }

    /**
     * Modifica o email do rep da exposicao
     * @param email 
     */
    @Override
    public void setEmailRep(String email) {
        this.emailRep = email;
    }

    /**
     * Modifica o nome da empresa da candidatura
     * @param nomeEmpresa nome da empresa
     */
    public final void setNomeEmpresa(String nomeEmpresa) {
        if (nomeEmpresa == null || nomeEmpresa.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome da empresa é inválido!");
        }
        this.nomeEmpresa = nomeEmpresa;
    }

    /**
     * Modifica a morada da candidatura
     * @param morada morada da candidatura
     */
    public final void setMorada(String morada) {
        if (morada == null || morada.trim().isEmpty()) {
            throw new IllegalArgumentException("Morada é inválida!");
        }
        this.morada = morada;
    }

    /**
     * Modifica o telemovel da candidatura
     * @param telemovel telemovel
     */
    public final void setTelemovel(int telemovel) {
        if (telemovel < 100000000 || telemovel > 999999999) {
            throw new IllegalArgumentException("Telemovel é inválido! Introduza 9 Digitos!");
        }
        this.telemovel = telemovel;
    }

    /**
     * Modifica a area da candidatura
     * @param area 
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * Modifica o numero de convites da candidatura
     * @param convites numero de convites
     */
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
    public String toString() {
        return "";
    }

    @Override
    public boolean validaAvaliacao(Avaliacao ac) {
        //falta validação
        return true;
    }

    @Override
    public boolean verificarEstadoAtribuida() {
        //falta verificacoes
        return true;
    }

    @Override
    public boolean verificarEstadoAvaliada() {
        //falta verificacoes
        return true;
    }

    public String toStringEstatisticaAvaliacoes() {

        return String.format("%nResposta sobre o Tema da Exposição (média): %.2f%n"
                + "Resposta sobre a Adequação da Candidatura à Exposição (média): %.2f"
                + "Resposta sobre a Adequação das Candidaturas às Demonstrações (média): %.2f"
                + "Resposta sobre a Adequação do número de Convites (média): %.2f"
                + "Resposta sobre Recomendação Global (média): %.2f", estatisticaAvaliacoes(1), estatisticaAvaliacoes(2), estatisticaAvaliacoes(3), estatisticaAvaliacoes(4), estatisticaAvaliacoes(5));
    }

    public float estatisticaAvaliacoes(int i) {
        int valores = 0;
        int nAvaliacoes = 0;
        for (Avaliacao a : this.getListaAvaliacoes().getListaAvaliacao()) {
            if (a != null) {
                if (i == 1) {
                    valores = valores + a.getRespostaTemaExpo();
                } else if (i == 2) {
                    valores = valores + a.getRespostaAdequacaoCandExposicao();
                } else if (i == 3) {
                    valores = valores + a.getRespostaAdequacaoCandDemonstracao();
                } else if (i == 4) {
                    valores = valores + a.getRespostaAdequacaoNumConvites();
                } else if (i == 5) {
                    valores = valores + a.getRespostaRecomendacaoGlobal();
                }
                nAvaliacoes++;
            }
        }
        float media = 0;
        if (nAvaliacoes != 0) {
            media = valores / nAvaliacoes;
        }
        return media;

    }

}
