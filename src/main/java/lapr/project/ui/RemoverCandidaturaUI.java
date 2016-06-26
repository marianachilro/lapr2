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
import lapr.project.controller.RemoverCandidaturaController;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.Removivel;

/**
 *
 * @author Rita
 */
public class RemoverCandidaturaUI extends JDialog {

    private RemoverCandidaturaController controller;
    private CentroExposicoes ce;
    private JList jLista;
    private ModeloListaExpos mLista;
    private JComboBox cb;
    private JButton btRemover;

    public RemoverCandidaturaUI(JFrame janelaPai, CentroExposicoes ce, String email) {
        super(janelaPai, "Remover Candidatura", true);
        controller = new RemoverCandidaturaController(ce, email);
        jLista = new JList();
        mLista = new ModeloListaExpos(controller.getListaExposicoes());
        jLista.setModel(mLista);
        jLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
        add(criarPainelExpos(), BorderLayout.NORTH);
        add(criarPainelCand(), BorderLayout.CENTER);
        add(criarPainelBotoes(), BorderLayout.SOUTH);
    }

    private JPanel criarPainelExpos() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1, 2));
        JLabel lbl = new JLabel("Escolha uma exposição:");
        jLista.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    controller.selectExposicao((Exposicao) jLista.getSelectedValue());
                    List<Removivel> lc = controller.getListaRemoviveis();
                    if (lc.isEmpty()) {
                        int i = JOptionPane.showConfirmDialog(RemoverCandidaturaUI.this, "Não existem candidaturas disponíveis nesta exposição. "
                                + "Deseja selecionar outra exposição?", "Remover Candidatura", JOptionPane.YES_NO_OPTION);
                        if (i == JOptionPane.YES_OPTION) {
                            jLista.clearSelection();
                        } else {
                            dispose();
                        }
                    } else {
                        Removivel cand = (Removivel) cb.getSelectedItem();
                        controller.selectCandidatura(cand);
                        cb.setModel(new DefaultComboBoxModel(lc.toArray()));
                    }
                    btRemover.setEnabled(true);
                }
            }
        });
        JScrollPane sc = new JScrollPane(jLista);
        p.add(lbl);
        p.add(sc);
        return p;
    }

    private JPanel criarPainelCand() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1, 2));
        JLabel lbl = new JLabel();
        p.add(lbl);
        p.add(cb);
        return p;
    }

    private JPanel criarPainelBotoes() {
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout(FlowLayout.CENTER));
        p.add(criarBotaoRemover());
        p.add(criarBotaoSair());
        return p;
    }

    private JButton criarBotaoRemover() {
        btRemover = new JButton("Remover");
        btRemover.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {;

                if (controller.removeCandidatura()) {
                    int i = JOptionPane.showConfirmDialog(RemoverCandidaturaUI.this, "Candidatura Removida com sucesso. Deseja continuar?",
                            "Remover Candidatura", JOptionPane.YES_NO_OPTION);
                    if (i == JOptionPane.YES_OPTION) {
                        cb.removeAllItems();
                        jLista.clearSelection();
                    } else {
                        dispose();
                    }
                } else {
                    JOptionPane.showMessageDialog(RemoverCandidaturaUI.this, "Candidatura não foi removida com sucesso.",
                            "Remover Candidatura", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btRemover.setEnabled(false);
        return btRemover;
    }

    private JButton criarBotaoSair() {
        JButton b = new JButton("Sair");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(RemoverCandidaturaUI.this, "Candidatura não foi removida com sucesso",
                        "Remover Candidatura", JOptionPane.WARNING_MESSAGE);
                dispose();
            }
        });
        return b;
    }
}
