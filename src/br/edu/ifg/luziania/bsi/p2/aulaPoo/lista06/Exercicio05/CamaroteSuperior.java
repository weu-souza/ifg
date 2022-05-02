package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio05;

import javax.swing.*;
import java.time.LocalDate;

public class CamaroteSuperior extends Vip {
    private String localizacaoSuperior;
    private double precoSuperior;




    public CamaroteSuperior(LocalDate dataEvento, String nomeEvento, double valorIngresso, double adicional, String localizacaoSuperior, double precoSuperior) {
        super(dataEvento, nomeEvento, valorIngresso, adicional);
        this.localizacaoSuperior = localizacaoSuperior;
        setPreçoSuperior(precoSuperior);
    }

    public String getLocalizacaoSuperior() {
        return localizacaoSuperior;
    }

    public void setLocalizacaoSuperior(String localizacaoSuperior) {
        this.localizacaoSuperior = localizacaoSuperior;
    }

    public double getPreçoSuperior() {
        return precoSuperior;
    }

    public void setPreçoSuperior(double precoSuperior) {
        if (super.getValorIngresso()==0){
            this.precoSuperior = 0;}
        else{
            this.precoSuperior = precoSuperior;
        }
    }


    public Double valorSuperior() {

        return valorVip() + getPreçoSuperior();
    }

    public void dadosSuperior() {
        JOptionPane.showMessageDialog(null,"\n"+"Dados Camarote superior"+
                "\n" + "Localização Do Ingresso Superior: " + getLocalizacaoSuperior());
        JOptionPane.showMessageDialog(null,"Valor Do Ingresso Superior: " + valorSuperior());


    }
}
