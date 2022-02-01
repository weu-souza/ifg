package br.edu.ifg.luziania.bsi.p2.aulaPoo.prova01;

public class Aviao extends Aereo {
    private Double kmRodadosContador;
    private Double combustivel;



    public Aviao(Integer capacidadeDePessoa, Double velocidadeMaxima, Double autonomia, Double alturaMaximaAlcancada, Double kmRodadosContador, Double combustivel) {
        super(capacidadeDePessoa, velocidadeMaxima, autonomia, alturaMaximaAlcancada);
        setCombustivel(combustivel);
        setKmRodadosContador(kmRodadosContador);

    }

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

    public Double getKmRodadosContador() {
        return kmRodadosContador;
    }

    public void setKmRodadosContador(Double kmRodadosContador) {
        if(kmRodadosContador==null || kmRodadosContador<0){
            this.kmRodadosContador = 0.0;
        }
        else{
        this.kmRodadosContador = kmRodadosContador;
        }
    }

    public Double getCombustivel() {

        return this.combustivel;
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
        System.out.println("velocidade maxima: " + getVelocidadeMaxima());

    }

    public Double CalcularConsumoDeCombustivel() {

        return this.kmRodadosContador / this.combustivel;
    }

    public Double calcularTempoEmKmHora() {

        return getAutonomia() * this.combustivel;
    }

    public void objeto() {
        System.out.println("\n" + "esse objeto e um avião!");
    }

    public void exibirDadosAviao() {
        System.out.println("combustivel: "+this.combustivel);
        System.out.println("autonomia: " + getAutonomia());
        System.out.println("altura maxima: " + getAlturaMaximaAlcancada());
        System.out.println("consumo de combustivel: "+CalcularConsumoDeCombustivel());
        System.out.println("tempo em km por hora: " + calcularTempoEmKmHora());

    }


}
