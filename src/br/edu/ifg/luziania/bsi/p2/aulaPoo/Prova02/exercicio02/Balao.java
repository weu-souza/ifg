package br.edu.ifg.luziania.bsi.p2.aulaPoo.Prova02.exercicio02;

public class Balao extends Aereo {
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
    public void capacidadeDePessoasDoTransporte() {
        System.out.println("capacidade de pessoas: " + getCapacidadeDePessoa());

    }

    @Override
    public void exibirVelocidadeMaxima() {
        System.out.println("velocidade maxima" + getVelocidadeMaxima());
    }

    public Double CalcularConsumoDeCombustivel() {
        return 2 * getCombustivel();
    }

    public Double calcularTempoEmKmHora() {
        return getAutonomia() * getCombustivel();
    }

    @Override
    public void exibirObjeto() {
        System.out.println("\n" + "esse objeto e um balão!");
    }

    @Override
    public void exibirDadosAereo() {
        System.out.println("autonomia: " + getAutonomia());
        System.out.println("altura maxima: " + getAlturaMaximaAlcancada());
        System.out.println("combustivel: " + getCombustivel() + "\n"
                + "consumo de combustivel: " + CalcularConsumoDeCombustivel() + "\n" + "tempo em km por hora: " + calcularTempoEmKmHora());

    }
}
