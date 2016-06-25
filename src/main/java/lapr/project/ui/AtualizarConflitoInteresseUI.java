/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import lapr.project.controller.AtualizarConflitoController;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Conflito;
import lapr.project.model.Utilizador;

/**
 *
 * @author marianachilro
 */
public class AtualizarConflitoInteresseUI extends JFrame {

    private JButton botaoCriarConflito;

    private JButton botaoRemoverConflito;

    private JButton botaoAlterarConflito;

    private List<Conflito> listaConflitos;

    private JComboBox comboBoxConflitos;

    private final AtualizarConflitoController controller;

    private final CentroExposicoes centro;

    private final Utilizador utilizador;

    private Conflito conflito;

    public AtualizarConflitoInteresseUI(CentroExposicoes centro, Utilizador utilizador 
        , AtualizarConflitoController controller) {

        this.centro = centro;
        this.utilizador = utilizador;
        this.controller = controller;
        setLayout(new BorderLayout());

        add(criarPainelInfo());

        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        pack();
        setResizable(true);
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
                Utilizador util = new Utilizador();
                AtualizarConflitoController controller = new AtualizarConflitoController(ce, util);
                
                new AtualizarConflitoInteresseUI(ce, util, controller).setVisible(true);
            }
        });
    }

    public JPanel criarPainelInfo() {
        JPanel p = new JPanel(new BorderLayout());
        p.setBorder(new EmptyBorder(10, 10, 10, 10));
        p.add(criarPainelOutput(), BorderLayout.CENTER);
        return p;
    }

    public JPanel criarPainelOutput() {
        JPanel p = new JPanel(new GridLayout(7, 2, 3, 3));
        p.setBorder(new EmptyBorder(10, 10, 10, 10));

        if (!listaConflitos.isEmpty()) {
            p.add(criarBotaoVerDescricao());
            p.add(criarBotaoRemoverConflito());
            p.add(criarBotaoAlterarConflito());
        } else {
            JOptionPane.showMessageDialog(AtualizarConflitoInteresseUI.this, "Não existem Conflitos!", "ERRO", ERROR_MESSAGE);
            dispose();
        }
        p.add(criarBotaoCriarConflito());

        p.add(criarBotaoCancelar());
        pack();
        return p;
    }

    public JPanel criarPainelConflitos() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1, 2));
        JLabel lbl = new JLabel("Selecione um Conflito:");
        listaConflitos = controller.getConflitosFAE();
        this.comboBoxConflitos = new JComboBox<>(listaConflitos.toArray());
        comboBoxConflitos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Conflito conf = (Conflito) comboBoxConflitos.getSelectedItem();
                if (conf != null) {
                    conflito = conf;
                }
            }
        });
        p.add(lbl);
        p.add(comboBoxConflitos);
        return p;
    }

    public JButton criarBotaoVerDescricao() {
        JButton btn = new JButton("Ver Descrição");
        btn.setToolTipText("Ver descrição do Conflito selecionado");
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Conflito conf = (Conflito) comboBoxConflitos.getSelectedItem();
                if (conf != null) {
                    String string = String.format("Tipo: %s%nCandidatura: %s", conflito.getTipo().toString(), conflito.getCandidaturas().toString());
                    JOptionPane.showMessageDialog(AtualizarConflitoInteresseUI.this, string);
                }
            }
        });
        return btn;
    }

    public JButton criarBotaoRemoverConflito() {
        JButton btn = new JButton("Remover Conflito");
        btn.setToolTipText("Remove o Conflito selecionado");
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Conflito conf = (Conflito) comboBoxConflitos.getSelectedItem();
                if (conf != null) {
                    listaConflitos.remove(conf);
                }
            }
        });
        return btn;
    }

    public JButton criarBotaoAlterarConflito() {
        JButton btn = new JButton("Alterar Conflito");
        btn.setToolTipText("Abre Janela para a Alteração do Conflito selecionado");
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Conflito conflito = (Conflito) comboBoxConflitos.getSelectedItem();
                if (conflito != null) {
                    new JanelaAlterarConflitoInteresse(controller, centro, conflito).setVisible(true);
                }

            }
        });
        return btn;
    }

    public JButton criarBotaoCriarConflito() {
        JButton btn = new JButton("Criar Conflito");
        btn.setToolTipText("Abre Janela para a Criação de um Conflito");
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new JanelaCriarConflitoInteresse(controller, centro).setVisible(true);

            }
        });
        return btn;
    }

    public JButton criarBotaoCancelar() {
        JButton btn = new JButton("Cancelar");
        btn.setToolTipText("Volta para a página anterior");
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        return btn;
    }

}
