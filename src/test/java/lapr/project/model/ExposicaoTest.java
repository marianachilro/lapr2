/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;
import lapr.project.utils.Data;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author Rita
 */
public class ExposicaoTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

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

    /**
     * Test of getDataInicio method, of class Exposicao.
     */
    @Test
    public void testGetDataInicioAndSetDataInicio() {
        System.out.println("TesteDataInicio");
        Exposicao instance = new Exposicao();
        Data data = new Data(2016, 06, 8);
        instance.setDataInicio(data);
        Data expResult = data;
        Data result = instance.getDataInicio();
        assertEquals(expResult, result);

    }

    /**
     * Test of getDataFim method, of class Exposicao.
     */
    @Test
    public void testGetDataFimAndSetDataFim() {
        System.out.println("TesteDataFim");
        Exposicao instance = new Exposicao();
        Data data = new Data(2016, 06, 8);
        instance.setDataFim(data);
        Data expResult = data;
        Data result = instance.getDataFim();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLocal method, of class Exposicao.
     */
    @Test
    public void testGetLocalAndSetLocal() {
        System.out.println("TesteLocal");
        Exposicao instance = new Exposicao();
        instance.setLocal("local");
        String expResult = "local";
        String result = instance.getLocal();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaCandidaturas method, of class Exposicao.
     */
    @Test
    public void testGetListaCandidaturasAndSetListaCandidaturas() {
        System.out.println("TesteListaCandidaturas");
        Exposicao instance = new Exposicao();
        ListaCandidaturasExposicoes le = new ListaCandidaturasExposicoes();
        instance.setListaCandidaturas(le);
        ListaCandidaturasExposicoes expResult = le;
        ListaCandidaturasExposicoes result = instance.getListaCandidaturas();
        assertEquals(expResult, result);

    }

    /**
     * Test of getListaConflitos method, of class Exposicao.
     */
    @Test
    public void testGetListaConflitosAndSetListaConflitos() {
        System.out.println("TesteListaConflitos");
        Exposicao instance = new Exposicao();
        ListaConflitos lc = new ListaConflitos();
        instance.setListaConflitos(lc);
        ListaConflitos expResult = lc;
        ListaConflitos result = instance.getListaConflitos();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaOrganizadores method, of class Exposicao.
     */
    @Test
    public void testGetListaOrganizadoresAndSetListaOrganizadores() {
        System.out.println("TesteListaOrganizadores");
        Exposicao instance = new Exposicao();
        ListaOrganizadores lo = new ListaOrganizadores();
        instance.setListaOrganizadores(lo);
        ListaOrganizadores expResult = lo;
        ListaOrganizadores result = instance.getListaOrganizadores();
        assertEquals(expResult, result);

    }

    /**
     * Test of getListaDemonstracoes method, of class Exposicao.
     */
    @Test
    public void testGetListaDemonstracoesAndSetListaDemonstracoes() {
        System.out.println("TesteListaDemonstracoes");
        Exposicao instance = new Exposicao();
        ListaDemonstracoes ld = new ListaDemonstracoes();
        instance.setListaDemonstracoes(ld);
        ListaDemonstracoes expResult = ld;
        ListaDemonstracoes result = instance.getListaDemonstracoes();
        assertEquals(expResult, result);

    }

    /**
     * Test of getListaFAES method, of class Exposicao.
     */
    @Test
    public void testGetListaFAESAndSetListaFAES() {
        System.out.println("TesteListaFAES");
        Exposicao instance = new Exposicao();
        ListaFAEs lfae = new ListaFAEs();
        instance.setListaFAES(lfae);
        ListaFAEs expResult = lfae;
        ListaFAEs result = instance.getListaFAES();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDataFimSubCand method, of class Exposicao.
     */
    @Test
    public void testGetDataFimSubCandAndSetDataFimSubCand() {
        System.out.println("TesteDataFimSubCand");
        Exposicao instance = new Exposicao();
        Data data = new Data(2016, 06, 8);
        instance.setDataFimSubCand(data);
        Data expResult = data;
        Data result = instance.getDataFimSubCand();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDataFimAtcConf method, of class Exposicao.
     */
    @Test
    public void testGetDataFimAtcConfAndSetDataFimAtcConf() {
        System.out.println("TesteDataFimAtcConf");
        Exposicao instance = new Exposicao();
        Data data = new Data(2016, 06, 8);
        instance.setDataFimAtcConf(data);
        Data expResult = data;
        Data result = instance.getDataFimAtcConf();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDataFimAvCandidatura method, of class Exposicao.
     */
    @Test
    public void testGetDataFimAvCandidaturaAndSetDataFimAvCandidatura() {
        System.out.println("testeDataFimAvCandidatura");
        Exposicao instance = new Exposicao();
        Data data = new Data(2016, 06, 8);
        instance.setDataFimAvCandidatura(data);
        Data expResult = data;
        Data result = instance.getDataFimAvCandidatura();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getDataFimAvCandidatura method, of class Exposicao.
     */
    @Test
    public void testGetDataIniSubCandAndSetDataIniSubCan(){
         System.out.println("testeDataIniSubCandidatura");
        Exposicao instance = new Exposicao();
        Data data = new Data(2016, 06, 8);
        instance.setDataIniSubCan(data);
        Data expResult = data;
        Data result = instance.getDataIniSubCan();
        assertEquals(expResult, result);
    }

    /**
     * Test of addOrganizador method, of class Exposicao.
     */
    @Test
    public void testAddOrganizador() {
        System.out.println("TesteAddOrganizador");
        Utilizador u = new Utilizador("nome", "username", "email", "password","keyword");
        Exposicao instance = new Exposicao();
        Boolean expResult = true;
        Boolean result = false;
        instance.addOrganizador(u);
        List<Organizador> lo = instance.getListaOrganizadores().getListaOrganizadores();
        Organizador o = instance.getListaOrganizadores().getListaOrganizadores().get(lo.size() - 1);
        if (o.getUtilizador().equals(u)) {
            result = true;
        }
        assertEquals(expResult, result);
    }

    /**
     * Test of getFAE method, of class Exposicao.
     */
    @Test
    public void testGetFAE() {
        System.out.println("testeFAE");
        Utilizador u = new Utilizador("nome", "username", "email", "password","keyword");    
        Exposicao instance = new Exposicao();
        FAE expResult = null;
        FAE result = instance.getFAE(u);
        assertEquals(expResult, result);
    }

//    /**
//     * Test of VerificarSeEOrganizadorDaExpo method, of class Exposicao.
//     */
//    @Test
//    public void testVerificarSeEOrganizadorDaExpo() {
//        System.out.println("VerificarSeEOrganizadorDaExpo");
//        Organizador org = null;
//        Exposicao instance = new Exposicao();
//        boolean expResult = false;
//        boolean result = instance.VerificarSeEOrganizadorDaExpo(org);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of getListaAtribuicoesFAE method, of class Exposicao.
     */
    @Test
    public void testGetListaAtribuicoesFAE() {
        System.out.println("TesteListaAtribuicoesFAE");
        Utilizador u = new Utilizador("nome", "username", "email", "password","Keyword");
        FAE fae = new FAE(u);
        Exposicao instance = new Exposicao();
        ListaAtribuicoes la = new ListaAtribuicoes();
        instance.setListaAtribuicoes(la);
        boolean expResult = false;
        boolean result = la.verificarSeContemFAE(fae);
        assertEquals(expResult, result);

    }

//    /**
//     * Test of getEstado method, of class Exposicao.
//     */
//    @Test
//    public void testGetEstado() {
//        System.out.println("getEstado");
//        Exposicao instance = new Exposicao();
//        ExposicaoEstado expResult = null;
//        ExposicaoEstado result = instance.getEstado();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setEstado method, of class Exposicao.
//     */
//    @Test
//    public void testSetEstado() {
//        System.out.println("setEstado");
//        ExposicaoEstado novoSt = null;
//        Exposicao instance = new Exposicao();
//        instance.setEstado(novoSt);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setExposicaoConfltiosAlterados method, of class Exposicao.
//     */
//    @Test
//    public void testSetExposicaoConfltiosAlterados() {
//        System.out.println("setExposicaoConfltiosAlterados");
//        Exposicao instance = new Exposicao();
//        boolean expResult = false;
//        boolean result = instance.setExposicaoConfltiosAlterados();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setExposicaoCandidaturasAtribuidas method, of class Exposicao.
//     */
//    @Test
//    public void testSetExposicaoCandidaturasAtribuidas() {
//        System.out.println("setExposicaoCandidaturasAtribuidas");
//        Exposicao instance = new Exposicao();
//        boolean expResult = false;
//        boolean result = instance.setExposicaoCandidaturasAtribuidas();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setExposicaoCandidaturasAvaliadas method, of class Exposicao.
//     */
//    @Test
//    public void testSetExposicaoCandidaturasAvaliadas() {
//        System.out.println("setExposicaoCandidaturasAvaliadas");
//        Exposicao instance = new Exposicao();
//        boolean expResult = false;
//        boolean result = instance.setExposicaoCandidaturasAvaliadas();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setExposicaoCandidaturasDecididas method, of class Exposicao.
//     */
//    @Test
//    public void testSetExposicaoCandidaturasDecididas() {
//        System.out.println("setExposicaoCandidaturasDecididas");
//        Exposicao instance = new Exposicao();
//        boolean expResult = false;
//        boolean result = instance.setExposicaoCandidaturasDecididas();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of getAvaliaveis method, of class Exposicao.
     */
    @Test
    public void testGetAvaliaveis() {
        System.out.println("TesteAvaliaveis");
        Utilizador u = new Utilizador("nome", "username", "email", "password","Keyword");
        FAE fae = new FAE(u);
        Exposicao instance = new Exposicao();
        ListaAtribuicoes la = new ListaAtribuicoes();
        List<Candidatura> expResult = la.getListaCandidaturasFAE(fae);
        List<Candidatura> result = instance.getAvaliaveis(fae);
        assertEquals(expResult, result);
    }

    /**
     * Test of getDecisiveis method, of class Exposicao.
     */
    @Test
    public void testGetDecisiveis() {
        System.out.println("TesteDecisiveis");
        Exposicao instance = new Exposicao();
        ListaCandidaturasExposicoes lCandExpo = new ListaCandidaturasExposicoes();
        List<Candidatura> listaCand = new ArrayList<>();
        listaCand.addAll(lCandExpo.getListCandidaturas());
        List<Candidatura> expResult = listaCand;
        List<Candidatura> result = instance.getDecisiveis();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaAtribuicoes method, of class Exposicao.
     */
    @Test
    public void testGetListaAtribuicoesAndSetListaAtribuicoes() {
        System.out.println("TesteListaAtribuicoes");
        Exposicao instance = new Exposicao();
        ListaAtribuicoes la = new ListaAtribuicoes();
        instance.setListaAtribuicoes(la);
        ListaAtribuicoes expResult = la;
        ListaAtribuicoes result = instance.getListaAtribuicoes();
        assertEquals(expResult, result);

    }

    /**
     * Test of getTitulo method, of class Exposicao.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        Exposicao instance = new Exposicao();
        String expResult = "";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescricao method, of class Exposicao.
     */
    @Test
    public void testGetDescricao() {
        System.out.println("getDescricao");
        Exposicao instance = new Exposicao();
        String expResult = "";
        String result = instance.getDescricao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataInicio method, of class Exposicao.
     */
    @Test
    public void testGetDataInicio() {
        System.out.println("getDataInicio");
        Exposicao instance = new Exposicao();
        Data expResult = null;
        Data result = instance.getDataInicio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataFim method, of class Exposicao.
     */
    @Test
    public void testGetDataFim() {
        System.out.println("getDataFim");
        Exposicao instance = new Exposicao();
        Data expResult = null;
        Data result = instance.getDataFim();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocal method, of class Exposicao.
     */
    @Test
    public void testGetLocal() {
        System.out.println("getLocal");
        Exposicao instance = new Exposicao();
        String expResult = "";
        String result = instance.getLocal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataInicioSubmissaoCandidaturasDemos method, of class Exposicao.
     */
    @Test
    public void testGetDataInicioSubmissaoCandidaturasDemos() {
        System.out.println("getDataInicioSubmissaoCandidaturasDemos");
        Exposicao instance = new Exposicao();
        Data expResult = null;
        Data result = instance.getDataInicioSubmissaoCandidaturasDemos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataFimSubmissaoCandidaturasDemos method, of class Exposicao.
     */
    @Test
    public void testGetDataFimSubmissaoCandidaturasDemos() {
        System.out.println("getDataFimSubmissaoCandidaturasDemos");
        Exposicao instance = new Exposicao();
        Data expResult = null;
        Data result = instance.getDataFimSubmissaoCandidaturasDemos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataInicioSubmissaoCandidaturasDemos method, of class Exposicao.
     */
    @Test
    public void testSetDataInicioSubmissaoCandidaturasDemos() {
        System.out.println("setDataInicioSubmissaoCandidaturasDemos");
        Data data = null;
        Exposicao instance = new Exposicao();
        instance.setDataInicioSubmissaoCandidaturasDemos(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataFimSubmissaoCandidaturasDemos method, of class Exposicao.
     */
    @Test
    public void testSetDataFimSubmissaoCandidaturasDemos() {
        System.out.println("setDataFimSubmissaoCandidaturasDemos");
        Data data = null;
        Exposicao instance = new Exposicao();
        instance.setDataFimSubmissaoCandidaturasDemos(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataFimAtualizacaoConflitosDemos method, of class Exposicao.
     */
    @Test
    public void testGetDataFimAtualizacaoConflitosDemos() {
        System.out.println("getDataFimAtualizacaoConflitosDemos");
        Data data = null;
        Exposicao instance = new Exposicao();
        Data expResult = null;
        Data result = instance.getDataFimAtualizacaoConflitosDemos(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataFimAtualizacaoConflitosDemos method, of class Exposicao.
     */
    @Test
    public void testSetDataFimAtualizacaoConflitosDemos() {
        System.out.println("setDataFimAtualizacaoConflitosDemos");
        Data data = null;
        Exposicao instance = new Exposicao();
        instance.setDataFimAtualizacaoConflitosDemos(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaCandidaturas method, of class Exposicao.
     */
    @Test
    public void testGetListaCandidaturas() {
        System.out.println("getListaCandidaturas");
        Exposicao instance = new Exposicao();
        ListaCandidaturasExposicoes expResult = null;
        ListaCandidaturasExposicoes result = instance.getListaCandidaturas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaCandidaturas method, of class Exposicao.
     */
    @Test
    public void testSetListaCandidaturas() {
        System.out.println("setListaCandidaturas");
        ListaCandidaturasExposicoes lc = null;
        Exposicao instance = new Exposicao();
        instance.setListaCandidaturas(lc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaConflitos method, of class Exposicao.
     */
    @Test
    public void testGetListaConflitos() {
        System.out.println("getListaConflitos");
        Exposicao instance = new Exposicao();
        ListaConflitos expResult = null;
        ListaConflitos result = instance.getListaConflitos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaConflitos method, of class Exposicao.
     */
    @Test
    public void testSetListaConflitos() {
        System.out.println("setListaConflitos");
        ListaConflitos lc = null;
        Exposicao instance = new Exposicao();
        instance.setListaConflitos(lc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaOrganizadores method, of class Exposicao.
     */
    @Test
    public void testGetListaOrganizadores() {
        System.out.println("getListaOrganizadores");
        Exposicao instance = new Exposicao();
        ListaOrganizadores expResult = null;
        ListaOrganizadores result = instance.getListaOrganizadores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaOrganizadores method, of class Exposicao.
     */
    @Test
    public void testSetListaOrganizadores() {
        System.out.println("setListaOrganizadores");
        ListaOrganizadores lo = null;
        Exposicao instance = new Exposicao();
        instance.setListaOrganizadores(lo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaDemonstracoes method, of class Exposicao.
     */
    @Test
    public void testGetListaDemonstracoes() {
        System.out.println("getListaDemonstracoes");
        Exposicao instance = new Exposicao();
        ListaDemonstracoes expResult = null;
        ListaDemonstracoes result = instance.getListaDemonstracoes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaDemonstracoes method, of class Exposicao.
     */
    @Test
    public void testSetListaDemonstracoes() {
        System.out.println("setListaDemonstracoes");
        ListaDemonstracoes ld = null;
        Exposicao instance = new Exposicao();
        instance.setListaDemonstracoes(ld);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitulo method, of class Exposicao.
     */
    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "";
        Exposicao instance = new Exposicao();
        instance.setTitulo(titulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescricao method, of class Exposicao.
     */
    @Test
    public void testSetDescricao() {
        System.out.println("setDescricao");
        String descricao = "";
        Exposicao instance = new Exposicao();
        instance.setDescricao(descricao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaFAES method, of class Exposicao.
     */
    @Test
    public void testGetListaFAES() {
        System.out.println("getListaFAES");
        Exposicao instance = new Exposicao();
        ListaFAEs expResult = null;
        ListaFAEs result = instance.getListaFAES();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaFAES method, of class Exposicao.
     */
    @Test
    public void testSetListaFAES() {
        System.out.println("setListaFAES");
        ListaFAEs lfae = null;
        Exposicao instance = new Exposicao();
        instance.setListaFAES(lfae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataInicio method, of class Exposicao.
     */
    @Test
    public void testSetDataInicio() {
        System.out.println("setDataInicio");
        Data dataInicio = null;
        Exposicao instance = new Exposicao();
        instance.setDataInicio(dataInicio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataFim method, of class Exposicao.
     */
    @Test
    public void testSetDataFim() {
        System.out.println("setDataFim");
        Data dataFim = null;
        Exposicao instance = new Exposicao();
        instance.setDataFim(dataFim);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocal method, of class Exposicao.
     */
    @Test
    public void testSetLocal() {
        System.out.println("setLocal");
        String local = "";
        Exposicao instance = new Exposicao();
        instance.setLocal(local);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataFimSubCand method, of class Exposicao.
     */
    @Test
    public void testGetDataFimSubCand() {
        System.out.println("getDataFimSubCand");
        Exposicao instance = new Exposicao();
        Data expResult = null;
        Data result = instance.getDataFimSubCand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataFimSubCand method, of class Exposicao.
     */
    @Test
    public void testSetDataFimSubCand() {
        System.out.println("setDataFimSubCand");
        Data dataFimSubCand = null;
        Exposicao instance = new Exposicao();
        instance.setDataFimSubCand(dataFimSubCand);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataFimAtcConf method, of class Exposicao.
     */
    @Test
    public void testGetDataFimAtcConf() {
        System.out.println("getDataFimAtcConf");
        Exposicao instance = new Exposicao();
        Data expResult = null;
        Data result = instance.getDataFimAtcConf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataFimAtcConf method, of class Exposicao.
     */
    @Test
    public void testSetDataFimAtcConf() {
        System.out.println("setDataFimAtcConf");
        Data dataFimAtcConf = null;
        Exposicao instance = new Exposicao();
        instance.setDataFimAtcConf(dataFimAtcConf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataFimAvCandidatura method, of class Exposicao.
     */
    @Test
    public void testGetDataFimAvCandidatura() {
        System.out.println("getDataFimAvCandidatura");
        Exposicao instance = new Exposicao();
        Data expResult = null;
        Data result = instance.getDataFimAvCandidatura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataFimAvCandidatura method, of class Exposicao.
     */
    @Test
    public void testSetDataFimAvCandidatura() {
        System.out.println("setDataFimAvCandidatura");
        Data dataFimAvCandidatura = null;
        Exposicao instance = new Exposicao();
        instance.setDataFimAvCandidatura(dataFimAvCandidatura);
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
     * Test of setExposicaoConflitosAtualizados method, of class Exposicao.
     */
    @Test
    public void testSetExposicaoConflitosAtualizados() {
        System.out.println("setExposicaoConflitosAtualizados");
        Exposicao instance = new Exposicao();
        boolean expResult = false;
        boolean result = instance.setExposicaoConflitosAtualizados();
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

    /**
     * Test of setListaAtribuicoes method, of class Exposicao.
     */
    @Test
    public void testSetListaAtribuicoes() {
        System.out.println("setListaAtribuicoes");
        ListaAtribuicoes la = null;
        Exposicao instance = new Exposicao();
        instance.setListaAtribuicoes(la);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valida method, of class Exposicao.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        Exposicao instance = new Exposicao();
        boolean expResult = false;
        boolean result = instance.valida();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listacandidaturasAceites method, of class Exposicao.
     */
    @Test
    public void testListacandidaturasAceites() {
        System.out.println("listacandidaturasAceites");
        Exposicao instance = new Exposicao();
        List<CandidaturaExposicao> expResult = null;
        List<CandidaturaExposicao> result = instance.listacandidaturasAceites();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listacandidaturasNaoAceites method, of class Exposicao.
     */
    @Test
    public void testListacandidaturasNaoAceites() {
        System.out.println("listacandidaturasNaoAceites");
        Exposicao instance = new Exposicao();
        List<CandidaturaExposicao> expResult = null;
        List<CandidaturaExposicao> result = instance.listacandidaturasNaoAceites();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getlistaTodasKeywords method, of class Exposicao.
     */
    @Test
    public void testGetlistaTodasKeywords() {
        System.out.println("getlistaTodasKeywords");
        Exposicao instance = new Exposicao();
        List<Keyword> expResult = null;
        List<Keyword> result = instance.getlistaTodasKeywords();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estatisticaCandidaturas method, of class Exposicao.
     */
    @Test
    public void testEstatisticaCandidaturas() {
        System.out.println("estatisticaCandidaturas");
        Exposicao instance = new Exposicao();
        List<String> expResult = null;
        List<String> result = instance.estatisticaCandidaturas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataIniSubCan method, of class Exposicao.
     */
    @Test
    public void testGetDataIniSubCan() {
        System.out.println("getDataIniSubCan");
        Exposicao instance = new Exposicao();
        Data expResult = null;
        Data result = instance.getDataIniSubCan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataIniSubCan method, of class Exposicao.
     */
    @Test
    public void testSetDataIniSubCan() {
        System.out.println("setDataIniSubCan");
        Data dataIniSubCan = null;
        Exposicao instance = new Exposicao();
        instance.setDataIniSubCan(dataIniSubCan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
