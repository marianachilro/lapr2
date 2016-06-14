/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.GregorianCalendar;
import lapr.project.utils.Data;

/**
 * Representa um dos Estados possíveis da Demonstração (Estado de "Confirmada").
 *
 * @author marianachilro
 */
public class DemonstracaoConfirmadaEstado extends DemoImpEstado {

    /**
     * Contrutor do Estado de Confirmada da Demonstração.
     *
     * @param demonstracao a demonstração que vai transitar de estado
     */
    public DemonstracaoConfirmadaEstado(Demonstracao demonstracao) {
        super(demonstracao);
    }

    /**
     * Método que indica que a Demonstração está no Estado "Confirmada".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setConfirmada() {
        return true;
    }

    /**
     * Método que muda o estado da Demonstração para o Estado "Candidaturas
     * Abertas".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setCandidaturasAbertas() {
        if (valida()) {
            super.getDemo().setEstado(new DemonstracaoCandidaturasAbertasEstado(super.getDemo()));
            return true;
        }
        return false;
    }

    /**
     * Verifica se a Demonstração pode mudar para o Estado "Candidaturas
     * Abertas".
     *
     * @return false, se não puder mudar para esse estado e true, se for
     * possível mudar
     */
    public boolean valida() {
        int diaHoje = GregorianCalendar.DAY_OF_MONTH;
        int mesHoje = GregorianCalendar.MONTH;
        int anoHoje = GregorianCalendar.YEAR;
        Data dataHoje = new Data(anoHoje, mesHoje, diaHoje);
        if (dataHoje.isMaior(super.getDemo().getDataInicioSubmissaoCandidaturas())) {
            return true;
        }
        return false;
    }

}
