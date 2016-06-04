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
    
    private List<Organizador> listaOrganizadores;
    
    public ListaOrganizadores() {
        listaOrganizadores = new ArrayList<>();
    }
    
    public boolean hasOrganizador(Utilizador u) {
        boolean b = false;
        for (Organizador o : listaOrganizadores) {
            if (o.equals(u)) {
                b = true;
            }
        }
        return b;
    }
            
}
