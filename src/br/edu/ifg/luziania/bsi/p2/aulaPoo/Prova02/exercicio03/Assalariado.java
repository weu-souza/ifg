package br.edu.ifg.luziania.bsi.p2.aulaPoo.Prova02.exercicio03;

public class Assalariado extends Funcionario{
    Double salarioFixo;

    public Assalariado(String nome, CargoEnum cargo, Double salarioFixo) {
        super(nome, cargo);
       setSalarioFixo(salarioFixo);
    }

    public Double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(Double salarioFixo) {
        if(salarioFixo==null || salarioFixo<0){
            this.salarioFixo = 0.0;
        }
        else{
            this.salarioFixo = salarioFixo;
        }

    }

    @Override
    public void dadosFuncionario() {
        System.out.println("O funcionário"+getNome()+" com o cargo "+getCargo()+" deverá receber R$"+this.salarioFixo+"");
    }
}
