/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author miniondevil
 */
public class Mecanismo_NFAETest {

    /**
     * Testa o método atribui para candidaturas da exposição..
     */
    @Test
    public void testAtribui() {
        System.out.println("atribui");
        Exposicao e = new Exposicao();
        List<FAE> listaf = e.getListaFAES().getListaFAEs();
        ListaConflitos rconf = e.getListaConflitos();
        e.setEstado(new ExposicaoConflitosAtualizadosExpoEstado(e));
        FAE fae1 = new FAE();
        FAE fae2 = new FAE();
        FAE fae3 = new FAE();
        FAE fae4 = new FAE();
        FAE fae5 = new FAE();
        FAE fae6 = new FAE();
        e.getListaFAES().addFae(fae1);
        e.getListaFAES().addFae(fae2);
        e.getListaFAES().addFae(fae3);
        e.getListaFAES().addFae(fae4);
        e.getListaFAES().addFae(fae5);
        e.getListaFAES().addFae(fae6);
        CandidaturaExposicao c1 = new CandidaturaExposicao();
        c1.setEstado(new CandidaturaConflitosAlteradosEstado(c1));
        CandidaturaExposicao c2 = new CandidaturaExposicao();
        c2.setEstado(new CandidaturaConflitosAlteradosEstado(c2));
        CandidaturaExposicao c3 = new CandidaturaExposicao();
        c3.setEstado(new CandidaturaConflitosAlteradosEstado(c3));
        e.getListaCandidaturas().addCandidatura(c1);
        e.getListaCandidaturas().addCandidatura(c2);
        e.getListaCandidaturas().addCandidatura(c3);

        PodeAtribuir st = (PodeAtribuir) e.getEstado();
        ListaAtribuicoes listaAtribuicoes = e.getListaAtribuicoes();
        Mecanismo_NFAE instance = new Mecanismo_NFAE(2);
        List<Atribuicao> expResult = new ArrayList<>();
        expResult.add(new Atribuicao(fae1, c1));
        expResult.add(new Atribuicao(fae2, c1));
        expResult.add(new Atribuicao(fae3, c2));
        expResult.add(new Atribuicao(fae4, c2));
        expResult.add(new Atribuicao(fae5, c3));
        expResult.add(new Atribuicao(fae6, c3));

        List<Atribuicao> result = instance.atribui(listaf, rconf, st, listaAtribuicoes);
        assertEquals(expResult, result);

    }

    /**
     * Testa o método atribui para candidaturas da demonstração..
     */
    @Test
    public void testAtribuiDemonstracao() {
        System.out.println("atribui");
        Exposicao e = new Exposicao();
        List<FAE> listaf = e.getListaFAES().getListaFAEs();
        ListaConflitos rconf = e.getListaConflitos();
        e.setEstado(new ExposicaoConflitosAtualizadosDemosEstado(e));
        FAE fae1 = new FAE();
        FAE fae2 = new FAE();
        FAE fae3 = new FAE();
        FAE fae4 = new FAE();
        FAE fae5 = new FAE();
        FAE fae6 = new FAE();
        e.getListaFAES().addFae(fae1);
        e.getListaFAES().addFae(fae2);
        e.getListaFAES().addFae(fae3);
        e.getListaFAES().addFae(fae4);
        e.getListaFAES().addFae(fae5);
        e.getListaFAES().addFae(fae6);
        Demonstracao d1 = new Demonstracao();
        Demonstracao d2 = new Demonstracao();
        CandidaturaDemonstracao c1 = new CandidaturaDemonstracao();
        c1.setEstado(new CandidaturaConflitosAlteradosEstado(c1));
        CandidaturaDemonstracao c2 = new CandidaturaDemonstracao();
        c2.setEstado(new CandidaturaConflitosAlteradosEstado(c2));
        CandidaturaDemonstracao c3 = new CandidaturaDemonstracao();
        c3.setEstado(new CandidaturaConflitosAlteradosEstado(c3));
        d1.getListaCandidaturas().addCandidatura(c1);
        d1.getListaCandidaturas().addCandidatura(c2);
        d2.getListaCandidaturas().addCandidatura(c3);
        e.getListaDemonstracoes().addDemonstracao(d1);
        e.getListaDemonstracoes().addDemonstracao(d2);

        PodeAtribuir st = (PodeAtribuir) e.getEstado();
        ListaAtribuicoes listaAtribuicoes = e.getListaAtribuicoes();
        Mecanismo_NFAE instance = new Mecanismo_NFAE(2);
        List<Atribuicao> expResult = new ArrayList<>();
        expResult.add(new Atribuicao(fae1, c1));
        expResult.add(new Atribuicao(fae2, c1));
        expResult.add(new Atribuicao(fae3, c2));
        expResult.add(new Atribuicao(fae4, c2));
        expResult.add(new Atribuicao(fae5, c3));
        expResult.add(new Atribuicao(fae6, c3));

        List<Atribuicao> result = instance.atribui(listaf, rconf, st, listaAtribuicoes);
        assertEquals(expResult, result);

    }

}
