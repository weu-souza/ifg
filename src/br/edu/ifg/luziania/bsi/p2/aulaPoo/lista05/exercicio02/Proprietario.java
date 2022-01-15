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
        setNome("weuller");
        setRg("00000");
        setCpf("0");
        setTelefone("00000");
        setRua("8");
        setBairro("bairro das palmeiras");
        setCidade("cidade hipotetica");
        setEstado("distrito Federal");
        setCep("000000");
        setComplemento("indefinido");
        setDataNascimento(LocalDate.parse("1996-05-25"));
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

    public void setCpf(String cpf) {
        if (validarCpf(cpf)) {
            this.cpf = cpf;
        } else {
            this.cpf = "00000000000";
        }


    }

    public String getCpf() {
        return (this.cpf.substring(0, 3) + "." + this.cpf.substring(3, 6) + "." + this.cpf.substring(6, 9) + "-" + this.cpf.substring(9, 11));
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
        int dian = Integer.valueOf(quebraDN[2]);
        int mesn = Integer.valueOf(quebraDN[1]);
        int anon = Integer.valueOf(quebraDN[0]);

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
                meses--;
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

    public boolean validarCpf(String cpf) {
        if (cpf == null) {
            return false;
        } else {
            String cpfGerado = "";
            this.cpf = cpf;
            removerCaracteres();
            if (verificarSeTamanhoInvalido(this.cpf)) return false;
            if (verificarSeDigIguais(this.cpf)) return false;
            cpfGerado = this.cpf.substring(0, 9);
            cpfGerado = cpfGerado.concat(calculoComCpf(cpfGerado));
            cpfGerado = cpfGerado.concat(calculoComCpf(cpfGerado));

            if (!cpfGerado.equals(this.cpf)) return false;
        }
        return true;
    }

    private void removerCaracteres() {
        this.cpf = this.cpf.replace("-", "");
        this.cpf = this.cpf.replace(".", "");
    }

    private boolean verificarSeTamanhoInvalido(String cpf) {
        if (cpf.length() != 11) return true;
        return false;
    }

    private boolean verificarSeDigIguais(String cpf) {
        //char primDig = cpf.charAt(0);
        char primDig = '0';
        char[] charCpf = cpf.toCharArray();
        for (char c : charCpf)
            if (c != primDig) return false;
        return true;
    }

    private String calculoComCpf(String cpf) {
        int digGerado = 0;
        int mult = cpf.length() + 1;
        char[] charCpf = cpf.toCharArray();
        for (int i = 0; i < cpf.length(); i++)
            digGerado += (charCpf[i] - 48) * mult--;
        if (digGerado % 11 < 2) digGerado = 0;
        else digGerado = 11 - digGerado % 11;
        return String.valueOf(digGerado);
    }


    public String dadosProprietarios() {
        return "nome: " + getNome() + "\n" + "cpf: " + getCpf() + "\n" + "rg: " + getRg() + "\n" + "telefone: " + getTelefone() + "\n" + "rua: " + getRua() + "\n" + "bairro: " + getBairro() + "\n" + "cidade: " + getCidade() + "\n" + "estado: " + getEstado() + "\n" + "cep: " + getCep() + "\n" + "complemento: " + getComplemento() + "\n" + "idade: " + Idade();
    }
}






