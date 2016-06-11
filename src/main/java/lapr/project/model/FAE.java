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
public class FAE {

    /**
     * Utilizador
     */
    private Utilizador m_oUFae;

    /**
     * Construtor sem parametros.
     */
    public FAE() {

    }

    /**
     * Construtor de um fae com os atributos recebidos por parâmetro.
     *
     * @param u
     */
    public FAE(Utilizador u) {
        this.m_oUFae = u;
    }

    /**
     * Modifica o fae.
     *
     * @param u fae
     */
    public void setUtilizador(Utilizador u) {
        this.m_oUFae = u;
    }

    /**
     * Devolve o username do fae.
     *
     * @return username
     */
    public String getID() {
        return this.m_oUFae.getUsername();
    }
    /**
     * Devolve o utilizador que é o FAE.
     * @return 
     */
    public Utilizador getUtilizador(){
        return this.m_oUFae;
    }
    
    /**
     * valida o fae.
     *
     * @return boolean
     */
    public boolean valida() {
        // Introduzir as validações aqui
        return true;
    }

    /**
     * Devolve a descrição textual do fae no formato: nome, username, mail,
     * password.
     *
     * @return carateristicas do fae
     */
    @Override
    public String toString() {
        return this.m_oUFae != null ? this.m_oUFae.toString() : null;
    }
    
    /**
     * Permite comparar um objecto/fae por parametro por outro
     * fae.
     *
     * @param fae fae
     * @return boolean
     */
    @Override
    public boolean equals(Object fae) {

        Utilizador u1 = (Utilizador) fae;
        return this.m_oUFae.getUsername().equals(u1.getUsername());
    }
}
