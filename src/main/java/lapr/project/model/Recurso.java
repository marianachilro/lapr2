/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Representa um Recurso, através do seu nome.
 * @author marianachilro
 */
public class Recurso {
    /**
     * O nome do Recurso.
     */
    private String nome;
    /**
     * O nome por omissão do Recurso.
     */
    private static final String NOME_POR_OMISSAO = "";
    
    /**
     * Contrutor de um Recurso com os parâmetros por omissão.
     */
    public Recurso(){
        this.nome=NOME_POR_OMISSAO;
    }
    
    /**
     * Contrutor de um Recurso com os parâmetros recebidos por omissão.
     * @param nome
     */
    public Recurso(String nome){
        this.nome = nome;
    }
    
    /**
     * Devolve o nome do Recurso.
     * @return
     */
    public String getNome(){
        return this.nome;
    }
    
    /**
     * Modifica o nome do Recurso.
     * @param nome
     */
    public void setNome(String nome){
        this.nome= nome;
    }
    
}
