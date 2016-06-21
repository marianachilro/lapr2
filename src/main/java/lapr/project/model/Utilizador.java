/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.Objects;
import java.util.regex.Pattern;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rita
 */
@XmlRootElement
public class Utilizador {

    /**
     * Nome de Utilizador.
     */
    @XmlElement
    private String nome;
    /**
     * Username de Utilizador.
     */
    @XmlElement
    private String username;
    /**
     * E-mail de Utilizador.
     */
    @XmlElement
    private String email;
    /**
     * Password de Utilizador.
     */
    @XmlElement
    private String password;
    
    /**
     * Keyword do utilizador
     */
    @XmlElement
    private String keyword;
    
    /**
     * Shift do utilizador
     */
    @XmlElement
    private int shift;

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
     * Shift do utilizador por omissao.
     */
    private static final int SHIFT_OMISSAO=0;

    /**
     * Construtor de um Utilizador com os atributos por omissão.
     */
    public Utilizador() {
        this.nome = NOME_OMISSAO;
        this.username = USERNAME_OMISSAO;
        this.email = EMAIL_OMISSAO;
        this.password = PASSWORD_OMISSAO;
        this.shift=SHIFT_OMISSAO;
    }

    /**
     * Construtor de um Utilizador com os atributos recebidos por parâmetro.
     *
     * @param nome Nome
     * @param username Username
     * @param email E-mail
     * @param password Password
     * @param keyword keyword
     */
    public Utilizador(int shift,String nome, String username, String email, String password,String keyword) {
        this.shift=shift;
        setNome(nome);
        setUsername(username);
        setEmail(email);
        setPassword(password);
        setKeyword(keyword);
    }

    /**
     * Construtor de um Utilizador com um Utilizador recebido por parâmetro.
     *
     * @param utilizador utilizador que pretendemos copiar
     *
     */
    public Utilizador(Utilizador utilizador) {
        this.shift=utilizador.getShift();
        this.nome = utilizador.getNome();
        this.username = utilizador.getUsername();
        this.email = utilizador.getEmail();
        this.password = utilizador.getPassword();
        this.keyword=utilizador.getKeyword();
    }

    /**
     * Devolve o shift
     * @return 
     */
    public int getShift() {
        return shift;
    }

    /**
     * Modifica o shift
     * @param shift 
     */
    public void setShift(int shift) {
        this.shift = shift;
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
     * Devolve a keyword do utilizador
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * Modifica a keyword 
     * @param keyword 
     */
    public final void setKeyword(String keyword) {
        if(keyword.length()<4 || keyword.length()>7){
            throw new IllegalArgumentException("Keyword é inválida! 4 a 7 carateres");
        }
        this.keyword = keyword;
    }

    
    /**
     * Modifica o Nome de Utilizador
     *
     * @param nome Nome
     */
    public final void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome é inválido!");
        }
        this.nome = nome;
    }

    /**
     * Modifica o Username de Utilizador.
     *
     * @param username Username
     */
    public final void setUsername(String username) {
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Username é inválido!");
        }
        this.username = username;
    }

    /**
     * Modifica o E-mail de Utilizador.
     *
     * @param email E-mail
     */
    public final void setEmail(String email) {
        if (email == null || email.trim().isEmpty() || !(Pattern.matches("(.*)(\\@)(.*)", email))) {
            throw new IllegalArgumentException("E-mail inválido!");
        }

        this.email = email;
    }

    /**
     * Modifica a Password de Utilizador.
     *
     * @param password Password.
     */
    public final void setPassword(String password) {

        if (password == null || password.trim().isEmpty()) {
            throw new IllegalArgumentException("Password é inválida!");
        }

        char pontuacao[] = {',', ';', '.', ':', '-'};

        int contUpper = 0;
        int contLower = 0;
        int contNum = 0;
        int contPuctuation = 0;
        char c;

        for (int i = 0; i < password.length(); i++) {

            String letra = convertToASCII(password.charAt(i) + "");
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

        this.password = password;
    }

    /**
     * Converter letras com acentos para as respetivas letras sem acentos pela
     * tabela ASCII
     *
     * @param text
     * @return String
     */
    public String convertToASCII(String text) {
        return text.replaceAll("[ãâàáä]", "a")
                .replaceAll("[êèéë]", "e")
                .replaceAll("[îìíï]", "i")
                .replaceAll("[õôòóö]", "o")
                .replaceAll("[ûúùü]", "u")
                .replaceAll("[ÃÂÀÁÄ]", "A")
                .replaceAll("[ÊÈÉË]", "E")
                .replaceAll("[ÎÌÍÏ]", "I")
                .replaceAll("[ÕÔÒÓÖ]", "O")
                .replaceAll("[ÛÙÚÜ]", "U")
                .replace('ç', 'c')
                .replace('Ç', 'C')
                .replace('ñ', 'n')
                .replace('Ñ', 'N');
    }

    /**
     * Modifica o Nome, o Username, o Email e Password de Utilizador, a partir
     * de um outro Utilizador recebido por parâmetro.
     *
     * @param clone o Utilizador para o qual queremos alterar
     */
    public void setPerfilAlterado(Utilizador clone) {
        this.shift=clone.getShift();
        this.nome = clone.getNome();
        this.username = clone.getUsername();
        this.email = clone.getEmail();
        this.keyword = clone.getKeyword();
        this.password = clone.getPassword();
    }

    /**
     * Permite comparar um objecto/utilizador por parametro por outro
     * utilizador.
     *
     * @param utilizador utilizador
     * @return boolean
     */
    @Override
    public boolean equals(Object utilizador) {

        if (utilizador == null) {
            return false;
        }

        if (this.getClass() != utilizador.getClass()) {
            return false;
        }

        Utilizador u1 = (Utilizador) utilizador;
        return this.username.equals(u1.getUsername()) || this.email.equals(u1.getEmail());
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.username);
        hash = 83 * hash + Objects.hashCode(this.email);
        return hash;
    }
    
    @Override
    public String toString() {
        return String.format("Nome: %s %n Username: %s %n E-mail: %s %n", nome, username, email);
    }
}
