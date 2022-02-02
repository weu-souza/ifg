package br.edu.ifg.luziania.bsi.p2.aulaPoo.Prova02.exercicio03;

public abstract class Funcionario {
    private String nome;
    private CargoEnum cargo;

    public Funcionario(String nome, CargoEnum cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CargoEnum getCargo() {
        return cargo;
    }

    public void setCargo(CargoEnum cargo) {
        this.cargo = cargo;
    }

    public void dadosFuncionario(){
        System.out.println(this.nome);
    }
}
