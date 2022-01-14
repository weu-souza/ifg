package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio04;

public class Velho extends Imovel {
    private double desconto;

    public Velho() {
        setDesconto(120.00);

    }

    public Velho(String endereco, Double preco, double desconto) {
        super(endereco, preco);
        this.desconto = desconto;
    }



    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {

        this.desconto = desconto;
    }
    public Double desconto(){
        return getPreco()-getDesconto();
    }

    @Override
    public String toString() {
        return ""+"\n"+"desconto: "+getDesconto()+"R$"+"\n"+"preço Final: "+desconto();
    }
}
