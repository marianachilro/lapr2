package lapr.project.ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.MecanismoConflitoIdentidadeNumerica;
import lapr.project.model.MecanismoGeralDetecaoConflitos;
import lapr.project.model.TipoConflito;
import lapr.project.model.Utilizador;
import org.xml.sax.SAXException;

/**
 * @author Nuno Bettencourt <nmb@isep.ipp.pt> on 24/05/16.
 */
class Main {

    /**
     * Private constructor to hide implicit public one.
     */
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, SAXException {

        CentroExposicoes ce = new CentroExposicoes();
        Utilizador gestor = new Utilizador(2, "Gestor", "gestor", "gestor@centro.pt", "aA;1", "ddddd");
        ce.getRegistoUtilizadores().getListaUtilizadores().add(gestor);
        List<MecanismoGeralDetecaoConflitos> listaMecanismos = new ArrayList<>();
        listaMecanismos.add(new MecanismoConflitoIdentidadeNumerica());
        TipoConflito tipo = new TipoConflito("papeis diferentes", "um representante que tenha outro papel no centro");
        tipo.setListaMecanismos(listaMecanismos);
        ce.getRegistoTipoConflitos().getListaTipoConflitos().add(tipo);

         LoginUI login = new LoginUI(ce);



    }

}
