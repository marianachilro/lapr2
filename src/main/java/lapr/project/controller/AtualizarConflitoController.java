/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.CandidaturaDemonstracao;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CandidaturaGeral;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.Conflito;
import lapr.project.model.Demonstracao;
import lapr.project.model.FAE;
import lapr.project.model.ListaConflitos;
import lapr.project.model.RegistoTipoConflitos;
import lapr.project.model.TipoConflito;
import lapr.project.model.Utilizador;

/**
 *
 * @author marianachilro
 */
public class AtualizarConflitoController {

    private final CentroExposicoes centro;

    private final Utilizador utilizador;

    private final List<Exposicao> listaExposFAE;

    private Exposicao exposicao;

    private Demonstracao demonstracao;

    private CandidaturaGeral candidatura;

    private TipoConflito tipo;

    private Conflito conflito;

    private Conflito clone;

    private List<Conflito> listaConflitosFAE;

    public AtualizarConflitoController(CentroExposicoes centro, Utilizador u) {
        this.centro = centro;
        this.utilizador = u;
        this.listaExposFAE = centro.getRegistoExposicoes().getListaExposicoesDoFAE(u);
    }

    public Exposicao getExposicao() {
        return exposicao;
    }

    public CentroExposicoes getCentro() {
        return this.centro;
    }

    public Utilizador getUtilizador() {

        return this.utilizador;
    }

    public Conflito getConflito() {
        return this.conflito;
    }

    public List<Exposicao> getListaExposicoesFAEDisponiveis() {
        List<Exposicao> lista = new ArrayList<>();
        for (Exposicao e : listaExposFAE) {
            if (!e.getEstado().setExposicaoCandidaturasFechadas() && e.getEstado().setExposicaoConflitosDetetados()) {
                lista.add(e);
            }
        }
        return lista;
    }

    public List<CandidaturaExposicao> getListaCandidaturasFAEExpo() {
        List<Conflito> listaConflitos = exposicao.getListaConflitos().getListaConlitosFAE(utilizador);
        List<CandidaturaExposicao> lista = new ArrayList<>();
        boolean b = false;
        for (Conflito c : listaConflitos) {
            lista.add(c.getCandidaturaExpo());
        }
        return lista;
    }

    public List<CandidaturaDemonstracao> getListaCandidaturasFAEDemo() {
        List<Conflito> listaConflitos = exposicao.getListaConflitos().getListaConlitosFAE(utilizador);
        List<CandidaturaDemonstracao> lista = new ArrayList<>();
        boolean b = false;
        for (Conflito c : listaConflitos) {

            lista.add(c.getCandidaturaDemo());

        }
        return lista;
    }

    public void selecionaExpo(Exposicao e) {
        this.exposicao = e;
    }

    public void selecionaTipo(TipoConflito tipo) {
        this.tipo = tipo;
    }

    public void selecionaCandExpo(CandidaturaExposicao c) {
        this.candidatura = c;
    }
    
    public void selecionaCandDemos(CandidaturaDemonstracao c){
        this.candidatura=c;
    }

    public List<Conflito> getConflitosFAE() {

        FAE fae = this.exposicao.getListaFAES().getFAE(this.utilizador);

        ListaConflitos lc = this.exposicao.getListaConflitos();
        List<Conflito> lista = new ArrayList<>();
        for (Conflito c : lc.getLista()) {
            if (c.getFAE().equals(fae)) {
                lista.add(c);
            }
        }
        this.listaConflitosFAE = lista;
        return lista;
    }

    public void selecionaConflito(Conflito c) {
        this.conflito = c;
        this.clone = new Conflito(c);
    }

    public void setAlteracaoConflito() {
        this.listaConflitosFAE.remove(this.conflito);
        this.listaConflitosFAE.add(clone);
    }

    public RegistoTipoConflitos getRegistoTipoConflitos() {
        this.conflito = this.exposicao.getListaConflitos().newConflito();
        RegistoTipoConflitos rtc = this.centro.getRegistoTipoConflitos();
        return rtc;
    }

    public void setDados() {
        this.clone.setCandidaturas(this.candidatura);
        this.clone.setTipo(this.tipo);
        this.conflito.setFAE(new FAE(utilizador));
    }
    
    public void guardarDados(){
        this.conflito.setCandidaturas(this.candidatura);
        this.conflito.setTipo(this.tipo);
    }

    public void addConflito() {
        this.exposicao.getListaConflitos().getLista().add(this.conflito);
    }

    public String selecionaEApresenta(Conflito c) {
        this.conflito = c;
        return this.conflito.toString();
    }

    public void removeConflito() {
        this.listaConflitosFAE.remove(this.conflito);
    }

    public void criarCloneConflito(Conflito conflito) {
        this.clone = conflito;
    }
}
