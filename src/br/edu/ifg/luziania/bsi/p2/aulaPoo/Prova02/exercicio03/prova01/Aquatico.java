package br.edu.ifg.luziania.bsi.p2.aulaPoo.Prova02.exercicio03.prova01;

public class Aquatico extends Transporte {
    private String ambiente;

    public Aquatico() {
        super();
    }

    public Aquatico(Integer capacidadeDePessoa, Double velocidadeMaxima, Double autonomia, String ambiente) {
        super(capacidadeDePessoa, velocidadeMaxima, autonomia);
        this.ambiente = ambiente;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }


}
