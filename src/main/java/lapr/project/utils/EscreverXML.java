/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Security;
import lapr.project.model.Utilizador;

/**
 *
 * @author miniondevil
 */
public class EscreverXML {

    /**
     * Centro de exposições a ser lido.
     */
    private final CentroExposicoes ce;
    /**
     * ficheiro onde vai ser gravado.
     */
    private final File ficheiro;

    /**
     * Contrutor que recebe por parâmetro o centro de exposições.
     *
     * @param ce
     * @param ficheiro
     */
    public EscreverXML(CentroExposicoes ce, File ficheiro) {
        this.ce = ce;
        this.ficheiro = ficheiro;
    }

    /**
     * Método que escreve para um ficheiro XML de nome "CentroExposicoes.xml" o
     * centro de exposições.
     */
    public void escreverCentro() {
        try {
            codificarDados();
            JAXBContext jaxbContext = JAXBContext.newInstance(CentroExposicoes.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(ce, ficheiro);
            jaxbMarshaller.marshal(ce, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();

        }
    }

    public void codificarDados() {
        for (Utilizador u : ce.getRegistoUtilizadores().getListaUtilizadores()) {
            Security s = new Security(u.getShift(), u.getKeyword());
            u.setNome(s.substitutionAndTranpositionCipher(u.getNome()));
            u.setEmail(s.substitutionAndTranpositionCipher(u.getEmail()));
            u.setUsername(s.substitutionAndTranpositionCipher(u.getUsername()));
            u.setPassword(s.codificarShift(u.getPassword()));
            u.setKeyword(s.codificarShift(u.getKeyword()));
        }
        for(Utilizador u: ce.getRegistoUtilizadoresNaoConfirmados().getListaUtilizadores()){
            Security s = new Security(u.getShift(), u.getKeyword());
            u.setNome(s.substitutionAndTranpositionCipher(u.getNome()));
            u.setEmail(s.substitutionAndTranpositionCipher(u.getEmail()));
            u.setUsername(s.substitutionAndTranpositionCipher(u.getUsername()));
            u.setPassword(s.codificarShift(u.getPassword()));
            u.setKeyword(s.codificarShift(u.getKeyword()));
        }
    }
}
