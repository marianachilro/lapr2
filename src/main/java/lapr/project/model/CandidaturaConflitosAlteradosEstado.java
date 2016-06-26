/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Representa um dos Estados possíveis da Candidatura (Estado de "Conflitos Alterados").
 * @author Rita
 */
public class CandidaturaConflitosAlteradosEstado extends CandImpEstado {

    /**
     * Contrutor do Estado de "Conflitos Alterados" da Candidatura.
     *
     * @param cand a candidatura que vai transitar de estado
     */
    public CandidaturaConflitosAlteradosEstado(CandidaturaGeral cand) {
        super(cand,"candidaturaConflitosAlterados");
    }

    /**
     * Método que indica que a Candidatura está no Estado "Conflitos Alterados".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setConflitosAlterados() {
        return true;
    }

    /**
     * Método que muda o estado da Candidatura para o Estado "Em Avaliação".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setEmAvaliacao() {
        if (valida()) {
            super.getCandidatura().setEstado(new CandidaturaEmAvaliacaoEstado(super.getCandidatura()));
            return true;
        } else {
            return false;
        }
    }

    /**
     * Verifica se a Candidatura pode mudar para o Estado "Em Avaliação".
     *
     * @return false, se não puder mudar para esse estado e true, se for
     * possível mudar
     */
    private boolean valida() {
        return super.getCandidatura().getEstado().setConflitosAlterados();
    }

}
