package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio02;

public class Felino extends Animal{
        public Felino(double peso, Integer idade, String alimento, double velocidade) {
        super(peso, idade, alimento, velocidade);
    }

    public String rosnar(){
        return "Felino rosnando: rawwrrrr";

    }
}
