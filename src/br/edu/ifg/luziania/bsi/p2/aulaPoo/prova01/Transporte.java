package br.edu.ifg.luziania.bsi.p2.aulaPoo.prova01;

public class Transporte {
    private int capacidadeDePessoa;
    private int velocidadeMaxima;
    private int autonomia;

    public Transporte() {
    }

    public Transporte(int capacidadeDePessoa, int velocidadeMaxima, int autonomia) {
        this.capacidadeDePessoa = capacidadeDePessoa;
        this.velocidadeMaxima = velocidadeMaxima;
        this.autonomia = autonomia;
    }

    public int getCapacidadeDePessoa() {
        return capacidadeDePessoa;
    }

    public void setCapacidadeDePessoa(int capacidadeDePessoa) {
        this.capacidadeDePessoa = capacidadeDePessoa;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }
}
