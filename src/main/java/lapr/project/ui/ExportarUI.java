/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.io.File;
import javax.swing.JFileChooser;
import lapr.project.controller.CarregarExposicoesController;
import lapr.project.controller.ExportarDadosController;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Utilizador;

/**
 *
 * @author miniondevil
 */
public class ExportarUI {
     private final ExportarDadosController controller;
    public ExportarUI(CentroExposicoes ce,  Utilizador u){      
        controller = new ExportarDadosController(ce);
           MyFileChooser fileChooser = new MyFileChooser();
                int resposta = fileChooser.showSaveDialog(null);
                if (resposta == JFileChooser.APPROVE_OPTION) {
                    File ficheiro = fileChooser.getSelectedFile();          
          controller.escreverFicheiro(ficheiro);
                }
                MenuUI ui = new MenuUI(ce,u);
    }
    
}
