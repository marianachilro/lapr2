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

    private final char alfabeto[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
        'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '@', ',', ';', '.', ':', '-'};

    private final int shift;
    private final int keyword;

    private final char[] password;
    private char[] coded;
    private char[] decoded;
    private char[] substituir;
    private char[] substiruirDescodificado;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //retirar static
        Utilizador u = new Utilizador(2, "joao", "jo", "asd@centro.pt", "aA;2", "dddd");
        Security s = new Security("CatarinaRibeiroFernandesb", u);
        s.substitutionAndTranpositionCipher();
//        System.out.print(u.getShift());
//        System.out.print(s.codificarShift() + "\n");
//        Security s1 = new Security(s.codificarShift(), u);
//        System.out.print(s1.descodificarShift());
    }

    public Security(String password, Utilizador u) {

        this.keyword = u.getKeyword().length();
        this.shift = u.getShift();
        this.password = password.toCharArray();

    }

    public String codificarShift() {
        coded = new char[password.length];

        for (int i = 0; i < password.length; i++) {
            char c = password[i];
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

    public String descodificarShift() {

        decoded = new char[password.length];
        for (int i = 0; i < password.length; i++) {
            char a = password[i];

            decoded[i] = (char) (a - (shift % alfabeto.length));

        }
        String descodificado = "";

        for (int a = 0; a < decoded.length; a++) {
            descodificado += decoded[a];
        }
        return descodificado;

    }

    public String SubstitutionCipher() {
        substituir = new char[password.length];

        for (int i = 0; i < password.length; i++) {
            char c = password[i];
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

    public String substitutionAndTranpositionCipher() {
        char[] substituicao = SubstitutionCipher().toCharArray();
        
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

    public String desencriptarSubstitutionAndTranspositionCipher(String pass){
        
        char[]palavra = pass.toCharArray();
        
        
        
        
        
        
        
    }
}
