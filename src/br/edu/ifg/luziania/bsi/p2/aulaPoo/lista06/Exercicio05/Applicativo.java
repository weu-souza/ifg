package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista06.Exercicio05;

import java.time.LocalDate;

public class Applicativo {
    public static void main(String[] args) {
Ingresso i = new Ingresso(LocalDate.of(2021,05,23),"show de sertanejo",50);
Normal n = new Normal(i.getDataEvento(),i.getNomeEvento(),i.getValorIngresso());
Vip v = new Vip();
CamaroteSuperior camarote = new CamaroteSuperior(i.getDataEvento(),i.getNomeEvento(),i.getValorIngresso(), v.getAdicional(),"Pista A",2);
CamaroteInferior camarote1 = new CamaroteInferior(i.getDataEvento(),i.getNomeEvento(),i.getValorIngresso(),camarote.getAdicional(),"Pista B");
i.imprimeDadosDoEvento();
n.ingressoNormal();
i.imprimeValor();
camarote.dadosSuperior();
camarote1.dadosInferior();









    }
}
