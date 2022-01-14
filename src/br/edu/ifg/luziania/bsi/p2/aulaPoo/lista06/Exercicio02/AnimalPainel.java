package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio02;

import br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio03.Peixe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimalPainel extends JFrame{
    private JButton cachorroButton;
    private JButton gatoButton;
    private JButton onçaButton;
    private JButton loboButton;
    private JButton peixeButton;
    private JPanel AnimalPainel;

    public AnimalPainel(){
        Cachorro animal = new Cachorro();
        Gato animal1 = new Gato();
        Onca animal2 = new Onca();
        Lobo animal3 = new Lobo();
        Peixe animal4 =new Peixe();
        setContentPane(AnimalPainel);
        setTitle("Animal");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        cachorroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,animal.toString()+" \n"+animal.latir());
            }
        });
        gatoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,animal1.toString()+"\n"+animal1.miar()+"\n"+animal1.rosnar());
            }
        });
        onçaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,animal2.toString()+"\n"+animal2.rosnar());
            }
        });
        loboButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,animal3.toString()+"\n"+ animal3.uivar());
            }
        });
        peixeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,animal4.dadosDoPeixe());
            }
        });
    }
}
