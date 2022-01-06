package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista05.exercicio03;


import java.util.Scanner;

public class Carro {
    Scanner scanner = new Scanner(System.in);

    private String modelo;
    private String cor;
    private String ano;
    private String marca;
    private String chassi;
    private String proprietario;
    private int velocidadeMaxima;
    private int velocidadeAtual;
    private int numeroDePortas;
    private String tetoSolar;
    private Integer numeroMarchas;
    private String cambioAutomatico;
    private int volumeDeCombustivel;
    private int autonomia;


    public Carro(int numeroDePortas) {
        setNumeroDePortas(numeroDePortas);
        this.numeroDePortas = numeroDePortas;
    }

    public Carro() {


    }

    public Carro(String modelo, String cor, String ano, String marca, String chassi, String proprietario, int velocidadeMaxima, int velocidadeAtual, int numeroDePortas, String tetoSolar, String cambioAutomatico, int volumeDeCombustivel, int autonomia) {
        setNumeroDePortas(numeroDePortas);
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.marca = marca;
        this.chassi = chassi;
        this.proprietario = proprietario;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = velocidadeAtual;
        this.numeroDePortas = numeroDePortas;
        this.tetoSolar = tetoSolar;
        this.numeroMarchas = numeroMarchas;
        this.cambioAutomatico = cambioAutomatico;
        this.volumeDeCombustivel = volumeDeCombustivel;
        this.autonomia = autonomia;

    }


    public String getModelo() {
        System.out.println();
        modelo = "indefinido";
        return "o modelo é: " + modelo;
    }

    public void setModelo(String modelo) {

        this.modelo = modelo;
    }

    public String getCor() {
        cor = "azul";
        return "a cor é: " + cor;
    }

    public void setCor(String cor) {

        this.cor = cor;
    }

    public String getAno() {
        ano = "2013";
        return "o ano é: " + ano;
    }

    public void setAno(String ano) {

        this.ano = ano;
    }

    public String getChassi() {
        chassi = "00000000000000000";
        return "chassi: " + chassi;
    }

    public void setChassi(String chassi) {

        this.chassi = chassi;
    }

    public String getProprietario() {
        proprietario = "weuller souza";
        return "proprietario: " + proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public int getVelocidadeMaxima() {
        velocidadeMaxima = 120;
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getVelocidadeAtual() {
        velocidadeAtual = 20;

        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getNumeroDePortas() {

        return numeroDePortas;
    }

    public void setNumeroDePortas(int porta) {

        if ((porta == 4) || (porta == 2)) {
            this.numeroDePortas = porta;
        } else {
            System.out.println("numero de portas inexistente!");
        }
    }


    public String getTetoSolar() {
        tetoSolar = "sim";
        return "teto solar: " + tetoSolar;
    }

    public void setTetoSolar(String tetoSolar) {
        this.tetoSolar = tetoSolar;
    }

    public int getNumeroMarchas() {
        return numeroMarchas;
    }

    public void setNumeroMarchas(int numeroMarchas) {

        this.numeroMarchas = numeroMarchas;
    }

    public String getCambioAutomatico() {
        cambioAutomatico = "sim";
        return "cambio automatico: " + cambioAutomatico;
    }

    public void setCambioAutomatico(String cambioAutomatico) {


        this.cambioAutomatico = cambioAutomatico;
    }

    public int getVolumeDeCombustivel() {
        System.out.println("quantidade de gasolina colocada: ");
        volumeDeCombustivel = scanner.nextInt();
        return volumeDeCombustivel;
    }

    public void setVolumeDeCombustivel(int volumeDeCombustivel) {
        this.volumeDeCombustivel = volumeDeCombustivel;
    }

    public int getAutonomia() {

        autonomia = 13;
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }


    public String acelerar() {
        int i;

        for (i = velocidadeAtual; i < this.velocidadeMaxima; i += 1) {
            if (i == 20) {
                System.out.println("acelerar: " + i + "km");

                numeroMarchas = 1;
                System.out.println("marcha: " + numeroMarchas);
            }
            if (i > 20 && i < 40) {
                numeroMarchas = 2;
                System.out.println("marcha: " + numeroMarchas);
                System.out.println("acelerar: " + i + "km");
                numeroMarchas = 2;
            }
            if (i > 40 && i < 60) {
                System.out.println("acelerar: " + i + "km");
                numeroMarchas = 3;
                System.out.println("marcha: " + numeroMarchas);
            }
            if (i > 60 && i < 80) {
                System.out.println("acelerar: " + i + "km");
                numeroMarchas = 4;
                System.out.println("marcha: " + numeroMarchas);
            }
            if (i > 80 && i < 100) {
                System.out.println("acelerar: " + i + "km");
                numeroMarchas = 5;
                System.out.println("marcha: " + numeroMarchas);
            }
            if (i > 100) {
                System.out.println("acelerar: " + i + "km");
                numeroMarchas = 6;
                System.out.println("marcha: " + numeroMarchas);
            }

            System.out.println("acelerar: " + i + "km");
        }
        return ("acelerar: " + i + "km");

    }

    public String freiar() {
        int i;
        for (i = velocidadeMaxima; i > 0; i -= 1) {
            if (i < velocidadeMaxima && i > 100) {
                numeroMarchas = 6;
                System.out.println("marcha: " + numeroMarchas);

                System.out.println("freiar: " + i + "km");


            }

            if (i < 100 && i > 80) {
                System.out.println("freiar: " + i + "km");
                numeroMarchas = 5;
                System.out.println("marcha: " + numeroMarchas);
            }
            if (i < 80 && i > 60) {
                System.out.println("freiar: " + i + "km");
                numeroMarchas = 4;
                System.out.println("marcha: " + numeroMarchas);
            }
            if (i < 60 && i > 40) {
                System.out.println("freiar: " + i + "km");
                numeroMarchas = 3;
                System.out.println("marcha: " + numeroMarchas);
            }
            if (i < 40 && i > 20) {
                System.out.println("freiar: " + i + "km");
                numeroMarchas = 2;
                System.out.println("marcha: " + numeroMarchas);
            }
            if (i < 20 && i > 1) {
                System.out.println("freiar: " + i + "km");
                numeroMarchas = 1;
                System.out.println("marcha: " + numeroMarchas);
            }
            if (i == 0) {
                System.out.println("freiar: " + i + "km");
                numeroMarchas = 0;
                System.out.println("marcha ré: " + numeroMarchas);
            }


        }


        return ("freiar: " + i + "km" + " indo para marcha ré...");
    }


    public int gastogasolinaNoPercurso() {
        return autonomia * volumeDeCombustivel;
    }


}

