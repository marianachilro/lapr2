/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author miniondevil
 */
@XmlRootElement
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
    private List<Object> listaMecanismos;

    public TipoConflito() {
        nome = "";
        dados = "";
        this.listaMecanismos = new ArrayList<>();
    }

    /**
     * Método que modifica o nome do tipo de conflito.
     *
     * @param nome
     */
    @XmlElement
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método que modifica os dados do tipo de conflito.
     *
     * @param dados
     */
    @XmlElement
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
     *
     * @return lista de mecanismos de deteção
     */
    public List<Object> getListaMecanismos() {
        return this.listaMecanismos;
    }

    /**
     * Método que modifica a lista de mecanismos.
     *
     * @param listaMecanismos
     */
    @XmlElement(name = "mecanismosConfitos")
    public void setListaMecanismos(List<Object> listaMecanismos) {
        this.listaMecanismos = listaMecanismos;
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
        if (t == null) {
            return false;
        }

        if (this.getClass() != t.getClass()) {
            return false;
        }
        TipoConflito tipo = (TipoConflito) t;

        return this.nome.equalsIgnoreCase(tipo.getNome()) && this.dados.equalsIgnoreCase(tipo.getDados());
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.nome);
        hash = 37 * hash + Objects.hashCode(this.dados);
        return hash;
    }

}
