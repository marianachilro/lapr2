/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.utils.LerFicheiroXML;
import lapr.project.model.RegistoExposicoes;

/**
 *
 * @author miniondevil
 */
public class CarregarExposicoesController {
    private final CentroExposicoes ce;
    private List<Exposicao> le;
    private RegistoExposicoes re;
    public CarregarExposicoesController(CentroExposicoes ce){
        this.ce=ce;
        le = new ArrayList<>();
    }
    public void lerExpo(File ficheiro){
        re = ce.getRegistoExposicoes();
        LerFicheiroXML ler = new LerFicheiroXML(ficheiro);
         le = ler.lerExposicoes();
        
    }
    public boolean addDados(){
        
        if(re.validaLista(le)){
            re.getListaExposicoes().addAll(le);
            return true;
        }
        return false;
    }
}
