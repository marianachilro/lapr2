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
import java.awt.event.KeyEvent;
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
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import lapr.project.controller.AlterarCandidaturaController;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.Keyword;

/**
 *
 * @author miniondevil
 */
public class AlterarCandidaturaUI extends JDialog {

    private AlterarCandidaturaController controller;
    private JList jLista;
    private ModeloListaExpos mLista;
    private Demonstracao demo;
    private JComboBox cbCand, cbDemo;
    private JLabel lblNomeEmpresa, lblMorada, lblTelemovel,
            lblArea, lblProdutos, lblKeyword, lblDemonstracoes, lblConvites;
    private JTextField txtNomeEmpresa, txtMorada, txtTelemovel, txtArea, txtProdutos, txtKeyword, txtConvites;
    private JButton btSecAdicionarDemo, btSecNovoProduto, btSecNovaKeyword;

    public AlterarCandidaturaUI(JFrame janelaPai, CentroExposicoes ce, String emailRep) {
        super(janelaPai, "Nova Candidatura", true);
        this.controller = new AlterarCandidaturaController(ce, emailRep);
        this.jLista = new JList();
        this.mLista = new ModeloListaExpos(controller.getListaExposicoes());
        jLista.setModel(mLista);
        jLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        txtNomeEmpresa = new JTextField();
        txtMorada = new JTextField();
        txtTelemovel = new JTextField();
        txtArea = new JTextField();
        txtProdutos = new JTextField();
        txtKeyword = new JTextField();
        txtConvites = new JTextField();
        cbDemo = new JComboBox();
        criarComponentes();
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        pack();
        setResizable(false);
        setLocationRelativeTo(janelaPai);
        setVisible(true);
    }

    public void criarComponentes() {
        setLayout(new BorderLayout());
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.add(criarPainelInfo1(), BorderLayout.NORTH);
        p.add(criarPainelInfo2(), BorderLayout.SOUTH);
        add(criarPainelExposicao(), BorderLayout.NORTH);
        add(p, BorderLayout.CENTER);
        add(criarPainelBotoes(), BorderLayout.SOUTH);
    }

    private JPanel criarPainelExposicao() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(2, 2));
        JLabel lbl = new JLabel("Escolha uma Exposição:");
        JLabel lbl2 = new JLabel("Escolha uma candidatura:");
        JScrollPane sc = new JScrollPane(jLista);
        cbCand = new JComboBox();
        jLista.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    List<CandidaturaExposicao> lc = controller.getListaCandidaturasRep((Exposicao) jLista.getSelectedValue());
                    if (lc.isEmpty()) {
                        int i = JOptionPane.showConfirmDialog(AlterarCandidaturaUI.this,
                                "Não existem candidaturas disponíveis. Deseja selecionar outra exposição?", "Alterar Candidatura", JOptionPane.YES_NO_OPTION);
                        if (i == JOptionPane.YES_OPTION) {
                            jLista.clearSelection();
                        } else {
                            dispose();
                        }
                    } else {
                        cbCand.setModel(new DefaultComboBoxModel(lc.toArray()));
                    }
                }
            }
        });
        cbCand.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clonarCandidatura((CandidaturaExposicao) cbCand.getSelectedItem());
                txtNomeEmpresa.setText(controller.getNomeEmpresa());
                txtMorada.setText(controller.getMorada());
                txtTelemovel.setText(controller.getTelemovel());
                txtArea.setText(controller.getArea());
                txtConvites.setText(controller.getConvites());
            }
        });
        p.add(lbl);
        p.add(sc);
        p.add(lbl2);
        p.add(cbCand);
        return p;
    }

    private JPanel criarPainelInfo1() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(5, 2));
        lblNomeEmpresa = new JLabel("Nome de Empresa:");
        p.add(lblNomeEmpresa);
        p.add(txtNomeEmpresa);
        lblMorada = new JLabel("Morada:");
        p.add(lblMorada);
        p.add(txtMorada);
        lblTelemovel = new JLabel("Telemóvel:");
        p.add(lblTelemovel);
        p.add(txtTelemovel);
        lblArea = new JLabel("Área:");
        p.add(lblArea);
        p.add(txtArea);
        lblConvites = new JLabel("Convites:");
        p.add(lblConvites);
        p.add(txtConvites);
        return p;
    }

    private JPanel criarPainelInfo2() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(3, 4));
        lblProdutos = new JLabel("Produtos:");
        txtProdutos = new JTextField(20);
        btSecNovoProduto = criarBotaoNovoProduto();
        p.add(lblProdutos);
        p.add(new JScrollPane(txtProdutos));
        p.add(btSecNovoProduto);
        lblKeyword = new JLabel("Keyword:");
        txtKeyword = new JTextField(20);
        btSecNovaKeyword = criarBotaoNovaKeyword();
        p.add(lblKeyword);
        p.add(txtKeyword);
        p.add(btSecNovaKeyword);
        lblDemonstracoes = new JLabel("Demonstração:");
        btSecAdicionarDemo = criarBotaoAddDemo();
        p.add(lblDemonstracoes);
        p.add(cbDemo);
        p.add(btSecAdicionarDemo);
        return p;
    }

    private JPanel criarPainelBotoes() {
        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        p1.add(criarBotaoGuardar());
        p1.add(criarBotaoCancelar());
        return p1;
    }

    private JButton criarBotaoNovoProduto() {
        JButton btP = new JButton("Novo Produto");
        btP.setMnemonic(KeyEvent.VK_N);
        btP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.criaProduto();
                try {
                    controller.setProduto(txtProdutos.getText().trim());
                } catch (IllegalArgumentException exc) {
                    txtProdutos.setText("");
                    JOptionPane.showMessageDialog(AlterarCandidaturaUI.this, "Produto não foi adicionado com sucesso.",
                            "Novo Produto", JOptionPane.ERROR_MESSAGE);
                }
                if (controller.addProduto() && !txtProdutos.getText().equals("")) {
                    JOptionPane.showMessageDialog(AlterarCandidaturaUI.this, "Produto adicionado com sucesso",
                            "Novo Produto", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(AlterarCandidaturaUI.this, "Produto não foi adicionado com sucesso",
                            "Novo Produto", JOptionPane.ERROR_MESSAGE);
                }
                txtProdutos.setText("");
            }
        });
        return btP;
    }

    private JButton criarBotaoNovaKeyword() {
        JButton b = new JButton("Nova Keyword");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Keyword k = controller.novaKeyWord(txtKeyword.getText().trim());
                if (!k.getPalavra().equals("") && controller.registaKeyword()) {
                    JOptionPane.showMessageDialog(AlterarCandidaturaUI.this, "Keyword adicionada com sucesso.",
                            "Nova Keyword", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(AlterarCandidaturaUI.this,
                            "Keyword não foi adicionada com sucesso. Verifique se a keyword introduza já existe, ou se o limite das mesmas foi atingido",
                            "Adicionar Produto", JOptionPane.ERROR_MESSAGE);
                }
                txtKeyword.setText("");
            }
        });
        return b;
    }

    private JButton criarBotaoAddDemo() {
        JButton btA = new JButton("Adicionar Demonstração");
        btA.setMnemonic(KeyEvent.VK_A);
        btA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                demo = (Demonstracao) cbDemo.getSelectedItem();
                if (demo != null) {
                    controller.selectDemo(demo);
                    if (controller.registaDemo()) {
                        JOptionPane.showMessageDialog(AlterarCandidaturaUI.this, "Demonstração adicionada com sucesso.",
                                "Adicionar Demonstração", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(AlterarCandidaturaUI.this, "Demonstração não foi adicionada.",
                                "Adicionar Demonstração", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(AlterarCandidaturaUI.this,"Selecione uma demonstração.",
                            "Adicionar demonstração", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        return btA;
    }

    private JButton criarBotaoGuardar() {
        JButton btG = new JButton("Guardar");
        btG.setMnemonic(KeyEvent.VK_G);
        btG.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    controller.setDados(txtNomeEmpresa.getText(), txtMorada.getText(), Integer.parseInt(txtTelemovel.getText()), Float.parseFloat(txtArea.getText()), Integer.parseInt(txtConvites.getText()));
                    if (controller.alterarCandidatura()) {
                        JOptionPane.showMessageDialog(AlterarCandidaturaUI.this, "Candidatura criada com sucesso.", "Nova Candidatura", JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(AlterarCandidaturaUI.this, "Candidatura não foi criada.", "Nova Candidatura", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception exx) {
                    JOptionPane.showMessageDialog(AlterarCandidaturaUI.this, exx.getMessage(), "Aviso", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        return btG;
    }

    private JButton criarBotaoCancelar() {
        JButton btCanc = new JButton("Cancelar");
        btCanc.setMnemonic(KeyEvent.VK_C);
        btCanc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(AlterarCandidaturaUI.this, "Candidatura não registada!", "Nova Candidatura",
                        JOptionPane.ERROR_MESSAGE);
                dispose();
            }
        });
        return btCanc;
    }

}
