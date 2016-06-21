/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author miniondevil
 */
public class EscreverXML {
    	public static void EscreverCentro(CentroExposicoes ce) throws FileNotFoundException, JAXBException{
try{

		File file = new File("teste.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(CentroExposicoes.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

		// output pretty printed
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		jaxbMarshaller.marshal(ce, file);
		jaxbMarshaller.marshal(ce, System.out);

	      } catch (JAXBException e) {
		e.printStackTrace();
	
}
}
}
