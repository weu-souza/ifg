package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista05.exercicio02;


import java.time.LocalDate;

public class Aplicativo {
    public static void main(String[] args) {


        Proprietario proprietario = new Proprietario("weuller","0000","000","9455444","8"
                ,"Bairro das palmeiras","Cidade Hipotetica"
                ,"Df","000000","indefinido"
                ,LocalDate.of(1996,05,25));


        System.out.println(proprietario.dadosProprietarios());


    }
}
