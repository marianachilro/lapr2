/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.Avaliacao;
import lapr.project.model.Candidatura;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Decisivel;
import lapr.project.model.Exposicao;
import lapr.project.model.Organizador;

/**
 *
 * @author catarinarib
 */
public class DecidirCandidaturaController {
    
    
    private final CentroExposicoes ce;
    private final Organizador org;
    private Exposicao exposicao;
    private Decisivel interfaceDecisivel;
    private Candidatura candidatura;
    
    public DecidirCandidaturaController(CentroExposicoes ce, Organizador org){
        this.ce=ce;
        this.org=org;
    }
    
    public List<Exposicao> getListaExposicoesOrganizador(){
        return this.ce.getRegistoExposicoes().getListaExposicoesOrganizador(org);
    }
    
    public void selectExposicao(Exposicao e){
        this.exposicao=e;
    }
    
    public List<Candidatura> getDecisivel(){
        return this.interfaceDecisivel.getDecisiveis();
    }
    
    public void selectCandidatura(Candidatura c){
        this.candidatura=c;
    }
    
    public List<Avaliacao> getListaAvaliacoesDaCandidatura(){
        return this.candidatura.getListaAvaliacoes().getListaAvaliacao();
    }
    
    public void setDecisao(String decisao){
        this.candidatura.setDecisao(decisao);
    }
    
    
}
