/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.regex.Pattern;
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
        return this.registoUtilizadores = ce.getRegistoUtilizadoresNaoConfirmados();
    }

    public Utilizador novoUtilizador() {
        return this.u = this.ce.getRegistoUtilizadoresNaoConfirmados().novoUtilizador();
    }

    public void setDados(int shift, String nome, String username, String email, String password, String keyword) {

        this.u.setShift(shift);
        this.u.setNome(nome);
        this.u.setUsername(username);
         if (email == null || email.trim().isEmpty() || !(Pattern.matches("(.*)(\\@)(.*)", email))) {
            throw new IllegalArgumentException("E-mail inválido!");
        }
        this.u.setEmail(email);
        char pontuacao[] = {',', ';', '.', ':', '-'};

        int contUpper = 0;
        int contLower = 0;
        int contNum = 0;
        int contPuctuation = 0;
        char c;

        for (int i = 0; i < password.length(); i++) {

            String letra = u.convertToASCII(password.charAt(i) + "");
            c = letra.charAt(0);

            if (Character.isWhitespace(c)) {
                throw new IllegalArgumentException("Password sem Espaços!");

            } else if (Character.isLowerCase(c)) {
                contLower++;
            } else if (Character.isUpperCase(c)) {
                contUpper++;
            } else if (Character.isDigit(c)) {
                contNum++;

            } else if (!Character.isWhitespace(c)) {

                for (char p : pontuacao) {
                    if (p == c) {
                        contPuctuation++;
                    }
                }

            }

        }
        if (contUpper == 0) {
            throw new IllegalArgumentException("Password inválida! \nTem de ter pelo menos uma letra maiuscula!");
        } else if (contLower == 0) {
            throw new IllegalArgumentException("Password inválida! \nTem de ter pelo menos uma letra manuscula!");
        } else if (contNum == 0) {
            throw new IllegalArgumentException("Password inválida! \nTem de ter pelo menos um numero!");
        } else if (contPuctuation == 0) {
            throw new IllegalArgumentException("Password inválida! \nTem de ter pelo menos um destes carateres:\n  ,  .  ;  :  -  ");
        }
        this.u.setPassword(password);
        this.u.setKeyword(keyword);
    }

    public boolean RegistaUtilizador() {

        return ce.getRegistoUtilizadoresNaoConfirmados().confirmaUtilizador(u);
    }

}
