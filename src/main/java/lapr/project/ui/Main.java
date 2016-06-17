package lapr.project.ui;

import java.util.Date;
import lapr.project.model.CalculatorExample;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Local;
import lapr.project.model.Utilizador;

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

//		CalculatorExample calculatorExample = new CalculatorExample();
//		System.out.println(calculatorExample.sum(3, 5));
       
        CentroExposicoes ce = new CentroExposicoes();
        Utilizador u = new Utilizador("joao","jo","asd@centro.pt","aA;2","ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u);
        Utilizador u1 = new Utilizador("carol","carol","carold@centro.pt","aA;2","ddddd");
        ce.getRegistoUtilizadores().addUtilizador(u1);
        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        LoginUI login = new LoginUI(ce);

    }

}
