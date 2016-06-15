/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.GregorianCalendar;
import lapr.project.utils.Data;

/**
 * Representa um dos Estados possíveis da Demonstração (Estado de "Conflitos
 * Detetados").
 *
 * @author marianachilro
 */
public class DemonstracaoConflitosDetetadosEstado extends DemoImpEstado {

    /**
     * Contrutor do Estado de "Conflitos Detetados" da Demonstração.
     *
     * @param demonstracao a demonstração que vai transitar de estado
     */
    public DemonstracaoConflitosDetetadosEstado(Demonstracao demonstracao) {
        super(demonstracao);
    }

    /**
     * Método que indica que a Demonstração está no Estado "Conflitos
     * Detetados".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setConflitosDetetados() {
        return true;
    }

    /**
     * Método que muda o estado da Demonstração para o Estado "Conflitos
     * Atualizados".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setConflitosAtualizados() {
        if (valida()) {
            super.getDemo().setEstado(new DemonstracaoConflitosAtualizadosEstado(super.getDemo()));
            return true;
        }
        return false;
    }

    /**
     * Verifica se a Demonstração pode mudar para o Estado "Candidaturas
     * Atualizados".
     *
     * @return false, se não puder mudar para esse estado e true, se for
     * possível mudar
     */
    public boolean valida() {
        return super.getDemo().getEstado().setConflitosDetetados();
    }

}
