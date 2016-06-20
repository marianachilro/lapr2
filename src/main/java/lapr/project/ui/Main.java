package lapr.project.ui;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import lapr.project.model.CalculatorExample;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.Local;
import lapr.project.model.Utilizador;
import lapr.project.utils.Data;

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
    public static void main(String[] args) {       

       
        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u = new Utilizador("joao","jo","asd@centro.pt","aA;2","ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u);
        Utilizador u1 = new Utilizador("carol","carol","carold@centro.pt","aA;2","ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u1);
        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016,06,21,20,20,20);
        Data datf = new Data(2016,06,21,20,20,23);
        Exposicao exp = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
            dati, dati);
        ce.getRegistoExposicoes().getListaExposicoes().add(exp);
        
        LoginUI login = new LoginUI(ce);

    }

}
