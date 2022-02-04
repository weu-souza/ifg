package br.edu.ifg.luziania.bsi.p2.aulaPoo.Prova02.exercicio01;

public class Cubo extends Tridimensional implements  CalculoDois{
    private Double base;
    private Double altura;
    private Double profundidade;

    public Cubo(Integer numLados, Double base, Double altura, Double profundidade) {
        super(numLados);
        setAltura(altura);
        setBase(base);
        setProfundidade(profundidade);
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

    public Double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(Double profundidade) {
        if(profundidade==null||profundidade<0){
            this.profundidade = 0.0;
        }
        else {
            this.profundidade = profundidade;
        }

    }

    @Override
    public Double calculo(Double a, Double b, Double c) {
        return b*a*c;
    }

    @Override
    public void exibirDados() {
        System.out.println(exibirObjeto());
        System.out.println(exibirNumLados());
        System.out.println(exibirVolumeM3());
    }

    @Override
    public String exibirNumLados() {
    return "numero de lados: "+getNumLados();
    }

    @Override
    public String exibirObjeto() {
        return "esse objeto e um cubo!";
    }

    @Override
    public String exibirVolumeM3() {
    return "volume = "+calculo(this.base,this.altura,this.profundidade)+" M³";
    }
}
