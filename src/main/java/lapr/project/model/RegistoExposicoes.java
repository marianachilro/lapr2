/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lapr.project.utils.Data;

/**
 *
 * @author Rita
 */
@XmlRootElement
public class RegistoExposicoes implements Agendavel{

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
    public RegistoExposicoes(List<Exposicao> lista){
        this.listaExposicoes=lista;
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
    @XmlElement(name="exposicao")
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
     * Devolve lista de exposiçoes do organizador
     *
     * @param org organizador
     * @return lista de exposiçoes
     */
    public List<Exposicao> getListaExposicoesOrganizador(Organizador org) {
        List<Exposicao> le = new ArrayList<>();

        for (Exposicao e : listaExposicoes) {
            if (e.VerificarSeEOrganizadorDaExpo(org)) {
                le.add(e);
            }
        }
        return le;
    }

    /**
     * Devolve uma List com os titulos das exposições de um organizador, que é
     * identificado pelo username.
     *
     * @param username
     * @param ru
     * @return
     */
    public List<String> getListaExposicoesOrganizadorToString(String username, RegistoUtilizadores ru) {
        Utilizador u = ru.getUtilizador(username);
        List<String> listaExposicoesOrganizador = new ArrayList<>();
        for (Exposicao e : listaExposicoes) {
            if (e.getListaOrganizadores().hasOrganizador(u)) {
                listaExposicoesOrganizador.add(e.getTitulo());
            }
        }
        return listaExposicoesOrganizador;
    }

    /**
     * Devolve uma lista com as Exposições do Organizador que estão no estado de Candidaturas Avaliadas.
     * @param username
     * @param ru
     * @return 
     */
    public List<Exposicao> getExposicoesOrganizadorEstadoCandidaturasAvaliadas(String username, RegistoUtilizadores ru) {
        Utilizador u = ru.getUtilizador(username);
        List<Exposicao> listaExpos = new ArrayList<>();
        //MUDAR MÉTODO QUE COMPARA OS ESTADOS!!
        this.listaExposicoes.stream().filter((e) -> (e.getListaOrganizadores().hasOrganizador(u))).filter((e) -> (e.getEstado().setExposicaoCandidaturasAvaliadas())).forEach((e) -> {
            listaExpos.add(e);
        });
        return listaExpos;
    }

    /**
     * Validação que devolve um boolean. True se a Exposição já existir na List.
     * False se ainda não existir.
     *
     * @param e Exposição
     * @return boolean
     */
    public boolean valida(Exposicao e) {
        if (listaExposicoes.isEmpty()) {
            return false;
        }
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
        if (!valida(e)) {
            addExposicao(e);
            return true;
        } else {
            throw new IllegalArgumentException("Este exposição já existe!");

        }
    }

    /**
     * Devolve lista de exposições do fae.
     *
     * @param u utilizador
     * @return lista de exposições do fae
     */
    public List<Exposicao> getListaExposicoesDoFAE(Utilizador u) {
        List<Exposicao> l_ExpDoFAE = new ArrayList<>();

        if(!listaExposicoes.isEmpty()){
        for (Exposicao m : listaExposicoes) {
            if (m.getFAE(u) != null) {
                l_ExpDoFAE.add(m);
            }

        }
        }
        return l_ExpDoFAE;
    }

    public Exposicao getExpo(String expo) {
        for (Exposicao e : listaExposicoes) {
            if (e.getTitulo().equalsIgnoreCase(expo)) {
                return e;
            }
        }
        return null;
    }

    public boolean validaLista(List<Exposicao> le) {
        for (Exposicao e : listaExposicoes) {
            for (Exposicao ex : le) {
                if (ex.equals(e)) {
                    return false;
                }
            }
        }
        listaExposicoes.addAll(le);
        return true;
    }

    @Override
    public void schedule(TimerTask task, Data data) {
        Date timeToRun = new Date(data.getAno(), data.getMes(), data.getDia(), data.getHora(), data.getMinuto(), data.getSegundos());
        Timer timer = new Timer();
        timer.schedule(task, timeToRun);
    }
}
