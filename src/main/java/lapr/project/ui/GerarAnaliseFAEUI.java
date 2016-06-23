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

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CentroExposicoes ce = new CentroExposicoes();
                new GerarAnaliseFAEUI(null, ce).setVisible(true);
            }
        });
    }

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

    private void criarComponentes() {
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
