package br.edu.ifg.luziania.bsi.p2.aulaPoo.Prova02.exercicio02;

import java.util.Scanner;

public class Lista {
    public void exibirLista() {
        Scanner listar = new Scanner(System.in);
        Integer escolher;
        Integer veiculo;
        Carro carro = new Carro(4, 120.0, 13.0, 4, CorEnum.Vermelho, "FXZ4765", 50.0, 20.0);
        Motocicleta motocicleta = new Motocicleta(2, 100.0, 8.0, 2, CorEnum.Azul, "FBC1234", 50.0, 30.0);
        Caminhao caminhao = new Caminhao(2, 100.0, 6.0, 4, CorEnum.Preto, "CDA4565", 50.0, 20.0);
        Aviao aviao = new Aviao(50, 100.0, 50.0, 30.0, 50.0, 20.0);
        Balao balao = new Balao(5, 5.0, 10.0, 5.0, 5.0);
        Barco barco = new Barco(40, 100.0, 20.0, AmbienteEnum.Rio, 50.0, 30.0);
        Navio navio = new Navio(30, 20.0, 4.0, AmbienteEnum.Mar, 50.0, 30.0);
        Terrestre terrestre = new Terrestre();
        Aquatico aquatico = new Aquatico();
        Aereo aereo = new Aereo();

        System.out.println("escolha um veiculo: ");
        System.out.println("1-Terrestre " + "\n" + "2-Aquatico" + "\n" + "3-Aereo");
        for (int i = 0; i < 3; i++) {
            veiculo = listar.nextInt();
            if (veiculo == 1) {
                terrestre.exibirObjeto();
                System.out.println("1-carro\n" + "2-moto\n" + "3-caminhão");
                for (int j = 0; j < 3; j++) {
                    System.out.println("escolha: ");
                    escolher = listar.nextInt();
                    if (escolher == 1) {
                        carro.exibirObjeto();
                        carro.capacidadeDePessoasDoTransporte();
                        carro.exibirVelocidadeMaxima();
                        carro.dadosTerrestres();
                    } else if (escolher == 2) {
                        motocicleta.exibirObjeto();
                        motocicleta.exibirVelocidadeMaxima();
                        motocicleta.capacidadeDePessoasDoTransporte();
                        motocicleta.dadosTerrestres();
                    } else if (escolher == 3) {
                        caminhao.exibirObjeto();
                        caminhao.exibirVelocidadeMaxima();
                        caminhao.capacidadeDePessoasDoTransporte();
                        caminhao.dadosTerrestres();
                    } else {
                        System.out.println("não existe esse veiculo terrestre!");
                        break;
                    }
                }
            } else if (veiculo == 2) {
                aquatico.exibirObjeto();
                System.out.println("1-barco\n" + "2-navio");
                for (int j = 0; j < 2; j++) {
                    System.out.println("escolha: ");
                    escolher = listar.nextInt();
                    if (escolher == 1) {
                        barco.exibirObjeto();
                        barco.exibirVelocidadeMaxima();
                        barco.capacidadeDePessoasDoTransporte();
                        barco.exibirAquatico();
                    } else if (escolher == 2) {
                        navio.exibirObjeto();
                        navio.exibirVelocidadeMaxima();
                        navio.capacidadeDePessoasDoTransporte();
                        navio.exibirAquatico();
                    } else {
                        System.out.println("não existe esse veiculo aquatico!");
                        break;
                    }
                }
            } else if (veiculo == 3) {
                aereo.exibirObjeto();
                System.out.println("1-aviao\n" + "2-balão");
                for (int j = 0; j < 2; j++) {
                    escolher = listar.nextInt();
                    System.out.println("escolha: ");
                    if (escolher == 1) {
                        aviao.exibirObjeto();
                        aviao.exibirVelocidadeMaxima();
                        aviao.capacidadeDePessoasDoTransporte();
                        aviao.exibirDadosAereo();
                    } else if (escolher == 2) {
                        balao.exibirObjeto();
                        balao.capacidadeDePessoasDoTransporte();
                        balao.exibirVelocidadeMaxima();
                        balao.exibirDadosAereo();
                    } else {
                        System.out.println("não existe esse veiculo aereo!");
                        break;
                    }
                }
            } else {
                System.out.println("veiculo inexistente!");
                break;
            }
        }


    }


}
