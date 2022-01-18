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
        System.out.println("endereço: "+getEndereco()+"\n"+"preço: "+getPreco()+" R$");
    }
}
