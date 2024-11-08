package br.edu.ifpb.pp.locadora.model;

public class Aviao extends Veiculo{
    
    private double tempoVoo;
    private double veloCruzeiro;


    public Aviao(String id, double valorCompra, double tempoVoo, double veloCruzeiro){
        super(id, valorCompra);
        this.tempoVoo = tempoVoo;
        this.veloCruzeiro = veloCruzeiro;
    }

    public double getTempoVoo(){
        return tempoVoo;
    }

    public double getVeloCruzeiro(){
        return veloCruzeiro;
    }

    public void setTempoVoo(double tempo){
        this.tempoVoo = tempo;
    }

    public void setVeloCruzeiro(double velocidade){
        this.veloCruzeiro = velocidade;
    }


    @Override
    public double calcDiaria(){
        double percValorCompra = getvalorCompra()*(20/100);
        double diaria = percValorCompra + (1000 * getVeloCruzeiro());

        return diaria;
    }     

}
