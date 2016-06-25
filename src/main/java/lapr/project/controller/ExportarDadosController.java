/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.io.File;
import lapr.project.model.CentroExposicoes;
import lapr.project.utils.EscreverXML;

/**
 *
 * @author miniondevil
 */
public class ExportarDadosController {
   private final CentroExposicoes ce;
   public ExportarDadosController(CentroExposicoes ce){
       this.ce=ce;
   }
   public void escreverFicheiro(File ficheiro){
    EscreverXML escrever = new EscreverXML(ce,ficheiro);   
    escrever.escreverCentro();
    
   }
}
