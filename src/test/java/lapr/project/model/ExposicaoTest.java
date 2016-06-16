/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;
import lapr.project.utils.Data;
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

}
