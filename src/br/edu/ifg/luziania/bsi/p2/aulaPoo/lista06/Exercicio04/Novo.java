package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio04;

public class Novo extends Imovel{
   private double adicional;

    public Novo() {

    }

    public Novo(double adicional) {
        this.adicional = adicional;
    }

    public Novo(String endereco, Double preco, double adicional) {
        super(endereco, preco);
        this.adicional = adicional;
    }



    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
    public Double PrecoAdicional(){
        return getPreco()+getAdicional();
    }


    public void dadosNovo() {
        System.out.println("Novo");
        if(getPreco()>0){System.out.println(""+"\n"+"adicional: "+getAdicional()+" R$"+"\n"+"preço Final: "+PrecoAdicional()+"\n");}
        else{
            System.out.println("valor invalido!");
        }

    }
}
