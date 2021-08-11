/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

/**
 *
 * @author pc
 */
public class Veiculo {
    protected String tipoVeiculo, modeloVeiculo, placaVeiculo;

    public Veiculo(String tipoVeiculo, String modeloVeiculo, String placaVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
        this.modeloVeiculo = modeloVeiculo;
        this.placaVeiculo = placaVeiculo;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "tipoVeiculo=" + tipoVeiculo + ", modeloVeiculo=" + modeloVeiculo + ", placaVeiculo=" + placaVeiculo + '}';
    }
    
    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }
    
    
}
