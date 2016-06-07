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
        return listaDemonstracao.contains(d);
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
        if (validaDemonstracao(d)) {
            addDemonstracao(d);
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Devolve as demonstracoes
     * @return demonstracoes
     */
    public List<Demonstracao> getDemonstracao(){
        List<Demonstracao> ld = new ArrayList<>();
        if(!listaDemonstracao.isEmpty()){
        for(Demonstracao d: listaDemonstracao){
            ld.add(d);
        }
    }
        return ld;
    }
    
    public List<Demonstracao> getListaDemonstracoesDisponiveis() {
        List<Demonstracao> ld = new ArrayList<>();
        
        for (Demonstracao d : listaDemonstracao) {
            if(d.getRealizacao()==true) {
                ld.add(d);
            }
        }
        return ld;
    }
    
}
