/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.util.List;
import javax.swing.AbstractListModel;
import lapr.project.model.Utilizador;

/**
 *
 * @author Rita
 */
public class ModeloListaUtilizadores extends AbstractListModel {

    private List<Utilizador> listaUtilizadores;
    
    public ModeloListaUtilizadores(List<Utilizador> listaUtilizadores) {
        this.listaUtilizadores = listaUtilizadores;
    }
    
    @Override
    public int getSize() {
        return listaUtilizadores.size();
    }

    @Override
    public Object getElementAt(int index) {
        return listaUtilizadores.get(index);
    }
    
}
