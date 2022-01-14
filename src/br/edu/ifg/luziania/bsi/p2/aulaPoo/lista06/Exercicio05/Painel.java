package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Painel extends  JFrame {
    Normal n = new Normal();
    Vip v = new Vip();


    Ingresso i = new Ingresso();
    private JPanel painel;
    private JButton normalButton;
    private JButton vipButton;
    private JButton dadosDoEventoButton;

    private void createUIComponents() {

    }
    public Painel(){
        setContentPane(painel);
        setTitle("Ingresso");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


        dadosDoEventoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,i.imprimeDadosDoEvento());
            }
        });
        normalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,n.ingressoNormal());
            }
        });
        vipButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Painel1();
                setVisible(false);

            }
        });
    }
//System.out.println(n.ingressoNormal())
//System.out.println(i.imprimeDadosDoEvento());
    }



