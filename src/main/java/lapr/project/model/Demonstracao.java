/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.Objects;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lapr.project.utils.Data;

/**
 *
 * @author Rita
 */
@XmlRootElement
public class Demonstracao implements Comparable<Demonstracao> {

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
    private DemoImpEstado estado;
    /**
     * Número de Representantes interessados em participar na Demonstração.
     */
    private int numeroInteressados;
    /**
     * data do inicio de submissoes das candidaturas da demonstração.
     */
    private Data dataInicioSubmissaoCandidaturas;
    /**
     * data do fim de submissoes das candidaturas da demonstração.
     */
    private Data dataFimSubmissaoCandidaturas;
    /**
     * data do fim de atualizações de conflitos para as candidaturas a uma
     * demonstração.
     */
    private Data dataFimAtualizacaoConflitos;
    /**
     * Lista de conflitos de uma demonstração.
     */
    private ListaConflitos listaConflitos;
    /**
     * Lista de recursos usados numa demonstração.
     */
    private ListaRecursos listaRecursos;
    /**
     * Lista de Candidaturas da demonstracao.
     */
    private ListaCandidaturasDemonstracoes listaCandidaturas;

    /**
     * Lista de atribuicoes da exposicao.
     */
    private ListaAtribuicoes listaAtribuicoes;

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
        this.numeroInteressados = 0;
        this.estado = new DemonstracaoInicialEstado(this);
        listaRecursos = new ListaRecursos();
        listaCandidaturas = new ListaCandidaturasDemonstracoes();
        listaAtribuicoes = new ListaAtribuicoes();
        listaConflitos = new ListaConflitos();
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
        this.numeroInteressados = 0;
        this.estado = new DemonstracaoInicialEstado(this);
        listaRecursos = new ListaRecursos();
        listaCandidaturas = new ListaCandidaturasDemonstracoes();
        listaAtribuicoes = new ListaAtribuicoes();
        listaConflitos = new ListaConflitos();
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
     *
     * @return o estado
     */
    public DemoImpEstado getEstado() {
        return estado;
    }

    /**
     * Devolve o número de interessados (representantes) na Demonstração.
     *
     * @return
     */
    public int getNumeroInteressados() {
        return this.numeroInteressados;
    }

    /**
     * Devolve a data do Início do período de submissão de Candidaturas à
     * Demonstração.
     *
     * @return a data do início do período de submissão de candidaturas
     */
    public Data getDataInicioSubmissaoCandidaturas() {
        return this.dataInicioSubmissaoCandidaturas;
    }

    /**
     * Devolve a data do Fim do período de submissão de Candidaturas à
     * Demonstração.
     *
     * @return a data do fim do período de submissão de candidaturas
     */
    public Data getDataFimSubmissaoCandidaturas() {
        return this.dataFimSubmissaoCandidaturas;
    }

    /**
     * Devolve a data do Fim do período de atualização de conflitos da
     * Demonstração.
     *
     * @return a data do fim do período de atualização de conflitos
     */
    public Data getDataFimAtualizacaoConflitos() {
        return this.dataFimAtualizacaoConflitos;
    }

    /**
     * Modifica o Código da Demonstração
     *
     * @param codigo Código
     */
    @XmlElement
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Modifica a Descrição da Demonstração
     *
     * @param descricao Descrição
     */
    @XmlElement
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Modifica a confirmação da Demonstração.
     *
     * @param confirmacao a confirmação da realização
     */
    @XmlElement
    public void setRealizacao(boolean confirmacao) {
        this.realizacao = confirmacao;
    }

    /**
     * Modifica o estado da Demonstração.
     *
     * @param estado o novo estado
     */
    @XmlElement
    public void setEstado(DemoImpEstado estado) {
        this.estado = estado;
    }

    /**
     * Modifica o número de interessados na Demonstração.
     *
     * @param num
     */
    @XmlElement
    public void setNumeroInteressados(int num) {
        this.numeroInteressados = num;
    }

    /**
     * Modifica a data de Início do período de submissão e candidaturas à
     * Demonstração.
     *
     * @param data a nova data de início do período de submissão
     */
    @XmlElement
    public void setDataInicioSubmissaoCandidaturas(Data data) {
        this.dataInicioSubmissaoCandidaturas = data;
    }

    /**
     * Modifica a data de Fim do período de submissão e candidaturas à
     * Demonstração.
     *
     * @param data a nova data de fim do período de submissão
     */
    @XmlElement
    public void setDataFimSubmissaoCandidaturas(Data data) {
        this.dataFimSubmissaoCandidaturas = data;
    }

    /**
     * Modifica a data de Fim do período de atualização de conflitos da
     * Demonstração.
     *
     * @param data a nova data de fim de atualização de conflitos
     */
    @XmlElement
    public void setDataFimAtualizacaoConflitos(Data data) {
        this.dataFimAtualizacaoConflitos = data;
    }

    public ListaConflitos getListaConflitos() {
        return listaConflitos;
    }

    public ListaCandidaturasDemonstracoes getListaCandidaturas() {
        return listaCandidaturas;
    }

    public ListaAtribuicoes getListaAtribuicoes() {
        return this.listaAtribuicoes;
    }


    public boolean valida() {
        if (codigo == null || descricao == null) {
            throw new IllegalArgumentException("Demonstração inválida!");
        }
        return true;
    }

    public ListaRecursos getListaRecursos() {
        return listaRecursos;
    }

    @XmlElement(name = "registoRecursos")
    public void setListaRecursos(ListaRecursos listaRecursos) {
        this.listaRecursos = listaRecursos;
    }

    @Override
    public int compareTo(Demonstracao d) {
        return this.numeroInteressados - d.numeroInteressados;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.codigo);
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
        final Demonstracao other = (Demonstracao) obj;

        return this.codigo.equals(other.codigo);
    }

    @XmlElement(name = "registoConflitos")
    public void setListaConflitos(ListaConflitos listaConflitos) {
        this.listaConflitos = listaConflitos;
    }

    @XmlElement(name = "registoCandidaturas")
    public void setListaCandidaturas(ListaCandidaturasDemonstracoes listaCandidaturas) {
        this.listaCandidaturas = listaCandidaturas;
    }

    @XmlElement(name = "registoAtribuicoes")
    public void setListaAtribuicoes(ListaAtribuicoes listaAtribuicoes) {
        this.listaAtribuicoes = listaAtribuicoes;
    }
    
    @Override
    public String toString() {
        return String.format("Código: %s %n Descrição: %s %n", codigo, descricao);
    }

}
