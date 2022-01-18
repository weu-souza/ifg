package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista05.exercicio01;

import java.util.Scanner;

public class Funcionario {

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

    public void dadosFuncionario() {
        System.out.println("\n" + "o Funcionario " + getPrimeiroNome() + " " + getSobrenome());
        if(getSalarioMensal()>0){
            System.out.println("\n" + "salario mensal de: " + getSalarioMensal());
        }
         if(salarioAnual()>0){
            System.out.println("recebe o salario anual de: " +  salarioAnual());
        }
         if(aumento()>0){
            System.out.println("com aumento de: " + aumento());
        }
         if(salarioAnualComAumento()>0){
            System.out.println("tem o salario final de: " + salarioAnualComAumento());
        }
         else{
             System.out.println("salario invalido");
         }
    }

}

