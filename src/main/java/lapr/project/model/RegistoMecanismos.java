/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author miniondevil
 */
public class RegistoMecanismos {

    private List<MecanismoAtribuicao> lm;

    public RegistoMecanismos() {
        lm = new ArrayList<MecanismoAtribuicao>();
    }

    public List<MecanismoAtribuicao> getListaMecanismos() {
        return lm;
    }
    public void setListaMecanismos(List<MecanismoAtribuicao> lm){
        this.lm=lm;
    }
}
