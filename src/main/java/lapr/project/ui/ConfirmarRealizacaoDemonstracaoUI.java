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
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import lapr.project.controller.ConfirmarRealizacaoDemonstracaoController;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.utils.Data;

/**
 *
 * @author marianachilro
 */
public class ConfirmarRealizacaoDemonstracaoUI extends JDialog {

    private final ConfirmarRealizacaoDemonstracaoController controller;
    
    private JFrame janelaPai;

    private final CentroExposicoes centro;

    private final Exposicao exposicao;

    private Demonstracao demonstracao;

    private JTextField txtCodigoUnico;

    private JTextField txtDescricao;

    private JTextField txtPercentagemInteressados;

    private JTextField txtDataIniSubmissaoCandidaturas;

    private JTextField txtDataFimSubmissaoCandidaturas;

    private JTextField txtDataFimAtualizacaoConflitos;

    private JComboBox comboBoxDemonstracoes;

    private List<Demonstracao> listaDemonstracoes;

    private JButton botaoSim;

    private JButton botaoNao;

    private JButton botaoGuardar;

    private JButton botaoConfirmar;

    public ConfirmarRealizacaoDemonstracaoUI(JFrame janelaPai, CentroExposicoes centro, Exposicao exposicao) {
        super(janelaPai, "Confirmar Realização de Demonstração", true);
        this.janelaPai=janelaPai;
        this.centro = centro;
        this.exposicao = exposicao;
        this.controller = new ConfirmarRealizacaoDemonstracaoController(centro);
        controller.seleciona(exposicao);
        setModal(true);
        setLayout(new BorderLayout());

        add(criarPainelInfo());

        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        pack();
        setResizable(false);
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
                Exposicao expo = new Exposicao();
                ce.getRegistoExposicoes().addExposicao(expo);
                expo.getEstado().setCriada();
                expo.getEstado().setDemoSemFae();
                expo.getEstado().setCompleta();
                expo.getEstado().setExposicaoCandidaturasAbertas();
                expo.getEstado().setExposicaoCandidaturasFechadas();
                expo.getEstado().setExposicaoConflitosDetetados();
                expo.getEstado().setExposicaoConflitosAtualizados();
                expo.getEstado().setExposicaoCandidaturasAtribuidas();
                expo.getEstado().setExposicaoCandidaturasAvaliadas();
                expo.getEstado().setExposicaoCandidaturasDecididas();
                
                CandidaturaExposicao c = new CandidaturaExposicao();
                c.setEmailRep("email@centro.pt");
                expo.getListaCandidaturas().addCandidatura(c);
                CandidaturaExposicao c1 = new CandidaturaExposicao();
                c.setEmailRep("email1@centro.pt");
                expo.getListaCandidaturas().addCandidatura(c1);
                CandidaturaExposicao c2 = new CandidaturaExposicao();
                c.setEmailRep("email2@centro.pt");
                expo.getListaCandidaturas().addCandidatura(c2);
                
                Demonstracao d = new Demonstracao("codigo1", "descricao");
                d.setNumeroInteressados(2);
                expo.getListaDemonstracoes().addDemonstracao(d);
                d.getEstado().setCriada();
                Demonstracao d1 = new Demonstracao("coddigo1", "descricao1");
                d1.setNumeroInteressados(1);
                expo.getListaDemonstracoes().addDemonstracao(d1);
                d1.getEstado().setCriada();
                
                

                new ConfirmarRealizacaoDemonstracaoUI(null, ce, expo).setVisible(true);
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
        JPanel p = new JPanel(new GridLayout(8, 2, 3, 3));
        p.setBorder(new EmptyBorder(10, 10, 10, 10));
        p.add(criarPainelDemonstracoes());
        p.add(criarPainelCodigoUnico());
        p.add(criarPainelDescricao());
        p.add(criarPainelPercentagemInteressados());
        p.add(criarPainelConfirmacao());
        p.add(criarPainelDataIniSubmissao());
        p.add(criarPainelDataFimSubmissao());
        p.add(criarPainelDataFimAtualizacaoConflitos());
        pack();
        return p;
    }

    public JPanel criarPainelDemonstracoes() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1, 2));
        JLabel lbl = new JLabel("Escolha uma Demonstração:");
        listaDemonstracoes = controller.getListaDemonstracoesNaoConfirmadas();
        Demonstracao [] array = new Demonstracao[listaDemonstracoes.size()+1];
        int i =1;
        for(Demonstracao d : listaDemonstracoes){
            array[i] = d;
            i++;
        }
        this.comboBoxDemonstracoes = new JComboBox<>(array);
        comboBoxDemonstracoes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                demonstracao = (Demonstracao) comboBoxDemonstracoes.getSelectedItem();
                if (demonstracao != null) {
                    controller.seleciona(demonstracao);
                    txtCodigoUnico.setText(demonstracao.getCodigo());
                    txtDescricao.setText(demonstracao.getDescricao());
                    txtPercentagemInteressados.setText(Float.toString(controller.pergentagemInteressadosDemonstracao()));
                }

            }

        });
        p.add(lbl);
        p.add(comboBoxDemonstracoes);
        return p;
    }

    public JPanel criarPainelCodigoUnico() {
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));

        p.add(criarLabel("Código Único: "));
        txtCodigoUnico = criarJTextField(30);
        txtCodigoUnico.requestFocusInWindow();
        txtCodigoUnico.setEditable(false);
        p.add(txtCodigoUnico);
        return p;
    }

    public JPanel criarPainelDescricao() {
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));

        p.add(criarLabel("Descrição: "));
        txtDescricao = criarJTextField(100);
        txtDescricao.requestFocusInWindow();
        txtDescricao.setEditable(false);
        p.add(txtDescricao);
        return p;
    }

    public JPanel criarPainelPercentagemInteressados() {
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));

        p.add(criarLabel("Percentagem Interessados (%): "));
        txtPercentagemInteressados = criarJTextField(6);
        txtPercentagemInteressados.requestFocusInWindow();
        txtPercentagemInteressados.setEditable(false);
        p.add(txtPercentagemInteressados);
        return p;
    }

    public JPanel criarPainelConfirmacao() {
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p.add(criarLabel("Confirma a Realização da Demonstração?"));
        botaoSim = criarBotaoSim();
        botaoNao = criarBotaoNao();
        botaoGuardar = criarBotaoGuardar();
        p.add(botaoSim);
        p.add(botaoNao);
        p.add(botaoGuardar);
        return p;
    }

    public JPanel criarPainelDataIniSubmissao() {
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p.add(criarLabel("Início Submissão Candidaturas(aa/mm/dd-hh:mm:ss): "));
        txtDataIniSubmissaoCandidaturas = criarJTextField(19);
        txtDataIniSubmissaoCandidaturas.requestFocusInWindow();
        p.add(txtDataIniSubmissaoCandidaturas);
        return p;
    }

    public JPanel criarPainelDataFimSubmissao() {
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p.add(criarLabel("Fim Submissão Candidaturas(aa/mm/dd-hh:mm:ss): "));
        txtDataFimSubmissaoCandidaturas = criarJTextField(19);
        txtDataFimSubmissaoCandidaturas.requestFocusInWindow();
        p.add(txtDataFimSubmissaoCandidaturas);
        return p;
    }

    public JPanel criarPainelDataFimAtualizacaoConflitos() {
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p.add(criarLabel("Fim Atualização Conflitos (aa/mm/dd-hh:mm:ss): "));
        txtDataFimAtualizacaoConflitos = criarJTextField(19);
        txtDataFimAtualizacaoConflitos.requestFocusInWindow();
        p.add(txtDataFimAtualizacaoConflitos);
        return p;
    }

    public JButton criarBotaoSim() {
        JButton btn = new JButton("Sim");
        btn.setToolTipText("Marca a Demonstração como Realizável");
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                controller.setRealizacao(true);
                botaoSim.setEnabled(false);
                botaoNao.setEnabled(true);

            }
        });
        return btn;
    }

    public JButton criarBotaoNao() {
        JButton btn = new JButton("Não");
        btn.setToolTipText("Marca a Demonstração como Não Realizável");
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                controller.setRealizacao(false);
                botaoSim.setEnabled(true);
                botaoNao.setEnabled(false);

            }
        });
        return btn;
    }

    public JButton criarBotaoGuardar() {
        JButton btn = new JButton("Guardar");
        btn.setToolTipText("Guarda a Marcação");
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                controller.transitaEstadoDemo();
                botaoSim.setEnabled(true);
                botaoNao.setEnabled(true);
                comboBoxDemonstracoes.setSelectedIndex(0);
                txtCodigoUnico.setText(null);
                txtDescricao.setText(null);
                txtPercentagemInteressados.setText(null);
            }
        });
        return btn;
    }

    public JPanel criarPainelBotoes() {
        JPanel p = new JPanel();
        botaoConfirmar = criarBotaoConfirmar();
        p.add(botaoConfirmar);
        p.add(criarBotaoCancelar());
        p.add(criarBotaoLimpar());
        return p;
    }

    public Data organizarDadosData(String txt) {
        Data data = new Data();
        String[] aux = txt.split("-");
        String[] dadosData = aux[0].split("/");
        String[] dadosHoras = aux[1].split(":");
        data.setData(Integer.parseInt(dadosData[0].trim()), Integer.parseInt(dadosData[1].trim()), Integer.parseInt(dadosData[2].trim()), Integer.parseInt(dadosHoras[0].trim()), Integer.parseInt(dadosHoras[1].trim()), Integer.parseInt(dadosHoras[2].trim()));
        return data;
    }

    public JButton criarBotaoConfirmar() {
        JButton btn = new JButton("Confirmar");
        btn.setToolTipText("Guarda os dados da execução a tarefa");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = JOptionPane.showConfirmDialog(ConfirmarRealizacaoDemonstracaoUI.this, "Deseja continuar? Esta tarefa não poderá ser realizada novamente!!", "ATENÇÃO", JOptionPane.YES_NO_OPTION);
                if (i == JOptionPane.YES_OPTION) {
                    Data dataIniSub = organizarDadosData(txtDataIniSubmissaoCandidaturas.getText());
                    exposicao.setDataInicioSubmissaoCandidaturasDemos(dataIniSub);
                    Data dataFimSub = organizarDadosData(txtDataFimSubmissaoCandidaturas.getText());
                    exposicao.setDataFimSubmissaoCandidaturasDemos(dataFimSub);
                    Data dataFimAt = organizarDadosData(txtDataFimAtualizacaoConflitos.getText());
                    exposicao.setDataFimAtualizacaoConflitosDemos(dataFimAt);
                    controller.escalonarExposicao();
                    controller.transitaEstadoExpo();
                    dispose();
                } else {
                    comboBoxDemonstracoes.setSelectedIndex(0);
                }
            }
        });
        return btn;
    }

    public JButton criarBotaoCancelar() {
        JButton btn = new JButton("Cancelar");
        btn.setToolTipText("Cancela a execução a tarefa");
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                listaDemonstracoes.stream().forEach((d) -> {
                    d.setRealizacao(false);
                });
                dispose();
            }
        });
        return btn;
    }

    public JButton criarBotaoLimpar() {
        JButton btn = new JButton("Limpar");
        btn.setToolTipText("Limpa todos os dados");
        btn.setMnemonic(KeyEvent.VK_L);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comboBoxDemonstracoes.setSelectedIndex(0);
                txtCodigoUnico.setText(null);
                txtDescricao.setText(null);
                txtPercentagemInteressados.setText(null);
                botaoSim.setEnabled(true);
                botaoNao.setEnabled(true);
                txtDataIniSubmissaoCandidaturas.setText(null);
                txtDataFimSubmissaoCandidaturas.setText(null);
                txtDataFimAtualizacaoConflitos.setText(null);
            }
        });
        return btn;
    }

    public JLabel criarLabel(String nomeLabel) {
        JLabel lbl = new JLabel(nomeLabel);
        return lbl;
    }

    public JTextField criarJTextField(int tamanho) {
        JTextField txt = new JTextField(tamanho);
        return txt;
    }
}
