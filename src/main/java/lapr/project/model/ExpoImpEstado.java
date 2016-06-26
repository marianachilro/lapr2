/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author marianachilro
 */
@XmlRootElement
public class ExpoImpEstado implements ExposicaoEstado{
    private final Exposicao exposicao;
   @XmlElement
    private final String tipo;
    private final static String TIPO_OMISSAO="";
    
public ExpoImpEstado(){
    this.exposicao = new Exposicao();
    this.tipo=TIPO_OMISSAO;
}
    public ExpoImpEstado(Exposicao expo,String tipo) {
        this.exposicao=expo;
        this.tipo=tipo;
    }
    public Exposicao getExposicao(){
        return exposicao;
    }
public String getTipo(){
    return tipo;
}
    @Override
    public boolean setCriada() {
        return false;
    }

    @Override
    public boolean setFaeSemDemo() {
        return false;
    }

    @Override
    public boolean setDemoSemFae() {
        return false;
    }

    @Override
    public boolean setCompleta() {
        return false;
    }

    @Override
    public boolean setExposicaoCandidaturasAbertas() {
        return false;
    }

    @Override
    public boolean setExposicaoCandidaturasFechadas() {
        return false;
    }

    @Override
    public boolean setExposicaoConflitosDetetados() {
        return false;
    }

    @Override
    public boolean setExposicaoConflitosAtualizados() {
        return false;
    }

    @Override
    public boolean setExposicaoCandidaturasAtribuidas() {
        return false;
    }

    @Override
    public boolean setExposicaoCandidaturasAvaliadas() {
        return false;
    }

    @Override
    public boolean setExposicaoCandidaturasDecididas() {
        return false;
    }

    @Override
    public boolean setConfirmacaoRealizacaoDemos() {
        return false;
    }

    @Override
    public boolean setDemonstracaoCandidaturasAbertas() {
        return false;
    }

    @Override
    public boolean setDemonstracaoCandidaturasFechadas() {
        return false;
    }

    @Override
    public boolean setDemonstracaoConflitosDetetados() {
        return false;
    }

    @Override
    public boolean setDemonstracaoConflitosAtualizados() {
        return false;
    }

    @Override
    public boolean setDemonstracaoCandidaturasAtribuidas() {
        return false;
    }

    @Override
    public boolean setDemonstracaoCandidaturasAvaliadas() {
        return false;
    }

    @Override
    public boolean setDemonstracaoCandidaturasDecididas() {
        return false;
    }

    @Override
    public boolean setStandsAtribuidos() {
        return false;
    }

    @Override
    public boolean setStandsConfirmados() {
        return false;
    }
    
}
