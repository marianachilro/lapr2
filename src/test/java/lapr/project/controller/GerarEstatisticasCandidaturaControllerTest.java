/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.Local;
import lapr.project.utils.Data;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author catarinarib
 */
public class GerarEstatisticasCandidaturaControllerTest {
    
    


    /**
     * Test of getCandidaturasAvaliadas method, of class GerarEstatisticasCandidaturaController.
     */
    @Test
    public void testGetCandidaturasAvaliadas() {
        System.out.println("getCandidaturasAvaliadas");
         CentroExposicoes ce = new CentroExposicoes();
        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao exp = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);
        
        GerarEstatisticasCandidaturaController instance = new GerarEstatisticasCandidaturaController(ce);
        List<CandidaturaExposicao> expResult = new ArrayList<>();
        List<CandidaturaExposicao> result = instance.getCandidaturasAvaliadas(exp);
        assertEquals(expResult, result);
    }


}
