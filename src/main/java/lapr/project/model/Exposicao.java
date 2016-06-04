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
    private String dataInicio;
    /**
     * Data de fim da Exposição.
     */
    private String dataFim;
    /**
     * Local da Exposição.
     */
    private String local;
    /**
     * Lista de Organizadores da Exposição
     */
    private final ListaOrganizadores listaOrg;
    /**
     * Lista de Candidaturas da Exposição.
     */
    private final ListaCandidaturas listaCandidaturas;
    /**
     * Lista de Demonstrações da Exposição.
     */
    private final ListaDemonstracoes listaDemonstracoes;
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
        this.dataInicio = DATA_INICIO_OMISSAO;
        this.dataFim = DATA_FIM_OMISSAO;
        this.local = LOCAL_OMISSAO;
        listaOrg = new ListaOrganizadores();
        listaCandidaturas = new ListaCandidaturas();
        listaDemonstracoes = new ListaDemonstracoes();
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
     */
    public Exposicao(String titulo, String descricao, String dataInicio, String dataFim, String local) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.local = local;
        listaOrg = new ListaOrganizadores();
        listaCandidaturas = new ListaCandidaturas();
        listaDemonstracoes = new ListaDemonstracoes();
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
    public String getDataInicio() {
        return dataInicio;
    }

    /**
     * Devolve a Data de Fim da Exposição.
     *
     * @return Data de Fim
     */
    public String getDataFim() {
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
    public ListaCandidaturas getListaCandidaturas() {
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
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Modifica a Descrição da Exposição.
     *
     * @param descricao Descrição
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Modifica a Data de Inicio da Exposição.
     *
     * @param dataInicio Data de Inicio
     */
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * Modifica a Data de Fim da Exposição
     *
     * @param dataFim Data de Fim
     */
    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    /**
     * Modifica o Local da Exposição.
     *
     * @param local Local
     */
    public void setLocal(String local) {
        this.local = local;
    }

}
