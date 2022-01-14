package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio02;

public class Gato extends Felino{
    private String raca;

    public Gato() {
       setRaca("vira-lata");
       setAlimento("ração de gato");
       setVelocidade(2.5);
       setIdade(4);
       setPeso(10.5);
    }

    public Gato(double peso, Integer idade, String alimento, double velocidade, String raca) {
        super(peso, idade, alimento, velocidade);
        this.raca = raca;
    }


    public String miar(){
        return "gato miando: miaaaau";
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return ""+"\n"+"idade do gato: "+getIdade()+" anos"+"\n"+"Velocidade do gato: "+getVelocidade()+"km"+"\n"+"Peso do gato: "
                +getPeso()+" kg"+"\n"+"Alimento do gato: "+getAlimento()+"\n"+"Raça do gato: "+getRaca();
    }
}
