package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio02;

public class Lobo extends Canino{
    public Lobo() {
    setAlimento("carne de animal");
       setHabitat("floresta");
       setIdade(15);
       setPeso(16.0);
       setVelocidade(5.0);
    }

    public Lobo(double peso, Integer idade, String alimento, double velocidade, String habitat) {
        super(peso, idade, alimento, velocidade, habitat);
    }

    public String uivar(){
        return "lobo uivando: auuuuu";
    }

    @Override
    public String toString() {
        return ""+"\n"+"Alimento do lobo: "+getAlimento()+"\n"+"habitat do lobo: "+getHabitat()+"\n"+"idade do lobo: "+getIdade()+" anos"+
                "\n"+"Velocidade do lobo: "+getVelocidade()+" km"+"\n"+"Peso do lobo: "+getPeso()+" kg";
    }
}
