package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio05;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class Painel1  extends Painel{
    private JButton camaroteSuperiorButton;
    private JButton camaroteInferiorButton;
    private JButton voltarButton;
    private JPanel painel1;
    Vip v = new Vip(i.getDataEvento(),i.getNomeEvento(),i.getValorIngresso(),30);
    CamaroteSuperior camarote = new CamaroteSuperior(i.getDataEvento(),i.getNomeEvento(),i.getValorIngresso(), v.getAdicional(),"Pista A",200);
    CamaroteInferior camarote1 = new CamaroteInferior(i.getDataEvento(),i.getNomeEvento(),i.getValorIngresso(),camarote.getAdicional(),"Pista B");
    public Painel1(){
        this.setContentPane(painel1);
        this.setTitle("Vip");
        this.setSize(420,420);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        camaroteSuperiorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                camarote.dadosSuperior();
            }
        });

        camaroteInferiorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              camarote1.dadosInferior();
            }
        });

        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Painel();
                dispose();
            }
        });
    }

}
