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
public class ListaOrganizadores {

    /**
     * List de Organizadores.
     */
    private List<Organizador> listaOrganizadores;

    /**
     * Construtor de uma Lista de Organizadores.
     */
    public ListaOrganizadores() {
        listaOrganizadores = new ArrayList<>();
    }

    /**
     * Devolve a List de Organizadores.
     *
     * @return List de Organizadores
     */
    public List<Organizador> getListaOrganizadores() {
        return listaOrganizadores;
    }

    /**
     * Modifica a List de Organizadores.
     *
     * @param listaOrganizadores List de Organizadores
     */
    public void setListaOrganizadores(List<Organizador> listaOrganizadores) {
        this.listaOrganizadores = listaOrganizadores;
    }

    /**
     * Verifica se Utilizador já é Organizador. Devolve um boolean, true se já o
     * for, false se ainda não o for.
     *
     * @param u utilizador
     * @return boolean
     */
    public boolean hasOrganizador(Utilizador u) {
        boolean b = false;
        for (Organizador o : getListaOrganizadores()) {
            if (o.equals(u)) {
                b = true;
            }
        }
        return b;
    }

    /**
     * Validação que devolve um boolean. True se o Organizador já existir na
     * List. False se ainda não existir.
     *
     * @param org Organizador
     * @return boolean
     */
    public boolean validaOrganizador(Organizador org) {
        return listaOrganizadores.contains(org);
    }

    /**
     * Adiciona um Organizador ao list e devolve um boolean. True se esta for
     * adicionado com sucesso. False se esta não for adicionada com sucesso.
     *
     * @param org Organizador
     * @return boolean
     */
    public boolean addOrganizador(Organizador org) {
        return listaOrganizadores.add(org);
    }

    /**
     * Adiciona um Organizador à List, apenas se esta ainda não existir na
     * mesma. Devolve um boolean, true se a operação tiver sucesso, false se não
     * tiver sucesso.
     *
     * @param org Organizador
     * @return boolean
     */
    public boolean registaOrganizador(Organizador org) {
        if (validaOrganizador(org)) {
            addOrganizador(org);
            return true;
        } else {
            return false;
        }
    }
}
