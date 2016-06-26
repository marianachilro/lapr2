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
import lapr.project.controller.RegistarCandidaturaExposicaoController;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.Keyword;
import lapr.project.model.Produto;

/**
 *
 * @author Rita
 */
public class RegistarCandExpoUI extends JDialog {

    private JFrame janelaPai;
    private String emailRep;
    private CentroExposicoes ce;
    private JList jLista;
    private ModeloListaExpos mLista;
    private RegistarCandidaturaExposicaoController controller;
    private Exposicao expo;
    private CandidaturaExposicao cand;
    private Produto prod;
    private Keyword k;
    private List<Demonstracao> lDemonsExpo;
    private Demonstracao demo;
    private JComboBox cb = new JComboBox();
    private JLabel lblNomeEmpresa, lblMorada, lblTelemovel,
            lblArea, lblProdutos, lblKeyword, lblDemonstracoes, lblConvites;
    private JTextField txtNomeEmpresa, txtMorada, txtTelemovel, txtArea, txtProdutos, txtKeyword, txtConvites;
    private JButton btSecAdicionarDemo, btSecNovoProduto, btSecNovaKeyword;

    public RegistarCandExpoUI(JFrame janelaPai, CentroExposicoes ce, String emailRep) {
        super(janelaPai, "Nova Candidatura", true);
        this.janelaPai = janelaPai;
        this.emailRep = emailRep;
        this.ce = ce;
        this.controller = new RegistarCandidaturaExposicaoController(emailRep, ce);
        this.jLista = new JList();
        this.mLista = new ModeloListaExpos(controller.getListaExposicoes());
        jLista.setModel(mLista);
        jLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

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
        p.setLayout(new GridLayout(1, 2));
        JLabel lbl = new JLabel("Escolha uma Exposição:");
        JScrollPane sc = new JScrollPane(jLista);
        jLista.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    expo = (Exposicao) jLista.getSelectedValue();
                    controller.selectExposicao(expo);
                    controller.getListCandidaturas();
                    cand = controller.novaCandidatura();
                    controller.getListaProdutos();
                    controller.getListaKeywords();
                    controller.getListaDemonstracoesCandidatura();
                    lDemonsExpo = controller.getListaDemonstracoesExposicao();
                    cb = new JComboBox(lDemonsExpo.toArray());
                }
            }
        });
        p.add(lbl);
        p.add(sc);
        return p;
    }

    private JPanel criarPainelInfo1() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(5, 2));
        lblNomeEmpresa = new JLabel("Nome de Empresa:");
        txtNomeEmpresa = new JTextField(10);
        p.add(lblNomeEmpresa);
        p.add(txtNomeEmpresa);
        lblMorada = new JLabel("Morada:");
        txtMorada = new JTextField(10);
        p.add(lblMorada);
        p.add(txtMorada);
        lblTelemovel = new JLabel("Telemóvel:");
        txtTelemovel = new JTextField(10);
        p.add(lblTelemovel);
        p.add(txtTelemovel);
        lblArea = new JLabel("Área:");
        txtArea = new JTextField(10);
        p.add(lblArea);
        p.add(txtArea);
        lblConvites = new JLabel("Convites:");
        txtConvites = new JTextField(10);
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
        p.add(cb);
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

                prod = controller.novoProduto();
                try {
                    controller.setNome(txtProdutos.getText().trim());
                    if (!prod.getNome().equals("") && controller.registaProduto()) {
                        JOptionPane.showMessageDialog(RegistarCandExpoUI.this, "Produto adicionado com sucesso.",
                                "Novo Produto", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(RegistarCandExpoUI.this, "Produto não foi adicionado com sucesso.",
                                "Adicionar Produto", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (IllegalArgumentException exc) {
                    txtProdutos.setText("");
                    JOptionPane.showMessageDialog(RegistarCandExpoUI.this, "Produto não foi adicionado com sucesso.", "Novo Produto", JOptionPane.ERROR_MESSAGE);
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
                k = controller.novaKeyword(txtKeyword.getText().trim());
                if (!k.getPalavra().equals("") && controller.registaKeyword()) {
                    JOptionPane.showMessageDialog(RegistarCandExpoUI.this, "Keyword adicionada com sucesso.",
                            "Nova Keyword", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(RegistarCandExpoUI.this,
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
                demo = (Demonstracao) cb.getSelectedItem();
                if (demo != null) {
                    controller.selectDemonstracao(demo);
                    if (controller.registaDemonstracao()) {
                        JOptionPane.showMessageDialog(RegistarCandExpoUI.this, "Demonstração adicionada com sucesso.",
                                "Adicionar Demonstração", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(RegistarCandExpoUI.this, "Demonstração não foi adicionada.",
                                "Adicionar Demonstração", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(RegistarCandExpoUI.this, "Selecione uma demonstração", "Nova Candidatura", JOptionPane.WARNING_MESSAGE);
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
                boolean b = false;
                try {
                    if (expo != null) {
                        controller.setDados(emailRep, txtNomeEmpresa.getText(), txtMorada.getText(), Integer.parseInt(txtTelemovel.getText()), Float.parseFloat(txtArea.getText()), Integer.parseInt(txtConvites.getText()));
                        if (controller.registaCandidatura()) {
                            b = false;
                            controller.transitaEstado();
                            JOptionPane.showMessageDialog(RegistarCandExpoUI.this, "Candidatura criada com sucesso.", "Nova Candidatura", JOptionPane.INFORMATION_MESSAGE);
                            dispose();
                        } else {
                            b = false;
                            JOptionPane.showMessageDialog(RegistarCandExpoUI.this, "Candidatura não foi criada.", "Nova Candidatura", JOptionPane.ERROR_MESSAGE);
                            dispose();
                        }

                    } else {
                        JOptionPane.showMessageDialog(RegistarCandExpoUI.this, "Seleciona uma exposição",
                                "Nova Candidatura", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (Exception exc) {
                    JOptionPane.showMessageDialog(RegistarCandExpoUI.this, "Dados introduzidos inválidos", "Nova Candidatura", JOptionPane.ERROR_MESSAGE);
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
                dispose();
                JOptionPane.showMessageDialog(janelaPai, "Candidatura não registada!", "Nova Candidatura",
                        JOptionPane.ERROR_MESSAGE);
            }
        });
        return btCanc;
    }
}
