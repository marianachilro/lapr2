/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author catarinarib
 */
public class ListaAtribuicoes {
    
    /**
     * lista com as atribuições de uma dada exposição.
     */
    List<Atribuicao> la;

    /**
     * construtor sem parâmetros.
     */
    public ListaAtribuicoes() {
        la = new ArrayList<Atribuicao>();
    }

    /**
     * Método que guarda e retorna a lista de atribuições definitiva.
     *
     * @param la
     * @return lista definitiva de atribuições.
     */
    public List registerAtribuicoes(List la) {
        this.la = la;
        return la;
    }

    /**
     * Método que retorna uma nova atribuição.
     *
     * @param c
     * @param fae
     * @return atribuicao
     */
    public Atribuicao newAtribuicao(Candidatura c, FAE fae) {
        return new Atribuicao(fae, c);
    }

    /**
     * Método que valida uma atribuição.
     *
     * @return
     */
    public boolean validateAtribuicoes() {
        //inserir validacoes.
        return true;
    }

    /**
     * Método que retorna uma lista com as atribuições feitas.
     *
     * @return
     */
    public List<Atribuicao> getLista() {
        return la;
    }

    /**
     * Método que atualiza a lista de atribuições.
     *
     * @param la
     */
    public void setLista(List<Atribuicao> la) {
        this.la = la;
    }
}
