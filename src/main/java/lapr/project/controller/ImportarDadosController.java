/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.io.File;
import java.util.Date;
import lapr.project.model.AlterarParaCandidaturasDemosAbertas;
import lapr.project.model.AlterarParaCandidaturasDemosFechadas;
import lapr.project.model.AlterarParaCandidaturasExpoAbertas;
import lapr.project.model.AlterarParaCandidaturasExpoFechadas;
import lapr.project.model.AlterarParaConflitosAtualizadosDemos;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.CriarControllerDetetarConflitos;
import lapr.project.model.Exposicao;
import lapr.project.utils.LerFicheiroXML;
import lapr.project.utils.Data;

/**
 *
 * @author miniondevil
 */
public class ImportarDadosController {
   private CentroExposicoes ce;
   public ImportarDadosController(CentroExposicoes ce){
       this.ce=ce;
   }
   public void lerCentro(File ficheiro){
       LerFicheiroXML ler = new LerFicheiroXML(ficheiro);
       ce=ler.lerCentro();
       
   }
   public void criarTimers(){
       for(Exposicao e : ce.getRegistoExposicoes().getListaExposicoes()){
           Data dataIniSubCand = e.getDataIniSubCan();
        Date date1  = new Date(dataIniSubCand.getAno(), dataIniSubCand.getMes(), dataIniSubCand.getDia(), dataIniSubCand.getHora(), dataIniSubCand.getMinuto(), dataIniSubCand.getSegundos());
        AlterarParaCandidaturasExpoAbertas task = new AlterarParaCandidaturasExpoAbertas(ce,e);
        ce.getRegistoExposicoes().schedule(task, dataIniSubCand);
        
        
        Data dataFimSubCand = e.getDataFimSubCand();
        Date date2 = new Date(dataFimSubCand.getAno(), dataFimSubCand.getMes(), dataFimSubCand.getDia(), dataFimSubCand.getHora(), dataFimSubCand.getMinuto(), dataFimSubCand.getSegundos());
        AlterarParaCandidaturasExpoFechadas task1 = new AlterarParaCandidaturasExpoFechadas(ce,e);
        CriarControllerDetetarConflitos uc13cntlr = new CriarControllerDetetarConflitos(ce,e);
        ce.getRegistoExposicoes().schedule(uc13cntlr, dataFimSubCand);
        
        Data dataFimAtualizacaoConflitos = e.getDataFimAtcConf();
        Date data3 = new Date(dataFimAtualizacaoConflitos.getAno(), dataFimAtualizacaoConflitos.getMes(), dataFimAtualizacaoConflitos.getDia(), dataFimAtualizacaoConflitos.getHora(), dataFimAtualizacaoConflitos.getMinuto(), dataFimAtualizacaoConflitos.getSegundos());
        AlterarParaConflitosAtualizadosDemos task2 = new AlterarParaConflitosAtualizadosDemos(ce,e);
        ce.getRegistoExposicoes().schedule(task2, dataFimSubCand);
         Data dataIniSubCandDemos = e.getDataInicioSubmissaoCandidaturasDemos();
        Date date4  = new Date(dataIniSubCandDemos.getAno(), dataIniSubCandDemos.getMes(), dataIniSubCandDemos.getDia(), dataIniSubCandDemos.getHora(), dataIniSubCandDemos.getMinuto(), dataIniSubCandDemos.getSegundos());
        AlterarParaCandidaturasDemosAbertas task3 = new AlterarParaCandidaturasDemosAbertas(ce,e);
        ce.getRegistoExposicoes().schedule(task, dataIniSubCandDemos);
        
        
        Data dataFimSubCandDemos = e.getDataFimSubmissaoCandidaturasDemos();
        Date date5 = new Date(dataFimSubCandDemos.getAno(), dataFimSubCandDemos.getMes(), dataFimSubCandDemos.getDia(), dataFimSubCandDemos.getHora(), dataFimSubCandDemos.getMinuto(), dataFimSubCandDemos.getSegundos());
        AlterarParaCandidaturasDemosFechadas task4 = new AlterarParaCandidaturasDemosFechadas(ce,e);
        CriarControllerDetetarConflitos uc13cntlrDemo = new CriarControllerDetetarConflitos(ce,e);
        ce.getRegistoExposicoes().schedule(uc13cntlr, dataFimSubCandDemos);
        
        Data dataFimAtualizacaoConflitosDemos = e.getDataFimAtualizacaoConflitosDemos();
        Date data6 = new Date(dataFimAtualizacaoConflitosDemos.getAno(), dataFimAtualizacaoConflitosDemos.getMes(), dataFimAtualizacaoConflitosDemos.getDia(), dataFimAtualizacaoConflitosDemos.getHora(), dataFimAtualizacaoConflitosDemos.getMinuto(), dataFimAtualizacaoConflitosDemos.getSegundos());
        AlterarParaConflitosAtualizadosDemos task5 = new AlterarParaConflitosAtualizadosDemos(ce,e);
        ce.getRegistoExposicoes().schedule(task2, dataFimSubCandDemos);
       }
   }
}
