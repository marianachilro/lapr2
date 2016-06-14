/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Representa um dos Estados possíveis da Demonstração (Estado de "Não
 * Confirmada").
 *
 * @author marianachilro
 */
public class DemonstracaoNaoConfirmadaEstado extends DemoImpEstado {

    /**
     * Contrutor do Estado de "Não Confirmada" da Demonstração.
     *
     * @param demonstracao a demonstração que vai transitar de estado
     */
    public DemonstracaoNaoConfirmadaEstado(Demonstracao demonstracao) {
        super(demonstracao);
    }

    /**
     * Método que indica que a Demonstração está no Estado "Não Confirmada".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setNaoConfirmada() {
        return true;
    }
}