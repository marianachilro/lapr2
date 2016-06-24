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
public class CandidaturaGeral implements Candidatura {

    private String emailRep;
    private boolean decisao;
    private CandImpEstado estado;

    /**
     * Lista de avaliações da candidatura.
     */
    private ListaAvaliacoes listaAvaliacoes;
    /**
     * Lista de demonstracoes da candidatura.
     */
    private ListaDemonstracoes listaDemonstracoes;

    private static final String EMAIL_OMISSAO = "";

    public CandidaturaGeral() {
        this.emailRep = EMAIL_OMISSAO;
        listaDemonstracoes = new ListaDemonstracoes();
        listaAvaliacoes = new ListaAvaliacoes();
        estado = new CandidaturaInicialEstado(this);
        decisao = false;

    }

    public CandidaturaGeral(String email) {
        this.emailRep = email;
        listaDemonstracoes = new ListaDemonstracoes();
        listaAvaliacoes = new ListaAvaliacoes();
        estado = new CandidaturaInicialEstado(this);
        decisao = false;
    }

    public CandidaturaGeral(CandidaturaGeral c) {
        this.emailRep = c.getEmailRep();
        this.decisao = c.getDecisao();
        this.listaDemonstracoes = new ListaDemonstracoes(c.getListaDemonstracoes());
        this.listaAvaliacoes = new ListaAvaliacoes(c.getListaAvaliacoes());
        estado = new CandidaturaAlteradaEstado(this);
    }

    @Override
    public String getEmailRep() {
        return emailRep;
    }

    @Override
    @XmlElement
    public void setEmailRep(String email) {
        this.emailRep = email;
    }

    @Override
    public ListaAvaliacoes getListaAvaliacoes() {
        return listaAvaliacoes;
    }

    @XmlElement(name = "Avaliacoes")
    @Override
    public void setListaAvaliacoes(ListaAvaliacoes lista) {
        listaAvaliacoes = lista;
    }

    @Override
    @XmlElement(name = "aceite")
    public void setDecisao(boolean decisao) {
        this.decisao = decisao;
    }

    @Override
    public boolean getDecisao() {
        return decisao;
    }

    @Override
    public CandImpEstado getEstado() {
        return estado;
    }

    @Override
    @XmlElement
    public void setEstado(CandImpEstado estado) {
        this.estado = estado;
    }

    @Override
    public boolean validaAvaliacao(Avaliacao ac) {
        return true;
    }

    @Override
    public boolean verificarEstadoAtribuida() {
        return true;
    }

    @Override
    public boolean verificarEstadoAvaliada() {
        return true;
    }

    @Override
    public boolean valida() {
        return true;
    }

    public String toString() {
        return String.format("Representante: %s", emailRep);
    }

    public ListaDemonstracoes getListaDemonstracoes() {
        return listaDemonstracoes;
    }

    public void setListaDemonstracoes(ListaDemonstracoes listaDemonstracoes) {
        this.listaDemonstracoes = listaDemonstracoes;
    }

}
