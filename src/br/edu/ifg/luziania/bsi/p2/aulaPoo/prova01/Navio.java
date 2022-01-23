package br.edu.ifg.luziania.bsi.p2.aulaPoo.prova01;

public class Navio extends Aquatico{
    private int combustivel;
    private int kmRodadosContador;
    public Navio() {
        super();
    }

    public Navio(int capacidadeDePessoa, int velocidadeMaxima, int autonomia, String ambiente, int combustivel, int kmRodadosContador) {
        super(capacidadeDePessoa, velocidadeMaxima, autonomia, ambiente);
        this.combustivel = combustivel;
        this.kmRodadosContador = kmRodadosContador;
    }
    public void setAutonomia(int autonomia) {
        if(autonomia<60 && autonomia>0){
            System.out.println(autonomia);
        }else{
            System.out.println("valor invalido!");
        }
        super.setAutonomia(autonomia);
    }

    @Override
    public int getAutonomia() {
        return super.getAutonomia();
    }

    public int getKmRodadosContador() {
        return kmRodadosContador;
    }

    public void setKmRodadosContador(int kmRodadosContador) {
        this.kmRodadosContador = kmRodadosContador;
    }

    public int getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(int combustivel) {
        if(combustivel>250000 && combustivel<0){
            System.out.println(combustivel);
        }
        else{
            System.out.println("combustivel Excedeu o limite!");
        }
        this.combustivel = combustivel;
    }

    @Override
    public void setCapacidadeDePessoa(int capacidadeDePessoa) {

        super.setCapacidadeDePessoa(capacidadeDePessoa);
    }

    @Override
    public int getCapacidadeDePessoa() {
        return super.getCapacidadeDePessoa();
    }

    @Override
    public void setVelocidadeMaxima(int velocidadeMaxima) {



        super.setVelocidadeMaxima(velocidadeMaxima);
    }

    @Override
    public int getVelocidadeMaxima() {
        return super.getVelocidadeMaxima();
    }

    public void capacidadeDePessoasDoTransporte(){
        if(getCapacidadeDePessoa()>850 && getCapacidadeDePessoa()<0){
            System.out.println("capacidade de pessoas: "+getCapacidadeDePessoa());
        }
        else{
            System.out.println("capacidade de pessoas excedeu o numero minimo ou maximo de pessoas!");
        }

    }
    public void exibirVelocidadeMaxima(){
        if(getVelocidadeMaxima()>107 && getVelocidadeMaxima()<0){
            System.out.println("velocidade maxima: "+getVelocidadeMaxima());
        }
        else{
            System.out.println("a velocidade Exedeu o limite!");
        }

    }
    public int CalcularConsumoDeCombustivel(){
        return getKmRodadosContador()/getCombustivel();
    }
    public int calcularTempoEmKmHora(){
        return getAutonomia()*getCombustivel();
    }
    public void objeto(){
        System.out.println("\n"+"esse objeto e um navio!");
    }
    public void dadosNavio(){
        System.out.println("\n"+"km no contador: "+getKmRodadosContador()+"\n"+
                "autonomia: "+getAutonomia()+"\n"+"ambiente: "+getAmbiente());
        if(getCombustivel()<150 && getCombustivel()>0){
            System.out.println("combustivel: "+getCombustivel()+"\n"+"consumo de combustivel: "+CalcularConsumoDeCombustivel()+"\n"+"tempo em km por hora: "+calcularTempoEmKmHora());
        }
        else{
            System.out.println("combustivel Excedeu o limite!");
        }
    }
}
