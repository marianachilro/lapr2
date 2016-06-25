/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ExposicaoEstado;
import lapr.project.model.FAE;
import lapr.project.model.Local;
import lapr.project.model.RegistoUtilizadores;
import lapr.project.model.Utilizador;
import lapr.project.utils.Data;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author catarinarib
 */
public class DefinirFaeControllerTest {

    /**
     * Test of getRegistoUtilizadores method, of class DefinirFaeController.
     */
    @Test
    public void testGetRegistoUtilizadores() {
        System.out.println("getRegistoUtilizadores");
        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u = new Utilizador(2, "a", "a", "a@centro.pt", "aA;1", "ddddd");

        DefinirFaeController instance = new DefinirFaeController(ce, u.getUsername());
        RegistoUtilizadores expResult = ce.getRegistoUtilizadores();
        RegistoUtilizadores result = instance.getRegistoUtilizadores();
        assertEquals(expResult, result);

    }

    /**
     * Test of getExposicoesOrganizador method, of class DefinirFaeController.
     */
    @Test
    public void testGetExposicoesOrganizador() {
        System.out.println("getExposicoesOrganizador");
        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u = new Utilizador(2, "a", "a", "a@centro.pt", "aA;1", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u);

        
        DefinirFaeController instance = new DefinirFaeController(ce, u.getUsername());
        instance.getRegistoUtilizadores();
        List<Exposicao> expResult = ce.getRegistoExposicoes().getListaExposicoesOrganizador(u.getUsername(), ce.getRegistoUtilizadores());
        List<Exposicao> result = instance.getExposicoesOrganizador();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of selectExposicao method, of class DefinirFaeController.
     */
    @Test
    public void testSelectExposicao() {
        System.out.println("selectExposicao");
        CentroExposicoes ce = new CentroExposicoes();
        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao e = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);
        
        Utilizador u = new Utilizador(2, "a", "a", "a@centro.pt", "aA;1", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u);

        
        DefinirFaeController instance = new DefinirFaeController(ce, u.getUsername());
        instance.selectExposicao(e);
       
    }

    /**
     * Test of getListaFae method, of class DefinirFaeController.
     */
    @Test
    public void testGetListaFae() {
        System.out.println("getListaFae");
        CentroExposicoes ce = new CentroExposicoes();
        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao e = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);
        
        Utilizador u = new Utilizador(2, "a", "a", "a@centro.pt", "aA;1", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u);

        
        DefinirFaeController instance = new DefinirFaeController(ce, u.getUsername());
        instance.selectExposicao(e);
        List<FAE> expResult = e.getListaFAES().getListaFAEs();
        List<FAE> result = instance.getListaFae();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of novoFae method, of class DefinirFaeController.
     */
    @Test
    public void testNovoFae() {
        System.out.println("novoFae");
        String username = "";
        CentroExposicoes ce = new CentroExposicoes();
        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao e = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);
        
        Utilizador u = new Utilizador(2, "a", "a", "a@centro.pt", "aA;1", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u);

        
        DefinirFaeController instance = new DefinirFaeController(ce, u.getUsername());
        
        instance.getRegistoUtilizadores();
        instance.selectExposicao(e);
         Utilizador u1 = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u1);
        instance.getListaFae();
        FAE fae = e.getListaFAES().novoFae();
        fae.setUtilizador(u1);
        FAE expResult = fae;
        FAE result = instance.novoFae(u1.getUsername());
        assertEquals(expResult, result);
        
    }

    /**
     * Test of registaFae method, of class DefinirFaeController.
     */
    @Test
    public void testRegistaFae() {
        System.out.println("registaFae");
        String username = "";
        CentroExposicoes ce = new CentroExposicoes();
        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao e = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);
        
        Utilizador u = new Utilizador(2, "a", "a", "a@centro.pt", "aA;1", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u);

        
        DefinirFaeController instance = new DefinirFaeController(ce, u.getUsername());
        
        instance.getRegistoUtilizadores();
        instance.selectExposicao(e);
         Utilizador u1 = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u1);
        instance.getListaFae();
        FAE fae = e.getListaFAES().novoFae();
        fae.setUtilizador(u1);
        instance.novoFae(u1.getUsername());
        
        boolean expResult = true;
        boolean result = instance.registaFae();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of apresentaLista method, of class DefinirFaeController.
     */
    @Test
    public void testApresentaLista() {
        System.out.println("apresentaLista");
         String username = "";
        CentroExposicoes ce = new CentroExposicoes();
        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao e = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);
        
        Utilizador u = new Utilizador(2, "a", "a", "a@centro.pt", "aA;1", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u);

        
        DefinirFaeController instance = new DefinirFaeController(ce, u.getUsername());
        
        instance.getRegistoUtilizadores();
        instance.selectExposicao(e);
         Utilizador u1 = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u1);
        instance.getListaFae();
        FAE fae = e.getListaFAES().novoFae();
        fae.setUtilizador(u1);
        instance.novoFae(u1.getUsername());
        instance.registaFae();
        
        String expResult = String.format("Nome: %s %n Username: %s %n E-mail: %s %n", u1.getNome(), u1.getUsername(), u1.getEmail());
        String result = instance.apresentaLista();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getEstado method, of class DefinirFaeController.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        CentroExposicoes ce = new CentroExposicoes();
        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao e = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);
        
        Utilizador u = new Utilizador(2, "a", "a", "a@centro.pt", "aA;1", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u);

        
        DefinirFaeController instance = new DefinirFaeController(ce, u.getUsername());
        
        instance.getRegistoUtilizadores();
        instance.selectExposicao(e);
        
        ExposicaoEstado expResult = e.getEstado();
        ExposicaoEstado result = instance.getEstado();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setFaeDefinidos method, of class DefinirFaeController.
     */
    @Test
    public void testSetFaeDefinidos() {
        System.out.println("setFaeDefinidos");
        CentroExposicoes ce = new CentroExposicoes();
        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao e = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);
        
        Utilizador u = new Utilizador(2, "a", "a", "a@centro.pt", "aA;1", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u);

        
        DefinirFaeController instance = new DefinirFaeController(ce, u.getUsername());
        
        instance.getRegistoUtilizadores();
        instance.selectExposicao(e);
        instance.getEstado();
        boolean expResult = false;
        boolean result = instance.setFaeDefinidos();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of checkEstado method, of class DefinirFaeController.
     */
    @Test
    public void testCheckEstado() {
        System.out.println("checkEstado");
        CentroExposicoes ce = new CentroExposicoes();
        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao e = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);
        
        Utilizador u = new Utilizador(2, "a", "a", "a@centro.pt", "aA;1", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u);

        
        DefinirFaeController instance = new DefinirFaeController(ce, u.getUsername());
        
        instance.getRegistoUtilizadores();
        instance.selectExposicao(e);
        instance.getEstado();
        
        boolean expResult = true;
        boolean result = instance.checkEstado();
        assertEquals(expResult, result);
      
    }
}
