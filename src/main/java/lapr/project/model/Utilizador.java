/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Rita
 */
public class Utilizador {

    /**
     * Nome de Utilizador.
     */
    private String nome;
    /**
     * Username de Utilizador.
     */
    private String username;
    /**
     * E-mail de Utilizador.
     */
    private String email;
    /**
     * Password de Utilizador.
     */
    private String password;
    /**
     * Nome de Utilizador por omissão.
     */
    private static final String NOME_OMISSAO = "";
    /**
     * Username de Utilizador por omissão.
     */
    private static final String USERNAME_OMISSAO = "";
    /**
     * E-mail de Utilizador por omissão.
     */
    private static final String EMAIL_OMISSAO = "";
    /**
     * Password de Utilizador por omissão.
     */
    private static final String PASSWORD_OMISSAO = "";

    /**
     * Construtor de um Utilizador com os atributos por omissão.
     */
    public Utilizador() {
        this.nome = NOME_OMISSAO;
        this.username = USERNAME_OMISSAO;
        this.email = EMAIL_OMISSAO;
        this.password = PASSWORD_OMISSAO;
    }

    /**
     * Construtor de um Utilizador com os atributos recebidos por parâmetro.
     *
     * @param nome Nome
     * @param username Username
     * @param email E-mail
     * @param password Password
     */
    public Utilizador(String nome, String username, String email, String password) {
        this.nome = nome;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    /**
     * Construtor de um Utilizador com um Utilizador recebido por parâmetro.
     *
     * @param utilizador utilizador que pretendemos copiar
     *
     */
    public Utilizador(Utilizador utilizador) {
        this.nome = utilizador.getNome();
        this.username = utilizador.getUsername();
        this.email = utilizador.getEmail();
        this.password = utilizador.getPassword();
    }

    /**
     * Devolve nome de Utilizador
     *
     * @return Nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Devolve username de Utilizador.
     *
     * @return Username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Devolve o E-mail do Utilizador.
     *
     * @return E-mail
     */
    public String getEmail() {
        return email;
    }

    /**
     * Devolve a Password do Utilizador.
     *
     * @return Password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Modifica o Nome de Utilizador
     *
     * @param nome Nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Modifica o Username de Utilizador.
     *
     * @param username Username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Modifica o E-mail de Utilizador.
     *
     * @param email E-mail
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Modifica a Password de Utilizador.
     *
     * @param password Password.
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * Modifica o Nome, o Username, o Email e Password de Utilizador, a partir de um outro Utilizador recebido por parâmetro.
     * @param clone o Utilizador para o qual queremos alterar
     */
    public void setPerfilAlterado(Utilizador clone){
        this.nome=clone.getNome();
        this.username=clone.getUsername();
        this.email=clone.getEmail();
        this.password=clone.getPassword();
    }

    /**
     * Verifica se os dados recebido por parãmetro são válidos.
     * @param nome Nome
     * @param username Username
     * @param email E-mail
     * @param password Password
     * @return true se forem válido e false se forem inválidos
     */
    public boolean validaDados(String nome, String username, String email, String password) {

        String esp = "@centro.pt";
        String text = email;
        Matcher m = Pattern.compile(esp).matcher(text);
        return m.find();
    }
}
