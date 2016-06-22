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
 * Representa um Recurso, através do seu nome.
 * @author marianachilro
 */
@XmlRootElement
public class Recurso {
    /**
     * O nome do Recurso.
     */    
    private String nome;
    /**
     * O nome por omissão do Recurso.
     */
    private static final String NOME_POR_OMISSAO = "";
    
    /**
     * Contrutor de um Recurso com os parâmetros por omissão.
     */
    public Recurso(){
        this.nome=NOME_POR_OMISSAO;
    }
    
    /**
     * Contrutor de um Recurso com os parâmetros recebidos por omissão.
     * @param nome
     */
    public Recurso(String nome){
        this.nome = nome;
    }
    
    /**
     * Devolve o nome do Recurso.
     * @return
     */
    public String getNome(){
        return this.nome;
    }
    
    /**
     * Modifica o nome do Recurso.
     * @param nome
     */
    @XmlElement
    public void setNome(String nome){
        this.nome= nome;
    }
    
    public boolean valida(){
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 90 * hash + Objects.hashCode(this.nome);
        return hash;
    }

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
        final Recurso other = (Recurso) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
    
    
    
}
