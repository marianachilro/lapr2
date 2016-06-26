/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ExposicaoEstado;
import lapr.project.model.FAE;
import lapr.project.model.ListaFAEs;
import lapr.project.model.RegistoExposicoes;
import lapr.project.model.RegistoUtilizadores;
import lapr.project.model.Utilizador;

/**
 *
 * @author Rita
 */
public class DefinirFaeController {

    private final CentroExposicoes ce;
    private String username;
    private Exposicao e;
    private FAE fae;
    private Utilizador u;
    private RegistoExposicoes re;
    private RegistoUtilizadores ru;
    private ListaFAEs lFae;
    private ExposicaoEstado as;

    public DefinirFaeController(CentroExposicoes ce, String username) {
        this.ce = ce;
        this.username = username;
    }

    public RegistoUtilizadores getRegistoUtilizadores() {
        ru = ce.getRegistoUtilizadores();
        return ru;
    }
    
    public List<Exposicao> getExposicoesOrganizador() {
        re = ce.getRegistoExposicoes();
        return re.getListaExposicoesOrganizador(username, ru);
    }

    public void selectExposicao(Exposicao e) {
        this.e = e;
    }

    public List<FAE> getListaFae() {
        lFae = e.getListaFAES();
        return lFae.getListaFAEs();
    }

    public FAE novoFae(String username) {
        fae = null;
        if(ru.hasUtilizador(username) && !e.getListaOrganizadores().hasOrganizador(u)) {
            u = ru.getUtilizador(username);
            fae = lFae.novoFae();
            fae.setUtilizador(u);
        }
        return fae;
    }

    public boolean registaFae() {
        return lFae.registaFae(fae);
    }

    public String apresentaLista() {
        return lFae.toString();
    }

    public ExposicaoEstado getEstado() {
        as = e.getEstado();
        return as;
    }

    public boolean setFaeDefinidos() {
       if(as.setCriada()) {
           return as.setFaeSemDemo();
       } else if(as.setDemoSemFae()) {
           return as.setCompleta();
       } else {
           return false;
       }
    }
    
    public boolean checkEstado() {
        return (as.setCriada() ) || (as.setFaeSemDemo() && !as.setCriada());
    }
}
