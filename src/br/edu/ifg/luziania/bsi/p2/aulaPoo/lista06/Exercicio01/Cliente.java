package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio01;

import java.time.LocalDate;

public class Cliente extends Pessoa {
    private String cpf;
    private String endereco;

    public Cliente() {
        setEndereco("rua5 casa 12...");
        setCpf("00000000000");
        setNome("jasmine");
        setGenero("f");
        setNascimento(LocalDate.parse("1996-12-05"));

    }


    public Cliente(String cpf, String endereco) {
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public Cliente(String nome, LocalDate nascimento, String genero, String cpf, String endereco) {
        super(nome, nascimento, genero);
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getCpf() {
        return (this.cpf.substring(0, 3) + "." + this.cpf.substring(3, 6) + "." +
                this.cpf.substring(6, 9) + "-" + this.cpf.substring(9, 11));
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
        if (validarCpf(cpf)) {
            this.cpf = cpf;
        } else {
            this.cpf = "00000000000";
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean validarCpf(String cpf) {
        if (cpf == null) {
            return false;
        } else {
            String cpfGerado = "";
            this.cpf = cpf;
            removerCaracteres();
            if (verificarSeTamanhoInvalido(this.cpf))
                return false;
            if (verificarSeDigIguais(this.cpf))
                return false;
            cpfGerado = this.cpf.substring(0, 9);
            cpfGerado = cpfGerado.concat(calculoComCpf(cpfGerado));
            cpfGerado = cpfGerado.concat(calculoComCpf(cpfGerado));

            if (!cpfGerado.equals(this.cpf))
                return false;
        }
        return true;
    }

    private void removerCaracteres() {
        this.cpf = this.cpf.replace("-", "");
        this.cpf = this.cpf.replace(".", "");
    }

    private boolean verificarSeTamanhoInvalido(String cpf) {
        if (cpf.length() != 11)
            return true;
        return false;
    }

    private boolean verificarSeDigIguais(String cpf) {
        //char primDig = cpf.charAt(0);
        char primDig = '0';
        char[] charCpf = cpf.toCharArray();
        for (char c : charCpf)
            if (c != primDig)
                return false;
        return true;
    }

    private String calculoComCpf(String cpf) {
        int digGerado = 0;
        int mult = cpf.length() + 1;
        char[] charCpf = cpf.toCharArray();
        for (int i = 0; i < cpf.length(); i++)
            digGerado += (charCpf[i] - 48) * mult--;
        if (digGerado % 11 < 2)
            digGerado = 0;
        else
            digGerado = 11 - digGerado % 11;
        return String.valueOf(digGerado);
    }

    public String exibirDadosDoCliente() {
        return ""+"\n" +"Nome do Cliente: " + getNome() + "\n" + "Cpf do Cliente: " + getCpf() + "\n" + "Genero do Cliente: " + getGenero() + "\n" +
                "Data De Nascimento Do Cliente: " + getNascimento() +
                "\n" + "Endereço Do Cliente : " + getEndereco();

    }


}
