package br.edu.ifg.luziania.bsi.p2.aulaPoo.prova01;

public class Aplicativo {
    public static void main(String[] args) {
    Carro carro = new Carro(4,120,13,4,"preto","FXZ-4765",50,2000);
    Motocicleta motocicleta = new Motocicleta(2,100,8,2,"branca","FBC-1234",50,3000);
    Caminhao caminhao = new Caminhao(2,100,6,4,"vermelho","CDA-4565",50,2000);
    Aviao aviao = new Aviao(50,100,50,3000,50,200);
    Balao balao = new Balao(5,5,10,5,5);
    Barco barco = new Barco(50,100,20,"rio",50,3000);
    Navio navio = new Navio(30,20,4,"mar",50,30);
    carro.exibirObjeto();
    carro.capacidadeDePessoasDoTransporte();
    carro.exibirVelocidadeMaxima();
    carro.exibirCarro();
    motocicleta.exibirObjeto();
    motocicleta.exibirVelocidadeMaxima();
    motocicleta.capacidadeDePessoasDoTransporte();
    motocicleta.dadosMoto();
    caminhao.exibirObjeto();
    caminhao.exibirVelocidadeMaxima();
    caminhao.capacidadeDePessoasDoTransporte();
    caminhao.exibirCaminhão();
    aviao.objeto();
    aviao.exibirVelocidadeMaxima();
    aviao.capacidadeDePessoasDoTransporte();
    aviao.exibirDadosAviao();
    balao.objeto();
    balao.capacidadeDePessoasDoTransporte();
    balao.exibirVelocidadeMaxima();
    balao.exibirDadosBalao();
    barco.objeto();
    barco.exibirVelocidadeMaxima();
    barco.capacidadeDePessoasDoTransporte();
    barco.dadosBarco();
    navio.objeto();
    navio.exibirVelocidadeMaxima();
    navio.capacidadeDePessoasDoTransporte();
    navio.dadosNavio();
    }

}
