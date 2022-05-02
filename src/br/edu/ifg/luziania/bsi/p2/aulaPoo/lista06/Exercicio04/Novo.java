package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio04;

public class Novo extends Imovel{
   private double adicional;



    public Novo(String endereco, Double preco, double adicional) {
        super(endereco, preco);
        setAdicional(adicional);
    }



    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        if (super.getPreco()==0){
            this.adicional=0;
        }
        else{
            this.adicional = adicional;
        }

    }
    public Double PrecoAdicional(){
        return getPreco()+getAdicional();
    }


    public void dadosNovo() {
        System.out.println("Novo");
        System.out.println(""+"\n"+"adicional: "+getAdicional()+" R$"+"\n"+"preço Final: "+PrecoAdicional()+"\n");

    }
}
