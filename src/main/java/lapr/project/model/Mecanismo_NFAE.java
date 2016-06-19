/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author miniondevil
 */
public class Mecanismo_NFAE implements MecanismoAtribuicao, Serializable {

    /**
     * Número de FAE pretendidos por candidatura.
     */
    private final int nPretendido;

    /**
     *
     * @param nPrentendido
     */
    public Mecanismo_NFAE(int nPrentendido) {
        this.nPretendido = nPrentendido;

    }

    /**
     * Método que atribui o número de FAE pedido pelo utilizador a cada
     * candidatura.
     *
     * @param listaf
     * @param rconf
     * @param listaAtribuicoes
     * @param st
     * @return
     */
    @Override
    public List<Atribuicao> atribui(List<FAE> listaf, ListaConflitos rconf, PodeAtribuir st,ListaAtribuicoes listaAtribuicoes) {
        List<Atribuicao> listaAtribuicao = new ArrayList<>();
       List<Atribuivel> lAtribuiveis=st.getListaAtribuiveis();
        List<Conflito> lconf = rconf.getLista();
        int contC = 0;
        int contF = 0;
        while (contC < lAtribuiveis.size() && contF < listaf.size()) {
            for (int i = 0; i < nPretendido; i++) {
                Atribuicao a = listaAtribuicoes.newAtribuicao((Candidatura)lAtribuiveis.get(contC), listaf.get(contF));
                int contConflitos = 0;
                for(Conflito conf :  lconf){
                    if(conf.getFAE().equals(a.getFAE()) && conf.getCandidatura().equals(a.getCandidatura())){
                        contConflitos++;
                    }
                }
                if (listaAtribuicoes.validateAtribuicoes(a) && contConflitos==0) {
                    contF++;
                    listaAtribuicao.add(a);
                }

            }
            contC++;
        }

        return listaAtribuicao;
    }

}