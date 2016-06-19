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
public class CriarDemonstracaoController {
    
    private String email;
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
    
    
    public CriarDemonstracaoController(CentroExposicoes ce, String email) {
        this.ce = ce;
        this.email = email;
    }
    
    public List<Exposicao> mostrarExpo() {
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
    
    public boolean registaRecurso() {
        lr = demo.getListaRecursos();
        return lr.registaRecurso(r);
    }
    
    public boolean registaDemo() {
        return rd.registaDemonstracao(demo);
    }
    
    public boolean transitaEstado() {
        st = expo.getEstado();
        if(st.setCriada()) {
            return st.setDemoSemFae();
        } else if (st.setFaeSemDemo()) {
            return st.setCompleta();
        } else {
            return false;
        }
    }
    
    private boolean checkEstado() {
        return st.setCriada() || st.setFaeSemDemo();
    }
}
