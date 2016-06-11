/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.ExposicaoEstado;
import lapr.project.model.ListaDemonstracoes;
import lapr.project.model.ListaRecursos;
import lapr.project.model.Recurso;
import lapr.project.model.RegistoExposicoes;
import lapr.project.model.RegistoRecursos;
import lapr.project.model.RegistoUtilizadores;

/**
 *
 * @author Rita
 */
public class CriarDemonstracao {
    
    private final CentroExposicoes ce;
    private Exposicao expo;
    private Demonstracao demo;
    private Recurso r;
    private ExposicaoEstado st;
    private RegistoExposicoes re;
    private RegistoUtilizadores ru;
    private RegistoRecursos rr;
    private ListaDemonstracoes rd;
    private ListaRecursos lr;
    
    
    public CriarDemonstracao(CentroExposicoes ce) {
        this.ce = ce;
    }
    
    public List<Exposicao> mostrarExpo(String email) {
        re = ce.getRegistoExposicoes();
        ru = ce.getRegistoUtilizadores();
        return re.getListaExposicoesOrganizador(email, ru);
    }
    
    public boolean selectExposicao(Exposicao expo) {
        this.expo = expo;
        st = expo.getEstado();
        return checkEstado();
    }
    
    public Demonstracao novaDemonstracao() {
        rd = expo.getListaDemonstracoes();
        demo = rd.novaDemonstracao();
        return demo;
    }
    
    public boolean setDadosDemonstracao(String codigo, String descricao) {
        demo.setCodigo(codigo);
        demo.setDescricao(descricao);
        return rd.validaCodigo(codigo);
    }
    
    public List<Recurso> getListaRecursos() {
        rr = ce.getRegistoRecursos();
        return rr.getListaRecursos();
    }
    
    public void selectRecurso(Recurso r) {
        this.r = r;
    }
    
    public void registaRecurso() {
        lr = demo.getListaRecursos();
        lr.registaRecurso(r);
    }
    
    public void registaDemonstracao() {
        rd.registaDemonstracao(demo);
    }
    
    public boolean transitaEstado() {
        return st.setDemoSemFae();
    }
    
    private boolean checkEstado() {
        return st.setCriada() || st.setFaeSemDemo();
    }
}
