/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rita
 */
public class ListaRecursos {
     private final List<Recurso> listaRecursos;
     
     public ListaRecursos() {
         this.listaRecursos = new ArrayList<>();
     }
     
     public List<Recurso> getListaRecursos() {
         return listaRecursos;
     }
     
     public Recurso novoRecurso() {
         return new Recurso();
     }
     
     public int tamanho() {
         return listaRecursos.size();
     }
     
     public boolean validaRecurso(Recurso r) {
         if(tamanho()>0) {
             return listaRecursos.contains(r);
         } else {
             return false;
         }
     }
     
     public boolean addRecurso(Recurso r) {
         return listaRecursos.add(r);
     }
     
     public boolean registaRecurso(Recurso r) {
         if(validaRecurso(r)) {
             return addRecurso(r);
         } else {
             return false;
         }
     }
}
