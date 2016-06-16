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
public class CriaPerfideUtilizadorController {

    private CentroExposicoes ce;
    private Utilizador u;
    private RegistoUtilizadores registoUtilizadores;

    public void CriaPerfideUtilizadorController(CentroExposicoes ce) {
        this.ce = ce;
    }

    public RegistoUtilizadores getRegistoUtilizadores() {
        return ce.getRegistoUtilizadores();
    }

    public void novoUtilizador() {
        this.u = this.ce.getRegistoUtilizadores().novoUtilizador();
    }

    public void setDados(String nome, String username, String email, String password,String keyword) {

        this.u.setNome(nome);

        for (Utilizador u1 : registoUtilizadores.getListaUtilizadores()) {

            if (u1.getUsername().equals(username)) {
                throw new IllegalArgumentException("Username já existe!");
            } else if (u1.getEmail().equals(email)) {
                throw new IllegalArgumentException("Email já existe!");
            }
        }

        this.u.setUsername(username);
        this.u.setEmail(email);
        this.u.setPassword(password);
        this.u.setKeyword(keyword);

    }

    public boolean RegistaUtilizador() {

        return this.registoUtilizadores.confirmaUtilizador(u);

    }

}
