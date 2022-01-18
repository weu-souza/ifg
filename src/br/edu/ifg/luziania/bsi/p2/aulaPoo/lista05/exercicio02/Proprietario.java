package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista05.exercicio02;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

public class Proprietario {


    private String nome;
    private String rg;
    private String cpf;
    private String telefone;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String complemento;
    private LocalDate dataNascimento;

    public Proprietario() {

    }

    public Proprietario(String nome, String rg, String cpf, String telefone, String rua, String bairro, String cidade, String estado, String cep, String complemento, LocalDate dataNascimento) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.telefone = telefone;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.complemento = complemento;
        this.dataNascimento = dataNascimento;


    }


    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getRg() {

        return rg;
    }

    public void setRg(String rg) {

        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {

        this.telefone = telefone;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {

        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {

        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {

        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {

        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {

        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {

        this.complemento = complemento;
    }

    public LocalDate getDataNascimento() {
        return LocalDate.parse(Idade());
    }

    public void setDataNascimento(LocalDate dataNascimento) {

        this.dataNascimento = dataNascimento;
    }

    public String Idade() {
        Calendar calHoje = GregorianCalendar.getInstance();
        int diah = calHoje.get(Calendar.DAY_OF_MONTH);
        int mesh = calHoje.get(Calendar.MONTH) + 1;
        int anoh = calHoje.get(Calendar.YEAR);

        // Data do nascimento.
        String[] quebraDN = this.dataNascimento.toString().split("-");
        int dian = Integer.parseInt(quebraDN[2]);
        int mesn = Integer.parseInt(quebraDN[1]);
        int anon = Integer.parseInt(quebraDN[0]);

        String strNiver = anoh + "-" + mesn + "-" + dian;
        Calendar calNiver = Calendar.getInstance();
        try {
            calNiver.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(strNiver));
        } catch (ParseException ex) {
            Logger.getLogger(FormataData.class.getName()).log(Level.SEVERE, null, ex);
        }


        int anos = (calHoje.getTimeInMillis() < calNiver.getTimeInMillis()) ? (anoh - anon - 1) : anoh - anon;
        int meses;
        int dias;

        meses = mesh - mesn;
        if (meses > 0) {
            if (diah < dian) {
                meses--;
            }
        } else if (meses < 0) {
            meses = 12 + meses;

            if (diah < dian) {
                meses-=meses;
            }
        } else {
            if (diah < dian) {
                meses = 11;
            }
        }

        dias = diah - dian;
        if (dias < 0) {
            if (mesh == 5 || mesh == 7 || mesh == 8 || mesh == 10 || mesh == 12) {
                dias = 30 - dian + diah;
            } else if (mesh == 1 || mesh == 2 || mesh == 4 || mesh == 6 || mesh == 9 || mesh == 11) {
                dias = 31 - dian + diah;
            } else {
                if (anoh % 4 == 0) {
                    dias = 29 - dian + diah;
                } else {
                    dias = 28 - dian + diah;
                }
            }
        }


        return String.valueOf(anos);
    }

    private class FormataData {
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


    public void dadosProprietarios() {
        System.out.println("nome: " + getNome() + "\n" + "cpf: " + validarCpf() + "\n" + "rg: " + getRg() + "\n" + "telefone: " + getTelefone() + "\n" + "rua: "
                + getRua() + "\n" + "bairro: " + getBairro() + "\n" + "cidade: " + getCidade() + "\n" + "estado: " + getEstado() + "\n" + "cep: " + getCep() + "\n" + "complemento: "
                + getComplemento() + "\n" + "idade: " + Idade());
    }
}






