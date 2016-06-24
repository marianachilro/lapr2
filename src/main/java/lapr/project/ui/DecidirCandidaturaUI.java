/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import lapr.project.controller.DecidirCandidaturaController;
import lapr.project.model.Avaliacao;
import lapr.project.model.Candidatura;
import lapr.project.model.CandidaturaDemonstracao;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ExposicaoEstado;
import lapr.project.model.Organizador;


/**
 *
 * @author catarinarib
 */
public class DecidirCandidaturaUI extends javax.swing.JFrame {

    private final String tpCand;
    private final CentroExposicoes ce;
    private Organizador organizador;
    private final DecidirCandidaturaController controller;
    private Exposicao exposicao;
    private MenuUI menu;
    private CandidaturaExposicao candExp;
    private CandidaturaDemonstracao candDemo;
    private  ExposicaoEstado es;

    /**
     * Creates new form DecidirCandidaturaUI
     *
     * @param ce
     * @param org
     * @param tpCand
     */
    public DecidirCandidaturaUI(final CentroExposicoes ce, final Organizador org, String tpCand) {
        this.tpCand = tpCand;
        this.ce = ce;
        this.organizador = org;
        this.controller = new DecidirCandidaturaController(ce, organizador);

        initComponents();
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int result = JOptionPane.showConfirmDialog(
                        DecidirCandidaturaUI.this, "Tem a certeza?");
                if (result == JOptionPane.OK_OPTION) {

                    DecidirCandidaturaUI.this.setDefaultCloseOperation(
                            JDialog.DISPOSE_ON_CLOSE);
                    DecidirCandidaturaUI.this.setVisible(false);
                    DecidirCandidaturaUI.this.dispose();
                    JFrame MenuUI = new MenuUI(ce, organizador.getUtilizador());
                } else if (result == JOptionPane.CANCEL_OPTION) {
                    DecidirCandidaturaUI.this.setDefaultCloseOperation(
                            JDialog.DO_NOTHING_ON_CLOSE);
                } else if (result == JOptionPane.NO_OPTION) {
                    DecidirCandidaturaUI.this.setDefaultCloseOperation(
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

        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        label2 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        label3 = new java.awt.Label();
        textArea1 = new java.awt.TextArea();
        label4 = new java.awt.Label();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Decidir Candidatura"));

        label1.setText("Exposição:");

        String [] exposicoes = new String[100];
        int i=0;
        if(!controller.getListaExposicoesOrganizador().isEmpty()){
            for(Exposicao e : controller.getListaExposicoesOrganizador()){
                exposicoes[i]=e.getTitulo();
                i++;
            }
        }
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(exposicoes));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        label2.setText("Candidaturas:");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);
        jList1.setEnabled(false);

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setText("Continuar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        label3.setText("Avaliações dos FAEs sobre a candidatura:");

        label4.setBackground(new java.awt.Color(153, 153, 255));
        label4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label4.setText("Decisão:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aceita","Não Aceita" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setText("Continuar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 153, 255));
        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 153, 255));
        jButton4.setText("Guardar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(45, Short.MAX_VALUE))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(167, 167, 167))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        textArea1.setEditable(false);
        jComboBox2.setEnabled(false);
        jButton2.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                String expo = jComboBox1.getSelectedItem() + "";

                if (!expo.isEmpty()) {
                    for (Exposicao e : controller.getListaExposicoesOrganizador()) {

                        if (e.getTitulo().equalsIgnoreCase(expo)) {
                            exposicao = e;
                        }

                    }

                }
                 es = exposicao.getEstado();
                controller.selectExposicao(exposicao);
                if (controller.getDecisivel().isEmpty() && !es.setExposicaoCandidaturasAtribuidas() && es.setExposicaoCandidaturasAvaliadas() || controller.getDecisivel().isEmpty() && !es.setDemonstracaoCandidaturasAtribuidas() && es.setDemonstracaoCandidaturasAvaliadas()) {
                   
                    try {

                        throw new IllegalArgumentException("Não tem candidaturas para decidir!\n"
                                + "OU ainda não foram avaliadas!");

                    } catch (IllegalArgumentException ex) {
                        JOptionPane.showMessageDialog(
                                menu,
                                ex.getMessage(),
                                "Aviso",
                                JOptionPane.WARNING_MESSAGE);

                    }
                } else if(es.setExposicaoCandidaturasAvaliadas()==true || es.setDemonstracaoCandidaturasAvaliadas()==true){

                    final String[] candidaturas = new String[100];
                    int cont = 0;

                    if (!controller.getDecisivel().isEmpty()) {
                        for (Candidatura c : controller.getDecisivel()) {
                            candidaturas[cont] = c.toString();
                            cont++;
                        }
                    }

                    jList1.setModel(new javax.swing.AbstractListModel<String>() {

                        @Override
                        public int getSize() {
                            return candidaturas.length;
                        }

                        @Override
                        public String getElementAt(int i) {
                            return candidaturas[i];
                        }
                    });

                    jComboBox1.setEnabled(false);
                    jList1.setEnabled(true);
                    jButton1.setEnabled(false);
                    jButton2.setEnabled(true);
                }

            }
        }
        );
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        if (jList1.getSelectedValue() == null) {
            try {

                throw new IllegalArgumentException("Selecione uma candidatura!");

            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(
                        menu,
                        ex.getMessage(),
                        "Aviso",
                        JOptionPane.WARNING_MESSAGE);

            }
        } else {

            jList1.setEnabled(false);
            jButton2.setEnabled(false);

            if (!controller.getDecisivel().isEmpty()) {
                for (Candidatura c : controller.getDecisivel()) {
                    if (c.getEmailRep().equalsIgnoreCase(jList1.getSelectedValue())) {
                        controller.selectCandidatura(c);
                        if (tpCand.equalsIgnoreCase("exposicao")) {
                            this.candExp = (CandidaturaExposicao) c;
                        } else {
                            this.candDemo = (CandidaturaDemonstracao) c;
                        }
                    }
                }
            }

            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {

                    String texto = "";
                    for (Avaliacao a : controller.getListaAvaliacoesDaCandidatura()) {
                        texto = texto + a.toString() + "\n";
                    }

                    textArea1.setText(texto);

                    textArea1.setEditable(false);
                    jComboBox2.setEnabled(true);

                    jButton4.setEnabled(true);

                }
            }
            );
            jButton2.setEnabled(false);
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
        MenuUI m = new MenuUI(ce, organizador.getUtilizador());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {
            if (tpCand.equalsIgnoreCase("exposicao")) {
                if (candExp.getContador() == 0) {
                    if (jComboBox2.getSelectedItem().toString().equalsIgnoreCase("Não Aceita")) {
                        controller.setDecisao(false);
                    } else {
                        controller.setDecisao(true);
                    }

                    JOptionPane.showMessageDialog(menu, "Decisão registada!");
                    dispose();

                    MenuUI j = new MenuUI(ce, this.organizador.getUtilizador());
                } else {
                    throw new IllegalArgumentException("Esta Candidatura já foi decidida!");
                }
            } else if (candDemo.getContador() == 0) {
                if (jComboBox2.getSelectedItem().toString().equalsIgnoreCase("Não Aceita")) {
                    controller.setDecisao(false);
                } else {
                    controller.setDecisao(true);
                }
                JOptionPane.showMessageDialog(menu, "Decisão registada!");
                dispose();

                MenuUI j = new MenuUI(ce, this.organizador.getUtilizador());
            } else {
                throw new IllegalArgumentException("Esta Candidatura já foi decidida!");
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(
                    menu,
                    "Tem que introduzir números válidos.",
                    "Aviso",
                    JOptionPane.WARNING_MESSAGE);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(
                    menu,
                    ex.getMessage(),
                    "Aviso",
                    JOptionPane.WARNING_MESSAGE);

        }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

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
//            java.util.logging.Logger.getLogger(DecidirCandidaturaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DecidirCandidaturaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DecidirCandidaturaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DecidirCandidaturaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//       
//                new DecidirCandidaturaUI(ce, organizador, tpCand).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables
}
