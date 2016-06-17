/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author catarinarib
 */
@XmlRootElement
public class Local {

    /**
     * nome do local.
     */
    @XmlElement
    private String nome;

    private static final String NOME_OMISSAO = "";

    public Local() {
        this.nome = NOME_OMISSAO;
    }

    /**
     * Construtor Local
     * @param nome
     */
    public Local(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return String.format("Local: %s", nome);
    }
}
