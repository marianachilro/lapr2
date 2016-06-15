/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTable;
import lapr.project.controller.ConfirmarStandController;
import lapr.project.controller.ListarCandRemovidasController;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.Stand;

/**
 *
 * @author miniondevil
 */
public class ConfirmarStandUI extends JDialog {
    
    private JComboBox cb;

    private JTable t1;
    private final ConfirmarStandController controller;
    
    public ConfirmarStandUI(MenuUI pai, CentroExposicoes ce, String username) {
        
        super(pai, "ConfirmarStand", true);
        
        controller = new ConfirmarStandController(ce, username);
        
        criarComponentes();
        
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        pack();
        setResizable(true);
        
        setLocationRelativeTo(pai);
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
//                CentroExposicoes ce = new CentroExposicoes();
//                new ConfirmarStandUI(null, ce, "asd").setVisible(true);
//            }
//        });
//    }
//    
    public void criarComponentes() {
        criarJComboBox();
        JPanel p1 = criarPainelButoes();
       
    
        add(cb, BorderLayout.NORTH);
        add(p1, BorderLayout.SOUTH);
      
        
    }
    
    public void criarJComboBox() {
        cb = new JComboBox();
        addElementosComboBox();
        
    }
    
    public void addElementosComboBox() {
        for (CandidaturaExposicao c : controller.geListaCandidaturaRep()) {
            cb.addItem(c);
        }
    }
    
    public JPanel criarPainelButoes() {
        JPanel p1 = new JPanel();
        p1.add(criarButaoListar());
        p1.add(criarButaoCancelar());
       
        return p1;
    }
    
    public JButton criarButaoListar() {
        JButton b1 = new JButton("Ver Stand");
        b1.setMnemonic(KeyEvent.VK_L);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                CandidaturaExposicao c = new CandidaturaExposicao();
//                c.setStand(new Stand());
                 ConfirmaStand confirma = new ConfirmaStand(ConfirmarStandUI.this, controller,(CandidaturaExposicao)cb.getSelectedItem());
            }
        });
        return b1;
    }
    
    public JButton criarButaoCancelar() {
        JButton b1 = new JButton("Cancelar");
        b1.setMnemonic(KeyEvent.VK_C);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                
            }
        });
        return b1;
    }
}
