package br.edu.ifg.luziania.bsi.p2.aulaPoo.Prova02.exercicio02;

public class Balao extends Aereo implements Dados {
    private Double combustivel;

    public Balao() {
        super();
    }

    public Balao(Integer capacidadeDePessoa, Double velocidadeMaxima, Double autonomia, Double alturaMaximaAlcancada, Double combustivel) {
        super(capacidadeDePessoa, velocidadeMaxima, autonomia, alturaMaximaAlcancada);
        setCombustivel(combustivel);
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

    @Override
    public void setCapacidadeDePessoa(Integer capacidadeDePessoa) {
        if (capacidadeDePessoa > 10) {
            super.setCapacidadeDePessoa(0);
        } else {
            super.setCapacidadeDePessoa(capacidadeDePessoa);
        }

    }

    @Override
    public Integer getCapacidadeDePessoa() {
        return super.getCapacidadeDePessoa();
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
    public void exibirVelocidadeMaxima() {
        System.out.println("velocidade maxima" + getVelocidadeMaxima());
    }
    @Override
    public void exibirObjeto() {
        System.out.println("\n" + "esse objeto e um balão!");
    }
    @Override
    public void capacidadeDePessoasDoTransporte() {
        System.out.println("capacidade de pessoas: " + getCapacidadeDePessoa());

    }
    @Override
    public void exibirDados() {
        System.out.println("autonomia: " + getAutonomia());
        System.out.println("consumo de combustivel: " + CalcularConsumoDeCombustivel(2.0,this.combustivel) + "\n" + "tempo em km por hora: " + calcularTempoEmKmHora(getAutonomia(),this.combustivel));

    }

    @Override
    public void dadosAereo() {
        System.out.println("altura maxima: " + getAlturaMaximaAlcancada());
    }
}
