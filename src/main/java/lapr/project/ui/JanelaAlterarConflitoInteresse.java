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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import lapr.project.controller.AtualizarConflitoController;
import lapr.project.model.CandidaturaDemonstracao;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CandidaturaGeral;
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
public class JanelaAlterarConflitoInteresse extends JDialog {

    private final AtualizarConflitoController controller;

    private final CentroExposicoes centro;

    private final Exposicao exposicao;

    private final Conflito conflito;

    private final List<CandidaturaExposicao> listaCandidaturasExpo;

    private final List<CandidaturaDemonstracao> listaCandidaturasDemos;

    private final List<TipoConflito> listaTiposConflito;

    private JButton botaoSimCandidaturas;

    private JButton botaoSimTiposConflito;

    private JButton botaoNaoCandidaturas;

    private JButton botaoNaoTiposConflito;

    private JComboBox comboBoxCandidaturas;

    private JComboBox comboBoxTiposConflito;

    public JanelaAlterarConflitoInteresse(AtualizarConflitoController controller) {

        this.controller = controller;
        this.centro = controller.getCentro();
        this.exposicao = controller.getExposicao();
        this.conflito = controller.getConflito();
        this.listaCandidaturasExpo = controller.getListaCandidaturasFAEExpo();
        this.listaCandidaturasDemos = controller.getListaCandidaturasFAEDemo();
        this.listaTiposConflito = controller.getRegistoTipoConflitos().getListaTipoConflitos();

        setModal(true);
        setLayout(new BorderLayout());

        add(criarPainelInfo());

        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        pack();
        setResizable(false);
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

                CandidaturaExposicao c = new CandidaturaExposicao();
                c.setEmailRep("email@centro.pt");
                expo.getListaCandidaturas().addCandidatura(c);
                CandidaturaExposicao c1 = new CandidaturaExposicao();
                c1.setEmailRep("email1@centro.pt");
                expo.getListaCandidaturas().addCandidatura(c1);
                CandidaturaExposicao c2 = new CandidaturaExposicao();
                c2.setEmailRep("email2@centro.pt");
                expo.getListaCandidaturas().addCandidatura(c2);

                Demonstracao d = new Demonstracao("codigo1", "descricao");
                d.setNumeroInteressados(2);
                expo.getListaDemonstracoes().addDemonstracao(d);
                c.getListaDemonstracoes().getListaDemonstracao().add(d);
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
                AtualizarConflitoController controller = new AtualizarConflitoController(ce, util);
                controller.selecionaExpo(expo);
                controller.selecionaConflito(conf);

                new JanelaAlterarConflitoInteresse(controller).setVisible(true);
            }
        });
    }

    public JPanel criarPainelInfo() {
        JPanel p = new JPanel(new BorderLayout());
        p.setBorder(new EmptyBorder(10, 10, 10, 10));
        p.add(criarPainelInput(), BorderLayout.CENTER);
        p.add(criarPainelBotoes(), BorderLayout.SOUTH);
        return p;
    }

    public JPanel criarPainelInput() {
        JPanel p = new JPanel(new GridLayout(5, 2, 3, 3));
        p.setBorder(new EmptyBorder(10, 10, 10, 10));
        p.add(criarPainelPertendeCandidaturas());
        if (!exposicao.getEstado().setExposicaoCandidaturasFechadas() && exposicao.getEstado().setExposicaoConflitosDetetados()) {
            if (!listaCandidaturasExpo.isEmpty()) {
                CandidaturaExposicao[] array = new CandidaturaExposicao[listaCandidaturasExpo.size() + 1];
                int i = 1;
                for (CandidaturaExposicao c : listaCandidaturasExpo) {
                    array[i] = c;
                    i++;
                }
                p.add(criarComboBoxCandidaturas(array));
            } else {
                JOptionPane.showMessageDialog(JanelaAlterarConflitoInteresse.this, "Não existem Candidaturas disponíveis!",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } else if (!exposicao.getEstado().setDemonstracaoCandidaturasFechadas() && exposicao.getEstado().setDemonstracaoConflitosDetetados()) {
            if (!listaCandidaturasDemos.isEmpty()) {
                CandidaturaDemonstracao[] array = new CandidaturaDemonstracao[listaCandidaturasDemos.size() + 1];
                int i = 1;
                for (CandidaturaDemonstracao c : listaCandidaturasDemos) {
                    array[i] = c;
                    i++;
                }
                p.add(criarComboBoxCandidaturas(array));
            } else {
                JOptionPane.showMessageDialog(JanelaAlterarConflitoInteresse.this, "Não existem Candidaturas disponíveis!",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }

        }
        p.add(criarPainelPertendeTiposConflito());
        p.add(criarComboBoxTiposConflito());
        pack();
        return p;
    }

    public JPanel criarPainelPertendeCandidaturas() {
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p.add(criarLabel("Pretende alterar a Candidatura?"));
        p.add(criarBotaoSimCandidaturas("Permite a Alteração da Candidatura do Conflito"));
        p.add(criarBotaoNaoCandidaturas("Não permite a alteração da Candidatura do Conflito"));
        return p;
    }

    public JPanel criarPainelPertendeTiposConflito() {
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p.add(criarLabel("Pretende alterar o Tipo?"));
        p.add(criarBotaoSimTiposConflito("Permite a Alteração do Tipo do Conflito"));
        p.add(criarBotaoNaoTiposConflito("Não permite a alteração do Tipo do Conflito"));
        return p;
    }

    public JComboBox criarComboBoxCandidaturas(CandidaturaGeral[] array) {

        this.comboBoxCandidaturas = criarJComboBoxCandidaturas(array);
        comboBoxCandidaturas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!exposicao.getEstado().setExposicaoCandidaturasFechadas() && exposicao.getEstado().setExposicaoConflitosDetetados()) {
                    CandidaturaExposicao cand = (CandidaturaExposicao) comboBoxCandidaturas.getSelectedItem();
                    if (cand != null) {
                        controller.selecionaCandExpo(cand);
                    }
                }else if(!exposicao.getEstado().setDemonstracaoCandidaturasFechadas() && exposicao.getEstado().setDemonstracaoConflitosDetetados()){
                    CandidaturaDemonstracao cand = (CandidaturaDemonstracao) comboBoxCandidaturas.getSelectedItem();
                    if (cand != null) {
                        controller.selecionaCandDemos(cand);
                    }
                }

            }
        });
        this.comboBoxCandidaturas.setEnabled(false);
        this.comboBoxCandidaturas.setEnabled(true);
        return this.comboBoxCandidaturas;
    }

    public JComboBox criarComboBoxTiposConflito() {

        if (!listaTiposConflito.isEmpty()) {
            TipoConflito[] array = new TipoConflito[listaTiposConflito.size() + 1];
            int i = 1;
            for (TipoConflito t : listaTiposConflito) {
                array[i] = t;
                i++;
            }
            this.comboBoxTiposConflito = criarJComboBoxTiposConflito(array);
            this.comboBoxTiposConflito.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    TipoConflito tipo = (TipoConflito) comboBoxTiposConflito.getSelectedItem();
                    if (tipo != null) {
                        controller.selecionaTipo(tipo);

                    }

                }

            });
        }
        this.comboBoxTiposConflito.setSelectedItem(conflito.getTipo());
        this.comboBoxTiposConflito.setEnabled(false);
        return this.comboBoxTiposConflito;
    }

    public JButton criarBotaoSimCandidaturas(String mensagem) {
        botaoSimCandidaturas = new JButton("Sim");
        botaoSimCandidaturas.setToolTipText(mensagem);
        botaoSimCandidaturas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botaoSimCandidaturas.setEnabled(false);
                botaoNaoCandidaturas.setEnabled(true);
                comboBoxCandidaturas.setEnabled(true);
            }

        });
        return botaoSimCandidaturas;
    }

    public JButton criarBotaoSimTiposConflito(String mensagem) {
        botaoSimTiposConflito = new JButton("Sim");
        botaoSimTiposConflito.setToolTipText(mensagem);
        botaoSimTiposConflito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botaoSimTiposConflito.setEnabled(false);
                botaoNaoTiposConflito.setEnabled(true);
                comboBoxTiposConflito.setEnabled(true);
            }

        });
        return botaoSimTiposConflito;
    }

    public JButton criarBotaoNaoCandidaturas(String mensagem) {
        botaoNaoCandidaturas = new JButton("Não");
        botaoNaoCandidaturas.setToolTipText(mensagem);
        botaoNaoCandidaturas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botaoSimCandidaturas.setEnabled(true);
                botaoNaoCandidaturas.setEnabled(false);

                comboBoxCandidaturas.setSelectedItem(conflito.getCandidaturas());

                comboBoxCandidaturas.setEnabled(false);
            }

        });
        return botaoNaoCandidaturas;
    }

    public JButton criarBotaoNaoTiposConflito(String mensagem) {
        botaoNaoTiposConflito = new JButton("Não");
        botaoNaoTiposConflito.setToolTipText(mensagem);
        botaoNaoTiposConflito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botaoSimTiposConflito.setEnabled(true);
                botaoNaoTiposConflito.setEnabled(false);

                comboBoxTiposConflito.setSelectedItem(conflito.getTipo());

                comboBoxTiposConflito.setEnabled(false);
            }

        });
        return botaoNaoTiposConflito;
    }

    public JComboBox criarJComboBoxCandidaturas(Object[] array) {
        this.comboBoxCandidaturas = new JComboBox<>(array);
        return comboBoxCandidaturas;
    }
    
    public JComboBox criarJComboBoxTiposConflito(Object[] array) {
        this.comboBoxTiposConflito = new JComboBox<>(array);
        return comboBoxTiposConflito;
    }

    public JLabel criarLabel(String nomeLabel) {

        return new JLabel(nomeLabel);
    }

    public JPanel criarPainelBotoes() {
        JPanel p = new JPanel();
        p.add(criarBotaoConfirmar());
        p.add(criarBotaoCancelar());
        p.add(criarBotaoLimpar());
        return p;
    }

    public JButton criarBotaoConfirmar() {
        JButton btn = new JButton("Confirmar");
        btn.setToolTipText("Confirma a alteração do Conflito de Interesse");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.criarCloneConflito(conflito);
                
                if (!exposicao.getEstado().setExposicaoCandidaturasFechadas() && exposicao.getEstado().setExposicaoConflitosDetetados()) {
                    CandidaturaExposicao cand = (CandidaturaExposicao) comboBoxCandidaturas.getSelectedItem();
                    controller.selecionaCandExpo(cand);
                } else if (!exposicao.getEstado().setDemonstracaoCandidaturasFechadas() && exposicao.getEstado().setDemonstracaoConflitosDetetados()) {
                    CandidaturaDemonstracao cand = (CandidaturaDemonstracao) comboBoxCandidaturas.getSelectedItem();
                    controller.selecionaCandDemos(cand);
                }

                TipoConflito t = (TipoConflito) comboBoxTiposConflito.getSelectedItem();
                controller.selecionaTipo(t);
                controller.setDados();
                int i = JOptionPane.showConfirmDialog(JanelaAlterarConflitoInteresse.this, "Deseja Confirmar Alteração?",
                        "Alterar Conflito", JOptionPane.YES_NO_OPTION);
                if (i == JOptionPane.YES_OPTION) {
                    controller.setAlteracaoConflito();
                } else {
                    dispose();
                }
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

    private JButton criarBotaoLimpar() {
        JButton btn = new JButton("Limpar");
        btn.setToolTipText("Limpa todos os dados");
        btn.setMnemonic(KeyEvent.VK_L);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botaoSimCandidaturas.setEnabled(true);
                botaoNaoCandidaturas.setEnabled(true);
                botaoSimTiposConflito.setEnabled(true);
                botaoNaoTiposConflito.setEnabled(true);
                comboBoxCandidaturas.setSelectedItem(0);
                comboBoxCandidaturas.setEnabled(false);
                comboBoxTiposConflito.setSelectedItem(0);
                comboBoxTiposConflito.setEnabled(false);
            }
        });
        return btn;
    }
}
