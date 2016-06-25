/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author marianachilro
 */
public class MecanismoConflitoIdentidadeNumerica extends MecanismoGeralDetecaoConflitos {
    
    public MecanismoConflitoIdentidadeNumerica(){
        
    }

    @Override
    public void detetarConflitos(Exposicao expo) {
        ListaFAEs listaFAE = expo.getListaFAES();
        ListaCandidaturasExposicoes listaCandidaturasExpo = expo.getListaCandidaturas();
        ListaConflitos listaConflitos = expo.getListaConflitos();

        for (FAE f : listaFAE.getListaFAEs()) {

            for (CandidaturaGeral c : listaCandidaturasExpo.getListCandidaturas()) {
                boolean b = isConflito(f, c);
                if (b) {
                    listaConflitos.addConflito(new Conflito(f, c));
                }
            }
        }

    }

    @Override
    public boolean isConflito(FAE f, CandidaturaGeral c) {
        return f.getUtilizador().getEmail().equalsIgnoreCase(c.getEmailRep());
    }

}
