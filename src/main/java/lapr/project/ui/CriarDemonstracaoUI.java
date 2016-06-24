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
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import lapr.project.controller.CriarDemonstracaoController;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.Recurso;

/**
 *
 * @author Rita
 */
public class CriarDemonstracaoUI extends JDialog {

    private JFrame janelaPai;
    private CriarDemonstracaoController controller;
    private String email;
    private CentroExposicoes ce;
    private Exposicao exp;
    private JList jLista;
    private ModeloListaExpos mLista;
    private JTextField txtCodigo, txtDescricao;
    private JComboBox cb;

    public CriarDemonstracaoUI(JFrame janelaPai, CentroExposicoes ce, String email) {
        super(janelaPai, "Criar Demonstração", true);
        this.janelaPai = janelaPai;
        this.email = email;
        this.ce = ce;
        this.controller = new CriarDemonstracaoController(ce, email);
        jLista = new JList();
        mLista = new ModeloListaExpos(controller.mostrarExpo());
        jLista.setModel(mLista);
        jLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        criarComponentes();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
        setResizable(false);
        setLocationRelativeTo(janelaPai);
        setVisible(true);
    }

    private void criarComponentes() {
        setLayout(new BorderLayout());
        add(criarPainelExpos(), BorderLayout.NORTH);
        add(criarPainelDados(), BorderLayout.CENTER);
        add(criarPainelBotoes(), BorderLayout.SOUTH);
    }

    private JPanel criarPainelExpos() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1, 2));
        JLabel lbl = new JLabel("Escolha uma exposição");
        JScrollPane sc = new JScrollPane(jLista);
        jLista.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!controller.checkEstado()) {
                    JOptionPane.showMessageDialog(CriarDemonstracaoUI.this, "Não é possível criar demonstrações na exposição selecionada.",
                            "Criar Demonstração", JOptionPane.WARNING_MESSAGE);
                    jLista.clearSelection();
                }
            }
        });
        p.add(lbl);
        p.add(sc);
        return p;
    }

    private JPanel criarPainelDados() {
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.add(criarPainelSecDescricao(), BorderLayout.NORTH);
        p.add(criarPainelSecRecursos(), BorderLayout.SOUTH);
        return p;
    }

    private JPanel criarPainelSecDescricao() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(2, 2));
        JLabel lbl1 = new JLabel("Código:");
        JLabel lbl2 = new JLabel("Descrição:");
        txtCodigo = new JTextField(20);
        txtDescricao = new JTextField(20);
        p.add(lbl1);
        p.add(txtCodigo);
        p.add(lbl2);
        p.add(txtDescricao);
        return p;
    }

    private JPanel criarPainelSecRecursos() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1, 3));
        JLabel lbl2 = new JLabel("Recursos:");
        cb = new JComboBox(controller.getListaRecursos().toArray());
        p.add(lbl2);
        p.add(cb);
        p.add(criarBotaoSecAdicionar());
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
                exp = (Exposicao) jLista.getSelectedValue();
                if (exp != null) {
                    controller.selectExposicao(exp);
                    controller.novaDemonstracao();
                    try {
                        controller.setDadosDemonstracao(txtCodigo.getText(), txtDescricao.getText());
                    } catch (Exception exc) {
                        txtCodigo.setText("");
                        txtDescricao.setText("");
                        JOptionPane.showMessageDialog(CriarDemonstracaoUI.this,
                                "Dados inválidos. Introduza novamente.", "Criar Demonstração", JOptionPane.ERROR_MESSAGE);
                    }
                    if (controller.registaDemo()) {
                        controller.transitaEstado();
                        JOptionPane.showMessageDialog(CriarDemonstracaoUI.this, "Demonstração criada com sucesso!",
                                "Criar Demonstração", JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(CriarDemonstracaoUI.this, "Demonstração não foi criada com sucesso!",
                                "Criar Demonstração", JOptionPane.ERROR_MESSAGE);
                        dispose();
                    }
                } else {
                    JOptionPane.showMessageDialog(CriarDemonstracaoUI.this, "Não é possível criar demonstrações para esta exposição",
                            "Criar Demonstração", JOptionPane.ERROR_MESSAGE);
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
                JOptionPane.showMessageDialog(CriarDemonstracaoUI.this,
                        "Demonstração não foi criada com sucesso!", "Criar Demonstração", JOptionPane.ERROR_MESSAGE);
                dispose();
            }
        });
        return b;
    }

    private JButton criarBotaoSecAdicionar() {
        JButton b = new JButton("Adicionar Recurso");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Recurso r = (Recurso) cb.getSelectedItem();
                if (r != null) {
                    controller.selectRecurso(r);
                    if (controller.registaRecurso()) {
                        JOptionPane.showMessageDialog(CriarDemonstracaoUI.this, "Recurso foi adicionado com sucesso!",
                                "Adicionar Recurso", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(CriarDemonstracaoUI.this, "Recurso não foi adicionado com sucesso!",
                                "Adicionar Recurso", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        return b;
    }

}
