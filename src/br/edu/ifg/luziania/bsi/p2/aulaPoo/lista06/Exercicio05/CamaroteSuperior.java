package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio05;

import java.time.LocalDate;

public class CamaroteSuperior extends Vip {
    private String localizacaoSuperior;
    private double preçoSuperior;


    public CamaroteSuperior(LocalDate dataEvento, String nomeEvento, double valorIngresso, double adicional, String localizacaoSuperior, double preçoSuperior) {
        super(dataEvento, nomeEvento, valorIngresso, adicional);
        this.localizacaoSuperior = localizacaoSuperior;
        this.preçoSuperior = preçoSuperior;
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

    public void dadosSuperior() {
        System.out.println("\n"+"Dados Camarote superior"+
                "\n" + "Localização Do Ingresso Superior: " + getLocalizacaoSuperior());
        if (valorSuperior()>0){
            System.out.println("Valor Do Ingresso Superior: " + valorSuperior());
        }
        else{
            System.out.println("valor invalido");
        }
    }
}
