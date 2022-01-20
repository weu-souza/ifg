package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio04;

public class Velho extends Imovel {
    private double desconto;

    public Velho() {


    }

    public Velho(double desconto) {
        this.desconto = desconto;
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


    public void dadosVelho() {
        System.out.println("Velho");
        if(getPreco()>0){
            System.out.println(""+"\n"+"desconto: "+getDesconto()+"R$"+"\n"+"preço Final: "+desconto());
        }
        else{
            System.out.println("valor invalido!");
        }

    }
}
