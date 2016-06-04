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
public class Candidatura {
    
    private String nomeEmpresa;
    private String morada;
    private int telemovel;
    private float area;
    private int numeroConvites;
    private Stand stand;
    private ListaProdutos listaProdutos;
    
    public Candidatura() {
        listaProdutos = new ListaProdutos();
    }
    
    public Candidatura(String nomeEmpresa, String morada, int telemovel, float area, int numeroConvites) {
        this.nomeEmpresa = nomeEmpresa;
        this.morada = morada;
        this.telemovel = telemovel;
        this.area = area;
        this.numeroConvites = numeroConvites;
        listaProdutos = new ListaProdutos();
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public String getMorada() {
        return morada;
    }

    public int getTelemovel() {
        return telemovel;
    }

    public float getArea() {
        return area;
    }

    public int getNumeroConvites() {
        return numeroConvites;
    }

    public Stand getStand() {
        return stand;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setTelemovel(int telemovel) {
        this.telemovel = telemovel;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void setNumeroConvites(int numeroConvites) {
        this.numeroConvites = numeroConvites;
    }

    public void setStand(Stand stand) {
        this.stand = stand;
    }
}
