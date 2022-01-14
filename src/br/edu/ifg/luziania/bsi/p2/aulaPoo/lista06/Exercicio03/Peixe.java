package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio03;

import br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio02.Animal;

public class Peixe extends Animal {
    private String caracteristica;

    public Peixe() {
        setAlimento("ração para peixe");
        setIdade(2);
        setCaracteristica("escamas,olhos,boca...");
        setPeso(1);
        setVelocidade(2.1);
    }

    public Peixe(double peso, Integer idade, String alimento, double velocidade, String caracteristica) {
        super(peso, idade, alimento, velocidade);
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
    public String dadosDoPeixe(){
        return ""+"\n"+"caracteristica do peixe: "+getCaracteristica()+"\n"+"Alimento do peixe: "+getAlimento()+"\n"+"Idade do peixe: "+getIdade()+" anos"+"\n"+
                "peso do peixe: "+getPeso()+" kg"+"\n"+"Velocidade do peixe: "+getVelocidade()+" km";

    }
}
