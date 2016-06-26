/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.MecanismoGeralDetecaoConflitos;
import lapr.project.model.RegistoTipoConflitos;
import lapr.project.model.TipoConflito;

/**
 *
 * @author marianachilro
 */
public class DetetarConflitosController {
    
    private final CentroExposicoes centro;
    
    private final Exposicao exposicao;
    
    public DetetarConflitosController(CentroExposicoes centro, Exposicao expo){
        this.centro=centro;
        this.exposicao=expo;
    }
    
    
    public void run(){
        RegistoTipoConflitos rc = this.centro.getRegistoTipoConflitos();
        List <TipoConflito> listaTiposConflitos = rc.getTiposConflitoAtivos();
        for(TipoConflito t : listaTiposConflitos){
            List <MecanismoGeralDetecaoConflitos> listaMecanismos = t.getListaMecanismos();
            for(MecanismoGeralDetecaoConflitos mecanismo : listaMecanismos){
                mecanismo.detetarConflitos(exposicao);
            }
        }  
    }
    
    

}
