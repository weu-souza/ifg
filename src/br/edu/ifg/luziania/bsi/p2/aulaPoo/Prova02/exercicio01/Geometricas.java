package br.edu.ifg.luziania.bsi.p2.aulaPoo.Prova02.exercicio01;

public abstract class Geometricas {
    private Integer numLados;


    public Geometricas(Integer numLados) {
        setNumLados(numLados);
    }

    public Integer getNumLados() {
        return numLados;
    }

    public void setNumLados(Integer numLados) {
        if(numLados==null||numLados<0){
            this.numLados = 0;
        }
        else {
            this.numLados = numLados;
        }

    }
    public abstract void exibirDados();
    public abstract String exibirNumLados();
    public abstract String exibirObjeto();
}
