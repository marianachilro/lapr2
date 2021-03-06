/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Representa um dos Estados possíveis da Candidatura (Estado de "Alterada").
 * @author Rita
 */
public class CandidaturaAlteradaEstado extends CandImpEstado {

    /**
     * Contrutor do Estado de "Alterada" da Candidatura.
     *
     * @param cand a candidatura que vai transitar de estado
     */
    public CandidaturaAlteradaEstado(CandidaturaGeral cand) {
        super(cand,"candidaturaAlterada");
    }

    /**
     * Método que indica que a Candidatura está no Estado "Alterada".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setAlterada() {
        return true;
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
        if(valida()) {
            super.getCandidatura().setEstado(new CandidaturaRemovidaEstado(super.getCandidatura()));
            return true;
        } else {
            return false;
        }
    }

    /**
     * Verifica se a Candidatura pode mudar para o Estado "Completa" ou "Removida".
     *
     * @return false, se não puder mudar para esse estado e true, se for
     * possível mudar
     */
    private boolean valida() {
        return super.getCandidatura().getEstado().setAlterada();
    }

}
