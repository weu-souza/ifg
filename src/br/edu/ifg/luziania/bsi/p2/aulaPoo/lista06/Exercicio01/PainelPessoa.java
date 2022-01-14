package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PainelPessoa extends JFrame {
    private JPanel painelPessoa;
    private JButton clienteButton;
    private JButton profissionalButton;

    public PainelPessoa(){
        Profissional p2 = new Profissional();
        Cliente p3 = new Cliente();
        setContentPane(painelPessoa);
        setTitle("Pessoa");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        clienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,p3.exibirDadosDoCliente());
            }
        });
        profissionalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,p2.exibisDadosProfissionais());
            }
        });
    }
}
