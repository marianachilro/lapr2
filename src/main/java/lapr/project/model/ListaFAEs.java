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
public class ListaFAEs {
    /**
     * Lista de FAEs da exposição
     */
    private List<FAE> listaFAEs;
    
    /**
     * Contrutor de uma lista de FAEs
     */
    public ListaFAEs(){
        this.listaFAEs=new ArrayList<>();
    }

    /**
     * Devolve a lista de FAEs.
     * @return lista de FAEs
     */
    public List<FAE> getListaFAEs() {
        return listaFAEs;
    }

    /**
     * Modifica a lista de FAEs
     * @param listaFAEs lista de FAEs
     */
    public void setListaFAEs(List<FAE> listaFAEs) {
        this.listaFAEs = listaFAEs;
    }

  
    
    
}
