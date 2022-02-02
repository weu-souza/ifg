package br.edu.ifg.luziania.bsi.p2.aulaPoo.Prova02.exercicio02;

public class Aviao extends Aereo implements Dados {
    private Double kmRodadosContador;
    private Double combustivel;


    public Aviao(Integer capacidadeDePessoa, Double velocidadeMaxima, Double autonomia, Double alturaMaximaAlcancada, Double kmRodadosContador, Double combustivel) {
        super(capacidadeDePessoa, velocidadeMaxima, autonomia, alturaMaximaAlcancada);
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

        return this.combustivel;
    }

    public void setCombustivel(Double combustivel) {
        if (combustivel == null || combustivel < 0) {
            this.combustivel = 0.0;
        } else {
            this.combustivel = combustivel;
        }


    }

    @Override
    public Double CalcularConsumoDeCombustivel(Double kmRodadosContador, Double combustivel) {

        return kmRodadosContador / combustivel;
    }
@Override
    public Double calcularTempoEmKmHora(Double autonomia, Double combustivel) {
        return autonomia*combustivel;
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
        System.out.println("\n" + "esse objeto e um avião!");
    }

@Override
    public void exibirDados() {
        System.out.println("combustivel: " + this.combustivel);
        System.out.println("autonomia: " + this.getAutonomia());
        System.out.println("consumo de combustivel: " + CalcularConsumoDeCombustivel(this.kmRodadosContador,this.combustivel) + "\n" + "tempo em km por hora: " + calcularTempoEmKmHora(getAutonomia(),this.combustivel));

    }

    @Override
    public void dadosAereo() {
        System.out.println("altura maxima: " + getAlturaMaximaAlcancada());
    }
}
