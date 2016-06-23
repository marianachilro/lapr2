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
import lapr.project.controller.AvaliarCandidaturaController;
import lapr.project.model.Atribuicao;
import lapr.project.model.Candidatura;
import lapr.project.model.CandidaturaDemonstracao;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ExposicaoEstado;
import lapr.project.model.FAE;


/**
 *
 * @author catarinarib
 */
public class AvaliarCandidaturaUI extends javax.swing.JFrame {

    private final CentroExposicoes ce;
    private MenuUI menu;
    private Exposicao exposicao;
    private FAE fae;
    private CandidaturaExposicao candExp;
    private CandidaturaDemonstracao candDemo;
    private final AvaliarCandidaturaController controller;
    private String tpCand;
    private QuestionarioFAECand questionario;
    private int contador = 0;
    private  ExposicaoEstado es;

    /**
     * Creates new form AvaliarCandidaturaUI
     *
     * @param ce
     * @param fae
     * @param tpCand
     */
    public AvaliarCandidaturaUI(final CentroExposicoes ce, final FAE fae, String tpCand) {
        this.fae = fae;
        this.ce = ce;
        this.tpCand = tpCand;
        this.controller = new AvaliarCandidaturaController(ce, fae);
        initComponents();
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int result = JOptionPane.showConfirmDialog(
                        AvaliarCandidaturaUI.this, "Tem a certeza?");
                if (result == JOptionPane.OK_OPTION) {

                    AvaliarCandidaturaUI.this.setDefaultCloseOperation(
                            JDialog.DISPOSE_ON_CLOSE);
                    AvaliarCandidaturaUI.this.setVisible(false);
                    AvaliarCandidaturaUI.this.dispose();
                    JFrame MenuUI = new MenuUI(ce,fae.getUtilizador());
                } else if (result == JOptionPane.CANCEL_OPTION) {
                    AvaliarCandidaturaUI.this.setDefaultCloseOperation(
                            JDialog.DO_NOTHING_ON_CLOSE);
                } else if (result == JOptionPane.NO_OPTION) {
                    AvaliarCandidaturaUI.this.setDefaultCloseOperation(
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
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        label2 = new java.awt.Label();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        label3 = new java.awt.Label();
        jSeparator4 = new javax.swing.JSeparator();
        jComboBox3 = new javax.swing.JComboBox<>();
        label4 = new java.awt.Label();
        jSeparator5 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Avaliar Candidatura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        String [] exposicoes = new String[100];
        int i=0;
        if(!controller.getListaExposicoesFAE(fae.getUtilizador()).isEmpty()){
            for(Exposicao e : controller.getListaExposicoesFAE(fae.getUtilizador())){
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

        label1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label1.setText("Exposição:");

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setText("Continuar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Candidaturas:");

        label2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label2.setName(""); // NOI18N
        label2.setText("Informação Candidatura:");

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList2.setEnabled(false);
        jScrollPane2.setViewportView(jList2);

        jButton2.setText("Continuar");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);
        jTextArea1.setEditable(false);

        label3.setBackground(new java.awt.Color(153, 153, 255));
        label3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label3.setText("Decisão:");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aceita", "Não Aceita" }));

        label4.setBackground(new java.awt.Color(153, 153, 255));
        label4.setText("Justificação:");

        jButton4.setBackground(new java.awt.Color(153, 255, 204));
        jButton4.setText("Questionário");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(153, 153, 255));
        jButton5.setText("Cancelar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(153, 153, 255));
        jButton6.setText("Guardar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);
        jTextArea2.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jComboBox3.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

       
            
         es = exposicao.getEstado();
        if (this.tpCand.equalsIgnoreCase("exposicao")) {

            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {

                    String expo = jComboBox1.getSelectedItem() + "";

                    if (!expo.isEmpty()) {
                        for (Exposicao e : ce.getRegistoExposicoes().getListaExposicoes()) {

                            if (e.getTitulo().equalsIgnoreCase(expo)) {
                                exposicao = e;
                            }

                        }

                    }
                    
                    

                    controller.selecionaExposicao(exposicao);
                    if (controller.getAvaliaveis(fae).isEmpty()&& es.setExposicaoCandidaturasAtribuidas()) {
                        try {

                            throw new IllegalArgumentException("Não existe candidaturas para avaliar!\n"
                                    + "OU não foram atribuidas candidaturas!");

                        } catch (IllegalArgumentException ex) {
                            JOptionPane.showMessageDialog(
                                    menu,
                                    ex.getMessage(),
                                    "Aviso",
                                    JOptionPane.WARNING_MESSAGE);

                        }
                    } else {

                        final String[] candidaturas = new String[100];
                        int cont = 0;

                        if (!controller.getAvaliaveis(fae).isEmpty()) {
                            for (Candidatura c : controller.getAvaliaveis(fae)) {
                                candidaturas[cont] = c.toString();
                                cont++;
                            }
                        }

                        jList2.setModel(new javax.swing.AbstractListModel<String>() {

                            public int getSize() {
                                return candidaturas.length;
                            }

                            public String getElementAt(int i) {
                                return candidaturas[i];
                            }
                        });

                        jComboBox1.setEnabled(false);
                        jList2.setEnabled(true);
                        jButton1.setEnabled(false);
                        jButton2.setEnabled(true);
                    }

                }
            }
            );

        } else {

            jComboBox1.setEnabled(false);
            jButton1.setEnabled(false);

            String expo = jComboBox1.getSelectedItem() + "";
            jComboBox1.setEnabled(false);

            if (!expo.isEmpty()) {
                for (Exposicao e : ce.getRegistoExposicoes().getListaExposicoes()) {

                    if (e.getTitulo().equalsIgnoreCase(expo)) {
                        exposicao = e;
                    }

                }

            }
            
            
             if (controller.getAvaliaveis(fae).isEmpty()&& es.setDemonstracaoCandidaturasAtribuidas()) {
                        try {

                            throw new IllegalArgumentException("Não existe candidaturas para avaliar!\n"
                                    + "OU não foram atribuidas candidaturas!");

                        } catch (IllegalArgumentException ex) {
                            JOptionPane.showMessageDialog(
                                    menu,
                                    ex.getMessage(),
                                    "Aviso",
                                    JOptionPane.WARNING_MESSAGE);

                        }
             }
            controller.selecionaExposicao(exposicao);
            
            
            
            final String[] candidaturas = new String[100];
            int cont = 0;

            if (!controller.getAvaliaveis(fae).isEmpty()) {
                for (Candidatura c : controller.getAvaliaveis(fae)) {
                    candidaturas[cont] = c.toString();
                    cont++;
                }
            }

            jList2.setModel(new javax.swing.AbstractListModel<String>() {

                public int getSize() {
                    return candidaturas.length;
                }

                public String getElementAt(int i) {
                    return candidaturas[i];
                }
            });

            jList2.setEnabled(true);

            jButton2.setEnabled(true);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (!tpCand.equalsIgnoreCase("exposicao")) {
            if (jList2.getModel().getSize() == 0) {
                try {

                    throw new IllegalArgumentException("Nao existem candidaturas para demonstrações!");

                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(
                            menu,
                            ex.getMessage(),
                            "Aviso",
                            JOptionPane.WARNING_MESSAGE);

                }

            }
        }
        if (jList2.getSelectedValue() == null) {
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

            jList2.setEnabled(false);
            jButton2.setEnabled(false);

            if (!controller.getAvaliaveis(fae).isEmpty()) {
                for (Candidatura c : controller.getAvaliaveis(fae)) {
                    if (c.getEmailRep().equalsIgnoreCase(jList2.getSelectedValue())) {
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

                        if (tpCand.equalsIgnoreCase("exposicao")) {
                            jTextArea1.setText("Nome Empresa: " + candExp.getNomeEmpresa() + "\nMorada: " + candExp.getMorada()
                                    + "\nTelemovel: " + candExp.getTelemovel() + "\nArea: " + candExp.getArea() + "\nNºConvites: " + candExp.getConvites()
                                    + "\nLista de Demonstrações:\n" + candExp.getListaDemonstracoes().toString());

                            jTextArea1.setEditable(false);
                            jComboBox3.setEnabled(true);
                            jTextArea2.setEditable(true);
                            jButton4.setEnabled(true);

                        } else {
                            jTextArea1.setText("Demonstracao: " + candDemo.toString());

                            jTextArea1.setEditable(false);
                            jComboBox3.setEnabled(true);
                            jTextArea2.setEditable(true);

                        }
                    }
                }
                );
                jButton2.setEnabled(false);
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        dispose();
        MenuUI m = new MenuUI(ce,fae.getUtilizador());
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:

        try {

            FAE faeExp=null;
            if (tpCand.equalsIgnoreCase("exposicao")) {
                String fae = this.fae.getID();
                
                for(FAE f : exposicao.getListaFAES().getListaFAEs()){
                    if(f.getID().equalsIgnoreCase(fae)){
                        faeExp=f;
                    }
                }
                
                String candE = this.candExp.getEmailRep();
                Atribuicao a = null;
                for(Atribuicao at : exposicao.getListaAtribuicoes().getLista()){
                    if(at.getCandidatura().getEmailRep().equalsIgnoreCase(candE)){
                        a=at;
                    }
                    
                }
                
                String decisao = jComboBox3.getSelectedItem() + "";
                String txt = jTextArea2.getText();

                if (txt == null || txt.trim().isEmpty()) {
                    throw new IllegalArgumentException("Justificação vazia!");
                }

                if (this.contador == 0) {
                    jButton4.doClick();
                }

                int temaExpo = questionario.temaExpo();
                int adqCandExpo = questionario.adqCandExpo();
                int adqCandDemo = questionario.adqCandDemo();
                int adqNumCov = questionario.adqNumConv();
                int recGlobal = questionario.recGlobal();
                
                
                
                controller.setAvaliacao(a, decisao, txt, temaExpo, adqCandExpo, adqCandDemo, adqNumCov, recGlobal);

                if (controller.registaAvaliacao()) {

                    JOptionPane.showMessageDialog(menu, "Avaliação registada!");
                    dispose();

                    MenuUI j = new MenuUI(ce,this.fae.getUtilizador());
                } else {
                    throw new IllegalArgumentException("Esta avaliação já existe!");
                }

            } else {

                String fae = this.fae.getID();
                
                for(FAE f : exposicao.getListaFAES().getListaFAEs()){
                    if(f.getID().equalsIgnoreCase(fae)){
                        faeExp=f;
                    }
                }
                String candD = this.candDemo.getEmailRep();
                
                Atribuicao a = null;
                for(Atribuicao at : exposicao.getListaAtribuicoes().getLista()){
                    if(at.getCandidatura().getEmailRep().equalsIgnoreCase(candD)){
                        a=at;
                    }
                    
                }
                
                String decisao = jComboBox3.getSelectedItem() + "";
                String txt = jTextArea2.getText();

                if (txt == null || txt.trim().isEmpty()) {
                    throw new IllegalArgumentException("Justificação vazia!");
                }

                controller.setAvaliacao(a, decisao, txt);

                if (controller.registaAvaliacao()) {

                    JOptionPane.showMessageDialog(menu, "Avaliação registada!");
                    dispose();

                    MenuUI j = new MenuUI(ce,this.fae.getUtilizador());
                } else {
                    throw new IllegalArgumentException("Esta avaliação já existe!");
                }

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
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        this.questionario = new QuestionarioFAECand();
        this.contador++;

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
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
//            java.util.logging.Logger.getLogger(AvaliarCandidaturaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AvaliarCandidaturaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AvaliarCandidaturaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AvaliarCandidaturaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                
//                new AvaliarCandidaturaUI(ce, fae, "expicao").setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    // End of variables declaration//GEN-END:variables
}
