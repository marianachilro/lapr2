/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Representa um dos Estados possíveis da Candidatura (Estado de "Completa").
 * @author Rita
 */
public class CandidaturaCompletaEstado extends CandImpEstado {

    /**
     * Contrutor do Estado de "Completa" da Candidatura.
     *
     * @param cand a candidatura que vai transitar de estado
     */
    public CandidaturaCompletaEstado(CandidaturaGeral cand) {
        super(cand);
    }

    /**
     * Método que indica que a Candidatura está no Estado "Completa".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setCompleta() {
        return true;
    }

    /**
     * Método que muda o estado da Candidatura para o Estado "Conflitos Detetados".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setConflitosDetetados() {
        if(valida()){
            super.getCandidatura().setEstado(new CandidaturaConflitosDetetadosEstado(super.getCandidatura()));
            return true;
        } else {
            return false;
        }
    }

    /**
     * Verifica se a Candidatura pode mudar para o Estado "Conflitos Detetados".
     *
     * @return false, se não puder mudar para esse estado e true, se for
     * possível mudar
     */
    private boolean valida() {
        return super.getCandidatura().getEstado().setCompleta();
    }

}
