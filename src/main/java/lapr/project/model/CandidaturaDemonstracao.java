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
public class CandidaturaDemonstracao implements Candidatura {

    private String emailRep;
    private String decisao;
    private CandidaturaEstado estado;
    public final ListaAvaliacoes listaAvaliacoes;
    

    /**
     * Construtor de uma candidatura com todos os atributos por omissão.
     */
    public CandidaturaDemonstracao() {
        listaAvaliacoes = new ListaAvaliacoes();
    }

    /**
     * Construtor de uma candidatura com todos os atributos recebidos por
     * parâmetro.
     *
     *
     * @param emailRep email de representante
     */
    public CandidaturaDemonstracao(String emailRep) {
        this.emailRep = emailRep;
        listaAvaliacoes = new ListaAvaliacoes();
    }

    @Override
    public String getEmailRep() {
        return emailRep;
    }

    @Override
    public void setEmailRep(String email) {
        this.emailRep = email;
    }

    @Override
    public ListaAvaliacoes getListaAvaliacoes() {
        return listaAvaliacoes;
    }

    @Override
    public void setDecisao(String decisao) {
        this.decisao = decisao;
    }

    @Override
    public String getDecisao() {
        return decisao;
    }
    
    public CandidaturaEstado getEstado() {
        return estado;
    }
    
    public void setEstado(CandidaturaEstado estado) {
        this.estado = estado;
    }

}
