/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.CandidaturaEstado;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaCandidaturasExposicoes;
import lapr.project.model.RegistoExposicoes;
import lapr.project.model.Stand;

/**
 *
 * @author miniondevil
 */
public class ConfirmarStandController {

    private final CentroExposicoes ce;
    private final String email;
    private CandidaturaExposicao c;

    public ConfirmarStandController(CentroExposicoes ce, String email) {
        this.ce = ce;
        this.email = email;
    }

    public List<CandidaturaExposicao> geListaCandidaturaRep() {
        List<CandidaturaExposicao> lista = new ArrayList<>();
        RegistoExposicoes re = ce.getRegistoExposicoes();
        for (Exposicao e : re.getListaExposicoes()) {
            ListaCandidaturasExposicoes lc = e.getListaCandidaturas();
            lista.addAll(lc.getListacandidaturaRepresentanteComStand(email));
        }
        return lista;
    }

    public Stand getStand(CandidaturaExposicao c) {
        this.c = c;
        return c.getStand();
    }

    public void setEstado() {
        CandidaturaEstado st = c.getEstado();
        st.setConfirmarStandEstado();
    }
}
