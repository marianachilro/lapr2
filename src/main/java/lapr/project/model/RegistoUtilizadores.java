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
        return listaUtilizadores.contains(u);
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

    /**
     * Adiciona um Utilizador à List, apenas se esta ainda não existir na mesma.
     * Devolve um boolean, true se a operação tiver sucesso, false se não tiver
     * sucesso.
     *
     * @param u Utilizador
     * @return boolean
     */
    public boolean registaUtilizador(Utilizador u) {
        if (validaUtilizador(u)) {
            addUtilizador(u);
            return true;
        } else {
            return false;
        }
    }
}
