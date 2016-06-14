/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.Candidatura;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.RegistoExposicoes;
import lapr.project.model.RegistoUtilizadores;

/**
 *
 * @author marianachilro
 */
public class GerarEstatisticaCandidaturasController {
    
    private final CentroExposicoes centro;
    
    private final RegistoExposicoes registoExpos;
    
    private Exposicao exposicao;
    
    private List <CandidaturaExposicao> listaCandidaturasAvaliadas;
    
    private Candidatura candidatura;
    
    private String estatistica;
    
    
    public GerarEstatisticaCandidaturasController(CentroExposicoes centro){
        this.centro=centro;
        this.registoExpos=centro.getRegistoExposicoes();
    }
    
    public List <Exposicao> getExposicoesOrganizadorEstadoCandidaturasAvaliadas(String username, RegistoUtilizadores ru){
        return this.registoExpos.getExposicoesOrganizadorEstadoCandidaturasAvaliadas(username, ru);
        
    }
    
    public void seleciona(Exposicao expo){
        this.exposicao=expo;
        this.listaCandidaturasAvaliadas=expo.getListaCandidaturas().getListaCandidaturasAvaliadas();
    }
    
    public String seleciona(CandidaturaExposicao c){
        this.candidatura=c;
        return this.estatistica=c.toStringEstatisticaAvaliacoes();
        
    }
    
    
    
}
