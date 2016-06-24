/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author miniondevil
 */
@XmlRootElement
public class CentroExposicoes {

    /**
     * Registo com todos os tipos de conflitos.
     */
    private RegistoTipoConflitos rc;
    /**
     * Registo com todas as exposições.
     */

    private RegistoExposicoes re;
    /**
     * Registo com todos os utilizadores confirmados.
     */

    private RegistoUtilizadores ru;

    /**
     * Registo com todos os utilizadores não confirmados.
     */
    private RegistoUtilizadores ruNaoConf;
    /**
     * Registo com todos os stands.
     */
    private RegistoStands rs;

    /**
     * Registo de locais do centro
     */
    private RegistoLocais rl;

    /**
     * Registo de recursos do centro
     */
    private RegistoRecursos rr;

    /**
     * Registo ocm todos os mecanismos.
     */
    private RegistoMecanismos rm;

    /**
     * Construtor de um Centro de Exposições.
     */
    public CentroExposicoes() {
        this.rc = new RegistoTipoConflitos();
        this.re = new RegistoExposicoes();
        this.ru = new RegistoUtilizadores();
        this.ruNaoConf = new RegistoUtilizadores();
        this.rs = new RegistoStands();
        this.rl = new RegistoLocais();
        this.rr = new RegistoRecursos();
        rm = new RegistoMecanismos();
    }

    public CentroExposicoes(RegistoTipoConflitos rc, RegistoExposicoes re, RegistoUtilizadores ru, RegistoUtilizadores ruNaoConf, RegistoStands rs, RegistoLocais rl, RegistoRecursos rr, RegistoMecanismos rm) {
        this.rc = rc;
        this.re = re;
        this.ru = ru;
        this.ruNaoConf = ruNaoConf;
        this.rs = rs;
        this.rl = rl;
        this.rr = rr;
        this.rm = rm;

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
     * Modifica o registo de exposicoes do centro de exposicoes
     *
     * @param re novo registo de exposicoes
     */
    @XmlElement(name = "registoExposicoes")
    public void setRegistoExposicoes(RegistoExposicoes re) {
        this.re = re;
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
     * Modifica o registo de utilizadores do centro de exposicoes
     *
     * @param ru novo registo de utilizadores do centro de exposicoes
     */
    @XmlElement(name = "registoUtilizadoresConfirmados")
    public void setRegistoUtilizadores(RegistoUtilizadores ru) {
        this.ru = ru;
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
     * Modifica o registo de Stands do centro de exposicoes
     *
     * @param rs novo registo de stands do centro de exposicoes
     */
    @XmlElement(name = "stands")
    public void setRegistoStands(RegistoStands rs) {
        this.rs = rs;
    }

    /**
     * Devolve o registo de todos os locais.
     *
     * @return Registo de locais
     */
    
    public RegistoLocais getRegistoLocais() {
        return rl;
    }

    /**
     * Modifica registo de locais do centro de exposicoes
     *
     * @param rl novo registo de llocais do centro de exposicoes
     */
    @XmlElement(name = "locais")
    public void setRegistoLocais(RegistoLocais rl) {
        this.rl = rl;
    }

    /**
     * Devolve o registo de recursos do centro de exposicoes
     *
     * @return registo de recursos do centro
     */
    public RegistoRecursos getRegistoRecursos() {
        return rr;
    }

    /**
     * Modifica o registo de recursos do centro de exposicoes
     *
     * @param rr novo registo de recursos do centro
     */
    @XmlElement(name = "recursos")
    public void setRegistoRecursos(RegistoRecursos rr) {
        this.rr = rr;
    }

    /**
     * Devolve o registo de mecanismos do centro de exposicoes
     *
     * @return registo de mecanismos do centro
     */
    public RegistoMecanismos getRegistoMecanismos() {
        return rm;
    }

    @XmlElement(name = "mecanismos")
    public void setRegistoMecanismos(RegistoMecanismos rm) {
        this.rm = rm;
    }

    /**
     * Modifica o registo de tipo de conflitos do centro
     *
     * @param rc novo registo de conflitos
     */
    @XmlElement(name = "registoTipoConflitos")
    public void setRegistoTipoConflitos(RegistoTipoConflitos rc) {
        this.rc = rc;
    }

    /**
     * Devolve o registo de todos os utilizadores não confirmados.
     *
     * @return registo de utilizadores não confirmados
     */
    public RegistoUtilizadores getRegistoUtilizadoresNaoConfirmados() {
        return ruNaoConf;
    }

    /**
     * Modifica o registo de utilizadores não confirmados
     *
     * @param ruNaoConf novo registo de utilizadores não confirmados
     */
    @XmlElement(name = "registoUtilizadoresNaoConfirmados")
    public void setRegistoUtilizadoresNaoConfirmados(RegistoUtilizadores ruNaoConf) {
        this.ruNaoConf = ruNaoConf;
    }
}
