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
public class ExposicaoCandidaturasExpoDecididasEstado implements EstadoExpo{
    
    private Exposicao exposicao;
    
    public ExposicaoCandidaturasExpoDecididasEstado(Exposicao expo){
        this.exposicao=expo;
    }

    @Override
    public boolean setConfirmacaoRealizacaoDemos() {
        if(valida())
            this.exposicao.setEstado(new ExposicaoCandidaturasDemosAbertasEstado(exposicao));
        return false;
    }
    
    public boolean valida(){
        for(Demonstracao d : exposicao.getListaDemonstracoes().getListaDemonstracao())
            if(d.getRealizacao() == true)
                return true;
        return false;
    }
    
}
