package br.edu.ifg.luziania.bsi.p2.aulaPoo.Prova02.exercicio01;

public class Tetraedro extends Tridimensional implements CalculoTres{
    private Double larguraLados;

    public Tetraedro(Integer numLados, Double larguraLados) {
        super(numLados);
        setLarguraLados(larguraLados);
    }

    public Double getLarguraLados() {
        return larguraLados;
    }

    public void setLarguraLados(Double larguraLados) {
        if(larguraLados==null||larguraLados<0){
            this.larguraLados = 0.0;
        }
        else {
            this.larguraLados = larguraLados;
        }

    }

    @Override
    public Double Calculo(Double a) {

        return (Math.pow(a,3))/(6*Math.sqrt(2));
    }

    @Override
    public void exibirDados() {
        System.out.println(exibirObjeto());
        System.out.println(exibirNumLados());
        System.out.println(exibirVolumeM3());
    }

    @Override
    public String exibirNumLados() {
return "numero de lados: "+getNumLados() ;
    }

    @Override
    public String exibirObjeto() {
        return "esse objeto é um tetraedro!";
    }

    @Override
    public String exibirVolumeM3() {
    return "volume = "+Calculo(this.larguraLados)+" M³";
    }
}
