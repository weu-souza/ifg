package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio05;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class Painel  extends JFrame{
    private JButton normalButton;
    private JButton vipButton;
    private JButton dadosDoEventoButton;
    private JPanel painel;
    Ingresso i = new Ingresso(LocalDate.of(2021,05,23),"show de sertanejo",50);
    Normal n = new Normal(i.getDataEvento(),i.getNomeEvento(),i.getValorIngresso());

    public Painel(){
        this.setContentPane(painel);
    this.setTitle("Evento");
    this.setSize(420,420);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        normalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n.ingressoNormal();
                i.imprimeValor();
            }
        });

        vipButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Painel1();
                dispose();
            }
        });

        dadosDoEventoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                i.imprimeDadosDoEvento();
            }
        });
    }



}

