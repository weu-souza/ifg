package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista05.exercicio02;

import java.time.LocalDate;
import java.util.Scanner;

public class Aplicativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome,cpf, rg, telefone, rua, bairro, cidade, estado, cep, complemento;


        System.out.println("digite o nome: ");

        nome = scanner.next();
        System.out.println("digite o cpf: ");
        cpf = scanner.next();
        System.out.println("digite o rg: ");

        rg = scanner.next();
        System.out.println("digite o telefone: ");

        telefone = scanner.next();
        System.out.println("digite o rua: ");

        rua = scanner.next();
        System.out.println("digite o bairro: ");

        bairro = scanner.next();
        System.out.println("digite o cidade: ");

        cidade = scanner.next();
        System.out.println("digite o estado: ");

        estado = scanner.next();
        System.out.println("digite o cep: ");

        cep = scanner.next();
        System.out.println("digite o complemento: ");

        complemento = scanner.next();
        System.out.println("digite a data de nascimento (aaa-mm-dd): ");
        LocalDate idade = LocalDate.parse(scanner.next());
        Proprietario proprietario = new Proprietario(nome,rg,cpf,telefone,rua,bairro,cidade,estado,cep,complemento,idade);
        System.out.println("nome: "+proprietario.getNome()+", cpf: "+proprietario.getCpf()+", rg: "+proprietario.getRg()+
                ", telefone: "+proprietario.getTelefone()+", rua: "+proprietario.getRua()+", bairro: "+proprietario.getBairro()+", cidade: "
                +proprietario.getCidade()+", estado: "+proprietario.getEstado()+", cep: "+proprietario.getCep()+", complemento: "+proprietario.getComplemento()+", idade: "+proprietario.Idade());




    }
}
