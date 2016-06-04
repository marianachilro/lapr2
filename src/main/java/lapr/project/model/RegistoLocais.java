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
public class RegistoLocais {

    /**
     * Lista de locais.
     */
    private List<Local> listaLocais;

    /**
     * Construtor de um registo de locais.
     */
    public RegistoLocais() {
        this.listaLocais = new ArrayList<>();
    }

    /**
     * Devolde a lista de locais do centro de exposições.
     *
     * @return lista locais
     */
    public List<Local> getListaLocais() {
        return listaLocais;
    }

    /**
     * Modifica a lista de locais do centro de exposições.
     *
     * @param listaLocais
     */
    public void setListaLocais(List<Local> listaLocais) {
        this.listaLocais = listaLocais;
    }

}
