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
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import lapr.project.controller.GerarEstatisticasCandidaturaController;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;

/**
 *
 * @author marianachilro
 */
public class GerarEstatisticasCandidaturaUI extends JDialog{
    
    private final GerarEstatisticasCandidaturaController controller;
    
    private final JFrame janelaPai;
    
    private final Exposicao exposicao;
    
    private CandidaturaExposicao candidatura;
    
    private final CentroExposicoes centro;
    
    private List <CandidaturaExposicao> listaCandidaturas;
    
    private JComboBox comboBoxCandidaturas;
    
    public GerarEstatisticasCandidaturaUI(JFrame janelaPai, CentroExposicoes centro, Exposicao exposicao){
        super(janelaPai, "Confirmar Realização de Demonstração", true);
        this.janelaPai=janelaPai;
        this.centro = centro;
        this.exposicao = exposicao;
        this.controller = new GerarEstatisticasCandidaturaController(centro);
        controller.seleciona(exposicao);
        setModal(true);
        setLayout(new BorderLayout());

        add(criarPainelInfo());

        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        pack();
        setResizable(false);
        setLocationRelativeTo(janelaPai);
        setVisible(true);
    }
    
    public JPanel criarPainelInfo(){
        JPanel p = new JPanel(new BorderLayout());
        p.setBorder(new EmptyBorder(10, 10, 10, 10));
        p.add(criarPainelInputOutput(), BorderLayout.CENTER);
        p.add(criarPainelBotoes(), BorderLayout.SOUTH);
        return p;
    }
    
    public JPanel criarPainelInputOutput(){
        JPanel p = new JPanel(new GridLayout(8, 2, 3, 3));
        p.setBorder(new EmptyBorder(10, 10, 10, 10));
        p.add(criarPainelCandidaturas());
        p.add(criarPainelEstatisticas());
        
        pack();
        return p;
    }
    
    public JPanel criarPainelCandidaturas(){
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1, 2));
        JLabel lbl = new JLabel("Escolha uma Candidatura:");
        listaCandidaturas = controller.getCandidaturasAvaliadas(exposicao);
        CandidaturaExposicao [] array = new CandidaturaExposicao[listaCandidaturas.size()+1];
        int i =1;
        for(CandidaturaExposicao c : listaCandidaturas){
            array[i] = c;
            i++;
        }
        this.comboBoxCandidaturas = new JComboBox<>(array);
        comboBoxCandidaturas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CandidaturaExposicao c = (CandidaturaExposicao) comboBoxCandidaturas.getSelectedItem();
                if (c != null) {
                    controller.seleciona(c);
                    candidatura = c;
                    
                }

            }

        });
        p.add(lbl);
        p.add(comboBoxCandidaturas);
        return p;
    }
    
    public JPanel criarPainelEstatisticas(){
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));

        p.add(criarLabel("ESTATÍSTICAS/n " + candidatura.toStringEstatisticaAvaliacoes()));
        return p;
    }
    
    public JPanel criarPainelBotoes() {
        JPanel p = new JPanel();
        p.add(criarBotaoTerminar());
        p.add(criarBotaoLimpar());
        return p;
    }
    
    public JButton criarBotaoTerminar() {
        JButton btn = new JButton("Terminar");
        btn.setToolTipText("Termina a execução a tarefa");
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                dispose();
            }
        });
        return btn;
    }
    
    public JButton criarBotaoLimpar() {
        JButton btn = new JButton("Limpar");
        btn.setToolTipText("Limpa todos os dados");
        btn.setMnemonic(KeyEvent.VK_L);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comboBoxCandidaturas.setSelectedIndex(0);
                
            }
        });
        return btn;
    }
    
    public JLabel criarLabel(String nomeLabel) {
        JLabel lbl = new JLabel(nomeLabel);
        return lbl;
    }
    
}
