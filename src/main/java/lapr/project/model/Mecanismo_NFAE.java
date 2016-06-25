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
 * @author miniondevil
 */
@XmlRootElement
public class Mecanismo_NFAE implements MecanismoAtribuicao {

    /**
     * Número de FAE pretendidos por candidatura.
     */
    @XmlElement
    private int nPretendido;
    private static final int N_PRETENDIDO_OMISSAO = 2;

    /**
     *
     * @param nPrentendido
     */
    public Mecanismo_NFAE(int nPrentendido) {
        this.nPretendido = nPrentendido;

    }

    public Mecanismo_NFAE() {
        nPretendido = N_PRETENDIDO_OMISSAO;
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
    public List<Atribuicao> atribui(List<FAE> listaf, ListaConflitos rconf, PodeAtribuir st, ListaAtribuicoes listaAtribuicoes) {
        
        List<Atribuicao> listaAtribuicao = new ArrayList<>();
        List<Atribuivel> lAtribuiveis = st.getListaAtribuiveis();
        List<Conflito> lconf = rconf.getLista();
        int contC = 0;
        int contF = 0;
        nPretendido = listaf.size()/lAtribuiveis.size();
        
        while (contC < lAtribuiveis.size() && contF < listaf.size()) {
            for (int i = 0; i < nPretendido; i++) {
                Atribuicao a = listaAtribuicoes.newAtribuicao((CandidaturaGeral) lAtribuiveis.get(contC), listaf.get(contF));
                boolean conflitos = false;
                for (Conflito conf : lconf) {
                    if (conf.getFAE().equals(a.getFAE()) && conf.getCandidaturas().equals(a.getCandidatura())) {
                        conflitos = true;
                    }
                }
                if (!listaAtribuicoes.validateAtribuicoes(a) && !conflitos) {
                    contF++;
                    listaAtribuicao.add(a);
                }

            }
            ((Candidatura) lAtribuiveis.get(contC)).getEstado().setAvaliada();
            contC++;
        }

        return listaAtribuicao;
    }

}
