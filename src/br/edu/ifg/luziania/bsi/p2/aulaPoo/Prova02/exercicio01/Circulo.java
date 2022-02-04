package br.edu.ifg.luziania.bsi.p2.aulaPoo.Prova02.exercicio01;

public class Circulo extends Bidimensional  implements CalculoUm,Pi{
    private Double raio;

    public Circulo(Integer numLados, Double raio) {
        super(numLados);
        setRaio(raio);

    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        if(raio==null||raio<0){
            this.raio = 0.0;
        }
        else {
            this.raio = raio;
        }

    }


    @Override
    public Double calculo(Double a, Double b) {

        return a*(Math.pow(b,2));
    }

    @Override
    public Double getPi() {
        return pi;
    }
@Override
    public void exibirDados(){
    System.out.println(exibirObjeto());
    System.out.println(exibirNumLados());
    System.out.println(exibirAreaM2());

    }

    @Override
    public String exibirNumLados() {
        return "numero de lados: "+getNumLados();
    }

    @Override
    public String exibirObjeto() {
        return "esse objeto é um circulo!";
    }

    @Override
    public String exibirAreaM2() {
        return "Area= "+calculo(getPi(),this.raio)+" M²";
    }
}
