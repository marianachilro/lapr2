/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author catarinarib
 */
public class CandidaturaDemonstracao extends Candidatura {
    

    /**
     * Construtor de uma candidatura com todos os atributos por omissão.
     */
    public CandidaturaDemonstracao() {
        super();
    }

    /**
     * Construtor de uma candidatura com todos os atributos recebidos por
     * parâmetro.
     *
     * 
     * @param nomeRepresentante nome do representante da candidatura
     * @param sTituloExp titulo da exposicao
     * @param sNomeEmpresa nome de expositor
     * @param sMorada morada de expositor
     * @param sTelemovel número de telemóvel de expositor
     * @param sArea área pretendida
     * @param sConvites número de convites pretendidos pelo expositor
     */
    public CandidaturaDemonstracao(String nomeRepresentante, String sTituloExp, String sNomeEmpresa, String sMorada,int sTelemovel, double sArea, int sConvites) {
        super(nomeRepresentante,sTituloExp,sNomeEmpresa, sMorada, sTelemovel, sArea, sConvites);

    }
}
