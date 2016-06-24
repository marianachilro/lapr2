///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package lapr.project.ui;
//
//import java.awt.BorderLayout;
//import java.awt.GridLayout;
//import java.util.List;
//import javax.swing.JButton;
//import javax.swing.JComboBox;
//import javax.swing.JDialog;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
//import lapr.project.controller.AtualizarConflitoController;
//import lapr.project.model.CandidaturaDemonstracao;
//import lapr.project.model.CandidaturaExposicao;
//import lapr.project.model.CentroExposicoes;
//import lapr.project.model.Conflito;
//import lapr.project.model.Exposicao;
//import lapr.project.model.TipoConflito;
//
///**
// *
// * @author marianachilro
// */
//public class JanelaCriarConflitoInteresse extends JDialog {
//    
//    private final JFrame janelaPai;
//
//    private final AtualizarConflitoController controller;
//
//    private final CentroExposicoes centro;
//
//    private final Exposicao exposicao;
//
//    private final List<CandidaturaExposicao> listaCandidaturasExpo;
//
//    private final List<CandidaturaDemonstracao> listaCandidaturasDemo;
//
//    private final List<TipoConflito> listaTiposConflito;
//
//    private JButton botaoSim;
//
//    private JButton botaoNao;
//
//    private JComboBox comboBoxCandidaturas;
//
//    private JComboBox comboBoxTiposConflito;
//    
//    public JanelaCriarConflitoInteresse(JFrame janelaPai, AtualizarConflitoController controller, CentroExposicoes centro, Exposicao expo){
//        this.janelaPai=janelaPai;
//        this.controller = controller;
//        this.centro=centro;
//        this.exposicao=expo;
//        setModal(true);
//        setLayout(new BorderLayout());
//
//        add(criarPainelInfo());
//
//        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//        pack();
//        setResizable(false);
//        setLocationRelativeTo(janelaPai);
//        setVisible(true);
//        
//    }
//    
//    public JPanel criarPaineInfo(){
//        JPanel p = new JPanel(new BorderLayout());
//        p.setBorder(new EmptyBorder(10, 10, 10, 10));
//        p.add(criarPainelInput(), BorderLayout.CENTER);
//        p.add(criarPainelBotoes(), BorderLayout.SOUTH);
//        return p;
//    }
//    
//    public JPanel criarPainelInput(){
//        JPanel p = new JPanel(new GridLayout(4, 2, 3, 3));
//        p.setBorder(new EmptyBorder(10, 10, 10, 10));
//        p.add(criarPainelPertendeCandidaturas());
//        if (exposicao.getEstado().setDemonstracaoConflitosDetetados()) {
//            p.add(criarComboBoxCandidaturasExpo());
//        } else if (exposicao.getEstado().setDemonstracaoCandidaturasAbertas()) {
//            p.add(criarComboBoxCandidaturasDemo());
//        }
//        p.add(criarPainelPertendeTiposConflito());
//        p.add(criarComboBoxTiposConflito());
//        pack();
//        return p;
//    }
//    
//    
//}
