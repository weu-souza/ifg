package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista05.exercicio05;
import java.time.LocalDate;



public class Datas {
    private int dia;
    private int mes;
    private int ano;
    LocalDate hoje = LocalDate.now();

    public Datas() {

        this.dia =hoje.getDayOfMonth();
        this.mes =hoje.getMonthValue();
        this.ano =hoje.getYear();
    }


    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {


        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {


        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;


    }



    public void data() {
        System.out.println("Data: "+
                " " + getDia() +
                "/" + getMes() +
                "/" + getAno());
    }
    public void avançarDia(int dia){

        System.out.println(hoje.getDayOfMonth()+1);
    }
}
