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
    
    public AtribuicaoTest() {
    }

//    /**
//     * Test of getFAE method, of class Atribuicao.
//     */
//    @Test
//    public void testGetAndSetFAE() {
//        System.out.println("getAndSetFAE");
//        CandidaturaExposicao c = new CandidaturaExposicao();
//        FAE fae = new FAE();
//        Atribuicao instance = new Atribuicao(fae, c);
//        Utilizador u = new Utilizador("joao", "Joao_vaz", "123@outlookp.pt", "Jj;012345");
//        FAE fae2 = new FAE(u);
//        FAE expResult = fae2;
//        instance.setFAE(fae2);
//        FAE result = instance.getFAE();
//        assertEquals(expResult, result);
//        
//    }

//    /**
//     * Testa se o método set e get candidatura funciona com uma CandidaturaExposicao.
//     */
//    @Test
//    public void testGetAndSetCandidatura() {
//        System.out.println("getCandidatura");
//       
//        CandidaturaExposicao c = new CandidaturaExposicao();
//        FAE fae = new FAE();
//        Atribuicao instance = new Atribuicao(fae, c);
//        CandidaturaExposicao c2 = new CandidaturaExposicao("123@centro.pt","nome empres", "morada", 919999999, 1, 30);
//        CandidaturaExposicao expResult = c2;
//        instance.setCandidatura(c2);
//        Candidatura result = instance.getCandidatura();
//        assertEquals(expResult, result);
//    }
    
    /**
     * Testa se o método set e get candidatura funciona com uma CandidaturaDemonstracao.
     */
    @Test
    public void testGetAndSetCandidatura1() {
        System.out.println("getCandidatura");
       
        CandidaturaDemonstracao c = new CandidaturaDemonstracao();
        FAE fae = new FAE();
        Atribuicao instance = new Atribuicao(fae, c);
        Demonstracao demo = new Demonstracao();
        CandidaturaDemonstracao c2 = new CandidaturaDemonstracao("sfdf@centro.pt",demo);
        CandidaturaDemonstracao expResult = c2;
        instance.setCandidatura(c2);
        Candidatura result = instance.getCandidatura();
        assertEquals(expResult, result);
    }
}
