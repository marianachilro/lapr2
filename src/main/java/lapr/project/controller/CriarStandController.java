/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.CentroExposicoes;
import lapr.project.model.RegistoStands;
import lapr.project.model.Stand;

/**
 *
 * @author catarinarib
 */
public class CriarStandController {
    
    private CentroExposicoes ce;
    private RegistoStands rs;
    private Stand stand;
    
    
    public CriarStandController(CentroExposicoes ce){       
        this.ce=ce;       
    }
    
    public RegistoStands getRegistoStands(){
       return rs=this.ce.getRegistoStands();
    }
    
    public void novoStand(){
        this.stand=this.ce.getRegistoStands().novoStand();
    }
    
    public void setStand(String descricao){
        this.stand.setDescricao(descricao);
    }
    
    public boolean addStand(){
        return rs.addStand(stand);
    }
    
    public String apresentaLista(){
        return rs.toString();
    }
    
}
