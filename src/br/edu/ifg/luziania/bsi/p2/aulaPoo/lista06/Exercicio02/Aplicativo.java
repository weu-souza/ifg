package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio02;


import br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio03.Peixe;

public class Aplicativo {
    public static void main(String[] args) {
        Cachorro animal = new Cachorro(10.0, 5, "Ração de cachorro", 2.4, "Casa");


        Gato animal1 = new Gato(10.5, 4, "Ração de gato", 2.5, "Vira-lata");

        Onca animal2 = new Onca(5.0, 5, "Carne De Animal", 4.5);

        Lobo animal3 = new Lobo(16.0, 15, "Carne de Animal", 5.0, "Floresta");

        Peixe animal4 = new Peixe(1, 2, "Ração de peixe", 2.1, "escamas,olhos,boca...");

        animal.dadosCachorro();
        animal.latir();
        animal1.dadosGato();
        animal1.miar();
        animal1.rosnar();
        animal2.dadosOnca();
        animal2.rosnar();
        animal3.dadosLobo();
        animal3.uivar();
        animal4.dadosDoPeixe();


    }
}
