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
    
    private List<Candidatura> listaCandidaturas;
    
    public ListaCandidaturas() {
        this.listaCandidaturas = new ArrayList<>();
    }

    public List<Candidatura> getListCandidaturas() {
        return listaCandidaturas;
    }

    public void setListCandidaturas(List<Candidatura> listaCandidaturas) {
        this.listaCandidaturas = listaCandidaturas;
    }
}
