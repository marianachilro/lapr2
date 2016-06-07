/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa um Registo de Recursos, através da sua lista de Recursos.
 * @author marianachilro
 */
public class RegistoRecursos {
    
    /**
     * A lista de Recursos.
     */
    private List <Recurso> listaRecursos;
    
    /**
     * Construtor de um Registo de Recursos. 
     */
    public RegistoRecursos(){
        this.listaRecursos= new ArrayList<>();
    }
    
    /**
     * Devolve a lista de Recursos do Registo de Recursos.
     * @return a lista de recursos
     */
    public List<Recurso> getListaRecursos(){
        return listaRecursos;
    }
    
    /**
     * Modifica a lista de Recursos do Registo de Recursos.
     * @param listaRecursos a ova lista de recursos
     */
    public void setListaRecursos(List <Recurso> listaRecursos){
        this.listaRecursos=listaRecursos;
    }
    
    /**
     * Veririfica se um Recurso já existe na lista de Recursos.
     * @param r o recurso a ser verificado
     * @return true se jé estiver contido na lista e false se não existir na lista.
     */
    public boolean validaRecurso(Recurso r){
        return this.listaRecursos.contains(r);
    }
    
    /**
     * Adiciona um Recurso à lista de Recursos.
     * @param r o recurso a ser adicionada
     * @return true se conseguir adicionar e false se não conseguir adicionar
     */
    public boolean addRecurso(Recurso r ){
        return this.listaRecursos.add(r);
    }
    
    /**
     * Cria um novo recurso.
     * @return o recurso cirado
     */
    public Recurso newRecurso(){
        return new Recurso();
    }
}
