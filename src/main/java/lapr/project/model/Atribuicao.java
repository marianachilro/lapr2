/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.Objects;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author catarinarib
 */
@XmlRootElement
public class Atribuicao {

    /**
     * FAE ao qual vai ser atribuido a candidatura.
     */
    FAE fae;
    /**
     * Candidatura que vai ser atribuida ao FAE.
     */
    CandidaturaGeral c;

    /**
     * Construtor que tem como parametros o FAE e a Candidatura.
     *
     * @param fae
     * @param c
     */
    public Atribuicao(FAE fae, CandidaturaGeral c) {
        this.fae = fae;
        this.c = c;
    }

    public Atribuicao() {
        fae = new FAE();
        c = new CandidaturaGeral();
    }

    /**
     * Método que retorna o FAE atribuido.
     *
     * @return
     */
    public FAE getFAE() {
        return fae;
    }

    /**
     * Método que modifica o FAE atribuido.
     *
     * @param fae
     */
    @XmlElement
    public void setFAE(FAE fae) {
        this.fae = fae;
    }

    /**
     * Método que retorna a candidatura atribuida.
     *
     * @return
     */
    public CandidaturaGeral getCandidatura() {
        return c;
    }

    /**
     * Método que modifica a candidatura atribuida.
     *
     * @param c
     */
    @XmlElement(name = "candidatura")
    public void setCandidatura(CandidaturaGeral c) {
        this.c = c;
    }

    /**
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        Atribuicao a = (Atribuicao) o;
        return this.c.equals(a.getCandidatura()) && this.fae.equals(a.getFAE());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.fae);
        hash = 67 * hash + Objects.hashCode(this.c);
        return hash;
    }

}
