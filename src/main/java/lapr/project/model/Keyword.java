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
public class Keyword {

    /**
     * Palavra referente à Keyword.
     */
    private String palavra;
    /**
     * Palavra referente à Keyword por omissão.
     */
    private static final String PALAVRA_OMISSAO = "";

    /**
     * Construtor de uma Keyword com a Palavra referente à Keyword por omissão.
     */
    public Keyword() {
        this.palavra = PALAVRA_OMISSAO;
    }

    /**
     * Construtor de uma Keyword com a Palavra referente à Keyword recebida por
     * parâmetro.
     *
     * @param palavra Palavra
     */
    public Keyword(String palavra) {
        this.palavra = palavra.toLowerCase().trim();
    }

    /**
     * Devolve a Palavra referente à Keyword
     *
     * @return Palavra
     */
    public String getPalavra() {
        return palavra;
    }

    /**
     * Modifica a Palavra referente à Keyword.
     *
     * @param palavra Palavra
     */
    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Keyword)) {
            return false;
        }

        Keyword that = (Keyword) o;

        return getPalavra().equals(that.getPalavra());

    }

    @Override
    public int hashCode() {
        return getPalavra().hashCode();
    }
}
