package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista05.exercicio03;

import java.util.Scanner;

public class Aplicativo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String marcha;
       String escolher;
        Carro c =new Carro(4);
        Carro carro = new Carro();
        System.out.println("você quer acelerar ou freiar o carro;");
        escolher = scanner.next();

        System.out.println(carro.getModelo() + "\n" + carro.getCor() + "\n" + carro.getAno() + "\n" + carro.getChassi() + "\n" + carro.getProprietario() +
                "\n"+"velocidade Atual: " + carro.getVelocidadeAtual() + "\n"+ "Velocidade Maxima: " + carro.getVelocidadeMaxima() + "\n" + carro.getTetoSolar() +
                "\n" + carro.getCambioAutomatico() +
                "\n"+"gasolina: " + carro.getVolumeDeCombustivel() + "\n"+"autonomia: " + carro.getAutonomia()+"\n" + "numero de portas = " + carro.getNumeroDePortas());
        System.out.println("A quantidade de km rodado é: " + carro.gastogasolinaNoPercurso());

        if(escolher.equals("acelerar")){
            System.out.println(carro.acelerar());
        }
        if(escolher.equals("freiar")){
            System.out.println(carro.freiar());
        }






    }
}
