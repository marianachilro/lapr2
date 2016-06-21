/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.util.List;
import javax.swing.AbstractListModel;
import lapr.project.model.Demonstracao;

/**
 *
 * @author marianachilro
 */
public class ModeloListaDemonstracoes extends AbstractListModel{

    private List<Demonstracao> listaDemos;
    
    public ModeloListaDemonstracoes(List <Demonstracao> lista){
        this.listaDemos=lista;
    }
    @Override
    public int getSize() {
        return this.listaDemos.size();
    }

    @Override
    public Object getElementAt(int index) {
        return this.listaDemos.get(index);
    }
    
}
