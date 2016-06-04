/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

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
     * Devolve nome de Utilizador
     * @return Nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Devolve username de Utilizador.
     * @return Username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Devolve o E-mail do Utilizador.
     * @return E-mail
     */
    public String getEmail() {
        return email;
    }

    /**
     * Devolve a Password do Utilizador.
     * @return Password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Modifica o Nome de Utilizador
     * @param nome Nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Modifica o Username de Utilizador.
     * @param username Username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Modifica o E-mail de Utilizador.
     * @param email E-mail
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Modifica a Password de Utilizador.
     * @param password Password.
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
