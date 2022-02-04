package br.edu.ifg.luziania.bsi.p2.aulaPoo.prova01;

import java.util.Scanner;

public class Lista {
    public void exibirLista(){
        Scanner listar = new Scanner(System.in);
        int escolher;
        Carro carro = new Carro(4, 120.0, 13.0, 4, "preto", "FXZ4765", 50.0, 20.0);
        Motocicleta motocicleta = new Motocicleta(2, 100.0, 8.0, 2, "branca", "FBC1234", 50.0, 30.0);
        Caminhao caminhao = new Caminhao(2, 100.0, 6.0, 4, "vermelho", "CDA4565", 50.0, 20.0);
        Aviao aviao = new Aviao(50, -100.0, 50.0, 30.0, 50.0, 20.0);
        Balao balao = new Balao(5, 5.0, 10.0, 5.0, 5.0);
        Barco barco = new Barco(40, 100.0, 20.0, "rio", 50.0, 30.0);
        Navio navio = new Navio(30, 20.0, 4.0, "mar", 50.0, 30.0);
        for (int i = 0; i < 7; i++) {
            System.out.println("escolha um veiculo");
            System.out.println("1-carro\n"+"2-moto\n"+"3-caminhão\n"+"4-barco\n"+"5-navio\n"+"6-aviao\n"+"7-balão");
            escolher = listar.nextInt();

            if(escolher == 1){
                carro.exibirObjeto();
                carro.capacidadeDePessoasDoTransporte();
                carro.exibirVelocidadeMaxima();
                carro.exibirCarro();
            }
            else if(escolher == 2){
                motocicleta.exibirObjeto();
                motocicleta.exibirVelocidadeMaxima();
                motocicleta.capacidadeDePessoasDoTransporte();
                motocicleta.dadosMoto();
            }else if(escolher == 3){
                caminhao.exibirObjeto();
                caminhao.exibirVelocidadeMaxima();
                caminhao.capacidadeDePessoasDoTransporte();
                caminhao.exibirCaminhão();
            }else if(escolher == 4){
                barco.objeto();
                barco.exibirVelocidadeMaxima();
                barco.capacidadeDePessoasDoTransporte();
                barco.dadosBarco();
            }else if(escolher == 5){
                navio.objeto();
                navio.exibirVelocidadeMaxima();
                navio.capacidadeDePessoasDoTransporte();
                navio.dadosNavio();
            }else if(escolher == 6){
                aviao.objeto();
                aviao.exibirVelocidadeMaxima();
                aviao.capacidadeDePessoasDoTransporte();
                aviao.exibirDadosAviao();
            }else if(escolher == 7){
                balao.objeto();
                balao.capacidadeDePessoasDoTransporte();
                balao.exibirVelocidadeMaxima();
                balao.exibirDadosBalao();
            }
        }











    }


}
