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
public class CandImpEstado implements CandidaturaEstado {

    private final Candidatura cand;
    public Candidatura getCandidatura(){
        return cand;
    }

    public CandImpEstado(Candidatura cand) {
        this.cand = cand;
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
