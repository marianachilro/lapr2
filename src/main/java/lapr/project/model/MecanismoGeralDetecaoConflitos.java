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
public class MecanismoGeralDetecaoConflitos implements MecanismoDetecaoConflito{

    @Override
    public void detetarConflitos(Exposicao expo) {
    }

    @Override
    public boolean isConflito(FAE f, CandidaturaGeral c) {
        return false;
    }
    
}
