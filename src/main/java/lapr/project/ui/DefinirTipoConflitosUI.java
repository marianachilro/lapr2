/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import javax.swing.JOptionPane;
import lapr.project.controller.DefinirTipoConflitosController;
import lapr.project.model.CentroExposicoes;

/**
 *
 * @author miniondevil
 */
public class DefinirTipoConflitosUI {
    private DefinirTipoConflitosController controller;
    public DefinirTipoConflitosUI(CentroExposicoes ce){
      controller = new DefinirTipoConflitosController(ce);
      controller.getListaConflitos();
      boolean b = controller.criaTipo("Representante é FAE", "O representante da candidatura é FAE na exposição");
      if(b){
      controller.addTipoConflito();
        JOptionPane.showMessageDialog(null, "O conflito foi criado");
    }else{
          JOptionPane.showMessageDialog(null,"Esse tipo de conflito já existe");
      }
    
}
}
