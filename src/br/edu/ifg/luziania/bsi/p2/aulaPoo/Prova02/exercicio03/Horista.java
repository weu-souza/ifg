package br.edu.ifg.luziania.bsi.p2.aulaPoo.Prova02.exercicio03;

public class Horista extends Funcionario implements Salario{
    private Double valorHorasTrabalhadas;
    private Double horasTrabalhadasMes;

    public Horista(String nome, CargoEnum cargo, Double valorHorasTrabalhadas, Double horasTrabalhadasMes) {
        super(nome, cargo);
        setHorasTrabalhadasMes(horasTrabalhadasMes);
        setValorHorasTrabalhadas(valorHorasTrabalhadas);
    }

    public Double getValorHorasTrabalhadas() {
        return valorHorasTrabalhadas;
    }

    public void setValorHorasTrabalhadas(Double valorHorasTrabalhadas) {
        if(valorHorasTrabalhadas==null || valorHorasTrabalhadas<0){
            this.valorHorasTrabalhadas = 0.0;
        }
        else{
            this.valorHorasTrabalhadas = valorHorasTrabalhadas;
        }

    }

    public Double getHorasTrabalhadasMes() {
        return horasTrabalhadasMes;
    }

    public void setHorasTrabalhadasMes(Double horasTrabalhadasMes) {
        if(horasTrabalhadasMes==null || horasTrabalhadasMes<0){
            this.horasTrabalhadasMes = 0.0;
        }
        else{
            this.horasTrabalhadasMes = horasTrabalhadasMes;
        }

    }

    @Override
    public Double CalcularTotalAPagar(Double valorHorasTrabalhadas, Double horasTrabalhadasMes) {
        return valorHorasTrabalhadas*horasTrabalhadasMes;
    }

    @Override
    public void dadosFuncionario() {
        System.out.println("O funcionário"+getNome()+" com o cargo "+getCargo()+" deverá receber R$"+CalcularTotalAPagar(this.valorHorasTrabalhadas,this.horasTrabalhadasMes)+"");
    }
}
