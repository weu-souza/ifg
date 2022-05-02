package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio04;

public class Imovel {
    private String endereco;
    private Double preco;

    public Imovel(String endereco, Double preco) {
        this.endereco = endereco;
        setPreco(preco);
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
        if (preco<0){
            this.preco = 0.0;
        }
        else {
            this.preco = preco;
        }

    }


    public void dadosImovel() {
        System.out.println("Dados do imovel"+"\n"+"endereço: "+getEndereco());
        System.out.println("preço: "+getPreco()+" R$"+"\n");

    }
}
