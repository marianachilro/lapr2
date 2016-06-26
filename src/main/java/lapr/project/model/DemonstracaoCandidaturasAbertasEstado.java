/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.GregorianCalendar;
import lapr.project.utils.Data;

/**
 * Representa um dos Estados possíveis da Demonstração (Estado de "Candidaturas
 * Abertas").
 *
 * @author marianachilro
 */
public class DemonstracaoCandidaturasAbertasEstado extends DemoImpEstado {

    /**
     * Contrutor do Estado de Candidaturas Abertas da Demonstração.
     *
     * @param demonstracao a demonstração que vai transitar de estado
     */
    public DemonstracaoCandidaturasAbertasEstado(Demonstracao demonstracao) {
        super(demonstracao,"demonstracaoCandidaturasAbertas");
    }

    
    @Override
    public boolean setCandidaturasAbertas() {
        return true;
    }

    /**
     * Método que indica que muda o estado da Demonstração para o Estado
     * "Candidaturas Fechadas".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setCandidaturasFechadas() {
        if (valida()) {
            super.getDemo().setEstado(new DemonstracaoCandidaturasFechadasEstado(super.getDemo()));
            return true;
        }
        return false;

    }

    /**
     * Verifica se a Demonstração pode mudar para o Estado "Candidaturas
     * Fechadas".
     *
     * @return false, se não puder mudar para esse estado e true, se for
     * possível mudar
     */
    public boolean valida() {
        return super.getDemo().getEstado().setCandidaturasAbertas();
    }

}
