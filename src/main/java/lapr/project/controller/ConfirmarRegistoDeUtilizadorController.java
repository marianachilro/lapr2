/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.RegistoUtilizadores;
import lapr.project.model.Utilizador;

/**
 *
 * @author Rita
 */
public class ConfirmarRegistoDeUtilizadorController {

    private final CentroExposicoes ce;
    private Utilizador u;
    private RegistoUtilizadores ru;
    private RegistoUtilizadores ruNc;

    public ConfirmarRegistoDeUtilizadorController(CentroExposicoes ce) {
        this.ce = ce;
    }

    public void getRegistoUtilizadores() {
        ru = ce.getRegistoUtilizadores();
    }

    public List<Utilizador> getUtilizadoresNaoConfirmados() {
        ruNc = ce.getRegistoUtilizadoresNaoConfirmados();
        return ruNc.getListaUtilizadores();
    }

    public void selectUtilizador(Utilizador u) {
        this.u = u;
    }
    
    public boolean removeUtilizador() {
        return ruNc.removerUtilizador(u);
    }
    
    public boolean confirmaUtilizador() {
        return ru.confirmaUtilizador(u);
    }

}
