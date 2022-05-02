package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio02;

public class Canino extends Animal{

   private String habitat;

   public Canino(double peso, Integer idade, String alimento, double velocidade, String habitat) {
      super(peso, idade, alimento, velocidade);
      this.habitat = habitat;
   }


   public String getHabitat() {
      return habitat;
   }

   public void setHabitat(String habitat) {
      this.habitat = habitat;
   }
}
