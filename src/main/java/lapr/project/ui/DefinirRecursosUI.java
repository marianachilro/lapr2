/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import lapr.project.controller.DefinirRecursosController;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Recurso;

/**
 *
 * @author marianachilro
 */
public class DefinirRecursosUI extends JDialog{
    
    private DefinirRecursosController controller;
    
    private Recurso recurso;
    
    private JTextField txtNome;
    
    private JFrame janelaPai;
    
    private CentroExposicoes ce;
    
    private JButton botaoConfirmar;
    
    
    
    
    public DefinirRecursosUI(JFrame janelaPai, CentroExposicoes ce){
        super(janelaPai, "Definir Recursos", true);
        this.janelaPai=janelaPai;
        this.ce=ce;
        
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
                new DefinirRecursosUI(null, ce).setVisible(true);
            }
        });
    }
    
    public JPanel criarPainelInfo(){
        JPanel p = new JPanel(new BorderLayout());
        p.setBorder(new EmptyBorder(10, 10, 10, 10));
        p.add(criarPainelInput(), BorderLayout.CENTER);
        p.add(criarPainelBotoes(), BorderLayout.SOUTH);
        return p;
    }
    
    public JPanel criarPainelInput(){
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p.add(criarLabel("Nome do Recurso: "));
        txtNome = criarJTextField(16);
        txtNome.requestFocusInWindow();
        p.add(txtNome);
        return p;
    }
    
    public JPanel criarPainelBotoes() {
        JPanel p = new JPanel();
        botaoConfirmar = criarBotaoConfirmar();
        p.add(botaoConfirmar);
        p.add(criarBotaoSair());
        p.add(criarBotaoLimpar());
        return p;
    }
    
    public JButton criarBotaoConfirmar(){
        JButton btn = new JButton("Confirmar");
        btn.setToolTipText("Guarda o registo do recurso");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               recurso = controller.newRecurso();
               controller.setRecurso(txtNome.getText());
               if(controller.validaRecurso()){
                   JOptionPane.showMessageDialog(DefinirRecursosUI.this, "Não foi possível registar o Recurso porque é inválido ou já existe!", "ERRO", ERROR_MESSAGE);

               }else{
                   if(controller.addRecurso()){
                       JOptionPane.showMessageDialog(DefinirRecursosUI.this, "Recurso criado com sucesso.", "Novo Recurso", JOptionPane.INFORMATION_MESSAGE);

                   }else{
                       JOptionPane.showMessageDialog(DefinirRecursosUI.this, "Não foi possível registar o Recurso!", "ERRO", ERROR_MESSAGE);

                   }
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
                txtNome.setText(null);
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
