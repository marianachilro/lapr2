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

}
