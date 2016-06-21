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
        Local local = new Local("Porto");
        instance.setLocal(local);
        Local expResult = local;
        Local result = instance.getLocal();
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
    public void testGetDataIniSubCandAndSetDataIniSubCan() {
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
        Utilizador u = new Utilizador("nome", "username", "email@centro.pt", "aA;4", "keywor");
        Exposicao instance = new Exposicao();
        Boolean expResult = true;
        Boolean result = instance.addOrganizador(u);;

        assertEquals(expResult, result);
    }

    /**
     * Test of getFAE method, of class Exposicao.
     */
    @Test
    public void testGetFAE() {
        System.out.println("testeFAE");
        Utilizador u = new Utilizador("nome", "username", "email@centro.pt", "aA;2", "keywrd");
        Exposicao instance = new Exposicao();
        FAE expResult = null;
        FAE result = instance.getFAE(u);
        assertEquals(expResult, result);
    }

    /**
     * Test of VerificarSeEOrganizadorDaExpo method, of class Exposicao.
     */
    @Test
    public void testVerificarSeEOrganizadorDaExpo() {
        System.out.println("VerificarSeEOrganizadorDaExpo");
        Utilizador u = new Utilizador("nome", "username", "email@centro.pt", "aA;2", "keywrd");
        Exposicao instance = new Exposicao();
        instance.addOrganizador(u);
        Organizador org = new Organizador(u);
        boolean expResult = true;
        boolean result = instance.VerificarSeEOrganizadorDaExpo(org);
        assertEquals(expResult, result);

    }

    /**
     * Test of getListaAtribuicoesFAE method, of class Exposicao.
     */
    @Test
    public void testGetListaAtribuicoesFAEAndSetListaAtribuicoesFAE() {
        System.out.println("TesteListaAtribuicoesFAE");
        Utilizador u = new Utilizador("nome", "username", "email@centro.pt", "aA;2", "Keword");
        FAE fae = new FAE(u);
        Exposicao instance = new Exposicao();
        ListaAtribuicoes la = new ListaAtribuicoes();
        instance.setListaAtribuicoes(la);
        List<Candidatura> expResult = new ArrayList<>();
        List<Candidatura> result = instance.getListaAtribuicoesFAE(fae);
        assertEquals(expResult, result);

    }

    /**
     * Test of getEstado method, of class Exposicao.
     */
    @Test
    public void testGetEstadoAndSetEstado() {
        System.out.println("testeEstado");
        ExpoImpEstado novoSt = null;
        Exposicao instance = new Exposicao();
        instance.setEstado(novoSt);
        ExposicaoEstado expResult = novoSt;
        ExposicaoEstado result = instance.getEstado();
        assertEquals(expResult, result);

    }

    

    /**
     * Test of getAvaliaveis method, of class Exposicao.
     */
    @Test
    public void testGetAvaliaveis() {
        System.out.println("TesteAvaliaveis");
        Utilizador u = new Utilizador("nome", "username", "email@centro.pt", "aA;2", "Keword");
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
     * Test of getDataInicioSubmissaoCandidaturasDemos method, of class
     * Exposicao.
     */
    @Test
    public void testGetDataInicioSubmissaoCandidaturasDemosAndSetDataInicioSubmissaoCandidaturasDemos() {
        System.out.println("testeDataInicioSubmissaoCandidaturasDemos");
        Data data = null;
        Exposicao instance = new Exposicao();
        instance.setDataInicioSubmissaoCandidaturasDemos(data);
        Data expResult = null;
        Data result = instance.getDataInicioSubmissaoCandidaturasDemos();
        assertEquals(expResult, result);

    }
//

    /**
     * Test of getDataFimSubmissaoCandidaturasDemos method, of class Exposicao.
     */
    @Test
    public void testGetDataFimSubmissaoCandidaturasDemosAndSetDataFimSubmissaoCandidaturasDemos() {
        System.out.println("testeDataFimSubmissaoCandidaturasDemos");
        Data data = null;
        Exposicao instance = new Exposicao();
        instance.setDataFimSubmissaoCandidaturasDemos(data);
        Data expResult = null;
        Data result = instance.getDataFimSubmissaoCandidaturasDemos();
        assertEquals(expResult, result);

    }

    /**
     * Test of getDataFimAtualizacaoConflitosDemos method, of class Exposicao.
     */
    @Test
    public void testGetDataFimAtualizacaoConflitosDemosAndSetDataFimAtualizacaoConflitosDemos() {
        System.out.println("testDataFimAtualizacaoConflitosDemos");
        Data data = null;
        Exposicao instance = new Exposicao();
        instance.setDataFimAtualizacaoConflitosDemos(data);
        Data expResult = null;
        Data result = instance.getDataFimAtualizacaoConflitosDemos();
        assertEquals(expResult, result);
        
    }

  
    /**
     * Test of setAtribuicoes method, of class Exposicao.
     */
    @Test
    public void testSetAtribuicoes() {
        System.out.println("setAtribuicoes");
        List<Atribuicao> lA = new ArrayList<>();
        Exposicao instance = new Exposicao();
        instance.setAtribuicoes(lA);
        
    }
    /**
     * Test of valida method, of class Exposicao.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        Exposicao instance = new Exposicao();
        boolean expResult = true;
        boolean result = instance.valida();
        assertEquals(expResult, result);
       
    }
    
    /**
     * Test of listacandidaturasAceites method, of class Exposicao.
     */
    @Test
    public void testListacandidaturasAceites() {
        System.out.println("listacandidaturasAceites");
        Exposicao instance = new Exposicao();
        List<CandidaturaExposicao> expResult =new ArrayList<>();
        List<CandidaturaExposicao> result = instance.listacandidaturasAceites();
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of listacandidaturasNaoAceites method, of class Exposicao.
     */
    @Test
    public void testListacandidaturasNaoAceites() {
        System.out.println("listacandidaturasNaoAceites");
        Exposicao instance = new Exposicao();
        List<CandidaturaExposicao> expResult = new ArrayList<>();
        List<CandidaturaExposicao> result = instance.listacandidaturasNaoAceites();
        assertEquals(expResult, result);
        
    }
    

    /**
     * Test of getlistaTodasKeywords method, of class Exposicao.
     */
    @Test
    public void testGetlistaTodasKeywords() {
        System.out.println("getlistaTodasKeywords");
        Exposicao instance = new Exposicao();
        List<Keyword> expResult = new ArrayList<>();
        List<Keyword> result = instance.getlistaTodasKeywords();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of estatisticaCandidaturas method, of class Exposicao.
     */
    @Test
    public void testEstatisticaCandidaturas() {
        System.out.println("estatisticaCandidaturas");
        Exposicao instance = new Exposicao();
        List<String> expResult = new ArrayList<>();
        List<String> result = instance.estatisticaCandidaturas();
        assertEquals(expResult, result);
       
    }

}
