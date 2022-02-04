package br.edu.ifg.luziania.bsi.p2.aulaPoo.Prova02.exercicio01;

public class Triangulo extends Bidimensional implements CalculoUm{
    private Double altura;
    private Double base;

    public Triangulo(Integer numLados, Double altura, Double base) {
        super(numLados);
        setAltura(altura);
        setBase(base);
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        if(altura==null||altura<0){
            this.altura = 0.0;
        }
        else {
            this.altura = altura;
        }

    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        if(base==null||base<0){
            this.base = 0.0;
        }
        else {
            this.base = base;
        }

    }

    @Override
    public Double calculo(Double a, Double b) {
       return a*(b/2);
    }

    @Override
    public void exibirDados() {
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
        return "esse objeto é um triângulo!";
    }

    @Override
    public String exibirAreaM2() {
        return "Area = " + calculo(this.altura, this.base) + " M²";
    }
}
