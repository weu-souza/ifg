package br.edu.ifg.luziania.bsi.p2.aulaPoo.prova01;

public class Barco extends Aquatico{
    private int combustivel;
    private int kmRodadosContador;
    public Barco() {
        super();
    }

    public Barco(int capacidadeDePessoa, int velocidadeMaxima, int autonomia, String ambiente, int combustivel, int kmRodadosContador) {
        super(capacidadeDePessoa, velocidadeMaxima, autonomia, ambiente);
        this.combustivel = combustivel;
        this.kmRodadosContador = kmRodadosContador;
    }

    @Override
    public void setAmbiente(String ambiente) {
        super.setAmbiente(ambiente);
    }

    @Override
    public String getAmbiente() {
        return super.getAmbiente();
    }

    public void setAutonomia(int autonomia) {

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
        if(getCapacidadeDePessoa()>10 && getCapacidadeDePessoa()<0){
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
        System.out.println("\n"+"esse objeto e um barco!");
    }
    public void dadosBarco(){
        System.out.println("km no contador: "+getKmRodadosContador()+"\n"+ "ambiente: "+getAmbiente());
        if(getAutonomia()<44 && getAutonomia()>0){
            System.out.println("autonomia: "+getAutonomia());
        }else{
            System.out.println("valor invalido!");
        }
        if(getCombustivel()<40 && getCombustivel()>0){
            System.out.println("combustivel: "+getCombustivel()+"\n"+"consumo de combustivel: "+CalcularConsumoDeCombustivel()+"\n"+"tempo em km por hora: "+calcularTempoEmKmHora());
        }
        else{
            System.out.println("combustivel Excedeu o limite!");
        }
    }

}
