package br.edu.ifg.luziania.bsi.p2.aulaPoo.lista05.exercicio05.exercicio04;

public class Tabuleiro {

    Campo[][] matriz;

    public Tabuleiro() {

        matriz = new Campo[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = new Campo();
            }
        }


    }
    public boolean setSimbolo(int l, int c, String simbolo){

        if(c<0 || c>2)return false;
        if(l<0 || l>2)return false;
        return  matriz[l][c].setSimbolo(simbolo);

    }
    public String setSimbolo(int l, int c){
        return matriz[l][c].getSimbolo();
    }
    public boolean getVazio(int l, int c){
        return matriz[l][c].getVazio();
    }
    public void reset(){
    for(int l = 0; l < 3; l++){
        for(int c = 0; c < 3; c++){
            matriz[l][c].reset();
        }
    }
    }
    public String toString(){
        String retorno;
    retorno = matriz[0][0].toString() +"|"+ matriz[0][1].toString() +"|"+ matriz[0][2].toString()+"\n";
    retorno += matriz[1][0].toString() +"|"+ matriz[1][1].toString()+"|" + matriz[1][2].toString()+"\n";
    retorno += matriz[2][0].toString()+"|" + matriz[2][1].toString()+"|" + matriz[2][2].toString();
    return retorno;
    }
    public String Ganhador(){
    for(int i =0; i <3; i++){
        if(matriz[i][0].simboloIgual(matriz[i][1]) &&
                matriz[i][0].simboloIgual(matriz[i][2])){
            return matriz[i][0].getSimbolo();
        }
    }
        for(int i =0; i <3; i++){
            if(matriz[0][i].simboloIgual(matriz[1][i]) &&
                    matriz[0][i].simboloIgual(matriz[2][i])){
                return matriz[0][i].getSimbolo();
            }
        }
        if(matriz[0][0].simboloIgual(matriz[1][1]) &&
                matriz[0][0].simboloIgual(matriz[2][2])){
            return matriz[0][0].getSimbolo();
        }
        if(matriz[0][2].simboloIgual(matriz[1][1]) &&
                matriz[0][2].simboloIgual(matriz[2][0])){
            return matriz[0][2].getSimbolo();
        }
        if(this.HaEspacosVazios()){
            return"ainda há casas disponiveis";
        }
        else{
        return "Empate";}

    }
    public boolean HaEspacosVazios(){
        for (int i =0; i<3; i++){
            for (int j =0; j<3; j++){
                if(matriz[i][j].getVazio()){
                    return true;
                }
            }

        }
        return false;
    }
}
