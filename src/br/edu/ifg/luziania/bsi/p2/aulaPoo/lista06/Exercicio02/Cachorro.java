package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio02;

public class Cachorro extends Canino{
    public Cachorro() {
        setAlimento("ração de cachorro");
       setHabitat("casa");
        setIdade(5);
        setPeso(10.0);
        setVelocidade(2.4);
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

    @Override
    public String toString() {
        return ""+"\n"+"Alimento do cachorro: "+getAlimento()+"\n"+"Idade do cachorro: "+getIdade()+" anos"+"\n"+"Velocidade do cachorro: "+getVelocidade()+" km"+"\n"+
                "peso do cachorro: "+getPeso()+" kg"+
                "\n"+"habitat do cachorro: "+getHabitat();
    }
}
