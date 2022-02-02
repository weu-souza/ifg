package br.edu.ifg.luziania.bsi.p2.aulaPoo.Prova02.exercicio03.prova01;

public class Balao extends Aereo {
    private Double combustivel;

    public Balao() {
        super();
    }

    public Balao(Integer capacidadeDePessoa, Double velocidadeMaxima, Double autonomia, Double alturaMaximaAlcancada, Double combustivel) {
        super(capacidadeDePessoa, velocidadeMaxima, autonomia, alturaMaximaAlcancada);
        setCombustivel(combustivel);
    }

    @Override
    public void setAutonomia(Double autonomia) {

        super.setAutonomia(autonomia);
    }

    @Override
    public Double getAutonomia() {
        return super.getAutonomia();
    }

    @Override
    public void setAlturaMaximaAlcancada(Double alturaMaximaAlcancada) {

        super.setAlturaMaximaAlcancada(alturaMaximaAlcancada);
    }

    @Override
    public Double getAlturaMaximaAlcancada() {
        return super.getAlturaMaximaAlcancada();
    }


    public Double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(Double combustivel) {

        if(combustivel==null || combustivel<0){
            this.combustivel = 0.0;
        }
        else{
            this.combustivel = combustivel;
        }
    }

    @Override
    public void setCapacidadeDePessoa(Integer capacidadeDePessoa) {

        super.setCapacidadeDePessoa(capacidadeDePessoa);
    }

    @Override
    public Integer getCapacidadeDePessoa() {
        return super.getCapacidadeDePessoa();
    }

    @Override
    public void setVelocidadeMaxima(Double velocidadeMaxima) {


        super.setVelocidadeMaxima(velocidadeMaxima);
    }

    @Override
    public Double getVelocidadeMaxima() {
        return super.getVelocidadeMaxima();
    }

    public void capacidadeDePessoasDoTransporte() {
        System.out.println("capacidade de pessoas: " + getCapacidadeDePessoa());

    }

    public void exibirVelocidadeMaxima() {
        System.out.println("velocidade maxima" + getVelocidadeMaxima());
    }

    public Double CalcularConsumoDeCombustivel() {
        return 2 * getCombustivel();
    }

    public Double calcularTempoEmKmHora() {
        return getAutonomia() * getCombustivel();
    }

    public void objeto() {
        System.out.println("\n" + "esse objeto e um balão!");
    }

    public void exibirDadosBalao() {
        System.out.println("autonomia: " + getAutonomia());
        System.out.println("altura maxima: " + getAlturaMaximaAlcancada());
        System.out.println("combustivel: " + getCombustivel() + "\n"
                + "consumo de combustivel: " + CalcularConsumoDeCombustivel() + "\n" + "tempo em km por hora: " + calcularTempoEmKmHora());

    }
}
