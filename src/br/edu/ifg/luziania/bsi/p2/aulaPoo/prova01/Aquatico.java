package br.edu.ifg.luziania.bsi.p2.aulaPoo.prova01;

public class Aquatico extends Transporte{
    private String ambiente;

    public Aquatico() {
        super();
    }

    public Aquatico(int capacidadeDePessoa, int velocidadeMaxima, int autonomia, String ambiente) {
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
