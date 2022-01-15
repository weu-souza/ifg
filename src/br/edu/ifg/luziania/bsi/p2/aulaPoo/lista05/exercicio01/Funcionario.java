package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista05.exercicio01;

import java.util.Scanner;

public class Funcionario {
    Scanner scanner = new Scanner(System.in);
    private String primeiroNome;
    private String sobrenome;
    private double salarioMensal;


    public Funcionario(String nome, String sobrenome, double salario) {
        this.primeiroNome = nome;
        this.sobrenome = sobrenome;
        if (salario > 0) {
            this.salarioMensal = salario;
        } else
            this.salarioMensal = 0;
    }

    public Funcionario() {
        System.out.println("digite o primeiro nome: ");
        setPrimeiroNome(scanner.next());
        System.out.println("digite o sobrenome: ");
        setSobrenome(scanner.next());
        System.out.println("digite o salario: ");
        setSalarioMensal(scanner.nextDouble());
    }

    public String getPrimeiroNome() {

        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {

        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal > 0) {
            this.salarioMensal = salarioMensal;
        }

    }

    public double getSalarioMensal() {
        return salarioMensal;
    }


    public double salarioAnual() {
        return this.salarioMensal * 12;
    }

    public double aumento() {
        double aumento = this.salarioMensal * 0.1;
        return aumento * 12;
    }

    public double salarioAnualComAumento() {

        return this.salarioAnual() + aumento();
    }

    public String dadosFuncionario() {
        return "\n" + "o Funcionario " + getPrimeiroNome() + " " + getSobrenome() + "\n" + "salario mensal de: " + getSalarioMensal() +
                "\n" + "recebe o salario anual de: " + "\n" + salarioAnual() + "\n" + "com aumento de: " + aumento() + "\n" +
                "tem o salario final de: " + salarioAnualComAumento();
    }

}

