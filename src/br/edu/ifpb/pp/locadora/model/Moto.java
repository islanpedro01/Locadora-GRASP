package br.edu.ifpb.pp.locadora.model;

public class Moto extends Veiculo {
    private String motor;
    private String placa;
    private boolean sistemaPartida; //True = Elétrico, False = Manual

    public Moto(String id, double valorCompra, String motor, String placa, boolean sistemaPartida) {
        super(id, valorCompra);
        this.motor = motor;
        this.placa = placa;
        this.sistemaPartida = sistemaPartida;
    }

    public boolean getSistemaPartida() {
        return sistemaPartida;
    }

    public String getMotor() {
        return motor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setAutonomia(boolean sistema) {
        this.sistemaPartida = sistema;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public double calcDiaria() {

        double valor = 0;

        if (getSistemaPartida()) {
            valor = 20.00;
        } else {
            valor = 5.00;
        }

        double diaria = (getvalorCompra() * (2 / 100)) + valor;
        return diaria;

    }
}
