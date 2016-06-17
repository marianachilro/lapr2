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
 * @author catarinarib
 */
@XmlRootElement
public class RegistoLocais {

    /**
     * Lista de locais.
     */
    @XmlElement(name="locais")
    private List<Local> listaLocais;

    /**
     * Construtor de um registo de locais.
     */
    public RegistoLocais() {
        this.listaLocais = new ArrayList<>();
    }

    /**
     * Devolde a lista de locais do centro de exposições.
     *
     * @return lista locais
     */
    public List<Local> getListaLocais() {
        return listaLocais;
    }

    /**
     * Modifica a lista de locais do centro de exposições.
     *
     * @param listaLocais
     */
    public void setListaLocais(List<Local> listaLocais) {
        this.listaLocais = listaLocais;
    }

    public boolean addLocal(Local l) {
        return listaLocais.add(l);
    }

    public boolean validaLocal(Local l) {
        if (!listaLocais.isEmpty()) {
            return listaLocais.contains(l);
        } else {
            return false;
        }
    }

    public boolean registaLocal(Local l) {
        if (!validaLocal(l)) {
            addLocal(l);
            return true;
        } else {
            return false;
        }
    }

}
