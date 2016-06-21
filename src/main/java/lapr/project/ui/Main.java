package lapr.project.ui;

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.xml.bind.JAXBException;
import lapr.project.model.Avaliacao;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.FAE;
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
    public static void main(String[] args) throws FileNotFoundException, IOException, SAXException, JAXBException {

        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u = new Utilizador(2,"joao", "jo", "asd@centro.pt", "aA;2", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u);
        Utilizador u1 = new Utilizador(3,"carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u1);
        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 06, 21, 20, 20, 20);
        Data datf = new Data(2016, 06, 21, 20, 20, 23);
        Exposicao exp = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);
        ce.getRegistoExposicoes().getListaExposicoes().add(exp);
        exp.addOrganizador(u);
        CandidaturaExposicao cex = new CandidaturaExposicao("rep@centro.pt", "nome empresa", "morada", 919999999, 23, 5);
        exp.getListaCandidaturas().getListCandidaturas().add(cex);
        Avaliacao a = new Avaliacao();
        cex.getListaAvaliacoes().getListaAvaliacao().add(a);
        FAE fae = new FAE(u1);
        exp.getListaFAES().getListaFAEs().add(fae);

        LoginUI login = new LoginUI(ce);

    }

}
