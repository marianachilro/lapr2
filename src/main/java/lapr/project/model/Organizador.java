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
public class Organizador {

    /**
     * Utilizador correspondente ao Organizador.
     */
    private Utilizador u;

    /**
     * Construtor de um Organizador com o Utilizador ainda nulo.
     */
    public Organizador() {
        u = null;
    }

    /**
     * Construtor de um Organizador com o Utilizador recebido por parâmetro.
     *
     * @param u Utilizador
     */
    public Organizador(Utilizador u) {
        this.u = u;
    }

    /**
     * Devolve o Utilizador.
     *
     * @return Utilizador.
     */
    public Utilizador getU() {
        return u;
    }

    /**
     * Modifica o Utilizador.
     *
     * @param u Utilizador
     */
    public void setU(Utilizador u) {
        this.u = u;
    }

}
