/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.Objects;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rita
 */
@XmlRootElement
public class CandidaturaExposicao extends CandidaturaGeral implements Removivel, Atribuivel {


    private String nomeEmpresa;

    private String morada;
    private int telemovel;

    private double area;

    private int convites;


    /**
     * Contador para saber se ja foi decidida a candidatura
     */
    private int contador;
    /**
     * Stand atribuído à Candidatura
     */
    private Stand stand;
    /**
     * Lista de Produtos da Candidatura.
     */
    private ListaProdutos listaProdutos;
   
    /**
     * Lista de keywords da candidatura.
     */
    private ListaKeywords listaKeywords;
    /**
     * lista de demonstrações da candidatura.
     */
    private ListaDemonstracoes listaDemonstracoes;

    /**
     * Valor do nome da empresa por omissão.
     */
    private static final String NOME_EMPRESA_OMISSAO = "";

    /**
     * Valor do morada por omissão.
     */
    private static final String MORADA_OMISSAO = "";

    /**
     * Valor do numero de telemovel por omissão.
     */
    private static final int TELEMOVEL_OMISSAO = 999999999;

    /**
     * Valor da area por omissão.
     */
    private static final double AREA_OMISSAO = 0;

    /**
     * Valor do numero de convites por omissão.
     */
    private static final int CONVITES_OMISSAO = 0;

    /**
     * Construtor de uma candidatura com todos os atributos por omissão.
     */
    public CandidaturaExposicao() {

        super();
        this.nomeEmpresa = NOME_EMPRESA_OMISSAO;
        this.morada = MORADA_OMISSAO;
        this.telemovel = TELEMOVEL_OMISSAO;
        this.area = AREA_OMISSAO;
        this.convites = CONVITES_OMISSAO;
        listaProdutos = new ListaProdutos();
        listaKeywords = new ListaKeywords();
        listaDemonstracoes = new ListaDemonstracoes();
        stand = null;
        this.contador = 0;

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
        super(emailRep);
        setMorada(morada);
        setTelemovel(telemovel);
        this.area = area;
        this.convites = convites;
        listaProdutos = new ListaProdutos();
        listaKeywords = new ListaKeywords();
        listaDemonstracoes = new ListaDemonstracoes();
        stand = null;
        this.contador = 0;
    }

    public CandidaturaExposicao(CandidaturaExposicao c) {
        super(c);
        this.nomeEmpresa = c.getNomeEmpresa();
        this.morada = c.getMorada();
        this.telemovel = c.getTelemovel();
        this.area = c.getArea();
        this.convites = c.getConvites();
        listaDemonstracoes = new ListaDemonstracoes();
        listaProdutos = new ListaProdutos(c.getListaProdutos());
        listaKeywords = new ListaKeywords(c.getListaKeywords());
        
        stand = null;
        this.contador = 0;

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
     * Devolve o nome da empresa do representante
     *
     * @return nome da empresa
     */
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    /**
     * Devolve a morada do representante
     *
     * @return morada
     */
    public String getMorada() {
        return morada;
    }

    /**
     * Devolve o numero de telemovel do representante
     *
     * @return telemovel
     */
    public int getTelemovel() {
        return telemovel;
    }

    /**
     * Devolve a area
     *
     * @return area
     */
    public double getArea() {
        return area;
    }

    /**
     * Devolve o numero de convites
     *
     * @return numero de convites
     */
    public int getConvites() {
        return convites;
    }


  

    /**
     * Devolve a lista de keywords da candidatura
     *
     * @return
     */
    public ListaKeywords getListaKeywords() {
        return listaKeywords;
    }

    /**
     * Devolve a lista de demonstracoes
     *
     * @return lista demonstracoes
     */
    public ListaDemonstracoes getListaDemonstracoes() {
        return listaDemonstracoes;
    }

    

    /**
     * Modifica o nome da empresa da candidatura
     *
     * @param nomeEmpresa nome da empresa
     */
    @XmlElement(name = "empresa")
    public final void setNomeEmpresa(String nomeEmpresa) {
        if (nomeEmpresa == null || nomeEmpresa.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome da empresa é inválido!");
        }
        this.nomeEmpresa = nomeEmpresa;
    }

    /**
     * Modifica a morada da candidatura
     *
     * @param morada morada da candidatura
     */
    @XmlElement
    public final void setMorada(String morada) {
        if (morada == null || morada.trim().isEmpty()) {
            throw new IllegalArgumentException("Morada é inválida!");
        }
        this.morada = morada;
    }

    /**
     * Modifica o telemovel da candidatura
     *
     * @param telemovel telemovel
     */
    @XmlElement
    public final void setTelemovel(int telemovel) {
        if (telemovel < 100000000 || telemovel > 999999999) {
            throw new IllegalArgumentException("Telemovel é inválido! Introduza 9 Digitos!");
        }
        this.telemovel = telemovel;
    }

    /**
     * Modifica a area da candidatura
     *
     * @param area
     */
    @XmlElement(name="areaPretendida")
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * Modifica o numero de convites da candidatura
     *
     * @param convites numero de convites
     */
    @XmlElement(name = "quantidadeConvites")
    public void setConvites(int convites) {
        this.convites = convites;
    }

    /**
     * Modifica o stand atribuído à candidatura.
     *
     * @param stand stand de candidatura
     */
    @XmlElement
    public void setStand(Stand stand) {
        this.stand = stand;
    }

    

    @XmlElement(name = "registoProdutos")
    public void setListaProdutos(ListaProdutos listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

  

    @XmlElement(name = "registoKeywords")
    public void setListaKeywords(ListaKeywords listaKeywords) {
        this.listaKeywords = listaKeywords;
    }

    @XmlElement(name = "registoDemonstracoes")
    public void setListaDemonstracoes(ListaDemonstracoes listaDemonstracoes) {
        this.listaDemonstracoes = listaDemonstracoes;
    }

    /**
     * Devolve o contador do numero de decisoes
     *
     * @return
     */
    public int getContador() {
        return contador;
    }

    /**
     * Modifica o contador
     *
     * @param contador
     */
    @XmlElement
    public void setContador(int contador) {
        this.contador = contador;
    }


    @Override
    public int hashCode() {
        int hash = 7;
      
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
        return Objects.equals(super.getEmailRep(), other.getEmailRep());
    }

    @Override
    public String toString() {
        return String.format("Nome Empresa: %s %n E-mail: %s %n",nomeEmpresa ,super.getEmailRep());
    }

    @Override
    public boolean validaAvaliacao(Avaliacao ac) {
        //falta validação
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
        float valores = 0;
        int nAvaliacoes = 0;
        for (Avaliacao a : this.getListaAvaliacoes().getListaAvaliacao()) {
            if (a != null) {
                switch (i) {
                    case 1:
                        valores = valores + a.getRespostaTemaExpo();
                        break;
                    case 2:
                        valores = valores + a.getRespostaAdequacaoCandExposicao();
                        break;
                    case 3:
                        valores = valores + a.getRespostaAdequacaoCandDemonstracao();
                        break;
                    case 4:
                        valores = valores + a.getRespostaAdequacaoNumConvites();
                        break;
                    case 5:
                        valores = valores + a.getRespostaRecomendacaoGlobal();
                        break;
                    default:
                        break;
                }
                nAvaliacoes++;
            }
        }
        float media = 0;
        if (nAvaliacoes != 0) {
            media = (valores/nAvaliacoes);
        }
        return media;

    }

    @Override
    public boolean setRemovida() {
        return super.getEstado().setRemovida();
    }

    @Override
    public boolean valida() {
        //faltam as validações
        return true;
    }

}
