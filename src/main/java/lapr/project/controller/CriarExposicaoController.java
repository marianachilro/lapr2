/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.Date;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaOrganizadores;
import lapr.project.model.Organizador;
import lapr.project.model.RegistoExposicoes;
import lapr.project.model.RegistoLocais;
import lapr.project.model.RegistoUtilizadores;
import lapr.project.model.Utilizador;

/**
 *
 * @author catarinarib
 */
public class CriarExposicaoController {

    private Exposicao m_exposicao;
    private final CentroExposicoes m_oCE;
    private Utilizador m_oUtilizador;
    private Organizador _oOrg;
    private RegistoExposicoes RegistoExposicoes;
    private RegistoUtilizadores RegistoUtilizadores;

    public CriarExposicaoController(CentroExposicoes ce) {
        this.m_oCE = ce;
    }

    public void newExposicao() {
        this.m_exposicao = RegistoExposicoes.newExposicao();
    }

    public void setDadosExposicao(String sTitulo, String sDescritivo, Date oDtInicio, Date oDtFim, Date oDtFimSubCand, Date oDtFimActConf, Date oDtFimAvCand, Date oDtFimDcCand) {
        this.m_exposicao.setTitulo(sTitulo);
        this.m_exposicao.setDescricao(sDescritivo);
//        this.m_exposicao.setDataInicio(oDtInicio);
//        this.m_exposicao.setDataFim(oDtFim);
//        this.m_exposicao.setDataFimSubCand(oDtFimSubCand);
//        this.m_exposicao.setDataFimAtcConf(oDtFimActConf);
//        this.m_exposicao.setDataFimAvCandidatura(oDtFimAvCand);
//        this.m_exposicao.setDataFimDcCandidaturas(oDtFimDcCand);

    }

    public RegistoLocais getRegistoLocais() {
        return this.m_oCE.getRegistoLocais();
    }

    public void setLocal(String local) {
        this.m_exposicao.setLocal(local);
    }

    public RegistoUtilizadores getRegistoUtilizadores() {
        return this.m_oCE.getRegistoUtilizadores();
    }

    public ListaOrganizadores getListaOrganizadores() {
        return this.m_exposicao.getListaOrganizadores();
    }

    public void addOrganizador(Utilizador u) {
        this.m_exposicao.addOrganizador(u);
    }

    public boolean validaExposicao() {
        return this.RegistoExposicoes.valida(m_exposicao);
    }

    public boolean registaExposicao() {
        return this.RegistoExposicoes.registaExposicao(m_exposicao);
    }

}
