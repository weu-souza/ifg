package br.edu.ifg.luziania.bsi.p2.aulaPoo.Prova02.exercicio04;

import java.util.Scanner;

public class Iniciar {
    Scanner scanner = new Scanner(System.in);
    Poupanca poupanca = new Poupanca(2.0);
    Corrente corrente = new Corrente(0.0);
    Investimento investimento = new Investimento(0.0);

    public void inicio() {
        int opcao;
        do {
            exibeMenu();
            opcao = scanner.nextInt();
            escolheOpcao(opcao);

        } while (opcao != 4);
    }

    public void exibeMenu() {
        System.out.println("escolha uma conta!");
        System.out.println("1-Conta corrente\n2-Conta poupança\n3-Conta investimento\n4-Sair");

    }

    public void escolheOpcao(int opcao) {
        double valor;
        switch (opcao) {
            case 1:
                corrente.dadosConta();
                System.out.println("voce quer depositar ou sacar?\n1-depositar\n2-sacar");
                int opcao1 = scanner.nextInt();
                switch (opcao1) {

                    case 1:


                        System.out.println("voce quer depositar cheque ou dinheiro?\n1-cheque\n2-dinheiro:");
                        int opcao2 = scanner.nextInt();
                        switch (opcao2) {
                            case 1:
                                System.out.println("digite o valor a ser depositado?");
                                corrente.depositarCheque(scanner.nextDouble());
                                break;
                            case 2:
                                System.out.println("digite o valor a ser depositado?");
                                corrente.depositarDinheiro(scanner.nextInt());

                        }
                        break;

                    case 2:
                        System.out.println("digite o valor a ser sacado");
                        corrente.sacar(scanner.nextDouble());
                        break;

                }


                break;
            case 2:
                poupanca.dadosConta();
                System.out.println("voce quer depositar ou sacar?\n1-depositar\n2-sacar");
                int opcao4 = scanner.nextInt();
                switch (opcao4) {

                    case 1:


                        System.out.println("voce quer depositar cheque ou dinheiro?\n1-cheque\n2-dinheiro:");
                        int opcao2 = scanner.nextInt();
                        switch (opcao2) {

                            case 1:
                                System.out.println("digite o valor a ser depositado?");
                                poupanca.depositarCheque(scanner.nextDouble());

                                break;
                            case 2:
                                System.out.println("digite o valor a ser depositado?");
                                poupanca.depositarDinheiro(scanner.nextInt());

                        }
                        break;

                    case 2:
                        System.out.println("digite o valor a ser sacado");
                        poupanca.sacar(scanner.nextDouble());

                        break;

                }


                break;
            case 3:
                investimento.dadosConta();
                System.out.println("voce quer depositar ou sacar?\n1-depositar\n2-sacar");
                int opcao5 = scanner.nextInt();
                switch (opcao5) {

                    case 1:


                        System.out.println("voce quer depositar cheque ou dinheiro?\n1-cheque\n2-dinheiro:");
                        int opcao2 = scanner.nextInt();
                        switch (opcao2) {
                            case 1:
                                System.out.println("digite o valor a ser depositado?");
                                investimento.depositarCheque(scanner.nextDouble());
                                break;
                            case 2:
                                System.out.println("digite o valor a ser depositado?");
                                investimento.depositarDinheiro(scanner.nextInt());
                        }
                        break;

                    case 2:
                        System.out.println("digite o valor a ser sacado");
                        investimento.sacar(scanner.nextDouble());
                        break;

                }


                break;
            case 4:
                System.out.println("saindo...");
        }


    }


}