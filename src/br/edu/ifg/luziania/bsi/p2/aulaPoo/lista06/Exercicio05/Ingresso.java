package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio05;

import java.awt.*;
import java.time.LocalDate;

public class Ingresso {
    private LocalDate dataEvento;
    private String nomeEvento;
    private double valorIngresso;

    public Ingresso() {
        setValorIngresso(50.0);
        setNomeEvento("show...");
        setDataEvento(LocalDate.parse("2021-02-25"));
    }

    public Ingresso(LocalDate dataEvento, String nomeEvento, double valorIngresso) {
        this.dataEvento = dataEvento;
        this.nomeEvento = nomeEvento;
        this.valorIngresso = valorIngresso;
    }

    public LocalDate getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public double getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public String imprimeValor() {
        return "" + getValorIngresso();
    }

    public String imprimeDadosDoEvento() {
        return "Nome do evento: " + getNomeEvento() + "\n" + "Data do Evento: " + getDataEvento();
    }
}
