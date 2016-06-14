/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.Candidatura;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaCandidaturasExposicoes;
import lapr.project.model.RegistoExposicoes;
import lapr.project.model.RegistoUtilizadores;

/**
 *
 * @author miniondevil
 */
public class ListarCandRemovidasController {
    private final CentroExposicoes ce;
    private final String username;
    public ListarCandRemovidasController(CentroExposicoes ce, String username){
        this.ce=ce;
        this.username=username;
    }
    public List<Exposicao> getListaExpoOrg(){
        RegistoExposicoes re = ce.getRegistoExposicoes();
        RegistoUtilizadores ru = ce.getRegistoUtilizadores();
        return re.getListaExposicoesOrganizador(username, ru);
    }
    public List<Candidatura>getListaCandRemovidas(Exposicao e){
       ListaCandidaturasExposicoes lc = e.getListaCandidaturas();
       List<Candidatura> rc = lc.getListaCandRemovidas();
       rc.addAll(e.getListaDemonstracoes().getListaCandRemovidas());
       return rc;
    }
    
}
