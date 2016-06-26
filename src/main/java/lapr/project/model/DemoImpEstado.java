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
 * @author miniondevil
 */
@XmlRootElement
public class DemoImpEstado implements DemonstracaoEstado {
/**
 * demonstracao à qual pertence o estado.
 */
    private final Demonstracao demo;
/**
 * string com o nome da classe do estado.
 */
@XmlElement
    private final String tipo;
private final static String TIPO_OMISSAO = "";
/**
 * construtor sem parametros
 */
public DemoImpEstado(){
    this.demo=new Demonstracao();
    this.tipo=TIPO_OMISSAO;
}
/**
 * construtor com parametros.
 * @param demo
 * @param tipo 
 */
public DemoImpEstado(Demonstracao demo,String tipo){
    this.demo=demo;
    this.tipo=tipo;
}
/**
 * Método que retorna a demonstracao.
 * @return 
 */
public Demonstracao getDemo(){
    return demo;
}
/**
 * método que retorna o tipo.
 * @return 
 */
public String getTipo(){
    return tipo;
}
    @Override
    public boolean setCriada() {
        return false;
    }

    @Override
    public boolean setConfirmada() {
        return false;
    }

    @Override
    public boolean setNaoConfirmada() {
        return false;
    }

    @Override
    public boolean setCandidaturasAbertas() {
        return false;
    }

    @Override
    public boolean setCandidaturasFechadas() {
        return false;
    }

    @Override
    public boolean setConflitosDetetados() {
        return false;
    }

    @Override
    public boolean setConflitosAtualizados() {
        return false;
    }

    @Override
    public boolean setCandidaturasAtribuidas() {
        return false;
    }

    @Override
    public boolean setCandidaturasAvaliadas() {
        return false;
    }

    @Override
    public boolean setCandidaturasDecididas() {
        return false;
    }

}
