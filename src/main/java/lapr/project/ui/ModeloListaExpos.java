/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.util.List;
import javax.swing.AbstractListModel;
import lapr.project.model.Exposicao;

/**
 *
 * @author Rita
 */
public class ModeloListaExpos extends AbstractListModel {
    
    private List<Exposicao> listaExp;
    
    public ModeloListaExpos(List<Exposicao> listaExp) {
        this.listaExp = listaExp;
    }

    @Override
    public int getSize() {
        return listaExp.size();
    }

    @Override
    public Object getElementAt(int index) {
        return listaExp.get(index);
    }
    
}
