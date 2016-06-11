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
    private Exposicao e;
    private FAE fae;
    private Utilizador u;
    private RegistoExposicoes re;
    private RegistoUtilizadores ru;
    private ListaFAEs lFae;
    private ExposicaoEstado as;

    public DefinirFaeController(CentroExposicoes ce) {
        this.ce = ce;
    }

    public List<Exposicao> getExposicoesOrganizador(String username) {
        re = ce.getRegistoExposicoes();
        ru = ce.getRegistoUtilizadores();
        return re.getListaExposicoesOrganizador(username, ru);
    }

    public void selectExposicao(Exposicao e) {
        this.e = e;
    }

    public void getListaFae() {
        lFae = e.getListaFAES();
    }

    public FAE novoFae(String username) {
        u = ru.getUtilizador(username);
        fae = lFae.novoFae();
        fae.setUtilizador(u);
        return fae;
    }

    public void registaFae() {
        lFae.registaFae(fae);
    }

    public String apresentaLista() {
        return lFae.toString();
    }

    public ExposicaoEstado getEstado() {
        as = e.getEstado();
        return as;
    }

//    public boolean setDefinidos() {
//       
//    }
}
