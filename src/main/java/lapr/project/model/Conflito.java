/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author marianachilro
 */
class Conflito {
    
     /**
     * FAE do Conflito.
     */
    FAE fae;
    /**
     * Candidatura do Conflito.
     */
    Candidatura c;

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
    
    
    
}
