/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.TipoConflito;

/**
 *
 * @author miniondevil
 */
public class DefinirTipoConflitosController {
    private final CentroExposicoes ce;
    private lapr.project.model.RegistoTipoConflitos rc;
    private List<TipoConflito> ltc;
    private TipoConflito t;
    public DefinirTipoConflitosController(CentroExposicoes ce){
        this.ce = ce;
    }
    public List<TipoConflito> getListaConflitos(){
        rc = ce.getRegistoTipoConflitos();
        ltc = rc.getListaTipoConflitos();
        return ltc;
    }
    public boolean criaTipo(String nome, String dados){
        t = rc.newTipoConflito();
        t.setNome(nome);
        t.setDados(dados);
        t.valida();
       return rc.validaTipo(t);
        
    }
    public void addTipoConflito(){
        ltc.add(t);
    }
    
}
