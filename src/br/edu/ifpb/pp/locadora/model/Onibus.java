package br.edu.ifpb.pp.locadora.model;

public class Onibus extends Veiculo {

    private int qntPassageiros;
    private String motor;
    private String placa;

    public Onibus(String id, double valorCompra, int qntPassageiros, String motor, String placa) {
        super(id, valorCompra);
        this.qntPassageiros = qntPassageiros;
        this.motor = motor;
        this.placa = placa;
    }

    public int getQntPassageiros() {
        return qntPassageiros;
    }

    public String getMotor() {
        return motor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setQntPassageiros(int qnt) {
        this.qntPassageiros = qnt;

    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public double calcDiaria() {
        double percValorCompra = getvalorCompra() * (4 / 100);
        double diaria = percValorCompra + (100 * getQntPassageiros());
        return diaria;

    }
}
