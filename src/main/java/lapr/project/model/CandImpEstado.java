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
public class CandImpEstado implements CandidaturaEstado {

   /**
    * Candidatura a que o estado se refere
    */
    @XmlElement
    private final CandidaturaGeral cand;
    
   

    public CandImpEstado(CandidaturaGeral cand) {
        this.cand = cand;
    }
    
 public CandidaturaGeral getCandidatura(){
        return cand;
    }
    
    @Override
    public boolean setEmSubmissao() {
        return false;
    }

    @Override
    public boolean setAlterada() {
        return false;
    }

    @Override
    public boolean setCompleta() {
        return false;
    }

    @Override
    public boolean setConflitosDetetados() {
        return false;
    }

    @Override
    public boolean setConflitosAlterados() {
        return false;
    }

    @Override
    public boolean setEmAvaliacao() {
        return false;
    }

    @Override
    public boolean setAvaliada() {
        return false;
    }

    @Override
    public boolean setNaoAvaliada() {
        return false;
    }

    @Override
    public boolean setAceite() {
        return false;
    }

    @Override
    public boolean setRejeitada() {
        return false;
    }

    @Override
    public boolean setConfirmarStand() {
        return false;
    }

    @Override
    public boolean setNaoConfirmarStand() {
        return false;
    }

    @Override
    public boolean setRemovida() {
        return false;
    }


}
