/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Representa um dos Estados possíveis da Demonstração (Estado de "Candidaturas
 * Decididas").
 *
 * @author marianachilro
 */
public class DemonstracaoCandidaturasDecididasEstado extends DemoImpEstado {

    /**
     * A demonstração.
     */
    /**
     * Contrutor do Estado de Candidaturas Decididas da Demonstração.
     *
     * @param demonstracao a demonstração que vai transitar de estado
     */
    public DemonstracaoCandidaturasDecididasEstado(Demonstracao demonstracao) {
        super(demonstracao);
    }

    @Override
    public boolean setCandidaturasDecididas() {
        return true;
    }

}
