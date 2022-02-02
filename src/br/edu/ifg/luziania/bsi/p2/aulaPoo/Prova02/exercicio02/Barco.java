package br.edu.ifg.luziania.bsi.p2.aulaPoo.Prova02.exercicio02;

public class Barco extends Aquatico {
    private Double combustivel;
    private Double kmRodadosContador;

    public Barco() {
        super();
    }

    public Barco(Integer capacidadeDePessoa, Double velocidadeMaxima, Double autonomia, AmbienteEnum ambiente, Double combustivel, Double kmRodadosContador) {
        super(capacidadeDePessoa, velocidadeMaxima, autonomia, ambiente);
      setCombustivel(combustivel);
        setKmRodadosContador(kmRodadosContador);
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
        System.out.println("\n" + "esse objeto e um barco!");
    }
@Override
    public void exibirAquatico() {
        System.out.println("km no contador: " + getKmRodadosContador() + "\n" + "ambiente: " + getAmbiente());
        System.out.println("autonomia: " + getAutonomia());
        System.out.println("combustivel: " + getCombustivel() + "\n"
                + "consumo de combustivel: " + CalcularConsumoDeCombustivel() + "\n" + "tempo em km por hora: " + calcularTempoEmKmHora());

    }

}
