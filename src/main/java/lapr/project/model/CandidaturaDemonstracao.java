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
public class CandidaturaDemonstracao extends CandidaturaGeral implements Removivel, Atribuivel {

    /**
     * Contador do numero de decisoes
     */
    private int contador;

    /**
     * Construtor de uma candidatura com todos os atributos por omissão.
     */
    public CandidaturaDemonstracao() {

        super();
        this.contador = 0;
    }

    /**
     * Construtor de uma candidatura com todos os atributos recebidos por
     * parâmetro.
     *
     *
     * @param emailRep email de representante
     */
    public CandidaturaDemonstracao(String emailRep) {
        super(emailRep);
        this.contador = 0;
    }


    /**
     * Devolve o contador do numero de decisoes
     *
     * @return
     */
    public int getContador() {
        return contador;
    }

    /**
     * Modifica o contador do numero de decisoes
     *
     * @param contador
     */
    @XmlElement
    public void setContador(int contador) {
        this.contador = contador;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(super.getEmailRep());
        hash = 61 * hash + Objects.hashCode(super.getDecisao());
        hash = 61 * hash + Objects.hashCode(super.getEstado());
        hash = 61 * hash + Objects.hashCode(super.getListaAvaliacoes());
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

        return super.getListaAvaliacoes().getListaAvaliacao().equals(other.getListaAvaliacoes().getListaAvaliacao()) && super.getDecisao() == other.getDecisao() && super.getEmailRep().equals(other.getEmailRep());
    }

    @Override
    public String toString() {
        return super.getEmailRep() + "";
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
        return super.getEstado().setRemovida();
    }

    @Override
    public boolean valida() {
        //faltam as validações
        return true;
    }

}
