/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import lapr.project.controller.AtribuirCandidaturaController;
import lapr.project.model.Atribuicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Mecanismo_NFAE;

/**
 *
 * @author miniondevil
 */
public class AtribuirCandidaturasUI  extends JDialog {

    private final MenuUI pai;
    private final AtribuirCandidaturaController controller;
    private final List<Atribuicao> lista;

    

    public AtribuirCandidaturasUI (MenuUI pai,CentroExposicoes ce ) {
        super(pai, "NFAE", true);
      
        this.pai = pai;
        this.controller = new AtribuirCandidaturaController(ce);
        controller.getExpo(ce.getRegistoExposicoes().getListaExposicoes().get(0).getTitulo());
        ce.getRegistoMecanismos().getListaMecanismos().add(new Mecanismo_NFAE());
        lista = controller.getListaAtribuicoes();
        criarComponentes();

        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        pack();
        setResizable(false);

        setLocationRelativeTo(pai);
        setVisible(true);

    }

    public void criarComponentes() {
        JTable t1 = criarTabela();
        JScrollPane s1 = new JScrollPane(t1);
        JPanel p1 = criarPainelBotoes();
        add(s1, BorderLayout.NORTH);
        add(p1, BorderLayout.SOUTH);
    }

    public JPanel criarPainelBotoes() {
        JPanel p1 = new JPanel();
     
        p1.add(criarBotaoCancelar());
        return p1;
    }

    

    public JButton criarBotaoCancelar() {
        JButton cancelar = new JButton("Voltar Atrás.");
        cancelar.setMnemonic(KeyEvent.VK_C);
        cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                dispose();
            }
        });
        return cancelar;
    }

    public JTable criarTabela(){
  
        String[][] aux1 = new String[lista.size()][2];
        String[] columnNames = {"Candidatura","FAE"};
       
        int cont = 0;
        for (Atribuicao a : lista) {
            aux1[cont][0] = a.getCandidatura().toString();
            aux1[cont][1] = a.getFAE().toString();
            cont++;
        }

        JTable t1 = new JTable(aux1, columnNames);
        t1.setVisible(true);
      
        controller.registaAtribuicoes();
        return t1;
}
}


