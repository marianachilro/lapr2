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
 * @author miniondevil
 */
public class AtribuicaoTest {
    
   

    /**
     * Test of getFAE method, of class Atribuicao.
     */
    @Test
    public void testGetAndSetFAE() {
        System.out.println("getAndSetFAE");
        CandidaturaExposicao c = new CandidaturaExposicao();
        FAE fae = new FAE();
        Atribuicao instance = new Atribuicao(fae, c);
        Utilizador u = new Utilizador("joao", "Joao_vaz", "123@outlookp.pt", "Jj;012345","keyword");
        FAE fae2 = new FAE(u);
        FAE expResult = fae2;
        instance.setFAE(fae2);
        FAE result = instance.getFAE();
        assertEquals(expResult, result);
        
    }

    /**
     * Testa se o método set e get candidatura funciona com uma CandidaturaExposicao.
     */
    @Test
    public void testGetAndSetCandidatura() {
        System.out.println("getCandidatura");
       
        CandidaturaExposicao c = new CandidaturaExposicao();
        FAE fae = new FAE();
        Atribuicao instance = new Atribuicao(fae, c);
        CandidaturaExposicao c2 = new CandidaturaExposicao("123", "asd", "asd", 123123123, 20, 30);
        CandidaturaExposicao expResult = c2;
        instance.setCandidatura(c2);
        Candidatura result = instance.getCandidatura();
        assertEquals(expResult, result);
    }
}
