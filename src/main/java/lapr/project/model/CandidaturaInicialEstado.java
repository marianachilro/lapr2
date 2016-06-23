/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Representa um dos Estados possíveis da Candidatura (Estado de "Inicial").
 * @author miniondevil
 */
public class CandidaturaInicialEstado extends CandImpEstado{
    /**
     * Contrutor do Estado de "Inicial" da Candidatura.
     *
     * @param candidatura a candidatura que vai transitar de estado
     */
    public CandidaturaInicialEstado(CandidaturaGeral cand){
        super(cand);
    }
    
    /**
     * Método que muda o estado da Candidatura para o Estado "Em Submissao".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setEmSubmissao() {

        if (valida()) {
            super.getCandidatura().setEstado(new CandidaturaEmSubmissaoEstado(super.getCandidatura()));
            return true;
        }
        return false;
    }

    /**
     * Verifica se a Candidatura pode mudar para o Estado "Em Submissao".
     *
     * @return false, se não puder mudar para esse estado e true, se for
     * possível mudar
     */
    public boolean valida() {

        return super.getCandidatura().valida();
    }
    
}
