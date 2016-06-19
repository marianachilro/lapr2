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
import java.util.List;
import javax.swing.Action;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import lapr.project.controller.DefinirFaeController;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.FAE;
import lapr.project.model.ListaFAEs;
import lapr.project.model.RegistoUtilizadores;

/**
 *
 * @author Rita
 */
public class DefFaeUI extends JDialog {

    private CentroExposicoes ce;
    private FAE f;
    private Exposicao exp;
    private DefinirFaeController controller;
    private RegistoUtilizadores ru;
    private ListaFAEs lFae;
    private JList jListaExp;
    private JTextField txtUsername;
    private ModeloListaExpos mLista;

    public DefFaeUI(JFrame janelaPai, CentroExposicoes ce, String username) {
        super(janelaPai, "DefinirFae", true);
        this.ce = ce;
        this.controller = new DefinirFaeController(ce, username);
        this.ru = controller.getRegistoUtilizadores();
        jListaExp = new JList();
        mLista = new ModeloListaExpos(controller.getExposicoesOrganizador());
        jListaExp.setModel(mLista);
        jListaExp.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        criarComponentes();
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        pack();
        setResizable(false);
        setLocationRelativeTo(janelaPai);
        setVisible(true);
    }

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
                new DefFaeUI(null, ce, "").setVisible(true);
            }
        });
    }

    public void criarComponentes() {
        setLayout(new BorderLayout());
        add(criarPainelExpos(), BorderLayout.NORTH);
        add(criarPainelUtilizador(), BorderLayout.CENTER);
        add(criarPainelBotoes(), BorderLayout.SOUTH);
    }

    private JPanel criarPainelExpos() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1, 2));
        JLabel lbl = new JLabel("Escolha uma Exposição:");
        JScrollPane sc = new JScrollPane(jListaExp);
        p.add(lbl);
        p.add(sc);
        return p;
    }

    private JPanel criarPainelUtilizador() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1, 3));
        JLabel lbl1 = new JLabel("Introduza o username");
        txtUsername = new JTextField(30);
        p.add(lbl1);
        p.add(txtUsername);
        p.add(criarBotaoAdicionar());
        return p;
    }

    private JPanel criarPainelBotoes() {
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout(FlowLayout.RIGHT));
        p.add(criarBotaoVerLista());
        p.add(criarBotaoSair());
        return p;
    }

    private JButton criarBotaoAdicionar() {
        JButton b = new JButton("Adicionar");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exp = (Exposicao) jListaExp.getSelectedValue();
                if (exp != null) {
                    controller.selectExposicao(exp);
                    controller.getListaFae();
                    f = controller.novoFae(txtUsername.getText());
                    if (f != null) {
                        if (controller.registaFae()) {
                            int i = JOptionPane.showConfirmDialog(DefFaeUI.this, criarPainelInfo(), "FAE Definido!", JOptionPane.YES_NO_OPTION);
                            if (i == JOptionPane.YES_OPTION) {
                                txtUsername.setText("");
                            } else {
                                controller.getEstado();
                                controller.setFaeDefinidos();
                                dispose();
                            }
                        } else {
                            JOptionPane.showMessageDialog(DefFaeUI.this, "Não foi possível adicionar o FAE", "Definir FAE", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(DefFaeUI.this, "Não existe nenhum Utilizador com esse username!",
                                "Definir FAE", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(DefFaeUI.this, "Seleciona uma Exposição.", "Definir FAE", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        return b;
    }

    private JButton criarBotaoVerLista() {
        JButton b = new JButton("Ver Lista Utilizadores");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(DefFaeUI.this, criarInfoLista(), "Lista de Utilizadores", JOptionPane.INFORMATION_MESSAGE);
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

    private JPanel criarPainelInfo() {
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        JLabel lbl = new JLabel(f.toString() + "adicionado com sucesso. Continuar?");
        JScrollPane sc = new JScrollPane(new JTextArea(controller.apresentaLista()));
        p.add(lbl, BorderLayout.NORTH);
        p.add(sc, BorderLayout.SOUTH);
        return p;
    }

    private JPanel criarInfoLista() {
        JPanel p = new JPanel();
        JTextArea txt = new JTextArea(ru.toString());
        JScrollPane sc = new JScrollPane(txt);
        p.add(sc);
        return p;
    }

}
