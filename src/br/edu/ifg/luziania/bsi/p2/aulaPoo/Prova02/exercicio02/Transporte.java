package br.edu.ifg.luziania.bsi.p2.aulaPoo.Prova02.exercicio02;

public abstract class Transporte {
    private Integer capacidadeDePessoa;
    private Double velocidadeMaxima;
    private Double autonomia;

    public Transporte() {
    }

    public Transporte(Integer capacidadeDePessoa, Double velocidadeMaxima, Double autonomia) {
        setCapacidadeDePessoa(capacidadeDePessoa);
        setVelocidadeMaxima(velocidadeMaxima);
        setAutonomia(autonomia);
    }

    public Integer getCapacidadeDePessoa() {
        return capacidadeDePessoa;
    }

    public void setCapacidadeDePessoa(Integer capacidadeDePessoa) {
        if (capacidadeDePessoa == null || capacidadeDePessoa < 0) {
            this.capacidadeDePessoa = 0;
        } else {
            this.capacidadeDePessoa = capacidadeDePessoa;
        }
    }

    public Double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(Double velocidadeMaxima) {
        if (velocidadeMaxima == null || velocidadeMaxima < 0) {
            this.velocidadeMaxima = 0.0;
        } else {
            this.velocidadeMaxima = velocidadeMaxima;
        }
    }

    public Double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(Double autonomia) {
        if (autonomia == null || autonomia < 0) {
            this.autonomia = 0.0;
        } else {
            this.autonomia = autonomia;
        }
    }



}
