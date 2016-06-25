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
public class ListaFAEs {

    /**
     * Lista de FAEs da exposição
     */
    private List<FAE> listaFAEs;

    /**
     * Contrutor de uma lista de FAEs
     */
    public ListaFAEs() {
        this.listaFAEs = new ArrayList<>();
    }

    /**
     * Devolve a lista de FAEs.
     *
     * @return lista de FAEs
     */
    public List<FAE> getListaFAEs() {
        return listaFAEs;
    }
    /**
     * Devolve o FAE associoado a um utilizador, se existir.
     * @param u o utilizador associado ao FAE
     * @return o FAE
     */
    public FAE getFAE(Utilizador u){
        FAE fa = null;
        for(FAE f: this.listaFAEs){
            if(f.getID().equalsIgnoreCase(u.getUsername()))
                fa = f;
        }
        return fa;
    }

    /**
     * Modifica a lista de FAEs
     *
     * @param listaFAEs lista de FAEs
     */
    @XmlElement(name="fae")
    public void setListaFAEs(List<FAE> listaFAEs) {
        this.listaFAEs = listaFAEs;
    }

    /**
     * Devolve um novo FAE
     *
     * @return FAE
     */
    public FAE novoFae() {
        return new FAE();
    }

    /**
     * Adiciona um Fae à List, apenas se esta ainda não existir na mesma.
     * Devolve um boolean, true se a operação tiver sucesso, false se não tiver
     * sucesso.
     *
     * @param fae FAE
     * @return boolean
     */
    public boolean registaFae(FAE fae) {
        if (!validaFae(fae)) {
            addFae(fae);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Validação que devolve um boolean. True se o FAE já existir na List. False
     * se ainda não existir.
     *
     * @param fae FAE
     * @return boolean
     */
    public boolean validaFae(FAE fae) {
        if (!listaFAEs.isEmpty()) {
            return listaFAEs.contains(fae);
        } else {
            return false;
        }
    }

    /**
     * Adiciona um Fae ao list e devolve um boolean. True se esta for adicionado
     * com sucesso. False se esta não for adicionada com sucesso.
     *
     * @param fae FAE
     * @return boolean
     */
    public boolean addFae(FAE fae) {
        return listaFAEs.add(fae);
    }
    
    @Override
    public String toString() {
        String str = "";
        for(FAE f : listaFAEs) {
            str = str + f.toString();
        }
        return str;
    }

}
