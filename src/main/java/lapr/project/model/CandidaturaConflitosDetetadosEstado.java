/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Representa um dos Estados possíveis da Candidatura (Estado de "Conflitos Detetados").
 * @author Rita
 */
public class CandidaturaConflitosDetetadosEstado extends CandImpEstado {

    /**
     * Contrutor do Estado de "Conflitos Detetados" da Candidatura.
     *
     * @param cand a candidatura que vai transitar de estado 
     */
    public CandidaturaConflitosDetetadosEstado(CandidaturaGeral cand) {
        super(cand,"candidaturaConflitosDetetados");
    }

    /**
     * Método que indica que a Candidatura está no Estado "Conflitos Detetados".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setConflitosDetetados() {
        return true;
    }

    /**
     * Método que muda o estado da Candidatura para o Estado "Conflitos Alterados".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setConflitosAlterados() {
        if (valida()) {
            super.getCandidatura().setEstado(new CandidaturaConflitosAlteradosEstado(super.getCandidatura()));
            return true;
        } else {
            return false;
        }
    }

    /**
     * Verifica se a Candidatura pode mudar para o Estado "Conflitos Alterados".
     *
     * @return false, se não puder mudar para esse estado e true, se for
     * possível mudar
     */
    private boolean valida() {
        return super.getCandidatura().getEstado().setConflitosDetetados();
    }

}
