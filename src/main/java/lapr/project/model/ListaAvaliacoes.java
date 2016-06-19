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
 * @author catarinarib
 */
@XmlRootElement
public class ListaAvaliacoes {

    /**
     * lista com as Avaliações.
     */
    @XmlElement(name = "avaliacao")
    private final List<Avaliacao> la;

    /**
     * construtor sem parâmetros.
     */
    public ListaAvaliacoes() {
        la = new ArrayList<>();
    }

    /**
     * Método que retorna a lista de Avaliações.
     *
     * @return lista de avaliações
     */
    public List<Avaliacao> getListaAvaliacao() {
        return la;
    }

    /**
     * Validar avaliação,verificando se a avaliacao recebida por parametro ja
     * existe.
     *
     * @param novaAvaliacao avaliacao.
     * @return boolean
     */
    public boolean validaAvaliacao(Avaliacao novaAvaliacao) {
        if (!la.isEmpty()) {
            for (Avaliacao a : la) {
                if (a.equals(novaAvaliacao)) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    /**
     * Adicionar avaliacao à lista de avaliacoes.
     *
     * @param novaAvaliacao avaliacao
     */
    public boolean addAvaliacao(Avaliacao novaAvaliacao) {
        return la.add(novaAvaliacao);
    }

    /**
     * Devolve uma nova Avaliacao.
     *
     * @return avaliacao
     */
    public Avaliacao novaAvaliacao() {
        return new Avaliacao();
    }

    public Avaliacao novaAvaliacaoDemo() {
        return new Avaliacao("Demo");
    }
}
