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
import java.awt.event.KeyEvent;
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
import lapr.project.model.CandidaturaDemonstracao;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Conflito;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.TipoConflito;

/**
 *
 * @author marianachilro
 */
public class JanelaCriarConflitoInteresse extends JDialog {

    private final AtualizarConflitoController controller;

    private final CentroExposicoes centro;

    private final Exposicao exposicao;

    private JButton botaoSim;

    private JButton botaoNao;

    private JComboBox comboBoxCandidaturas;

    private JComboBox comboBoxTiposConflito;
    
    public JanelaCriarConflitoInteresse(AtualizarConflitoController controller, CentroExposicoes centro){
        
        this.controller = controller;
        this.centro=centro;
        this.exposicao=controller.getExposicao();
        setModal(true);
        setLayout(new BorderLayout());

        add(criarPainelInfo());

        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        pack();
        setResizable(false);
        setVisible(true);
        
    }
    
    public JPanel criarPainelInfo(){
        JPanel p = new JPanel(new BorderLayout());
        p.setBorder(new EmptyBorder(10, 10, 10, 10));
        p.add(criarPainelInput(), BorderLayout.CENTER);
        p.add(criarPainelBotoes(), BorderLayout.SOUTH);
        return p;
    }
    
    public JPanel criarPainelInput(){
        JPanel p = new JPanel(new GridLayout(4, 2, 3, 3));
        p.setBorder(new EmptyBorder(10, 10, 10, 10));
        if (!exposicao.getEstado().setExposicaoConflitosAtualizados() && exposicao.getEstado().setExposicaoConflitosDetetados()) {
            p.add(criarPainelCandidaturasExpo());
        } else if (!exposicao.getEstado().setDemonstracaoConflitosAtualizados() && exposicao.getEstado().setDemonstracaoConflitosDetetados()) {
            p.add(criarPainelCandidaturasDemos());
        }
        p.add(criarPainelTiposConflito());
        pack();
        return p;
    }
    
    public JPanel criarPainelCandidaturasExpo(){
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1, 2));
        JLabel lbl = new JLabel("Escolha uma Candidatura:");
        List <CandidaturaExposicao> listaCandidaturas = controller.getListaCandidaturasFAEExpo();
        CandidaturaExposicao [] array = new CandidaturaExposicao[listaCandidaturas.size()+1];
        int i =1;
        for(CandidaturaExposicao c : listaCandidaturas){
            array[i] = c;
            i++;
        }
        this.comboBoxCandidaturas = new JComboBox<>(array);
        comboBoxCandidaturas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CandidaturaExposicao candidatura = (CandidaturaExposicao) comboBoxCandidaturas.getSelectedItem();
                if (candidatura != null) {
                    controller.seleciona(candidatura);
                }

            }

        });
        p.add(lbl);
        p.add(comboBoxCandidaturas);
        return p;
    }
    
    public JPanel criarPainelCandidaturasDemos(){
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1, 2));
        JLabel lbl = new JLabel("Escolha uma Candidatura:");
        List <CandidaturaDemonstracao> listaCandidaturas = controller.getListaCandidaturasFAEDemo();
        CandidaturaDemonstracao [] array = new CandidaturaDemonstracao[listaCandidaturas.size()+1];
        int i =1;
        for(CandidaturaDemonstracao c : listaCandidaturas){
            array[i] = c;
            i++;
        }
        this.comboBoxCandidaturas = new JComboBox<>(array);
        comboBoxCandidaturas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CandidaturaDemonstracao candidatura = (CandidaturaDemonstracao) comboBoxCandidaturas.getSelectedItem();
                if (candidatura != null) {
                    controller.seleciona(candidatura);
                }

            }

        });
        p.add(lbl);
        p.add(comboBoxCandidaturas);
        return p;
    }
    
    public JPanel criarPainelTiposConflito(){
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1, 2));
        JLabel lbl = new JLabel("Escolha um Tipo de Conflito:");
        List <TipoConflito> listaTipo = controller.getRegistoTipoConflitos().getTiposConflitoAtivos();
        TipoConflito [] array = new TipoConflito[listaTipo.size()+1];
        int i =1;
        for(TipoConflito t : listaTipo){
            array[i] = t;
            i++;
        }
        this.comboBoxTiposConflito = new JComboBox<>(array);
        comboBoxTiposConflito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TipoConflito tipo = (TipoConflito) comboBoxTiposConflito.getSelectedItem();
                if (tipo != null) {
                    controller.seleciona(tipo);
                }

            }

        });
        p.add(lbl);
        p.add(comboBoxTiposConflito);
        return p;
    }
    
    public JPanel criarPainelBotoes() {
        JPanel p = new JPanel();
        p.add(criarBotaoConfirmar());
        p.add(criarBotaoSair());
        p.add(criarBotaoLimpar());
        return p;
    }
    
    public JButton criarBotaoConfirmar(){
        JButton btn = new JButton("Confirmar");
        btn.setToolTipText("Guarda o registo do Conflito");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
               controller.setDados();
               
               int i = JOptionPane.showConfirmDialog(JanelaCriarConflitoInteresse.this,
                            "Tem a certeza que pertende registar o Conflito?", "Criar Conflito de Interesse", JOptionPane.YES_NO_OPTION);
                    if (i == JOptionPane.YES_OPTION) {
                        controller.setAlteracaoConflito();
                        JOptionPane.showMessageDialog(JanelaCriarConflitoInteresse.this, "O Conflito foi Criado com Sucesso!",
                            "Novo Conflito de Interesse", JOptionPane.INFORMATION_MESSAGE);
                    }
               
            }
            
        });
        
        
        
        return btn;
    }
    
    public JButton criarBotaoSair() {
        JButton btn = new JButton("Sair");
        btn.setToolTipText("Voltar ao menu inicial ");
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        return btn;
    }
    
    public JButton criarBotaoLimpar(){
        JButton btn = new JButton("Limpar");
        btn.setToolTipText("Limpa todos os dados");
        btn.setMnemonic(KeyEvent.VK_L);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comboBoxCandidaturas.setSelectedIndex(0);
                comboBoxTiposConflito.setSelectedIndex(0);
            }
        });
        return btn;
    }
    
    
    
    
}
