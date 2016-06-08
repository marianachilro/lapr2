
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author marianachilro
 */
public class UtilizadorTest {

    public void testGetNomeAndSetNome() {
        Utilizador instance = new Utilizador();
        String nome = "testenome";
        instance.setNome(nome);
        String expResult = nome;
        String result = instance.getNome();
        assertEquals(expResult, result);
    }

    public void testGetUsernameAndSetUsername() {
        Utilizador instance = new Utilizador();
        String username = "testeusername";
        instance.setUsername(username);
        String expResult = username;
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }

    public void testGetEmailAndSetEmail() {
        Utilizador instance = new Utilizador();
        String email = "testeemail";
        instance.setEmail(email);
        String expResult = email;
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    public void testGetPasswordAndSetPassword() {
        Utilizador instance = new Utilizador();
        String password = "testepassword";
        instance.setPassword(password);
        String expResult = password;
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    public void testSetPerfilAlterado() {
        Utilizador instance = new Utilizador();
        String nome = "testenome";
        String username = "testeusername";
        String email = "testeemail";
        String password = "testepassword";
        Utilizador clone = new Utilizador(nome, username, email, password);

        instance.setPerfilAlterado(clone);
        Utilizador expResult = clone;
        Utilizador result = instance;
        assertEquals(expResult, result);

    }
}
