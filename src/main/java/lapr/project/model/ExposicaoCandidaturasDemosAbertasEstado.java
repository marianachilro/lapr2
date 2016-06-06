/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author marianachilro
 */
public class ExposicaoCandidaturasDemosAbertasEstado implements EstadoExpo{
    
    private Exposicao exposicao;
    
    public ExposicaoCandidaturasDemosAbertasEstado(Exposicao expo){
        this.exposicao=expo;
    }

    @Override
    public boolean setConfirmacaoRealizacaoDemos() {
        return false;
    }
}
