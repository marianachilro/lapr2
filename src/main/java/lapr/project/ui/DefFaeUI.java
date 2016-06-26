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
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
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
    private JTextArea txtFae;

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
        jListaExp.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    exp = (Exposicao) jListaExp.getSelectedValue();
                    controller.selectExposicao(exp);
                    controller.getListaFae();
                    controller.getEstado();
                    if (!controller.checkEstado()) {
                        JOptionPane.showMessageDialog(DefFaeUI.this, "Não é possível definir FAEs na exposição selecionada.",
                                "Definir FAE", JOptionPane.WARNING_MESSAGE);
                        jListaExp.clearSelection();
                    }

                }
            }
        });
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
        p.add(criarBotaoVerFae());
        p.add(criarBotaoVerLista());
        p.add(criarBotaoSair());
        return p;
    }

    private JButton criarBotaoAdicionar() {
        JButton b = new JButton("Adicionar");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (exp != null) {

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
                        JOptionPane.showMessageDialog(DefFaeUI.this, "Não é possível definir um fae com esse username",
                                "Definir FAE", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(DefFaeUI.this, "Seleciona uma Exposição.", "Definir FAE", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        return b;
    }

    private JButton criarBotaoVerFae() {
        JButton b = new JButton("Ver Lista de FAEs");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(exp == null) {
                    JOptionPane.showMessageDialog(DefFaeUI.this, "Seleciona uma exposição", "DefinirFAE", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(DefFaeUI.this, criarPainelFAE(), "Definir FAE", JOptionPane.PLAIN_MESSAGE);
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
                if (exp != null) {
                    if (controller.getListaFae().size() < 2) {
                        JOptionPane.showMessageDialog(DefFaeUI.this, "Necessita de definir pelo menos 2 FAEs",
                                "Definir FAE", JOptionPane.WARNING_MESSAGE);
                    } else {
                        dispose();
                    }
                } else {
                    dispose();
                }
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

    private JPanel criarPainelFAE() {
        JPanel p = new JPanel();
        txtFae = new JTextArea(controller.apresentaLista());
        txtFae.setEditable(false);
        p.add(txtFae);
        return p;
    }

}
