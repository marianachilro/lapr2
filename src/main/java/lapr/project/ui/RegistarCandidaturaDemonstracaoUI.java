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
import lapr.project.controller.RegistarCandidaturaDemonstracaoController;
import lapr.project.model.CandidaturaDemonstracao;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;

/**
 *
 * @author Rita
 */
public class RegistarCandidaturaDemonstracaoUI extends JDialog {
    
    private JFrame janelaPai;
    private RegistarCandidaturaDemonstracaoController controller;
    private JList jListaExpo, jListaDemo;
    private ModeloListaExpos mLista;
    private ModeloListaDemonstracoes mListaDemo;
    private JComboBox cb;
    private JButton btConf;
    
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
                new RegistarCandidaturaDemonstracaoUI(null, ce, "").setVisible(true);
            }
        });
    }
    
    public RegistarCandidaturaDemonstracaoUI(JFrame janelaPai, CentroExposicoes ce, String email) {
        super(janelaPai, "Registar Candidatura de Demonstração", true);
        controller = new RegistarCandidaturaDemonstracaoController(email, ce);
        jListaExpo = new JList();
        jListaDemo = new JList();
        mLista = new ModeloListaExpos(controller.getListaExposicoes());
        jListaExpo.setModel(mLista);
        jListaExpo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        cb = new JComboBox();
        criarComponentes();
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        pack();
        setResizable(false);
        setLocationRelativeTo(janelaPai);
        setVisible(true);
    }
    
    private void criarComponentes() {
        setLayout(new BorderLayout());
        add(criarPainelExpo(), BorderLayout.NORTH);
        add(criarPainelCand(), BorderLayout.CENTER);
        add(criarPainelBotoes(), BorderLayout.SOUTH);
    }
    
    private JPanel criarPainelExpo() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1, 2));
        JLabel lbl = new JLabel("Escolha uma exposição:");
        JScrollPane sc = new JScrollPane(jListaExpo);
        p.add(lbl);
        p.add(sc);
        jListaExpo.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Exposicao exp = (Exposicao) jListaExpo.getSelectedValue();
                controller.selectExposicoes(exp);
                List<CandidaturaExposicao> lc = controller.getListaCandidaturasRep();
                if (lc.isEmpty()) {
                    int i = JOptionPane.showConfirmDialog(RegistarCandidaturaDemonstracaoUI.this, "Não existem candidaturas disponíveis."
                            + "Deseja escolher outra exposição?", "Registar Candidatura de Demonstração", JOptionPane.YES_NO_OPTION);
                    if (i == JOptionPane.YES_OPTION) {
                        jListaExpo.clearSelection();
                    } else {
                        dispose();
                    }
                } else {
                    cb.setModel(new DefaultComboBoxModel(lc.toArray()));
                }
            }
        });
        return p;
    }
    
    private JPanel criarPainelCand() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(2, 2));
        JLabel lbl1 = new JLabel("Escolha uma candidatura:");
        JLabel lbl2 = new JLabel("Escolha as demonstrações:");
        JScrollPane sc = new JScrollPane(jListaDemo);
        p.add(lbl1);
        p.add(cb);
        p.add(lbl2);
        cb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CandidaturaExposicao cand = (CandidaturaExposicao) cb.getSelectedItem();
                controller.selectCandidatura(cand);
                List<Demonstracao> ld = controller.getListDemonstracao();
                if(ld.isEmpty()) {
                    int i = JOptionPane.showConfirmDialog(RegistarCandidaturaDemonstracaoUI.this, "Não existem demonstrações disponíveis. "
                            + "Desejar escolher outra candidatura?", "Registar Candidatura de Demonstração", JOptionPane.YES_NO_OPTION);
                    if(i == JOptionPane.NO_OPTION) {
                        dispose();
                    }
                } else {
                    mListaDemo = new ModeloListaDemonstracoes(ld);
                    jListaDemo.setModel(mLista);
                    jListaDemo.setSelectionMode( ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
                }
                btConf.setEnabled(true);
            }
        });
        p.add(sc);
        return p;
    }
    
    private JPanel criarPainelBotoes() {
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout(FlowLayout.CENTER));
        p.add(criarBotaoConfirmar());
        p.add(criarBotaoCancelar());
        return p;
    }
    
    private JButton criarBotaoConfirmar() {
        btConf = new JButton("Confirmar");
        btConf.setEnabled(false);
        btConf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<Demonstracao> ld = jListaDemo.getSelectedValuesList();
                if(!ld.isEmpty()) {
                    controller.novaCandidaturaDemonstracao(ld);
                    if(controller.registarCandidatura() && controller.transitaEstado()) {
                        JOptionPane.showMessageDialog(RegistarCandidaturaDemonstracaoUI.this, 
                                "Candidatura foi registada com sucesso.", "Registar Candidatura de Demonstração", JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(RegistarCandidaturaDemonstracaoUI.this, 
                                "Candidatura foi registada com sucesso.", "Registar Candidatura de Demonstração", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        return btConf;
    }
    
    private JButton criarBotaoCancelar() {
        JButton b = new JButton("Cancelar");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(RegistarCandidaturaDemonstracaoUI.this, "Candidatura não foi registada.",
                        "Registar Candidatura de Demonstração", JOptionPane.WARNING_MESSAGE);
                dispose();
            }
        });
        return b;
    }
}
