/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Representa um dos Estados possíveis da Candidatura (Estado de "Em
 * Submissão").
 *
 * @author Rita
 */
public class CandidaturaEmSubmissaoEstado extends CandImpEstado {

    /**
     * Contrutor do Estado de "Em Submissão" da Candidatura.
     *
     * @param cand a candidatura que vai transitar de estado
     */
    public CandidaturaEmSubmissaoEstado(CandidaturaGeral cand) {
        super(cand,"candidaturaEmSubmissao");
    }

    /**
     * Método que indica que a Candidatura está no Estado "Em Submissão".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setEmSubmissao() {
        return true;
    }

    /**
     * Método que muda o estado da Candidatura para o Estado "Alterada".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setAlterada() {
        if (valida()) {
            super.getCandidatura().setEstado(new CandidaturaAlteradaEstado(super.getCandidatura()));
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método que muda o estado da Candidatura para o Estado "Completa".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setCompleta() {
        if (valida()) {
            super.getCandidatura().setEstado(new CandidaturaCompletaEstado(super.getCandidatura()));
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método que muda o estado da Candidatura para o Estado "Removida".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setRemovida() {
        if (valida()) {
            super.getCandidatura().setEstado(new CandidaturaRemovidaEstado(super.getCandidatura()));
            return true;
        } else {
            return false;
        }
    }

    /**
     * Verifica se a Candidatura pode mudar para o Estado "Alterada", "Completa" ou "Removida".
     *
     * @return false, se não puder mudar para esse estado e true, se for
     * possível mudar
     */
    private boolean valida() {
        return super.getCandidatura().getEstado().setEmSubmissao();
    }

}
