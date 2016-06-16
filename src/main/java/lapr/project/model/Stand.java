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
public class Stand {

    /**
     * Descricao do stand
     */
    private String descricao;

    /**
     * Descricao por omissao
     */
    private static final String DESCRICAO_OMISSAO = "";

    /**
     * Contrutuor de um Stand comos parametros por omissao
     */
    public Stand() {
        this.descricao = DESCRICAO_OMISSAO;
    }

    /**
     * Construtor de um Stand.
     *
     * @param descricao descricao do stand
     */
    public Stand(String descricao) {
        setDescricao(descricao);
    }

    /**
     * Devolve a descriçao do stand
     *
     * @return descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Modifica a descrição do stand
     *
     * @param descricao descrição do stand
     */
    public final void setDescricao(String descricao) {
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("Descrição é inválida!");
        }
        this.descricao = descricao;
    }

    /**
     * Devolve a descrição textual do stand no formato: descricao
     *
     * @return
     */
    @Override
    public String toString() {
        return String.format("Stand: %s %n",descricao);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.descricao);
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
        final Stand other = (Stand) obj;
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        return true;
    }
    
    

}
