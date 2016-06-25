/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ExposicaoEstado;
import lapr.project.model.ListaCandidaturasExposicoes;
import lapr.project.model.RegistoExposicoes;
import lapr.project.model.RegistoStands;
import lapr.project.model.RegistoUtilizadores;
import lapr.project.model.Stand;

/**
 *
 * @author Rita
 */
public class AtribuirStandController {

    private final CentroExposicoes ce;
    private Exposicao e;
    private CandidaturaExposicao c;
    private Stand s;
    private RegistoExposicoes re;
    private RegistoUtilizadores ru;
    private RegistoStands rs;
    private ListaCandidaturasExposicoes rc;
    private List<CandidaturaExposicao> lc;
    private List<Stand> ls;
    private ExposicaoEstado as;

    public AtribuirStandController(CentroExposicoes ce) {
        this.ce = ce;
    }

    public List<Exposicao> getListaExposicoesOrganizador(String username) {
        re = ce.getRegistoExposicoes();
        ru = ce.getRegistoUtilizadores();
        return re.getListaExposicoesOrganizador(username, ru);
    }

    public void selectExposicao(Exposicao e) {
        this.e = e;
    }

    public List<CandidaturaExposicao> getListaCandidaturas() {
        rc = e.getListaCandidaturas();
        lc = rc.getListCandidaturas();
        return lc;
    }

    public void selectCandidatura(CandidaturaExposicao c) {
        this.c = c;
    }

    public List<Stand> getListaStandsNaoAtribuidos() {
        rs = ce.getRegistoStands();
        ls = rs.getListaStandsNaoAtribuidos(lc);
        return ls;
    }

    public void selectStand(Stand s) {
        this.s = s;
    }

    public void setStand() {
        c.setStand(s);
    }

    public boolean transitaEstado() {
        if (ls.isEmpty()) {
            as = e.getEstado();
            return as.setStandsAtribuidos();
        } else {
            return false;
        }
    }

    public boolean checkEstado() {
        if (!as.setDemonstracaoCandidaturasAvaliadas()&& as.setDemonstracaoCandidaturasDecididas()) {
            return true;
        } else {
            return false;
        }
    }

    public List<String> candToListString(List<CandidaturaExposicao> lista) {
        List<String> listaSt = new ArrayList<>();
        for (CandidaturaExposicao obj : lista) {
            listaSt.add(obj.toString());
        }
        return listaSt;
    }

    public List<String> standToListString(List<Stand> lista) {
        List<String> listaSt = new ArrayList<>();
        for (Stand obj : lista) {
            listaSt.add(obj.toString());
        }
        return listaSt;
    }

}
