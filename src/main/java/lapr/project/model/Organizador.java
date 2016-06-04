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
public class Organizador {

    /**
     * Utilizador.
     */
    private Utilizador m_oUtilizador;

    /**
     * Construtor de um Organizador com os atributos recebidos por parâmetro.
     *
     * @param u utilizador
     */
    public Organizador(Utilizador u) {
        this.m_oUtilizador = u;
    }

    public Organizador() {

    }

    /**
     * Modifica o organizador.
     *
     * @param u novo organizador
     */
    public void setUtilizador(Utilizador u) {
        this.m_oUtilizador = u;
    }

    /**
     * Valida o organizador.
     *
     * @return boolean
     */
    public boolean valida() {
        // Introduzir as validações aqui
        return true;
    }

    /**
     * Devolve a descrição textual do organizador no formato: nome, username,
     * mail, password.
     *
     * @return carateristicas do organizador
     */
    @Override
    public String toString() {
        return this.m_oUtilizador.toString();
    }

    /**
     * Verificar se é um utilizador.
     *
     * @param u utilizador
     * @return boolean
     */
    public boolean isUtilizador(Utilizador u) {
        if (this.m_oUtilizador != null) {
            return this.m_oUtilizador.equals(u);
        }
        return false;
    }

    /**
     * Devolve o username do organizador.
     *
     * @return username
     */
    public String getID() {
        return this.m_oUtilizador.getUsername();
    }

    /**
     * Devolve o utilizador
     *
     * @return utilizador
     */
    public Utilizador getUtilizador() {
        return m_oUtilizador;
    }

    /**
     * Permite comparar um objecto/organizador por parametro por outro
     * organizador.
     *
     * @param o organizador
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {

        Utilizador u1 = (Utilizador) o;
        if (this.m_oUtilizador.getUsername().equals(u1.getUsername())) {
            return true;
        }
        return false;
    }
}
