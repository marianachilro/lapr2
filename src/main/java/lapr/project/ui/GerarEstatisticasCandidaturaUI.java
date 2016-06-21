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
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import lapr.project.controller.GerarEstatisticasCandidaturaController;
import lapr.project.model.Avaliacao;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;

/**
 *
 * @author marianachilro
 */
public class GerarEstatisticasCandidaturaUI extends JDialog {

    private final GerarEstatisticasCandidaturaController controller;

    private final JFrame janelaPai;

    private final Exposicao exposicao;

    private CandidaturaExposicao candidatura;

    private final CentroExposicoes centro;

    private List<CandidaturaExposicao> listaCandidaturas;

    private JComboBox comboBoxCandidaturas;

    private JTextField txtRespostaTema;

    private JTextField txtRespostaAdequacaoCandExpo;

    private JTextField txtRespostaAdequacaoCandDemos;

    private JTextField txtRespostaAdequacaoNumConvites;

    private JTextField txtRespostaRecomendacaoGlobal;

    public GerarEstatisticasCandidaturaUI(JFrame janelaPai, CentroExposicoes centro, Exposicao exposicao) {
        super(janelaPai, "Confirmar Realização de Demonstração", true);
        this.janelaPai = janelaPai;
        this.centro = centro;
        this.exposicao = exposicao;
        this.controller = new GerarEstatisticasCandidaturaController(centro);
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
                c.getEstado().setEmSubmissao();
                expo.getListaCandidaturas().addCandidatura(c);
                CandidaturaExposicao c1 = new CandidaturaExposicao();
                c1.setEmailRep("email1@centro.pt");
                c1.getEstado().setEmSubmissao();
                expo.getListaCandidaturas().addCandidatura(c1);
                CandidaturaExposicao c2 = new CandidaturaExposicao();
                c2.setEmailRep("email2@centro.pt");
                c2.getEstado().setEmSubmissao();
                expo.getListaCandidaturas().addCandidatura(c2);

                Demonstracao d = new Demonstracao("codigo1", "descricao");
                d.setNumeroInteressados(2);
                expo.getListaDemonstracoes().addDemonstracao(d);
                d.getEstado().setCriada();
                Demonstracao d1 = new Demonstracao("coddigo1", "descricao1");
                d1.setNumeroInteressados(1);
                expo.getListaDemonstracoes().addDemonstracao(d1);
                d1.getEstado().setCriada();

                Avaliacao a = new Avaliacao("fae1", "email@centro.pt", "aceite", "justificação", 5, 5,
                        5, 4, 5);
                Avaliacao a1 = new Avaliacao("fae2", "email1@centro.pt", "aceite", "justificação1", 4, 3,
                        5, 4, 5);

                Avaliacao a2 = new Avaliacao("fae1", "email2@centro.pt", "aceite", "justificação2", 4, 4,
                        4, 4, 4);
                c.getEstado().setCompleta();
                c.getEstado().setConflitosDetetados();
                c.getEstado().setConflitosAlterados();
                c.getEstado().setEmAvaliacao();
                c.getListaAvaliacoes().addAvaliacao(a);
                c.getListaAvaliacoes().addAvaliacao(a1);
                c.getListaAvaliacoes().addAvaliacao(a2);
                c.getEstado().setAvaliada();

                new GerarEstatisticasCandidaturaUI(null, ce, expo).setVisible(true);
            }
        });
    }

    public JPanel criarPainelInfo() {
        JPanel p = new JPanel(new BorderLayout());
        p.setBorder(new EmptyBorder(10, 10, 10, 10));
        p.add(criarPainelInputOutput(), BorderLayout.CENTER);
        p.add(criarPainelBotoes(), BorderLayout.SOUTH);
        return p;
    }

    public JPanel criarPainelInputOutput() {
        JPanel p = new JPanel(new GridLayout(8, 2, 3, 3));
        p.setBorder(new EmptyBorder(10, 10, 10, 10));
        p.add(criarPainelCandidaturas());
        p.add(criarPainelRespostaTema());
        p.add(criarPainelRespostaAdequacaoCandExpo());
        p.add(criarPainelRespostaAdequacaoCandDemos());
        p.add(criarPainelRespostaAdequacaoNumConvites());
        p.add(criarPainelRespostaRecomendacaoGlobal());

        pack();
        return p;
    }

    public JPanel criarPainelCandidaturas() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1, 2));
        JLabel lbl = new JLabel("Escolha uma Candidatura:");
        listaCandidaturas = controller.getCandidaturasAvaliadas(exposicao);
        String[] array = new String[listaCandidaturas.size() + 1];
        int i = 1;
        for (CandidaturaExposicao c : listaCandidaturas) {
            array[i] = c.getEmailRep();
            i++;
        }
        this.comboBoxCandidaturas = new JComboBox<>(array);
        comboBoxCandidaturas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = (String) comboBoxCandidaturas.getSelectedItem();
                CandidaturaExposicao cand = null;
                for (CandidaturaExposicao c : listaCandidaturas) {
                    if (c.getEmailRep().equalsIgnoreCase(nome)) {
                        cand = c;
                    }
                }

                if (cand != null) {
                    controller.seleciona(cand);
                    
                    candidatura = cand;

                    txtRespostaTema.setText(Float.toString(candidatura.estatisticaAvaliacoes(1)).substring(0,3));

                    txtRespostaAdequacaoCandExpo.setText(Float.toString(candidatura.estatisticaAvaliacoes(2)).substring(0,3));

                    txtRespostaAdequacaoCandDemos.setText(Float.toString(candidatura.estatisticaAvaliacoes(3)).substring(0,3));

                    txtRespostaAdequacaoNumConvites.setText(Float.toString(candidatura.estatisticaAvaliacoes(4)).substring(0,3));

                    txtRespostaRecomendacaoGlobal.setText(Float.toString(candidatura.estatisticaAvaliacoes(5)).substring(0,3));
                }

            }

        });
        p.add(lbl);
        p.add(comboBoxCandidaturas);
        return p;
    }

    public JPanel criarPainelRespostaTema() {
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));

        p.add(criarLabel("Resposta sobre o Tema da Exposição (média):"));
        txtRespostaTema = criarJTextField(4);
        txtRespostaTema.setEditable(false);
        txtRespostaTema.requestFocusInWindow();
        p.add(txtRespostaTema);
        return p;
    }

    public JPanel criarPainelRespostaAdequacaoCandExpo() {
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));

        p.add(criarLabel("Resposta sobre a Adequação da Candidatura à Exposição (média):"));
        txtRespostaAdequacaoCandExpo = criarJTextField(4);
        txtRespostaAdequacaoCandExpo.setEditable(false);
        txtRespostaAdequacaoCandExpo.requestFocusInWindow();
        p.add(txtRespostaAdequacaoCandExpo);
        return p;
    }

    public JPanel criarPainelRespostaAdequacaoCandDemos() {
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));

        p.add(criarLabel("Resposta sobre a Adequação das Candidaturas às Demonstrações (média):"));
        txtRespostaAdequacaoCandDemos = criarJTextField(4);
        txtRespostaAdequacaoCandDemos.setEditable(false);
        txtRespostaAdequacaoCandDemos.requestFocusInWindow();
        p.add(txtRespostaAdequacaoCandDemos);
        return p;
    }

    public JPanel criarPainelRespostaAdequacaoNumConvites() {
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));

        p.add(criarLabel("Resposta sobre a Adequação do número de Convites (média):"));
        txtRespostaAdequacaoNumConvites = criarJTextField(4);
        txtRespostaAdequacaoNumConvites.setEditable(false);
        txtRespostaAdequacaoNumConvites.requestFocusInWindow();
        p.add(txtRespostaAdequacaoNumConvites);
        return p;
    }

    public JPanel criarPainelRespostaRecomendacaoGlobal() {
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));

        p.add(criarLabel("Resposta sobre Recomendação Global (média):"));
        txtRespostaRecomendacaoGlobal = criarJTextField(4);
        txtRespostaRecomendacaoGlobal.setEditable(false);
        txtRespostaRecomendacaoGlobal.requestFocusInWindow();
        p.add(txtRespostaRecomendacaoGlobal);
        return p;
    }

    public JPanel criarPainelBotoes() {
        JPanel p = new JPanel();
        p.add(criarBotaoTerminar());
        p.add(criarBotaoLimpar());
        return p;
    }

    public JButton criarBotaoTerminar() {
        JButton btn = new JButton("Terminar");
        btn.setToolTipText("Termina a execução a tarefa");
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

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
                comboBoxCandidaturas.setSelectedIndex(0);
                txtRespostaTema.setText(null);

                txtRespostaAdequacaoCandExpo.setText(null);

                txtRespostaAdequacaoCandDemos.setText(null);

                txtRespostaAdequacaoNumConvites.setText(null);

                txtRespostaRecomendacaoGlobal.setText(null);

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
