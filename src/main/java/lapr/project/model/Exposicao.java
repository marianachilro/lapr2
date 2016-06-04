/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author Rita
 */
public class Exposicao {

    private String titulo;
    private String descricao;
    private String dataInicio;
    private String dataFim;
    private String local;
    private final ListaOrganizadores listaOrg;
    private final ListaCandidaturas listaCandidaturas;

    public Exposicao() {
        listaOrg = new ListaOrganizadores();
        listaCandidaturas = new ListaCandidaturas();
    }

    public Exposicao(String titulo, String descricao, String dataInicio, String dataFim, String local) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.local = local;
        listaOrg = new ListaOrganizadores();
        listaCandidaturas = new ListaCandidaturas();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public String getLocal() {
        return local;
    }

    public ListaCandidaturas getListaCandidaturas() {
        return listaCandidaturas;
    }
    
    public ListaOrganizadores getListaOrganizadores() {
        return listaOrg;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    
}
