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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import lapr.project.controller.AlterarPerfilUtilizadorController;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Utilizador;

/**
 *
 * @author marianachilro
 */
public class AlterarPerfilUtilizadorUI extends JDialog {

    private final AlterarPerfilUtilizadorController controller;

    private final Utilizador utilizador;
    
    private Utilizador clone;

    private JTextField txtNome;

    private JTextField txtUsername;

    private JTextField txtEmail;

    private JTextField txtPassword;

    private JTextField txtNovaPassword;

    private JTextField txtKeyword;
    
    private JButton botaoSim;
    
    private JButton botaoNao;
    
    private JButton botaoConfirmar;

    private final CentroExposicoes centro;

    private final JFrame janelaPai;

    public AlterarPerfilUtilizadorUI(JFrame janelaPai, CentroExposicoes ce, String username) {
        super(janelaPai, "Alterar Perfil de Utilizador", true);

        this.janelaPai = janelaPai;
        this.centro = ce;
        this.controller = new AlterarPerfilUtilizadorController(ce, username);
        this.utilizador = controller.getUtilizador();
        controller.removerUtilizador(utilizador);

        setModal(true);
        setLayout(new BorderLayout());

        add(criarPainelInfo());

        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        pack();
        setResizable(false);
        setLocationRelativeTo(janelaPai);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int result = JOptionPane.showConfirmDialog(
                        AlterarPerfilUtilizadorUI.this, "Tem a certeza?");
                if (result == JOptionPane.OK_OPTION) {

                    AlterarPerfilUtilizadorUI.this.setDefaultCloseOperation(
                            JDialog.DISPOSE_ON_CLOSE);
                    AlterarPerfilUtilizadorUI.this.setVisible(false);
                    AlterarPerfilUtilizadorUI.this.dispose();
                    JFrame MenuUI = new MenuUI(centro,utilizador);
                } else if (result == JOptionPane.CANCEL_OPTION) {
                    AlterarPerfilUtilizadorUI.this.setDefaultCloseOperation(
                            JDialog.DO_NOTHING_ON_CLOSE);
                } else if (result == JOptionPane.NO_OPTION) {
                    AlterarPerfilUtilizadorUI.this.setDefaultCloseOperation(
                            JDialog.DO_NOTHING_ON_CLOSE);
                }
            }
        });

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
//                CentroExposicoes ce = new CentroExposicoes();
//                Utilizador util = new Utilizador(3,"eva", "eva1","blaba@centro.pt", "M-ay1", "keyword");
//                ce.getRegistoUtilizadores().addUtilizador(util);
//                new AlterarPerfilUtilizadorUI(null, ce, util.getUsername()).setVisible(true);
//            }
//        });
//    }

    public JPanel criarPainelInfo() {
        JPanel p = new JPanel(new BorderLayout());
        p.setBorder(new EmptyBorder(10, 10, 10, 10));
        p.add(criarPainelInput(), BorderLayout.CENTER);
        p.add(criarPainelBotoes(), BorderLayout.SOUTH);
        return p;
    }

    public JPanel criarPainelInput() {
        JPanel p = new JPanel(new GridLayout(7, 2, 3, 3));
        p.setBorder(new EmptyBorder(10, 10, 10, 10));
        p.add(criarPainelNome());
        p.add(criarPainelUsername());
        p.add(criarPainelEmail());
        p.add(criarPainelKeyword());
        p.add(criarPainelMudarPass());
        p.add(criarPainelPassword());
        p.add(criarPainelNovaPassword());
        pack();
        return p;
    }

    public JPanel criarPainelNome() {
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));

        p.add(criarLabel("Nome de Utilizador: "));
        txtNome = criarJTextField(16);
        txtNome.setText(utilizador.getNome());
        txtNome.requestFocusInWindow();
        p.add(txtNome);
        return p;
    }

    public JPanel criarPainelUsername() {
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));

        p.add(criarLabel("Username: "));
        txtUsername = criarJTextField(16);
        txtUsername.setText(utilizador.getUsername());
        txtUsername.requestFocusInWindow();
        p.add(txtUsername);
        return p;
    }

    public JPanel criarPainelEmail() {
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));

        p.add(criarLabel("E-mail: "));
        txtEmail = criarJTextField(16);
        txtEmail.setText(utilizador.getEmail());
        txtEmail.requestFocusInWindow();
        p.add(txtEmail);
        return p;
    }

    public JPanel criarPainelKeyword() {
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));

        p.add(criarLabel("Keyword para Encriptação: "));
        txtKeyword = criarJTextField(16);
        txtKeyword.setText(utilizador.getKeyword());
        txtKeyword.requestFocusInWindow();
        p.add(txtKeyword);
        return p;
    }

    public JPanel criarPainelMudarPass() {
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p.add(criarLabel("Pertende alterar a password?"));
        botaoSim = criarBotaoSim();
        botaoNao = criarBotaoNao();
        p.add(botaoSim);
        p.add(botaoNao);
        return p;
    }
    
    public JPanel criarPainelPassword() {
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));

        p.add(criarLabel("Introduza Password Atual: "));
        txtPassword = criarJTextField(16);
        txtPassword.requestFocusInWindow();
        txtPassword.setEditable(false);
        p.add(txtPassword);
        return p;
    }
    
    public JPanel criarPainelNovaPassword() {
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));

        p.add(criarLabel("Introduza a Nova Password: "));
        txtNovaPassword = criarJTextField(16);
        txtNovaPassword.requestFocusInWindow();
        txtNovaPassword.setEditable(false);
        p.add(txtNovaPassword);
        return p;
    }
    
    public JPanel criarPainelBotoes() {
        JPanel p = new JPanel();
        botaoConfirmar = criarBotaoConfirmar();
        p.add(botaoConfirmar);
        p.add(criarBotaoCancelar());
        p.add(criarBotaoLimpar());
        return p;
    }
    
    public JLabel criarLabel(String nomeLabel) {
        
        return new JLabel(nomeLabel);
    }

    public JTextField criarJTextField(int tamanho) {
         
        return new JTextField(tamanho);
    }
    
    public JButton criarBotaoSim(){
        JButton btn = new JButton("Sim");
        btn.setToolTipText("Permite a Alteração da Password Atual");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botaoSim.setEnabled(false);
                botaoNao.setEnabled(true);
                txtPassword.setEditable(true);
                txtNovaPassword.setEditable(true);
            }
            
        });
        return btn;
    }
    
    public JButton criarBotaoNao(){
        JButton btn = new JButton("Não");
        btn.setToolTipText("Não permite a alteração da Password Atual");
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                botaoSim.setEnabled(true);
                botaoNao.setEnabled(false);
                txtPassword.setEditable(false);
                txtNovaPassword.setEditable(false);
            }
            
        });
        return btn;
    }
    
    public JButton criarBotaoConfirmar(){
        JButton btn = new JButton("Confirmar");
        btn.setToolTipText("Confirma a alteração do perfil de Utilizador");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clone = controller.criarClone();
                boolean b = controller.setDados(txtNome.getText(), txtUsername.getText(), txtEmail.getText(), txtKeyword.getText());
                
                if(b){
                    JOptionPane.showMessageDialog(AlterarPerfilUtilizadorUI.this, "Os dados introduzidos já existem!", "ERRO", ERROR_MESSAGE);
                }else{
                    if(controller.validaPassword(txtPassword.getText())){
                        controller.setNovaPassword(txtNovaPassword.getText());
                        controller.registaAlteracoes();
                        JOptionPane.showMessageDialog(AlterarPerfilUtilizadorUI.this, "Perfil de Utilizador alterado com Sucesso!");
                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(AlterarPerfilUtilizadorUI.this, "Password incorreta!", "ERRO", ERROR_MESSAGE);
                    }
                    
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
    
    private JButton criarBotaoLimpar(){
        JButton btn = new JButton("Limpar");
        btn.setToolTipText("Limpa todos os dados");
        btn.setMnemonic(KeyEvent.VK_L);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNome.setText(null);
                txtUsername.setText(null);
                txtEmail.setText(null);
                txtKeyword.setText(null);
                botaoSim.setEnabled(true);
                botaoNao.setEnabled(true);
                txtPassword.setText(null);
                txtPassword.setEditable(false);
                txtNovaPassword.setText(null);
                txtNovaPassword.setEditable(false);
            }
        });
        return btn;
    }
}
