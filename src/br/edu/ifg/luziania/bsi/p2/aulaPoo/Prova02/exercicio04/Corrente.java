package br.edu.ifg.luziania.bsi.p2.aulaPoo.Prova02.exercicio04;

public class Corrente extends Conta implements VirarMes{
    public Corrente(Double saldo) {
        super(saldo);
    }

    @Override
    public void setSaldo(Double saldo) {
        if (saldo!=0) {
            super.setSaldo(0.0);
        } else {
            super.setSaldo(saldo);
        }
    }

    @Override
    public double getSaldo() {
        return super.getSaldo();
    }

    public Double decrementarSaldo(){
        return getSaldo()-21.50;
    }
    public Double rentabilidadePorJuros(){
        return decrementarSaldo()*0.0042;
    }


    @Override
    public void depositarDinheiro(Integer a) {
        super.depositarDinheiro(a);
        System.out.println("rentabilidade mensal: "+rentabilidadePorJuros()+" ao mes");
    }

    @Override
    public void depositarCheque(Double a) {
        super.depositarCheque(a);
        System.out.println("rentabilidade mensal: "+rentabilidadePorJuros()+" ao mes");
    }

    @Override
    public void sacar(Double a) {
        super.sacar(a);
        System.out.println("taxa de operação: "+gerarTaxa());
        consultarSaldo();
    }

    @Override
    public void consultarSaldo() {
        System.out.println("saldo Atual: " + getSaldo());
    }



    @Override
    public Double gerarTaxa() {
        return 0.10;
    }
    @Override
    public void dadosConta() {
        consultarSaldo();



    }
}
