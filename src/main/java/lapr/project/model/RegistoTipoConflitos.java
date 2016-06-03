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
public class RegistoTipoConflitos {

    /**
     * Lista com todos os tipos de conflitos.
     */
    private List<TipoConflito> listaConflitos;

    /**
     * Construtor sem parâmetros.
     */
    public RegistoTipoConflitos() {
        this.listaConflitos = new ArrayList<TipoConflito>();
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
        for (TipoConflito tipo : listaConflitos) {
            if (tipo.equals(t)) {
                return false;
            }

        }
        return false;
    }
}
