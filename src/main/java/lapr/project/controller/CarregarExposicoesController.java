/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.LerFicheiroXML;
import lapr.project.model.RegistoExposicoes;
import org.w3c.dom.Node;

/**
 *
 * @author miniondevil
 */
public class CarregarExposicoesController {
    private CentroExposicoes ce;
    private List<Exposicao> le;
    private RegistoExposicoes re;
    public CarregarExposicoesController(CentroExposicoes ce){
        this.ce=ce;
        le = new ArrayList<Exposicao>();
    }
    public void lerExpo(Node ficheiro){
        re = ce.getRegistoExposicoes();
        Exposicao e = re.newExposicao();
        e = LerFicheiroXML.lerExposicao(ficheiro);
        le.add(e);
    }
    public boolean addDados(){
        
        return re.validaLista(le);
    }
}
