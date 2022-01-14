package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio05;

import java.time.LocalDate;

public class CamaroteInferior extends Vip {
    private String localizacaoInferior;

    public CamaroteInferior() {
        setLocalizacaoInferior("Pista B");
    }

    public CamaroteInferior(LocalDate dataEvento, String nomeEvento, double valorIngresso, double adicional, String localizacaoInferior) {
        super(dataEvento, nomeEvento, valorIngresso, adicional);
        this.localizacaoInferior = localizacaoInferior;
    }

    public String getLocalizacaoInferior() {
        return localizacaoInferior;
    }

    public void setLocalizacaoInferior(String localizacaoInferior) {
        this.localizacaoInferior = localizacaoInferior;
    }

    public String dadosInferior() {
        return "Localização do camarote inferior: " + getLocalizacaoInferior() + "\n" + "preço do camarote inferior: " + valorVip();
    }
}
