/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import lapr.project.controller.GerarRankingKeywordsController;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ExposicaoEstado;
import lapr.project.model.ExposicaoInicialEstado;
import lapr.project.model.Utilizador;


/**
 *
 * @author catarinarib
 */
public class GerarRankingKeywordsUI extends javax.swing.JFrame {

    private final CentroExposicoes ce;
    private Exposicao exposicao;
    private MenuUI menu;
    private final GerarRankingKeywordsController controller;
    private Utilizador utilizador;
    private  ExposicaoEstado es;

    /**
     * Creates new form GerarRankingKeywordsUI
     *
     * @param ce
     * @param u
     */
    public GerarRankingKeywordsUI(final CentroExposicoes ce, Utilizador u) {

        this.ce = ce;
        this.controller = new GerarRankingKeywordsController(ce);
        this.utilizador = u;
        initComponents();

        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int result = JOptionPane.showConfirmDialog(
                        GerarRankingKeywordsUI.this, "Tem a certeza?");
                if (result == JOptionPane.OK_OPTION) {

                    GerarRankingKeywordsUI.this.setDefaultCloseOperation(
                            JDialog.DISPOSE_ON_CLOSE);
                    GerarRankingKeywordsUI.this.setVisible(false);
                    GerarRankingKeywordsUI.this.dispose();
                    JFrame MenuUI = new MenuUI(ce, utilizador);
                } else if (result == JOptionPane.CANCEL_OPTION) {
                    GerarRankingKeywordsUI.this.setDefaultCloseOperation(
                            JDialog.DO_NOTHING_ON_CLOSE);
                } else if (result == JOptionPane.NO_OPTION) {
                    GerarRankingKeywordsUI.this.setDefaultCloseOperation(
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
        jComboBox1 = new javax.swing.JComboBox<>();
        label1 = new java.awt.Label();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ranking", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        String [] exposicoes = new String[100];
        int i=0;
        if(!controller.getListaExposicoes().isEmpty()){
            for(Exposicao e : controller.getListaExposicoes()){
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

        label1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label1.setText("Exposição:");

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setText("Continuar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {

            String expo = jComboBox1.getSelectedItem() + "";

            if (!expo.isEmpty()) {
                for (Exposicao e : ce.getRegistoExposicoes().getListaExposicoes()) {

                    if (e.getTitulo().equalsIgnoreCase(expo)) {
                        exposicao = e;
                    }

                }

            }

             es = exposicao.getEstado();
            
            try {
                
                if(!es.equals(new ExposicaoInicialEstado(exposicao)) && !es.setCriada() && !es.setFaeSemDemo() && !es.setDemoSemFae() && !es.setCompleta() && !es.setExposicaoCandidaturasAbertas() && !es.setExposicaoCandidaturasFechadas() && !es.setExposicaoConflitosDetetados() && !es.setExposicaoConflitosAtualizados() && !es.setExposicaoCandidaturasAvaliadas() && es.setExposicaoCandidaturasDecididas()|| 
                        !es.equals(new ExposicaoInicialEstado(exposicao)) && !es.setCriada() && !es.setFaeSemDemo() && !es.setDemoSemFae() && !es.setCompleta() && !es.setExposicaoCandidaturasAbertas() && !es.setExposicaoCandidaturasFechadas() && !es.setExposicaoConflitosDetetados() && !es.setExposicaoConflitosAtualizados() && !es.setExposicaoCandidaturasAvaliadas() && !es.setExposicaoCandidaturasDecididas()){
                
                controller.selectExposicao(exposicao);
                JOptionPane.showMessageDialog(menu, "Ficheiro CSV criado!");
                    dispose();

                    MenuUI j = new MenuUI(ce,utilizador);
                }else{
                    throw new IllegalArgumentException("Candidaturas não foram decididas!");
                }
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(GerarRankingKeywordsUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(
                    menu,
                    ex.getMessage(),
                    "Aviso",
                    JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:

        if (controller.getListaExposicoes().isEmpty()) {
            try {

                throw new IllegalArgumentException("Não existe exposições!");

            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(
                        menu,
                        ex.getMessage(),
                        "Aviso",
                        JOptionPane.WARNING_MESSAGE);

            }
        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

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
//            java.util.logging.Logger.getLogger(GerarRankingKeywordsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GerarRankingKeywordsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GerarRankingKeywordsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GerarRankingKeywordsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//               CentroExposicoes ce = new CentroExposicoes();
//        Utilizador gestor = new Utilizador(2, "Gestor", "gestor", "gestor@centro.pt", "aA;1", "ddddd");
//        ce.getRegistoUtilizadores().getListaUtilizadores().add(gestor);
//        Utilizador u = new Utilizador(2, "joao", "jo", "jo@centro.pt", "aB;1", "dpddd");
//        ce.getRegistoUtilizadores().getListaUtilizadores().add(u);
//        Utilizador u1 = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
//        ce.getRegistoUtilizadores().addUtilizador(u1);
//        Local l = new Local("Porto");
//        ce.getRegistoLocais().addLocal(l);
//        Data dati = new Data(2016, 07, 21, 20, 20, 20);
//        Data datf = new Data(2016, 07, 21, 20, 20, 23);
//        Exposicao exp = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
//                dati, dati);
//        ce.getRegistoExposicoes().getListaExposicoes().add(exp);
//        exp.addOrganizador(u);
//        exp.addOrganizador(u1);
//        CandidaturaExposicao cex = new CandidaturaExposicao("rep@centro.pt", "nome empresa", "morada", 919999999, 23, 5);
//        exp.getListaCandidaturas().getListCandidaturas().add(cex);
//        CandidaturaExposicao cex3 = new CandidaturaExposicao("rep3@centro.pt", "nome empresa3", "morada3", 919999999, 23, 5);
//        exp.getListaCandidaturas().getListCandidaturas().add(cex3);
//        CandidaturaExposicao cex2 = new CandidaturaExposicao("rep2@centro.pt", "nome empresa2", "morada2", 919999999, 50, 2);
//        exp.getListaCandidaturas().getListCandidaturas().add(cex2);
//        cex.setDecisao(true);
//        cex3.setDecisao(true);
//        Keyword k = new Keyword("luz");
//        Keyword k1 = new Keyword("carro");
//        Keyword k3 = new Keyword("agua");
//        Keyword k4 = new Keyword("motas");
//        cex.getListaKeywords().addKeyword(k);
//        cex.getListaKeywords().addKeyword(k3);
//        cex3.getListaKeywords().addKeyword(k);
//        cex3.getListaKeywords().addKeyword(k4);
//        cex2.getListaKeywords().addKeyword(k1);
//        cex2.getListaKeywords().addKeyword(k4);
//        cex2.getListaKeywords().addKeyword(k);
//        cex2.getListaKeywords().addKeyword(k3);
//        Avaliacao a = new Avaliacao();
//        cex.getListaAvaliacoes().getListaAvaliacao().add(a);
//        FAE fae = new FAE(u1);
//        exp.getListaFAES().getListaFAEs().add(fae);GerarRankingKeywordsUI(ce, u).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
