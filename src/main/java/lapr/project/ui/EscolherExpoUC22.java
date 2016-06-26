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
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import lapr.project.controller.ConfirmarRealizacaoDemonstracaoController;
import lapr.project.controller.GerarEstatisticasCandidaturaController;
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
public class EscolherExpoUC22 extends JDialog{
    private JFrame janelaPai;

    private CentroExposicoes centro;

    private Utilizador utilizador;

    private Exposicao exposicao;

    private GerarEstatisticasCandidaturaController controller;

    private List<Exposicao> listaExposOrganizador;

    private JComboBox comboBoxExpos;
    
    public EscolherExpoUC22(JFrame janelaPai, CentroExposicoes centro, Utilizador utilizador) {
        this.janelaPai = janelaPai;
        this.centro = centro;
        this.utilizador = utilizador;
        this.controller = new GerarEstatisticasCandidaturaController(centro);
        this.listaExposOrganizador = controller.getExposicoesOrganizadorEstadoCandidaturasAvaliadas(utilizador.getUsername(), centro.getRegistoUtilizadores());

        setModal(true);
        setLayout(new BorderLayout());

        add(criarPainelInfo());

        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        pack();
        setResizable(true);
        setLocationRelativeTo(janelaPai);
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

                TipoConflito tipo = new TipoConflito("Identidade Numérica",
                        "A mesma identidade exerce funções de identidades/atores diferentes. "
                        + "(e.g. o FAE é o Representante da Candidatura)");
                MecanismoConflitoIdentidadeNumerica m = new MecanismoConflitoIdentidadeNumerica();
                tipo.getListaMecanismos().add(m);
                ce.getRegistoTipoConflitos().getListaTipoConflitos().add(tipo);

                TipoConflito tipo1 = new TipoConflito("dkjlbwdljsB",
                        "KLDhc lkdjcbasb)");
                ce.getRegistoTipoConflitos().getListaTipoConflitos().add(tipo1);

                Utilizador utill = new Utilizador(1, "evbddba", "evfa1", "blavsba@centro.pt", "M-aay1", "keyw1");
                ce.getRegistoUtilizadores().addUtilizador(utill);
                Organizador o = new Organizador(utill);
                Utilizador utilll = new Utilizador(1, "evbdsddba", "edvfa1", "blavdsba@centro.pt", "M-aday1", "keywo1");
                ce.getRegistoUtilizadores().addUtilizador(utilll);
                Organizador o1 = new Organizador(utilll);
                List<Organizador> listaOrgs = new ArrayList<>();
                listaOrgs.add(o);
                listaOrgs.add(o1);
                Exposicao expo = new Exposicao("titulo", "descrição", new Data(2017, 1, 1, 1, 1, 1), new Data(2017, 2, 1, 1, 1, 4), new Local("nome"), new Data(2017, 3, 1, 1, 1, 1),
                        new Data(2017, 4, 1, 1, 1, 1), new Data(2017, 5, 1, 1, 1, 1), new Data(2017, 6, 1, 1, 1, 1));
                expo.setListaOrganizadores(new ListaOrganizadores(listaOrgs));
                ce.getRegistoExposicoes().addExposicao(expo);
                boolean b = expo.valida();
                expo.getEstado().setCriada();
                expo.getEstado().setDemoSemFae();
                expo.getEstado().setCompleta();
                expo.getEstado().setExposicaoCandidaturasAbertas();
                expo.getEstado().setExposicaoCandidaturasFechadas();
                expo.getEstado().setExposicaoConflitosDetetados();

                Exposicao expo1 = new Exposicao("titulo1", "descriçã1o", new Data(2017, 1, 1, 1, 1, 2), new Data(2017, 2, 1, 1, 1, 4), new Local("nome"), new Data(2017, 3, 1, 1, 1, 1),
                        new Data(2017, 4, 1, 1, 1, 1), new Data(2017, 5, 1, 1, 1, 1), new Data(2017, 6, 1, 1, 1, 1));
                expo1.setListaOrganizadores(new ListaOrganizadores(listaOrgs));
                ce.getRegistoExposicoes().addExposicao(expo1);
                boolean bo = expo1.valida();
                expo1.getEstado().setCriada();
                expo1.getEstado().setDemoSemFae();
                expo1.getEstado().setCompleta();
                expo1.getEstado().setExposicaoCandidaturasAbertas();

                CandidaturaExposicao c = new CandidaturaExposicao();
                c.setEmailRep("email@centro.pt");
                c.getEstado().setEmSubmissao();
                c.getEstado().setAlterada();
                c.getEstado().setCompleta();
                c.getEstado().setConflitosDetetados();
                c.getEstado().setConflitosAlterados();
                c.getEstado().setEmAvaliacao();
                c.getEstado().setAvaliada();
                expo.getListaCandidaturas().addCandidatura(c);
                CandidaturaExposicao c1 = new CandidaturaExposicao();
                c1.setEmailRep("email1@centro.pt");
                c1.getEstado().setEmSubmissao();
                c1.getEstado().setAlterada();
                c1.getEstado().setCompleta();
                c1.getEstado().setConflitosDetetados();
                c1.getEstado().setConflitosAlterados();
                c1.getEstado().setEmAvaliacao();
                c1.getEstado().setAvaliada();
                expo.getListaCandidaturas().addCandidatura(c1);
                CandidaturaExposicao c2 = new CandidaturaExposicao();
                c2.setEmailRep("email2@centro.pt");
                c2.getEstado().setEmSubmissao();
                c2.getEstado().setAlterada();
                c2.getEstado().setCompleta();
                c2.getEstado().setConflitosDetetados();
                c2.getEstado().setConflitosAlterados();
                c2.getEstado().setEmAvaliacao();
                c2.getEstado().setAvaliada();
                expo.getListaCandidaturas().addCandidatura(c2);
                
                expo.getEstado().setExposicaoConflitosAtualizados();
                expo.getEstado().setExposicaoCandidaturasAtribuidas();
                expo.getEstado().setExposicaoCandidaturasAvaliadas();

                Demonstracao d = new Demonstracao("codigo1", "descricao");
                d.setNumeroInteressados(2);
                expo.getListaDemonstracoes().addDemonstracao(d);
                d.getEstado().setCriada();
                Demonstracao d1 = new Demonstracao("coddigo1", "descricao1");
                d1.setNumeroInteressados(1);
                expo.getListaDemonstracoes().addDemonstracao(d1);
                d1.getEstado().setCriada();

                Utilizador util = new Utilizador(1, "eva", "eva1", "email@centro.pt", "M-ay1", "key1");
                ce.getRegistoUtilizadores().addUtilizador(util);
                FAE f = new FAE(util);
                expo.getListaFAES().addFae(f);
                Conflito conf = new Conflito(f, c);
                conf.setTipo(tipo);
                expo.getListaConflitos().addConflito(conf);

                new EscolherExpoUC22(null, ce, utill).setVisible(true);
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
        JPanel p = new JPanel(new GridLayout(3, 2, 3, 3));
        p.setBorder(new EmptyBorder(10, 10, 10, 10));
        if (!listaExposOrganizador.isEmpty()) {
            p.add(criarPainelExposicoes());
            p.add(criarBotaoNext());
        } else {
            JOptionPane.showMessageDialog(EscolherExpoUC22.this, "Não existem Exposições disponívies!",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
        p.add(criarBotaoCancelar());
        pack();
        return p;
    }

    public JPanel criarPainelExposicoes() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1, 2));
        JLabel lbl = new JLabel("Selecione uma Exposicao:");

        Exposicao[] array = new Exposicao[listaExposOrganizador.size() + 1];
        int i = 1;
        for (Exposicao e : listaExposOrganizador) {
            array[i] = e;
            i++;
        }
        this.comboBoxExpos = new JComboBox<>(array);
        comboBoxExpos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Exposicao expo = (Exposicao) comboBoxExpos.getSelectedItem();
                if (expo != null) {
                    controller.seleciona(expo);
                    exposicao = expo;
                }

            }

        });
        p.add(lbl);
        p.add(comboBoxExpos);

        return p;

    }

    public JButton criarBotaoNext() {
        JButton btn = new JButton("Next");
        btn.setToolTipText("Avaça para a próxima janela");
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                GerarEstatisticasCandidaturaUI gerarEstatisticaUI = new GerarEstatisticasCandidaturaUI(EscolherExpoUC22.this, controller);
                dispose();
            }
        });
        return btn;
    }

    public JButton criarBotaoCancelar() {
        JButton btn = new JButton("Cancelar");
        btn.setToolTipText("Volta para o Menu Inicial");
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        return btn;
    }
}
