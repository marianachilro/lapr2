/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Rita
 */
public class Exposicao {

    /**
     * Título da Exposição
     */
    private String titulo;
    /**
     * Descrição da Exposição.
     */
    private String descricao;
    /**
     * Data de inicio da Exposição.
     */
    private Date dataInicio;
    /**
     * Data de fim da Exposição.
     */
    private Date dataFim;
    /**
     * Local da Exposição.
     */
    private String local;

    /**
     * Data final de submissao de candidaturas;
     */
    private Date dataFimSubCand;
    /**
     * Data final de atualização de conflitos.
     */
    private Date dataFimAtcConf;

    /**
     * Data final de avaliação de candidaturas.
     */
    private Date dataFimAvCandidatura;

    /**
     * Data final de decidir candidaturas.
     */
    private Date dataFimDcCandidaturas;
    /**
     * Lista de Organizadores da Exposição
     */
    private final ListaOrganizadores listaOrg;
    /**
     * Lista de Candidaturas da Exposição.
     */
    private final ListaCandidaturasExposicoes listaCandidaturas;
    /**
     * Lista de Demonstrações da Exposição.
     */
    private final ListaDemonstracoes listaDemonstracoes;

    /**
     * Lista de FAEs da exposicao.
     */
    private final ListaFAEs listaFAEs;
    
    /**
     * Lista de atribuicoes da exposicao.
     */
    private final ListaAtribuicoes listaAtribuicoes;

    /**
     * Valor do Título de Exposição por omissão.
     */
    private static final String TITULO_OMISSAO = "";
    /**
     * Valor da Descrição da Exposição por omissão.
     */
    private static final String DESCRICAO_OMISSAO = "";
    /**
     * Valor da Data de Inicio da Exposição por omissão.
     */
    private static final String DATA_INICIO_OMISSAO = "";
    /**
     * Valor da Data de Fim da Exposição por omissão.
     */
    private static final String DATA_FIM_OMISSAO = "";
    /**
     * Valor do Local da Exposição por omissão.
     */
    private static final String LOCAL_OMISSAO = "";

    /**
     * Construtor de uma Exposição com todos os atributos por omissão.
     */
    public Exposicao() {
        this.titulo = TITULO_OMISSAO;
        this.descricao = DESCRICAO_OMISSAO;
        this.dataInicio = null;
        this.dataFim = null;
        this.dataFimSubCand = null;
        this.dataFimAtcConf = null;
        this.dataFimAvCandidatura = null;
        this.dataFimDcCandidaturas = null;
        this.local = LOCAL_OMISSAO;
        listaOrg = new ListaOrganizadores();
        listaCandidaturas = new ListaCandidaturasExposicoes();
        listaDemonstracoes = new ListaDemonstracoes();
        listaFAEs = new ListaFAEs();
        listaAtribuicoes= new ListaAtribuicoes();
    }

    /**
     * Construtor de uma Exposição com todos os atributos recebidos por
     * parâmetro.
     *
     * @param titulo Título de Exposição
     * @param descricao Descrição da Exposição
     * @param dataInicio Data de Inicio da Exposição
     * @param dataFim Data de Fim da Exposição
     * @param local Local da Exposição.
     * @param dataFimSubCand Data fim de submissao de candidaturas
     * @param dataFimAtcConf Data fim de atualização de conflitos
     * @param dataFimDcCandidaturas Data fim de decidir candidaturas
     * @param dataFimAvCandidatura Data fim de avaliar candidaturas
     */
    public Exposicao(String titulo, String descricao, Date dataInicio, Date dataFim, String local, Date dataFimSubCand,
            Date dataFimAtcConf, Date dataFimAvCandidatura, Date dataFimDcCandidaturas) {

        setTitulo(titulo);
        setDescricao(descricao);
        setDataInicio(dataInicio);
        setDataFim(dataFim);
        setLocal(local);
        setDataFimSubCand(dataFimSubCand);
        setDataFimAtcConf(dataFimAtcConf);
        setDataFimAvCandidatura(dataFimAvCandidatura);
        setDataFimDcCandidaturas(dataFimDcCandidaturas);
        listaOrg = new ListaOrganizadores();
        listaCandidaturas = new ListaCandidaturasExposicoes();
        listaDemonstracoes = new ListaDemonstracoes();
        listaFAEs = new ListaFAEs();
        listaAtribuicoes= new ListaAtribuicoes();
    }

    /**
     * Devolve o Título de Exposição.
     *
     * @return Título
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Devolve a Descrição da Exposição.
     *
     * @return Descrição
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Devolve a Data de Inicio da Exposição
     *
     * @return Data de Inicio
     */
    public Date getDataInicio() {
        return dataInicio;
    }

    /**
     * Devolve a Data de Fim da Exposição.
     *
     * @return Data de Fim
     */
    public Date getDataFim() {
        return dataFim;
    }

    /**
     * Devolve o Local da Exposição.
     *
     * @return Local
     */
    public String getLocal() {
        return local;
    }

    /**
     * Devolve a Lista de Candidaturas da Exposição.
     *
     * @return Lista de Candidaturas
     */
    public ListaCandidaturasExposicoes getListaCandidaturas() {
        return listaCandidaturas;
    }

    /**
     * Devolve a Lista de Organizadores da Exposição.
     *
     * @return Lista de Organizadores
     */
    public ListaOrganizadores getListaOrganizadores() {
        return listaOrg;
    }

    /**
     * Devolve a Lista de Demonstrações da Exposição.
     *
     * @return Lista de Demonstrações
     */
    public ListaDemonstracoes getListaDemonstracoes() {
        return listaDemonstracoes;
    }

    /**
     * Modifica o Título da Exposição
     *
     * @param titulo Título
     */
    public final void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Título inválido!");
        }
        this.titulo = titulo;
    }

    /**
     * Modifica a Descrição da Exposição.
     *
     * @param descricao Descrição
     */
    public final void setDescricao(String descricao) {
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("Descrição inválida!");
        }
        this.descricao = descricao;
    }

    /**
     * Modifica a Data de Inicio da Exposição.
     *
     * @param dataInicio Data de Inicio
     */
    public final void setDataInicio(Date dataInicio) {
        if (dataInicio == null) {
            throw new IllegalArgumentException("Data inválida!");
        }
        this.dataInicio = dataInicio;
    }

    /**
     * Modifica a Data de Fim da Exposição
     *
     * @param dataFim Data de Fim
     */
    public final void setDataFim(Date dataFim) {
        if (dataFim == null) {
            throw new IllegalArgumentException("Data inválida!");
        }
        this.dataFim = dataFim;
    }

    /**
     * Modifica o Local da Exposição.
     *
     * @param local Local
     */
    public final void setLocal(String local) {
        if (local == null || local.trim().isEmpty()) {
            throw new IllegalArgumentException("Local inválido!");
        }
        this.local = local;
    }

    /**
     * Devolve a data fim de submisao de candidaturas
     *
     * @return data fim de submissao de candidaturas
     */
    public Date getDataFimSubCand() {
        return dataFimSubCand;
    }

    /**
     * Modifica a data fim de submisao de candidaturas
     *
     * @param dataFimSubCand data fim de submisao de candidaturas
     */
    public final void setDataFimSubCand(Date dataFimSubCand) {
        if (dataFimSubCand == null) {
            throw new IllegalArgumentException("Data inválida!");
        }
        this.dataFimSubCand = dataFimSubCand;
    }

    /**
     * Devolve a data fim de atualização de conflitos
     *
     * @return data fim de atualização de conflitos
     */
    public Date getDataFimAtcConf() {
        return dataFimAtcConf;
    }

    /**
     * Modifica a data fim de atualização de conflitos
     *
     * @param dataFimAtcConf data fim de atualização de conflitos
     */
    public final void setDataFimAtcConf(Date dataFimAtcConf) {
        if (dataFimAtcConf == null) {
            throw new IllegalArgumentException("Data inválida!");
        }
        this.dataFimAtcConf = dataFimAtcConf;
    }

    /**
     * Devolve a data fim de avaliar candidaturas
     *
     * @return data fim de avaliar candidaturas
     */
    public Date getDataFimAvCandidatura() {
        return dataFimAvCandidatura;
    }

    /**
     * Modifica a data fim de avaliar candidaturas
     *
     * @param dataFimAvCandidatura data fim de avaliar candidaturas
     */
    public final void setDataFimAvCandidatura(Date dataFimAvCandidatura) {
        if (dataFimAvCandidatura == null) {
            throw new IllegalArgumentException("Data inválida!");
        }
        this.dataFimAvCandidatura = dataFimAvCandidatura;
    }

    /**
     * Devolve a data fim de decidir candidaturas
     *
     * @return data fim de decidir candidaturas
     */
    public Date getDataFimDcCandidaturas() {
        return dataFimDcCandidaturas;
    }

    /**
     * Modifica a data fim de decidir candidaturas
     *
     * @param dataFimDcCandidaturas data fim de decidir candidaturas
     */
    public final void setDataFimDcCandidaturas(Date dataFimDcCandidaturas) {
        if (dataFimDcCandidaturas == null) {
            throw new IllegalArgumentException("Data inválida!");
        }
        this.dataFimDcCandidaturas = dataFimDcCandidaturas;
    }

    /**
     * Adiciona organizador à lista de organizadores da exposição.
     *
     * @param u utilizador/organizador
     */
    public void addOrganizador(Utilizador u) {
        Organizador org = new Organizador();
        org.setUtilizador(u);
        if (listaOrg.validaOrganizador(org)) {
            addOrganizador(org);
        }
    }

    /**
     * Adiciona organizador à lista de organizadores da exposição.
     *
     * @param o organizador
     * @return lista de organizadores
     */
    private boolean addOrganizador(Organizador o) {
        return this.listaOrg.add(o);
    }

    /**
     * Devolve fae da exposição
     *
     * @param u utilizador
     * @return fae da exposicao
     */
    public FAE getFAE(Utilizador u) {
        for (FAE fae : listaFAEs.getListaFAEs()) {
            if (fae.equals(u)) {
                return fae;
            }
        }

        return null;
    }
    
    /**
     * Devolve a lista de atribuicoes da exposição.
     * @return lista de atribuicoes
     */
    public List<Candidatura> getListaAtribuicoesFAE(FAE fae){
        return listaAtribuicoes.getListaCandidaturasFAE(fae);
    }
}
