package br.edu.ifg.luziania.bsi.p2.aulaPoo.Prova02.exercicio02;

public abstract class Aquatico extends Transporte  {
    private AmbienteEnum ambiente;

    public Aquatico() {
        super();
    }

    public Aquatico(Integer capacidadeDePessoa, Double velocidadeMaxima, Double autonomia, AmbienteEnum ambiente) {
        super(capacidadeDePessoa, velocidadeMaxima, autonomia);
        setAmbiente(ambiente);
    }

    public AmbienteEnum getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(AmbienteEnum ambiente) {

        this.ambiente = ambiente;
    }
public void dadosAquatico(){
    System.out.println(this.ambiente);
}


}
