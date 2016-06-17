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
public class RegistoTipoConflitos {

    /**
     * Lista com todos os tipos de conflitos.
     */
    @XmlElement(name="RegistoConflitos")
    private final List<TipoConflito> listaConflitos;

    /**
     * Construtor sem parâmetros.
     */
    public RegistoTipoConflitos() {
        this.listaConflitos = new ArrayList<>();
    }

    /**
     * Método que retorna a lista de tipos de conflitos.
     *
     * @return
     */
    public List<TipoConflito> getListaTipoConflitos() {
        return listaConflitos;
    }
    /**
     * Devolve a lista dos Tipos de Conflito que já possuem métodos de deteção, ou seja, que estão ativos.
     * @return lista tipos conflito ativos
     */
    public List <TipoConflito> getTiposConflitoAtivos(){
        List <TipoConflito> lista = new ArrayList <>();
        for(TipoConflito t : this.listaConflitos){
            if(!t.getListaMecanismos().isEmpty())
                lista.add(t);
        }
        return lista;
    }

    /**
     * Método que cria um novo tipo de conflito.
     *
     * @return
     */
    public TipoConflito newTipoConflito() {
        return new TipoConflito();
    }

    /**
     * Método que valida se o tipo de conflito é único.
     *
     * @param t
     * @return
     */
    public boolean validaTipo(TipoConflito t) {
        if(listaConflitos.isEmpty()){
            return true;
        }
        for (TipoConflito tipo : listaConflitos) {
            if (tipo.equals(t)) {
                return false;
            }

        }
        return true;
    }
}
