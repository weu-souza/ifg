package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio02;

public class Cachorro extends Canino{
    public Cachorro() {

    }

    public Cachorro(double peso, Integer idade, String alimento, double velocidade, String habitat) {
        super(peso, idade, alimento, velocidade, habitat);
    }

    public void alimentar(){
        System.out.println("crunch");
    }
    public String latir(){
        return "cachorro latindo : au...au...au";
    }


    public void dadosCachorro() {
        System.out.println("\n"+"Cachorro"+"\n"+"Alimento do cachorro: "+getAlimento()+"\n"+"Idade do cachorro: "+getIdade()+" anos"+"\n"+"Velocidade do cachorro: "+getVelocidade()+" km"+"\n"+
                "peso do cachorro: "+getPeso()+" kg"+
                "\n"+"habitat do cachorro: "+getHabitat());
    }
}
