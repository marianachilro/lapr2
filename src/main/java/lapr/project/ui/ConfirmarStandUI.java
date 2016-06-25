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
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import lapr.project.controller.ConfirmarStandController;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Utilizador;

/**
 *
 * @author miniondevil
 */
public class ConfirmarStandUI extends JDialog {
    
    private JComboBox cb;
    private final CentroExposicoes ce;
    private final Utilizador utilizador;

    private JTable t1;
    private final ConfirmarStandController controller;
    
    public ConfirmarStandUI(MenuUI pai, CentroExposicoes ce, Utilizador utilizador) {
        
        super(pai, "ConfirmarStand", true);
        
        controller = new ConfirmarStandController(ce, utilizador.getUsername());
        this.ce=ce;
        this.utilizador=utilizador;
        criarComponentes();
        
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        pack();
        setResizable(true);
        
        setLocationRelativeTo(pai);
        setVisible(true);
        
    }

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
        List<CandidaturaExposicao> listaCandRep = controller.geListaCandidaturaRep();
        if(!listaCandRep.isEmpty()){
        for (CandidaturaExposicao c : listaCandRep) {
            cb.addItem(c);
        }
    }else{
            JOptionPane.showMessageDialog(this, "Não existem candidaturas com stand atribuido!");
            dispose();
            MenuUI ui = new MenuUI(ce, utilizador);
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
                MenuUI ui = new MenuUI(ce, utilizador);
            }
        });
        return b1;
    }
}
