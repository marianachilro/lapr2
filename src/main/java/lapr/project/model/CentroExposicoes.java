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
    private final RegistoExposicoes re;
    private final RegistoUtilizadores ru;
    private final RegistoStands rs;

    public CentroExposicoes() {
        this.rc = new RegistoTipoConflitos();
        this.re = new RegistoExposicoes();
        this.ru = new RegistoUtilizadores();
        this.rs = new RegistoStands();
    }
/**
 * Método que retorna o registo de tipos de conflito.
 * @return 
 */
    public RegistoTipoConflitos getRegistoTipoConflitos() {
        return rc;

    }

    public RegistoExposicoes getRegistoExposicoes() {
        return re;
    }
    
    public RegistoUtilizadores getRegistoUtilizadores() {
        return ru;
    }
    
    public RegistoStands getRegistoStands() {
        return rs;
    }
}
