package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista05.exercicio05;

import java.util.Date;

public class Aplicativo {
    public static void main(String[] args) {
        Datas data = new Datas();
        System.out.println(data);
        System.out.println("Dia seguinte: "+data.avançarDia(data.getDia()));



    }
}
