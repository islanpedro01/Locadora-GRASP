package br.edu.ifpb.pp.locadora.model;

public abstract class Veiculo{
    private String id;
    private double valorCompra;

    public Veiculo(String id,double valorCompra ){
        this.id = id;
        this.valorCompra = valorCompra;
        
    }

    public double getvalorCompra(){
        return valorCompra;
    }
    public void setvalorCompra(double valor){
        this.valorCompra = valor;
    }
    public String getid(){
        return id;
    }
    public void setid(String id){
        this.id = id;
    }
    public abstract double calcDiaria();

    @Override
    public String toString() {
        return "id = " + id + '\'' +
                ", valorCompra = " + valorCompra;
    }
}
