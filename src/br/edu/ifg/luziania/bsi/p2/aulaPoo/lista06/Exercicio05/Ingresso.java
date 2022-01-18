package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio05;

import java.awt.*;
import java.time.LocalDate;

public class Ingresso {
    private LocalDate dataEvento;
    private String nomeEvento;
    private double valorIngresso;

    public Ingresso() {

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


        return valorIngresso ;
    }

    public void setValorIngresso() {
        if(this.valorIngresso < 0){
            System.out.println("valor invalido");
        }
        else{
            System.out.println(this.valorIngresso);
        }

    }

    public void imprimeValor() {
        if(this.valorIngresso < 0){
            System.out.println("valor invalido");
        }
        else{
            System.out.println(getValorIngresso());
        }
    }

    public void imprimeDadosDoEvento() {
        System.out.println("Dados Do evento"+"\n"+"Nome do evento: " + getNomeEvento() + "\n" + "Data do Evento: " + getDataEvento());
    }
}
