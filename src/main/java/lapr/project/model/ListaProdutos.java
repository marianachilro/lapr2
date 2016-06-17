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
public class ListaProdutos {

    /**
     * List de Produtos.
     */
    @XmlElement(name="produtos")
    private List<Produto> listaProdutos;

    /**
     * Construtor de uma Lista de Produtos.
     */
    public ListaProdutos() {
        this.listaProdutos = new ArrayList<>();
    }
    public ListaProdutos(ListaProdutos lista){
        this.listaProdutos = new ArrayList<>(lista.getListaProdutos());
    }

    /**
     * Devolve a List de Produtos.
     *
     * @return List de Produtos
     */
    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    /**
     * Modifica a List de Produtos.
     *
     * @param listaProdutos List de Produtos
     */
    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    /**
     * Devolve um novo Produto.
     *
     * @return Produto
     */
    public Produto novoProduto() {
        return new Produto();
    }

    /**
     * Validação que devolve um boolean. True se o Produto já existir na List.
     * False se ainda não existir.
     *
     * @param p Produto
     * @return boolean
     */
    public boolean validaProduto(Produto p) {
        if(!listaProdutos.isEmpty()) {
            return listaProdutos.contains(p);
        } else {
            return false;
        }
    }

    /**
     * Adiciona um Produto ao list e devolve um boolean. True se esta for
     * adicionado com sucesso. False se esta não for adicionada com sucesso.
     *
     * @param p Produto
     * @return boolean
     */
    public boolean addProduto(Produto p) {
        return listaProdutos.add(p);
    }

    /**
     * Adiciona um Organizador à List, apenas se esta ainda não existir na
     * mesma. Devolve um boolean, true se a operação tiver sucesso, false se não
     * tiver sucesso.
     *
     * @param p Produto
     * @return boolean
     */
    public boolean registaProduto(Produto p) {
        if (!validaProduto(p)) {
            addProduto(p);
            return true;
        } else {
            return false;
        }
    }

}
