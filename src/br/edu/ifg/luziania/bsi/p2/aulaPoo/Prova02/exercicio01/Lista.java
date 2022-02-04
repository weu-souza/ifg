package br.edu.ifg.luziania.bsi.p2.aulaPoo.Prova02.exercicio01;

import java.util.Scanner;

public class Lista {
    public void exibirLista(){
        Scanner scanner = new Scanner(System.in);
        int escolher;
        int valor;
        Circulo circulo = new Circulo(2,5.0);
        Cubo cubo = new Cubo(2,5.0,6.0,3.0);
        Esfera esfera = new Esfera(3,5.0);
        Retangulo retangulo = new Retangulo(5,5.0,6.0);
        Tetraedro tetraedro = new Tetraedro(4,5.0);
        Triangulo triangulo = new Triangulo(3,5.0,6.0);






        System.out.println("escolha um objeto!");
        for (int i = 0; i < 2; i++) {
            System.out.println("1-Bidimensional\n2-Tridimensional");
            escolher = scanner.nextInt();
            if(escolher == 1){


                for (int j = 0; j < 3; j++) {
                    System.out.println("1-Circulo\n2-Retangulo \n3-Triangulo");
                    valor = scanner.nextInt();
                    if (valor == 1){circulo.exibirDados();}
                    else if(valor == 2){retangulo.exibirDados();}
                    else if(valor == 3){triangulo.exibirDados();}
                    else{
                        System.out.println("não encontrado!\n...Saindo");
                        break;
                    }
                }
            }
           else if(escolher == 2){

                for (int j = 0; j < 3; j++) {
                    System.out.println("1-Cubo\n2-Esfera \n3-Tetraedro");
                    valor = scanner.nextInt();
                    if (valor == 1){cubo.exibirDados();}
                    else if(valor == 2){ esfera.exibirDados();}
                    else if(valor == 3){tetraedro.exibirDados();}
                    else{
                        System.out.println("não encontrado!\n...Saindo");
                        break;
                    }
                }
            }
            else {
                System.out.println("objeto não encontrado!\n...Saindo");
                break;
            }
        }


    }
}
