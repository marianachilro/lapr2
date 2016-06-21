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
     @XmlElement(name = "utilizador")
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

    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.m_oUtilizador);
        return hash;
    }

    /**
     * Permite comparar um objecto/organizador por parametro por outro
     * organizador.
     *
     * @param obj organizador
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Organizador other = (Organizador) obj;
        if (!Objects.equals(this.m_oUtilizador, other.m_oUtilizador)) {
            return false;
        }
        return true;
    }

    
    
}
