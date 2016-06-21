/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author catarinarib
 */
public interface Candidatura {

    /**
     * Devolve o e-mail do representante da candidatura.
     *
     * @return e-mail de representante
     */
    public String getEmailRep();
    
    public void setEmailRep(String email);
    
    public ListaAvaliacoes getListaAvaliacoes();
    
    public void setDecisao(boolean decisao);
    
    public boolean getDecisao();
    
    public CandidaturaEstado getEstado();
    
    public void setEstado(CandidaturaEstado estado);
    
    @Override
    public String toString();
    
    public boolean validaAvaliacao(Avaliacao ac);
    
    public boolean verificarEstadoAtribuida();
    
    public boolean verificarEstadoAvaliada();

    public boolean valida();
}
