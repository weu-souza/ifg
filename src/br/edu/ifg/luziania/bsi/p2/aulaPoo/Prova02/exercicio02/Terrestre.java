package br.edu.ifg.luziania.bsi.p2.aulaPoo.Prova02.exercicio02;

public class Terrestre extends Transporte {
    private Integer numRodas;
    private CorEnum cor;
    private String placa;

    public Terrestre() {
        super();
    }

    public Terrestre(Integer capacidadeDePessoa, Double velocidadeMaxima, Double autonomia, Integer numRodas, CorEnum cor, String placa) {
        super(capacidadeDePessoa, velocidadeMaxima, autonomia);
        setNumRodas(numRodas);
        this.cor = cor;
        setPlaca(placa);
    }

    public Integer getNumRodas() {
        return numRodas;
    }

    public void setNumRodas(Integer numRodas) {
        if(numRodas==null||numRodas<2){
            this.numRodas = 0;
        }
        else{
            this.numRodas = numRodas;
        }

    }

    public CorEnum getCor() {
        return cor;
    }

    public void setCor(CorEnum cor) {
        this.cor = cor;
    }

    public String getPlaca() {

        if(validaPlaca(placa)){
            return this.placa.substring(0,3)+"-"+this.placa.substring(3);
        }
        else{
            return "invalido!";
        }

    }

    public void setPlaca(String placa) {
        if(validaPlaca(placa)){
            this.placa = placa;
        }
        else{
            this.placa = "invalido!";


        }
    }

    public boolean validaPlaca(String placa) {
        boolean valido = true;
        if (placa.length() != 7) {
            valido = false;
        }
        if (!placa.substring(0, 3).matches("[A-Z]*")) {
            valido = false;
        }
        if (!placa.substring(3).matches("[0-9]*")) {
            return false;
        }
        return valido;
    }
    @Override
    public void capacidadeDePessoasDoTransporte() {
        System.out.println("");
    }
    @Override
    public void exibirVelocidadeMaxima() {
        System.out.println("");
    }

    public void exibirObjeto(){
        System.out.println("esse veiculo e terrestre");
    }
    public void dadosTerrestres(){
        System.out.println("os dados não foram definidos");
    }
}
