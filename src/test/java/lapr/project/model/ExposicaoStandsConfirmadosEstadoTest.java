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
 * @author marianachilro
 */
public class ExposicaoStandsConfirmadosEstadoTest {
    
    public ExposicaoStandsConfirmadosEstadoTest() {
    }

    /**
     * Test of setStandsConfirmados method, of class ExposicaoStandsConfirmadosEstado.
     */
    @Test
    public void testSetStandsConfirmados() {
        System.out.println("setStandsConfirmados");
        Exposicao expo = new Exposicao();
        expo.getEstado().setCriada();
        expo.getEstado().setDemoSemFae();
        expo.getEstado().setCompleta();
        expo.getEstado().setExposicaoCandidaturasAbertas();
        expo.getEstado().setExposicaoCandidaturasFechadas();
        expo.getEstado().setExposicaoConflitosDetetados();
        expo.getEstado().setExposicaoConflitosAtualizados();
        expo.getEstado().setExposicaoCandidaturasAtribuidas();
        expo.getEstado().setExposicaoCandidaturasAvaliadas();
        expo.getEstado().setExposicaoCandidaturasDecididas();
        expo.getEstado().setConfirmacaoRealizacaoDemos();
        expo.getEstado().setDemonstracaoCandidaturasAbertas();
        expo.getEstado().setDemonstracaoCandidaturasFechadas();
        expo.getEstado().setDemonstracaoConflitosDetetados();
        expo.getEstado().setDemonstracaoConflitosAtualizados();
        expo.getEstado().setDemonstracaoCandidaturasAtribuidas();
        expo.getEstado().setDemonstracaoCandidaturasAvaliadas();
        expo.getEstado().setDemonstracaoCandidaturasDecididas();
        expo.getEstado().setStandsAtribuidos();
        expo.getEstado().setStandsConfirmados();
        ExposicaoStandsConfirmadosEstado instance = new ExposicaoStandsConfirmadosEstado(expo);
        boolean expResult = true;
        boolean result = instance.setStandsConfirmados();
        assertEquals(expResult, result);
    }
    
}
