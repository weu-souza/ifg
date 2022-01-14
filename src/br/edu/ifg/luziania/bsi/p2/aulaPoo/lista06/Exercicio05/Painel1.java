package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio05;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Painel1 extends JFrame {
    CamaroteInferior c = new CamaroteInferior();
    CamaroteSuperior c1 = new CamaroteSuperior();

    private JPanel painel1;
    private JButton camaroteSuperiorButton;
    private JButton camaroteInferiorButton1;
    private JButton voltarButton;

    public Painel1(){
        setContentPane(painel1);
        setTitle("Vip");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);



        camaroteInferiorButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,c.dadosInferior());
            }
        });
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Painel();
               setVisible(false);
            }
        });
        camaroteSuperiorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,c1.dadosSuperior());
            }
        });
    }

}
