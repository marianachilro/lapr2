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
public class RegistoStands {

    /**
     * List de Stands.
     */
    @XmlElement(name="stands")
    private List<Stand> listaStands;

    /**
     * Construtor de um Registo de Stands.
     */
    public RegistoStands() {
        this.listaStands = new ArrayList<>();
    }

    /**
     * Novo Stand
     *
     * @return Stand
     */
    public Stand novoStand() {
        return new Stand();
    }

    /**
     * Devolve a List de Stands.
     *
     * @return List de Stands
     */
    public List<Stand> getListaStands() {
        return listaStands;
    }

    /**
     * Modifica a List de Stands.
     *
     * @param listaStands List de Stands
     */
    public void setListaStands(List<Stand> listaStands) {
        this.listaStands = listaStands;
    }

    /**
     * Devolve uma List de Stands que ainda não foram atribuídos a uma
     * Candidatura.
     *
     * @param lc List de Candidaturas
     * @return List de Stands
     */
    public List<Stand> getListaStandsNaoAtribuidos(List<CandidaturaExposicao> lc) {
        List<Stand> listaStandsNaoAtribuidos = new ArrayList<>();
        boolean b = false;
        for (Stand st : listaStands) {
            for (CandidaturaExposicao c : lc) {
                if (c.getStand().equals(st)) {
                    b = true;
                }
            }
            if (b == false) {
                listaStandsNaoAtribuidos.add(st);
            }
        }
        return listaStandsNaoAtribuidos;
    }

    /**
     * Validação que devolve um boolean. True se o Stand já existir na List.
     * False se ainda não existir.
     *
     * @param s Stand
     * @return boolean
     */
    public boolean validaStand(Stand s) {
        if(!listaStands.isEmpty()) {
            return listaStands.contains(s);
        } else {
            return false;
        }
    }

    /**
     * Adiciona um Stand ao list e devolve um boolean. True se esta for
     * adicionado com sucesso. False se esta não for adicionada com sucesso.
     *
     * @param s Stand
     * @return boolean
     */
    public boolean addStand(Stand s) {
        return listaStands.add(s);
    }

    /**
     * Adiciona um Stand à List, apenas se esta ainda não existir na mesma.
     * Devolve um boolean, true se a operação tiver sucesso, false se não tiver
     * sucesso.
     *
     * @param s Stand
     * @return boolean
     */
    public boolean registaStand(Stand s) {
        if (!validaStand(s)) {
            addStand(s);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Devolve a descrição textual do registo de stands no formato: stand.
     *
     * @return
     */
    @Override
    public String toString() {
        String lista = "";

        for (Stand s : listaStands) {
            lista = s.toString() + "\n";
        }
        return lista;
    }
}
