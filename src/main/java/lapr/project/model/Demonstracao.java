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
public class Demonstracao {

    /**
     * Código único de Demonstração.
     */
    private String codigo;
    /**
     * Descrição de Demonstração.
     */
    private String descricao;
    /**
     * A confirmação de que a Demonstração se vai realizar.
     */
    private boolean realizacao;
    /**
     * O estado da Demonstração.
     */
    private DemonstracaoEstado estado;
    
    private Date dataInicioSubmissaoCandidaturas;
    
    private Date dataFimSubmissaoCandidaturas;
    
    private Date dataFimAtualizacaoConflitos;
    /**
     * Lista de Candidaturas da demonstracao.
     */
    private final ListaCandidaturasDemonstracoes listaCandidaturas;

    /**
     * Lista de atribuicoes da exposicao.
     */
    private final ListaAtribuicoes listaAtribuicoes;

    /**
     * Valor do código de Demonstração por omissão.
     */
    private static final String CODIGO_OMISSAO = "";
    /**
     * Valor da descrição de Demonstração por omissão.
     */
    private static final String DESCRICAO_OMISSAO = "";

    /**
     * Construtor de uma Demonstração com todos os atributos por omissão.
     */
    public Demonstracao() {
        this.codigo = CODIGO_OMISSAO;
        this.descricao = DESCRICAO_OMISSAO;
        this.realizacao = false;
        listaCandidaturas = new ListaCandidaturasDemonstracoes();
        listaAtribuicoes = new ListaAtribuicoes();
    }

    /**
     * Construtor de uma Demonstração com todos os atributos recebidos por
     * parâmetro.
     *
     * @param codigo Código Único
     * @param descricao Descrição
     */
    public Demonstracao(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.realizacao = false;
        listaCandidaturas = new ListaCandidaturasDemonstracoes();
        listaAtribuicoes = new ListaAtribuicoes();
    }

    /**
     * Devolve o código da Demonstração.
     *
     * @return Código
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Devolve a Descrição da Demonstração
     *
     * @return Descrição
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Devolve a confirmação da realização da Demonstração.
     *
     * @return true se se for realizar e false, caso contrário
     */
    public boolean getRealizacao() {
        return this.realizacao;
    }
    /**
     * Devolve o estado da Demonstração.
     * @return o estado
     */
    public DemonstracaoEstado getEstado(){
        return estado;
    }
    /**
     * Devolve a data do Início do período de submissão de Candidaturas à Demonstração.
     * @return a data do início do período de submissão de candidaturas
     */
    public Date getDataInicioSubmissaoCandidaturas(){
        return this.dataInicioSubmissaoCandidaturas;
    }
    /**
     * Devolve a data do Fim do período de submissão de Candidaturas à Demonstração.
     * @return a data do fim do período de submissão de candidaturas
     */
    public Date getDataFimSubmissaoCandidaturas(){
        return this.dataFimSubmissaoCandidaturas;
    }
    /**
     * Devolve a data do Fim do período de atualização de conflitos da Demonstração.
     * @return a data do fim do período de atualização de conflitos
     */
    public Date getDataFimAtualizacaoConflitos(){
        return this.dataFimAtualizacaoConflitos;
    }

    /**
     * Modifica o Código da Demonstração
     *
     * @param codigo Código
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Modifica a Descrição da Demonstração
     *
     * @param descricao Descrição
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Modifica a confirmação da Demonstração.
     *
     * @param confirmacao a confirmação da realização
     */
    public void setRealizacao(boolean confirmacao) {
        this.realizacao = confirmacao;
    }
    /**
     * Modifica o estado da Demonstração.
     * @param estado o novo estado
     */
    public void setEstado(DemonstracaoEstado estado){
        this.estado = estado;
    }
    /**
     * Modifica a data de Início do período de submissão e candidaturas à Demonstração.
     * @param data a nova data de início do período de submissão
     */
    public void setDataInicioSubmissaoCandidaturas(Date data){
        this.dataInicioSubmissaoCandidaturas=data;
    }
    /**
     * Modifica a data de Fim do período de submissão e candidaturas à Demonstração.
     * @param data a nova data de fim do período de submissão
     */
    public void setDataFimSubmissaoCandidaturas(Date data){
        this.dataFimSubmissaoCandidaturas=data;
    }
    /**
     * Modifica a data de Fim do período de atualização de conflitos da Demonstração.
     * @param data a nova data de fim de atualização de conflitos
     */
    public void setDataFimAtualizacaoConflitos(Date data){
        this.dataFimAtualizacaoConflitos=data;
    }

    public ListaCandidaturasDemonstracoes getListaCandidaturas() {
        return listaCandidaturas;
    }
    
    public ListaAtribuicoes getListaAtribuicoes(){
        return this.listaAtribuicoes;
    }

    /**
     * Devolve a lista de atribuicoes da exposição.
     *
     * @return lista de atribuicoes
     */
    public List<Candidatura> getListaAtribuicoesFAE(FAE fae) {
        return listaAtribuicoes.getListaCandidaturasFAE(fae);
    }
    
    public boolean valida(){
        if(codigo == null || descricao == null){
            throw new IllegalArgumentException("Demonstração inválida!");
        }
        return true;
    }

}
