/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rita
 */
@XmlRootElement
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

    public ListaKeywords(ListaKeywords lista) {
        this.listaKeywords = new ArrayList<>(lista.getListaKeywords());
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
    @XmlElement(name = "keywords")
    public void setListaKeywords(List<Keyword> listaKeywords) {
        this.listaKeywords = new ArrayList<>(listaKeywords);
    }

    /**
     * Devolve uma nova Keyword.
     *
     * @return Keyword
     */
    public Keyword novaKeyword(String keyword) {
        return new Keyword(keyword);
    }

    /**
     * Validação que devolve um boolean. True se a Keyword já existir na List.
     * False se ainda não existir.
     *
     * @param k Keyword
     * @return boolean
     */
    public boolean validaKeyword(Keyword k) {
        if (!listaKeywords.isEmpty()) {
            return listaKeywords.contains(k);
        } else {
            return false;
        }
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
        if (!(validaKeyword(k)) && tamanho() < 6) {
            addKeyword(k);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Devolve o número de keywords na lista
     *
     * @return Número de keywords da lista
     */
    public int tamanho() {
        return listaKeywords.size();
    }
}
