package br.edu.ifg.luziania.bsi.p2.aulaPoo.Prova02.exercicio02;

public class Caminhao extends Terrestre {
    private Double combustivel;
    private Double kmRodadosContador;

    public Caminhao() {
        super();
    }

    public Caminhao(Integer capacidadeDePessoa, Double velocidadeMaxima, Double autonomia, Integer numRodas, CorEnum cor, String placa, Double combustivel, Double kmRodadosContador) {
        super(capacidadeDePessoa, velocidadeMaxima, autonomia, numRodas, cor, placa);
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

    @Override
    public void setCapacidadeDePessoa(Integer capacidadeDePessoa) {
        if (capacidadeDePessoa > 2) {
            super.setCapacidadeDePessoa(0);
        } else {
            super.setCapacidadeDePessoa(capacidadeDePessoa);
        }

    }

    @Override
    public Integer getCapacidadeDePessoa() {
        return super.getCapacidadeDePessoa();
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
        System.out.println("\n" + "Esse objeto e um caminhão!");
    }
@Override
    public void dadosTerrestres() {

        System.out.println("cor: " + getCor());
        System.out.println("autonomia: " + getAutonomia());
        System.out.println("numero de rodas: " + getNumRodas());
        System.out.println("placa: " + getPlaca());
        System.out.println("combustivel: " + getCombustivel() + "\n" + "consumo de combustivel: "
                + CalcularConsumoDeCombustivel() + "\n" + "tempo em km por hora: " + calcularTempoEmKmHora());

    }

}
