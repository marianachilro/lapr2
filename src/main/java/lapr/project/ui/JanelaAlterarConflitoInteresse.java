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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import lapr.project.controller.AtualizarConflitoController;
import lapr.project.model.CandidaturaDemonstracao;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CandidaturaGeral;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Conflito;
import lapr.project.model.Exposicao;
import lapr.project.model.TipoConflito;

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

    private final List<CandidaturaDemonstracao> listaCandidaturasDemo;

    private final List<TipoConflito> listaTiposConflito;

    private JButton botaoSim;

    private JButton botaoNao;

    private JComboBox comboBoxCandidaturas;

    private JComboBox comboBoxTiposConflito;

    public JanelaAlterarConflitoInteresse(AtualizarConflitoController controller, CentroExposicoes centro, Conflito conflito) {
       
        this.controller = controller;
        this.centro = centro;
        this.exposicao=controller.getExposicao();
        this.conflito = conflito;
        this.listaCandidaturasExpo = controller.getListaCandidaturasFAEExpo();
        this.listaCandidaturasDemo = controller.getListaCandidaturasFAEDemo();
        this.listaTiposConflito = controller.getRegistoTipoConflitos().getListaTipoConflitos();

        setModal(true);
        setLayout(new BorderLayout());

        add(criarPainelInfo());

        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        pack();
        setResizable(false);
        setVisible(true);
    }

    public JPanel criarPainelInfo() {
        JPanel p = new JPanel(new BorderLayout());
        p.setBorder(new EmptyBorder(10, 10, 10, 10));
        p.add(criarPainelInput(), BorderLayout.CENTER);
        p.add(criarPainelBotoes(), BorderLayout.SOUTH);
        return p;
    }

    public JPanel criarPainelInput() {
        JPanel p = new JPanel(new GridLayout(4, 2, 3, 3));
        p.setBorder(new EmptyBorder(10, 10, 10, 10));
        p.add(criarPainelPertendeCandidaturas());
        if (exposicao.getEstado().setDemonstracaoConflitosDetetados()) {
            p.add(criarComboBoxCandidaturasExpo());
        } else if (exposicao.getEstado().setDemonstracaoCandidaturasAbertas()) {
            p.add(criarComboBoxCandidaturasDemo());
        }
        p.add(criarPainelPertendeTiposConflito());
        p.add(criarComboBoxTiposConflito());
        pack();
        return p;
    }

    public JPanel criarPainelPertendeCandidaturas() {
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p.add(criarLabel("Pertende alterar a Candidatura?"));
        p.add(criarBotaoSim("Permite a Alteração da Candidatura do Conflito", comboBoxCandidaturas));
        p.add(criarBotaoNao("Não permite a alteração da Candidatura do Conflito", comboBoxCandidaturas));
        return p;
    }

    public JPanel criarPainelPertendeTiposConflito() {
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p.add(criarLabel("Pertende alterar o Tipo?"));
        p.add(criarBotaoSim("Permite a Alteração do Tipo do Conflito", comboBoxTiposConflito));
        p.add(criarBotaoNao("Não permite a alteração do Tipo do Conflito", comboBoxTiposConflito));
        return p;
    }

    public JButton criarBotaoSim(String mensagem, JComboBox comboBox) {
        JButton btn = new JButton("Sim");
        btn.setToolTipText(mensagem);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botaoSim.setEnabled(false);
                botaoNao.setEnabled(true);
                comboBox.setEnabled(true);
            }

        });
        return btn;
    }

    public JButton criarBotaoNao(String mensagem, JComboBox comboBox) {
        JButton btn = new JButton("Não");
        btn.setToolTipText(mensagem);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botaoSim.setEnabled(true);
                botaoNao.setEnabled(false);
                if (comboBox.equals(comboBoxCandidaturas)) {
                    comboBox.setSelectedItem(conflito.getCandidaturas());
                } else {
                    comboBox.setSelectedItem(conflito.getTipo());
                }
                comboBox.setEnabled(false);
            }

        });
        return btn;
    }

    public JComboBox criarComboBoxCandidaturasExpo() {
        if (!listaCandidaturasExpo.isEmpty()) {
            CandidaturaExposicao[] array = new CandidaturaExposicao[listaCandidaturasExpo.size() + 1];
            int i = 1;
            for (CandidaturaExposicao c : listaCandidaturasExpo) {
                array[i] = c;
                i++;
            }
            this.comboBoxCandidaturas = criarJComboBox(array);
            comboBoxCandidaturas.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    CandidaturaExposicao candExpo = (CandidaturaExposicao) comboBoxCandidaturas.getSelectedItem();
                    if (candExpo != null) {
                        controller.seleciona(candExpo);
                    }
                }
            });
        }
        this.comboBoxCandidaturas.setSelectedItem(conflito.getCandidaturas());
        this.comboBoxCandidaturas.setEnabled(false);
        return this.comboBoxCandidaturas;
    }

    public JComboBox criarComboBoxCandidaturasDemo() {
        if (!listaCandidaturasDemo.isEmpty()) {
            CandidaturaDemonstracao[] array = new CandidaturaDemonstracao[listaCandidaturasDemo.size() + 1];
            int i = 1;
            for (CandidaturaDemonstracao c : listaCandidaturasDemo) {
                array[i] = c;
                i++;
            }
            this.comboBoxCandidaturas = criarJComboBox(array);
            comboBoxCandidaturas.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    CandidaturaDemonstracao candDemo = (CandidaturaDemonstracao) comboBoxCandidaturas.getSelectedItem();
                    if (candDemo != null) {
                        controller.seleciona(candDemo);

                    }

                }

            });
        }
        this.comboBoxCandidaturas.setSelectedItem(conflito.getCandidaturas());
        this.comboBoxCandidaturas.setEnabled(false);
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
            this.comboBoxTiposConflito = criarJComboBox(array);
            this.comboBoxTiposConflito.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    TipoConflito tipo = (TipoConflito) comboBoxTiposConflito.getSelectedItem();
                    if (tipo != null) {
                        controller.seleciona(tipo);

                    }

                }

            });
        }
        this.comboBoxTiposConflito.setSelectedItem(conflito.getTipo());
        this.comboBoxTiposConflito.setEnabled(false);
        return this.comboBoxTiposConflito;
    }

    public JComboBox criarJComboBox(Object[] array) {
        this.comboBoxCandidaturas = new JComboBox<>(array);
        return comboBoxCandidaturas;
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
                CandidaturaGeral c = (CandidaturaGeral)comboBoxCandidaturas.getSelectedItem();
                controller.seleciona(c);
                TipoConflito t = (TipoConflito) comboBoxTiposConflito.getSelectedItem();
                controller.seleciona(t);
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
                botaoSim.setEnabled(true);
                botaoNao.setEnabled(true);
                comboBoxCandidaturas.setSelectedItem(conflito.getCandidaturas());
                comboBoxCandidaturas.setEnabled(false);
                comboBoxTiposConflito.setSelectedItem(conflito.getTipo());
                comboBoxTiposConflito.setEnabled(false);
            }
        });
        return btn;
    }
}
