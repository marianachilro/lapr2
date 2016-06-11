/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.Objects;

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

    @Override
    public CandidaturaEstado getEstado() {
        return estado;
    }

    @Override
    public void setEstado(CandidaturaEstado estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.emailRep);
        hash = 61 * hash + Objects.hashCode(this.decisao);
        hash = 61 * hash + Objects.hashCode(this.estado);
        hash = 61 * hash + Objects.hashCode(this.listaAvaliacoes);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CandidaturaDemonstracao other = (CandidaturaDemonstracao) obj;
        if (!Objects.equals(this.emailRep, other.emailRep)) {
            return false;
        }
        if (!Objects.equals(this.decisao, other.decisao)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        return Objects.equals(this.listaAvaliacoes, other.listaAvaliacoes);
    }
    
    @Override
    public String toString(){
        return "";
    }
    
    @Override
     public boolean validaAvaliacao(Avaliacao ac){
         //falta validação
         return true;
     }
     
    @Override
     public boolean verificarEstadoAtribuida(){
         //falta verificacoes
         return true;
     }
     
    @Override
     public boolean verificarEstadoAvaliada(){
         //falta verificacoes
         return true;
     }

}
