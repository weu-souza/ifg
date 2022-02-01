package br.edu.ifg.luziania.bsi.p2.aulaPoo.prova01;

public class Carro extends Terrestre {
    private Double combustivel;
    private Double kmRodadosContador;



    public Carro(int capacidadeDePessoa, Double velocidadeMaxima, Double autonomia, int numRodas, String cor, String placa, Double combustivel, Double kmRodadosContador) {
        super(capacidadeDePessoa, velocidadeMaxima, autonomia, numRodas, cor, placa);
        setCombustivel(combustivel);
        setKmRodadosContador(kmRodadosContador);
    }

    @Override
    public void setPlaca(String placa) {
        super.setPlaca(placa);
    }

    @Override
    public String getPlaca() {
        return super.getPlaca();
    }

    @Override
    public void setNumRodas(Integer numRodas) {

        super.setNumRodas(numRodas);
    }

    @Override
    public Integer getNumRodas() {
        return super.getNumRodas();
    }


    public Double getKmRodadosContador() {
        return kmRodadosContador;
    }

    public void setKmRodadosContador(Double kmRodadosContador) {
        if(kmRodadosContador==null||kmRodadosContador<0){
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
        if(combustivel==null||combustivel<0){
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
        if (getCapacidadeDePessoa() > 4 && getCapacidadeDePessoa() < 0) {
            System.out.println("Capacidade de pessoas: " + getCapacidadeDePessoa());
        } else {
            System.out.println("capacidade de pessoas excedeu o numero minimo ou maximo de pessoas!");
        }

    }

    public void exibirVelocidadeMaxima() {
        if (getVelocidadeMaxima() > 100 && getVelocidadeMaxima() < 0) {
            System.out.println("Velocidade maxima: " + getVelocidadeMaxima());
        } else {
            System.out.println("a velocidade Exedeu o limite!");
        }

    }

    public Double CalcularConsumoDeCombustivel() {

        return getKmRodadosContador() / getCombustivel();
    }

    public Double calcularTempoEmKmHora() {
        return getAutonomia() * getCombustivel();
    }

    public void exibirObjeto() {
        System.out.println("esse objeto e um carro!");
    }

    public void exibirCarro() {
        System.out.println("cor: " + getCor() + "\n" + "autonomia: " + getAutonomia());
        System.out.println("placa: " + getPlaca());
        System.out.println("combustivel: " + getCombustivel());
        System.out.println("numero de rodas: " + getNumRodas());
        System.out.println("combustivel: " + getCombustivel() + "\n" + "consumo de combustivel: "
                + CalcularConsumoDeCombustivel() + "\n" + "tempo em km por hora: " + calcularTempoEmKmHora());

    }

}
