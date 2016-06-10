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
public class AvaliacaoTest {

    /**
     * Test of getDecisao method, of class Avaliacao.
     */
    @Test
    public void testGetDecisaoAndSetNome() {
        
        System.out.println("Teste GetDecisaoAndSetNome");
        String nome = "TesteDecisao";
        Avaliacao instance = new Avaliacao();
        instance.setDecisao(nome);
        String expResult = "TesteDecisao";
        String result = instance.getDecisao();
        assertEquals(expResult, result);

    }

    /**
     * Test of getTxt method, of class Avaliacao.
     */
    @Test
    public void testGetTxtAndSetTxt() {
        
        System.out.println("Teste GetTxtAndSetTxt");
        String nome = "TesteTxt";
        Avaliacao instance = new Avaliacao();
        instance.setTextoJustificativo(nome);
        String expResult = "TesteTxt";
        String result = instance.getTxt();
        assertEquals(expResult, result);

    }

    /**
     * Test of getFae method, of class Avaliacao.
     */
    @Test
    public void testGetFaeAndSetFae() {
        
        System.out.println("Teste GetFaeAndSetFae");
        String username = "UsernameFae";
        Avaliacao instance = new Avaliacao();
        instance.setFae(username);
        String expResult = "UsernameFae";
        String result = instance.getFae();
        assertEquals(expResult, result);

    }

    /**
     * Test of getCandidatura method, of class Avaliacao.
     */
    @Test
    public void testGetCandidaturaAndSetCandidatura() {
        
        System.out.println("Teste GetCandidaturaAndSetCandidatura");
        String nomeEmpresa = "nomeEmpresaCandidatura";
        Avaliacao instance = new Avaliacao();
        instance.setCandidatura(nomeEmpresa);
        String expResult = "nomeEmpresaCandidatura";
        String result = instance.getCandidatura();
        assertEquals(expResult, result);

    }

    /**
     * Test of getRespostaTemaExpo method, of class Avaliacao.
     */
    @Test
    public void testGetRespostaTemaExpoAndSetRespostaTemaExpo() {
        
        System.out.println("TesteRespostaTemaExpo");
        int num = 2;
        Avaliacao instance = new Avaliacao();
        instance.setRespostaTemaExpo(num);
        int expResult = 2;
        int result = instance.getRespostaTemaExpo();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRespostaAdequacaoCand method, of class Avaliacao.
     */
    @Test
    public void testGetRespostaAdequacaoCandAndSetRespostaAdequacaoCand() {
        
        System.out.println("TesteRespostaAdequacaoCand");
        int num = 2;
        Avaliacao instance = new Avaliacao();
        instance.setRespostaAdequacaoCandDemonstracao(num);
        int expResult = 2;
        int result = instance.getRespostaAdequacaoCandDemonstracao();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRespostaAdequacaoNumConvites method, of class Avaliacao.
     */
    @Test
    public void testGetRespostaAdequacaoNumConvitesAndSetRespostaAdequacaoNumConvites() {
        
        System.out.println("TesteRespostaAdequacaoNumConvites");
        int num = 2;
        Avaliacao instance = new Avaliacao();
        instance.setRespostaAdequacaoNumConvites(num);
        int expResult = 2;
        int result = instance.getRespostaAdequacaoNumConvites();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRespostaRecomendacaoGlobal method, of class Avaliacao.
     */
    @Test
    public void testGetRespostaRecomendacaoGlobalAndSetRespostaRecomendacaoGlobal() {
        
        System.out.println("TesteRespostaRecomendacaoGlobal");
        int num = 2;
        Avaliacao instance = new Avaliacao();
        instance.setRespostaRecomendacaoGlobal(num);
        int expResult = 2;
        int result = instance.getRespostaRecomendacaoGlobal();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Avaliacao.
     */
    @Test
    public void testToString() {
        
        System.out.println("TestetoString");
        Avaliacao instance = new Avaliacao("fae", "cand", "decisao", "txt");
        String expResult = "fae;cand;decisao;txt;\n";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Avaliacao.
     */
    @Test
    public void testEquals() {
        
        System.out.println("TesteEquals");
        Object a = new Avaliacao();
        Avaliacao instance = new Avaliacao();
        boolean expResult = true;
        boolean result = instance.equals(a);
        assertEquals(expResult, result);

    }

    /**
     * Test of equals method, of class Avaliacao.
     */
    @Test
    public void testEqualsAtributosDiferentes() {

        System.out.println("TesteEquals");
        Object a = new Avaliacao();
        Avaliacao instance = new Avaliacao();
        instance.setCandidatura("cand");
        instance.setFae("fae");
        boolean expResult = false;
        boolean result = instance.equals(a);
        assertEquals(expResult, result);

    }

    /**
     * Test of equals method, of class Avaliacao.
     */
    @Test
    public void testEqualsMesmaRef() {

        System.out.println("TesteEquals");
        Avaliacao instance = new Avaliacao();
        Object a = instance;
        instance.setCandidatura("cand");
        instance.setFae("fae");
        boolean expResult = true;
        boolean result = instance.equals(a);
        assertEquals(expResult, result);
    }
}
