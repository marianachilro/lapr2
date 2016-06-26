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
 * Atualizados Demos").
 *
 * @author marianachilro
 */
public class ExposicaoConflitosAtualizadosDemosEstado extends ExpoImpEstado implements PodeAtribuir{

    /**
     * Contrutor do Estado de "Conflitos Atualizados Demos" da Exposição.
     *
     * @param exposicao a exposição que vai transitar de estado
     */
    public ExposicaoConflitosAtualizadosDemosEstado(Exposicao exposicao) {
        super(exposicao,"exposicaoConflitosAtualizadosDemos");
    }

    /**
     * Método que indica que a Exposição está no Estado "Conflitos Atualizados
     * Demos".
     *
     * @return true, porque está neste estado
     */
    @Override
    public boolean setDemonstracaoConflitosAtualizados() {
        return true;
    }

    /**
     * Método que muda o estado da Exposição para o Estado "Conflitos
     * Atualizados Demos".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setDemonstracaoCandidaturasAtribuidas() {
        if (valida()) {
            super.getExposicao().setEstado(new ExposicaoCandidaturasDemosAtribuidasEstado(super.getExposicao()));
            return true;
        }
        return false;
    }

    /**
     * Verifica se a Exposição pode mudar para o Estado "Candidaturas Atribuídas
     * Demos".
     *
     * @return false, se não puder mudar para esse estado e true, se for
     * possível mudar
     */
    public boolean valida() {
        return super.getExposicao().getEstado().setDemonstracaoConflitosAtualizados();
    }

    public List<Atribuivel> getListaAtribuiveis() {
        List<Atribuivel> lAtribuiveis = new ArrayList<>();
        List<Demonstracao> ld = super.getExposicao().getListaDemonstracoes().getListaDemonstracao();
        for (Demonstracao d : ld) {
            for (CandidaturaDemonstracao c : d.getListaCandidaturas().getListCandidaturas()) {
              if (!c.getEstado().setConflitosDetetados()) {
                if(c.getEstado().setConflitosAlterados()){
                lAtribuiveis.add(c);
            }
            }
            }
        }
        return lAtribuiveis;
    }
}
