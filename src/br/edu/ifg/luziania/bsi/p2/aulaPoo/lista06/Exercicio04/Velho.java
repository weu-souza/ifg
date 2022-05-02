package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio04;

public class Velho extends Imovel {
    private double desconto;

    public Velho(String endereco, Double preco, double desconto) {
        super(endereco, preco);
        setDesconto(desconto);
    }



    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
    if (super.getPreco()==0){
        this.desconto = 0;
    }
    else
    {this.desconto = desconto;}

    }
    public Double desconto(){

        return getPreco()-getDesconto();

    }


    public void dadosVelho() {
        System.out.println("Velho");
        System.out.println(""+"\n"+"desconto: "+this.desconto+"R$"+"\n"+"preço Final: "+desconto());

    }
}
