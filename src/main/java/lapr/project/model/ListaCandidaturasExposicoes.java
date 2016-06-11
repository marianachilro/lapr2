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
public class ListaCandidaturasExposicoes {

    /**
     * List com Candidaturas.
     */
    private List<CandidaturaExposicao> listaCandidaturas;
    private List<CandidaturaExposicao> listaCandidaturasRemovidas;

    /**
     * Construtor de uma Lista de Candidaturas.
     */
    public ListaCandidaturasExposicoes() {
        this.listaCandidaturas = new ArrayList<>();
        this.listaCandidaturasRemovidas = new ArrayList<>();
    }
    /**
     * retorna a lista de candidaturas removidas.
     * @return 
     */
    public List<CandidaturaExposicao> getListaCandidaturasRemovidas(){
        return listaCandidaturasRemovidas;
    }
    /**
     * Adiciona uma candidatura à lista de candidaturas removidas.
     * @param c 
     */
    public void registaCandidaturaRemovida(CandidaturaExposicao c){
       listaCandidaturasRemovidas.add(c);
    }
    /**
     * remove uma candidatura da lista de candidaturas.
     * @param c 
     */
    public void removeCandidatura(CandidaturaExposicao c){
        listaCandidaturas.remove(c);
    }

    /**
     * Devolve o List de Candidaturas.
     *
     * @return List de Candidaturas
     */
    public List<CandidaturaExposicao> getListCandidaturas() {
        return listaCandidaturas;
    }

    /**
     * Modifica o List de Candidaturas
     *
     * @param listaCandidaturas List de Candidaturas
     */
    public void setListCandidaturas(List<CandidaturaExposicao> listaCandidaturas) {
        this.listaCandidaturas = listaCandidaturas;
    }

    /**
     * Devolve uma nova Candidatura.
     *
     * @return Candidatura
     */
    public CandidaturaExposicao novaCandidatura() {
        return new CandidaturaExposicao();
    }

    /**
     * Validação que devolve um boolean. True se a Candidatura já existir na
     * List. False se ainda não existir.
     *
     * @param c Candidatura
     * @return boolean
     */
    public boolean validaCandidatura(CandidaturaExposicao c) {
        return listaCandidaturas.contains(c);
    }

    /**
     * Adiciona uma candidatura ao list e devolve um boolean. True se esta for
     * adicionado com sucesso. False se esta não for adicionada com sucesso.
     *
     * @param c Candidatura
     * @return boolean
     */
    public boolean addCandidatura(CandidaturaExposicao c) {
        return listaCandidaturas.add(c);
    }

    /**
     * Adiciona uma candidatura à List, apenas se esta ainda não existir na
     * mesma. Devolve um boolean, true se a operação tiver sucesso, false se não
     * tiver sucesso.
     *
     * @param c Candidatura
     * @return boolean
     */
    public boolean registaCandidatura(CandidaturaExposicao c) {
        if (validaCandidatura(c)) {
            addCandidatura(c);
            return true;
        } else {
            return false;
        }
    }

    public List<CandidaturaExposicao> getListaCandidaturasRep(String email) {
        List<CandidaturaExposicao> le = new ArrayList<>();
        for (CandidaturaExposicao c : listaCandidaturas) {
            if (c.getEmailRep().equals(email)) {
                le.add(c);
            }
        }
        return le;
    }
    /**
     * Método que retorna a lista de candidaturas do representante qeu já tem stand atribuido.
     * @param email
     * @return 
     */
    public List<CandidaturaExposicao> getListacandidaturaRepresentanteComStand(String email){
        List<CandidaturaExposicao> aux = getListaCandidaturasRep(email);
        List<CandidaturaExposicao> candRep = new ArrayList<>();
        for(CandidaturaExposicao cand : aux){
            if(cand.getStand()!=null){
                candRep.add(cand);
            }
        }
        return candRep;
    }
    public List<CandidaturaExposicao> getListaCandRepEstadoCriadoOuAlterado(String email){
        List<CandidaturaExposicao> aux = getListaCandidaturasRep(email);
        List<CandidaturaExposicao> candRep = new ArrayList<>();
        for(CandidaturaExposicao cand : aux){
            CandidaturaEstado st = cand.getEstado();
            if(st.setAlterada() || st.setCriada()){
                candRep.add(cand);
            }
        }
        return candRep;
    }
    
}
