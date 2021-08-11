/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.util.List;
public interface Interface {
    
    List<Multa> apresentarMotorista();
    boolean cadastrarMotorista(Motorista m);
    Motorista verificarCpf(String cpf);
    Motorista pegarDados(String cpf);
    
    boolean cadastrarCarro(Carro c);
    boolean cadastrarMoto(Moto m);
    boolean cadastrarCaminhao(Caminhao cm);
    
    Veiculo verificarPlaca(String placa);
    
    
    boolean cadastrarMulta(Multa m);
    Multa consultarCpf(String cpf);
    Multa apresentarArrayMulta(String cpf);
    Multa valorTotalDasMultas();
    
    Multa calcularMultas(String cpf);
}
