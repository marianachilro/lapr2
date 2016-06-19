/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.Objects;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author catarinarib
 */
@XmlRootElement
public class FAE {

    /**
     * Utilizador
     */
    @XmlElement(name = "utilizador")
    private Utilizador m_oUFae;

    /**
     * Construtor sem parametros.
     */
    public FAE() {
        m_oUFae = new Utilizador();
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
     *
     * @return
     */
    public Utilizador getUtilizador() {
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
     * Permite comparar um objecto/fae por parametro por outro fae.
     *
     * @param fae fae
     * @return boolean
     */
    @Override
    public boolean equals(Object fae) {

        if (fae == null) {
            return false;
        }

        if (this.getClass() != fae.getClass()) {
            return false;
        }

        FAE f1 = (FAE) fae;

        return this.m_oUFae.getUsername().equals(f1.getUtilizador().getUsername());
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.m_oUFae);
        return hash;
    }
}
