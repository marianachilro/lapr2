/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.CentroExposicoes;
import lapr.project.model.RegistoUtilizadores;
import lapr.project.model.Utilizador;

/**
 *
 * @author marianachilro
 */
public class AlterarPerfilUtilizadorController {
    
    private final CentroExposicoes centro;
    private RegistoUtilizadores ru;
    private String username;
    private Utilizador utilizador;
    private Utilizador clone;
    
    public AlterarPerfilUtilizadorController(CentroExposicoes centro, String username){
        this.centro= centro;
        this.username=username;
    }
    
    public Utilizador getUtilizador(){
        this.ru = this.centro.getRegistoUtilizadores();
        this.utilizador=ru.getUtilizador(username);
        return this.utilizador;
    }
    
    public boolean validaPassword(String pass){
        return this.utilizador.getPassword().equalsIgnoreCase(pass);
    }
    
    public Utilizador criarClone(){
        this.clone = new Utilizador(this.utilizador);
        return this.clone;
    }
    
    public void removerUtilizador(Utilizador u){
        this.ru.removerUtilizador(u);
    }
    
    public boolean setDados(String nome, String username, String email, String keyword){
        this.clone.setNome(nome);
        this.clone.setUsername(username);
        this.clone.setEmail(email);
        this.clone.setKeyword(keyword);
        
        return this.ru.validaUtilizador(clone);
    }
    public void setNovaPassword(String novaPassword){
        this.clone.setPassword(novaPassword);
    }
    
    
    public void registaAlteracoes(){
        this.utilizador.setPerfilAlterado(clone);
    }
}
