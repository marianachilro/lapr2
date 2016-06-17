/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author miniondevil
 */
@XmlRootElement
public class RegistoMecanismos {
    /**
     * Lista com os mecanismos de atribuicao.
     */
@XmlElement(name="mecanismos")
    private List<MecanismoAtribuicao> lm;
/**
 * construtor vazio.
 */
    public RegistoMecanismos() {
        lm = new ArrayList<>();
    }
/**
 * Método que retorna a lista de mecanismos de atribuição.
 * @return 
 */
    public List<MecanismoAtribuicao> getListaMecanismos() {
        return lm;
    }
    /**
     * Método que modifica a lista de mecanismos de atribuição.
     * @param lm 
     */
    public void setListaMecanismos(List<MecanismoAtribuicao> lm){
        this.lm=lm;
    }
}
