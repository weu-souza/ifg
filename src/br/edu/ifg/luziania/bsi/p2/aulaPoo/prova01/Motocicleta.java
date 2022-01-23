package br.edu.ifg.luziania.bsi.p2.aulaPoo.prova01;

public class Motocicleta extends Terrestre{
    private int combustivel;
    private int kmRodadosContador;
    public Motocicleta() {
        super();
    }

    public Motocicleta(int capacidadeDePessoa, int velocidadeMaxima, int autonomia, int numRodas, String cor, String placa, int combustivel, int kmRodadosContador) {
        super(capacidadeDePessoa, velocidadeMaxima, autonomia, numRodas, cor, placa);
        this.combustivel = combustivel;
        this.kmRodadosContador = kmRodadosContador;
    }
    @Override
    public void setNumRodas(int numRodas) {
        if(numRodas==2){
            System.out.println(numRodas);
        }
        else{
            System.out.println("numero de rodas invalido!");
        }
        super.setNumRodas(numRodas);
    }
    @Override
    public int getNumRodas() {
        return super.getNumRodas();
    }
    public void setAutonomia(int autonomia) {
        if(autonomia<40 && autonomia>0){
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
        if(combustivel>9 && combustivel<0){
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
        //coloquei a velocidade maxima permitida em rodovias de pistas simples, ja que os motos variam de um para outro.


        super.setVelocidadeMaxima(velocidadeMaxima);
    }

    @Override
    public int getVelocidadeMaxima() {
        return super.getVelocidadeMaxima();
    }

    public void capacidadeDePessoasDoTransporte(){
        if(getCapacidadeDePessoa()>2 && getCapacidadeDePessoa()<0){
            System.out.println("capacidade de pessoas: "+getCapacidadeDePessoa());
        }
        else{
            System.out.println("capacidade de pessoas excedeu o numero minimo ou maximo de pessoas!");
        }

    }
    public void exibirVelocidadeMaxima(){
        if(getVelocidadeMaxima()>100 && getVelocidadeMaxima()<0){
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
    public void exibirObjeto(){
        System.out.println("\n"+"Esse objeto e uma moto!");
    }
    public void dadosMoto(){
        System.out.println("cor: "+getCor()+"\n"+"combustivel: "+getCombustivel()+"\n"+"km no contador: "+getKmRodadosContador()+"\n"+
                "autonomia: "+getAutonomia()+"\n" +"numero de rodas: "+getNumRodas());
        if(validaPlaca(this.getPlaca())){
            System.out.println("placa: "+getPlaca());

        }
        else{
            System.out.println("placa invalida!");

        }
        if(getCombustivel()<150 && getCombustivel()>0){
            System.out.println("combustivel: "+getCombustivel()+"\n"+"consumo de combustivel: "+CalcularConsumoDeCombustivel()+"\n"+"tempo em km por hora: "+calcularTempoEmKmHora());
        }
        else{
            System.out.println("combustivel Excedeu o limite!");
        }
    }
}
