package br.edu.ifpb.pp.locadora.model;

public class Carro extends Veiculo{
    private double autonomia;
    private String motor;
    private String placa;

    public Carro(String id, double valorCompra, double autonomia, String motor, String placa){
        super(id,valorCompra);
        this.autonomia = autonomia;
        this.motor = motor;
        this.placa = placa;
    }

    public double getAutonomia(){
        return autonomia;
    }

    public String getMotor(){
        return motor;
    }

    public String getPlaca(){
        return placa;
    }

    public void setAutonomia(double autonomia){
        this.autonomia = autonomia;
    }

    public void setMotor(String motor){
        this.motor = motor;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    @Override
    public double calcDiaria(){
        double diaria = getvalorCompra() * (2/100);
        return diaria;

    }
    
}
