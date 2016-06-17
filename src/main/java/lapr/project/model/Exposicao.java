/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
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
    @XmlElement
    private String titulo;
    /**
     * Descrição da Exposição.
     */
    @XmlElement
    private String descricao;
    /**
     * Data de inicio da Exposição.
     */
    @XmlElement
    private Data dataInicio;
    /**
     * Data de fim da Exposição.
     */
    @XmlElement
    private Data dataFim;
    /**
     * Local da Exposição.
     */
    @XmlElement
    private String local;

    /**
     * Data de inicio de submissao de candidaturas;
     */
    @XmlElement(name = "subInicio")
    private Data dataIniSubCan;

    /**
     * Data final de submissao de candidaturas;
     */
    @XmlElement(name = "subFim")
    private Data dataFimSubCand;

    /**
     * Data final de atualização de conflitos.
     */
    @XmlElement(name = "dataLimiteConflitos")
    private Data dataFimAtcConf;

    /**
     * Data final de avaliação de candidaturas.
     */
    @XmlElement(name = "dataFimAvaliacaoCandidatura")
    private Data dataFimAvCandidatura;

    /**
     * Data de início do período de submissão de candidaturas às Demonstraçoes.
     */
    @XmlElement(name = "dataInicioSubCandDemos")
    private Data dataInicioSubCandDemos;
    /**
     * Data de fim do período de submissão de candidaturas às Demonstraçoes.
     */
    @XmlElement(name = "dataFimSubCandDemos")
    private Data dataFimSubCandDemos;
    /**
     * Data fim do período de atualização de confitos nas Demonstrações da
     * Exposição.
     */
    @XmlElement(name = "dataLimiteAtualizacaoConflitosDemos")
    private Data dataFimAtualizacaoConflitosDemos;
    /**
     * Estado da exposição.
     */
    @XmlElement(name = "estado")
    private ExposicaoEstado st;

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
     * Lista de Organizadores da Exposição
     */
    @XmlElement(name = "registoOrganizadores")
    private ListaOrganizadores listaOrg;
    /**
     * Lista de Candidaturas da Exposição.
     */
    @XmlElement(name = "registoCandidaturas")
    private ListaCandidaturasExposicoes listaCandidaturas;
    /**
     * Lista de Demonstrações da Exposição.
     */
    @XmlElement(name = "registoDemonstracoes")
    private ListaDemonstracoes listaDemonstracoes;
    /**
     * Lista de conflitos da exposição.
     */
    @XmlElement(name = "registoConflitos")
    private ListaConflitos listaConflitos;

    /**
     * Lista de FAEs da exposicao.
     */
    @XmlElement(name = "registoFAEs")
    private ListaFAEs listaFAEs;

    /**
     * Lista de atribuicoes da exposicao.
     */
    @XmlElement(name = "registoAtribuicoes")
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
    private static final String LOCAL_OMISSAO = "";

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
    public Exposicao(String titulo, String descricao, Data dataInicio, Data dataFim, String local, Data dataIniSubCand, Data dataFimSubCand,
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
    public String getLocal() {
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
    public void setDataInicioSubmissaoCandidaturasDemos(Data data) {
        this.dataInicioSubCandDemos = data;
    }

    /**
     * Modifica a a data de fim do período de submissão de candidaturas às
     * Demonstrações da Exposição.
     *
     * @param data a nova data
     */
    public void setDataFimSubmissaoCandidaturasDemos(Data data) {
        this.dataFimSubCandDemos = data;
    }

    /**
     * Devolve a data de fim do período de avaliação de candidaturas às
     * Demonstrações da Exposição.
     *
     * @param data
     * @return data fim submissao candidaturas às demonstrações
     */
    public Data getDataFimAtualizacaoConflitosDemos(Data data) {
        return this.dataFimAtualizacaoConflitosDemos;
    }

    /**
     * Modifica a a data de fim do período de atualização de candidaturas às
     * Demonstrações da Exposição.
     *
     * @param data a nova data
     */
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
    public void setListaDemonstracoes(ListaDemonstracoes ld) {
        this.listaDemonstracoes = ld;
    }

    /**
     * Modifica o Título da Exposição
     *
     * @param titulo Título
     */
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
    public void setListaFAES(ListaFAEs lfae) {
        this.listaFAEs = lfae;
    }

    /**
     * Modifica a Data de Inicio da Exposição.
     *
     * @param dataInicio Data de Inicio
     */
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
    public final void setLocal(String local) {
        if (local == null || local.trim().isEmpty()) {
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
     */
    public void addOrganizador(Utilizador u) {
        Organizador org = new Organizador();
        org.setUtilizador(u);
        if (listaOrg.validaOrganizador(org)) {
            addOrganizador(org);
        }
    }

    /**
     * Adiciona organizador à lista de organizadores da exposição.
     *
     * @param o organizador
     * @return lista de organizadores
     */
    private boolean addOrganizador(Organizador o) {
        return this.listaOrg.add(o);
    }

    /**
     * Devolve fae da exposição
     *
     * @param u utilizador
     * @return fae da exposicao
     */
    public FAE getFAE(Utilizador u) {
        for (FAE fae : listaFAEs.getListaFAEs()) {
            if (fae.getUtilizador().equals(u)) {
                return fae;
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
    public List<Candidatura> getListaAtribuicoesFAE(FAE fae) {
        return listaAtribuicoes.getListaCandidaturasFAE(fae);
    }

    /**
     * Método que retorna o estado atual da exposição.
     *
     * @return
     */
    public ExposicaoEstado getEstado() {
        return st;
    }

    /**
     * Método que modifica o estado atual da exposição.
     *
     * @param novoSt
     */
    public void setEstado(ExposicaoEstado novoSt) {
        st = novoSt;
    }

    /**
     * Modifica o estado da exposição
     *
     * @return boolean
     */
    public boolean setExposicaoConflitosAtualizados() {
        return st.setExposicaoConflitosAtualizados();
    }

    /**
     * Modifica o estado da exposição
     *
     * @return boolean
     */
    public boolean setExposicaoCandidaturasAtribuidas() {
        return st.setExposicaoCandidaturasAtribuidas();
    }

    /**
     * Modifica o estado da exposição
     *
     * @return boolean
     */
    public boolean setExposicaoCandidaturasAvaliadas() {
        return st.setExposicaoCandidaturasAvaliadas();

    }

    /**
     * Modifica o estado da exposição
     *
     * @return boolean
     */
    public boolean setExposicaoCandidaturasDecididas() {
        return st.setExposicaoCandidaturasDecididas();
    }

    public void setAtribuicoes(List<Atribuicao> lA) {
        listaAtribuicoes.getLista().addAll(lA);
    }

    /**
     * Devolve a lista de candidaturas de um fae de uma exposição
     *
     * @param fae fae da exposicao
     * @return lista de candidaturas
     */
    @Override
    public List<Candidatura> getAvaliaveis(FAE fae) {
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

        for (Keyword k : lk) {
            estatisticaKeywords.add(k + "");
            int contNumRepAceites = 0;
            int contNumRepNaoAceites = 0;
            for (CandidaturaExposicao c : lcAceites) {
                if (c.getListaKeywords().getListaKeywords().contains(k)) {
                    contNumRepAceites++;

                }
            }
            double probabilidadeCandAceite = contNumRepAceites / contCandAceites;

            estatisticaKeywords.add(String.valueOf(nf.format(probabilidadeCandAceite)));

            for (CandidaturaExposicao c : lcNaoAceites) {
                if (c.getListaKeywords().getListaKeywords().contains(k)) {
                    contNumRepNaoAceites++;
                }
            }

            double probabilidadeCandNaoAceites = contNumRepNaoAceites / contCandRejeitadas;
            estatisticaKeywords.add(String.valueOf(nf.format(probabilidadeCandNaoAceites)));

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
    public final void setDataIniSubCan(Data dataIniSubCan) {
        if (dataIniSubCan == null) {
            throw new IllegalArgumentException("Data de inicio de submissão de candidaturas inválida!");
        }
        this.dataIniSubCan = dataIniSubCan;
    }

}
