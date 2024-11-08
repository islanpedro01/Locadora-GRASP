package br.edu.ifpb.pp.locadora;

import br.edu.ifpb.pp.locadora.model.*;
import br.edu.ifpb.pp.locadora.services.VeiculoService;

public class main {


    public static void main(String[] args) {
        try {
            VeiculoService veiculoService = new VeiculoService();

            Aviao aviao01 = new Aviao("AVIAO01", 2000, 1.5, 500);
            veiculoService.cadastrarVeiculo(aviao01);

            Aviao aviao02 = new Aviao("AVIAO02", 1500, 1.5, 500);
            veiculoService.cadastrarVeiculo(aviao02);

            Carro carro01 = new Carro("CARRO01", 150, 10, "1.6 TURBO", "MNX6338");
            veiculoService.cadastrarVeiculo(carro01);
            Carro carro02 = new Carro("CARRO02", 200, 15, "1.6 TURBO", "ZXX6558");
            veiculoService.cadastrarVeiculo(carro02);

            Helicoptero helicoptero01 = new Helicoptero("HELI01", 3000, 2.5, 5);
            veiculoService.cadastrarVeiculo(helicoptero01);
            Helicoptero helicoptero02 = new Helicoptero("HELI02", 3500, 2.0, 5);
            veiculoService.cadastrarVeiculo(helicoptero02);

            Moto moto01 = new Moto("MOTO01", 80, "50 CIL", "XXX002", true);
            veiculoService.cadastrarVeiculo(moto01);
            Moto moto02 = new Moto("MOTO02", 100, "150 CIL", "YYY012", true);
            veiculoService.cadastrarVeiculo(moto02);

            Onibus onibus01 = new Onibus("ONIBUS01", 1000, 80, "EURO 3", "MMM0101");
            veiculoService.cadastrarVeiculo(onibus01);
            Onibus onibus02 = new Onibus("ONIBUS02", 1200, 100, "EURO 6", "ZZZ105");
            veiculoService.cadastrarVeiculo(onibus02);



            System.out.println("Veículos cadastrados: " + veiculoService.veiculosCadastrados()+ "\n");

            System.out.println("Quantidade de Veículos cadastrados: " + veiculoService.totalVeiculosCadastrados()+ "\n");

            System.out.println("Veículos do tipo AVIÃO: " + veiculoService.tipoVeiculos("Aviao")+ "\n");

            System.out.println("Veículos do tipo CARRO: " + veiculoService.tipoVeiculos("Carro")+ "\n");

            System.out.println("Veículos do tipo HELICOPTERO: " + veiculoService.tipoVeiculos("Helicoptero") + "\n");

            System.out.println("Veículos do tipo MOTO: " + veiculoService.tipoVeiculos("Moto")+ "\n");

            System.out.println("Veículos do tipo ÔNIBUS: " + veiculoService.tipoVeiculos("Onibus")+ "\n");

            System.out.println("Diária mais cara: " + veiculoService.diariaMaisCara());



        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }

}
