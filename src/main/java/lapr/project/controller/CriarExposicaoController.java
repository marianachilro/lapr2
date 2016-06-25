/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.Date;
import lapr.project.model.AlterarParaCandidaturasExpoAbertas;
import lapr.project.model.AlterarParaCandidaturasExpoFechadas;
import lapr.project.model.AlterarParaConflitosAtualizadosDemos;
import lapr.project.utils.Data;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.CriarControllerDetetarConflitos;
import lapr.project.model.Exposicao;
import lapr.project.model.ExposicaoEstado;
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

    public Exposicao newExposicao() {
        return this.m_exposicao = m_oCE.getRegistoExposicoes().newExposicao();
    }

    public void setDadosExposicao(String sTitulo, String sDescritivo, Data oDtInicio, Data oDtFim, Local local, Data oDtIniSubCand, Data oDtFimSubCand, Data oDtFimActConf, Data oDtFimAvCand) {
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
        return this.RegistoUtilizadores = this.m_oCE.getRegistoUtilizadores();
    }

    public ListaOrganizadores getListaOrganizadores() {
        return this.m_exposicao.getListaOrganizadores();
    }

    public boolean addOrganizador(Utilizador u) {
        return this.m_exposicao.addOrganizador(u);
    }

    public boolean registaExposicao() {
        ExposicaoEstado es = m_exposicao.getEstado();
        es.setCriada();

        Data dataIniSubCand = this.m_exposicao.getDataIniSubCan();
        Date date1 = new Date(dataIniSubCand.getAno(), dataIniSubCand.getMes(), dataIniSubCand.getDia(), dataIniSubCand.getHora(), dataIniSubCand.getMinuto(), dataIniSubCand.getSegundos());
        AlterarParaCandidaturasExpoAbertas task = new AlterarParaCandidaturasExpoAbertas(this.m_oCE, this.m_exposicao);
        this.m_oCE.getRegistoExposicoes().schedule(task, dataIniSubCand);

        Data dataFimSubCand = this.m_exposicao.getDataFimSubCand();
        Date date2 = new Date(dataFimSubCand.getAno(), dataFimSubCand.getMes(), dataFimSubCand.getDia(), dataFimSubCand.getHora(), dataFimSubCand.getMinuto(), dataFimSubCand.getSegundos());
        AlterarParaCandidaturasExpoFechadas task1 = new AlterarParaCandidaturasExpoFechadas(this.m_oCE, this.m_exposicao);
        CriarControllerDetetarConflitos uc13cntlr = new CriarControllerDetetarConflitos(this.m_oCE, this.m_exposicao);
        this.m_oCE.getRegistoExposicoes().schedule(uc13cntlr, dataFimSubCand);

        Data dataFimAtualizacaoConflitos = this.m_exposicao.getDataFimAtcConf();
        Date data3 = new Date(dataFimAtualizacaoConflitos.getAno(), dataFimAtualizacaoConflitos.getMes(), dataFimAtualizacaoConflitos.getDia(), dataFimAtualizacaoConflitos.getHora(), dataFimAtualizacaoConflitos.getMinuto(), dataFimAtualizacaoConflitos.getSegundos());
        AlterarParaConflitosAtualizadosDemos task2 = new AlterarParaConflitosAtualizadosDemos(this.m_oCE, this.m_exposicao);
        this.m_oCE.getRegistoExposicoes().schedule(task2, dataFimSubCand);

        return m_oCE.getRegistoExposicoes().registaExposicao(m_exposicao);
    }

}
