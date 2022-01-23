package br.edu.ifg.luziania.bsi.p2.aulaPoo.prova01;

public class Aereo extends Transporte{
    private int alturaMaximaAlcancada;

    public Aereo() {
        super();
    }

    public Aereo(int capacidadeDePessoa, int velocidadeMaxima, int autonomia, int alturaMaximaAlcancada) {
        super(capacidadeDePessoa, velocidadeMaxima, autonomia);
        this.alturaMaximaAlcancada = alturaMaximaAlcancada;
    }

    public int getAlturaMaximaAlcancada() {
        return alturaMaximaAlcancada;
    }

    public void setAlturaMaximaAlcancada(int alturaMaximaAlcancada) {
        this.alturaMaximaAlcancada = alturaMaximaAlcancada;
    }

}
