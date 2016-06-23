/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lapr.project.utils.Data;

/**
 *
 * @author Rita
 */
@XmlRootElement
public class Exposicao implements Avaliavel, Decisivel {

    /**
     * Título da Exposição
     */
    private String titulo;
    /**
     * Descrição da Exposição.
     */
    private String descricao;
    /**
     * Data de inicio da Exposição.
     */
    private Data dataInicio;
    /**
     * Data de fim da Exposição.
     */
    private Data dataFim;
    /**
     * Local da Exposição.
     */
    private Local local;

    /**
     * Data de inicio de submissao de candidaturas;
     */
    private Data dataIniSubCan;

    /**
     * Data final de submissao de candidaturas;
     */
    private Data dataFimSubCand;

    /**
     * Data final de atualização de conflitos.
     */
    private Data dataFimAtcConf;

    /**
     * Data final de avaliação de candidaturas.
     */
    private Data dataFimAvCandidatura;

    /**
     * Data de início do período de submissão de candidaturas às Demonstraçoes.
     */
    private Data dataInicioSubCandDemos;
    /**
     * Data de fim do período de submissão de candidaturas às Demonstraçoes.
     */
    private Data dataFimSubCandDemos;
    /**
     * Data fim do período de atualização de confitos nas Demonstrações da
     * Exposição.
     */
    private Data dataFimAtualizacaoConflitosDemos;
    /**
     * Estado da exposição.
     */
    private ExpoImpEstado st;

    /**
     * Lista de Organizadores da Exposição
     */
    private ListaOrganizadores listaOrg;
    /**
     * Lista de Candidaturas da Exposição.
     */

    private ListaCandidaturasExposicoes listaCandidaturas;
    /**
     * Lista de Demonstrações da Exposição.
     */
    private ListaDemonstracoes listaDemonstracoes;
    /**
     * Lista de conflitos da exposição.
     */
    private ListaConflitos listaConflitos;

    /**
     * Lista de FAEs da exposicao.
     */
    private ListaFAEs listaFAEs;

    /**
     * Lista de atribuicoes da exposicao.
     */
    private ListaAtribuicoes listaAtribuicoes;

    /**
     * Valor do Título de Exposição por omissão.
     */
    private static final String TITULO_OMISSAO = "";
    /**
     * Valor da Descrição da Exposição por omissão.
     */
    private static final String DESCRICAO_OMISSAO = "";
    /**
     * Valor da Data de Inicio da Exposição por omissão.
     */
    private static final String DATA_INICIO_OMISSAO = "";
    /**
     * Valor da Data de Fim da Exposição por omissão.
     */
    private static final String DATA_FIM_OMISSAO = "";
    /**
     * Valor do Local da Exposição por omissão.
     */
    private static final Local LOCAL_OMISSAO = null;
    /**
     * Contador de candidaturas aceites
     */
    @XmlElement(name = "candidaturasAceites")
    private static int contCandAceites = 0;

    /**
     * Contador de candidaturas rejeitadas
     */
    @XmlElement(name = "candidaturasRejeitadas")
    private static int contCandRejeitadas = 0;

    /**
     * Construtor de uma Exposição com todos os atributos por omissão.
     */
    public Exposicao() {
        this.titulo = TITULO_OMISSAO;
        this.descricao = DESCRICAO_OMISSAO;
        this.dataInicio = null;
        this.dataFim = null;
        this.dataIniSubCan = null;
        this.dataFimSubCand = null;
        this.dataFimAtcConf = null;
        this.dataFimAvCandidatura = null;
        this.local = LOCAL_OMISSAO;
        listaOrg = new ListaOrganizadores();
        listaCandidaturas = new ListaCandidaturasExposicoes();
        listaDemonstracoes = new ListaDemonstracoes();
        listaFAEs = new ListaFAEs();
        listaAtribuicoes = new ListaAtribuicoes();
        listaConflitos = new ListaConflitos();
        this.st = new ExposicaoInicialEstado(this);
    }

    /**
     * Construtor de uma Exposição com todos os atributos recebidos por
     * parâmetro.
     *
     * @param titulo Título de Exposição
     * @param descricao Descrição da Exposição
     * @param dataInicio Data de Inicio da Exposição
     * @param dataFim Data de Fim da Exposição
     * @param local Local da Exposição.
     * @param dataIniSubCand data de iniicio de submissao de candidaturas
     * @param dataFimSubCand Data fim de submissao de candidaturas
     * @param dataFimAtcConf Data fim de atualização de conflitos
     * @param dataFimAvCandidatura Data fim de avaliar candidaturas
     */
    public Exposicao(String titulo, String descricao, Data dataInicio, Data dataFim, Local local, Data dataIniSubCand, Data dataFimSubCand,
            Data dataFimAtcConf, Data dataFimAvCandidatura) {

        setTitulo(titulo);
        setDescricao(descricao);
        setDataInicio(dataInicio);
        setDataFim(dataFim);
        setLocal(local);
        setDataIniSubCan(dataIniSubCand);
        setDataFimSubCand(dataFimSubCand);
        setDataFimAtcConf(dataFimAtcConf);
        setDataFimAvCandidatura(dataFimAvCandidatura);
        listaOrg = new ListaOrganizadores();
        listaCandidaturas = new ListaCandidaturasExposicoes();
        listaDemonstracoes = new ListaDemonstracoes();
        listaFAEs = new ListaFAEs();
        listaAtribuicoes = new ListaAtribuicoes();
        listaConflitos = new ListaConflitos();
        this.st = new ExposicaoInicialEstado(this);
    }

    /**
     * Devolve o Título de Exposição.
     *
     * @return Título
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Devolve a Descrição da Exposição.
     *
     * @return Descrição
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Devolve a Data de Inicio da Exposição
     *
     * @return Data de Inicio
     */
    public Data getDataInicio() {
        return dataInicio;
    }

    /**
     * Devolve a Data de Fim da Exposição.
     *
     * @return Data de Fim
     */
    public Data getDataFim() {
        return dataFim;
    }

    /**
     * Devolve o Local da Exposição.
     *
     * @return Local
     */
    public Local getLocal() {
        return local;
    }

    /**
     * Devolve a data de início do período de submissão de candidaturas às
     * Demonstrações da Exposição.
     *
     * @return data início submissao candidaturas às demonstrações
     */
    public Data getDataInicioSubmissaoCandidaturasDemos() {
        return this.dataInicioSubCandDemos;
    }

    /**
     * Devolve a data de fim do período de submissão de candidaturas às
     * Demonstrações da Exposição.
     *
     * @return data fim submissao candidaturas às demonstrações
     */
    public Data getDataFimSubmissaoCandidaturasDemos() {
        return this.dataFimSubCandDemos;
    }

    /**
     * Modifica a data de início do período de submissão de candidaturas às
     * Demonstrações da Exposição.
     *
     * @param data a nova data
     */
    @XmlElement(name = "dataInicioSubCandDemos")
    public void setDataInicioSubmissaoCandidaturasDemos(Data data) {
        this.dataInicioSubCandDemos = data;
    }

    /**
     * Modifica a a data de fim do período de submissão de candidaturas às
     * Demonstrações da Exposição.
     *
     * @param data a nova data
     */
    @XmlElement(name = "dataFimSubCandDemos")
    public void setDataFimSubmissaoCandidaturasDemos(Data data) {
        this.dataFimSubCandDemos = data;
    }

    /**
     * Devolve a data de fim do período de avaliação de candidaturas às
     * Demonstrações da Exposição.
     *
     *
     * @return data fim submissao candidaturas às demonstrações
     */
    public Data getDataFimAtualizacaoConflitosDemos() {
        return this.dataFimAtualizacaoConflitosDemos;
    }

    /**
     * Modifica a a data de fim do período de atualização de candidaturas às
     * Demonstrações da Exposição.
     *
     * @param data a nova data
     */
    @XmlElement(name = "dataLimiteAtualizacaoConflitosDemos")
    public void setDataFimAtualizacaoConflitosDemos(Data data) {
        this.dataFimAtualizacaoConflitosDemos = data;
    }

    /**
     * Devolve a Lista de Candidaturas da Exposição.
     *
     * @return Lista de Candidaturas
     */
    public ListaCandidaturasExposicoes getListaCandidaturas() {
        return listaCandidaturas;
    }

    /**
     * Modifica a lista de candidaturas da exposicoa
     *
     * @param lc nova lista de candidaturas
     */
    @XmlElement(name = "registoCandidaturas")
    public void setListaCandidaturas(ListaCandidaturasExposicoes lc) {
        this.listaCandidaturas = lc;
    }

    /**
     * Devolve lista de conflitos
     *
     * @return lista de conflitos
     */
    public ListaConflitos getListaConflitos() {
        return listaConflitos;
    }

    /**
     * Modifica a lista de conflitos
     *
     * @param lc nova lista de conflitos
     */
    @XmlElement(name = "registoConflitos")
    public void setListaConflitos(ListaConflitos lc) {
        this.listaConflitos = lc;
    }

    /**
     * Devolve a Lista de Organizadores da Exposição.
     *
     * @return Lista de Organizadores
     */
    public ListaOrganizadores getListaOrganizadores() {
        return listaOrg;
    }

    /**
     * Modifica lista de organizadores
     *
     * @param lo nova lista de organizadores
     */
    @XmlElement(name = "registoOrganizadores")
    public void setListaOrganizadores(ListaOrganizadores lo) {
        this.listaOrg = lo;
    }

    /**
     * Devolve a Lista de Demonstrações da Exposição.
     *
     * @return Lista de Demonstrações
     */
    public ListaDemonstracoes getListaDemonstracoes() {
        return listaDemonstracoes;
    }

    /**
     * Modifica lista de demonstracoes
     *
     * @param ld nova lista de demonstracoes
     */
    @XmlElement(name = "registoDemonstracoes")
    public void setListaDemonstracoes(ListaDemonstracoes ld) {
        this.listaDemonstracoes = ld;
    }

    /**
     * Modifica o Título da Exposição
     *
     * @param titulo Título
     */
    @XmlElement
    public final void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Título inválido!");
        }
        this.titulo = titulo;
    }

    /**
     * Modifica a Descrição da Exposição.
     *
     * @param descricao Descrição
     */
    @XmlElement
    public final void setDescricao(String descricao) {
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("Descrição inválida!");
        }
        this.descricao = descricao;
    }

    /**
     * Devolve lista de faes da exposicao
     *
     * @return lista de faes
     */
    public ListaFAEs getListaFAES() {
        return listaFAEs;
    }

    /**
     * Modifica lista de faes da exposicao
     *
     * @param lfae nova lista de faes
     */
    @XmlElement(name = "registoFAEs")
    public void setListaFAES(ListaFAEs lfae) {
        this.listaFAEs = lfae;
    }

    /**
     * Modifica a Data de Inicio da Exposição.
     *
     * @param dataInicio Data de Inicio
     */
    @XmlElement
    public final void setDataInicio(Data dataInicio) {
        if (dataInicio == null) {
            throw new IllegalArgumentException("Data inicio inválida!");
        }
        this.dataInicio = dataInicio;
    }

    /**
     * Modifica a Data de Fim da Exposição
     *
     * @param dataFim Data de Fim
     */
    @XmlElement
    public final void setDataFim(Data dataFim) {
        if (dataFim == null) {
            throw new IllegalArgumentException("Data fim inválida!");
        }
        this.dataFim = dataFim;
    }

    /**
     * Modifica o Local da Exposição.
     *
     * @param local Local
     */
    @XmlElement
    public final void setLocal(Local local) {
        if (local == null || local.getNome().isEmpty()) {
            throw new IllegalArgumentException("Local inválido!");
        }
        this.local = local;
    }

    /**
     * Devolve a data fim de submisao de candidaturas
     *
     * @return data fim de submissao de candidaturas
     */
    public Data getDataFimSubCand() {
        return dataFimSubCand;
    }

    /**
     * Modifica a data fim de submisao de candidaturas
     *
     * @param dataFimSubCand data fim de submisao de candidaturas
     */
    @XmlElement(name = "subFim")
    public final void setDataFimSubCand(Data dataFimSubCand) {
        if (dataFimSubCand == null) {
            throw new IllegalArgumentException("Data fim de submissão de candidaturas inválida!");
        }
        this.dataFimSubCand = dataFimSubCand;
    }

    /**
     * Devolve a data fim de atualização de conflitos
     *
     * @return data fim de atualização de conflitos
     */
    public Data getDataFimAtcConf() {
        return dataFimAtcConf;
    }

    /**
     * Modifica a data fim de atualização de conflitos
     *
     * @param dataFimAtcConf data fim de atualização de conflitos
     */
    @XmlElement(name = "dataLimiteConflitos")
    public final void setDataFimAtcConf(Data dataFimAtcConf) {
        if (dataFimAtcConf == null) {
            throw new IllegalArgumentException("Data fim de actualizaçao de conflitos inválida!");
        }
        this.dataFimAtcConf = dataFimAtcConf;
    }

    /**
     * Devolve a data fim de avaliar candidaturas
     *
     * @return data fim de avaliar candidaturas
     */
    public Data getDataFimAvCandidatura() {
        return dataFimAvCandidatura;
    }

    /**
     * Modifica a data fim de avaliar candidaturas
     *
     * @param dataFimAvCandidatura data fim de avaliar candidaturas
     */
    @XmlElement(name = "dataFimAvaliacaoCandidatura")
    public final void setDataFimAvCandidatura(Data dataFimAvCandidatura) {
        if (dataFimAvCandidatura == null) {
            throw new IllegalArgumentException("Data fim de avaliar candidaturas inválida!");
        }
        this.dataFimAvCandidatura = dataFimAvCandidatura;
    }

    /**
     * Adiciona organizador à lista de organizadores da exposição.
     *
     * @param u utilizador/organizador
     * @return boolean
     */
    public boolean addOrganizador(Utilizador u) {
        Organizador org = new Organizador();
        org.setUtilizador(u);
        if (!listaOrg.validaOrganizador(org)) {
            listaOrg.add(org);
            return true;
        }
        return false;
    }

    /**
     * Devolve fae da exposição
     *
     * @param u utilizador
     * @return fae da exposicao
     */
    public FAE getFAE(Utilizador u) {
        if (!listaFAEs.getListaFAEs().isEmpty()) {
            for (FAE fae : listaFAEs.getListaFAEs()) {
                if (fae.getUtilizador().equals(u)) {
                    return fae;
                }
            }
        }
        return null;
    }

    /**
     * Verifica se o organizador é um organizador da exposição
     *
     * @param org organizador
     * @return boolean
     */
    public boolean VerificarSeEOrganizadorDaExpo(Organizador org) {
        for (Organizador o : listaOrg.getListaOrganizadores()) {
            if (o.equals(org)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Devolve a lista de atribuicoes da exposição.
     *
     * @param fae
     * @return lista de atribuicoes
     */
    public List<CandidaturaGeral> getListaAtribuicoesFAE(FAE fae) {
        return listaAtribuicoes.getListaCandidaturasFAE(fae);
    }

    /**
     * Método que retorna o estado atual da exposição.
     *
     * @return
     */
    public ExpoImpEstado getEstado() {
        return st;
    }

    /**
     * Método que modifica o estado atual da exposição.
     *
     * @param novoSt
     */
    @XmlElement(name = "estado")
    public void setEstado(ExpoImpEstado novoSt) {
        st = novoSt;
    }

    /**
     * Modifica a lista de atribuicoes por outra nova lista de atribuicoes
     *
     * @param lA
     */
    public void setAtribuicoes(List<Atribuicao> lA) {
        listaAtribuicoes.getLista().removeAll(listaAtribuicoes.getLista());
        listaAtribuicoes.getLista().addAll(lA);
    }

    /**
     * Devolve a lista de candidaturas de um fae de uma exposição
     *
     * @param fae fae da exposicao
     * @return lista de candidaturas
     */
    @Override
    public List<CandidaturaGeral> getAvaliaveis(FAE fae) {
        return listaAtribuicoes.getListaCandidaturasFAE(fae);
    }

    /**
     * Devolve a lista das candidaturas por decidir
     *
     * @return lista de candidaturas
     */
    @Override
    public List<Candidatura> getDecisiveis() {
        if (st.setDemonstracaoCandidaturasAvaliadas()) {
            List<Candidatura> listaCandExposicao = new ArrayList<>();
            listaCandExposicao.add((Candidatura) listaCandidaturas.getListCandidaturas());
            return listaCandExposicao;
        } else {
            List<Candidatura> listaCandTodasDemonstracoes = new ArrayList<>();
            for (Demonstracao d : listaDemonstracoes.getListaDemonstracao()) {
                listaCandTodasDemonstracoes.add((Candidatura) d.getListaCandidaturas().getListCandidaturas());
            }
            return listaCandTodasDemonstracoes;
        }
    }

    /**
     * Devolve lista de atribuicoes da exposicao
     *
     * @return nova lista de atribuicoes
     */
    public ListaAtribuicoes getListaAtribuicoes() {
        return listaAtribuicoes;
    }

    /**
     * Modifica lista de atribuicoes da exposicao
     *
     * @param la nova lista de atribuicoes
     */
    @XmlElement(name = "registoFAEs")
    public void setListaAtribuicoes(ListaAtribuicoes la) {
        this.listaAtribuicoes = la;
    }

    public boolean valida() {
        return (this.titulo == null || this.descricao == null || this.listaOrg.getListaOrganizadores().isEmpty()
                || this.dataInicio == null || this.dataFim == null || this.dataFimSubCand == null
                || this.dataFimAtcConf == null || this.dataFimAvCandidatura == null
                || this.dataIniSubCan == null);
    }

    /**
     * Devolve as listas das candidaturas que foram aceites pelo organizador
     *
     * @return lista de candidaturas da exposicao aceites
     */
    public List<CandidaturaExposicao> listacandidaturasAceites() {
        List<CandidaturaExposicao> lcAceites = new ArrayList<>();

        List<CandidaturaExposicao> lc = listaCandidaturas.getListCandidaturas();
        boolean decisao = true;
        if (!lc.isEmpty()) {
            for (CandidaturaExposicao c : lc) {
                if (c.getDecisao() == decisao) {
                    lcAceites.add(c);
                }
            }
        }
        contCandAceites = lcAceites.size();
        return lcAceites;
    }

    /**
     * Devolve a lista de candidaturas que não foram aceites pelo organizador
     *
     * @return lista de candidaturas da exposicao nao aceites
     */
    public List<CandidaturaExposicao> listacandidaturasNaoAceites() {
        List<CandidaturaExposicao> lcNaoAceites = new ArrayList<>();

        List<CandidaturaExposicao> lc = listaCandidaturas.getListCandidaturas();
        boolean decisao = false;
        if (!lc.isEmpty()) {
            for (CandidaturaExposicao c : lc) {
                if (c.getDecisao() == decisao) {
                    lcNaoAceites.add(c);
                }
            }
        }
        contCandRejeitadas = lcNaoAceites.size();
        return lcNaoAceites;
    }

    /**
     * Devolve uma lista com todas as keywords usadas em todas as candidaturas
     *
     * @return lista keyword
     */
    public List<Keyword> getlistaTodasKeywords() {
        List<Keyword> lk = new ArrayList();

        if (!listaCandidaturas.getListCandidaturas().isEmpty()) {
            for (CandidaturaExposicao c : listaCandidaturas.getListCandidaturas()) {
                if (!c.getListaKeywords().getListaKeywords().isEmpty()) {
                    for (Keyword k : c.getListaKeywords().getListaKeywords()) {
                        if (lk.contains(k) == false) {
                            lk.add(k);
                        }

                    }
                }
            }
        }
        return lk;
    }

    /**
     * Devolve uma list com a informação das probabilidades das keywords das
     * candidaturas aceites e não aceites
     *
     * @return List com a informação das probabilidades das keywords das
     * candidaturas aceites e não aceites
     */
    public List<String> estatisticaCandidaturas() {

        List<String> estatisticaKeywords = new ArrayList<>();

        List<CandidaturaExposicao> lcAceites = listacandidaturasAceites();
        List<CandidaturaExposicao> lcNaoAceites = listacandidaturasNaoAceites();
        List<Keyword> lk = getlistaTodasKeywords();

        NumberFormat nf = NumberFormat.getInstance();
        nf.setMinimumFractionDigits(2);

        if (!lcAceites.isEmpty()  && !lk.isEmpty()|| !lcNaoAceites.isEmpty() && !lk.isEmpty()) {
            for (Keyword k : lk) {

                estatisticaKeywords.add(k.getPalavra() + "");

                int contNumRepAceites = 0;
                int contNumRepNaoAceites = 0;
                
                if(!lcAceites.isEmpty()){
                for (CandidaturaExposicao c : lcAceites) {
                    if (c.getListaKeywords().getListaKeywords().contains(k)) {
                        contNumRepAceites++;

                    }
                }
                
                double probabilidadeCandAceite = ((double)contNumRepAceites / contCandAceites);
                estatisticaKeywords.add(String.valueOf(nf.format(probabilidadeCandAceite)));
                }else{
                    estatisticaKeywords.add(String.valueOf(nf.format(0)));
                }
                
                if(!lcNaoAceites.isEmpty()){
                for (CandidaturaExposicao c : lcNaoAceites) {
                    if (c.getListaKeywords().getListaKeywords().contains(k)) {
                        contNumRepNaoAceites++;
                    }
                }
                
                double probabilidadeCandNaoAceites = ((double)contNumRepNaoAceites / contCandRejeitadas);
                estatisticaKeywords.add(String.valueOf(nf.format(probabilidadeCandNaoAceites)));
                
                }else{
                    estatisticaKeywords.add(String.valueOf(nf.format(0)));
                }

                

            }
        } else {

            throw new IllegalArgumentException("Não existe informação suficiente para criar o ranking!");

        }
        return estatisticaKeywords;
    }

    /**
     * Devolve a data de inicio de submissao de candidaturas
     *
     * @return data de inicio de submissao de candidaturas
     */
    public Data getDataIniSubCan() {
        return dataIniSubCan;
    }

    /**
     * Modifica a data de inicio de submissao de candidaturas
     *
     * @param dataIniSubCan data de inicio de submissao de candidaturas
     */
    @XmlElement(name = "subInicio")
    public final void setDataIniSubCan(Data dataIniSubCan) {
        if (dataIniSubCan == null) {
            throw new IllegalArgumentException("Data de inicio de submissão de candidaturas inválida!");
        }
        this.dataIniSubCan = dataIniSubCan;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.titulo);
        hash = 53 * hash + Objects.hashCode(this.descricao);
        hash = 53 * hash + Objects.hashCode(this.dataInicio);
        hash = 53 * hash + Objects.hashCode(this.dataFim);
        hash = 53 * hash + Objects.hashCode(this.local);
        hash = 53 * hash + Objects.hashCode(this.dataIniSubCan);
        hash = 53 * hash + Objects.hashCode(this.dataFimSubCand);
        hash = 53 * hash + Objects.hashCode(this.dataFimAtcConf);
        hash = 53 * hash + Objects.hashCode(this.dataFimAvCandidatura);
        hash = 53 * hash + Objects.hashCode(this.dataInicioSubCandDemos);
        hash = 53 * hash + Objects.hashCode(this.dataFimSubCandDemos);
        hash = 53 * hash + Objects.hashCode(this.dataFimAtualizacaoConflitosDemos);
        hash = 53 * hash + Objects.hashCode(this.listaOrg);
        hash = 53 * hash + Objects.hashCode(this.listaCandidaturas);
        hash = 53 * hash + Objects.hashCode(this.listaDemonstracoes);
        hash = 53 * hash + Objects.hashCode(this.listaConflitos);
        hash = 53 * hash + Objects.hashCode(this.listaFAEs);
        hash = 53 * hash + Objects.hashCode(this.listaAtribuicoes);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        final Exposicao other = (Exposicao) obj;

        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.dataInicio, other.dataInicio)) {
            return false;
        }
        if (!Objects.equals(this.dataFim, other.dataFim)) {
            return false;
        }
        if (!Objects.equals(this.local, other.local)) {
            return false;
        }

        return true;
    }

}
