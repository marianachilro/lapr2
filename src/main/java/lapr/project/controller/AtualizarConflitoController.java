/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.Conflito;
import lapr.project.model.FAE;
import lapr.project.model.ListaConflitos;
import lapr.project.model.RegistoTipoConflitos;
import lapr.project.model.TipoConflito;
import lapr.project.model.Utilizador;

/**
 *
 * @author marianachilro
 */
public class AtualizarConflitoController {
    
    private final CentroExposicoes centro;
    
    private final Utilizador utilizador;
    
    private final List <Exposicao> listaExposFAE;
    
    private Exposicao exposicao;
    
    private Conflito conflito;
    
    private Conflito clone;
    
    private List <Conflito> listaConflitosFAE;
    
    public AtualizarConflitoController(CentroExposicoes centro, Utilizador u, String operacao){
        this.centro=centro;
        this.utilizador=u;
        this.listaExposFAE=centro.getRegistoExposicoes().getListaExposicoesDoFAE(u);
    }
    
    public void seleciona (Exposicao e){
        this.exposicao=e;
    }
    
    public List <Conflito> getConflitosFAE(){
        
        FAE fae = this.exposicao.getListaFAES().getFAE(this.utilizador);
        
        ListaConflitos lc = this.exposicao.getListaConflitos();
        List <Conflito> lista = new ArrayList<>();
        for(Conflito c : lc.getLista()){
            if(c.getFAE().equals(fae))
                lista.add(c);
        }
        this.listaConflitosFAE=lista;
        return lista;
    }
    
    public void seleciona(Conflito c){
        this.conflito=c;
        this.clone = new Conflito(c);  
    }
    
    public void setDados(String dados){
        
    }
    
    public void setAlteracaoConflito(){
        this.listaConflitosFAE.remove(this.conflito);
        this.listaConflitosFAE.add(clone);
    }
    
    public RegistoTipoConflitos getRegistoTipoConflitos(){
        this.conflito = this.exposicao.getListaConflitos().newConflito();
        RegistoTipoConflitos rtc = this.centro.getRegistoTipoConflitos();
        return rtc;
    }
    
    public void setDados(String dados, TipoConflito tipo){
        this.conflito.setTipo(tipo);
    }
    
    public void addConflito(){
        this.listaConflitosFAE.add(this.conflito);
    }
    
    public String selecionaEApresenta(Conflito c){
        this.conflito=c;
        return this.conflito.toString();
    }
    
    public void removeConflito(){
        this.listaConflitosFAE.remove(this.conflito);
    }
}