package br.edu.ifg.luziania.bsi.p2.aulaPoo.Prova02.exercicio02;

public class Navio extends Aquatico {
    private Double combustivel;
    private Double kmRodadosContador;


    public Navio(Integer capacidadeDePessoa, Double velocidadeMaxima, Double autonomia, AmbienteEnum ambiente, Double combustivel, Double kmRodadosContador) {
        super(capacidadeDePessoa, velocidadeMaxima, autonomia, ambiente);
        setCombustivel(combustivel);
        setKmRodadosContador(kmRodadosContador);
    }


    public Double getKmRodadosContador() {
        return kmRodadosContador;
    }

    public void setKmRodadosContador(Double kmRodadosContador) {

        if (kmRodadosContador == null || kmRodadosContador < 0) {
            this.kmRodadosContador = 0.0;
        } else {
            this.kmRodadosContador = kmRodadosContador;
        }
    }

    public Double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(Double combustivel) {
        if (combustivel == null || combustivel < 0) {
            this.combustivel = 0.0;
        } else {
            this.combustivel = combustivel;
        }

    }


    public Double CalcularConsumoDeCombustivel() {
        return getKmRodadosContador() / getCombustivel();
    }

    public Double calcularTempoEmKmHora() {
        return getAutonomia() * getCombustivel();
    }
    @Override
    public void capacidadeDePessoasDoTransporte() {
        System.out.println("capacidade de pessoas: " + getCapacidadeDePessoa());
    }
    @Override
    public void exibirVelocidadeMaxima() {
        System.out.println("velocidade maxima: " + getVelocidadeMaxima());
    }

    @Override
    public void exibirObjeto() {
        System.out.println("\n" + "esse objeto e um navio!");
    }

    @Override
    public void exibirAquatico() {
        System.out.println("autonomia: " + getAutonomia() + "\n" + "ambiente: " + getAmbiente());
        System.out.println("combustivel: " + getCombustivel() + "\n" + "consumo de combustivel: " +
                CalcularConsumoDeCombustivel() + "\n" + "tempo em km por hora: " + calcularTempoEmKmHora());

    }
}
