/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.io.File;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.LerFicheiroXML;

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
}
