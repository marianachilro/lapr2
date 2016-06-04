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
public class Produto {

    /**
     * Nome de Produto.
     */
    private String nome;
    /**
     * Nome de Produto por omissão.
     */
    private static final String NOME_OMISSAO = "";

    /**
     * Construtor de um Produto com os atributos por omissão.
     */
    public Produto() {
        this.nome = NOME_OMISSAO;
    }

    /**
     * Construtor de um Produto com os atributos recebidos por parâmetro.
     *
     * @param nome Nome de Produto
     */
    public Produto(String nome) {
        this.nome = nome;
    }

    /**
     * Devolve o Nome de Produto.
     *
     * @return Nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Modifica o Nome de Produto.
     *
     * @param nome Nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}
