/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.File;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


/**
 *
 * @author miniondevil
 */
public class LerFicheiroXML {
private final File ficheiro;
public LerFicheiroXML(File ficheiro){
    this.ficheiro=ficheiro;
}
public List<Exposicao> lerExposicoes(){
   CentroExposicoes centro = new CentroExposicoes();
	 try {

      
          
		JAXBContext jaxbContext = JAXBContext.newInstance(CentroExposicoes.class);

		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		 centro = (CentroExposicoes) jaxbUnmarshaller.unmarshal(ficheiro);
                if(centro.getRegistoExposicoes().getListaExposicoes().isEmpty()){
                    System.out.println("empty");
                }else{
		System.out.println(centro.getRegistoExposicoes().getListaExposicoes().get(0).toString());
                }
                System.out.println("123");

	  } catch (JAXBException e) {
              System.out.println(e.getCause());
	  } 
         return centro.getRegistoExposicoes().getListaExposicoes();
}
    
}
