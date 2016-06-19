/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import lapr.project.controller.ConfirmarRegistoDeUtilizadorController;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Utilizador;

/**
 *
 * @author Rita
 */
public class ConfirmarRegistoDeUtilizadorUI extends JDialog {

    private JFrame janelaPai;
    private CentroExposicoes ce;
    private JList jLista;
    private ModeloListaUtilizadores mLista;
    private ConfirmarRegistoDeUtilizadorController controller;

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
                new ConfirmarRegistoDeUtilizadorUI(null, ce).setVisible(true);
            }
        });
    }
    
    public ConfirmarRegistoDeUtilizadorUI(JFrame janelaPai, CentroExposicoes ce) {
        super(janelaPai, "Confirmar Utilizadores", true);
        this.janelaPai = janelaPai;
        this.ce = ce;
        this.jLista = new JList();
        this.mLista = new ModeloListaUtilizadores(controller.getUtilizadoresNaoConfirmados());
        jLista.setModel(mLista);
        jLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        controller.getRegistoUtilizadores();
        criarComponentes();
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        pack();
        setResizable(false);
        setLocationRelativeTo(janelaPai);
        setVisible(true);
    }

    private void criarComponentes() {
        setLayout(new BorderLayout());
        add(criarPainelUtilizadores());
        add(criarPainelBotoes());
    }

    private JPanel criarPainelUtilizadores() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1, 2));
        JLabel lbl = new JLabel("Escolha um utilizador:");
        JScrollPane sc = new JScrollPane(jLista);
        p.add(lbl);
        p.add(sc);
        return p;
    }

    private JPanel criarPainelBotoes() {
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout(FlowLayout.CENTER));
        p.add(criarBotaoConfirmar());
        p.add(criarBotaoSair());
        return p;
    }

    private JButton criarBotaoConfirmar() {
        JButton b = new JButton("Confirmar");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Utilizador u = (Utilizador) jLista.getSelectedValue();
                if (u != null) {
                    controller.selectUtilizador(u);
                    if (controller.removeUtilizador() && controller.confirmaUtilizador()) {
                        int i = JOptionPane.showConfirmDialog(ConfirmarRegistoDeUtilizadorUI.this, u.toString() + 
                                " foi confirmado com sucesso! Deseja continuar?", "Utilizador Confirmado", JOptionPane.YES_NO_OPTION);
                        if (i == JOptionPane.YES_OPTION) {
                            jLista.setSelectedValue(null, false);
                        } else {
                            dispose();
                        }
                    }
                }
            }
        });
        return b;
    }

    private JButton criarBotaoSair() {
        JButton b = new JButton("Sair");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        return b;
    }

}
