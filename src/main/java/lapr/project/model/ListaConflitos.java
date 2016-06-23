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
public class ListaConflitos {
    
    /**
     * lista com os conflitos de uma dada exposição ou demonstração.
     */
    
    List<Conflito> lc;

    /**
     * construtor sem parâmetros.
     */
    public ListaConflitos() {
        lc = new ArrayList<>();
    }

    /**
     * Método que guarda e retorna a lista de conflitos definitiva.
     *
     * @param lc
     * @return lista definitiva de atribuições.
     */
    public List registerConflitos(List lc) {
        this.lc = lc;
        return lc;
    }

    /**
     * Método que retorna um novo conflito.
     *
     * @param c
     * @param fae
     * @return conflito
     */
    public Conflito newConflito(CandidaturaGeral c, FAE fae) {
        return new Conflito(fae, c);
    }
    /**
     * Método que retorna um novo conflito.
     * @return conflito vazio
     */
    public Conflito newConflito(){
        return new Conflito();
    }


    /**
     * Método que retorna uma lista com os confito.
     *
     * @return
     */
    public List<Conflito> getLista() {
        return lc;
    }

    /**
     * Método que atualiza a lista de conflitos.
     *
     * @param lc
     */
    @XmlElement(name="conflito")
    public void setLista(List<Conflito> lc) {
        this.lc = lc;
    }
    
    public boolean addConflito(Conflito c) {
        return lc.add(c);
    }
    
    public List <Conflito> getListaConlitosFAE(Utilizador u){
        List <Conflito> lista = new ArrayList<>();
        for(Conflito c : lc){
            if(c.getFAE().equals(u)){
                lista.add(c);
            }
        }
        return lista;
    }
    
}
