package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio01;

import java.time.LocalDate;



public class Cliente extends Pessoa {
    private String cpf;
    private String endereco;

    public Cliente(String nome, LocalDate nascimento, String genero, String cpf, String endereco) {
        super(nome, nascimento, genero);
        this.cpf = cpf;
        this.endereco = endereco;
    }



    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String validarCpf() {

        if (cpf == null) {
            return "0";
        } else {
            String cpf = "";

            removCaracter();
            if (verificarTamanhoInva(this.cpf))
                return "000.000.000-00";
            if (verifiDigIguais(this.cpf))
                return "000.000.000-00";
             this.cpf.substring(0, 9);
             this.cpf.concat(calCPF(this.cpf));
             this.cpf.concat(calCPF(this.cpf));

            if (!this.cpf.equals(this.cpf))
                return "000.000.000-00";
        }
        return (this.cpf.substring(0, 3) + "." + this.cpf.substring(3, 6) + "." + this.cpf.substring(6, 9) + "-" + this.cpf.substring(9, 11));
    }

    private void removCaracter() {
        this.cpf = this.cpf.replace("-", "");
        this.cpf = this.cpf.replace(".", "");
    }

    private boolean verificarTamanhoInva(String CPF) {
        if (CPF.length() != 11)
            return true;
        return false;
    }

    private boolean verifiDigIguais(String CPF) {
        char digiprim = '0';
        char[] charCPF = CPF.toCharArray();
        for (char c : charCPF)
            if (c != digiprim)
                return false;
        return true;
    }

    private String calCPF(String CPF) {
        int digiGera = 0;
        int mult = CPF.length() + 1;
        char[] charCPF = CPF.toCharArray();
        for (int i = 0; i < CPF.length(); i++)
            digiGera += (charCPF[i] - 48) * mult--;
        if (digiGera % 11 < 2)
            digiGera = 0;
        else
            digiGera = 11 - digiGera % 11;
        return String.valueOf(digiGera);
    }



    public void exibirDadosDoCliente() {
        System.out.println(""+"\n" +"Nome do Cliente: " + getNome() + "\n" + "Cpf do Cliente: " + validarCpf() + "\n" + "Genero do Cliente: " + getGenero() + "\n" +
                "Data De Nascimento Do Cliente: " + getNascimento() +
                "\n" + "Endereço Do Cliente : " + getEndereco());

    }


}
