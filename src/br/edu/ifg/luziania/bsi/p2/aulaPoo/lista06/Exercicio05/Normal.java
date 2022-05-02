package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio05;

import javax.swing.*;
import java.time.LocalDate;

public class Normal extends Ingresso {

    public Normal(LocalDate dataEvento, String nomeEvento, double valorIngresso) {
        super(dataEvento, nomeEvento, valorIngresso);
    }

    public void ingressoNormal() {

        JOptionPane.showMessageDialog(null,"\n"+"Ingresso Normal");
    }
}
