/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.Box;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import lapr.project.controller.AtribuirCandidaturaController;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.FAE;
import lapr.project.model.Mecanismo_NFAE;
import lapr.project.model.Organizador;
import lapr.project.model.Utilizador;

/**
 *
 * @author catarinarib
 */
public class MenuUI extends JFrame {

    private CentroExposicoes ce;
    private Utilizador utilizador;

    /**
     * Creates new form MenuUI
     *
     * @param ce
     * @param u
     */
    public MenuUI(CentroExposicoes ce, Utilizador u) {
        this.ce = ce;
        this.utilizador = u;
        initComponents();
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int result = JOptionPane.showConfirmDialog(
                        MenuUI.this, "Tens a certeza?");
                if (result == JOptionPane.OK_OPTION) {

                    MenuUI.this.setDefaultCloseOperation(
                            JDialog.DISPOSE_ON_CLOSE);
                    MenuUI.this.setVisible(false);
                    MenuUI.this.dispose();

                } else if (result == JOptionPane.CANCEL_OPTION) {
                    MenuUI.this.setDefaultCloseOperation(
                            JDialog.DO_NOTHING_ON_CLOSE);
                } else if (result == JOptionPane.NO_OPTION) {
                    MenuUI.this.setDefaultCloseOperation(
                            JDialog.DO_NOTHING_ON_CLOSE);
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu5 = new javax.swing.JMenu();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenu38 = new javax.swing.JMenu();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenu35 = new javax.swing.JMenu();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu17 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu26 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenu20 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu23 = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu32 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu41 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu45 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenu5.setText("jMenu5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU");
        setBackground(new java.awt.Color(153, 153, 255));
        setLocationByPlatform(true);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/colour-background-back-ground-lumiere-abstract-media-wallpapers-166067.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        jMenu1.setText("Ficheiro");

        jMenuItem27.setText("Importar");
        jMenu1.add(jMenuItem27);

        jMenu4.setText("Exportar");

        jMenuItem28.setText("Exposições");
        jMenu4.add(jMenuItem28);

        jMenuItem29.setText("jMenuItem29");
        jMenu4.add(jMenuItem29);

        jMenu1.add(jMenu4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Utilizadores");

        jMenuItem25.setText("Confirmar Perfil de Utilizadores");
        jMenu2.add(jMenuItem25);

        jMenuItem26.setText("Definir FAE");
        jMenu2.add(jMenuItem26);

        jMenuBar1.add(jMenu2);

        jMenu38.setText("Recursos");

        jMenuItem24.setText("Definir Recusos");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu38.add(jMenuItem24);

        jMenuBar1.add(jMenu38);

        jMenu7.setText("Exposição");

        jMenuItem23.setText("Criar Exposição");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem23);

        jMenuBar1.add(jMenu7);

        jMenu35.setText("Demonstração");

        jMenuItem21.setText("Criar Demonstração");
        jMenu35.add(jMenuItem21);

        jMenuItem22.setText("Confirmar Interesse");
        jMenu35.add(jMenuItem22);

        jMenuBar1.add(jMenu35);

        jMenu13.setText("Candidatura");

        jMenu14.setText("Registar Candidatura");

        jMenuItem9.setText("Exposição");
        jMenu14.add(jMenuItem9);

        jMenuItem10.setText("Demonstração");
        jMenu14.add(jMenuItem10);

        jMenu13.add(jMenu14);

        jMenu17.setText("Alterar Candidatura");

        jMenuItem11.setText("Exposição");
        jMenu17.add(jMenuItem11);

        jMenuItem12.setText("Demonstração");
        jMenu17.add(jMenuItem12);

        jMenu13.add(jMenu17);

        jMenu26.setText("Remover Candidatura");

        jMenuItem13.setText("Exposição");
        jMenu26.add(jMenuItem13);

        jMenuItem14.setText("Demontração");
        jMenu26.add(jMenuItem14);

        jMenu13.add(jMenu26);

        jMenuItem31.setText("Listar Candidaturas Removidas");
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem31);

        jMenuItem30.setText("Atribuir Candidatura");
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem30);

        jMenu20.setText("Avaliar Candidatura");

        jMenuItem17.setText("Exposição");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu20.add(jMenuItem17);

        jMenuItem18.setText("Demonstração");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu20.add(jMenuItem18);

        jMenu13.add(jMenu20);

        jMenu23.setText("Decidir Candidatura");

        jMenuItem19.setText("Exposição");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu23.add(jMenuItem19);

        jMenuItem20.setText("Demonstração");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu23.add(jMenuItem20);

        jMenu13.add(jMenu23);

        jMenuBar1.add(jMenu13);

        jMenu32.setText("Stands");

        jMenuItem6.setText("Criar Stand");
        jMenu32.add(jMenuItem6);

        jMenuItem7.setText("Confirmar Interesse em Stand");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu32.add(jMenuItem7);

        jMenuItem8.setText("Atribuir Stand");
        jMenu32.add(jMenuItem8);

        jMenuBar1.add(jMenu32);

        jMenu41.setText("Estatistica");
        jMenu41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu41ActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Estatistica Candidatura");
        jMenu41.add(jMenuItem3);

        jMenuItem4.setText("Ranking Keywords");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu41.add(jMenuItem4);

        jMenuItem5.setText("Estatistica FAE");
        jMenu41.add(jMenuItem5);

        jMenuBar1.add(jMenu41);

        jMenuBar1.add(Box.createGlue());
        jMenu9.setText("Perfil");

        jMenuItem1.setText("Alterar Perfil");
        jMenu9.add(jMenuItem1);

        jMenuBar1.add(jMenu9);

        jMenu45.setText("sair");

        jMenuItem2.setText("sair");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu45.add(jMenuItem2);

        jMenuBar1.add(jMenu45);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 899, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        // TODO add your handling code here:
        dispose();
        CriarExposicaoUI c = new CriarExposicaoUI(ce, utilizador);
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        // TODO add your handling code here:

        if (ce.getRegistoExposicoes().getListaExposicoesDoFAE(utilizador).isEmpty()) {
            try {

                throw new IllegalArgumentException("Não é FAE de nenhuma exposição!");

            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(
                        MenuUI.this,
                        ex.getMessage(),
                        "Aviso",
                        JOptionPane.WARNING_MESSAGE);

            }
        }
        FAE fae = null;
        for (Exposicao e : ce.getRegistoExposicoes().getListaExposicoes()) {
            for (FAE f : e.getListaFAES().getListaFAEs()) {
                if (f.getUtilizador().equals(utilizador)) {
                    fae = f;
                }
            }
        }

        dispose();
        AvaliarCandidaturaUI av = new AvaliarCandidaturaUI(ce, fae, "exposicao");

    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:

        if (ce.getRegistoExposicoes().getListaExposicoesDoFAE(utilizador).isEmpty()) {
            try {

                throw new IllegalArgumentException("Não é FAE de nenhuma demonstração!");

            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(
                        MenuUI.this,
                        ex.getMessage(),
                        "Aviso",
                        JOptionPane.WARNING_MESSAGE);

            }
        }
        FAE fae = null;
        for (Exposicao e : ce.getRegistoExposicoes().getListaExposicoes()) {
            for (FAE f : e.getListaFAES().getListaFAEs()) {
                if (f.getUtilizador().equals(utilizador)) {
                    fae = f;
                }
            }
        }

        dispose();
        AvaliarCandidaturaUI av = new AvaliarCandidaturaUI(ce, fae, "demonstracao");

    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        // TODO add your handling code here:
        int cont = 0;
        Organizador organizador = null;
        for (Exposicao e : ce.getRegistoExposicoes().getListaExposicoes()) {
            for (Organizador o : e.getListaOrganizadores().getListaOrganizadores()) {
                if (o.getUtilizador().equals(utilizador)) {
                    cont++;
                    organizador = o;

                }

            }
        }

        if (cont == 0) {
            try {

                throw new IllegalArgumentException("Não é organizador!");

            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(
                        MenuUI.this,
                        ex.getMessage(),
                        "Aviso",
                        JOptionPane.WARNING_MESSAGE);

            }
        } else {
            dispose();
            DecidirCandidaturaUI d = new DecidirCandidaturaUI(ce, organizador, "exposicao");
        }

    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        // TODO add your handling code here:

        int cont = 0;
        Organizador organizador = null;
        for (Exposicao e : ce.getRegistoExposicoes().getListaExposicoes()) {
            for (Organizador o : e.getListaOrganizadores().getListaOrganizadores()) {
                if (o.getUtilizador().equals(utilizador)) {
                    cont++;
                    organizador = o;

                }

            }
        }

        if (cont == 0) {
            try {

                throw new IllegalArgumentException("Não é organizador!");

            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(
                        MenuUI.this,
                        ex.getMessage(),
                        "Aviso",
                        JOptionPane.WARNING_MESSAGE);

            }
        } else {
            dispose();
            DecidirCandidaturaUI d = new DecidirCandidaturaUI(ce, organizador, "demonstracao");
        }
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
//         TODO add your handling code here:
        if (utilizador != null) {
            if (utilizador.getEmail() != null && utilizador.getEmail().equalsIgnoreCase("gestor@centro.pt")) {
                dispose();
                GerarRankingKeywordsUI r = new GerarRankingKeywordsUI(ce, utilizador);
            }
        } else {
            try {

                throw new IllegalArgumentException("Não é gestor de exposição!");

            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(
                        MenuUI.this,
                        ex.getMessage(),
                        "Aviso",
                        JOptionPane.WARNING_MESSAGE);
            }

        }

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenu41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu41ActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_jMenu41ActionPerformed
                                        
    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:

        AtribuirCandidaturasUI ac = new AtribuirCandidaturasUI(MenuUI.this, ce);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // TODO add your handling code here:
        ListarCandRemovidasUI ui = new ListarCandRemovidasUI(this, ce, utilizador.getUsername());
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem30ActionPerformed
        // TODO add your handling code here:
        
        AtribuirCandidaturasUI ac = new AtribuirCandidaturasUI(MenuUI.this,ce);
        
        
    }//GEN-LAST:event_jMenuItem30ActionPerformed

    private void jMenuItem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem31ActionPerformed
        ListarCandRemovidasUI ui = new ListarCandRemovidasUI(this, ce, utilizador.getUsername());
    }//GEN-LAST:event_jMenuItem31ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
ConfirmarStandUI ui = new ConfirmarStandUI(this, ce, utilizador.getUsername());
    }//GEN-LAST:event_jMenuItem7ActionPerformed

//    /**
//     * @param args the command line arguments
//     */
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
//            java.util.logging.Logger.getLogger(MenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MenuUI().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu20;
    private javax.swing.JMenu jMenu23;
    private javax.swing.JMenu jMenu26;
    private javax.swing.JMenu jMenu32;
    private javax.swing.JMenu jMenu35;
    private javax.swing.JMenu jMenu38;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu41;
    private javax.swing.JMenu jMenu45;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
private javax.swing.JMenuItem jMenuItem7;
}
