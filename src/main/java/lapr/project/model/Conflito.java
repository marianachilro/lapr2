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
 * @author marianachilro
 */
@XmlRootElement
public class Conflito {
    
     /**
     * FAE do Conflito.
     */
    @XmlElement
    FAE fae;
    /**
     * Candidatura do Conflito.
     */
    @XmlElement(name="candidatura")
    Candidatura c;
    @XmlElement(name="tipoConflito")
    TipoConflito tipo;

    /**
     * Construtor que tem como parametros o FAE e a Candidatura.
     *
     * @param fae
     * @param c
     */
    public Conflito(FAE fae, Candidatura c) {
        this.fae = fae;
        this.c = c;
    }
    /**
     * Construtor que tem como parametro um Conflito (Construtor Cópia).
     *
     *
     * @param c o conflito que se quer copiar
     */
    public Conflito(Conflito c){
        this.fae=c.getFAE();
        this.c=c.getCandidatura();
    }
    /**
     * Contrutor vazio.
     */
    public Conflito(){
        
    }

    /**
     * Método que retorna o FAE do Conflito.
     *
     * @return
     */
    public FAE getFAE() {
        return fae;
    }

    /**
     * Método que retorna a candidatura do Conflito.
     *
     * @return
     */
    public Candidatura getCandidatura() {
        return c;
    }
    /**
     * Devolve o tipo do conflito de interesse.
     * @return o tipo do conflito
     */
    public TipoConflito getTipo(){
        return tipo;
    }
    /**
     * Modifica o FAE do Conflito.
     * @param f o novo FAE
     */
    public void setFAE(FAE f){
        this.fae=f;
    }
    /**
     * Modifica a Candidatura do Conflito.
     * @param c a nova candidatura do conflito
     */
    public void setCandidaturas(Candidatura c){
        this.c=c;
    }
    /**
     * Modifica o tipo do conflito.
     * @param tipo o novo tipo do conflito
     */
    public void setTipo(TipoConflito tipo){
        this.tipo=tipo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.fae);
        hash = 53 * hash + Objects.hashCode(this.c);
        hash = 53 * hash + Objects.hashCode(this.tipo);
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
        final Conflito other = (Conflito) obj;
        if (!Objects.equals(this.fae, other.fae)) {
            return false;
        }
        if (!Objects.equals(this.c, other.c)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
