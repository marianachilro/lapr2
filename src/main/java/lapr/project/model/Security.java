/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author catarinarib
 */
public class Security {

    
    private static final char alfabeto[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
        'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ',', ';', '.', ':', '-'};

    private int shift;

    private char [] password;
    private char[] coded ;
    

    public void Security(Utilizador u,String Keyword) {

        this.shift = (int) (Math.random() * 10);
        this.password=u.getPassword().toCharArray();
        
        coded = new char[password.length];
    
//        Character.isUpperCase("C");
//       
//        
//        for (int i = 0; i < alfabeto.length; i++) {
//            coded[i] = alfabeto[(i + shift) % alfabeto.length];
//        }
//
//        for (int i = 0; i < alfabeto.length; i++) {
//            decoded[coded[i] - 'A'] = alfabeto[i];
//        }
//
//        return 0;
    }
//
//    public String encrypt(String pw) {
//
//        char[] password = pw.toCharArray();
//        for (int i = 0; i < password.length; i++) {
//
//            if (Character.isUpperCase(password[i])) {
//                password[i] = coded[password[i] - 'A'];
//            }

//        }
//        return new String(password);
//    }

}
