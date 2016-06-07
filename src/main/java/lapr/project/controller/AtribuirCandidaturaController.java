/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.Atribuicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.EstadoExpo;
import lapr.project.model.Exposicao;
import lapr.project.model.FAE;
import lapr.project.model.ListaAtribuicoes;
import lapr.project.model.ListaConflitos;
import lapr.project.model.ListaFAEs;
import lapr.project.model.MecanismoAtribuicao;
import lapr.project.model.RegistoExposicoes;
import lapr.project.model.RegistoMecanismos;
import lapr.project.model.RegistoUtilizadores;

/**
 *
 * @author miniondevil
 */
public class AtribuirCandidaturaController {

    private CentroExposicoes ce;
    private RegistoExposicoes re;
    private Exposicao e;
    private RegistoMecanismos rm;
    private EstadoExpo st;
    private ListaConflitos rconf;
    private List<FAE> listaf;
    private MecanismoAtribuicao mecanismo;
    private List<Atribuicao> lA;
    private ListaAtribuicoes listaAtribuicoes;

    public AtribuirCandidaturaController(CentroExposicoes ce) {
        this.ce = ce;
        rm = null;
    }

    public List<String> listaExpo(String username) {
        RegistoUtilizadores ru = ce.getRegistoUtilizadores();
        re = ce.getRegistoExposicoes();
        List<String> lista = re.getListaExposicoesOrganizadorToString(username, ru);
        return lista;
    }

    public void getExpo(String expo) {
        e = re.getExpo(expo);
        st = e.getEstado();
        if (checkEstado()) {
            listaAtribuicoes = e.getListaAtribuicoes();
            rconf = e.getListaConflitos();
            ListaFAEs rf = e.getListaFAES();
            listaf = rf.getListaFAEs();
        }

    }

    public List<MecanismoAtribuicao> getListaMecanismoAtribuicao() {
        rm = ce.getRegistoMecanismos();
        return rm.getListaMecanismos();
    }

    public void setMecanismo(int num) {
        mecanismo = rm.getListaMecanismos().get(num);
    }

    public List<Atribuicao> getListaAtribuicoes() {
        lA = mecanismo.atribui(listaf, rconf, st);
        return lA;
    }

    public void registaAtribuicoes() {
        e.setAtribuicoes(lA);
        //atribuir estado
    }

    public boolean checkEstado() {
        //if(st)
        return true;
    }
}
