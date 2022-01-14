package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio01;


import java.time.LocalDate;
import java.util.Scanner;


public class Pessoa {
    Scanner scanner = new Scanner(System.in);
    private String nome;
    private LocalDate nascimento;
    private String genero;

    public Pessoa() {

    }

    public Pessoa(String nome, LocalDate nascimento, String genero) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.genero = genero;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public LocalDate getNascimento() {


      return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {

        this.nascimento = nascimento;


    }



    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
        if (genero.equals("m") || genero.equals("M") || genero.equals("masculino") || genero.equals("Masculino")) {
            this.genero = "Masculino";
        }
        else if(genero.equals("f") || genero.equals("F") || genero.equals("feminino") || genero.equals("Feminino")){
           this.genero = "Feminino";
        }
        else {
            System.out.println("Genero biologico invalido");

        }
    }


}
