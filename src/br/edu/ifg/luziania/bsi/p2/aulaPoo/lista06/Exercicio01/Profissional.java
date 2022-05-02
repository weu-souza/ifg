package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio01;

import java.time.LocalDate;

public class Profissional extends Pessoa {
    private Integer rg;
    private String cargo;


    public Profissional(String nome, LocalDate nascimento, String genero, Integer rg, String cargo) {
        super(nome, nascimento, genero);
        this.rg = rg;
        this.cargo = cargo;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void exibisDadosProfissionais() {
        System.out.println(""+"\n" +"Nome Do Profissional: " + getNome() + "\n" + "Rg Do Profissional: " + getRg() + "\n" + "Genero Do Profissional: " + getGenero() + "\n"
                + "Data De Nascimento Do Profissional: " + getNascimento() + "\n" + "Cargo Do Profissional: " + getCargo());


    }


}
