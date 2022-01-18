package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio04;

public class Aplicativo {
    public static void main(String[] args) {
        Imovel i = new Imovel("rua 528 loja 21...", 510.0);
        Novo n = new Novo(i.getEndereco(), i.getPreco(), 200);
        Velho v = new Velho(i.getEndereco(), i.getPreco(), 120.0);
        i.dadosImovel();
        n.dadosNovo();
        v.dadosVelho();

    }
}
