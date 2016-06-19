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
 * @author catarinarib
 */
@XmlRootElement
public class ListaAtribuicoes {

    /**
     * lista com as atribuições de uma dada exposição.
     */
    @XmlElement
    List<Atribuicao> la;

    /**
     * construtor sem parâmetros.
     */
    public ListaAtribuicoes() {
        la = new ArrayList<>();
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
    public boolean validateAtribuicoes(Atribuicao a) {
        if (tamanho() > 0) {
            return la.contains(a);
        } else {
            return false;
        }
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

    /**
     * Devolve a lista de candidaturas do fae
     *
     * @param fae fae
     * @return lista de candidaturas
     */
    public List<Candidatura> getListaCandidaturasFAE(FAE fae) {
        List<Candidatura> lc = new ArrayList<>();

        if (!la.isEmpty()) {
            for (Atribuicao a : la) {
                if (a.getFAE().equals(fae)) {
                    lc.add(a.getCandidatura());
                }
            }
        }
        return lc;
    }

    /**
     * Verificar se existe fae na lista de atribuicoes
     *
     * @param fae fae
     * @return boolean
     */
    public boolean verificarSeContemFAE(FAE fae) {
        for (Atribuicao a : la) {
            if (a.getFAE().equals(fae)) {
                return true;
            }
        }
        return false;
    }

    public int tamanho() {
        return la.size();
    }
}
