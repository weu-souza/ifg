package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio05;

import java.time.LocalDate;

public class CamaroteInferior extends Vip {
    private String localizacaoInferior;



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

    public void dadosInferior() {
        System.out.println("\n"+"Dados camarote Inferior"+"\n"+"Localização do camarote inferior: " + getLocalizacaoInferior());
        if(valorVip()>0){
            System.out.println("preço do camarote inferior: " + valorVip());
        }
        else{
            System.out.println("Valor Invalido");
        }
    }
}
