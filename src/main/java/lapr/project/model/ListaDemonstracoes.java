/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lapr.project.utils.Data;

/**
 *
 * @author Rita
 */
@XmlRootElement
public class ListaDemonstracoes {

    /**
     * List com Demonstrações.
     */
    private List<Demonstracao> listaDemonstracao;

    /**
     * Construtor de uma Lista de Demonstrações.
     */
    public ListaDemonstracoes() {
        listaDemonstracao = new ArrayList<>();
    }
    
    public ListaDemonstracoes(ListaDemonstracoes listaDemonstracao) {
        this.listaDemonstracao = listaDemonstracao.getListaDemonstracao();
    }

    /**
     * Devolve o List das Demonstrações.
     *
     * @return List de Demonstrações.
     */
    public List<Demonstracao> getListaDemonstracao() {
        return listaDemonstracao;
    }

    /**
     * Modifica o List de Demonstrações.
     *
     * @param listaDemonstracao List de Demonstrações
     */
    @XmlElement(name = "Demonstracao")
    public void setListaDemonstracao(List<Demonstracao> listaDemonstracao) {
        this.listaDemonstracao = listaDemonstracao;
    }

    /**
     * Devolve uma nova de Demonstração.
     *
     * @return Demonstração
     */
    public Demonstracao novaDemonstracao() {
        return new Demonstracao();
    }

    /**
     * Validação que devolve um boolean. True se a Demonstração já existir na
     * List. False se ainda não existir.
     *
     * @param d Demonstração
     * @return boolean
     */
    public boolean validaDemonstracao(Demonstracao d) {
        if (!listaDemonstracao.isEmpty()) {
            return listaDemonstracao.contains(d);
        } else {
            return false;
        }
    }

    /**
     * Adiciona uma Demonstração ao list e devolve um boolean. True se esta for
     * adicionado com sucesso. False se esta não for adicionada com sucesso.
     *
     * @param d Demonstração
     * @return boolean
     */
    public boolean addDemonstracao(Demonstracao d) {
        return listaDemonstracao.add(d);
    }

    /**
     * Adiciona uma Demonstração à List, apenas se esta ainda não existir na
     * mesma. Devolve um boolean, true se a operação tiver sucesso, false se não
     * tiver sucesso.
     *
     * @param d Demonstração
     * @return boolean
     */
    public boolean registaDemonstracao(Demonstracao d) {
        if (!validaDemonstracao(d)) {
            addDemonstracao(d);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Devolve uma lista com a Demonstrações que se vão realizar (cuja
     * realização já foi confirmada).
     *
     * @return lista de demonstracoes confirmadas
     */
    public List<Demonstracao> getListaDemonstracoesDisponiveis() {
        List<Demonstracao> ld = new ArrayList<>();

        if (!listaDemonstracao.isEmpty()) {
            for (Demonstracao d : listaDemonstracao) {
                if (d.getRealizacao() == true) {
                    ld.add(d);
                }
            }
        }
        return ld;
    }

    /**
     * Devolve uma lista com as Demonstrações cuja realização ainda não foi
     * confirmada.
     *
     * @return lista de demonstracoes não confirmadas
     */
    public List<Demonstracao> getListaDemonstracoesNaoConfirmadas() {
        List<Demonstracao> ld = new ArrayList<>();
        for (Demonstracao d : listaDemonstracao) {
            if (d.getEstado().setCriada()) {
                ld.add(d);
            }
        }
        return ld;
    }

    /**
     * Modifica as data de início do período de submissão de candidaturas de
     * todas as Demonstrações da lista.
     *
     * @param data a data inicio período de submissão
     */
    public void setDataInicioSubmissaoCanididaturasDemos(Data data) {
        if (data != null) {
            for (Demonstracao d : this.listaDemonstracao) {
                d.setDataInicioSubmissaoCandidaturas(data);
            }
        }
    }

    /**
     * Modifica as data de fim do período de submissão de candidaturas de todas
     * as Demonstrações da lista.
     *
     * @param data a data fim período de submissão
     */
    public void setDataFimSubmissaoCanididaturasDemos(Data data) {
        if (data != null) {
            for (Demonstracao d : this.listaDemonstracao) {
                d.setDataFimSubmissaoCandidaturas(data);
            }
        }
    }

    /**
     * Modifica as data de fim do período de atualização de conflitos de todas
     * as Demonstrações da lista.
     *
     * @param data a data final do período de atualização de conflitos
     */
    public void setDataFimAtualizacaoConflitosDemos(Data data) {
        if (data != null) {
            for (Demonstracao d : this.listaDemonstracao) {
                d.setDataInicioSubmissaoCandidaturas(data);
            }
        }
    }

    public boolean validaCodigo(String codigo) {
        boolean b = false;
        for (Demonstracao d : listaDemonstracao) {
            if (d.getCodigo().equals(codigo)) {
                b = true;
            }
        }
        return b;
    }

    public void ordenarPorNumeroInteressados() {
        Collections.sort(listaDemonstracao);
    }

    @Override
    public String toString() {
        String lista = "";

        if (!listaDemonstracao.isEmpty()) {
            for (Demonstracao d : listaDemonstracao) {
                lista = d + "\n";
            }
        }
        return lista;
    }
}
