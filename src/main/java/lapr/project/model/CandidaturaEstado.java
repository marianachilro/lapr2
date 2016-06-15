/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author Rita
 */
public interface CandidaturaEstado {

    public boolean setEmSubmissao();

    public boolean setAlterada();

    public boolean setCompleta();

    public boolean setConflitosDetetados();

    public boolean setConflitosAlterados();

    public boolean setEmAvaliacao();

    public boolean setAvaliada();
    
    public boolean setNaoAvaliada();

    public boolean setAceite();
    
    public boolean setRejeitada();

    public boolean setConfirmarStand();
    
    public boolean setNaoConfirmarStand();
    
    public boolean setRemovida();
}
