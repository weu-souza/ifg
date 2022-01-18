package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio01;


import java.time.LocalDate;

public class Aplicativo {
    public static void main(String[] args) {

       Cliente c = new Cliente("Jasmine",LocalDate.of(1996,5,25),"f","51","rua5 casa 12...");
       Profissional p = new Profissional("weuller souza",LocalDate.of(1997,11,27),"m",0,"chefe");
        c.exibirDadosDoCliente();
        p.exibisDadosProfissionais();


    }
}
