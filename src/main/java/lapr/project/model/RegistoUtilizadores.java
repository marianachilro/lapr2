/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rita
 */
@XmlRootElement
public class RegistoUtilizadores {

    /**
     * List de Utilizadores.
     */
   
    private List<Utilizador> listaUtilizadores;

    /**
     * Construtor de um Registo de Utilizadores.
     */
    public RegistoUtilizadores() {
        this.listaUtilizadores = new ArrayList<>();
    }
    public RegistoUtilizadores(List<Utilizador> lista){
        this.listaUtilizadores = lista;
    }

    /**
     * Devolve a List de Utilizadores.
     *
     * @return List de Utilizadores
     */
    public List<Utilizador> getListaUtilizadores() {
        return listaUtilizadores;
    }

    /**
     * Modifica a List de Utilizadores.
     *
     * @param listaUtilizadores List de Utilizadores
     */
     @XmlElement(name="utilizador")
    public void setListaUtilizadores(List<Utilizador> listaUtilizadores) {
        this.listaUtilizadores = listaUtilizadores;
    }

    /**
     * Devolve um Utilizador que tenha o Username recebido por parâmetro.
     *
     * @param username Username de Utilizador pretendido
     * @return Utilizador
     */
    public Utilizador getUtilizador(String username) {
        Utilizador u = null;
        for (Utilizador uz : listaUtilizadores) {
            if (uz.getUsername().equals(username)) {
                u = uz;
            }
        }
        return u;
    }

    /**
     * Validação que devolve um boolean. True se o Utilizador já existir na
     * List. False se ainda não existir.
     *
     * @param u Utilizador
     * @return boolean
     */
    public boolean validaUtilizador(Utilizador u) {
        if(!listaUtilizadores.isEmpty()) {
            return listaUtilizadores.contains(u);
        } else {
            return false;
        }
    }

    /**
     * Adiciona um Utilizador ao list e devolve um boolean. True se esta for
     * adicionado com sucesso. False se esta não for adicionada com sucesso.
     *
     * @param u Utilizador
     * @return boolean
     */
    public boolean addUtilizador(Utilizador u) {
        return listaUtilizadores.add(u);
    }

    public boolean confirmaUtilizador(Utilizador u) {
        if (!validaUtilizador(u)) {
            addUtilizador(u);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Novo utilizador
     * @return utilizador
     */
     public Utilizador novoUtilizador() {
        return new Utilizador();
    }
     
    public boolean hasUtilizador(String username) {
        boolean b = false; 
        for(Utilizador u : listaUtilizadores) {
            if(u.getUsername().equals(username)) {
                b = true;
            }
        }
        return b;
    }
     
    @Override
    public String toString() {
        String st ="";
        for (Utilizador u : listaUtilizadores) {
            Security s = new Security(u.getShift(),u.getKeyword());
            st = u.toString() + "\n";
        }
        return st;
    }
    
    public boolean removerUtilizador(Utilizador u) {
        return listaUtilizadores.remove(u);
    }
    
}
