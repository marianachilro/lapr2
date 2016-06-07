/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author miniondevil
 */
public class TipoConflito {

    /**
     * nome do tipo de conflito.
     */
    private String nome;
    /**
     * dados sobre o tipo de conflito.
     */
    private String dados;

    public TipoConflito(){
        nome = "";
        dados = "";
    }
    /**
     * Método que modifica o nome do tipo de conflito.
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método que modifica os dados do tipo de conflito.
     *
     * @param dados
     */
    public void setDados(String dados) {
        this.dados = dados;
    }

    /**
     * Método que retorna o nome do tipo de conflito.
     *
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método que retorna os dados do tipo de conflito.
     *
     * @return
     */
    public String getDados() {
        return dados;
    }

    /**
     * método que verifica se os atributos do tipo de conflito estão vazios.
     *
     * @return
     */
    public boolean valida() {
        if (nome.isEmpty() || dados.isEmpty()) {
            return false;
        }
        return true;

    }

    /**
     * Método que verifica se este tipo de conflito é igual ao recebido por
     * parâmetro.
     *
     * @param t
     * @return
     */
    @Override
    public boolean equals(Object t) {
        TipoConflito tipo = (TipoConflito) t;
        if (this == tipo) {
            return true;

        } else if (this.nome.equalsIgnoreCase(tipo.getNome()) && this.dados.equalsIgnoreCase(tipo.getDados())) {
            return true;
        }
        return false;
    }

}