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
public class JanelaCriarConflitoInteresse extends JDialog {

    private final AtualizarConflitoController controller;

    private final CentroExposicoes centro;

    private final Exposicao exposicao;
    
    private List <CandidaturaExposicao> listaCandidaturasExpo;
    
    private List <CandidaturaDemonstracao> listaCandidaturasDemos;

    private JButton botaoSim;

    private JButton botaoNao;

    private JComboBox comboBoxCandidaturas;

    private JComboBox comboBoxTiposConflito;
    
    public JanelaCriarConflitoInteresse(AtualizarConflitoController controller, CentroExposicoes centro){
        
        this.controller = controller;
        this.centro=centro;
        this.exposicao=controller.getExposicao();
        this.listaCandidaturasExpo=controller.getListaCandidaturasFAEExpo();
        this.listaCandidaturasDemos=controller.getListaCandidaturasFAEDemo();
        setModal(true);
        setLayout(new BorderLayout());

        add(criarPainelInfo());

        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        pack();
        setResizable(false);
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
//                c.getListaDemonstracoes().getListaDemonstracao().add(d);
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
//                controller.selecionaConflito(conf);
//
//                new JanelaCriarConflitoInteresse(controller, ce).setVisible(true);
//            }
//        });
//    }
    
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
        if (!exposicao.getEstado().setExposicaoCandidaturasFechadas() && exposicao.getEstado().setExposicaoConflitosDetetados()) {
            if (!listaCandidaturasExpo.isEmpty()) {
                CandidaturaExposicao[] array = new CandidaturaExposicao[listaCandidaturasExpo.size() + 1];
                int i = 1;
                for (CandidaturaExposicao c : listaCandidaturasExpo) {
                    array[i] = c;
                    i++;
                }
                p.add(criarPainelCandidaturas(array));
            } else {
                JOptionPane.showMessageDialog(JanelaCriarConflitoInteresse.this, "Não existem Candidaturas disponíveis!",
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
                p.add(criarPainelCandidaturas(array));
            } else {
                JOptionPane.showMessageDialog(JanelaCriarConflitoInteresse.this, "Não existem Candidaturas disponíveis!",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }

        }
        p.add(criarPainelTiposConflito());
        pack();
        return p;
    }
    
    public JPanel criarPainelCandidaturas(CandidaturaGeral[] array){
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1, 2));
        JLabel lbl = new JLabel("Escolha uma Candidatura:");
        
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
        p.add(lbl);
        p.add(comboBoxCandidaturas);
        return p;
    }
    
    
    public JComboBox criarJComboBoxCandidaturas(Object[] array) {
        this.comboBoxCandidaturas = new JComboBox<>(array);
        return comboBoxCandidaturas;
    }
    
    
    public JPanel criarPainelTiposConflito(){
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1, 2));
        JLabel lbl = new JLabel("Escolha um Tipo de Conflito:");
        List <TipoConflito> listaTipo = controller.getRegistoTipoConflitos().getTiposConflitoAtivos();
        String [] array = new String[listaTipo.size()+1];
        int i =1;
        for(TipoConflito t : listaTipo){
            array[i] = t.getNome();
            i++;
        }
        this.comboBoxTiposConflito = new JComboBox<>(array);
        comboBoxTiposConflito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tipo = (String) comboBoxTiposConflito.getSelectedItem();
                if (tipo != null) {
                    for(TipoConflito t : listaTipo){
                        if(t.getNome().equalsIgnoreCase(tipo))
                            controller.selecionaTipo(t);
                    }
                    
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
                        controller.addConflito();
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
