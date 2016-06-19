/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa um dos Estados possíveis da Exposicao (Estado de "Conflitos
 * Atualizados Expo").
 *
 * @author marianachilro
 */
public class ExposicaoConflitosAtualizadosExpoEstado extends ExpoImpEstado implements PodeAtribuir {

    /**
     * Contrutor do Estado de "Conflitos Atualizados Expo" da Exposição.
     *
     * @param exposicao a exposição que vai transitar de estado
     */
    public ExposicaoConflitosAtualizadosExpoEstado(Exposicao exposicao) {
        super(exposicao);
    }

    /**
     * Método que indica que a Demonstração está no Estado "Conflitos Detetados
     * Expo".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setExposicaoConflitosAtualizados() {
        return true;
    }

    /**
     * Método que muda o estado da Exposição para o Estado "Candidaturas
     * Atribuidas Expo".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setExposicaoCandidaturasAtribuidas() {
        if (valida()) {
            super.getExposicao().setEstado(new ExposicaoCandidaturasExpoAtribuidasEstado(super.getExposicao()));
            return true;
        }
        return false;
    }

    /**
     * Verifica se a Exposição pode mudar para o Estado "Candidaturas Atribuidas
     * Expo".
     *
     * @return false, se não puder mudar para esse estado e true, se for
     * possível mudar
     */
    public boolean valida() {
        return super.getExposicao().getEstado().setExposicaoConflitosAtualizados();
    }

    public List<Atribuivel> getListaAtribuiveis() {
        List<Atribuivel> lAtribuiveis = new ArrayList<>();
        List<CandidaturaExposicao> lc = super.getExposicao().getListaCandidaturas().getListCandidaturas();
        for (CandidaturaExposicao c : lc) {
            if (c.getEstado().setConflitosAlterados()) {
                lAtribuiveis.add(c);
            }
        }
        return lAtribuiveis;
    }
}
