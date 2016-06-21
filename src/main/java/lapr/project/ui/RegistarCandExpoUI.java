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
import java.util.ArrayList;
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
    private JComboBox cb;
    private JLabel lblNomeEmpresa, lblMorada, lblTelemovel,
            lblArea, lblProdutos, lblKeyword, lblDemonstracoes, lblConvites;
    private JTextField txtNomeEmpresa, txtMorada, txtTelemovel, txtArea, txtProdutos, txtKeyword, txtConvites;
    private JButton btSecAdicionarDemo, btSecNovoProduto, btSecNovaKeyword;
    
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
                String email=null;
                new RegistarCandExpoUI(null, ce, email).setVisible(true);
            }
        });
    }

    public RegistarCandExpoUI(JFrame janelaPai, CentroExposicoes ce, String emailRep) {
        super(janelaPai, "Nova Candidatura", true);
        this.janelaPai = janelaPai;
        this.emailRep = emailRep;
        this.ce = ce;
        this.controller = new RegistarCandidaturaExposicaoController(emailRep, ce);
        criarComponentes();
        this.jLista = new JList();
        List<Exposicao> le = new ArrayList<>();
        le.add(new Exposicao());
        this.mLista = new ModeloListaExpos(le);
        jLista.setModel(mLista);
        jLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lDemonsExpo = controller.getListaDemonstracoesExposicao();
        controller.getListCandidaturas();
        controller.getListaProdutos();
        controller.getListaKeywords();
        controller.getListaDemonstracoesCandidatura();
        
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
        cb = new JComboBox(lDemonsExpo.toArray());
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
                boolean b = false;
                prod = controller.novoProduto();
                try {
                    controller.setNome(txtProdutos.getText().trim());
                } catch (IllegalArgumentException exc) {
                    b = true;
                    txtProdutos.setText("");
                    JOptionPane.showMessageDialog(RegistarCandExpoUI.this, "Produto não foi adicionado com sucesso.", "Novo Produto", JOptionPane.ERROR_MESSAGE);
                }
                if (b == false && controller.registaProduto()) {
                    JOptionPane.showMessageDialog(RegistarCandExpoUI.this, "Produto adicionado com sucesso.",
                            "Novo Produto", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(RegistarCandExpoUI.this, "Produto não foi adicionado com sucesso.",
                            "Adicionar Produto", JOptionPane.ERROR_MESSAGE);
                }
                b = false;
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
                k = controller.novaKeyword(txtKeyword.getText());
                if (controller.registaKeyword()) {
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
                if(demo != null) {
                    controller.selectDemonstracao(demo);
                }
                if (controller.registaDemonstracao()) {
                    JOptionPane.showMessageDialog(RegistarCandExpoUI.this, "Demonstração adicionada com sucesso.",
                            "Adicionar Demonstração", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(RegistarCandExpoUI.this, "Demonstração não foi adicionada.",
                            "Adicionar Demonstração", JOptionPane.ERROR_MESSAGE);
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
                expo = (Exposicao) jLista.getSelectedValue();
                if(expo != null) {
                    controller.selectExposicao(expo);
                    cand = controller.novaCandidatura();
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
