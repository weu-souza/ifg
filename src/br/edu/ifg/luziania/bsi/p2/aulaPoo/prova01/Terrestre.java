package br.edu.ifg.luziania.bsi.p2.aulaPoo.prova01;

public class Terrestre extends Transporte{
    private int numRodas;
    private String cor;
    private String placa;

    public Terrestre() {
      super();
    }

    public Terrestre(int capacidadeDePessoa, int velocidadeMaxima, int autonomia, int numRodas, String cor, String placa) {
        super(capacidadeDePessoa, velocidadeMaxima, autonomia);
        this.numRodas = numRodas;
        this.cor = cor;
        this.placa = placa;
    }

    public int getNumRodas() {
        return numRodas;
    }

    public void setNumRodas(int numRodas) {
        this.numRodas = numRodas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {

    }

  public boolean validaPlaca(String placa){
        boolean valido = true;
      if(placa.length() != 7){
          valido = false;
      }
      if(!placa.substring(0, 3).matches("[A-Z]*")){
          valido = false;
      }
      if(!placa.substring(3).matches("[0-9]*")){
          return false;
      }
        return valido;
  }

}
