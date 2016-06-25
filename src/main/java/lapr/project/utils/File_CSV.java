/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.List;
import javax.swing.JOptionPane;
import lapr.project.model.Exposicao;

/**
 *
 * @author catarinarib
 */
public class File_CSV {

    /**
     * Exposicao
     */
    private final Exposicao exposicao;

    /**
     * Construtor que recebe como parametro a exposicao à qual pretende saber o
     * ranking de keywords
     *
     * @param exp exposicao
     */
    public File_CSV(Exposicao exp) {
        this.exposicao = exp;
    }

    /**
     * Método que guarda num ficheiro csv o ranking das keywords.
     * @throws java.io.FileNotFoundException
     */
    public void ficheiro()throws FileNotFoundException {

        String DELIMITADOR_VIRGULA = ";";
        String NOVA_LINHA_SEPARADOR = "\n";
        String FILE_TITULO = "Keyword;Candidaturas Aceites;Candidaturas Rejeitadas";

        try {

            List<String> listAtributos = this.exposicao.estatisticaCandidaturas();
            String nomeExpo = this.exposicao.getTitulo();
            FileWriter fileWriter = new FileWriter(nomeExpo + "FicheiroCSV.csv");
            fileWriter.append(FILE_TITULO);

            for (int i = 0; i < listAtributos.size(); i++) {
                fileWriter.append(NOVA_LINHA_SEPARADOR);
                fileWriter.append(listAtributos.get(i));
                fileWriter.append(DELIMITADOR_VIRGULA);
                fileWriter.append(listAtributos.get(i + 1));
                fileWriter.append(DELIMITADOR_VIRGULA);
                fileWriter.append(listAtributos.get(i + 2));

                i = i + 2;
            }
            fileWriter.flush();
            fileWriter.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível criar ficheiro csv!", "Erro_Ficheiro", JOptionPane.WARNING_MESSAGE);
        }

    }

}
