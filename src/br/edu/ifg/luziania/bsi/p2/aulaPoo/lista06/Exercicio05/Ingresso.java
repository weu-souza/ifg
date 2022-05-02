package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio05;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;

public class Ingresso {
    private LocalDate dataEvento;
    private String nomeEvento;
    private double valorIngresso;



    public Ingresso(LocalDate dataEvento, String nomeEvento, double valorIngresso) {
        this.dataEvento = dataEvento;
        this.nomeEvento = nomeEvento;
        setValorIngresso(valorIngresso);
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
        if(valorIngresso < 0){
            this.valorIngresso = 0;
        }
        else{
            this.valorIngresso=valorIngresso;
        }
    }

    public void imprimeValor() {
        JOptionPane.showMessageDialog(null,"valor do ingresso normal: "+valorIngresso);
    }

    public void imprimeDadosDoEvento() {
        JOptionPane.showMessageDialog(null,"Dados Do evento"+"\n"+"Nome do evento: " + getNomeEvento() + "\n" + "Data do Evento: " + getDataEvento());
    }
}
