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
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import lapr.project.controller.DefinirFaeController;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.FAE;
import lapr.project.model.RegistoUtilizadores;

/**
 *
 * @author Rita
 */
public class DefFaeUI extends JDialog {
    
    private CentroExposicoes ce;
    private FAE f;
    private DefinirFaeController controller;
    private RegistoUtilizadores ru;
    private JList jListaExp;
    private JTextField txtUsername;
    
    public DefFaeUI(JFrame janelaPai, CentroExposicoes ce) {
        super(janelaPai, "DefinirFae", true);
        this.ce = ce;
        this.controller = new DefinirFaeController(ce);
        this.ru = controller.getRegistoUtilizadores();
        jListaExp = new JList();
        criarComponentes();
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        pack();
        setResizable(false);
        setLocationRelativeTo(janelaPai);
        setVisible(true);
    }
    
    public void criarComponentes() {
        setLayout(new BorderLayout());
        add(criarPainelExpos(), BorderLayout.NORTH);
        add(criarPainelUtilizadores(), BorderLayout.CENTER);
        add(criarPainelBotoes(), BorderLayout.SOUTH);
    }
    
    public JPanel criarPainelExpos() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1,2));
        JLabel lbl = new JLabel("Escolha uma Exposição:");
        JScrollPane sc = new JScrollPane(jListaExp);
        p.add(lbl);
        p.add(sc);
        return p;
    }
    
    public JPanel criarPainelUtilizadores() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1, 5));
        JLabel lbl1 = new JLabel("Introduza o username");
        JLabel lbl2 = new JLabel("Utilizadores:");
        txtUsername = new JTextField(30);
        JTextArea txtUtilizadores = new JTextArea(ru.toString());
        p.add(lbl1);
        p.add(txtUsername);
        p.add(criarBotaoAdicionar());
        p.add(lbl2);
        p.add(txtUtilizadores);
        JScrollPane sc = new JScrollPane(txtUtilizadores);
        return p;
    }
    
    public JPanel criarPainelBotoes() {
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout(FlowLayout.CENTER));
        p.add(criarBotaoVerLista());
        p.add(criarBotaoConfirmar());
        p.add(criarBotaoCancelar());
        return p;
    }
    
    public JButton criarBotaoAdicionar() {
        JButton b = new JButton("Adicionar");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f = controller.novoFae(txtUsername.getText());
                if(controller.registaFae()) {
                    JOptionPane.showMessageDialog(DefFaeUI.this, f.toString() + 
                            " foi adicionado c sucesso!", "FAE Definido", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        return b;
    }
    
    public JButton criarBotaoVerLista() {
        JButton b = new JButton("ver Lista FAEs");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        return b;
    }
    
    public JButton criarBotaoConfirmar() {
       JButton b = new JButton("Confirmar");
       b.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               //AÇÕES
               dispose();
           }
       });
       return b;
    }
    
    public JButton criarBotaoCancelar() {
        JButton b = new JButton("Cancelar");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(DefFaeUI.this, "FAEs não foram adicionados com sucesso.", "Definir FAEs", JOptionPane.ERROR_MESSAGE);
                dispose();
            }
        });
        return b;
    }
    
}
