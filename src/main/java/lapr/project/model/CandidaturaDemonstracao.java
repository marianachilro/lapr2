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
public class CandidaturaDemonstracao implements Candidatura, Removivel {

    private String emailRep;
    private boolean decisao;
    private Demonstracao demonstracao;
    private CandidaturaEstado estado;
    public final ListaAvaliacoes listaAvaliacoes;

    /**
     * Construtor de uma candidatura com todos os atributos por omissão.
     */
    public CandidaturaDemonstracao() {
        this.demonstracao = null;
        this.decisao = false;
        this.listaAvaliacoes = new ListaAvaliacoes();
    }

    /**
     * Construtor de uma candidatura com todos os atributos recebidos por
     * parâmetro.
     *
     *
     * @param emailRep email de representante
     * @param demonstracao demonstracao da candidatura
     */
    public CandidaturaDemonstracao(String emailRep, Demonstracao demonstracao) {
        this.emailRep = emailRep;
        this.demonstracao = demonstracao;
        this.listaAvaliacoes = new ListaAvaliacoes();
        this.decisao = false;
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
    public void setDecisao(boolean decisao) {
        this.decisao = decisao;
    }

    @Override
    public boolean getDecisao() {
        return decisao;
    }

    public Demonstracao getDemonstracao() {
        return demonstracao;
    }

    public void setDemonstracao(Demonstracao demonstracao) {
        this.demonstracao = demonstracao;
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
        if (!(obj instanceof CandidaturaDemonstracao)) {
            return false;
        }

        final CandidaturaDemonstracao other = (CandidaturaDemonstracao) obj;

        return this.listaAvaliacoes.getListaAvaliacao().equals(other.getListaAvaliacoes().getListaAvaliacao()) && this.decisao==other.getDecisao();
    }

    @Override
    public String toString() {
        return this.emailRep+ "";
    }

    @Override
    public boolean validaAvaliacao(Avaliacao ac) {
        //falta validação
        return true;
    }

    @Override
    public boolean verificarEstadoAtribuida() {
        //falta verificacoes
        return true;
    }

    @Override
    public boolean verificarEstadoAvaliada() {
        //falta verificacoes
        return true;
    }

    @Override
    public boolean setRemovida() {
        return estado.setRemovida();
    }

}
