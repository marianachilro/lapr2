/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.Candidatura;
import lapr.project.model.CandidaturaEstado;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.DemonstracaoEstado;
import lapr.project.model.Exposicao;
import lapr.project.model.ExposicaoEstado;
import lapr.project.model.ListaCandidaturasDemonstracoes;
import lapr.project.model.ListaCandidaturasExposicoes;
import lapr.project.model.MecanismoDetecaoConflito;
import lapr.project.model.RegistoTipoConflitos;
import lapr.project.model.TipoConflito;

/**
 *
 * @author marianachilro
 */
public class DefinirConflitosController {

    private final CentroExposicoes centro;

    private final Exposicao exposicao;

    private RegistoTipoConflitos regTiposConflitos;

    private ExposicaoEstado estadoExpo;

    public DefinirConflitosController(CentroExposicoes centro, Exposicao exposicao) {
        this.centro = centro;
        this.exposicao = exposicao;
    }

    public void run() {
        this.regTiposConflitos = this.centro.getRegistoTipoConflitos();
        List<TipoConflito> listaTiposConflitoAtivos = this.regTiposConflitos.getTiposConflitoAtivos();
        estadoExpo = this.exposicao.getEstado();

        for (TipoConflito t : listaTiposConflitoAtivos) {
            MecanismoDetecaoConflito m =(MecanismoDetecaoConflito) t.getListaMecanismos().get(0);
            m.detetarConflitos(this.exposicao);

        }

        if (!this.estadoExpo.setExposicaoCandidaturasAbertas() && this.estadoExpo.setExposicaoCandidaturasFechadas()) {
            ListaCandidaturasExposicoes lcandidaturas = this.exposicao.getListaCandidaturas();
            for (Candidatura c : lcandidaturas.getListCandidaturas()) {
                CandidaturaEstado estadoCandidaturaExpo = c.getEstado();
                boolean b = estadoCandidaturaExpo.setConflitosDetetados();
                
            }
            boolean b = this.estadoExpo.setExposicaoConflitosAtualizados();
        }
        
        if(!this.estadoExpo.setDemonstracaoCandidaturasAbertas() && this.estadoExpo.setDemonstracaoCandidaturasFechadas()){
            List <Demonstracao> lDemonstracoes = this.exposicao.getListaDemonstracoes().getListaDemonstracoesDisponiveis();
            for(Demonstracao d : lDemonstracoes){
                DemonstracaoEstado estadoDemo = d.getEstado();
                boolean b = estadoDemo.setConflitosDetetados();
                ListaCandidaturasDemonstracoes lcandidaturasDemos = d.getListaCandidaturas();
                for(Candidatura c : lcandidaturasDemos.getListCandidaturas()){
                    CandidaturaEstado estadoCandidaturaDemo = c.getEstado();
                    boolean bo = estadoCandidaturaDemo.setConflitosDetetados();
                }
            }
            boolean b = this.estadoExpo.setDemonstracaoConflitosDetetados();
        }
        
        
    }

}
