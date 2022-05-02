package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio05;

import java.time.LocalDate;

public class Vip extends Ingresso {
    private double adicional;



    public Vip(LocalDate dataEvento, String nomeEvento, double valorIngresso, double adicional) {
        super(dataEvento, nomeEvento, valorIngresso);
        setAdicional(adicional);
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        if(super.getValorIngresso()==0){
            this.adicional = 0;
        }
        else{
            this.adicional = adicional;
        }

    }

    public double valorVip() {
        return getValorIngresso() + getAdicional();
    }
}
