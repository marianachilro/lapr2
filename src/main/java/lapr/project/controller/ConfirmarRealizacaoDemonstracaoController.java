/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lapr.project.model.AlterarParaCandidaturasDemosAbertas;
import lapr.project.model.AlterarParaCandidaturasDemosFechadas;
import lapr.project.model.AlterarParaConflitosAtualizadosDemos;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.CriarControllerDetetarConflitos;
import lapr.project.model.Demonstracao;
import lapr.project.model.DemonstracaoConfirmadaEstado;
import lapr.project.model.DemonstracaoEstado;
import lapr.project.model.DemonstracaoNaoConfirmadaEstado;
import lapr.project.model.Exposicao;
import lapr.project.model.ExposicaoDemonstracoesConfirmadasEstado;
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
    
    public CentroExposicoes getCentro(){
        return centro;
    }
    
    public Exposicao getExposicao(){
        return exposicao;
    }
    
    public List<Exposicao> getExposicoesOrganizadorEstadoCandidExpoAceites(String userName){
       RegistoUtilizadores ru = this.centro.getRegistoUtilizadores();
       List <Exposicao> lista = this.registoExposicoes.getListaExposicoesOrganizador(userName, ru);
       for(Exposicao e : lista){
           if(!(!e.getEstado().setExposicaoCandidaturasAtribuidas() && e.getEstado().setExposicaoCandidaturasDecididas()))
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
        for(CandidaturaExposicao c : listaCandidaturas.getListCandidaturas()){
            if(!emails.contains(c.getEmailRep())){
                emails.add(c.getEmailRep());
                numeroTotalRepresentantes++;
            }
        }
        percentagem = (this.demonstracao.getNumeroInteressados()*100)/numeroTotalRepresentantes;
        return percentagem;
    }
    
    
    public void setRealizacao(boolean b){
        this.demonstracao.setRealizacao(b);
    }
    
    public void transitaEstadoDemo(){
        DemonstracaoEstado estadoDemo = this.demonstracao.getEstado();
        if(this.demonstracao.getRealizacao())
            this.demonstracao.setEstado(new DemonstracaoConfirmadaEstado(this.demonstracao));
        this.demonstracao.setEstado(new DemonstracaoNaoConfirmadaEstado(this.demonstracao));
    }
    
    public boolean validaDatas(Data data1, Data data2){
        return !data1.isMaior(data2);
    }
    
    public void setDataInicioSubmissaoCandidaturasDemos(Data data1){
        this.exposicao.setDataInicioSubmissaoCandidaturasDemos(data1);
        for(Demonstracao d : this.exposicao.getListaDemonstracoes().getListaDemonstracoesDisponiveis()){
            if(d.getEstado().setConfirmada()){
               d.setDataInicioSubmissaoCandidaturas(data1); 
            }
        }
    }
    
    public void setDataFimSubmissaoCandidaturasDemos(Data data2){
        this.exposicao.setDataFimSubmissaoCandidaturasDemos(data2);
        for(Demonstracao d : this.exposicao.getListaDemonstracoes().getListaDemonstracoesDisponiveis()){
            if(d.getEstado().setConfirmada()){
                 d.setDataFimSubmissaoCandidaturas(data2);
            }
           
            
        }
    }
    
    public void setDataFimAtualizaçãoConflitosDemos(Data data3){
        this.exposicao.setDataFimAtualizacaoConflitosDemos(data3);
        for(Demonstracao d : this.exposicao.getListaDemonstracoes().getListaDemonstracoesDisponiveis()){
            if(!d.getEstado().setCriada() && d.getEstado().setConfirmada()){
                d.setDataFimAtualizacaoConflitos(data3);
            }
        }
    }
    
    public void escalonarExposicaoEDemosConfirmadas(){
        
        Data dataIniSubCandDemos = this.exposicao.getDataInicioSubmissaoCandidaturasDemos();
        Date date1  = new Date(dataIniSubCandDemos.getAno(), dataIniSubCandDemos.getMes(), dataIniSubCandDemos.getDia(), dataIniSubCandDemos.getHora(), dataIniSubCandDemos.getMinuto(), dataIniSubCandDemos.getSegundos());
        AlterarParaCandidaturasDemosAbertas task = new AlterarParaCandidaturasDemosAbertas(this.centro, this.exposicao);
        this.registoExposicoes.schedule(task, dataIniSubCandDemos);
        
        Data dataFimSubCandDemos = this.exposicao.getDataFimSubmissaoCandidaturasDemos();
        Date date2 = new Date(dataFimSubCandDemos.getAno(), dataFimSubCandDemos.getMes(), dataFimSubCandDemos.getDia(), dataFimSubCandDemos.getHora(), dataFimSubCandDemos.getMinuto(), dataFimSubCandDemos.getSegundos());
        AlterarParaCandidaturasDemosFechadas task1 = new AlterarParaCandidaturasDemosFechadas(this.centro, this.exposicao);
        CriarControllerDetetarConflitos uc13cntlr = new CriarControllerDetetarConflitos(this.centro, this.exposicao);
        this.registoExposicoes.schedule(uc13cntlr, dataFimSubCandDemos);
        
        Data dataFimAtualizacaoConflitosDemos = this.exposicao.getDataFimAtualizacaoConflitosDemos();
        Date data3 = new Date(dataFimAtualizacaoConflitosDemos.getAno(), dataFimAtualizacaoConflitosDemos.getMes(), dataFimAtualizacaoConflitosDemos.getDia(), dataFimAtualizacaoConflitosDemos.getHora(), dataFimAtualizacaoConflitosDemos.getMinuto(), dataFimAtualizacaoConflitosDemos.getSegundos());
        AlterarParaConflitosAtualizadosDemos task2 = new AlterarParaConflitosAtualizadosDemos(this.centro, this.exposicao);
        this.registoExposicoes.schedule(task2, dataFimSubCandDemos);
        
    }
    
    public boolean transitaEstadoExpo(){
        
        ExposicaoEstado estadoExpo = this.exposicao.getEstado();
        if(!estadoExpo.setDemonstracaoCandidaturasAvaliadas() && estadoExpo.setDemonstracaoCandidaturasDecididas()){
           this.exposicao.setEstado(new ExposicaoDemonstracoesConfirmadasEstado(this.exposicao));
        }
        return this.exposicao.getEstado().setConfirmacaoRealizacaoDemos();
    }
    
    
    
}
