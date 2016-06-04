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
public class RegistoExposicoes {
    
    private List<Exposicao> listaExposicoes;
    
    public RegistoExposicoes() {
        this.listaExposicoes = new ArrayList<>();
    }

    public List<Exposicao> getListaExposicoes() {
        return listaExposicoes;
    }

    public void setListaExposicoes(List<Exposicao> listaExposicoes) {
        this.listaExposicoes = listaExposicoes;
    }
    
    public List<Exposicao> getListaExposicoesOrganizador(String username, RegistoUtilizadores ru) {
        Utilizador u = ru.getUtilizador(username);
        List<Exposicao> listaExposicoesOrganizador = new ArrayList<>();
        for (Exposicao e : listaExposicoes) {
            if(e.getListaOrganizadores().hasOrganizador(u)) {
                listaExposicoesOrganizador.add(e);
            }
        }
        return listaExposicoesOrganizador;
    }
}
