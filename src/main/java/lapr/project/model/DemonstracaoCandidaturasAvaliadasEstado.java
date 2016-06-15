/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Representa um dos Estados possíveis da Demonstração (Estado de "Candidaturas
 * Avaliadas").
 *
 * @author marianachilro
 */
public class DemonstracaoCandidaturasAvaliadasEstado extends DemoImpEstado {

    /**
     * Contrutor do Estado de Candidaturas Avaliadas da Demonstração.
     *
     * @param demonstracao a demonstração que vai transitar de estado
     */
    public DemonstracaoCandidaturasAvaliadasEstado(Demonstracao demonstracao) {
        super(demonstracao);
    }
    
    @Override
    public boolean setCandidaturasAvaliadas(){
        return true;
    }

    /**
     * Método que muda o estado da Demonstração para o Estado "Candidaturas
     * Decididas".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setCandidaturasDecididas() {
        if (valida()) {
            super.getDemo().setEstado(new DemonstracaoCandidaturasDecididasEstado(super.getDemo()));
            return true;
        }
        return false;
    }

    /**
     * Verifica se todas as Candidaturas à Demonstração estão decididas.
     *
     * @return true se todas as candidaturas estiverem decididas e false se,
     * pelo menos uma, não tiver sido decidida
     */
    public boolean valida() {
        return super.getDemo().getEstado().setCandidaturasAvaliadas();
    }

}
