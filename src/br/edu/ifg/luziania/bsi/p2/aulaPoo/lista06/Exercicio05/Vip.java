package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio05;

import java.time.LocalDate;

public class Vip extends Ingresso {
    private double adicional;

    public Vip() {
        setAdicional(3);

    }

    public Vip(LocalDate dataEvento, String nomeEvento, double valorIngresso, double adicional) {
        super(dataEvento, nomeEvento, valorIngresso);
        this.adicional = adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    public double valorVip() {
        return getValorIngresso() * getAdicional();
    }

    public String ingressovip() {
        return "" + valorVip();
    }
}
