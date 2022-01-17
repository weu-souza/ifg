package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista05.exercicio04;

import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tabuleiro tabuleiro = new Tabuleiro();
        int jogadorAtual = 0;
        String[] simbolos = {"O", "X"};
        int l, c;
        while (tabuleiro.Ganhador().equals("ainda há casas disponiveis")) {
            System.out.println("--jogador atual: "+simbolos[jogadorAtual]+"--");
            System.out.print("digite a linha a ser jogada: ");
            l = scanner.nextInt();
            System.out.print("digite a coluna a ser jogada: ");
            c = scanner.nextInt();

            if (!tabuleiro.setSimbolo( l, c,simbolos[jogadorAtual])){
                System.out.println("jogada invalida!");
                continue;
            }

            tabuleiro.setSimbolo(l, c, simbolos[jogadorAtual]);

            System.out.println(tabuleiro);

            if (jogadorAtual == 0) {
                jogadorAtual = 1;
            } else {
                jogadorAtual = 0;
            }
        }


        System.out.println("ganhador: " + tabuleiro.Ganhador());

    }

}
