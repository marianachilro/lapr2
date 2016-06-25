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
import java.util.ArrayList;
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
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Conflito;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.FAE;
import lapr.project.model.ListaOrganizadores;
import lapr.project.model.Local;
import lapr.project.model.MecanismoConflitoIdentidadeNumerica;
import lapr.project.model.Organizador;
import lapr.project.model.TipoConflito;
import lapr.project.model.Utilizador;
import lapr.project.utils.Data;

/**
 *
 * @author marianachilro
 */
public class AtualizarConflitoInteresseUI extends JDialog {

    private JButton botaoCriarConflito;

    private JButton botaoRemoverConflito;

    private JButton botaoAlterarConflito;

    private List<Conflito> listaConflitos;

    private JComboBox comboBoxConflitos;

    private final AtualizarConflitoController controller;

    private final CentroExposicoes centro;

    private final Utilizador utilizador;

    private final Exposicao exposicao;

    private Conflito conflito;

    public AtualizarConflitoInteresseUI(AtualizarConflitoController controller) {

        this.controller = controller;
        this.centro = controller.getCentro();
        this.exposicao = controller.getExposicao();
        this.listaConflitos = controller.getConflitosFAE();
        this.utilizador = controller.getUtilizador();

        setModal(true);
        setLayout(new BorderLayout());

        add(criarPainelInfo());

        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        pack();
        setResizable(true);
        setVisible(true);
    }

//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//
//                CentroExposicoes ce = new CentroExposicoes();
//
//                TipoConflito tipo = new TipoConflito("Identidade Numérica",
//                        "A mesma identidade exerce funções de identidades/atores diferentes. "
//                        + "(e.g. o FAE é o Representante da Candidatura)");
//                MecanismoConflitoIdentidadeNumerica m = new MecanismoConflitoIdentidadeNumerica();
//                tipo.getListaMecanismos().add(m);
//                ce.getRegistoTipoConflitos().getListaTipoConflitos().add(tipo);
//
//                TipoConflito tipo1 = new TipoConflito("dkjlbwdljsB",
//                        "KLDhc lkdjcbasb)");
//                ce.getRegistoTipoConflitos().getListaTipoConflitos().add(tipo1);
//
//                Utilizador utill = new Utilizador(1, "evbddba", "evfa1", "blavsba@centro.pt", "M-aay1", "keyw1");
//                ce.getRegistoUtilizadores().addUtilizador(utill);
//                Organizador o = new Organizador(utill);
//                Utilizador utilll = new Utilizador(1, "evbdsddba", "edvfa1", "blavdsba@centro.pt", "M-aday1", "keywo1");
//                ce.getRegistoUtilizadores().addUtilizador(utilll);
//                Organizador o1 = new Organizador(utilll);
//                List<Organizador> listaOrgs = new ArrayList<>();
//                listaOrgs.add(o);
//                listaOrgs.add(o1);
//                Exposicao expo = new Exposicao("titulo", "descrição", new Data(2017, 1, 1, 1, 1, 1), new Data(2017, 2, 1, 1, 1, 4), new Local("nome"), new Data(2017, 3, 1, 1, 1, 1),
//                        new Data(2017, 4, 1, 1, 1, 1), new Data(2017, 5, 1, 1, 1, 1), new Data(2017, 6, 1, 1, 1, 1));
//                expo.setListaOrganizadores(new ListaOrganizadores(listaOrgs));
//                ce.getRegistoExposicoes().addExposicao(expo);
//                boolean b = expo.valida();
//                expo.getEstado().setCriada();
//                expo.getEstado().setDemoSemFae();
//                expo.getEstado().setCompleta();
//                expo.getEstado().setExposicaoCandidaturasAbertas();
//                expo.getEstado().setExposicaoCandidaturasFechadas();
//                expo.getEstado().setExposicaoConflitosDetetados();
//
//                CandidaturaExposicao c = new CandidaturaExposicao();
//                c.setEmailRep("email@centro.pt");
//                expo.getListaCandidaturas().addCandidatura(c);
//                CandidaturaExposicao c1 = new CandidaturaExposicao();
//                c1.setEmailRep("email1@centro.pt");
//                expo.getListaCandidaturas().addCandidatura(c1);
//                CandidaturaExposicao c2 = new CandidaturaExposicao();
//                c2.setEmailRep("email2@centro.pt");
//                expo.getListaCandidaturas().addCandidatura(c2);
//
//                Demonstracao d = new Demonstracao("codigo1", "descricao");
//                d.setNumeroInteressados(2);
//                expo.getListaDemonstracoes().addDemonstracao(d);
//                d.getEstado().setCriada();
//                Demonstracao d1 = new Demonstracao("coddigo1", "descricao1");
//                d1.setNumeroInteressados(1);
//                expo.getListaDemonstracoes().addDemonstracao(d1);
//                d1.getEstado().setCriada();
//
//                Utilizador util = new Utilizador(1, "eva", "eva1", "email@centro.pt", "M-ay1", "key1");
//                ce.getRegistoUtilizadores().addUtilizador(util);
//                FAE f = new FAE(util);
//                expo.getListaFAES().addFae(f);
//                Conflito conf = new Conflito(f, c);
//                conf.setTipo(tipo);
//                expo.getListaConflitos().addConflito(conf);
//                AtualizarConflitoController controller = new AtualizarConflitoController(ce, util);
//                controller.selecionaExpo(expo);
//
//                new AtualizarConflitoInteresseUI(controller).setVisible(true);
//            }
//        });
//    }

    public JPanel criarPainelInfo() {
        JPanel p = new JPanel(new BorderLayout());
        p.setBorder(new EmptyBorder(10, 10, 10, 10));
        p.add(criarPainelOutput(), BorderLayout.CENTER);
        return p;
    }

    public JPanel criarPainelOutput() {
        JPanel p = new JPanel(new GridLayout(6, 2, 3, 3));
        p.setBorder(new EmptyBorder(10, 10, 10, 10));

        if (!listaConflitos.isEmpty()) {
            p.add(criarPainelConflitos());
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
        Conflito[] array = new Conflito[listaConflitos.size() + 1];
            int i = 1;
            for (Conflito c : listaConflitos) {
                array[i] = c;
                i++;
            }
        this.comboBoxConflitos = new JComboBox<>(array);
        comboBoxConflitos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Conflito conf = (Conflito) comboBoxConflitos.getSelectedItem();
                if (conf != null) {
                    controller.selecionaConflito(conf);
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
                if (conflito != null) {
                    String string = String.format("Tipo: %s%nCandidatura: %s", conflito.getTipo().toString(), conflito.getCandidaturas().toString());
                    JOptionPane.showMessageDialog(AtualizarConflitoInteresseUI.this, string);
                }else{
                    JOptionPane.showMessageDialog(AtualizarConflitoInteresseUI.this, "Selecione o Conflito cuja descrição pretende consultar!",
                            "Seleção Obrigatória", JOptionPane.ERROR_MESSAGE);
 
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
                if (conflito != null) {
                    int i = JOptionPane.showConfirmDialog(AtualizarConflitoInteresseUI.this,
                            "Tem a certeza que pretende remover o Conflito?", "Remover Conflito", JOptionPane.YES_NO_OPTION);
                    if (i == JOptionPane.YES_OPTION) {
                        listaConflitos.remove(conflito);
                        comboBoxConflitos.removeItem(conflito);
                    }
                } else {
                    JOptionPane.showMessageDialog(AtualizarConflitoInteresseUI.this, "Selecione o Conflito que pretende remover!",
                            "Seleção Obrigatória", JOptionPane.ERROR_MESSAGE); }
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
                if (conflito != null) {
                    controller.selecionaConflito(conflito);
                    new JanelaAlterarConflitoInteresse(controller).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(AtualizarConflitoInteresseUI.this, "Selecione o Conflito que pretende alterar!",
                            "Seleção Obrigatória", JOptionPane.ERROR_MESSAGE); }

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
