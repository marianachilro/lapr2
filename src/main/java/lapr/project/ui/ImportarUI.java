/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import lapr.project.controller.CarregarExposicoesController;
import lapr.project.model.CentroExposicoes;
import org.xml.sax.SAXException;

/**
 *
 * @author miniondevil
 */
public class ImportarUI {
    private final CarregarExposicoesController controller;
    public ImportarUI(CentroExposicoes ce) throws IOException, SAXException{      
        controller = new CarregarExposicoesController(ce);
           MyFileChooser fileChooser = new MyFileChooser();
                int resposta = fileChooser.showOpenDialog(null);
                if (resposta == JFileChooser.APPROVE_OPTION) {
                    File ficheiro = fileChooser.getSelectedFile();          
          controller.lerExpo(ficheiro);
          controller.addDados();
                }
    }
    
    }

