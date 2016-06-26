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
 * @author Rita
 */
public class CandidaturaExposicaoTest {
    /**
     * Test of getStand method, of class CandidaturaExposicao.
     */
    @Test
    public void testGetStand() {
        System.out.println("getStand");
        CandidaturaExposicao instance = new CandidaturaExposicao();
        Stand expResult = new Stand();
        instance.setStand(expResult);
        Stand result = instance.getStand();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaProdutos method, of class CandidaturaExposicao.
     */
    @Test
    public void testGetListaProdutos() {
        System.out.println("getListaProdutos");
        CandidaturaExposicao instance = new CandidaturaExposicao();
        ListaProdutos expResult = new ListaProdutos();
        instance.setListaProdutos(expResult);
        ListaProdutos result = instance.getListaProdutos();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEmailRep method, of class CandidaturaExposicao.
     */
    @Test
    public void testGetEmailRep() {
        System.out.println("getEmailRep");
        CandidaturaExposicao instance = new CandidaturaExposicao();
        String expResult = "email";
        instance.setEmailRep(expResult);
        String result = instance.getEmailRep();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaAvaliacoes method, of class CandidaturaExposicao.
     */
    @Test
    public void testGetListaAvaliacoes() {
        System.out.println("getListaAvaliacoes");
        CandidaturaExposicao instance = new CandidaturaExposicao();
        ListaAvaliacoes expResult = new ListaAvaliacoes();
        instance.setListaAvaliacoes(expResult);
        ListaAvaliacoes result = instance.getListaAvaliacoes();
        assertEquals(expResult, result);
    }

    /**
     * Test of getnomeEmpresa method, of class CandidaturaExposicao.
     */
    @Test
    public void testGetnomeEmpresa() {
        System.out.println("getnomeEmpresa");
        CandidaturaExposicao instance = new CandidaturaExposicao();
        String expResult = "nomeP";
        instance.setNomeEmpresa(expResult);
        String result = instance.getNomeEmpresa();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMorada method, of class CandidaturaExposicao.
     */
    @Test
    public void testGetMorada() {
        System.out.println("getMorada");
        CandidaturaExposicao instance = new CandidaturaExposicao();
        String expResult = "morada";
        instance.setMorada(expResult);
        String result = instance.getMorada();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTelemovel method, of class CandidaturaExposicao.
     */
    @Test
    public void testGetTelemovel() {
        System.out.println("getTelemovel");
        CandidaturaExposicao instance = new CandidaturaExposicao();
        int expResult = 912956987;
        instance.setTelemovel(expResult);
        int result = instance.getTelemovel();
        assertEquals(expResult, result);
    }

    /**
     * Test of getArea method, of class CandidaturaExposicao.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        CandidaturaExposicao instance = new CandidaturaExposicao();
        double expResult = 0.0;
        instance.setArea(expResult);
        double result = instance.getArea();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getConvites method, of class CandidaturaExposicao.
     */
    @Test
    public void testGetConvites() {
        System.out.println("getConvites");
        CandidaturaExposicao instance = new CandidaturaExposicao();
        int expResult = 0;
        instance.setConvites(expResult);
        int result = instance.getConvites();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDecisao method, of class CandidaturaExposicao.
     */
    @Test
    public void testGetDecisao() {
        System.out.println("getDecisao");
        CandidaturaExposicao instance = new CandidaturaExposicao();
        boolean expResult = false;
        instance.setDecisao(expResult);
        boolean result = instance.getDecisao();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEstado method, of class CandidaturaExposicao.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        CandidaturaExposicao instance = new CandidaturaExposicao();
        CandImpEstado expResult = new CandidaturaInicialEstado(instance);
        instance.setEstado(expResult);
        CandidaturaEstado result = instance.getEstado();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaKeywords method, of class CandidaturaExposicao.
     */
    @Test
    public void testGetListaKeywords() {
        System.out.println("getListaKeywords");
        CandidaturaExposicao instance = new CandidaturaExposicao();
        ListaKeywords expResult = new ListaKeywords();
        instance.setListaKeywords(expResult);
        ListaKeywords result = instance.getListaKeywords();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaDemonstracoes method, of class CandidaturaExposicao.
     */
    @Test
    public void testGetListaDemonstracoes() {
        System.out.println("getListaDemonstracoes");
        CandidaturaExposicao instance = new CandidaturaExposicao();
        ListaDemonstracoes expResult = new ListaDemonstracoes();
        instance.setListaDemonstracoes(expResult);
        ListaDemonstracoes result = instance.getListaDemonstracoes();
        assertEquals(expResult, result);
    } 

    /**
     * Test of toString method, of class CandidaturaExposicao.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        CandidaturaExposicao instance = new CandidaturaExposicao();
        String expResult = String.format("Nome Empresa: %s %n E-mail: %s %n","" ,"");
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of estatisticaAvaliacoes method, of class CandidaturaExposicao.
     */
    @Test
    public void testEstatisticaAvaliacoes() {
        System.out.println("estatisticaAvaliacoes");
        int i = 0;
        CandidaturaExposicao instance = new CandidaturaExposicao();
        float expResult = 0.0F;
        float result = instance.estatisticaAvaliacoes(i);
        assertEquals(expResult, result, 0.0);
    }
}
