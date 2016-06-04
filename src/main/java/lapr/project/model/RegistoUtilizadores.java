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
public class RegistoUtilizadores {

    private List<Utilizador> listaUtilizadores;

    public RegistoUtilizadores() {
        this.listaUtilizadores = new ArrayList<>();
    }

    public List<Utilizador> getListaUtilizadores() {
        return listaUtilizadores;
    }

    public void setListaUtilizadores(List<Utilizador> listaUtilizadores) {
        this.listaUtilizadores = listaUtilizadores;
    }

    public Utilizador getUtilizador(String username) {
        Utilizador u = null;
        for (Utilizador uz : listaUtilizadores) {
            if (uz.getUsername().equals(username)) {
                u = uz;
            }
        }
        return u;
    }
}
