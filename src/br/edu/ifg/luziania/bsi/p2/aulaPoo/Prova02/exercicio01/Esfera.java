package br.edu.ifg.luziania.bsi.p2.aulaPoo.Prova02.exercicio01;

public class Esfera extends Tridimensional implements CalculoUm,Pi {
    private Double raio;

    public Esfera(Integer numLados, Double raio) {
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
    public Double getPi() {
        return pi;
    }

    @Override
    public Double calculo(Double a, Double b) {
        return (4*a)*(Math.pow(b,3)/3) ;
    }



    @Override
    public void exibirDados() {
        System.out.println(exibirObjeto());
        System.out.println(exibirNumLados());
        System.out.println(exibirVolumeM3());
    }

    @Override
    public String exibirNumLados() {
    return "numero de lados :"+getNumLados();
    }

    @Override
    public String exibirObjeto() {
        return "esse objeto é uma esfera!";
    }

    @Override
    public String exibirVolumeM3() {
      return "volume = "+calculo(getPi(),this.raio)+" M³";
    }
}
