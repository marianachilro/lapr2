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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import lapr.project.controller.ConfirmarStandController;
import lapr.project.model.Candidatura;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;

/**
 *
 * @author miniondevil
 */
public class ConfirmaStand extends JDialog {
    
    private JLabel jl;
    private CandidaturaExposicao c;
    private JTable t1;
    private final ConfirmarStandController controller;
    
    public ConfirmaStand(ConfirmarStandUI pai,ConfirmarStandController controller, CandidaturaExposicao c) {
        
        super(pai, "ConfirmarStand", true);
        this.controller=controller;
        this.c=c;        
        
        
        criarComponentes();
        
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        pack();
        setResizable(true);
        
        setLocationRelativeTo(pai);
        setVisible(true);
        
    }

    public void criarComponentes() {
        criarJLabel();
        JPanel p1 = criarPainelButoes();
       
    
        add(jl, BorderLayout.NORTH);
        add(p1, BorderLayout.SOUTH);
      
        
    }
    
    public void criarJLabel() {
        jl = new JLabel();
        jl.setText(controller.getStand(c).toString());
        
    }
    
   
    
    public JPanel criarPainelButoes() {
        JPanel p1 = new JPanel();
        p1.add(criarButaoListar());
        p1.add(criarButaoCancelar());
       
        return p1;
    }
    
    public JButton criarButaoListar() {
        JButton b1 = new JButton("Aceita");
        b1.setMnemonic(KeyEvent.VK_L);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 controller.setEstado(true);
                 dispose();
            }
        });
        return b1;
    }
    
    public JButton criarButaoCancelar() {
        JButton b1 = new JButton("Rejeita");
        b1.setMnemonic(KeyEvent.VK_C);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.setEstado(false);
                dispose();
                
            }
        });
        return b1;
    }
}
    

