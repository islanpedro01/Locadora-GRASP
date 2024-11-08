package br.edu.ifpb.pp.locadora.model;

public class Helicoptero extends Veiculo{

    private double tempoVoo;
    private int qntRotores;


    public Helicoptero(String id, double valorCompra, double tempoVoo, int qntRotores){
        super(id, valorCompra);
        this.tempoVoo = tempoVoo;
        this.qntRotores = qntRotores;
    }

    public double getTempoVoo(){
        return tempoVoo;
    }

    public int getQntRotores(){
        return qntRotores;
    }

    public void setTempoVoo(double tempo){
        this.tempoVoo = tempo;
    }

    public void setQntRotores(int quant){
        this.qntRotores = quant;
    }


    @Override
    public double calcDiaria(){
        double percValorCompra = getvalorCompra()*(10/100);
        double diaria = percValorCompra * getQntRotores();

        return diaria;
    }     

    
}
