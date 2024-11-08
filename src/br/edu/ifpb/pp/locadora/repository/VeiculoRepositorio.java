package br.edu.ifpb.pp.locadora.repository;

import br.edu.ifpb.pp.locadora.model.Veiculo;

import java.util.ArrayList;

public class VeiculoRepositorio {
    private final ArrayList<Veiculo> veiculos;

    public VeiculoRepositorio() {
        veiculos = new ArrayList<>();
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void salvarVeiculo (Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public Veiculo findVeiculoById (String id) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getid().equals(id)) {
                return veiculo;
            }
        }
        return null;
    }
}
