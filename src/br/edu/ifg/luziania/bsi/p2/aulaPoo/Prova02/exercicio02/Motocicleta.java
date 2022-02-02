package br.edu.ifg.luziania.bsi.p2.aulaPoo.Prova02.exercicio02;

public class Motocicleta extends Terrestre implements Dados {
    private Double combustivel;
    private Double kmRodadosContador;

    public Motocicleta() {
        super();
    }

    public Motocicleta(Integer capacidadeDePessoa, Double velocidadeMaxima, Double autonomia, Integer numRodas, CorEnum cor, String placa, Double combustivel, Double kmRodadosContador) {
        super(capacidadeDePessoa, velocidadeMaxima, autonomia, numRodas, cor, placa);
        setCombustivel(combustivel);
        setKmRodadosContador(kmRodadosContador);
    }

    @Override
    public void setNumRodas(Integer numRodas) {
        if (numRodas != 2) {
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

    @Override
    public void setVelocidadeMaxima(Double velocidadeMaxima) {


        super.setVelocidadeMaxima(velocidadeMaxima);
    }

    @Override
    public Double getVelocidadeMaxima() {
        return super.getVelocidadeMaxima();
    }


    public Double CalcularConsumoDeCombustivel(Double kmRodadosContador, Double combustivel) {

        return kmRodadosContador / combustivel;
    }

    public Double calcularTempoEmKmHora(Double autonomia, Double combustivel) {
        return autonomia*combustivel;
    }


    public void capacidadeDePessoasDoTransporte() {
        System.out.println("capacidade de pessoas: " + getCapacidadeDePessoa());

    }


    public void exibirVelocidadeMaxima() {
        System.out.println("velocidade maxima: " + getVelocidadeMaxima());

    }


    public void exibirObjeto() {
        System.out.println("\n" + "Esse objeto e uma moto!");
    }


    public void exibirDados() {
        System.out.println("autonomia: " + getAutonomia());
        System.out.println("combustivel: " + this.combustivel);
        System.out.println("consumo de combustivel: " + CalcularConsumoDeCombustivel(this.kmRodadosContador,this.combustivel) + "\n" + "tempo em km por hora: " + calcularTempoEmKmHora(getAutonomia(),this.combustivel));
    }
@Override
    public void DadosTerrestres() {
        System.out.println("cor: " + getCor());
        System.out.println("placa: " + getPlaca());
        System.out.println("numero de rodas: " + getNumRodas());
    }
}
