package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio05;

import java.time.LocalDate;

public class CamaroteSuperior extends Vip {
    private String localizacaoSuperior;
    private double preçoSuperior;

    public CamaroteSuperior() {
        setPreçoSuperior(2);
        setLocalizacaoSuperior("Pista A");
    }

    public CamaroteSuperior(LocalDate dataEvento, String nomeEvento, double valorIngresso, double adicional, String localizacaoSuperior) {
        super(dataEvento, nomeEvento, valorIngresso, adicional);
        this.localizacaoSuperior = localizacaoSuperior;
    }

    public String getLocalizacaoSuperior() {
        return localizacaoSuperior;
    }

    public void setLocalizacaoSuperior(String localizacaoSuperior) {
        this.localizacaoSuperior = localizacaoSuperior;
    }

    public double getPreçoSuperior() {
        return preçoSuperior;
    }

    public void setPreçoSuperior(double preçoSuperior) {
        this.preçoSuperior = preçoSuperior;
    }

    public Double valorSuperior() {

        return valorVip() * getPreçoSuperior();
    }

    public String dadosSuperior() {
        return "Valor Do Ingresso Superior: " + valorSuperior() + "\n" + "Localização Do Ingresso Superior: " + getLocalizacaoSuperior();
    }
}
