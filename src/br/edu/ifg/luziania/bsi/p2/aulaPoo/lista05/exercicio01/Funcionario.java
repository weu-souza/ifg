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
        if (salario >0){
            this.salarioMensal = salario;
        }
        else
            this.salarioMensal = 0;
    }

    public Funcionario() {
    }

    public String getPrimeiroNome() {
        System.out.println("digite o primeiro nome: ");
        primeiroNome = scanner.next();
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        System.out.println("digite o sobrenome: ");
        sobrenome = scanner.next();
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal >0){
            this.salarioMensal = salarioMensal;
        }

    }

    public double getSalarioMensal() {
        System.out.println("digite o salario: ");
        salarioMensal = scanner.nextDouble();

        return salarioMensal;
    }



    public double salarioAnual() {
        return this.salarioMensal * 12;
    }

    public double aumento() {
        return this.salarioMensal * 0.1;
    }

    public double salarioAnualComAumento() {
        return aumento() * 12;
    }

}

