package lapr.project.ui;

import java.io.IOException;
import lapr.project.model.Avaliacao;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.FAE;
import lapr.project.model.Keyword;
import lapr.project.model.Local;
import lapr.project.model.Utilizador;
import lapr.project.utils.Data;
import org.xml.sax.SAXException;

/**
 * @author Nuno Bettencourt <nmb@isep.ipp.pt> on 24/05/16.
 */
class Main {

    /**
     * Private constructor to hide implicit public one.
     */
    private Main() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, SAXException {

        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u = new Utilizador(2,"joao", "jo", "asd@centro.pt", "aA;2", "ddddd");
        ce.getRegistoUtilizadores().getListaUtilizadores().add(u);
        Utilizador u1 = new Utilizador(3,"carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u1);
        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao exp = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);
        ce.getRegistoExposicoes().getListaExposicoes().add(exp);
        exp.addOrganizador(u);
        exp.addOrganizador(u1);
        CandidaturaExposicao cex = new CandidaturaExposicao("rep@centro.pt", "nome empresa", "morada", 919999999, 23, 5);
        exp.getListaCandidaturas().getListCandidaturas().add(cex);
        CandidaturaExposicao cex3 = new CandidaturaExposicao("rep3@centro.pt", "nome empresa3", "morada3", 919999999, 23, 5);
        exp.getListaCandidaturas().getListCandidaturas().add(cex3);
        CandidaturaExposicao cex2 = new CandidaturaExposicao("rep2@centro.pt", "nome empresa2", "morada2", 919999999, 50,2);
        exp.getListaCandidaturas().getListCandidaturas().add(cex2);
        cex.setDecisao(true);
        cex3.setDecisao(true);
        Keyword k = new Keyword("luz");
        Keyword k1 = new Keyword("carro");
        Keyword k3=new Keyword("agua");
        Keyword k4 = new Keyword("motas");
        cex.getListaKeywords().addKeyword(k);
        cex.getListaKeywords().addKeyword(k3);
        cex3.getListaKeywords().addKeyword(k);
        cex3.getListaKeywords().addKeyword(k4);
        cex2.getListaKeywords().addKeyword(k1);
        cex2.getListaKeywords().addKeyword(k4);
        cex2.getListaKeywords().addKeyword(k);
        cex2.getListaKeywords().addKeyword(k3);
        Avaliacao a = new Avaliacao();
        cex.getListaAvaliacoes().getListaAvaliacao().add(a);
        FAE fae = new FAE(u1);
        exp.getListaFAES().getListaFAEs().add(fae);

        LoginUI login = new LoginUI(ce);

    }

}
