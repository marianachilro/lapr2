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
import lapr.project.model.Demonstracao;
import lapr.project.model.DemonstracaoEstado;
import lapr.project.model.Exposicao;
import lapr.project.model.ExposicaoCandidaturasExpoDecididasEstado;
import lapr.project.model.ExposicaoEstado;
import lapr.project.model.ListaCandidaturasExposicoes;
import lapr.project.model.ListaDemonstracoes;
import lapr.project.model.RegistoExposicoes;
import lapr.project.model.RegistoUtilizadores;
import lapr.project.utils.Data;

/**
 *
 * @author marianachilro
 */
public class ConfirmarRealizacaoDemonstracaoController {
    
    private final CentroExposicoes centro;
    
    private final RegistoExposicoes registoExposicoes;
    
    private Exposicao exposicao;
    
    private List <Demonstracao> listaDemosNaoConfirmadas;
    
    private Demonstracao demonstracao; 
    
    public ConfirmarRealizacaoDemonstracaoController(CentroExposicoes centro){
        this.centro=centro;
        this.registoExposicoes = centro.getRegistoExposicoes();
    }
    
    public List<Exposicao> getExposicoesOrganizadorEstadoCandidExpoAceites(String userName){
       RegistoUtilizadores ru = this.centro.getRegistoUtilizadores();
       List <Exposicao> lista = this.registoExposicoes.getListaExposicoesOrganizador(userName, ru);
       for(Exposicao e : lista){
           if(!e.getEstado().equals(new ExposicaoCandidaturasExpoDecididasEstado(new Exposicao())))
               lista.remove(e);
       }
       return lista;
    }
    
    public void seleciona(Exposicao e){
        this.exposicao= e;
    }
    
    public List <Demonstracao> getListaDemonstracoesNaoConfirmadas(){
        ListaDemonstracoes ld = this.exposicao.getListaDemonstracoes();
        ld.ordenarPorNumeroInteressados();
        this.listaDemosNaoConfirmadas = ld.getListaDemonstracoesNaoConfirmadas();
        
        return this.listaDemosNaoConfirmadas;
    }
    
    public void seleciona (Demonstracao d){
        this.demonstracao=d;
    }
    
    public float pergentagemInteressadosDemonstracao(){
        int numeroTotalRepresentantes = 0;
        float percentagem;
        List <String> emails = new ArrayList<>();
        ListaCandidaturasExposicoes listaCandidaturas = this.exposicao.getListaCandidaturas();
        numeroTotalRepresentantes = listaCandidaturas.getListCandidaturas().stream().filter((c) -> (!emails.contains(c.getEmailRep()))).map((c) -> {
            emails.add(c.getEmailRep());
            return c;
        }).map((_item) -> 1).reduce(numeroTotalRepresentantes, Integer::sum);
        percentagem = (this.demonstracao.getNumeroInteressados()*100)/numeroTotalRepresentantes;
        return percentagem;
    }
    
    public String apresentaDemonstracao(){
        return this.demonstracao.toString();
    }
    
    public void setRealizacao(boolean b){
        this.demonstracao.setRealizacao(b);
    }
    
    public void transitaEstadoDemo(){
        DemonstracaoEstado estadoDemo = this.demonstracao.getEstado();
        if(this.demonstracao.getRealizacao())
            estadoDemo.setConfirmada();
        estadoDemo.setNaoConfirmada();
    }
    
    public boolean validaDatas(Data data1, Data data2){
        return !data1.isMaior(data2);
    }
    
    public void setDataInicioSubmissaoCandidaturasDemos(Data data1){
        this.exposicao.setDataInicioSubmissaoCandidaturasDemos(data1);
        for(Demonstracao d : this.exposicao.getListaDemonstracoes().getListaDemonstracoesDisponiveis()){
            d.setDataInicioSubmissaoCandidaturas(data1);
            
        }
    }
    
    public void setDataFimSubmissaoCandidaturasDemos(Data data2){
        this.exposicao.setDataFimSubmissaoCandidaturasDemos(data2);
        for(Demonstracao d : this.exposicao.getListaDemonstracoes().getListaDemonstracoesDisponiveis()){
            d.setDataFimSubmissaoCandidaturas(data2);
            
        }
    }
    
    public void setDataFimAtualizaçãoConflitosDemos(Data data3){
        this.exposicao.setDataFimAtualizacaoConflitosDemos(data3);
        for(Demonstracao d : this.exposicao.getListaDemonstracoes().getListaDemonstracoesDisponiveis()){
            d.setDataFimAtualizacaoConflitos(data3);
            
        }
    }
    
    public void escalonarExposicao(){
        
    }
    
    public boolean transitaEstadoExpo(){
        boolean b = false;
        ExposicaoEstado estadoExpo = this.exposicao.getEstado();
        if(estadoExpo.equals(new ExposicaoCandidaturasExpoDecididasEstado(new Exposicao()))){
           b =  estadoExpo.setConfirmacaoRealizacaoDemos();
        }
        return b;
    }
    
    
    
}
