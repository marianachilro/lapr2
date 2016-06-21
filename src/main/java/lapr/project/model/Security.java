/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.Arrays;

/**
 *
 * @author catarinarib
 */
public class Security {

    /**
     * Alfabeto
     */
    private final char alfabeto[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
        'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '@', ',', ';', '.', ':', '-'};

    /**
     * Shift do utilizador
     */
    private final int shift;
    
    /**
     * Keyword do utilizador
     */
    private final int keyword;

    
    /**
     * Array com a palavra encriptada
     */
    private char[] coded;
    
    /**
     * Array com a palavra desencriptada
     */
    private char[] decoded;
    
    /**
     * Array com a palavra modifica pela substituicao de cipher
     */
    private char[] substituir;
    
    /**
     * Array com a palavra descodificada modifica pela substituicao de cipher
     */
    private char[] substiruirDescodificado;

   /**
    * Contrutor Security com o utilizador recebido por parametro.
    * @param u utilizador
    */
    public Security( Utilizador u) {

        this.keyword = u.getKeyword().length();
        this.shift = u.getShift();
        

    }


    /**
     * Codificar a password e a keyword
     * @param pass palavra para codificar
     * @return 
     */
    public String codificarShift(String pass) {
        coded = new char[pass.length()];
        char [] palavra = pass.toCharArray();

        for (int i = 0; i < palavra.length; i++) {
            char c = palavra[i];
            if (Character.isLowerCase(c)) {
                coded[i] = (char) ((c - 'a' + shift) % alfabeto.length + 'a');

            } else {
                coded[i] = (char) ((c - 'A' + shift) % alfabeto.length + 'A');

            }
        }

        String codificado = "";

        for (int a = 0; a < coded.length; a++) {
            codificado += coded[a];
        }
        return codificado;
    }

    /**
     * Descodificar a password e a keyword
     * @param pass palavra para descodificar
     * @return 
     */
    public String descodificarShift(String pass) {

        decoded = new char[pass.length()];
        char [] palavra=pass.toCharArray();
        for (int i = 0; i < palavra.length; i++) {
            char a = palavra[i];

            decoded[i] = (char) (a - (shift % alfabeto.length));

        }
        String descodificado = "";

        for (int a = 0; a < decoded.length; a++) {
            descodificado += decoded[a];
        }
        return descodificado;

    }

    /**
     * Substituicao de cipher
     * @param pass palavra para encriptar
     * @return 
     */
    public String SubstitutionCipher(String pass) {
        substituir = new char[pass.length()];
        char[] palavra = pass.toCharArray();
        
        for (int i = 0; i < palavra.length; i++) {
            char c = palavra[i];
            if (Character.isLowerCase(c)) {
                substituir[i] = (char) ((c - 'a' + keyword) % alfabeto.length + 'a');

            } else {
                substituir[i] = (char) ((c - 'A' + keyword) % alfabeto.length + 'A');

            }
        }

        String texto = "";

        for (int a = 0; a < substituir.length; a++) {
            texto += substituir[a];
        }
        return texto;

    }

    /**
     * Descodificacao da substituicao de cipher
     * @param pass palavra para descodificar
     * @return 
     */
    public String SubstitutionDescodificarCipher(String pass) {
        substiruirDescodificado = new char[pass.length()];
        char [] palavra = pass.toCharArray();
        for (int i = 0; i < palavra.length; i++) {
            char a = palavra[i];

            substiruirDescodificado[i] = (char) (a - (keyword % alfabeto.length));

        }
        String descodificado = "";

        for (int a = 0; a < substiruirDescodificado.length; a++) {
            descodificado += substiruirDescodificado[a];
        }
        return descodificado;
    }

    /**
     * Substituicao e transposicao de cipher
     * @param pass palavra para encriptar
     * @return 
     */
    public String substitutionAndTranpositionCipher(String pass) {
        char[] substituicao = SubstitutionCipher(pass).toCharArray();
        
        char cipher[] = new char[substituicao.length];
        
       for(int i=0;i<substituicao.length;i++){
           cipher[substituicao.length-i-1]=substituicao[i];
       }
        
       String codificado = "";

        for (int a = 0; a <  cipher.length; a++) {
            codificado +=  cipher[a];
        }
        return codificado;

    }

    /**
     * Descriptar a substituicao e tranposicao de cipher
     * @param pass palavra para descriptar
     * @return 
     */
    public String desencriptarSubstitutionAndTranspositionCipher(String pass){
        
        char[]palavra = pass.toCharArray();
        
       char cipher[] = new char[palavra.length];
        
       for(int i=0;i<palavra.length;i++){
           cipher[palavra.length-i-1]=palavra[i];
       }
       
       String descodificado = "";

        for (int a = 0; a <  cipher.length; a++) {
            descodificado +=  cipher[a];
        }
        
        return SubstitutionDescodificarCipher(descodificado);
        
        
        
    }
}
