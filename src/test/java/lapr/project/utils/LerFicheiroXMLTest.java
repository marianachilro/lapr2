/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

import lapr.project.model.CandImpEstado;
import lapr.project.model.CandidaturaGeral;
import lapr.project.model.DemoImpEstado;
import lapr.project.model.Demonstracao;
import lapr.project.model.ExpoImpEstado;
import lapr.project.model.Exposicao;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author miniondevil
 */
public class LerFicheiroXMLTest {
    
    public LerFicheiroXMLTest() {
    }



   

    /**
     * Testa o método setestadosdemo par conflitos detetados.
     */
    @Test
    public void testSetEstadosDemo() {
        System.out.println("setEstadosDemo");
        Demonstracao d = new Demonstracao();
        d.setEstado(new DemoImpEstado(d, "demonstracaoConflitosDetetados"));
        LerFicheiroXML instance = new LerFicheiroXML(null);
        instance.setEstadosDemo(d);
        boolean expResult = true;
        boolean result = d.getEstado().setConflitosDetetados();
        assertEquals(expResult,result);
    }
    /**
     * Testa o método setestadosdemo para candidaturas abertas.
     */
    @Test
    public void testSetEstadosDemo1() {
     
        Demonstracao d = new Demonstracao();
        d.setEstado(new DemoImpEstado(d, "demonstracaoCandidaturasAbertas"));
        LerFicheiroXML instance = new LerFicheiroXML(null);
        instance.setEstadosDemo(d);
        boolean expResult = true;
        boolean result = d.getEstado().setCandidaturasAbertas();
        assertEquals(expResult,result);
    }
/**
     * Testa o método setestadosdemo para candidaturas atribuidas.
     */
    @Test
    public void testSetEstadosDemo2() {
        Demonstracao d = new Demonstracao();
        d.setEstado(new DemoImpEstado(d, "demonstracaoCandidaturasAtribuidas"));
        LerFicheiroXML instance = new LerFicheiroXML(null);
        instance.setEstadosDemo(d);
        boolean expResult = true;
        boolean result = d.getEstado().setCandidaturasAtribuidas();
        assertEquals(expResult,result);
    }
    /**
     * Testa o método setestadosdemo para candidaturas avaliadas.
     */
    @Test
    public void testSetEstadosDemo3() {
        System.out.println("setEstadosDemo");
        Demonstracao d = new Demonstracao();
        d.setEstado(new DemoImpEstado(d, "demonstracaoCandidaturasDecididas"));
        LerFicheiroXML instance = new LerFicheiroXML(null);
        instance.setEstadosDemo(d);
        boolean expResult = true;
        boolean result = d.getEstado().setCandidaturasDecididas();
        assertEquals(expResult,result);
    }
    /**
     * Testa o método setestadosdemo para candidaturas fechadas.
     */
    @Test
    public void testSetEstadosDemo4() {
        Demonstracao d = new Demonstracao();
        d.setEstado(new DemoImpEstado(d, "demonstracaoCandidaturasFechadas"));
        LerFicheiroXML instance = new LerFicheiroXML(null);
        instance.setEstadosDemo(d);
        boolean expResult = true;
        boolean result = d.getEstado().setCandidaturasFechadas();
        assertEquals(expResult,result);
    }
    /**
     * Testa o método setestadosdemo para demonstracoes confirmadas.
     */
    @Test
    public void testSetEstadosDemo5() {
        Demonstracao d = new Demonstracao();
        d.setEstado(new DemoImpEstado(d, "demonstracaoConfirmada"));
        LerFicheiroXML instance = new LerFicheiroXML(null);
        instance.setEstadosDemo(d);
        boolean expResult = true;
        boolean result = d.getEstado().setConfirmada();
        assertEquals(expResult,result);
    }
    /**
     * Testa o método setestadosdemo para conflitos atualizados.
     */
    @Test
    public void testSetEstadosDemo6() {
        Demonstracao d = new Demonstracao();
        d.setEstado(new DemoImpEstado(d, "demonstracaoConflitosAtualizados"));
        LerFicheiroXML instance = new LerFicheiroXML(null);
        instance.setEstadosDemo(d);
        boolean expResult = true;
        boolean result = d.getEstado().setConflitosAtualizados();
        assertEquals(expResult,result);
    }
    /**
     * Testa o método setestadosdemo para demonstracao criada.
     */
    @Test
    public void testSetEstadosDemo7() {
        System.out.println("setEstadosDemo");
        Demonstracao d = new Demonstracao();
        d.setEstado(new DemoImpEstado(d, "demonstracaoCriada"));
        LerFicheiroXML instance = new LerFicheiroXML(null);
        instance.setEstadosDemo(d);
        boolean expResult = true;
        boolean result = d.getEstado().setCriada();
        assertEquals(expResult,result);
    }
    /**
     * Testa o método setestadosdemo para nao confirmadas.
     */
    @Test
    public void testSetEstadosDemo8() {
        Demonstracao d = new Demonstracao();
        d.setEstado(new DemoImpEstado(d, "demonstracaoNaoConfirmada"));
        LerFicheiroXML instance = new LerFicheiroXML(null);
        instance.setEstadosDemo(d);
        boolean expResult = true;
        boolean result = d.getEstado().setNaoConfirmada();
        assertEquals(expResult,result);
    }
    /**
     * Test of setEstadosCand method, of class LerFicheiroXML.
     */
    @Test
    public void testSetEstadosCand() {
        System.out.println("setEstadosCand");
        CandidaturaGeral c = new CandidaturaGeral();
        c.setEstado(new CandImpEstado(c,"candidaturaConflitosDetetados"));
        LerFicheiroXML instance = new LerFicheiroXML(null);
        instance.setEstadosCand(c);
        boolean expResult = true;
        boolean result = c.getEstado().setConflitosDetetados();
        assertEquals(expResult,result);
        
    }

    /**
     * Test of setEstadosExpo method, of class LerFicheiroXML.
     */
    @Test
    public void testSetEstadosExpo() {
        System.out.println("setEstadosExpo");
        Exposicao e = new Exposicao();
        e.setEstado(new ExpoImpEstado(e, "ExposicaoStandsAtribuidos"));
        LerFicheiroXML instance = new LerFicheiroXML(null);
        instance.setEstadosExpo(e);
        boolean expResult = true;
        boolean result = e.getEstado().setStandsAtribuidos();
    
    }

   
    
}
