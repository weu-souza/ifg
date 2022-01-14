package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio04;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PainelImovel extends JFrame {


    private JPanel painelImovel;
    private JButton dadosDoImovelButton;
    private JButton velhoButton;
    private JButton novoButton;

    public PainelImovel() {
        Novo n = new Novo();
        Imovel i = new Imovel();
        Velho v = new Velho();
        setContentPane(painelImovel);
        setTitle("Imovel");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        dadosDoImovelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, i.toString());
            }
        });
        velhoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, v.toString());
            }
        });
        novoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, n.toString());
            }
        });
    }
}
