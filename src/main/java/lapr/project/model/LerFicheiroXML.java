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
    /**
     * Ficheiro a ler.
     */
private final File ficheiro;
/**
 * Contrutor que recebe o ficheiro a ler;
 * @param ficheiro 
 */
public LerFicheiroXML(File ficheiro){
    this.ficheiro=ficheiro;
}
/**
 * Método que lê um centro de exposições de um ficheiro XML e o retorna.
 * @return 
 */
public CentroExposicoes lerCentro(){
   CentroExposicoes centro = new CentroExposicoes();
	 try {

      
          
		JAXBContext jaxbContext = JAXBContext.newInstance(CentroExposicoes.class);

		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		 centro = (CentroExposicoes) jaxbUnmarshaller.unmarshal(ficheiro);
                
	  } catch (JAXBException e) {
              System.out.println(e.getCause());
	  } 
         for(Exposicao e : centro.getRegistoExposicoes().getListaExposicoes()){
             for(Organizador o : e.getListaOrganizadores().getListaOrganizadores()){
                 boolean existeO = false;
                 for(Utilizador u : centro.getRegistoUtilizadores().getListaUtilizadores()){
                     if(o.getUtilizador().equals(u)){
                         existeO = true;
                     }
                 }
                 if(existeO==false){
                    centro.getRegistoUtilizadores().addUtilizador(o.getUtilizador());
                 }
             }
             for(FAE fae : e.getListaFAES().getListaFAEs()){
                 boolean existeF = false;
                 for(Utilizador u :centro.getRegistoUtilizadores().getListaUtilizadores()){
                     if(fae.getUtilizador().equals(u)){
                         existeF = true;
                     }
             }
                 if(existeF==false){
                     centro.getRegistoUtilizadores().addUtilizador(fae.getUtilizador());
                 }
         }
         }
         return centro;
}
    
/**
 * Método que lê um centro de exposições apartir de um ficheiro XML e retorna as exposições do centor.
 * @return 
 */
public List<Exposicao> lerExposicoes(){
   CentroExposicoes centro = lerCentro();
   return centro.getRegistoExposicoes().getListaExposicoes();
}
}