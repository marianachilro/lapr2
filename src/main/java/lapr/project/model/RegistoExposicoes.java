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
public class RegistoExposicoes {

    /**
     * List de Exposições.
     */
    private List<Exposicao> listaExposicoes;

    /**
     * Construtor de um Registo de Exposições.
     */
    public RegistoExposicoes() {
        this.listaExposicoes = new ArrayList<>();
    }

    /**
     * Cria uma nova exposição.
     *
     * @return exposicao
     */
    public Exposicao newExposicao() {
        return new Exposicao();
    }

    /**
     * Devolve a List de Exposições.
     *
     * @return List de Exposições
     */
    public List<Exposicao> getListaExposicoes() {
        return listaExposicoes;
    }

    /**
     * Modifica a List de Exposições.
     *
     * @param listaExposicoes List de Exposições
     */
    public void setListaExposicoes(List<Exposicao> listaExposicoes) {
        this.listaExposicoes = listaExposicoes;
    }

    /**
     * Devolve uma List de Exposições de um Organizador, que é identificado pelo
     * username.
     *
     * @param username Username de Organizador
     * @param ru Registo de Utilizadores
     * @return List de Exposições de Organizador
     */
    public List<Exposicao> getListaExposicoesOrganizador(String username, RegistoUtilizadores ru) {
        Utilizador u = ru.getUtilizador(username);
        List<Exposicao> listaExposicoesOrganizador = new ArrayList<>();
        for (Exposicao e : listaExposicoes) {
            if (e.getListaOrganizadores().hasOrganizador(u)) {
                listaExposicoesOrganizador.add(e);
            }
        }
        return listaExposicoesOrganizador;
    }

    /**
     * Validação que devolve um boolean. True se a Exposição já existir na List.
     * False se ainda não existir.
     *
     * @param e Exposição
     * @return boolean
     */
    public boolean valida(Exposicao e) {
        return listaExposicoes.contains(e);
    }

    /**
     * Adiciona uma Exposição ao list e devolve um boolean. True se esta for
     * adicionado com sucesso. False se esta não for adicionada com sucesso.
     *
     * @param e Exposição
     * @return boolean
     */
    public boolean addExposicao(Exposicao e) {
        return listaExposicoes.add(e);
    }

    /**
     * Adiciona uma Exposição à List, apenas se esta ainda não existir na mesma.
     * Devolve um boolean, true se a operação tiver sucesso, false se não tiver
     * sucesso.
     *
     * @param e Exposição
     * @return boolean
     */
    public boolean registaExposicao(Exposicao e) {
        if (valida(e)) {
            addExposicao(e);
            return true;
        } else {
            throw new IllegalArgumentException("Este exposição já existe!");

        }
    }
}
