/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.CandImpEstado;
import lapr.project.model.CandidaturaDemonstracao;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaCandidaturasDemonstracoes;
import lapr.project.model.ListaCandidaturasExposicoes;
import lapr.project.model.ListaDemonstracoes;
import lapr.project.model.RegistoExposicoes;
import lapr.project.model.Removivel;

/**
 *
 * @author Rita
 */
public class RemoverCandidaturaController {

    private final CentroExposicoes ce;
    private Exposicao e;
    private Removivel c;
    private final String email;
    private RegistoExposicoes re;
    private ListaCandidaturasExposicoes rce;
    private ListaCandidaturasDemonstracoes rcd;
    private ListaDemonstracoes rd;
    private List<Removivel> lc;
    private List<Demonstracao> ld;

    public RemoverCandidaturaController(CentroExposicoes ce, String email) {
        this.ce = ce;
        this.email = email;
    }

    public List<Exposicao> getListaExposicoes() {
        re = ce.getRegistoExposicoes();
        return re.getListaExposicoes();
    }

    public void selectExposicao(Exposicao e) {
        this.e = e;
    }

    public List<Removivel> getListaRemoviveis() {
        List<Removivel> lRemove = new ArrayList<>();
        lc = new ArrayList<>();
        rce = e.getListaCandidaturas();
        for (CandidaturaExposicao c : rce.getListaCandidaturasRep(email)) {
            lc.add((Removivel) c);
        }
        for (Removivel r : lc) {
            CandImpEstado st = r.getEstado();
            if (st.setEmSubmissao() || (st.setAlterada() && !st.setEmSubmissao())) {
                lRemove.add(r);
            }
        }
        rd = e.getListaDemonstracoes();
        ld = rd.getListaDemonstracao();
        for (Demonstracao d : ld) {
            rcd = d.getListaCandidaturas();
            lc = (List<Removivel>) (CandidaturaDemonstracao) rcd.getListaCandidaturasRep(email);
            for (Removivel r : lc) {
                CandImpEstado st = r.getEstado();
                if (st.setEmSubmissao() || (st.setAlterada() && !st.setEmSubmissao())) {
                    lRemove.add(r);
                }
            }
        }
        return lRemove;
    }

    public void selectCandidatura(Removivel c) {
        this.c = c;
    }

    public boolean removeCandidatura() {
        return c.setRemovida();
    }

}
