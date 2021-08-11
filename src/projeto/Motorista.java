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
public class Motorista{
    protected String nome, cpf;
    protected int idade;

    public Motorista() {
    }

    public Motorista(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void print() {
        JOptionPane.showMessageDialog(null, 
                "Nome: " + nome 
              + "\nCPF: " + cpf 
              + "\nIdade: " + idade
              );
    }
}
