/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import lapr.project.controller.GerarAnaliseFAEController;
import lapr.project.model.CentroExposicoes;

/**
 *
 * @author Rita
 */
public class GerarAnaliseFAEUI extends JDialog {

    private GerarAnaliseFAEController controller;

    public GerarAnaliseFAEUI(JFrame janelaPai, CentroExposicoes ce) {
        super(janelaPai, "Gerar Análise", true);
        this.controller = new GerarAnaliseFAEController(ce);
        criarComponentes();
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        pack();
        setResizable(true);
        setLocationRelativeTo(janelaPai);
        
        setVisible(true);
    }

    public void criarComponentes() {
        controller.criarAnalises();
        setLayout(new BorderLayout(30,30));
        JLabel lbl = new JLabel();
        if(controller.needsWarning()) {
            lbl.setText("Existem alertas.");
        } else {
            lbl.setText("Não existem alertas.");
        }
        add(criarPainelInfo(), BorderLayout.NORTH);
        add(lbl, BorderLayout.CENTER);
        add(criarPainelBotao(), BorderLayout.SOUTH);
    }

    private JPanel criarPainelInfo() {
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        JTextArea txtArea = new JTextArea(controller.toString());
        txtArea.setEditable(false);
        JScrollPane sc = new JScrollPane(txtArea);
        p.add(sc, BorderLayout.CENTER);
        return p;
    }

    private JPanel criarPainelBotao() {
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        
        p.add(criarBotaoOk(), BorderLayout.EAST);
        return p;
    }

    private JButton criarBotaoOk() {
        JButton b = new JButton("Ok");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        return b;
    }

}
