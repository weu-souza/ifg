package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio05;

import java.time.LocalDate;

public class Normal extends Ingresso {

    public Normal() {
    }

    public Normal(LocalDate dataEvento, String nomeEvento, double valorIngresso) {
        super(dataEvento, nomeEvento, valorIngresso);
    }

    public String ingressoNormal() {

        return "Ingresso Normal: " + imprimeValor();
    }
}
