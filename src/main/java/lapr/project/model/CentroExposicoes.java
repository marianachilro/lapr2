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
    private  RegistoTipoConflitos rc;
    /**
     * Registo com todas as exposições.
     */
    private final RegistoExposicoes re;
    /**
     * Registo com todos os utilizadores.
     */
    private final RegistoUtilizadores ru;
    /**
     * Registo com todos os stands.
     */
    private final RegistoStands rs;

    private final RegistoLocais rl;
    
    private final RegistoRecursos rr;
    
    /**
     * Registo ocm todos os mecanismos.
     */
    private final RegistoMecanismos rm;

    /**
     * Construtor de um Centro de Exposições.
     */
    public CentroExposicoes() {
        this.rc = new RegistoTipoConflitos();
        this.re = new RegistoExposicoes();
        this.ru = new RegistoUtilizadores();
        this.rs = new RegistoStands();
        this.rl = new RegistoLocais();
        this.rr = new RegistoRecursos();
        rm = new RegistoMecanismos();
    }

    /**
     * Método que retorna o registo de tipos de conflito.
     *
     * @return
     */
    public RegistoTipoConflitos getRegistoTipoConflitos() {
        return rc;

    }

    /**
     * Devolve o registo de todas as exposições.
     *
     * @return Registo das Exposições
     */
    public RegistoExposicoes getRegistoExposicoes() {
        return re;
    }

    /**
     * Devolve o registo de todos os utilizadores
     *
     * @return Registo De Utilizadores
     */
    public RegistoUtilizadores getRegistoUtilizadores() {
        return ru;
    }

    /**
     * Devolve o registo de todos os stands.
     *
     * @return Registo de Stands
     */
    public RegistoStands getRegistoStands() {
        return rs;
    }

    /**
     * Devolve o registo de todos os locais.
     *
     * @return Registo de locais
     */
    public RegistoLocais getRegistoLocais() {
        return rl;
    }
    
    public RegistoRecursos getRegistoRecursos(){
        return rr;
    }
    
    public RegistoMecanismos getRegistoMecanismos(){
        return rm;
    }
    public void setRegistoTipoConflitos(RegistoTipoConflitos rc){
        this.rc=rc;
    }
}
