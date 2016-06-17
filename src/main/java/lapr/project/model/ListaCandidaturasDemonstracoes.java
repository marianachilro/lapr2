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
public class ListaCandidaturasDemonstracoes {
     /**
     * List com Candidaturas.
     */
    @XmlElement(name="candidatura")
    private List<CandidaturaDemonstracao> listaCandidaturas;

    /**
     * Construtor de uma Lista de Candidaturas.
     */
    public ListaCandidaturasDemonstracoes() {
        this.listaCandidaturas = new ArrayList<>();
    }

    /**
     * Devolve o List de Candidaturas.
     *
     * @return List de Candidaturas
     */
    public List<CandidaturaDemonstracao> getListCandidaturas() {
        return listaCandidaturas;
    }

    /**
     * Modifica o List de Candidaturas
     *
     * @param listaCandidaturas List de Candidaturas
     */
    public void setListCandidaturas(List<CandidaturaDemonstracao> listaCandidaturas) {
        this.listaCandidaturas = listaCandidaturas;
    }

    /**
     * Devolve uma nova Candidatura.
     *
     * @return Candidatura
     */
    public CandidaturaDemonstracao novaCandidatura() {
        return new CandidaturaDemonstracao();
    }

    /**
     * Validação que devolve um boolean. True se a Candidatura já existir na
     * List. False se ainda não existir.
     *
     * @param c Candidatura
     * @return boolean
     */
    public boolean validaCandidatura(CandidaturaDemonstracao c) {
        if(!listaCandidaturas.isEmpty()) {
            return listaCandidaturas.contains(c);
        } else {
            return false;
        }
    }

    /**
     * Adiciona uma candidatura ao list e devolve um boolean. True se esta for
     * adicionado com sucesso. False se esta não for adicionada com sucesso.
     *
     * @param c Candidatura
     * @return boolean
     */
    public boolean addCandidatura(CandidaturaDemonstracao c) {
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
    public boolean registaCandidatura(CandidaturaDemonstracao c) {
        if (!validaCandidatura(c)) {
            addCandidatura(c);
            return true;
        } else {
            return false;
        }
    }
    
    public List<CandidaturaDemonstracao> getListaCandidaturasRep(String email) {
        List<CandidaturaDemonstracao> le = new ArrayList<>();
        for (CandidaturaDemonstracao c : listaCandidaturas) {
            if (c.getEmailRep().equals(email)) {
                le.add(c);
            }
        }
        return le;
    }
    /**
     * Método que retorna as candidaturas da demonstração removidas pelo representante.
     * @return 
     */
    public List<Candidatura> getListaCandRemovidas(){
        List<Candidatura> rc = new ArrayList<>();
        for(Candidatura c : listaCandidaturas){
            CandidaturaEstado st = c.getEstado();
            if(st.setRemovida()){
                rc.add(c);
            }
        }
        return rc;
    }
    
    
}
