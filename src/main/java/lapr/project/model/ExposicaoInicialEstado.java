package lapr.project.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Representa um dos Estados possíveis da Exposicao (Estado de "Inicial").
 *
 * @author marianachilro
 */
public class ExposicaoInicialEstado extends ExpoImpEstado {

    /**
     * Contrutor do Estado de "Inicial" da Exposição.
     *
     * @param exposicao a exposição que vai transitar de estado
     */
    public ExposicaoInicialEstado(Exposicao exposicao) {
        super(exposicao);
    }

    /**
     * Método que muda o estado da Exposição para o Estado "Criada".
     *
     * @return false, se não puder mudar para este estado e true, se conseguir
     * mudar
     */
    @Override
    public boolean setCriada() {
        if (valida()) {
            super.getExposicao().setEstado(new ExposicaoCriadaEstado(super.getExposicao()));
            return true;
        }
        return false;
    }

    /**
     * Verifica se a Exposição pode mudar para o Estado "Criada".
     *
     * @return false, se não puder mudar para esse estado e true, se for
     * possível mudar
     */
    public boolean valida() {
        return super.getExposicao().valida();
    }

}
