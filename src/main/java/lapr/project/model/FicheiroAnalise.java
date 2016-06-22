/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

/**
 *
 * @author Rita
 */
public class FicheiroAnalise {
    
    private List<AnaliseFAE> listAnalise;
    
    public FicheiroAnalise(List<AnaliseFAE> listAnalise) {
        this.listAnalise = listAnalise;
    }
    
    public void escreverFicheiro() throws FileNotFoundException {
        PrintWriter out = new PrintWriter(new File("Análise.txt"));
        out.printf("Nível de Significância: %.2f %n", 5.0);
        out.printf("Região Crítica: [%.2f;+ infinito[ %n", 1.65);
        out.printf("%1s | %-7s | %-7s | %-7s | %-7s | %-7s%n", "Utilizador", "Nº de Submissõoes", "Média das classificaçõesdo FAE",
                "Média dos desvios", "Valor observado da Estatistica", "Decisão");
        out.printf("________________________________________________________________________________________________________________________________%n");
        for(AnaliseFAE a : listAnalise) {
            out.printf("%-17s | %d |%27.3f |%25.3f |%25.3f |%17s%n", a.getUtilizador().getUsername(), a.getnSub(),
                    a.getMediaClassificacoes(), a.getMediaDesvios(), a.getEstatistica(), a.getDecisao());
        }
        out.close();
    }
}
