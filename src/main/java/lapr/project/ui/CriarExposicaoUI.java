/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import lapr.project.controller.CriarExposicaoController;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaOrganizadores;
import lapr.project.model.Local;
import lapr.project.model.RegistoUtilizadores;
import lapr.project.model.Utilizador;
import lapr.project.utils.Data;

/**
 *
 * @author catarinarib
 */
public class CriarExposicaoUI extends javax.swing.JFrame {

    private final CentroExposicoes ce;
    private MenuUI menu;
    private Utilizador utilizador;

    /**
     * Creates new form CriarExposicaoUI
     *
     * @param ce
     * @param u
     */
    public CriarExposicaoUI(final CentroExposicoes ce, Utilizador u) {
        this.ce = ce;
        this.utilizador = u;
        initComponents();
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int result = JOptionPane.showConfirmDialog(
                        CriarExposicaoUI.this, "Tem a certeza?");
                if (result == JOptionPane.OK_OPTION) {

                    CriarExposicaoUI.this.setDefaultCloseOperation(
                            JDialog.DISPOSE_ON_CLOSE);
                    CriarExposicaoUI.this.setVisible(false);
                    CriarExposicaoUI.this.dispose();
                    JFrame MenuUI = new MenuUI(ce, utilizador);
                } else if (result == JOptionPane.CANCEL_OPTION) {
                    CriarExposicaoUI.this.setDefaultCloseOperation(
                            JDialog.DO_NOTHING_ON_CLOSE);
                } else if (result == JOptionPane.NO_OPTION) {
                    CriarExposicaoUI.this.setDefaultCloseOperation(
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
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        label8 = new java.awt.Label();
        label7 = new java.awt.Label();
        textField8 = new java.awt.TextField();
        jLabel8 = new javax.swing.JLabel();
        textField7 = new java.awt.TextField();
        jLabel7 = new javax.swing.JLabel();
        textField5 = new java.awt.TextField();
        jLabel5 = new javax.swing.JLabel();
        textField4 = new java.awt.TextField();
        jLabel3 = new javax.swing.JLabel();
        label6 = new java.awt.Label();
        label5 = new java.awt.Label();
        jSeparator1 = new javax.swing.JSeparator();
        textField3 = new java.awt.TextField();
        label4 = new java.awt.Label();
        jLabel4 = new javax.swing.JLabel();
        textField2 = new java.awt.TextField();
        label3 = new java.awt.Label();
        jLabel2 = new javax.swing.JLabel();
        textArea1 = new java.awt.TextArea();
        label2 = new java.awt.Label();
        textField1 = new java.awt.TextField();
        label1 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        String [] locais = new String[100];
        int i=0;
        if(!ce.getRegistoLocais().getListaLocais().isEmpty()){
            for(Local l : ce.getRegistoLocais().getListaLocais()){
                locais[i]=l.getNome();
                i++;
            }
        }
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(locais));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(110, 250, 150, 20);

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(220, 570, 90, 30);

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(330, 570, 90, 30);

        label8.setText("Local:");
        jPanel1.add(label8);
        label8.setBounds(30, 250, 60, 20);

        label7.setText("Organizadores:");
        jPanel1.add(label7);
        label7.setBounds(30, 280, 90, 20);
        jPanel1.add(textField8);
        textField8.setBounds(220, 510, 160, 20);

        jLabel8.setText(".Fim de Avaliação de Candidaturas:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 510, 200, 20);
        jPanel1.add(textField7);
        textField7.setBounds(220, 480, 160, 20);

        jLabel7.setText(".Fim de Atualização de Conflitos:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 480, 200, 20);
        jPanel1.add(textField5);
        textField5.setBounds(220, 450, 160, 20);

        jLabel5.setText(".Fim Submissão de Candidaturas:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 450, 210, 20);
        jPanel1.add(textField4);
        textField4.setBounds(220, 420, 160, 20);

        jLabel3.setText(". Inicio Submissão de Candidaturas:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 420, 210, 20);

        label6.setText("Ex: aaaa/mm/dd-hh:mm:ss");
        jPanel1.add(label6);
        label6.setBounds(220, 390, 160, 20);

        label5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label5.setText("Datas:");
        jPanel1.add(label5);
        label5.setBounds(10, 390, 50, 20);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 370, 440, 10);
        jPanel1.add(textField3);
        textField3.setBounds(110, 220, 150, 20);

        label4.setText("Data Fim:");
        jPanel1.add(label4);
        label4.setBounds(30, 220, 70, 20);

        jLabel4.setText("Ex: aaaa/mm/dd-hh:mm:ss");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(270, 230, 150, 14);
        jPanel1.add(textField2);
        textField2.setBounds(110, 190, 150, 20);

        label3.setText("Data Inicio:");
        jPanel1.add(label3);
        label3.setBounds(30, 190, 70, 20);

        jLabel2.setText("Ex: aaaa/mm/dd-hh:mm:ss");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(270, 190, 160, 20);
        jPanel1.add(textArea1);
        textArea1.setBounds(120, 120, 200, 50);

        label2.setText("Descrição:");
        jPanel1.add(label2);
        label2.setBounds(50, 120, 60, 20);
        jPanel1.add(textField1);
        textField1.setBounds(140, 90, 160, 20);

        label1.setText("Título:");
        jPanel1.add(label1);
        label1.setBounds(70, 90, 50, 20);

        final String[] utilizadores = new String [100];

        int cont=0;
        if(!ce.getRegistoUtilizadores().getListaUtilizadores().isEmpty()){
            for(Utilizador u : ce.getRegistoUtilizadores().getListaUtilizadores()){
                utilizadores[cont]=u.getUsername();
                cont++;
            }
        }
        jList1.setModel(new javax.swing.AbstractListModel<String>() {

            public int getSize() { return utilizadores.length; }
            public String getElementAt(int i) { return utilizadores[i]; }
        });
        jList1.setSelectionModel(new DefaultListSelectionModel() {
            @Override
            public void setSelectionInterval(int index0, int index1) {
                if(super.isSelectedIndex(index0)) {
                    super.removeSelectionInterval(index0, index1);
                }
                else {
                    super.addSelectionInterval(index0, index1);
                }
            }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 300, 240, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/criarExposicao2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 420, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
        MenuUI j = new MenuUI(ce, this.utilizador);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            CriarExposicaoController controller = new CriarExposicaoController(ce);
            controller.newExposicao();

            RegistoUtilizadores ru = controller.getRegistoUtilizadores();

            String titulo = textField1.getText();
            String descricao = textArea1.getText();
            Data dataIni = getData(textField2.getText());
            Data dataFim = getData(textField3.getText());
            String local1 = jComboBox2.getSelectedItem().toString();
            Local local = null;

            if(!ce.getRegistoExposicoes().getListaExposicoes().isEmpty()){
            for (Exposicao e : ce.getRegistoExposicoes().getListaExposicoes()) {
                if (e.getLocal().getNome().equalsIgnoreCase(local1)) {
                    if (e.getDataInicio().getAno() == dataIni.getAno() && e.getDataInicio().getMes() == dataIni.getMes() && e.getDataInicio().getDia() == dataIni.getDia()) {
                        if (dataIni.getHora() < e.getDataInicio().getHora() && dataFim.getHora() > e.getDataInicio().getHora()
                                || dataIni.getHora() == e.getDataInicio().getHora() && dataFim.getHora() == e.getDataInicio().getHora() && dataIni.getMinuto() < e.getDataInicio().getMinuto() && dataFim.getMinuto() > e.getDataInicio().getMinuto()
                                || dataIni.getHora() == e.getDataInicio().getHora() && dataFim.getHora() == e.getDataInicio().getHora() && dataIni.getMinuto() == e.getDataInicio().getMinuto() && dataFim.getMinuto() == e.getDataInicio().getMinuto() && dataIni.getSegundos() < e.getDataInicio().getSegundos() && dataFim.getSegundos() > e.getDataInicio().getSegundos()) {

                            throw new IllegalArgumentException("Já existe uma exposição neste local à mesma hora!");

                        } else if (dataIni.getHora() > e.getDataInicio().getHora() && dataFim.getHora() > e.getDataFim().getHora() && dataIni.getHora() < e.getDataFim().getHora()
                                || dataIni.getHora() == e.getDataFim().getHora() && dataIni.getMinuto() < e.getDataFim().getMinuto() && dataIni.getHora() == e.getDataInicio().getHora() && dataIni.getMinuto() > e.getDataInicio().getMinuto() && dataFim.getHora() == e.getDataFim().getHora() && dataFim.getMinuto() > e.getDataFim().getMinuto()
                                || dataIni.getHora() == e.getDataFim().getHora() && dataIni.getMinuto() == e.getDataFim().getMinuto() && dataIni.getSegundos() < e.getDataFim().getSegundos() && dataIni.getHora() == e.getDataInicio().getHora() && dataIni.getMinuto() == e.getDataInicio().getMinuto() && dataIni.getSegundos() > e.getDataInicio().getSegundos() && dataFim.getHora() == e.getDataFim().getHora() && dataFim.getMinuto() == e.getDataFim().getMinuto() && dataFim.getSegundos() > e.getDataFim().getSegundos()) {

                            throw new IllegalArgumentException("Já existe uma exposição neste local à mesma hora!");

                        } else if (dataIni.getHora() > e.getDataInicio().getHora() && dataFim.getHora() < e.getDataFim().getHora()
                                || dataIni.getHora() == e.getDataInicio().getHora() && dataIni.getMinuto() > e.getDataInicio().getMinuto() && dataFim.getHora() == e.getDataFim().getHora() && dataFim.getMinuto() < e.getDataFim().getMinuto()
                                || dataIni.getHora() == e.getDataInicio().getHora() && dataIni.getMinuto() == e.getDataInicio().getMinuto() && dataIni.getSegundos() > e.getDataInicio().getSegundos() && dataFim.getHora() == e.getDataFim().getHora() && dataFim.getMinuto() == e.getDataFim().getMinuto() && dataFim.getSegundos() < e.getDataFim().getSegundos()) {

                            throw new IllegalArgumentException("Já existe uma exposição neste local à mesma hora!");

                        } else if (dataIni.getHora() == e.getDataInicio().getHora() && dataIni.getMinuto() == e.getDataInicio().getMinuto() && dataIni.getSegundos() == e.getDataInicio().getSegundos()
                                || dataIni.getHora() == e.getDataInicio().getHora() && dataIni.getMinuto() == e.getDataInicio().getMinuto() && dataIni.getSegundos() == e.getDataInicio().getSegundos() && dataFim.getHora() == e.getDataFim().getHora() && dataFim.getMinuto() == e.getDataFim().getMinuto() && dataFim.getSegundos() == e.getDataFim().getSegundos()
                                || dataFim.getHora() == e.getDataFim().getHora() && dataFim.getMinuto() == e.getDataFim().getMinuto() && dataFim.getSegundos() == e.getDataFim().getSegundos()) {
                            throw new IllegalArgumentException("Já existe uma exposição neste local à mesma hora!");
                        }

                    }
                }
            }
            }

            if (!controller.getRegistoLocais().getListaLocais().isEmpty()) {
                for (Local c : controller.getRegistoLocais().getListaLocais()) {
                    if (c.getNome().equalsIgnoreCase(local1)) {
                        local = c;
                    }
                }
            }
            controller.setLocal(local);

            ListaOrganizadores lista = controller.getListaOrganizadores();

            List<String> organizadores = jList1.getSelectedValuesList();
            if (organizadores.size() < 2) {
                throw new IllegalArgumentException("Tem de escolher pelo menos dois organizadores!");
            }
            boolean b = false;
            for (String s : organizadores) {
                for (Utilizador u : ru.getListaUtilizadores()) {
                    if (u.getUsername().equalsIgnoreCase(s)) {
                        b = controller.addOrganizador(u);
                    }
                }
            }

            Data dataInicioSubCand = getData(textField4.getText());
            Data dataFimSubCand = getData(textField5.getText());
            Data dataAtcConflitos = getData(textField7.getText());
            Data dataAv = getData(textField8.getText());

            validarDatas(dataIni, dataFim, dataInicioSubCand, dataFimSubCand, dataAtcConflitos, dataAv);

            controller.setDadosExposicao(titulo, descricao, dataIni, dataFim, local, dataInicioSubCand, dataFimSubCand, dataAtcConflitos, dataAv);

            if (controller.registaExposicao()) {

                JOptionPane.showMessageDialog(menu, "Exposição registada!");
                dispose();

                MenuUI j = new MenuUI(ce, this.utilizador);
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


    }//GEN-LAST:event_jButton1ActionPerformed

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
//            java.util.logging.Logger.getLogger(CriarExposicaoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CriarExposicaoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CriarExposicaoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CriarExposicaoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CriarExposicaoUI().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.TextArea textArea1;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    private java.awt.TextField textField4;
    private java.awt.TextField textField5;
    private java.awt.TextField textField7;
    private java.awt.TextField textField8;
    // End of variables declaration//GEN-END:variables

    public Data getData(String data) {

        if (data == null || data.trim().isEmpty() || !Pattern.matches("(\\d{4})/(\\d{2})/(\\d{2})-(\\d{2}):(\\d{2}):(\\d{2})", data)) {
            throw new IllegalArgumentException("Data inválida! \nano/mes/dia-horas:minutos:segundos");
        }

        ArrayList all = new ArrayList(Arrays.asList(data.split("-")));
        String ano_mes_dia = all.get(0) + "";
        String hora_minutos_segundos = all.get(1) + "";

        ArrayList dat = new ArrayList(Arrays.asList(ano_mes_dia.split("/")));
        ArrayList horas = new ArrayList(Arrays.asList(hora_minutos_segundos.split(":")));

        int ano = Integer.parseInt(dat.get(0).toString());
        int mes = Integer.parseInt(dat.get(1).toString());
        int dia = Integer.parseInt(dat.get(2).toString());
        int hora = Integer.parseInt(horas.get(0).toString());
        int minuto = Integer.parseInt(horas.get(1).toString());
        int segundos = Integer.parseInt(horas.get(2).toString());

        Data data2 = new Data(ano, mes, dia, hora, minuto, segundos);

        return data2;
    }

    private void validarDatas(Data dataIni, Data dataFim, Data dataInicioSubCand, Data dataFimSubCand, Data dataAtcConflitos, Data dataAv) {

        if (dataIni.getAno() > dataFim.getAno() || dataIni.getAno() == dataFim.getAno() && dataIni.getMes() > dataFim.getMes()
                || dataIni.getAno() == dataFim.getAno() && dataIni.getMes() == dataFim.getMes() && dataIni.getDia() > dataFim.getDia()
                || dataIni.getAno() == dataFim.getAno() && dataIni.getMes() == dataFim.getMes() && dataIni.getDia() == dataFim.getDia() && dataIni.getHora() > dataFim.getHora()
                || dataIni.getAno() == dataFim.getAno() && dataIni.getMes() == dataFim.getMes() && dataIni.getDia() == dataFim.getDia() && dataIni.getHora() == dataFim.getHora() && dataIni.getMinuto() > dataFim.getMinuto()
                || dataIni.getAno() == dataFim.getAno() && dataIni.getMes() == dataFim.getMes() && dataIni.getDia() == dataFim.getDia() && dataIni.getHora() == dataFim.getHora() && dataIni.getMinuto() == dataFim.getMinuto() && dataIni.getSegundos() > dataFim.getSegundos()
                || dataIni.getAno() == dataFim.getAno() && dataIni.getMes() == dataFim.getMes() && dataIni.getDia() == dataFim.getDia() && dataIni.getHora() == dataFim.getHora() && dataIni.getMinuto() == dataFim.getMinuto() && dataIni.getSegundos() == dataFim.getSegundos()) {

            throw new IllegalArgumentException("Data Fim inválida!\n Data Fim é menor que a data Inicio ou igual!");

        } else if (dataInicioSubCand.getAno() > dataFimSubCand.getAno() || dataInicioSubCand.getAno() == dataFimSubCand.getAno() && dataInicioSubCand.getMes() > dataFimSubCand.getMes()
                || dataInicioSubCand.getAno() == dataFimSubCand.getAno() && dataInicioSubCand.getMes() == dataFimSubCand.getMes() && dataInicioSubCand.getDia() > dataFimSubCand.getDia()
                || dataInicioSubCand.getAno() == dataFimSubCand.getAno() && dataInicioSubCand.getMes() == dataFimSubCand.getMes() && dataInicioSubCand.getDia() == dataFimSubCand.getDia() && dataInicioSubCand.getHora() > dataFimSubCand.getHora()
                || dataInicioSubCand.getAno() == dataFimSubCand.getAno() && dataInicioSubCand.getMes() == dataFimSubCand.getMes() && dataInicioSubCand.getDia() == dataFimSubCand.getDia() && dataInicioSubCand.getHora() == dataFimSubCand.getHora() && dataInicioSubCand.getMinuto() > dataFimSubCand.getMinuto()
                || dataInicioSubCand.getAno() == dataFimSubCand.getAno() && dataInicioSubCand.getMes() == dataFimSubCand.getMes() && dataInicioSubCand.getDia() == dataFimSubCand.getDia() && dataInicioSubCand.getHora() == dataFimSubCand.getHora() && dataInicioSubCand.getMinuto() == dataFimSubCand.getMinuto() && dataInicioSubCand.getSegundos() > dataFimSubCand.getSegundos()
                || dataInicioSubCand.getAno() == dataFimSubCand.getAno() && dataInicioSubCand.getMes() == dataFimSubCand.getMes() && dataInicioSubCand.getDia() == dataFimSubCand.getDia() && dataInicioSubCand.getHora() == dataFimSubCand.getHora() && dataInicioSubCand.getMinuto() == dataFimSubCand.getMinuto() && dataInicioSubCand.getSegundos() == dataFimSubCand.getSegundos()) {

            throw new IllegalArgumentException("Data Fim Submissão de candidaturas inválida!\n Data Fim Submissão de candidaturas é menor que a data Inicio de submissão de candidaturas ou igual!");

        } else if (dataFimSubCand.getAno() > dataAtcConflitos.getAno() || dataFimSubCand.getAno() == dataAtcConflitos.getAno() && dataFimSubCand.getMes() > dataAtcConflitos.getMes()
                || dataFimSubCand.getAno() == dataAtcConflitos.getAno() && dataFimSubCand.getMes() == dataAtcConflitos.getMes() && dataFimSubCand.getDia() > dataAtcConflitos.getDia()
                || dataFimSubCand.getAno() == dataAtcConflitos.getAno() && dataFimSubCand.getMes() == dataAtcConflitos.getMes() && dataFimSubCand.getDia() == dataAtcConflitos.getDia() && dataFimSubCand.getHora() > dataAtcConflitos.getHora()
                || dataFimSubCand.getAno() == dataAtcConflitos.getAno() && dataFimSubCand.getMes() == dataAtcConflitos.getMes() && dataFimSubCand.getDia() == dataAtcConflitos.getDia() && dataFimSubCand.getHora() == dataAtcConflitos.getHora() && dataFimSubCand.getMinuto() > dataAtcConflitos.getMinuto()
                || dataFimSubCand.getAno() == dataAtcConflitos.getAno() && dataFimSubCand.getMes() == dataAtcConflitos.getMes() && dataFimSubCand.getDia() == dataAtcConflitos.getDia() && dataFimSubCand.getHora() == dataAtcConflitos.getHora() && dataFimSubCand.getMinuto() == dataAtcConflitos.getMinuto() && dataFimSubCand.getSegundos() > dataAtcConflitos.getSegundos()
                || dataFimSubCand.getAno() == dataAtcConflitos.getAno() && dataFimSubCand.getMes() == dataAtcConflitos.getMes() && dataFimSubCand.getDia() == dataAtcConflitos.getDia() && dataFimSubCand.getHora() == dataAtcConflitos.getHora() && dataFimSubCand.getMinuto() == dataAtcConflitos.getMinuto() && dataFimSubCand.getSegundos() == dataAtcConflitos.getSegundos()) {

            throw new IllegalArgumentException("Data de atualização de conflitos inválida!\n Data de atualização de conflitos é menor que a data fim de submissão de candidaturas ou igual!");

        } else if (dataAtcConflitos.getAno() > dataAv.getAno() || dataAtcConflitos.getAno() == dataAv.getAno() && dataAtcConflitos.getMes() > dataAv.getMes()
                || dataAtcConflitos.getAno() == dataAv.getAno() && dataAtcConflitos.getMes() == dataAv.getMes() && dataAtcConflitos.getDia() > dataAv.getDia()
                || dataAtcConflitos.getAno() == dataAv.getAno() && dataAtcConflitos.getMes() == dataAv.getMes() && dataAtcConflitos.getDia() == dataAv.getDia() && dataAtcConflitos.getHora() > dataAv.getHora()
                || dataAtcConflitos.getAno() == dataAv.getAno() && dataAtcConflitos.getMes() == dataAv.getMes() && dataAtcConflitos.getDia() == dataAv.getDia() && dataAtcConflitos.getHora() == dataAv.getHora() && dataAtcConflitos.getMinuto() > dataAv.getMinuto()
                || dataAtcConflitos.getAno() == dataAv.getAno() && dataAtcConflitos.getMes() == dataAv.getMes() && dataAtcConflitos.getDia() == dataAv.getDia() && dataAtcConflitos.getHora() == dataAv.getHora() && dataAtcConflitos.getMinuto() == dataAv.getMinuto() && dataAtcConflitos.getSegundos() > dataAv.getSegundos()
                || dataAtcConflitos.getAno() == dataAv.getAno() && dataAtcConflitos.getMes() == dataAv.getMes() && dataAtcConflitos.getDia() == dataAv.getDia() && dataAtcConflitos.getHora() == dataAv.getHora() && dataAtcConflitos.getMinuto() == dataAv.getMinuto() && dataAtcConflitos.getSegundos() == dataAv.getSegundos()) {

            throw new IllegalArgumentException("Data de avaliação inválida!\n Data de avaliação é menor que a data de atualização de conflitos ou igual!");

        } else if (dataAv.getAno() > dataIni.getAno() || dataAv.getAno() == dataIni.getAno() && dataAv.getMes() > dataIni.getMes()
                || dataAv.getAno() == dataIni.getAno() && dataAv.getMes() == dataIni.getMes() && dataAv.getDia() > dataIni.getDia()
                || dataAv.getAno() == dataIni.getAno() && dataAv.getMes() == dataIni.getMes() && dataAv.getDia() == dataIni.getDia() && dataAv.getHora() > dataIni.getHora()
                || dataAv.getAno() == dataIni.getAno() && dataAv.getMes() == dataIni.getMes() && dataAv.getDia() == dataIni.getDia() && dataAv.getHora() == dataIni.getHora() && dataAv.getMinuto() > dataIni.getMinuto()
                || dataAv.getAno() == dataIni.getAno() && dataAv.getMes() == dataIni.getMes() && dataAv.getDia() == dataIni.getDia() && dataAv.getHora() == dataIni.getHora() && dataAv.getMinuto() == dataIni.getMinuto() && dataAv.getSegundos() > dataIni.getSegundos()
                || dataAv.getAno() == dataIni.getAno() && dataAv.getMes() == dataIni.getMes() && dataAv.getDia() == dataIni.getDia() && dataAv.getHora() == dataIni.getHora() && dataAv.getMinuto() == dataIni.getMinuto() && dataAv.getSegundos() == dataIni.getSegundos()) {

            throw new IllegalArgumentException("As últimas quatro datas têm de ser anteriores à data de início da exposição!");

        }

    }

}
