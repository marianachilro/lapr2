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
 * @author catarinarib
 */
public class CriarPerfideUtilizadorController {

    private CentroExposicoes ce;
    private Utilizador u;
    private RegistoUtilizadores registoUtilizadores;

    public CriarPerfideUtilizadorController(CentroExposicoes ce) {
        this.ce = ce;
    }

    public RegistoUtilizadores getRegistoUtilizadores() {
        return this.registoUtilizadores=ce.getRegistoUtilizadoresNaoConfirmados();
    }

    public void novoUtilizador() {
        this.u = this.ce.getRegistoUtilizadoresNaoConfirmados().novoUtilizador();
    }

    public void setDados(String nome, String username, String email, String password, String keyword) {
        
        this.u.setShift((int) (Math.random() * 10));
        this.u.setNome(nome);
        this.u.setUsername(username);
        this.u.setEmail(email);
        this.u.setPassword(password);
        this.u.setKeyword(keyword);

    }

    public boolean RegistaUtilizador() {
        return this.registoUtilizadores.confirmaUtilizador(u);
    }

}
