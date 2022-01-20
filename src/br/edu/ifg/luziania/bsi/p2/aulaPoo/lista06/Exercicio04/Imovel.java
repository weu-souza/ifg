package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio04;

public class Imovel {
    private String endereco;
    private Double preco;

    public Imovel() {

    }

    public Imovel(String endereco, Double preco) {
        this.endereco = endereco;
        this.preco = preco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }


    public void dadosImovel() {
        System.out.println("Dados do imovel"+"\n"+"endereço: "+getEndereco());
        if(getPreco()>0){
            System.out.println("preço: "+getPreco()+" R$"+"\n");
        }
        else{
            System.out.println("valor invalido!");
        }

    }
}
