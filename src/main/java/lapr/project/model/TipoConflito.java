/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;

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
    /**
     * Lista de Mecanismos que consegue detetar o Tipo de Conflito.
     */
    private final List <MecanismoDetecaoConflito> listaMecanismos;

    public TipoConflito(){
        nome = "";
        dados = "";
        this.listaMecanismos= new ArrayList<>();
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
     * Devolve a lista de Mecanismo de Deteção do Tipo de Conflito.
     * @return lista de mecanismos de deteção
     */
    public List <MecanismoDetecaoConflito> getListaMecanismos(){
        return this.listaMecanismos;
    }

    /**
     * método que verifica se os atributos do tipo de conflito estão vazios.
     *
     * @return
     */
    public boolean valida() {
        return !(nome.isEmpty() || dados.isEmpty());

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
        if(tipo!=null){
        if (this == tipo) {
            return true;

        } else if (this.nome.equalsIgnoreCase(tipo.getNome()) && this.dados.equalsIgnoreCase(tipo.getDados())) {
            return true;
        }
        }
        return false;
    }

}
