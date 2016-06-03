/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author miniondevil
 */
public class CentroExposicoes {
/**
 * Registo com todos os tipos de conflitos.
 */
    private final RegistoTipoConflitos rc;

    public CentroExposicoes() {
        this.rc = new RegistoTipoConflitos();
    }
/**
 * Método que retorna o registo de tipos de conflito.
 * @return 
 */
    public RegistoTipoConflitos getRegistoTipoConflitos() {
        return rc;

    }
}
