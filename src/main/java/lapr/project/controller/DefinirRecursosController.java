/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.CentroExposicoes;
import lapr.project.model.Recurso;
import lapr.project.model.RegistoRecursos;

/**
 *
 * @author marianachilro
 */
public class DefinirRecursosController {

    private final CentroExposicoes centro;

    private RegistoRecursos rc;

    private Recurso recurso;

    public DefinirRecursosController(CentroExposicoes ce) {
        this.centro = ce;
    }

    public void getRegistoRecursos() {
        this.rc = centro.getRegistoRecursos();
    }

    public void newRecurso(){
        this.recurso=rc.newRecurso();
    }
    
    public void setRecurso(String nome){
        this.recurso.setNome(nome);
    }
    
    public boolean validaRecurso(){
        
        if(recurso.valida())
            return rc.validaRecurso(recurso);
        return false;
        
    }
    
    public boolean addRecurso(){
        return this.rc.addRecurso(recurso);
    }
    
    public String apresentaLista(){
        return this.rc.getListaRecursos().toString();
    }
    
}
