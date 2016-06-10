/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import lapr.project.utils.Data;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author miniondevil
 */
public class LerFicheiroXML {

    private static final String ROOT_ELEMENT_NAME_EXPOSICAO = "Exposição";
    private static final String TITULO_ELEMENT_NAME = "titulo";
    private static final String DESCRICAO_EXPO_ELEMENT_NAME = "descrição";
    private static final String DATA_INICIO_ELEMENT_NAME = "data inicio";
    private static final String DATA_FIM_ELEMENT_NAME = "data fim";
    private static final String LOCAL_ELEMENT_NAME = "local";
    private static final String DATA_FIM_SUB_CAND = "data fim de candidatura";
    private static final String DATA_FIM_ALTERACAO_CONFLITO = "data fim de alteração de conflitos";
    private static final String DATA_FIM_AV_CANDIDATURA = "data fim de avaliação de candidatura";
    private static final String DATA_FIM_DECISAO_CANDIDATURA = "data fim de decisao de candidatura";

    private static final String ELEMENT_NAME_CANDIDATURA = "candidatura";
    private static final String EMAIL_ELEMENT_NAME = "email";
    private static final String EMPRESA_ELEMENT_NAME = "empresa";
    private static final String AREA_ELEMENT_NAME = "area";
    private static final String CONVITES_ELEMENT_NAME = "numero de convites";
    private static final String DECISAO_FINAL_ELEMENT_NAME = "decisao";
    private static final String MORADA_FINAL_ELEMENT_NAME = "morada";
    private static final String TELEMOVEL_FINAL_ELEMENT_NAME = "telemóvel";
    private static final String KEYWORDS_ELEMENT_NAME = "keywords";
    private static final String PRODUTO_ELEMENT_NAME = "produtos";
    private static final String PALAVRA_ELEMENT_NAME = "palavra";
    private static final String NOME_ELEMENT_NAME = "nome";
    private static final String AVALIACAO_ELEMENT_NAME = "avaliação";
    private static final String DECISAO_ELEMENT_NAME = "decisão";
    private static final String JUSTIFICACAO_ELEMENT_NAME = "justificação";
    private static final String TEMA_EXPO_ELEMENT_NAME = "tema expo";
    private static final String ADEQUACAO_CAND_ELEMENT_NAME = "adequação cand";
    private static final String ADEQUACAO_N_CONVITES_ELEMENT_NAME = "adequação num convites";
    private static final String RECOMENDACAO_GLOBAL_ELEMENT_NAME = "recomendação global";

    private static final String DEMONSTRACAO_ELEMENT_NAME = "demonstração";
    private static final String CODIGO_ELEMENT_NAME = "código";
    private static final String DESCRICAO_ELEMENT_NAME = "descrição";
    private static final String REALIZACAO_ELEMENT_NAME = "realização";
    private static final String DATA_INICIO_SUB_CAND_DEMO = "data de inicio";
    private static final String DATA_FIM_SUB_CAND_DEMO = "data de fim";
    private static final String DATA_FIM_CONFLITOS_DEMO = "data fim conflitos";
/**
 * Método para ler as demonstrações.
 * @param node
 * @return 
 */
    private static Demonstracao lerDemonstracao(Node node) {
        Demonstracao d = new Demonstracao();
        try {
            DocumentBuilderFactory factory
                    = DocumentBuilderFactory.newInstance();
            //Create document builder
            DocumentBuilder builder = factory.newDocumentBuilder();

            //Obtain a new document
            Document document = builder.newDocument();

            document.appendChild(document.importNode(node, true));

            Element atributos = (Element) node;
            //get atributos
            d.setDescricao(atributos.getElementsByTagName(DESCRICAO_ELEMENT_NAME).item(0).getNodeValue());
            d.setCodigo(atributos.getElementsByTagName(CODIGO_ELEMENT_NAME).item(0).getNodeValue());
            String aux = atributos.getElementsByTagName(REALIZACAO_ELEMENT_NAME).item(0).getNodeValue();
            if (aux.equalsIgnoreCase("true")) {
                d.setRealizacao(true);
            } else {
                d.setRealizacao(false);
            }
            aux = atributos.getElementsByTagName(DATA_INICIO_SUB_CAND_DEMO).item(0).getNodeValue();
            String[] aux1 = aux.split("/");
            d.setDataInicioSubmissaoCandidaturas(new Data(Integer.parseInt(aux1[2]), Integer.parseInt(aux1[1]), Integer.parseInt(aux1[0])));
            aux = atributos.getElementsByTagName(DATA_FIM_SUB_CAND_DEMO).item(0).getNodeValue();
            aux1 = aux.split("/");
            d.setDataFimSubmissaoCandidaturas(new Data(Integer.parseInt(aux1[2]), Integer.parseInt(aux1[1]), Integer.parseInt(aux1[0])));
            aux = atributos.getElementsByTagName(DATA_FIM_CONFLITOS_DEMO).item(0).getNodeValue();
            aux1 = aux.split("/");
            d.setDataFimAtualizacaoConflitos(new Data(Integer.parseInt(aux1[2]), Integer.parseInt(aux1[1]), Integer.parseInt(aux1[0])));
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return d;
    }
/**
 * Método para ler as keywords.
 * @param node
 * @return 
 */
    private static Keyword lerKeyword(Node node) {
        Keyword keyword = new Keyword();
        try {
            DocumentBuilderFactory factory
                    = DocumentBuilderFactory.newInstance();
            //Create document builder
            DocumentBuilder builder = factory.newDocumentBuilder();

            //Obtain a new document
            Document document = builder.newDocument();

            document.appendChild(document.importNode(node, true));

            NodeList elementsKeyword = document.getElementsByTagName(PALAVRA_ELEMENT_NAME);

            Node elementKeyword = elementsKeyword.item(0);

            //Get value
            keyword.setPalavra(elementKeyword.getFirstChild().getNodeValue());
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return keyword;
    }
/**
 * método para ler os produtos.
 * @param node
 * @return 
 */
    private static Produto lerProduto(Node node) {
        Produto p = new Produto();
        try {
            DocumentBuilderFactory factory
                    = DocumentBuilderFactory.newInstance();
            //Create document builder
            DocumentBuilder builder = factory.newDocumentBuilder();

            //Obtain a new document
            Document document = builder.newDocument();

            document.appendChild(document.importNode(node, true));

            NodeList elementsProduto = document.getElementsByTagName(NOME_ELEMENT_NAME);

            Node elementKeyword = elementsProduto.item(0);

            //Get value
            p.setNome(elementKeyword.getFirstChild().getNodeValue());
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return p;
    }
/**
 * Método para ler as avaliaçoes.
 * @param node
 * @return 
 */
    private static Avaliacao lerAvaliacao(Node node) {
        Avaliacao a = new Avaliacao();
        try {
            DocumentBuilderFactory factory
                    = DocumentBuilderFactory.newInstance();
            //Create document builder
            DocumentBuilder builder = factory.newDocumentBuilder();

            //Obtain a new document
            Document document = builder.newDocument();

            document.appendChild(document.importNode(node, true));

            Element atributos = (Element) node;
            //get atributos
            a.setDecisao(atributos.getElementsByTagName(DECISAO_ELEMENT_NAME).item(0).getNodeValue());
            a.setTextoJustificativo(atributos.getElementsByTagName(JUSTIFICACAO_ELEMENT_NAME).item(0).getNodeValue());
            a.setRespostaTemaExpo(Integer.parseInt(atributos.getElementsByTagName(TEMA_EXPO_ELEMENT_NAME).item(0).getNodeValue()));
            a.setRespostaAdequacaoCandExposicao(Integer.parseInt(atributos.getElementsByTagName(ADEQUACAO_CAND_ELEMENT_NAME).item(0).getNodeValue()));
            a.setRespostaAdequacaoNumConvites(Integer.parseInt(atributos.getElementsByTagName(ADEQUACAO_N_CONVITES_ELEMENT_NAME).item(0).getNodeValue()));
            a.setRespostaRecomendacaoGlobal(Integer.parseInt(atributos.getElementsByTagName(RECOMENDACAO_GLOBAL_ELEMENT_NAME).item(0).getNodeValue()));

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return a;
    }
/**
 * Método para ler as candidaturas à exposicao.
 * @param node
 * @return 
 */
    private static CandidaturaExposicao lerCandidatura(Node node) {
        CandidaturaExposicao c = new CandidaturaExposicao();

        Element atributos = (Element) node;

        //Get atributos da candidatura.
        c.setEmailRep(atributos.getElementsByTagName(EMAIL_ELEMENT_NAME).item(0).getNodeValue());
        c.setNomeEmpresa(atributos.getElementsByTagName(EMPRESA_ELEMENT_NAME).item(0).getNodeValue());
        c.setMorada(atributos.getElementsByTagName(MORADA_FINAL_ELEMENT_NAME).item(0).getNodeValue());
        c.setTelemovel(Integer.parseInt(atributos.getElementsByTagName(TELEMOVEL_FINAL_ELEMENT_NAME).item(0).getNodeValue()));
        c.setArea(Double.parseDouble(atributos.getElementsByTagName(AREA_ELEMENT_NAME).item(0).getNodeValue()));
        c.setConvites(Integer.parseInt(atributos.getElementsByTagName(CONVITES_ELEMENT_NAME).item(0).getNodeValue()));

        //Get avaliações.
        NodeList elementsAvaliacao = atributos.getElementsByTagName(AVALIACAO_ELEMENT_NAME);
        NodeList avaliacoes = elementsAvaliacao.item(0).getChildNodes();
        for (int position = 0; position < avaliacoes.getLength(); position++) {
            Node avaliacao = avaliacoes.item(position);
            Avaliacao avaliacaof = lerAvaliacao(avaliacao);

            c.getListaAvaliacoes().addAvaliacao(avaliacaof);
        }
        //get produtos.
        NodeList elementsProduto = atributos.getElementsByTagName(PRODUTO_ELEMENT_NAME);
        NodeList produtos = elementsProduto.item(0).getChildNodes();
        for (int position = 0; position < produtos.getLength(); position++) {
            Node produto = produtos.item(position);
            Produto produtof = lerProduto(produto);

            c.getListaProdutos().addProduto(produtof);
        }

        //get keywords.
        NodeList elementsKeywords = atributos.getElementsByTagName(KEYWORDS_ELEMENT_NAME);
        NodeList keywords = elementsKeywords.item(0).getChildNodes();
        for (int position = 0; position < keywords.getLength(); position++) {
            Node keyword = keywords.item(position);
            Keyword keywordExample = new Keyword();

            keywordExample = lerKeyword(keyword);
            c.getListaKeywords().addKeyword(keywordExample);
        }
        //get demonstrações.
        NodeList elementsDemonstracoes = atributos.getElementsByTagName(DEMONSTRACAO_ELEMENT_NAME);
        NodeList demonstracoes = elementsDemonstracoes.item(0).getChildNodes();
        for (int position = 0; position < demonstracoes.getLength(); position++) {
            Node demonstracao = demonstracoes.item(position);
            Demonstracao demonstracaof = new Demonstracao();

            demonstracaof = lerDemonstracao(demonstracao);
            c.getListaDemonstracoes().addDemonstracao(demonstracaof);
        }

        return c;
    }
/**
 * Método para ler uma exposição.
 * @param node
 * @return 
 */
    public static Exposicao lerExposicao(Node ficheiro) {
        Exposicao exposicao = new Exposicao();
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

            //Create document builder
            DocumentBuilder builder = factory.newDocumentBuilder();

            //Obtain a new document
            Document document = builder.newDocument();
            document.appendChild(document.importNode(ficheiro, true));

            NodeList elementsExposicao = document.getElementsByTagName(ROOT_ELEMENT_NAME_EXPOSICAO);

            Element atributos = (Element) elementsExposicao.item(0);

            //Get atributos da exposicao.
            exposicao.setTitulo(atributos.getElementsByTagName(TITULO_ELEMENT_NAME).item(0).getNodeValue());
            exposicao.setDescricao(atributos.getElementsByTagName(DESCRICAO_EXPO_ELEMENT_NAME).item(0).getNodeValue());
            exposicao.setLocal(atributos.getElementsByTagName(LOCAL_ELEMENT_NAME).item(0).getNodeValue());
            String aux = atributos.getElementsByTagName(DATA_INICIO_ELEMENT_NAME).item(0).getNodeValue();
            String[] aux1 = aux.split("/");
            exposicao.setDataInicio(new Data(Integer.parseInt(aux1[2]), Integer.parseInt(aux1[1]), Integer.parseInt(aux1[0])));
            aux = atributos.getElementsByTagName(DATA_FIM_ELEMENT_NAME).item(0).getNodeValue();
            aux1 = aux.split("/");
            exposicao.setDataFim(new Data(Integer.parseInt(aux1[2]), Integer.parseInt(aux1[1]), Integer.parseInt(aux1[0])));
            aux = atributos.getElementsByTagName(DATA_FIM_SUB_CAND).item(0).getNodeValue();
            aux1 = aux.split("/");
            exposicao.setDataFimSubCand(new Data(Integer.parseInt(aux1[2]), Integer.parseInt(aux1[1]), Integer.parseInt(aux1[0])));
            aux = atributos.getElementsByTagName(DATA_FIM_ALTERACAO_CONFLITO).item(0).getNodeValue();
            aux1 = aux.split("/");
            exposicao.setDataFimAtcConf(new Data(Integer.parseInt(aux1[2]), Integer.parseInt(aux1[1]), Integer.parseInt(aux1[0])));
            aux = atributos.getElementsByTagName(DATA_FIM_AV_CANDIDATURA).item(0).getNodeValue();
            aux1 = aux.split("/");
            exposicao.setDataFimAvCandidatura(new Data(Integer.parseInt(aux1[2]), Integer.parseInt(aux1[1]), Integer.parseInt(aux1[0])));
            aux = atributos.getElementsByTagName(DATA_FIM_DECISAO_CANDIDATURA).item(0).getNodeValue();
            aux1 = aux.split("/");
            exposicao.setDataFimDcCandidaturas(new Data(Integer.parseInt(aux1[2]), Integer.parseInt(aux1[1]), Integer.parseInt(aux1[0])));

            //Get candidaturas.
            NodeList elementsCandidatura = document.getElementsByTagName(ELEMENT_NAME_CANDIDATURA);
            NodeList candidaturas = elementsCandidatura.item(0).getChildNodes();
            for (int position = 0; position < candidaturas.getLength(); position++) {
                Node candidatura = candidaturas.item(position);
                CandidaturaExposicao candidaturaf = lerCandidatura(candidatura);

                exposicao.getListaCandidaturas().addCandidatura(candidaturaf);
            }
           
            //get demonstrações.
            NodeList elementsDemonstracoes = document.getElementsByTagName(DEMONSTRACAO_ELEMENT_NAME);
            NodeList demonstracoes = elementsDemonstracoes.item(0).getChildNodes();
            for (int position = 0; position < demonstracoes.getLength(); position++) {
                Node demonstracao = demonstracoes.item(position);
                Demonstracao demonstracaof = new Demonstracao();

                demonstracaof = lerDemonstracao(demonstracao);
                exposicao.getListaDemonstracoes().addDemonstracao(demonstracaof);
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        return exposicao;
    }

}
