package br.edu.ifg.luziania.bsi.p2.aulaPoo.Prova02.exercicio02;

public class Aereo extends Transporte {
    private Double alturaMaximaAlcancada;

    public Aereo() {
        super();
    }

    public Aereo(Integer capacidadeDePessoa, Double velocidadeMaxima, Double autonomia, Double alturaMaximaAlcancada) {
        super(capacidadeDePessoa, velocidadeMaxima, autonomia);
        setAlturaMaximaAlcancada(alturaMaximaAlcancada);
    }

    public Double getAlturaMaximaAlcancada() {

        return alturaMaximaAlcancada;
    }

    public void setAlturaMaximaAlcancada(Double alturaMaximaAlcancada) {
        if(alturaMaximaAlcancada==null || alturaMaximaAlcancada<0){
            this.alturaMaximaAlcancada = 0.0;
        }
        else{
        this.alturaMaximaAlcancada = alturaMaximaAlcancada;
        }
    }
    public void exibirObjeto(){
        System.out.println("esse veiculo é Aereo");
    }
    public void exibirDadosAereo(){
        System.out.println("");
    }
    @Override
    public void capacidadeDePessoasDoTransporte() {
        System.out.println("");
    }
    @Override
    public void exibirVelocidadeMaxima() {
        System.out.println("");
    }

}
