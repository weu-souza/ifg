package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista05.exercicio04;

public class Campo {
   private boolean vazio;
   private String simbolo;

   public Campo(){
      this.reset();
   }
   public boolean getVazio(){
      return this.vazio;
   }
   public String getSimbolo(){
      return this.simbolo;
   }

   public boolean setSimbolo(String simbolo) {
      if(this.vazio){
         if(simbolo.equals("X")|| simbolo.equals("O")){
            this.simbolo = simbolo;
            this.vazio = false;
            return true;
         }


      }

      return false;
   }
   public void reset(){
      this.vazio = true;
      this.simbolo = " ";
   }

   public String toString(){
      if(this.vazio) return "-";
      else return this.simbolo;
   }
   public boolean simboloIgual(Campo campo){
      if (this.simbolo.equals(campo.getSimbolo()) && this.vazio == false){
         return true;
      }
      else
         return false;

   }

}
