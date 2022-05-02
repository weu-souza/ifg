package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio02;

public class Lobo extends Canino{

    public Lobo(double peso, Integer idade, String alimento, double velocidade, String habitat) {
        super(peso, idade, alimento, velocidade, habitat);
    }

    public String uivar(){
        return "lobo uivando: auuuuu";
    }


    public void dadosLobo() {
        System.out.println("\n"+"Lobo"+"\n"+"Alimento do lobo: "+getAlimento()+"\n"+"habitat do lobo: "+getHabitat()+"\n"+"idade do lobo: "+getIdade()+" anos"+
                "\n"+"Velocidade do lobo: "+getVelocidade()+" km"+"\n"+"Peso do lobo: "+getPeso()+" kg");
    }
}
