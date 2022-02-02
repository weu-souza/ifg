package br.edu.ifg.luziania.bsi.p2.aulaPoo.Prova02.exercicio03;

public class Comissionado extends Funcionario implements Salario{
    private Double comissoes;
    private Double salarioBase;

    public Comissionado(String nome, CargoEnum cargo, Double comissoes, Double salarioBase) {
        super(nome, cargo);
        setComissoes(comissoes);
        setSalarioBase(salarioBase);
    }

    public Double getComissoes() {
        return comissoes;
    }

    public void setComissoes(Double comissoes) {
        if(comissoes==null || comissoes<0){
            this.comissoes = 0.0;
        }
        else{
            this.comissoes = comissoes;
        }

    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        if(salarioBase==null || salarioBase<0){
            this.salarioBase = 0.0;
        }
        else{
            this.salarioBase = salarioBase;
        }

    }


    @Override
    public Double CalcularTotalAPagar(Double comissoes, Double salarioBase) {
        return salarioBase+comissoes;
    }

    @Override
    public void dadosFuncionario() {
        System.out.println("O funcionário"+getNome()+" com o cargo "+getCargo()+" deverá receber R$"+CalcularTotalAPagar(this.comissoes,this.salarioBase)+"");
    }
}
