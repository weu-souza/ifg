package br.edu.ifg.luziania.bsi.p2.aulaPoo.prova01;

public class Balao extends Aereo {
    private int combustivel;

    public Balao() {
        super();
    }

    public Balao(int capacidadeDePessoa, int velocidadeMaxima, int autonomia, int alturaMaximaAlcancada, int combustivel) {
        super(capacidadeDePessoa, velocidadeMaxima, autonomia, alturaMaximaAlcancada);
        this.combustivel = combustivel;
    }

    @Override
    public void setAutonomia(int autonomia) {

        super.setAutonomia(autonomia);
    }

    @Override
    public int getAutonomia() {
        return super.getAutonomia();
    }

    @Override
    public void setAlturaMaximaAlcancada(int alturaMaximaAlcancada) {

        super.setAlturaMaximaAlcancada(alturaMaximaAlcancada);
    }

    @Override
    public int getAlturaMaximaAlcancada() {
        return super.getAlturaMaximaAlcancada();
    }


    public int getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(int combustivel) {

        this.combustivel = combustivel;
    }

    @Override
    public void setCapacidadeDePessoa(int capacidadeDePessoa) {

        super.setCapacidadeDePessoa(capacidadeDePessoa);
    }

    @Override
    public int getCapacidadeDePessoa() {
        return super.getCapacidadeDePessoa();
    }

    @Override
    public void setVelocidadeMaxima(int velocidadeMaxima) {


        super.setVelocidadeMaxima(velocidadeMaxima);
    }

    @Override
    public int getVelocidadeMaxima() {
        return super.getVelocidadeMaxima();
    }

    public void capacidadeDePessoasDoTransporte() {
        if (getCapacidadeDePessoa() > 8 && getCapacidadeDePessoa() < 0) {
            System.out.println("capacidade de pessoas: " + getCapacidadeDePessoa());
        } else {
            System.out.println("capacidade de pessoas excedeu o numero minimo ou maximo de pessoas!");
        }

    }

    public void exibirVelocidadeMaxima() {
        if (getVelocidadeMaxima() > 1061 && getVelocidadeMaxima() < 0) {
            System.out.println("velocidade maxima" + getVelocidadeMaxima());
        } else {
            System.out.println("a velocidade Exedeu o limite!");
        }

    }

    public int CalcularConsumoDeCombustivel() {
        return 2 * getCombustivel();
    }

    public int calcularTempoEmKmHora() {
        return getAutonomia() * getCombustivel();
    }

    public void objeto() {
        System.out.println("\n" + "esse objeto e um balão!");
    }

    public void exibirDadosBalao() {

        if (getAutonomia() < 18 && getAutonomia() > 0) {
            System.out.println("autonomia: " + getAutonomia());
        } else {
            System.out.println("valor invalido!");
        }
        if (getAlturaMaximaAlcancada() > 10 && getAlturaMaximaAlcancada() < 0) {
            System.out.println("altura maxima: " + getAlturaMaximaAlcancada());
        } else {
            System.out.println("altura maxima excedeu o limite!");
        }
        if (getCombustivel() < 10 && getCombustivel() > 0) {
            System.out.println("combustivel: " + getCombustivel() + "\n" + "consumo de combustivel: " + CalcularConsumoDeCombustivel() + "\n" + "tempo em km por hora: " + calcularTempoEmKmHora());
        } else {
            System.out.println("combustivel Excedeu o limite!");
        }
    }
}
