
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author marianachilro
 */
public class UtilizadorTest {

     @Test
    public void testGetNomeAndSetNome() {
        Utilizador instance = new Utilizador();
        String nome = "testenome";
        instance.setNome(nome);
        String expResult = nome;
        String result = instance.getNome();
        assertEquals(expResult, result);
    }

     @Test
    public void testGetUsernameAndSetUsername() {
        Utilizador instance = new Utilizador();
        String username = "testeusername";
        instance.setUsername(username);
        String expResult = username;
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }

     @Test
    public void testGetEmailAndSetEmail() {
        Utilizador instance = new Utilizador();
        String email = "as@centro.pt";
        instance.setEmail(email);
        String expResult = email;
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

     @Test
    public void testGetPasswordAndSetPassword() {
        Utilizador instance = new Utilizador();
        String password = "aA0;";
        instance.setPassword(password);
        String expResult = password;
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }
    
     @Test
    public void testGetKeywordAndSetKeyword(){
        Utilizador instance = new Utilizador();
        String keyword = "aaaa";
        instance.setKeyword(keyword);
        String expResult = keyword;
        String result = instance.getKeyword();
        assertEquals(expResult, result);
    }

     @Test
    public void testSetPerfilAlterado() {
        Utilizador instance = new Utilizador();
        String nome = "testenome";
        String username = "testeusername";
        String email = "s@centro.pt";
        String password = "aA2;";
        String keyword = "teste";
        Utilizador clone = new Utilizador(nome, username, email, password,keyword);

        instance.setPerfilAlterado(clone);
        Utilizador expResult = clone;
        Utilizador result = instance;
        assertEquals(expResult, result);

    }
}
