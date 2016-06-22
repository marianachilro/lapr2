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
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Conflito;
import lapr.project.model.Exposicao;
import lapr.project.model.Utilizador;

/**
 *
 * @author marianachilro
 */
public class AtualizarConflitoInteresseUI extends JDialog{
    
    private JFrame janelaPai;
    
    private JButton botaoCriarConflito;
    
    private JButton botaoRemoverConflito;
    
    private JButton botaoAlterarConflito;
    
    private JComboBox comboBoxConflitos;
    
    private final CentroExposicoes centro;
    
    private final Exposicao exposicao;
    
    private final Utilizador utilizador;
    
    private Conflito conflito;
    
    public AtualizarConflitoInteresseUI(JFrame janelaPai, CentroExposicoes centro, Exposicao exposicao, Utilizador utilizador){
        super(janelaPai, "Atualizar Conflito", true);
        
        this.janelaPai=janelaPai;
        this.centro = centro;
        this.exposicao=exposicao;
        this.utilizador=utilizador;
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
                Exposicao expo = new Exposicao();
                Utilizador util = new Utilizador();
                
                new AtualizarConflitoInteresseUI(null, ce, expo, util).setVisible(true);
            }
        });
    }
    
    public JPanel criarPainelInfo(){
        JPanel p = new JPanel(new BorderLayout());
        p.setBorder(new EmptyBorder(10, 10, 10, 10));
        p.add(criarPainelOutput(), BorderLayout.CENTER);
        //p.add(criarPainelBotoes(), BorderLayout.SOUTH);
        return p;
    }
    
    public JPanel criarPainelOutput(){
        JPanel p = new JPanel(new GridLayout(5, 2, 3, 3));
        p.setBorder(new EmptyBorder(10, 10, 10, 10));
        p.add(criarPainelConflitos());
        p.add(criarBotaoRemoverConflito());
        p.add(criarBotaoAlterarConflito());
        p.add(criarBotaoCriarConflito());
        p.add(criarBotaoCancelar());
        pack();
        return p;
    }
    
    public JPanel criarPainelConflitos() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1, 2));
        JLabel lbl = new JLabel("Selecione um Conflito:");
        List<Conflito> listaConflitos = this.exposicao.getListaConflitos().getListaConlitosFAE(utilizador);
        Conflito [] array = new Conflito[listaConflitos.size()+1];
        int i =1;
        for(Conflito c : listaConflitos){
            array[i] = c;
            i++;
        }
        this.comboBoxConflitos = new JComboBox<>(array);
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
    
//    public JPanel criarPainelBotoes(){
//        JPanel p = new JPanel();
//        
//        p.add(criarBotaoRemoverConflito());
//        p.add(criarBotaoAlterarConflito());
//        p.add(criarBotaoCriarConflito());
//        p.add(criarBotaoCancelar());
//        return p;
//    }
    
    
    public JButton criarBotaoRemoverConflito(){
        JButton btn = new JButton("Remover Conflito");
        btn.setToolTipText("Remove o Conflito selecionado");
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        return btn;
    }
    
    public JButton criarBotaoAlterarConflito(){
        JButton btn = new JButton("Alterar Conflito");
        btn.setToolTipText("Abre Janela para a Alteração do Conflito selecionado");
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        return btn;
    }
    
    public JButton criarBotaoCriarConflito(){
        JButton btn = new JButton("Criar Conflito");
        btn.setToolTipText("Abre Janela para a Criação de um Conflito");
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
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
