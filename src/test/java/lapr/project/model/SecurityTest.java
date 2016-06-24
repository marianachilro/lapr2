/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author catarinarib
 */
public class SecurityTest {

    /**
     * Test of codificarShift method, of class Security.
     */
    @Test
    public void testCodificarShift() {
        System.out.println("codificarShift");
        String pass = "";
        Utilizador u1 = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        Security instance = new Security(u1);
        String expResult = "";
        String result = instance.codificarShift(pass);
        assertEquals(expResult, result);

    }

    /**
     * Test of descodificarShift method, of class Security.
     */
    @Test
    public void testDescodificarShift() {
        System.out.println("descodificarShift");
        String pass = "";
        Utilizador u1 = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        Security instance = new Security(u1);
        String expResult = "";
        String result = instance.descodificarShift(pass);
        assertEquals(expResult, result);

    }

    /**
     * Test of SubstitutionCipher method, of class Security.
     */
    @Test
    public void testSubstitutionCipher() {
        System.out.println("SubstitutionCipher");
        String pass = "";
        Utilizador u1 = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        Security instance = new Security(u1);
        String expResult = "";
        String result = instance.SubstitutionCipher(pass);
        assertEquals(expResult, result);

    }

    /**
     * Test of SubstitutionDescodificarCipher method, of class Security.
     */
    @Test
    public void testSubstitutionDescodificarCipher() {
        System.out.println("SubstitutionDescodificarCipher");
        String pass = "";
        Utilizador u1 = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        Security instance = new Security(u1);
        String expResult = "";
        String result = instance.SubstitutionDescodificarCipher(pass);
        assertEquals(expResult, result);

    }

    /**
     * Test of substitutionAndTranpositionCipher method, of class Security.
     */
    @Test
    public void testSubstitutionAndTranpositionCipher() {
        System.out.println("substitutionAndTranpositionCipher");
        String pass = "";
        Utilizador u1 = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        Security instance = new Security(u1);
        String expResult = "";
        String result = instance.substitutionAndTranpositionCipher(pass);
        assertEquals(expResult, result);

    }

    /**
     * Test of desencriptarSubstitutionAndTranspositionCipher method, of class
     * Security.
     */
    @Test
    public void testDesencriptarSubstitutionAndTranspositionCipher() {
        System.out.println("desencriptarSubstitutionAndTranspositionCipher");
        String pass = "";
        Utilizador u1 = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        Security instance = new Security(u1);
        String expResult = "";
        String result = instance.desencriptarSubstitutionAndTranspositionCipher(pass);
        assertEquals(expResult, result);

    }

}
