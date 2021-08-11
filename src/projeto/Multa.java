/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class Multa {
    protected double multa, pontoCarteira;
    Veiculo veiculo;
    Motorista motorista;
    
    
    public Multa(double multa, double pontoCarteira) {
        this.multa = multa;
        this.pontoCarteira = pontoCarteira;
    }
    
    
    
    public Multa(double multa, double pontoCarteira, Veiculo v, Motorista m) {
        this.multa = multa;
        this.pontoCarteira = pontoCarteira;
        this.veiculo = v;
        this.motorista = m;
    }
    
    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public double getPontoCarteira() {
        return pontoCarteira;
    }

    public void setPontoCarteira(double pontoCarteira) {
        this.pontoCarteira = pontoCarteira;
    }
    
    public String getNomeDoMotorista(){
        return motorista.getNome();
    }
    
    public String getCpfDoMotorista(){
        return motorista.getCpf();
    }
    
    public int getIdadeDoMotorista(){
        return motorista.getIdade();
    }
    
    public String getTipoDoVeiculo(){
        return veiculo.getTipoVeiculo();
    }
    public String getModeloDoVeiculo(){
        return veiculo.getModeloVeiculo();
    }
    public String getPlacaDoVeiculo(){
        return veiculo.getPlacaVeiculo();
    }
    
    public void imprima(){
        JOptionPane.showMessageDialog(null, "Nome: " + getNomeDoMotorista()+
                   "\n CPF: " + getCpfDoMotorista() + 
                   "\n Idade: " + getIdadeDoMotorista() + 
                   "\n Veiculo: " + getTipoDoVeiculo() + 
                   "\n Modelo do Veiculo: " + getModeloDoVeiculo() +
                   "\n Placa do Veiculo: " + getPlacaDoVeiculo() + 
                   "\n Valor da Multa: " + getMulta() +
                   "\n Pontuação a tirar da Carteira: " + getPontoCarteira()
                   );
    }
}




