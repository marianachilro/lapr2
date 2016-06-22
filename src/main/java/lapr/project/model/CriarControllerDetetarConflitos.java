/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import lapr.project.controller.DetetarConflitosController;
import java.util.TimerTask;

/**
 *
 * @author marianachilro
 */
public class CriarControllerDetetarConflitos extends TimerTask{

    private CentroExposicoes centro;
    private Exposicao exposicao;
    
    public CriarControllerDetetarConflitos(CentroExposicoes centro, Exposicao exposicao){
        this.centro=centro;
        this.exposicao=exposicao;
    }
    @Override
    public void run() {
        DetetarConflitosController controller = new DetetarConflitosController(centro, exposicao);
    }
    
}
