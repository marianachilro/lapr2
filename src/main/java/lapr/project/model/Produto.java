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
        @XmlElement
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.nome);
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
        final Produto other = (Produto) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
    
    
}
