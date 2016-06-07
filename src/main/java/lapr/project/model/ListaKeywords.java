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
 * @author Rita
 */
public class ListaKeywords {

    /**
     * List de Keywords.
     */
    private List<Keyword> listaKeywords;

    /**
     * Construtor de uma Lista de Keywords.
     */
    public ListaKeywords() {
        this.listaKeywords = new ArrayList<>();
    }

    /**
     * Devolve a List de Keywords.
     *
     * @return List de Keywords
     */
    public List<Keyword> getListaKeywords() {
        return listaKeywords;
    }

    /**
     * Modifca a List de Keywords.
     *
     * @param listaKeywords List de Keywords
     */
    public void setListaKeywords(List<Keyword> listaKeywords) {
        this.listaKeywords = listaKeywords;
    }

    /**
     * Devolve uma nova Keyword.
     *
     * @return Keyword
     */
    public Keyword novaKeyword() {
        return new Keyword();
    }

    /**
     * Validação que devolve um boolean. True se a Keyword já existir na List.
     * False se ainda não existir.
     *
     * @param k Keyword
     * @return boolean
     */
    public boolean validaKeyword(Keyword k) {
        return listaKeywords.contains(k);
    }

    /**
     * Adiciona uma Keyword ao list e devolve um boolean. True se esta for
     * adicionado com sucesso. False se esta não for adicionada com sucesso.
     *
     * @param k Keyword
     * @return boolean
     */
    public boolean addKeyword(Keyword k) {
        return listaKeywords.add(k);
    }

    /**
     * Adiciona uma Keyword à List, apenas se esta ainda não existir na mesma.
     * Devolve um boolean, true se a operação tiver sucesso, false se não tiver
     * sucesso.
     *
     * @param k Keyword
     * @return boolean
     */
    public boolean registaKeyword(Keyword k) {
        if (validaKeyword(k) && listaKeywords.size() < 6) {
            addKeyword(k);
            return true;
        } else {
            return false;
        }
    }
}