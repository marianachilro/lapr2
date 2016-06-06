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
    private Utilizador utilizador;
    private Utilizador clone;
    
    public AlterarPerfilUtilizadorController(CentroExposicoes centro){
        this.centro= centro;
    }
    
    public void getRegistoUtilizadores(){
        this.ru = this.centro.getRegistoUtilizadores();
    }
    
    public void getUtilizador(String username){
        this.utilizador=ru.getUtilizador(username);
    }
    
    public boolean validaPassword(String pass){
        return this.utilizador.getPassword().equalsIgnoreCase(pass);
    }
    
    public void criarClone(){
        clone = new Utilizador(this.utilizador);
    }
    
    public String apresentaUtilizador(){
        return this.utilizador.toString();
    }
    
    public boolean validaDados( String nome, String username, String email, String password){
        return this.utilizador.validaDados(nome, username, email, password);
    }
    
    public boolean setDados(String nome, String username, String email, String password){
        this.clone.setNome(nome);
        this.clone.setUsername(username);
        this.clone.setEmail(email);
        this.clone.setPassword(password);
        
        return this.ru.validaUtilizador(clone);
    }
    
    public String apresentaClone(){
        return this.clone.toString();
    }
    
    public void registaAlterações(){
        this.utilizador.setPerfilAlterado(clone);
    }
}
