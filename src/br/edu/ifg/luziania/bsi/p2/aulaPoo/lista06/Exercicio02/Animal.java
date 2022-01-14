package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio02;

public class Animal {
    private double peso;
    private Integer idade;
    private String alimento;
    private double velocidade;

    public Animal() {
    }

    public Animal(double peso, Integer idade, String alimento, double velocidade) {
        this.peso = peso;
        this.idade = idade;
        this.alimento = alimento;
        this.velocidade = velocidade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}
