/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rita
 */
public class ExposicaoTest {
    
    /**
     * Test of getTitulo method, of class Exposicao.
     */
    @Test
    public void testGetTituloAndSetTitulo() {
        System.out.println("testeTitulo");
        Exposicao instance = new Exposicao();
        instance.setTitulo("titulo");
        String expResult = "titulo";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getDescricao method, of class Exposicao.
     */
    @Test
    public void testGetDescricaoAndSetDescricao() {
        System.out.println("testeDescricao");
        Exposicao instance = new Exposicao();
        instance.setDescricao("descricao");
        String expResult = "descricao";
        String result = instance.getDescricao();
        assertEquals(expResult, result);
    }

//    /**
//     * Test of getDataInicio method, of class Exposicao.
//     */
//    @Test
//    public void testGetDataInicioAndSetDataInicio() {
//        System.out.println("getDataInicio");
//        Exposicao instance = new Exposicao();
//        ///
//        Date expResult = null;
//        Date result = instance.getDataInicio();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getDataFim method, of class Exposicao.
//     */
//    @Test
//    public void testGetDataFim() {
//        System.out.println("getDataFim");
//        Exposicao instance = new Exposicao();
//        Date expResult = null;
//        Date result = instance.getDataFim();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getLocal method, of class Exposicao.
//     */
//    @Test
//    public void testGetLocal() {
//        System.out.println("getLocal");
//        Exposicao instance = new Exposicao();
//        String expResult = "";
//        String result = instance.getLocal();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getListaCandidaturas method, of class Exposicao.
//     */
//    @Test
//    public void testGetListaCandidaturas() {
//        System.out.println("getListaCandidaturas");
//        Exposicao instance = new Exposicao();
//        ListaCandidaturasExposicoes expResult = null;
//        ListaCandidaturasExposicoes result = instance.getListaCandidaturas();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getListaConflitos method, of class Exposicao.
//     */
//    @Test
//    public void testGetListaConflitos() {
//        System.out.println("getListaConflitos");
//        Exposicao instance = new Exposicao();
//        ListaConflitos expResult = null;
//        ListaConflitos result = instance.getListaConflitos();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getListaOrganizadores method, of class Exposicao.
//     */
//    @Test
//    public void testGetListaOrganizadores() {
//        System.out.println("getListaOrganizadores");
//        Exposicao instance = new Exposicao();
//        ListaOrganizadores expResult = null;
//        ListaOrganizadores result = instance.getListaOrganizadores();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getListaDemonstracoes method, of class Exposicao.
//     */
//    @Test
//    public void testGetListaDemonstracoes() {
//        System.out.println("getListaDemonstracoes");
//        Exposicao instance = new Exposicao();
//        ListaDemonstracoes expResult = null;
//        ListaDemonstracoes result = instance.getListaDemonstracoes();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setDescricao method, of class Exposicao.
//     */
//    @Test
//    public void testSetDescricao() {
//        System.out.println("setDescricao");
//        String descricao = "";
//        Exposicao instance = new Exposicao();
//        instance.setDescricao(descricao);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getListaFAES method, of class Exposicao.
//     */
//    @Test
//    public void testGetListaFAES() {
//        System.out.println("getListaFAES");
//        Exposicao instance = new Exposicao();
//        ListaFAEs expResult = null;
//        ListaFAEs result = instance.getListaFAES();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setDataInicio method, of class Exposicao.
//     */
//    @Test
//    public void testSetDataInicio() {
//        System.out.println("setDataInicio");
//        Date dataInicio = null;
//        Exposicao instance = new Exposicao();
//        instance.setDataInicio(dataInicio);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setDataFim method, of class Exposicao.
//     */
//    @Test
//    public void testSetDataFim() {
//        System.out.println("setDataFim");
//        Date dataFim = null;
//        Exposicao instance = new Exposicao();
//        instance.setDataFim(dataFim);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setLocal method, of class Exposicao.
//     */
//    @Test
//    public void testSetLocal() {
//        System.out.println("setLocal");
//        String local = "";
//        Exposicao instance = new Exposicao();
//        instance.setLocal(local);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getDataFimSubCand method, of class Exposicao.
//     */
//    @Test
//    public void testGetDataFimSubCand() {
//        System.out.println("getDataFimSubCand");
//        Exposicao instance = new Exposicao();
//        Date expResult = null;
//        Date result = instance.getDataFimSubCand();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setDataFimSubCand method, of class Exposicao.
//     */
//    @Test
//    public void testSetDataFimSubCand() {
//        System.out.println("setDataFimSubCand");
//        Date dataFimSubCand = null;
//        Exposicao instance = new Exposicao();
//        instance.setDataFimSubCand(dataFimSubCand);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getDataFimAtcConf method, of class Exposicao.
//     */
//    @Test
//    public void testGetDataFimAtcConf() {
//        System.out.println("getDataFimAtcConf");
//        Exposicao instance = new Exposicao();
//        Date expResult = null;
//        Date result = instance.getDataFimAtcConf();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setDataFimAtcConf method, of class Exposicao.
//     */
//    @Test
//    public void testSetDataFimAtcConf() {
//        System.out.println("setDataFimAtcConf");
//        Date dataFimAtcConf = null;
//        Exposicao instance = new Exposicao();
//        instance.setDataFimAtcConf(dataFimAtcConf);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getDataFimAvCandidatura method, of class Exposicao.
//     */
//    @Test
//    public void testGetDataFimAvCandidatura() {
//        System.out.println("getDataFimAvCandidatura");
//        Exposicao instance = new Exposicao();
//        Date expResult = null;
//        Date result = instance.getDataFimAvCandidatura();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setDataFimAvCandidatura method, of class Exposicao.
//     */
//    @Test
//    public void testSetDataFimAvCandidatura() {
//        System.out.println("setDataFimAvCandidatura");
//        Date dataFimAvCandidatura = null;
//        Exposicao instance = new Exposicao();
//        instance.setDataFimAvCandidatura(dataFimAvCandidatura);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getDataFimDcCandidaturas method, of class Exposicao.
//     */
//    @Test
//    public void testGetDataFimDcCandidaturas() {
//        System.out.println("getDataFimDcCandidaturas");
//        Exposicao instance = new Exposicao();
//        Date expResult = null;
//        Date result = instance.getDataFimDcCandidaturas();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setDataFimDcCandidaturas method, of class Exposicao.
//     */
//    @Test
//    public void testSetDataFimDcCandidaturas() {
//        System.out.println("setDataFimDcCandidaturas");
//        Date dataFimDcCandidaturas = null;
//        Exposicao instance = new Exposicao();
//        instance.setDataFimDcCandidaturas(dataFimDcCandidaturas);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of addOrganizador method, of class Exposicao.
     */
    @Test
    public void testAddOrganizador() {
        System.out.println("addOrganizador");
        Utilizador u = null;
        Exposicao instance = new Exposicao();
        instance.addOrganizador(u);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFAE method, of class Exposicao.
     */
    @Test
    public void testGetFAE() {
        System.out.println("getFAE");
        Utilizador u = null;
        Exposicao instance = new Exposicao();
        FAE expResult = null;
        FAE result = instance.getFAE(u);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of VerificarSeEOrganizadorDaExpo method, of class Exposicao.
     */
    @Test
    public void testVerificarSeEOrganizadorDaExpo() {
        System.out.println("VerificarSeEOrganizadorDaExpo");
        Organizador org = null;
        Exposicao instance = new Exposicao();
        boolean expResult = false;
        boolean result = instance.VerificarSeEOrganizadorDaExpo(org);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaAtribuicoesFAE method, of class Exposicao.
     */
    @Test
    public void testGetListaAtribuicoesFAE() {
        System.out.println("getListaAtribuicoesFAE");
        FAE fae = null;
        Exposicao instance = new Exposicao();
        List<Candidatura> expResult = null;
        List<Candidatura> result = instance.getListaAtribuicoesFAE(fae);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Exposicao.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Exposicao instance = new Exposicao();
        ExposicaoEstado expResult = null;
        ExposicaoEstado result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Exposicao.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        ExposicaoEstado novoSt = null;
        Exposicao instance = new Exposicao();
        instance.setEstado(novoSt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setExposicaoConfltiosAlterados method, of class Exposicao.
     */
    @Test
    public void testSetExposicaoConfltiosAlterados() {
        System.out.println("setExposicaoConfltiosAlterados");
        Exposicao instance = new Exposicao();
        boolean expResult = false;
        boolean result = instance.setExposicaoConfltiosAlterados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setExposicaoCandidaturasAtribuidas method, of class Exposicao.
     */
    @Test
    public void testSetExposicaoCandidaturasAtribuidas() {
        System.out.println("setExposicaoCandidaturasAtribuidas");
        Exposicao instance = new Exposicao();
        boolean expResult = false;
        boolean result = instance.setExposicaoCandidaturasAtribuidas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setExposicaoCandidaturasAvaliadas method, of class Exposicao.
     */
    @Test
    public void testSetExposicaoCandidaturasAvaliadas() {
        System.out.println("setExposicaoCandidaturasAvaliadas");
        Exposicao instance = new Exposicao();
        boolean expResult = false;
        boolean result = instance.setExposicaoCandidaturasAvaliadas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setExposicaoCandidaturasDecididas method, of class Exposicao.
     */
    @Test
    public void testSetExposicaoCandidaturasDecididas() {
        System.out.println("setExposicaoCandidaturasDecididas");
        Exposicao instance = new Exposicao();
        boolean expResult = false;
        boolean result = instance.setExposicaoCandidaturasDecididas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAtribuicoes method, of class Exposicao.
     */
    @Test
    public void testSetAtribuicoes() {
        System.out.println("setAtribuicoes");
        List<Atribuicao> lA = null;
        Exposicao instance = new Exposicao();
        instance.setAtribuicoes(lA);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAvaliaveis method, of class Exposicao.
     */
    @Test
    public void testGetAvaliaveis() {
        System.out.println("getAvaliaveis");
        FAE fae = null;
        Exposicao instance = new Exposicao();
        List<Candidatura> expResult = null;
        List<Candidatura> result = instance.getAvaliaveis(fae);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDecisiveis method, of class Exposicao.
     */
    @Test
    public void testGetDecisiveis() {
        System.out.println("getDecisiveis");
        Exposicao instance = new Exposicao();
        List<Candidatura> expResult = null;
        List<Candidatura> result = instance.getDecisiveis();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaAtribuicoes method, of class Exposicao.
     */
    @Test
    public void testGetListaAtribuicoes() {
        System.out.println("getListaAtribuicoes");
        Exposicao instance = new Exposicao();
        ListaAtribuicoes expResult = null;
        ListaAtribuicoes result = instance.getListaAtribuicoes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
