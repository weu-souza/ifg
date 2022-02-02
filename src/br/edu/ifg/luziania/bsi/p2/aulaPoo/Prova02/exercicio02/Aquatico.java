package br.edu.ifg.luziania.bsi.p2.aulaPoo.Prova02.exercicio02;

public class Aquatico extends Transporte {
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

    public void exibirObjeto(){
        System.out.println("Esse veiculo é aquatico!");
    }
    public void exibirAquatico(){
        System.out.println("não definido!");
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
