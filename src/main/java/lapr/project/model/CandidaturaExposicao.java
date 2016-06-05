/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author Rita
 */
public class CandidaturaExposicao extends Candidatura {

    /**
     * Stand atribuído à Candidatura
     */
    private Stand stand;
    /**
     * Lista de Produtos da Candidatura.
     */
    private final ListaProdutos listaProdutos;

    /**
     * Construtor de uma candidatura com todos os atributos por omissão.
     */
    public CandidaturaExposicao() {
        super();
        listaProdutos = new ListaProdutos();
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
    public CandidaturaExposicao(String nomeRepresentante, String sTituloExp, String sNomeEmpresa, String sMorada, int sTelemovel, double sArea, int sConvites) {
        super(nomeRepresentante, sTituloExp, sNomeEmpresa, sMorada, sTelemovel, sArea, sConvites);

        listaProdutos = new ListaProdutos();
    }

    /**
     * Devolve o stand atribuído à candidatura.
     *
     * @return stand de candidatura
     */
    public Stand getStand() {
        return stand;
    }

    /**
     * Devolve a lista de produtos da candidatura.
     *
     * @return lista de proutos de candidatura
     */
    public ListaProdutos getListaProdutos() {
        return listaProdutos;
    }

    /**
     * Modifica o stand atribuído à candidatura.
     *
     * @param stand stand de candidatura
     */
    public void setStand(Stand stand) {
        this.stand = stand;
    }

}
