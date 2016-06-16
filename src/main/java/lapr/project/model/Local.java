/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author catarinarib
 */
public class Local {

    private String nome;
    private static final String NOME_OMISSAO = "";

    public Local() {
        this.nome = NOME_OMISSAO;
    }

    /**
     * Construtor Local
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
