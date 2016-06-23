/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Representa um dos Estados possíveis da Candidatura (Estado de "Em Avaliação").
 * @author Rita
 */
public class CandidaturaEmAvaliacaoEstado extends CandImpEstado {

    /**
     * Contrutor do Estado de "Em Avaliação" da Candidatura.
     *
     * @param candidatura a candidatura que vai transitar de estado
     */
    public CandidaturaEmAvaliacaoEstado(CandidaturaGeral cand) {
        super(cand);
    }

    /**
     * Método que indica que a Candidatura está no Estado "Em Avaliação".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setEmAvaliacao() {
        return true;
    }

    /**
     * Método que muda o estado da Candidatura para o Estado "Avaliada".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setAvaliada() {
        if (valida()) {
            super.getCandidatura().setEstado(new CandidaturaAvaliadaEstado(super.getCandidatura()));
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Método que muda o estado da Candidatura para o Estado "Não Avaliada".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setNaoAvaliada() {
        if(valida()) {
            super.getCandidatura().setEstado(new CandidaturaNaoAvaliadaEstado(super.getCandidatura()));
            return true;
        } else {
            return false;
        }
    }

    /**
     * Verifica se a Candidatura pode mudar para o Estado "Avaliada" ou "Não Avaliada".
     *
     * @return false, se não puder mudar para esse estado e true, se for
     * possível mudar
     */
    private boolean valida() {
        return super.getCandidatura().getEstado().setEmAvaliacao();
    }

}
