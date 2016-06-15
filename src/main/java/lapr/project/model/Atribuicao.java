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
public class Atribuicao {
    
   /**
     * FAE ao qual vai ser atribuido a candidatura.
     */
    FAE fae;
    /**
     * Candidatura que vai ser atribuida ao FAE.
     */
    Candidatura c;

    /**
     * Construtor que tem como parametros o FAE e a Candidatura.
     *
     * @param fae
     * @param c
     */
    public Atribuicao(FAE fae, Candidatura c) {
        this.fae = fae;
        this.c = c;
    }

    /**
     * Método que retorna o FAE atribuido.
     *
     * @return
     */
    public FAE getFAE() {
        return fae;
    }
    /**
     * Método que modifica o FAE atribuido.
     * @param fae
     */
    public void setFAE(FAE fae){
        this.fae=fae;
    }

    /**
     * Método que retorna a candidatura atribuida.
     *
     * @return
     */
    public Candidatura getCandidatura() {
        return c;
    }
    /**
     * Método que modifica a candidatura atribuida.
     * @param c 
     */
    public void setCandidatura(Candidatura c){
        this.c=c;
    }
    
    
    
   
}
