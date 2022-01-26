package br.edu.ifg.luziania.bsi.p2.aulaPoo.prova01;

import java.util.Scanner;

public class Lista {
    public String exibirLista(){
        Scanner listar = new Scanner(System.in);
        int escolher;
        Carro carro = new Carro(4, 120, 13, 4, "preto", "FXZ-4765", 50, 2000);
        Motocicleta motocicleta = new Motocicleta(2, 100, 8, 2, "branca", "FBC-1234", 50, 3000);
        Caminhao caminhao = new Caminhao(2, 100, 6, 4, "vermelho", "CDA-4565", 50, 2000);
        Aviao aviao = new Aviao(50, 100, 50, 3000, 50, 200);
        Balao balao = new Balao(5, 5, 10, 5, 5);
        Barco barco = new Barco(40, 100, 20, "rio", 50, 3000);
        Navio navio = new Navio(30, 20, 4, "mar", 50, 30);
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









        return "";
    }

    @Override
    public String toString() {
        return exibirLista();
    }
}
