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
public class RegistoStands {

    private List<Stand> listaStands;

    public RegistoStands() {
        this.listaStands = new ArrayList<>();
    }

    public List<Stand> getListaStands() {
        return listaStands;
    }

    public void setListaStands(List<Stand> listaStands) {
        this.listaStands = listaStands;
    }

    public List<Stand> getListaStandsNaoAtribuidos(List<Candidatura> lc) {
        List<Stand> listaStandsNaoAtribuidos = new ArrayList<>();
        boolean b = false;
        for (Stand st : listaStands) {
            for (Candidatura c : lc) {
                if (c.getStand().equals(st)) {
                    b = true;
                }
            }
            if (b == false) {
                listaStandsNaoAtribuidos.add(st);
            }
        }
        return listaStandsNaoAtribuidos;
    }
}