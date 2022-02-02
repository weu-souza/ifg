package br.edu.ifg.luziania.bsi.p2.aulaPoo.Prova02.exercicio02;

public class Carro extends Terrestre {
    private Double combustivel;
    private Double kmRodadosContador;


    public Carro(int capacidadeDePessoa, Double velocidadeMaxima, Double autonomia, Integer numRodas, CorEnum cor, String placa, Double combustivel, Double kmRodadosContador) {
        super(capacidadeDePessoa, velocidadeMaxima, autonomia, numRodas, cor, placa);
        setCombustivel(combustivel);
        setKmRodadosContador(kmRodadosContador);
    }


    @Override
    public void setNumRodas(Integer numRodas) {
        if (numRodas != 4) {
            super.setNumRodas(0);
        } else {
            super.setNumRodas(numRodas);
        }

    }

    @Override
    public Integer getNumRodas() {
        return super.getNumRodas();
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
        if (capacidadeDePessoa > 4) {
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
        System.out.println("Capacidade de pessoas: " + getCapacidadeDePessoa());
    }
    @Override
    public void exibirVelocidadeMaxima() {
        System.out.println("Velocidade maxima: " + getVelocidadeMaxima());

    }


    @Override
    public void exibirObjeto() {
        System.out.println("esse objeto e um carro!");
    }

    @Override
    public void dadosTerrestres() {
        System.out.println("cor: " + getCor() + "\n" + "autonomia: " + getAutonomia());
        System.out.println("placa: " + getPlaca());
        System.out.println("combustivel: " + getCombustivel());
        System.out.println("numero de rodas: " + getNumRodas());
        System.out.println("consumo de combustivel: " + CalcularConsumoDeCombustivel() + "\n" + "tempo em km por hora: " + calcularTempoEmKmHora());

    }

}
