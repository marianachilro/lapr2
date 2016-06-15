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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import lapr.project.controller.ListarCandRemovidasController;
import lapr.project.model.Candidatura;
import lapr.project.model.Exposicao;

/**
 *
 * @author miniondevil
 */
public class ListaCandidaturasRemovidas extends JDialog {

    private final ListarCandRemovidasUI pai;
    private final ListarCandRemovidasController controller;
    private final Exposicao e;

    

    public ListaCandidaturasRemovidas (ListarCandRemovidasUI pai,ListarCandRemovidasController controller,Exposicao e ) {
        super(pai, "NFAE", true);
      
        this.pai = pai;
        this.controller = controller;
        this.e=e;
        
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
  List<Candidatura> lc = controller.getListaCandRemovidas(e);
        String[][] aux1 = new String[lc.size()][1];
        String[] columnNames = {"Candidatura"};
        int cont = 0;
        for (Candidatura c : lc) {
            aux1[cont][0] = c.getEmailRep();
            
            cont++;
        }
//aux1[0][0] = "try1";
        JTable t1 = new JTable(aux1, columnNames);
        t1.setVisible(true);
        //t1.setFillsViewportHeight(rootPaneCheckingEnabled);
        return t1;
}
}
    

