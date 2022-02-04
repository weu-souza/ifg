package br.edu.ifg.luziania.bsi.p2.aulaPoo.Prova02.exercicio03;

import java.util.Scanner;

public class Lista {
    public void exibirLista(){
        Scanner scanner = new Scanner(System.in);
        Comissionado comissionado = new Comissionado("",CargoEnum.Programador,5.0,1200.0);
        Horista horista = new Horista("",CargoEnum.Programador,20.0,40.0);
        Assalariado assalariado = new Assalariado("",CargoEnum.Diretor,2000.0);
        System.out.println("digite qual a funcão: ");


        for (int i = 0; i < 3; i++) {
            System.out.println("1-comissionado\n"+"2-horista\n"+"3-Assalariado");
            Integer escolher = scanner.nextInt();

            if(escolher == 1){
                comissionado.dadosFuncionario();
            }
            else if(escolher == 2 ){
                horista.dadosFuncionario();
            }
            else if(escolher == 3){
                assalariado.dadosFuncionario();
            }
            else {
                System.out.println("numero invalido!\n"+"saindo...");
                break;
            }
        }



    }
}
