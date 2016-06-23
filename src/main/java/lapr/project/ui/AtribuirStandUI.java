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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import lapr.project.controller.AtribuirStandController;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Stand;

/**
 *
 * @author Rita
 */
public class AtribuirStandUI extends JDialog {

    private JFrame janelaPai;
    private CentroExposicoes ce;
    private AtribuirStandController controller;
    private JList jLista;
    private ModeloListaExpos mLista;
    private JComboBox cbCand, cbStand;
    private CandidaturaExposicao cand;
    private Stand stand;

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
                new AtribuirStandUI(null, ce, "").setVisible(true);
            }
        });
    }
    
    public AtribuirStandUI(JFrame janelaPai, CentroExposicoes ce, String username) {
        super(janelaPai, "Atribuir Stand", true);
        this.ce = ce;
        this.controller = new AtribuirStandController(ce);
        jLista = new JList();
        this.mLista = new ModeloListaExpos(controller.getListaExposicoesOrganizador(username));
        jLista.setModel(mLista);
        jLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        cbCand = new JComboBox();
        cbStand = new JComboBox();
        criarComponentes();
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        pack();
        setResizable(false);
        setLocationRelativeTo(janelaPai);
        setVisible(true);
    }

    private void criarComponentes() {
        setLayout(new BorderLayout());
        add(criarPainelListaExpo(), BorderLayout.NORTH);
        add(criarPainelCB(), BorderLayout.CENTER);
        add(criarPainelBotoes(), BorderLayout.SOUTH);
    }

    private JPanel criarPainelListaExpo() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1, 2));
        JLabel lbl = new JLabel("Escolha uma exposição:");
        JScrollPane sc = new JScrollPane(jLista);
        p.add(lbl);
        p.add(sc);
        jLista.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                List<CandidaturaExposicao> lc = controller.getListaCandidaturas();
                List<Stand> ls = controller.getListaStandsNaoAtribuidos();
                cbCand.setModel(new DefaultComboBoxModel(lc.toArray()));
                cbStand.setModel(new DefaultComboBoxModel(ls.toArray()));
                if (lc.isEmpty()) { 
                    int i = JOptionPane.showConfirmDialog(AtribuirStandUI.this, "Não existem candidaturas disponíveis. Deseja selecionar outra exposição?",
                            "Atribuir Stand", JOptionPane.YES_NO_OPTION);
                    if (i == JOptionPane.YES_OPTION) {
                        jLista.clearSelection();
                    } else {
                        dispose();
                    }
                } else if (ls.isEmpty()) {
                    int i = JOptionPane.showConfirmDialog(AtribuirStandUI.this, "Não existem stands disponíveis Deseja selecionar outra exposição?.",
                            "Atribuir Stand", JOptionPane.YES_NO_OPTION);
                    if(i == JOptionPane.YES_OPTION) {
                        jLista.clearSelection();
                    } else {
                        dispose();
                    }
                }
            }
        });
        return p;
    }

    private JPanel criarPainelCB() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1, 4));
        JLabel lbl1 = new JLabel("Escolha uma candidatura:");
        JLabel lbl2 = new JLabel("Escolha um stand:");
        p.add(lbl1);
        p.add(cbCand);
        p.add(lbl2);
        p.add(cbStand);
        return p;
    }

    private JPanel criarPainelBotoes() {
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout(FlowLayout.CENTER));
        p.add(criarBotaoGuardar());
        p.add(criarBotaoCancelar());
        return p;
    }

    private JButton criarBotaoGuardar() {
        JButton b = new JButton("Guardar");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    cand = (CandidaturaExposicao) cbCand.getSelectedItem();
                    stand = (Stand) cbStand.getSelectedItem();
                    if (cand != null && stand != null) {
                        controller.selectCandidatura(cand);
                        controller.selectStand(stand);
                        controller.setStand();
                        int i = JOptionPane.showConfirmDialog(AtribuirStandUI.this, "Stand atribuido com sucesso. Deseja continuar a atribuir stands?",
                                "Atribuir Stand", JOptionPane.ERROR_MESSAGE);
                        if(i == JOptionPane.YES_OPTION) {
                            cbCand.removeAllItems();
                            cbStand.removeAllItems();
                            jLista.clearSelection();
                        } else {
                            if (controller.transitaEstado()) {
                                JOptionPane.showMessageDialog(AtribuirStandUI.this, "Todos os stands já se encontram atribuidos!",
                                        "Atribuir Stands", JOptionPane.INFORMATION_MESSAGE);
                            }
                            dispose();
                        }
                    } else {
                        JOptionPane.showMessageDialog(AtribuirStandUI.this, "Selecione uma Candidatura e um Stand para efetuar a atribuição",
                                "Atribuir Stand", JOptionPane.ERROR_MESSAGE);
                    }
            }
        });
        return b;
    }

    private JButton criarBotaoCancelar() {
        JButton b = new JButton("Cancelar");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(AtribuirStandUI.this, "Stand não foi atribuído com sucesso!",
                        "Atribuir Stand", JOptionPane.WARNING_MESSAGE);
                dispose();
            }
        });
        return b;
    }

}
