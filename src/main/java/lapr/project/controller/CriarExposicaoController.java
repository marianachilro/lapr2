/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.utils.Data;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaOrganizadores;
import lapr.project.model.Local;
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
    private RegistoUtilizadores RegistoUtilizadores;

    public CriarExposicaoController(CentroExposicoes ce) {
        this.m_oCE = ce;
    }

    public void newExposicao() {
        this.m_exposicao = m_oCE.getRegistoExposicoes().newExposicao();
    }

    public void setDadosExposicao(String sTitulo, String sDescritivo, Data oDtInicio, Data oDtFim,Local local,Data oDtIniSubCand, Data oDtFimSubCand, Data oDtFimActConf, Data oDtFimAvCand) {
        this.m_exposicao.setTitulo(sTitulo);
        this.m_exposicao.setDescricao(sDescritivo);
        this.m_exposicao.setDataInicio(oDtInicio);
        this.m_exposicao.setDataFim(oDtFim);
        this.m_exposicao.setLocal(local);
        this.m_exposicao.setDataIniSubCan(oDtIniSubCand);
        this.m_exposicao.setDataFimSubCand(oDtFimSubCand);
        this.m_exposicao.setDataFimAtcConf(oDtFimActConf);
        this.m_exposicao.setDataFimAvCandidatura(oDtFimAvCand);
        

    }

    public RegistoLocais getRegistoLocais() {
        return this.m_oCE.getRegistoLocais();
    }

    public void setLocal(Local local) {
        this.m_exposicao.setLocal(local);
    }

    public RegistoUtilizadores getRegistoUtilizadores() {
        return this.RegistoUtilizadores=this.m_oCE.getRegistoUtilizadores();
    }

    public ListaOrganizadores getListaOrganizadores() {
        return this.m_exposicao.getListaOrganizadores();
    }

    public boolean addOrganizador(Utilizador u) {
        return this.m_exposicao.addOrganizador(u);
    }


    public boolean registaExposicao() {
        return m_oCE.getRegistoExposicoes().registaExposicao(m_exposicao);
    }

}
