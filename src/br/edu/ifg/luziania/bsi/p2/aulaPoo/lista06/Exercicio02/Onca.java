package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio02;

public class Onca extends Felino{
    public Onca() {
        setAlimento("carne de animal");
        setVelocidade(4.5);
        setIdade(5);
        setPeso(13.0);

    }

    public Onca(double peso, Integer idade, String alimento, double velocidade) {
        super(peso, idade, alimento, velocidade);
    }

    @Override
    public String rosnar() {
       return super.rosnar();
    }

    @Override
    public String toString() {
        return "\n"+"Alimento da onça: "+getAlimento()+"\n"+"Idade da onça: "+getIdade()+" anos"+"\n"+"Peso da onça: "+getPeso()+" kg"+
                "\n"+"Velocidade da onça: "+getVelocidade()+" km";

    }
}

