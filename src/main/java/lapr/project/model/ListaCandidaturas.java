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
public class ListaCandidaturas {

    /**
     * List com Candidaturas.
     */
    private List<Candidatura> listaCandidaturas;

    /**
     * Construtor de uma Lista de Candidaturas.
     */
    public ListaCandidaturas() {
        this.listaCandidaturas = new ArrayList<>();
    }

    /**
     * Devolve o List de Candidaturas.
     *
     * @return List de Candidaturas
     */
    public List<Candidatura> getListCandidaturas() {
        return listaCandidaturas;
    }

    /**
     * Modifica o List de Candidaturas
     *
     * @param listaCandidaturas List de Candidaturas
     */
    public void setListCandidaturas(List<Candidatura> listaCandidaturas) {
        this.listaCandidaturas = listaCandidaturas;
    }

    /**
     * Devolve uma nova Candidatura.
     *
     * @return Candidatura
     */
    public Candidatura novaCandidatura() {
        return new Candidatura();
    }

    /**
     * Validação que devolve um boolean. True se a Candidatura já existir na
     * List. False se ainda não existir.
     *
     * @param c Candidatura
     * @return boolean
     */
    public boolean validaCandidatura(Candidatura c) {
        return listaCandidaturas.contains(c);
    }

    /**
     * Adiciona uma candidatura ao list e devolve um boolean. True se esta for
     * adicionado com sucesso. False se esta não for adicionada com sucesso.
     *
     * @param c Candidatura
     * @return boolean
     */
    public boolean addCandidatura(Candidatura c) {
        return listaCandidaturas.add(c);
    }

    /**
     * Adiciona uma candidatura à List, apenas se esta ainda não existir na
     * mesma. Devolve um boolean, true se a operação tiver sucesso, false se não
     * tiver sucesso.
     *
     * @param c Candidatura
     * @return boolean
     */
    public boolean registaCandidatura(Candidatura c) {
        if (validaCandidatura(c)) {
            addCandidatura(c);
            return true;
        } else {
            return false;
        }
    }
}
