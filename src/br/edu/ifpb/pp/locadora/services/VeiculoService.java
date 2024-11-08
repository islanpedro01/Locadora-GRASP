package br.edu.ifpb.pp.locadora.services;

import br.edu.ifpb.pp.locadora.model.Veiculo;
import br.edu.ifpb.pp.locadora.repository.VeiculoRepositorio;

import java.util.ArrayList;
import java.util.Comparator;

public class VeiculoService {

    private final VeiculoRepositorio repositorio = new VeiculoRepositorio();

    public void cadastrarVeiculo(Veiculo veiculo) throws Exception {
        Veiculo veiculoBuscado = repositorio.findVeiculoById(veiculo.getid());
        if (veiculoBuscado != null) {
            throw new Exception("ID do veículo já cadastrado!");
        }
        repositorio.salvarVeiculo(veiculo);
    }

    public double valorDiaria(String id) throws Exception {
        Veiculo v = repositorio.findVeiculoById(id);
        if (v != null) {
            return v.calcDiaria();
        }
        throw new Exception("ID do veículo não encontrado!");
    }

    public ArrayList<Veiculo> veiculosCadastrados() throws Exception {
        return repositorio.getVeiculos();

    }

    public int totalVeiculosCadastrados() {
        return repositorio.getVeiculos().size();
    }

    public ArrayList<Veiculo> tipoVeiculos(String veiculo) throws RuntimeException {
        ArrayList<Veiculo> veiculosTipoUnico = new ArrayList<Veiculo>();
        try {
            Class<?> classe = Class.forName("br.edu.ifpb.pp.locadora.model."+veiculo);
            for (Veiculo v : repositorio.getVeiculos()) {
                if (classe.isInstance(v)) {
                    veiculosTipoUnico.add(v);
                }
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        veiculosTipoUnico.sort(Comparator.comparing(Veiculo::getid));
        return veiculosTipoUnico;
    }

    public Veiculo diariaMaisCara(){
        return repositorio.getVeiculos().stream().max(Comparator.comparingDouble(Veiculo::calcDiaria)).orElse(null);
        }

}
