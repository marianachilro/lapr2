/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.List;

/**
 *
 * @author miniondevil
 */
public interface MecanismoAtribuicao {
  public List<Atribuicao> atribui(List<FAE> listaf, ListaConflitos rconf, PodeAtribuir st,ListaAtribuicoes listaAtribuicoes);  
}
