package lapr.project.ui;

import lapr.project.model.CalculatorExample;
import lapr.project.model.CentroExposicoes;

/**
 * @author Nuno Bettencourt <nmb@isep.ipp.pt> on 24/05/16.
 */
class Main {

	/**
	 * Private constructor to hide implicit public one.
	 */
	private Main(){

	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

//		CalculatorExample calculatorExample = new CalculatorExample();
//		System.out.println(calculatorExample.sum(3, 5));

         CentroExposicoes ce = new CentroExposicoes();
         LoginUI login = new LoginUI(ce);

	}

}
