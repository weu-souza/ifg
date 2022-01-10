package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista05.exercicio01;




public class Aplicativo {
    public static void main(String[] args) {


        Funcionario funcionario = new Funcionario();

        System.out.println("o Funcionario " + funcionario.getPrimeiroNome() +" "  + funcionario.getSobrenome() + "\n"+ "salario mensal de: "+funcionario.getSalarioMensal()+
                "recebe o salario anual de: "+"\n" + funcionario.salarioAnual() + "\n"+ "com aumento de: " + funcionario.aumento() +"\n"+
                "tem o salario final de: " + funcionario.salarioAnualComAumento());

    }


}
