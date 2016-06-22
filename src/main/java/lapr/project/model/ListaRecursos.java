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
 * @author Rita
 */
@XmlRootElement
public class ListaRecursos {

    private List<Recurso> listaRecursos;

    public ListaRecursos() {
        this.listaRecursos = new ArrayList<>();
    }

    public List<Recurso> getListaRecursos() {
        return listaRecursos;
    }

    @XmlElement(name = "registoRecursos")
    public void setListaRecursos(List<Recurso> listaRecursos) {
        this.listaRecursos = listaRecursos;
    }

    public Recurso novoRecurso() {
        return new Recurso();
    }

    public boolean validaRecurso(Recurso r) {
        if (!listaRecursos.isEmpty()) {
            return listaRecursos.contains(r);
        } else {
            return false;
        }
    }

    public boolean addRecurso(Recurso r) {
        return listaRecursos.add(r);
    }

    public boolean registaRecurso(Recurso r) {
        if (!validaRecurso(r)) {
            return addRecurso(r);
        } else {
            return false;
        }
    }
}
