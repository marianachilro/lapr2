/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.io.File;
import javax.swing.JFileChooser;
import lapr.project.controller.CarregarExposicoesController;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Utilizador;

/**
 *
 * @author miniondevil
 */
public class ImportarUI {
    private final CarregarExposicoesController controller;
    public ImportarUI(CentroExposicoes ce,  Utilizador u){      
        controller = new CarregarExposicoesController(ce);
           MyFileChooser fileChooser = new MyFileChooser();
                int resposta = fileChooser.showOpenDialog(null);
                if (resposta == JFileChooser.APPROVE_OPTION) {
                    File ficheiro = fileChooser.getSelectedFile();          
          controller.lerExpo(ficheiro);
          controller.addDados();
                }
                MenuUI ui = new MenuUI(ce,u);
    }
    
    }

